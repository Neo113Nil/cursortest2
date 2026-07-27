package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class B extends C {

    /* renamed from: c, reason: collision with root package name */
    public final transient int f2598c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f2599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C f2600e;

    public B(C c3, int i3, int i4) {
        this.f2600e = c3;
        this.f2598c = i3;
        this.f2599d = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final int c() {
        return this.f2600e.d() + this.f2598c + this.f2599d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final int d() {
        return this.f2600e.d() + this.f2598c;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final Object[] g() {
        return this.f2600e.g();
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0181d1.g(i3, this.f2599d);
        return this.f2600e.get(i3 + this.f2598c);
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.List
    /* renamed from: i */
    public final C subList(int i3, int i4) {
        AbstractC0181d1.x(i3, i4, this.f2599d);
        int i5 = this.f2598c;
        return this.f2600e.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2599d;
    }
}
