package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14495b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f14494a = i7;
        this.f14495b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14494a) {
            case 0:
                Sentry.lambda$initConfigurations$5((File) this.f14495b);
                break;
            default:
                ((ShutdownHookIntegration) this.f14495b).lambda$close$2();
                break;
        }
    }
}
