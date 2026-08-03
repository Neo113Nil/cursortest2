package com.helpshift.log;

/* loaded from: classes2.dex */
public class PreInstallLogger implements com.helpshift.log.ILogger {
    private static final java.lang.String TAG = "Helpshift_PreInstall";
    private final boolean isApplicationInDebugMode;

    public PreInstallLogger(boolean z) {
        this.isApplicationInDebugMode = z;
    }

    @Override // com.helpshift.log.ILogger
    public void d(java.lang.String str, java.lang.String str2) {
        d(str, str2, null);
    }

    @Override // com.helpshift.log.ILogger
    public void w(java.lang.String str, java.lang.String str2) {
        w(str, str2, null);
    }

    @Override // com.helpshift.log.ILogger
    public void e(java.lang.String str, java.lang.String str2) {
        e(str, str2, null);
    }

    @Override // com.helpshift.log.ILogger
    public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        logMessage(com.helpshift.log.ILogger.LEVEL.DEBUG, str, str2, th);
    }

    @Override // com.helpshift.log.ILogger
    public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        logMessage(com.helpshift.log.ILogger.LEVEL.WARN, str, str2, th);
    }

    @Override // com.helpshift.log.ILogger
    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        logMessage(com.helpshift.log.ILogger.LEVEL.ERROR, str, str2, th);
    }

    @Override // com.helpshift.log.ILogger
    public java.lang.String getStackTrace(java.lang.Throwable th) {
        if (th == null) {
            return "";
        }
        return th.getMessage() + " \n " + android.util.Log.getStackTraceString(th);
    }

    private void logMessage(com.helpshift.log.ILogger.LEVEL level, java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        java.lang.String str3 = str + " : " + str2;
        int i = com.helpshift.log.PreInstallLogger.AnonymousClass1.$SwitchMap$com$helpshift$log$ILogger$LEVEL[level.ordinal()];
        if (i == 1) {
            android.util.Log.e(TAG, str3, th);
            return;
        }
        if (i == 2) {
            android.util.Log.w(TAG, str3, th);
        } else if (i == 3 && this.isApplicationInDebugMode) {
            android.util.Log.d(TAG, str3, th);
        }
    }

    /* renamed from: com.helpshift.log.PreInstallLogger$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$helpshift$log$ILogger$LEVEL;

        static {
            int[] iArr = new int[com.helpshift.log.ILogger.LEVEL.values().length];
            $SwitchMap$com$helpshift$log$ILogger$LEVEL = iArr;
            try {
                iArr[com.helpshift.log.ILogger.LEVEL.ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$helpshift$log$ILogger$LEVEL[com.helpshift.log.ILogger.LEVEL.WARN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$helpshift$log$ILogger$LEVEL[com.helpshift.log.ILogger.LEVEL.DEBUG.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}
