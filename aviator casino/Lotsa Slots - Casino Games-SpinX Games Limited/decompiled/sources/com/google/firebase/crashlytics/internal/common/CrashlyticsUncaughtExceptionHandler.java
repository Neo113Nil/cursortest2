package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
class CrashlyticsUncaughtExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {
    private final com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener crashListener;
    private final java.lang.Thread.UncaughtExceptionHandler defaultHandler;
    private final java.util.concurrent.atomic.AtomicBoolean isHandlingException = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent nativeComponent;
    private final com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider;

    interface CrashListener {
        void onUncaughtException(com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider, java.lang.Thread thread, java.lang.Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener crashListener, com.google.firebase.crashlytics.internal.settings.SettingsProvider settingsProvider, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.crashListener = crashListener;
        this.settingsProvider = settingsProvider;
        this.defaultHandler = uncaughtExceptionHandler;
        this.nativeComponent = crashlyticsNativeComponent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
    
        r7.isHandlingException.set(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
        r7.defaultHandler.uncaughtException(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r7.defaultHandler == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r7.defaultHandler != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing, but no default exception handler.");
        java.lang.System.exit(1);
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        this.isHandlingException.set(true);
        try {
            try {
                if (shouldRecordUncaughtException(thread, th)) {
                    this.crashListener.onUncaughtException(this.settingsProvider, thread, th);
                } else {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (java.lang.Exception e) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().e("An error occurred in the uncaught exception handler", e);
            }
        } catch (java.lang.Throwable th2) {
            if (this.defaultHandler != null) {
                com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing. Invoking default exception handler.");
                this.defaultHandler.uncaughtException(thread, th);
            } else {
                com.google.firebase.crashlytics.internal.Logger.getLogger().d("Completed exception processing, but no default exception handler.");
                java.lang.System.exit(1);
            }
            this.isHandlingException.set(false);
            throw th2;
        }
    }

    boolean isHandlingException() {
        return this.isHandlingException.get();
    }

    private boolean shouldRecordUncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        if (thread == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.nativeComponent.hasCrashDataForCurrentSession()) {
            return true;
        }
        com.google.firebase.crashlytics.internal.Logger.getLogger().d("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }
}
