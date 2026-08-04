package io.sentry.android.replay.util;

import io.sentry.SentryOptions;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f14447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SentryOptions f14448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14449d;

    public /* synthetic */ a(Runnable runnable, SentryOptions sentryOptions, String str, int i7) {
        this.f14446a = i7;
        this.f14447b = runnable;
        this.f14448c = sentryOptions;
        this.f14449d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14446a) {
            case 0:
                ExecutorsKt.scheduleAtFixedRateSafely$lambda$3(this.f14447b, this.f14448c, this.f14449d);
                break;
            case 1:
                ExecutorsKt.submitSafely$lambda$2(this.f14447b, this.f14448c, this.f14449d);
                break;
            default:
                ExecutorsKt.submitSafely$lambda$1(this.f14447b, this.f14448c, this.f14449d);
                break;
        }
    }
}
