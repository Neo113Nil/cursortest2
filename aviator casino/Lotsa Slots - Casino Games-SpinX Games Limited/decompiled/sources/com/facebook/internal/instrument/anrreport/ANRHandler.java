package com.facebook.internal.instrument.anrreport;

/* compiled from: ANRHandler.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/internal/instrument/anrreport/ANRHandler;", "", "()V", "MAX_ANR_REPORT_NUM", "", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", com.ironsource.mediationsdk.metadata.a.j, "", "sendANRReports", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ANRHandler {
    private static final int MAX_ANR_REPORT_NUM = 5;
    public static final com.facebook.internal.instrument.anrreport.ANRHandler INSTANCE = new com.facebook.internal.instrument.anrreport.ANRHandler();
    private static final java.util.concurrent.atomic.AtomicBoolean enabled = new java.util.concurrent.atomic.AtomicBoolean(false);

    private ANRHandler() {
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized void enable() {
        synchronized (com.facebook.internal.instrument.anrreport.ANRHandler.class) {
            if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.instrument.anrreport.ANRHandler.class)) {
                return;
            }
            try {
                if (enabled.getAndSet(true)) {
                    return;
                }
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                if (com.facebook.FacebookSdk.getAutoLogAppEventsEnabled()) {
                    sendANRReports();
                }
                com.facebook.internal.instrument.anrreport.ANRDetector aNRDetector = com.facebook.internal.instrument.anrreport.ANRDetector.INSTANCE;
                com.facebook.internal.instrument.anrreport.ANRDetector.start();
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.instrument.anrreport.ANRHandler.class);
            }
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void sendANRReports() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.instrument.anrreport.ANRHandler.class)) {
            return;
        }
        try {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (com.facebook.internal.Utility.isDataProcessingRestricted()) {
                return;
            }
            com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
            java.io.File[] listAnrReportFiles = com.facebook.internal.instrument.InstrumentUtility.listAnrReportFiles();
            java.util.ArrayList arrayList = new java.util.ArrayList(listAnrReportFiles.length);
            for (java.io.File file : listAnrReportFiles) {
                com.facebook.internal.instrument.InstrumentData.Builder builder = com.facebook.internal.instrument.InstrumentData.Builder.INSTANCE;
                arrayList.add(com.facebook.internal.instrument.InstrumentData.Builder.load(file));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (((com.facebook.internal.instrument.InstrumentData) obj).isValid()) {
                    arrayList2.add(obj);
                }
            }
            final java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(arrayList2, new java.util.Comparator() { // from class: com.facebook.internal.instrument.anrreport.ANRHandler$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                    int m5215sendANRReports$lambda2;
                    m5215sendANRReports$lambda2 = com.facebook.internal.instrument.anrreport.ANRHandler.m5215sendANRReports$lambda2((com.facebook.internal.instrument.InstrumentData) obj2, (com.facebook.internal.instrument.InstrumentData) obj3);
                    return m5215sendANRReports$lambda2;
                }
            });
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator<java.lang.Integer> it = kotlin.ranges.RangesKt.until(0, java.lang.Math.min(sortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(sortedWith.get(((kotlin.collections.IntIterator) it).nextInt()));
            }
            com.facebook.internal.instrument.InstrumentUtility instrumentUtility2 = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
            com.facebook.internal.instrument.InstrumentUtility.sendReports("anr_reports", jSONArray, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.internal.instrument.anrreport.ANRHandler$$ExternalSyntheticLambda1
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                    com.facebook.internal.instrument.anrreport.ANRHandler.m5216sendANRReports$lambda5(sortedWith, graphResponse);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.instrument.anrreport.ANRHandler.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendANRReports$lambda-2, reason: not valid java name */
    public static final int m5215sendANRReports$lambda2(com.facebook.internal.instrument.InstrumentData instrumentData, com.facebook.internal.instrument.InstrumentData o2) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.instrument.anrreport.ANRHandler.class)) {
            return 0;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(o2, "o2");
            return instrumentData.compareTo(o2);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.instrument.anrreport.ANRHandler.class);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendANRReports$lambda-5, reason: not valid java name */
    public static final void m5216sendANRReports$lambda5(java.util.List validReports, com.facebook.GraphResponse response) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.instrument.anrreport.ANRHandler.class)) {
            return;
        }
        try {
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
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.instrument.anrreport.ANRHandler.class);
        }
    }
}
