package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.hg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411hg implements com.android.installreferrer.api.InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.C0436ig f6054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.appmetrica.analytics.impl.InterfaceC0695sg f6055b;

    public C0411hg(io.appmetrica.analytics.impl.C0436ig c0436ig, io.appmetrica.analytics.impl.InterfaceC0695sg interfaceC0695sg) {
        this.f6054a = c0436ig;
        this.f6055b = interfaceC0695sg;
    }

    public static final void a(io.appmetrica.analytics.impl.C0436ig c0436ig, io.appmetrica.analytics.impl.InterfaceC0695sg interfaceC0695sg) {
        com.android.installreferrer.api.InstallReferrerClient installReferrerClient;
        try {
            try {
                com.android.installreferrer.api.ReferrerDetails installReferrer = c0436ig.f6100b.getInstallReferrer();
                interfaceC0695sg.a(new io.appmetrica.analytics.impl.C0566ng(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), io.appmetrica.analytics.impl.EnumC0540mg.f6429c));
                installReferrerClient = c0436ig.f6100b;
            } catch (java.lang.Throwable th) {
                try {
                    interfaceC0695sg.a(th);
                    installReferrerClient = c0436ig.f6100b;
                } catch (java.lang.Throwable th2) {
                    try {
                        c0436ig.f6100b.endConnection();
                    } catch (java.lang.Throwable unused) {
                    }
                    throw th2;
                }
            }
            installReferrerClient.endConnection();
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i2) {
        if (i2 != 0) {
            this.f6054a.a(this.f6055b, new java.lang.IllegalStateException(B1.a.f(i2, "Referrer check failed with error ")));
            return;
        }
        io.appmetrica.analytics.impl.C0436ig c0436ig = this.f6054a;
        c0436ig.f6099a.execute(new F0.c(7, c0436ig, this.f6055b));
    }
}
