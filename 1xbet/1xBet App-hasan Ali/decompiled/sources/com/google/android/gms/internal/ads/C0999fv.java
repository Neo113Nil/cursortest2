package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0999fv extends AbstractC1044gv {

    /* renamed from: m, reason: collision with root package name */
    public final transient int f13525m;

    /* renamed from: n, reason: collision with root package name */
    public final transient int f13526n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1044gv f13527o;

    public C0999fv(AbstractC1044gv abstractC1044gv, int i, int i5) {
        this.f13527o = abstractC1044gv;
        this.f13525m = i;
        this.f13526n = i5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final int d() {
        return this.f13527o.e() + this.f13525m + this.f13526n;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final int e() {
        return this.f13527o.e() + this.f13525m;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1400ot.i(i, this.f13526n);
        return this.f13527o.get(i + this.f13525m);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0821bv
    public final Object[] i() {
        return this.f13527o.i();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1044gv, java.util.List
    /* renamed from: j */
    public final AbstractC1044gv subList(int i, int i5) {
        AbstractC1400ot.g0(i, i5, this.f13526n);
        int i6 = this.f13525m;
        return this.f13527o.subList(i + i6, i5 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13526n;
    }
}
