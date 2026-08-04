package io.sentry.android.core.internal.util;

import io.sentry.android.ndk.SentryNdk;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14389a;

    public /* synthetic */ a(int i7) {
        this.f14389a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14389a) {
            case 0:
                AndroidThreadChecker.lambda$new$0();
                break;
            default:
                SentryNdk.lambda$static$0();
                break;
        }
    }
}
