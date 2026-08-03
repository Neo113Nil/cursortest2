package com.helpshift.log;

/* loaded from: classes2.dex */
public class WebviewConsoleLogger {
    private WebviewConsoleLogger() {
    }

    public static void log(android.webkit.ConsoleMessage.MessageLevel messageLevel, java.lang.String str, java.lang.String str2) {
        if (messageLevel == null) {
            com.helpshift.log.HSLogger.d(str, str2);
            return;
        }
        int i = com.helpshift.log.WebviewConsoleLogger.AnonymousClass1.$SwitchMap$android$webkit$ConsoleMessage$MessageLevel[messageLevel.ordinal()];
        if (i == 1) {
            com.helpshift.log.HSLogger.e(str, str2);
        } else if (i == 2) {
            com.helpshift.log.HSLogger.w(str, str2);
        } else {
            com.helpshift.log.HSLogger.d(str, str2);
        }
    }

    /* renamed from: com.helpshift.log.WebviewConsoleLogger$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$webkit$ConsoleMessage$MessageLevel;

        static {
            int[] iArr = new int[android.webkit.ConsoleMessage.MessageLevel.values().length];
            $SwitchMap$android$webkit$ConsoleMessage$MessageLevel = iArr;
            try {
                iArr[android.webkit.ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[android.webkit.ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[android.webkit.ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[android.webkit.ConsoleMessage.MessageLevel.LOG.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$webkit$ConsoleMessage$MessageLevel[android.webkit.ConsoleMessage.MessageLevel.TIP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }
}
