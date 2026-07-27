package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.ServiceInfo;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.j6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738j6 extends Ug {

    /* renamed from: f, reason: collision with root package name */
    public final Context f8515f;

    /* renamed from: g, reason: collision with root package name */
    public final Ah f8516g;

    /* renamed from: h, reason: collision with root package name */
    public final C1126y6 f8517h;

    /* renamed from: i, reason: collision with root package name */
    public final U1 f8518i;

    /* renamed from: j, reason: collision with root package name */
    public final C1023u6 f8519j;

    public C0738j6(Context context, C0888p0 c0888p0, InterfaceC0599dl interfaceC0599dl, Ah ah) {
        super(c0888p0, interfaceC0599dl, ah);
        this.f8515f = context;
        this.f8516g = ah;
        this.f8517h = C0736j4.l().i();
        this.f8518i = C0736j4.l().f();
        this.f8519j = new C1023u6(context);
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final synchronized void a() {
        try {
            if (this.f6639c) {
                return;
            }
            this.f6639c = true;
            String a6 = this.f8517h.f9591a.a();
            U1 u12 = this.f8518i;
            Context context = this.f8515f;
            u12.getClass();
            ServiceInfo serviceInfo = PackageManagerUtils.getServiceInfo(context, AppMetricaService.class);
            if (kotlin.jvm.internal.i.a(a6, serviceInfo != null ? serviceInfo.processName : null)) {
                this.f8519j.a(this.f8516g);
            } else {
                this.f6637a.c();
                this.f6639c = false;
                super.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Ch
    public final boolean c() {
        this.f8519j.a(this.f8516g);
        return false;
    }

    @Override // io.appmetrica.analytics.impl.Ch, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        a();
        return f4.v.f5689a;
    }
}
