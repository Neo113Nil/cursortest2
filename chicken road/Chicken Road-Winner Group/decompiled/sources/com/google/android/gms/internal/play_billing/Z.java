package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class Z extends H {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object f2717c;

    public Z(Object obj) {
        this.f2717c = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0238x
    public final int b(Object[] objArr) {
        objArr[0] = this.f2717c;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2717c.equals(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.H, com.google.android.gms.internal.play_billing.AbstractC0238x
    public final C e() {
        Object[] objArr = {this.f2717c};
        for (int i3 = 0; i3 < 1; i3++) {
            C0244z c0244z = C.f2606b;
            if (objArr[i3] == null) {
                throw new NullPointerException(B0.c.h(i3, "at index "));
            }
        }
        return C.j(1, objArr);
    }

    @Override // com.google.android.gms.internal.play_billing.H, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2717c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new K(this.f2717c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return B0.c.k("[", this.f2717c.toString(), "]");
    }
}
