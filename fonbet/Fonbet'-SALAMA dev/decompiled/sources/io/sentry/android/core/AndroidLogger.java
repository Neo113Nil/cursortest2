package io.sentry.android.core;

import android.util.Log;
import io.sentry.ILogger;
import io.sentry.SentryLevel;

/* loaded from: classes2.dex */
public final class AndroidLogger implements ILogger {
    private final String tag;

    /* renamed from: io.sentry.android.core.AndroidLogger$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$SentryLevel;

        static {
            int[] iArr = new int[SentryLevel.values().length];
            $SwitchMap$io$sentry$SentryLevel = iArr;
            try {
                iArr[SentryLevel.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$sentry$SentryLevel[SentryLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AndroidLogger() {
        this("Sentry");
    }

    private int toLogcatLevel(SentryLevel sentryLevel) {
        int i7 = AnonymousClass1.$SwitchMap$io$sentry$SentryLevel[sentryLevel.ordinal()];
        if (i7 == 1) {
            return 4;
        }
        if (i7 != 2) {
            return i7 != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override // io.sentry.ILogger
    public boolean isEnabled(SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            Log.println(toLogcatLevel(sentryLevel), this.tag, str);
        } else {
            Log.println(toLogcatLevel(sentryLevel), this.tag, String.format(str, objArr));
        }
    }

    public AndroidLogger(String str) {
        this.tag = str;
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, Throwable th, String str, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            log(sentryLevel, String.format(str, objArr), th);
        } else {
            log(sentryLevel, str, th);
        }
    }

    @Override // io.sentry.ILogger
    public void log(SentryLevel sentryLevel, String str, Throwable th) {
        int i7 = AnonymousClass1.$SwitchMap$io$sentry$SentryLevel[sentryLevel.ordinal()];
        if (i7 == 1) {
            Log.i(this.tag, str, th);
            return;
        }
        if (i7 == 2) {
            Log.w(this.tag, str, th);
            return;
        }
        if (i7 == 3) {
            Log.e(this.tag, str, th);
        } else if (i7 != 4) {
            Log.d(this.tag, str, th);
        } else {
            Log.wtf(this.tag, str, th);
        }
    }
}
