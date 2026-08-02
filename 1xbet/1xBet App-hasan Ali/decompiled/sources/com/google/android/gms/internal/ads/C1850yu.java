package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.yu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1850yu implements Serializable, InterfaceC1805xu {

    /* renamed from: k, reason: collision with root package name */
    public final transient Au f16500k = new Au();

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1805xu f16501l;

    /* renamed from: m, reason: collision with root package name */
    public volatile transient boolean f16502m;

    /* renamed from: n, reason: collision with root package name */
    public transient Object f16503n;

    public C1850yu(InterfaceC1805xu interfaceC1805xu) {
        this.f16501l = interfaceC1805xu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1805xu
    /* renamed from: a */
    public final Object mo12a() {
        if (!this.f16502m) {
            synchronized (this.f16500k) {
                try {
                    if (!this.f16502m) {
                        Object mo12a = this.f16501l.mo12a();
                        this.f16503n = mo12a;
                        this.f16502m = true;
                        return mo12a;
                    }
                } finally {
                }
            }
        }
        return this.f16503n;
    }

    public final String toString() {
        return L1.a.n("Suppliers.memoize(", (this.f16502m ? L1.a.n("<supplier that returned ", String.valueOf(this.f16503n), ">") : this.f16501l).toString(), ")");
    }
}
