package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class A extends C {

    /* renamed from: c, reason: collision with root package name */
    public final transient C f2594c;

    public A(C c3) {
        this.f2594c = c3;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f2594c.contains(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final boolean f() {
        return this.f2594c.f();
    }

    @Override // java.util.List
    public final Object get(int i3) {
        C c3 = this.f2594c;
        AbstractC0181d1.g(i3, c3.size());
        return c3.get((c3.size() - 1) - i3);
    }

    @Override // com.google.android.gms.internal.play_billing.C
    public final C h() {
        return this.f2594c;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final C subList(int i3, int i4) {
        C c3 = this.f2594c;
        AbstractC0181d1.x(i3, i4, c3.size());
        return c3.subList(c3.size() - i4, c3.size() - i3).h();
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f2594c.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.C, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f2594c.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2594c.size();
    }
}
