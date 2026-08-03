package com.helpshift.exception;

/* loaded from: classes.dex */
public class HSUncaughtExceptionHandler {
    private static final java.lang.String TAG = "UncghtExptnHndlr";

    private HSUncaughtExceptionHandler() {
    }

    public static void init() {
        final java.lang.Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: com.helpshift.exception.HSUncaughtExceptionHandler$$ExternalSyntheticLambda0
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
                com.helpshift.exception.HSUncaughtExceptionHandler.lambda$init$0(defaultUncaughtExceptionHandler, thread, th);
            }
        });
    }

    static /* synthetic */ void lambda$init$0(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, java.lang.Thread thread, java.lang.Throwable th) {
        if (isCausedByHelpshift(th)) {
            com.helpshift.log.HSLogger.e(TAG, "UNCAUGHT EXCEPTION ", th);
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    static boolean isCausedByHelpshift(java.lang.Throwable th) {
        if (th == null) {
            return false;
        }
        try {
            return android.util.Log.getStackTraceString(th).contains(com.helpshift.Helpshift.class.getPackage().getName());
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error determining crash from Helpshift", e);
            return false;
        }
    }
}
