package com.facebook.internal.instrument.crashreport;

/* compiled from: CrashHandler.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/instrument/crashreport/CrashHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "previousHandler", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "uncaughtException", "", "t", "Ljava/lang/Thread;", "e", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CrashHandler implements java.lang.Thread.UncaughtExceptionHandler {
    private static final int MAX_CRASH_REPORT_NUM = 5;
    private static com.facebook.internal.instrument.crashreport.CrashHandler instance;
    private final java.lang.Thread.UncaughtExceptionHandler previousHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.instrument.crashreport.CrashHandler.Companion INSTANCE = new com.facebook.internal.instrument.crashreport.CrashHandler.Companion(null);
    private static final java.lang.String TAG = com.facebook.internal.instrument.crashreport.CrashHandler.class.getCanonicalName();

    public /* synthetic */ CrashHandler(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized void enable() {
        synchronized (com.facebook.internal.instrument.crashreport.CrashHandler.class) {
            INSTANCE.enable();
        }
    }

    private CrashHandler(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.previousHandler = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "t");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "e");
        com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
        if (com.facebook.internal.instrument.InstrumentUtility.isSDKRelatedException(e)) {
            com.facebook.internal.instrument.ExceptionAnalyzer exceptionAnalyzer = com.facebook.internal.instrument.ExceptionAnalyzer.INSTANCE;
            com.facebook.internal.instrument.ExceptionAnalyzer.execute(e);
            com.facebook.internal.instrument.InstrumentData.Builder builder = com.facebook.internal.instrument.InstrumentData.Builder.INSTANCE;
            com.facebook.internal.instrument.InstrumentData.Builder.build(e, com.facebook.internal.instrument.InstrumentData.Type.CrashReport).save();
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(t, e);
    }

    /* compiled from: CrashHandler.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/internal/instrument/crashreport/CrashHandler$Companion;", "", "()V", "MAX_CRASH_REPORT_NUM", "", "TAG", "", "kotlin.jvm.PlatformType", com.ironsource.C3232q2.p, "Lcom/facebook/internal/instrument/crashreport/CrashHandler;", com.ironsource.mediationsdk.metadata.a.j, "", "sendExceptionReports", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final synchronized void enable() {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
                sendExceptionReports();
            }
            if (com.facebook.internal.instrument.crashreport.CrashHandler.instance != null) {
                android.util.Log.w(com.facebook.internal.instrument.crashreport.CrashHandler.TAG, "Already enabled!");
            } else {
                com.facebook.internal.instrument.crashreport.CrashHandler.instance = new com.facebook.internal.instrument.crashreport.CrashHandler(java.lang.Thread.getDefaultUncaughtExceptionHandler(), null);
                java.lang.Thread.setDefaultUncaughtExceptionHandler(com.facebook.internal.instrument.crashreport.CrashHandler.instance);
            }
        }

        private final void sendExceptionReports() {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (com.facebook.internal.Utility.isDataProcessingRestricted()) {
                return;
            }
            com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
            java.io.File[] listExceptionReportFiles = com.facebook.internal.instrument.InstrumentUtility.listExceptionReportFiles();
            java.util.ArrayList arrayList = new java.util.ArrayList(listExceptionReportFiles.length);
            for (java.io.File file : listExceptionReportFiles) {
                com.facebook.internal.instrument.InstrumentData.Builder builder = com.facebook.internal.instrument.InstrumentData.Builder.INSTANCE;
                arrayList.add(com.facebook.internal.instrument.InstrumentData.Builder.load(file));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((com.facebook.internal.instrument.InstrumentData) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            final java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList2, new java.util.Comparator() { // from class: com.facebook.internal.instrument.crashreport.CrashHandler$Companion$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                    int m5218sendExceptionReports$lambda2;
                    m5218sendExceptionReports$lambda2 = com.facebook.internal.instrument.crashreport.CrashHandler.Companion.m5218sendExceptionReports$lambda2((com.facebook.internal.instrument.InstrumentData) obj2, (com.facebook.internal.instrument.InstrumentData) obj3);
                    return m5218sendExceptionReports$lambda2;
                }
            });
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator<java.lang.Integer> it = kotlin.ranges.RangesKt.until(0, java.lang.Math.min(sortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(sortedWith.get(((kotlin.collections.IntIterator) it).nextInt()));
            }
            com.facebook.internal.instrument.InstrumentUtility instrumentUtility2 = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
            com.facebook.internal.instrument.InstrumentUtility.sendReports("crash_reports", jSONArray, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.internal.instrument.crashreport.CrashHandler$Companion$$ExternalSyntheticLambda1
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                    com.facebook.internal.instrument.crashreport.CrashHandler.Companion.m5219sendExceptionReports$lambda5(sortedWith, graphResponse);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: sendExceptionReports$lambda-2, reason: not valid java name */
        public static final int m5218sendExceptionReports$lambda2(com.facebook.internal.instrument.InstrumentData instrumentData, com.facebook.internal.instrument.InstrumentData o2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(o2, "o2");
            return instrumentData.compareTo(o2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: sendExceptionReports$lambda-5, reason: not valid java name */
        public static final void m5219sendExceptionReports$lambda5(java.util.List validReports, com.facebook.GraphResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validReports, "$validReports");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.getError() == null) {
                    org.json.JSONObject jsonObject = response.getJsonObject();
                    if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (jsonObject == null ? null : java.lang.Boolean.valueOf(jsonObject.getBoolean("success"))), (java.lang.Object) true)) {
                        java.util.Iterator it = validReports.iterator();
                        while (it.hasNext()) {
                            ((com.facebook.internal.instrument.InstrumentData) it.next()).clear();
                        }
                    }
                }
            } catch (org.json.JSONException unused) {
            }
        }
    }
}
