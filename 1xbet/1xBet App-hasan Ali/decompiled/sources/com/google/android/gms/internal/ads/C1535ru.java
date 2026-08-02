package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ru, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1535ru extends AbstractC1401ou {

    /* renamed from: k, reason: collision with root package name */
    public final Object f15393k;

    public C1535ru(Object obj) {
        this.f15393k = obj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1401ou
    public final AbstractC1401ou a(InterfaceC1311mu interfaceC1311mu) {
        Object apply = interfaceC1311mu.apply(this.f15393k);
        AbstractC1400ot.M("the Function passed to Optional.transform() must not return null.", apply);
        return new C1535ru(apply);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1401ou
    public final Object b() {
        return this.f15393k;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1535ru) {
            return this.f15393k.equals(((C1535ru) obj).f15393k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15393k.hashCode() + 1502476572;
    }

    public final String toString() {
        return L1.a.n("Optional.of(", this.f15393k.toString(), ")");
    }
}
