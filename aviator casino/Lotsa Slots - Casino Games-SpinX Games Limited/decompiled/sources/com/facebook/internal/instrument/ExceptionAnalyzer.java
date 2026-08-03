package com.facebook.internal.instrument;

/* compiled from: ExceptionAnalyzer.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\r\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/instrument/ExceptionAnalyzer;", "", "()V", "enabled", "", com.ironsource.mediationsdk.metadata.a.j, "", "execute", "e", "", "isDebug", "isDebug$facebook_core_release", "sendExceptionAnalysisReports", "sendExceptionAnalysisReports$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ExceptionAnalyzer {
    public static final com.facebook.internal.instrument.ExceptionAnalyzer INSTANCE = new com.facebook.internal.instrument.ExceptionAnalyzer();
    private static boolean enabled;

    @kotlin.jvm.JvmStatic
    public static final boolean isDebug$facebook_core_release() {
        return false;
    }

    private ExceptionAnalyzer() {
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        com.facebook.internal.instrument.ExceptionAnalyzer exceptionAnalyzer = INSTANCE;
        enabled = true;
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            exceptionAnalyzer.sendExceptionAnalysisReports$facebook_core_release();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void execute(java.lang.Throwable e) {
        if (!enabled || isDebug$facebook_core_release() || e == null) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.StackTraceElement[] stackTrace = e.getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
            java.lang.String className = stackTraceElement.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "it.className");
            com.facebook.internal.FeatureManager.Feature feature = com.facebook.internal.FeatureManager.getFeature(className);
            if (feature != com.facebook.internal.FeatureManager.Feature.Unknown) {
                com.facebook.internal.FeatureManager featureManager2 = com.facebook.internal.FeatureManager.INSTANCE;
                com.facebook.internal.FeatureManager.disableFeature(feature);
                hashSet.add(feature.toString());
            }
        }
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
            java.util.HashSet hashSet2 = hashSet;
            if (!hashSet2.isEmpty()) {
                com.facebook.internal.instrument.InstrumentData.Builder builder = com.facebook.internal.instrument.InstrumentData.Builder.INSTANCE;
                com.facebook.internal.instrument.InstrumentData.Builder.build(new org.json.JSONArray((java.util.Collection) hashSet2)).save();
            }
        }
    }

    public final void sendExceptionAnalysisReports$facebook_core_release() {
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isDataProcessingRestricted()) {
            return;
        }
        com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
        java.io.File[] listExceptionAnalysisReportFiles = com.facebook.internal.instrument.InstrumentUtility.listExceptionAnalysisReportFiles();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = listExceptionAnalysisReportFiles.length;
        int i = 0;
        while (i < length) {
            java.io.File file = listExceptionAnalysisReportFiles[i];
            i++;
            com.facebook.internal.instrument.InstrumentData.Builder builder = com.facebook.internal.instrument.InstrumentData.Builder.INSTANCE;
            final com.facebook.internal.instrument.InstrumentData load = com.facebook.internal.instrument.InstrumentData.Builder.load(file);
            if (load.isValid()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("crash_shield", load.toString());
                    com.facebook.GraphRequest.Companion companion = com.facebook.GraphRequest.INSTANCE;
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                    java.lang.String format = java.lang.String.format("%s/instruments", java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.FacebookSdk.getApplicationId()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    arrayList.add(companion.newPostRequest(null, format, jSONObject, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.internal.instrument.ExceptionAnalyzer$$ExternalSyntheticLambda0
                        @Override // com.facebook.GraphRequest.Callback
                        public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                            com.facebook.internal.instrument.ExceptionAnalyzer.m5206sendExceptionAnalysisReports$lambda1(com.facebook.internal.instrument.InstrumentData.this, graphResponse);
                        }
                    }));
                } catch (org.json.JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new com.facebook.GraphRequestBatch(arrayList).executeAsync();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendExceptionAnalysisReports$lambda-1, reason: not valid java name */
    public static final void m5206sendExceptionAnalysisReports$lambda1(com.facebook.internal.instrument.InstrumentData instrumentData, com.facebook.GraphResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.getError() == null) {
                org.json.JSONObject jsonObject = response.getJsonObject();
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (jsonObject == null ? null : java.lang.Boolean.valueOf(jsonObject.getBoolean("success"))), (java.lang.Object) true)) {
                    instrumentData.clear();
                }
            }
        } catch (org.json.JSONException unused) {
        }
    }
}
