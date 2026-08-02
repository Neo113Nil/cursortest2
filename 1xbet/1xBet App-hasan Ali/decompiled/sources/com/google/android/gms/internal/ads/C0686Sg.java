package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686Sg implements DD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11572a;

    /* renamed from: b, reason: collision with root package name */
    public final C1390oj f11573b;

    public /* synthetic */ C0686Sg(C1390oj c1390oj, int i) {
        this.f11572a = i;
        this.f11573b = c1390oj;
    }

    @Override // com.google.android.gms.internal.ads.ID
    public final Object d() {
        switch (this.f11572a) {
            case 0:
                return (RunnableC1362o) this.f11573b.f14828m;
            default:
                InterfaceC1059h9 interfaceC1059h9 = (InterfaceC1059h9) this.f11573b.f14827l;
                AbstractC1400ot.D(interfaceC1059h9);
                return interfaceC1059h9;
        }
    }
}
