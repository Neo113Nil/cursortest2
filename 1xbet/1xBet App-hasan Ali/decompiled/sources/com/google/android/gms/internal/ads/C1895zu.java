package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1895zu implements InterfaceC1805xu {

    /* renamed from: n, reason: collision with root package name */
    public static final Aq f16787n = new Aq(7, 0);

    /* renamed from: k, reason: collision with root package name */
    public final Au f16788k = new Au();

    /* renamed from: l, reason: collision with root package name */
    public volatile InterfaceC1805xu f16789l;

    /* renamed from: m, reason: collision with root package name */
    public Object f16790m;

    public C1895zu(InterfaceC1805xu interfaceC1805xu) {
        this.f16789l = interfaceC1805xu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public final Object mo12a() {
        InterfaceC1805xu interfaceC1805xu = this.f16789l;
        Aq aq = f16787n;
        if (interfaceC1805xu != aq) {
            synchronized (this.f16788k) {
                try {
                    if (this.f16789l != aq) {
                        Object mo12a = this.f16789l.mo12a();
                        this.f16790m = mo12a;
                        this.f16789l = aq;
                        return mo12a;
                    }
                } finally {
                }
            }
        }
        return this.f16790m;
    }

    public final String toString() {
        Object obj = this.f16789l;
        if (obj == f16787n) {
            obj = L1.a.n("<supplier that returned ", String.valueOf(this.f16790m), ">");
        }
        return L1.a.n("Suppliers.memoize(", String.valueOf(obj), ")");
    }
}
