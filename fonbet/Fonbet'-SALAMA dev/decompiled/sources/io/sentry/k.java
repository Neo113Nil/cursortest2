package io.sentry;

import java.io.File;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14489b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f14488a = i7;
        this.f14489b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14488a) {
            case 0:
                Sentry.lambda$initConfigurations$5((File) this.f14489b);
                break;
            default:
                ((ShutdownHookIntegration) this.f14489b).lambda$close$2();
                break;
        }
    }
}
