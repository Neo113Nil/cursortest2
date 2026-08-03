package com.fyber.inneractive.sdk.logger;

/* loaded from: classes3.dex */
public final class a extends com.fyber.inneractive.sdk.logger.FMPLogger {
    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void debug(java.lang.String str, java.lang.Object... objArr) {
        if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 3) {
            android.util.Log.d("Inneractive_debug", java.lang.String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void error(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr) {
        if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 6) {
            if (th == null) {
                android.util.Log.e("Inneractive_error", java.lang.String.format(str, objArr));
            } else {
                android.util.Log.e("Inneractive_error", java.lang.String.format(str, objArr), th);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void info(java.lang.String str, java.lang.Object... objArr) {
        if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 4) {
            android.util.Log.i("Inneractive_info", java.lang.String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void initialize(android.content.Context context) {
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void log(int i, java.lang.Exception exc, java.lang.String str, java.lang.Object... objArr) {
        if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= i) {
            if (exc == null) {
                android.util.Log.v("Inneractive_general", java.lang.String.format(str, objArr));
            } else {
                android.util.Log.v("Inneractive_general", java.lang.String.format(str, objArr), exc);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void verbose(java.lang.String str, java.lang.Object... objArr) {
        if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 2) {
            android.util.Log.v("Inneractive_verbose", java.lang.String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void warning(java.lang.String str, java.lang.Object... objArr) {
        if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 4) {
            android.util.Log.w("Inneractive_warning", java.lang.String.format(str, objArr));
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void verbose(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr) {
        if (com.fyber.inneractive.sdk.util.IAlog.f4283a <= 2) {
            android.util.Log.v("Inneractive_verbose", java.lang.String.format(str, objArr), th);
        }
    }
}
