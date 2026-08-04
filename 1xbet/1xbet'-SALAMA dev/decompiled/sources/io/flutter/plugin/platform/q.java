package io.flutter.plugin.platform;

import android.app.ForegroundServiceStartNotAllowedException;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class q {
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException b(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static /* bridge */ /* synthetic */ boolean q(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
