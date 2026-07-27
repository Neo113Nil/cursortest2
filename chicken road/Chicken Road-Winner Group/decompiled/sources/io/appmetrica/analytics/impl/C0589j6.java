package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import d2.C0279i;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589j6 extends Ug {
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final Ah f7601g;

    /* renamed from: h, reason: collision with root package name */
    public final C0977y6 f7602h;

    /* renamed from: i, reason: collision with root package name */
    public final U1 f7603i;

    /* renamed from: j, reason: collision with root package name */
    public final C0874u6 f7604j;

    public C0589j6(Context context, C0739p0 c0739p0, InterfaceC0450dl interfaceC0450dl, Ah ah) {
        super(c0739p0, interfaceC0450dl, ah);
        this.f = context;
        this.f7601g = ah;
        this.f7602h = C0587j4.l().i();
        this.f7603i = C0587j4.l().f();
        this.f7604j = new C0874u6(context);
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final synchronized void a() {
        try {
            if (this.f5804c) {
                return;
            }
            this.f5804c = true;
            String a3 = this.f7602h.f8632a.a();
            U1 u1 = this.f7603i;
            Context context = this.f;
            u1.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (kotlin.jvm.internal.j.a(a3, serviceInfo != null ? serviceInfo.processName : null)) {
                this.f7604j.a(this.f7601g);
            } else {
                this.f5802a.c();
                this.f5804c = false;
                super.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final boolean c() {
        this.f7604j.a(this.f7601g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Ch, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return C0279i.f4852a;
    }
}
