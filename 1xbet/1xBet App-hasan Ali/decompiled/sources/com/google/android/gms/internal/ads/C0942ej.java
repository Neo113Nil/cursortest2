package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ej, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0942ej implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13326a;

    /* renamed from: b, reason: collision with root package name */
    public final C1390oj f13327b;

    public /* synthetic */ C0942ej(C1390oj c1390oj, int i) {
        this.f13326a = i;
        this.f13327b = c1390oj;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f13326a) {
            case 0:
                InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) this.f13327b.f14828m;
                if (interfaceC0677Re == null) {
                    return null;
                }
                return interfaceC0677Re.m0();
            case 1:
                InterfaceC0677Re interfaceC0677Re2 = (InterfaceC0677Re) this.f13327b.f14828m;
                if (interfaceC0677Re2 != null) {
                    return interfaceC0677Re2.m0();
                }
                return null;
            default:
                return (InterfaceC0677Re) this.f13327b.f14828m;
        }
    }
}
