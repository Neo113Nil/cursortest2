package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: com.google.android.gms.internal.ads.fm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0990fm implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1428pc f13496b;

    public /* synthetic */ C0990fm(C1428pc c1428pc, int i) {
        this.f13495a = i;
        this.f13496b = c1428pc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        InputStream inputStream = (InputStream) obj;
        switch (this.f13495a) {
            case 0:
                return AbstractC1400ot.c0(new C1842ym(inputStream, this.f13496b));
            case 1:
                return AbstractC1400ot.c0(new C1842ym(inputStream, this.f13496b));
            default:
                String str = new String(Sv.a(inputStream), StandardCharsets.UTF_8);
                C1428pc c1428pc = this.f13496b;
                c1428pc.f15004t = str;
                return AbstractC1400ot.c0(c1428pc);
        }
    }
}
