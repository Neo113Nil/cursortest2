package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1731w9 implements Jw, InterfaceC1161jf {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0677Re f16096k;

    public /* synthetic */ C1731w9(InterfaceC0677Re interfaceC0677Re) {
        this.f16096k = interfaceC0677Re;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1161jf, com.google.android.gms.internal.ads.Jo, com.google.android.gms.internal.ads.InterfaceC1452q
    /* renamed from: a */
    public void mo10a() {
        this.f16096k.X();
    }

    @Override // com.google.android.gms.internal.ads.Jw
    /* renamed from: o */
    public /* bridge */ /* synthetic */ void mo14o(Object obj) {
        String str = (String) obj;
        InterfaceC0677Re interfaceC0677Re = this.f16096k;
        new T2.y(interfaceC0677Re.getContext(), interfaceC0677Re.m().f5852k, str, interfaceC0677Re.v() != null ? interfaceC0677Re.v().f10534x0 : null).l();
    }

    @Override // com.google.android.gms.internal.ads.Jw
    public void u(Throwable th) {
        P2.o.f4767B.f4774g.i("DefaultGmsgHandlers.attributionReportingManager", th);
    }
}
