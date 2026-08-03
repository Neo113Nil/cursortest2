package com.facebook.internal.instrument.errorreport;

/* compiled from: ErrorReportHandler.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/instrument/errorreport/ErrorReportHandler;", "", "()V", "MAX_ERROR_REPORT_NUM", "", com.ironsource.mediationsdk.metadata.a.j, "", "listErrorReportFiles", "", "Ljava/io/File;", "()[Ljava/io/File;", "save", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "", "sendErrorReports", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorReportHandler {
    public static final com.facebook.internal.instrument.errorreport.ErrorReportHandler INSTANCE = new com.facebook.internal.instrument.errorreport.ErrorReportHandler();
    private static final int MAX_ERROR_REPORT_NUM = 1000;

    private ErrorReportHandler() {
    }

    @kotlin.jvm.JvmStatic
    public static final void save(java.lang.String msg) {
        try {
            new com.facebook.internal.instrument.errorreport.ErrorReportData(msg).save();
        } catch (java.lang.Exception unused) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            sendErrorReports();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void sendErrorReports() {
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isDataProcessingRestricted()) {
            return;
        }
        java.io.File[] listErrorReportFiles = listErrorReportFiles();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = listErrorReportFiles.length;
        int i = 0;
        while (i < length) {
            java.io.File file = listErrorReportFiles[i];
            i++;
            com.facebook.internal.instrument.errorreport.ErrorReportData errorReportData = new com.facebook.internal.instrument.errorreport.ErrorReportData(file);
            if (errorReportData.isValid()) {
                arrayList.add(errorReportData);
            }
        }
        kotlin.collections.CollectionsKt.sortWith(arrayList, new java.util.Comparator() { // from class: com.facebook.internal.instrument.errorreport.ErrorReportHandler$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                int m5221sendErrorReports$lambda0;
                m5221sendErrorReports$lambda0 = com.facebook.internal.instrument.errorreport.ErrorReportHandler.m5221sendErrorReports$lambda0((com.facebook.internal.instrument.errorreport.ErrorReportData) obj, (com.facebook.internal.instrument.errorreport.ErrorReportData) obj2);
                return m5221sendErrorReports$lambda0;
            }
        });
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i2 = 0; i2 < arrayList.size() && i2 < 1000; i2++) {
            jSONArray.put(arrayList.get(i2));
        }
        com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
        com.facebook.internal.instrument.InstrumentUtility.sendReports("error_reports", jSONArray, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.internal.instrument.errorreport.ErrorReportHandler$$ExternalSyntheticLambda2
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                com.facebook.internal.instrument.errorreport.ErrorReportHandler.m5222sendErrorReports$lambda2(arrayList, graphResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendErrorReports$lambda-0, reason: not valid java name */
    public static final int m5221sendErrorReports$lambda0(com.facebook.internal.instrument.errorreport.ErrorReportData errorReportData, com.facebook.internal.instrument.errorreport.ErrorReportData o2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(o2, "o2");
        return errorReportData.compareTo(o2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendErrorReports$lambda-2, reason: not valid java name */
    public static final void m5222sendErrorReports$lambda2(java.util.ArrayList validReports, com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validReports, "$validReports");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.getError() == null) {
                org.json.JSONObject jsonObject = response.getJsonObject();
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (jsonObject == null ? null : java.lang.Boolean.valueOf(jsonObject.getBoolean("success"))), (java.lang.Object) true)) {
                    java.util.Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((com.facebook.internal.instrument.errorreport.ErrorReportData) it.next()).clear();
                    }
                }
            }
        } catch (org.json.JSONException unused) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File[] listErrorReportFiles() {
        com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
        java.io.File instrumentReportDir = com.facebook.internal.instrument.InstrumentUtility.getInstrumentReportDir();
        if (instrumentReportDir == null) {
            return new java.io.File[0];
        }
        java.io.File[] listFiles = instrumentReportDir.listFiles(new java.io.FilenameFilter() { // from class: com.facebook.internal.instrument.errorreport.ErrorReportHandler$$ExternalSyntheticLambda0
            @Override // java.io.FilenameFilter
            public final boolean accept(java.io.File file, java.lang.String str) {
                boolean m5220listErrorReportFiles$lambda3;
                m5220listErrorReportFiles$lambda3 = com.facebook.internal.instrument.errorreport.ErrorReportHandler.m5220listErrorReportFiles$lambda3(file, str);
                return m5220listErrorReportFiles$lambda3;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: listErrorReportFiles$lambda-3, reason: not valid java name */
    public static final boolean m5220listErrorReportFiles$lambda3(java.io.File file, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("^%s[0-9]+.json$", java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.internal.instrument.InstrumentUtility.ERROR_REPORT_PREFIX}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new kotlin.text.Regex(format).matches(name);
    }
}
