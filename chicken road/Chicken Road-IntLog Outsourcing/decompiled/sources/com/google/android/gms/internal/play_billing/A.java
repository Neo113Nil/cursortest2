package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class A extends C {

    /* renamed from: c, reason: collision with root package name */
    public final transient C f5018c;

    public A(C c2) {
        this.f5018c = c2;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f5018c.contains(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0382x
    public final boolean f() {
        return this.f5018c.f();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        C c2 = this.f5018c;
        AbstractC0325d1.i(i2, c2.size());
        return c2.get((c2.size() - 1) - i2);
    }

    @Override // com.google.android.gms.internal.play_billing.C
    public final C h() {
        return this.f5018c;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.List
    /* renamed from: i */
    public final C subList(int i2, int i3) {
        C c2 = this.f5018c;
        AbstractC0325d1.F(i2, i3, c2.size());
        return c2.subList(c2.size() - i3, c2.size() - i2).h();
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f5018c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f5018c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5018c.size();
    }
}
