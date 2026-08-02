package io.sentry.android.core.internal.util;

import io.sentry.android.ndk.SentryNdk;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14383a;

    public /* synthetic */ a(int i7) {
        this.f14383a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14383a) {
            case 0:
                AndroidThreadChecker.lambda$new$0();
                break;
            default:
                SentryNdk.lambda$static$0();
                break;
        }
    }
}
