package com.facebook.internal.instrument.anrreport;

/* compiled from: ANRDetector.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/instrument/anrreport/ANRDetector;", "", "()V", "DETECTION_INTERVAL_IN_MS", "", "anrDetectorRunnable", "Ljava/lang/Runnable;", "myUid", "previousStackTrace", "", "scheduledExecutorService", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "checkProcessError", "", "am", "Landroid/app/ActivityManager;", "start", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ANRDetector {
    private static final int DETECTION_INTERVAL_IN_MS = 500;
    public static final com.facebook.internal.instrument.anrreport.ANRDetector INSTANCE = new com.facebook.internal.instrument.anrreport.ANRDetector();
    private static final int myUid = android.os.Process.myUid();
    private static final java.util.concurrent.ScheduledExecutorService scheduledExecutorService = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
    private static java.lang.String previousStackTrace = "";
    private static final java.lang.Runnable anrDetectorRunnable = new java.lang.Runnable() { // from class: com.facebook.internal.instrument.anrreport.ANRDetector$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            com.facebook.internal.instrument.anrreport.ANRDetector.m5214anrDetectorRunnable$lambda0();
        }
    };

    private ANRDetector() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: anrDetectorRunnable$lambda-0, reason: not valid java name */
    public static final void m5214anrDetectorRunnable$lambda0() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.instrument.anrreport.ANRDetector.class)) {
            return;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            java.lang.Object systemService = com.facebook.FacebookSdk.getApplicationContext().getSystemService("activity");
            if (systemService == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            checkProcessError((android.app.ActivityManager) systemService);
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.instrument.anrreport.ANRDetector.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void checkProcessError(android.app.ActivityManager am) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.instrument.anrreport.ANRDetector.class) || am == null) {
            return;
        }
        try {
            java.util.List<android.app.ActivityManager.ProcessErrorStateInfo> processesInErrorState = am.getProcessesInErrorState();
            if (processesInErrorState == null) {
                return;
            }
            for (android.app.ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == myUid) {
                    java.lang.Thread thread = android.os.Looper.getMainLooper().getThread();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                    com.facebook.internal.instrument.InstrumentUtility instrumentUtility = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
                    java.lang.String stackTrace = com.facebook.internal.instrument.InstrumentUtility.getStackTrace(thread);
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(stackTrace, previousStackTrace)) {
                        com.facebook.internal.instrument.InstrumentUtility instrumentUtility2 = com.facebook.internal.instrument.InstrumentUtility.INSTANCE;
                        if (com.facebook.internal.instrument.InstrumentUtility.isSDKRelatedThread(thread)) {
                            previousStackTrace = stackTrace;
                            com.facebook.internal.instrument.InstrumentData.Builder builder = com.facebook.internal.instrument.InstrumentData.Builder.INSTANCE;
                            com.facebook.internal.instrument.InstrumentData.Builder.build(processErrorStateInfo.shortMsg, stackTrace).save();
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.instrument.anrreport.ANRDetector.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void start() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.internal.instrument.anrreport.ANRDetector.class)) {
            return;
        }
        try {
            scheduledExecutorService.scheduleWithFixedDelay(anrDetectorRunnable, 0L, 500, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.internal.instrument.anrreport.ANRDetector.class);
        }
    }
}
