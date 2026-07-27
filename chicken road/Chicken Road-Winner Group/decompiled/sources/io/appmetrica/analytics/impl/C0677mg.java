package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;

/* renamed from: io.appmetrica.analytics.impl.mg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677mg implements InstallReferrerStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0703ng f7863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0962xg f7864b;

    public C0677mg(C0703ng c0703ng, InterfaceC0962xg interfaceC0962xg) {
        this.f7863a = c0703ng;
        this.f7864b = interfaceC0962xg;
    }

    public static final void a(C0703ng c0703ng, InterfaceC0962xg interfaceC0962xg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c0703ng.f7937b.getInstallReferrer();
                interfaceC0962xg.a(new C0832sg(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC0806rg.f8230c));
                installReferrerClient = c0703ng.f7937b;
            } catch (Throwable unused) {
                return;
            }
        } catch (Throwable th) {
            try {
                interfaceC0962xg.a(th);
                installReferrerClient = c0703ng.f7937b;
            } finally {
            }
        }
        installReferrerClient.endConnection();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i3) {
        if (i3 != 0) {
            this.f7863a.a(this.f7864b, new IllegalStateException(B0.c.h(i3, "Referrer check failed with error ")));
            return;
        }
        C0703ng c0703ng = this.f7863a;
        c0703ng.f7936a.execute(new D1.a(c0703ng, 16, this.f7864b));
    }
}
