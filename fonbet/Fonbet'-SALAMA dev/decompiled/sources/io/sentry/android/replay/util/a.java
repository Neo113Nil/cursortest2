package io.sentry.android.replay.util;

import io.sentry.SentryOptions;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f14441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SentryOptions f14442c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14443d;

    public /* synthetic */ a(Runnable runnable, SentryOptions sentryOptions, String str, int i7) {
        this.f14440a = i7;
        this.f14441b = runnable;
        this.f14442c = sentryOptions;
        this.f14443d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14440a) {
            case 0:
                ExecutorsKt.scheduleAtFixedRateSafely$lambda$3(this.f14441b, this.f14442c, this.f14443d);
                break;
            case 1:
                ExecutorsKt.submitSafely$lambda$2(this.f14441b, this.f14442c, this.f14443d);
                break;
            default:
                ExecutorsKt.submitSafely$lambda$1(this.f14441b, this.f14442c, this.f14443d);
                break;
        }
    }
}
