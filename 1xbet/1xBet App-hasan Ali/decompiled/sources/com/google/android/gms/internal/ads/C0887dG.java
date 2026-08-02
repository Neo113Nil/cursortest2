package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.dG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887dG implements InterfaceC1783xG, AF {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f13108a;

    /* renamed from: b, reason: collision with root package name */
    public C1872zF f13109b;

    /* renamed from: c, reason: collision with root package name */
    public C1872zF f13110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0976fG f13111d;

    public C0887dG(AbstractC0976fG abstractC0976fG, Integer num) {
        this.f13111d = abstractC0976fG;
        this.f13109b = new C1872zF(abstractC0976fG.f12475c.f16579b, null);
        this.f13110c = new C1872zF(abstractC0976fG.f12476d.f16579b, null);
        this.f13108a = num;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void a(int i, C1603tG c1603tG, C1199kG c1199kG, C1469qG c1469qG) {
        if (g(c1603tG)) {
            C1872zF c1872zF = this.f13109b;
            C1469qG f = f(c1469qG, c1603tG);
            c1872zF.getClass();
            c1872zF.a(new C1693vG(c1872zF, c1199kG, f, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void b(int i, C1603tG c1603tG, C1199kG c1199kG, C1469qG c1469qG) {
        if (g(c1603tG)) {
            C1872zF c1872zF = this.f13109b;
            C1469qG f = f(c1469qG, c1603tG);
            c1872zF.getClass();
            c1872zF.a(new C1693vG(c1872zF, c1199kG, f, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void c(int i, C1603tG c1603tG, C1199kG c1199kG, C1469qG c1469qG) {
        if (g(c1603tG)) {
            C1872zF c1872zF = this.f13109b;
            C1469qG f = f(c1469qG, c1603tG);
            c1872zF.getClass();
            c1872zF.a(new C1693vG(c1872zF, c1199kG, f, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void d(int i, C1603tG c1603tG, C1469qG c1469qG) {
        if (g(c1603tG)) {
            C1872zF c1872zF = this.f13109b;
            C1469qG f = f(c1469qG, c1603tG);
            c1872zF.getClass();
            c1872zF.a(new C1667ur(13, c1872zF, f, false));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1783xG
    public final void e(int i, C1603tG c1603tG, C1199kG c1199kG, C1469qG c1469qG, IOException iOException, boolean z3) {
        if (g(c1603tG)) {
            C1872zF c1872zF = this.f13109b;
            C1469qG f = f(c1469qG, c1603tG);
            c1872zF.getClass();
            c1872zF.a(new C1894zt(c1872zF, c1199kG, f, iOException, z3));
        }
    }

    public final C1469qG f(C1469qG c1469qG, C1603tG c1603tG) {
        AbstractC0976fG abstractC0976fG = this.f13111d;
        Integer num = this.f13108a;
        long j5 = c1469qG.f15119c;
        abstractC0976fG.v(num, j5);
        long j6 = c1469qG.f15120d;
        abstractC0976fG.v(num, j6);
        return (j5 == c1469qG.f15119c && j6 == c1469qG.f15120d) ? c1469qG : new C1469qG(c1469qG.f15117a, c1469qG.f15118b, j5, j6);
    }

    public final boolean g(C1603tG c1603tG) {
        C1603tG c1603tG2;
        Integer num = this.f13108a;
        AbstractC0976fG abstractC0976fG = this.f13111d;
        if (c1603tG != null) {
            c1603tG2 = abstractC0976fG.w(num, c1603tG);
            if (c1603tG2 == null) {
                return false;
            }
        } else {
            c1603tG2 = null;
        }
        abstractC0976fG.u(num);
        C1872zF c1872zF = this.f13109b;
        c1872zF.getClass();
        if (!Objects.equals(c1872zF.f16578a, c1603tG2)) {
            this.f13109b = new C1872zF(abstractC0976fG.f12475c.f16579b, c1603tG2);
        }
        C1872zF c1872zF2 = this.f13110c;
        c1872zF2.getClass();
        if (Objects.equals(c1872zF2.f16578a, c1603tG2)) {
            return true;
        }
        this.f13110c = new C1872zF(abstractC0976fG.f12476d.f16579b, c1603tG2);
        return true;
    }
}
