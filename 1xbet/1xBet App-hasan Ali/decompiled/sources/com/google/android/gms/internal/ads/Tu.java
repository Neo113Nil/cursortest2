package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class Tu extends Ou {

    /* renamed from: k, reason: collision with root package name */
    public final Object f11697k;

    /* renamed from: l, reason: collision with root package name */
    public int f11698l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Uu f11699m;

    public Tu(Uu uu, int i) {
        this.f11699m = uu;
        Object obj = Uu.f11832t;
        this.f11697k = uu.b()[i];
        this.f11698l = i;
    }

    public final void a() {
        int i = this.f11698l;
        Object obj = this.f11697k;
        Uu uu = this.f11699m;
        if (i != -1 && i < uu.size()) {
            if (AbstractC1400ot.q(obj, uu.b()[this.f11698l])) {
                return;
            }
        }
        Object obj2 = Uu.f11832t;
        this.f11698l = uu.h(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11697k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Uu uu = this.f11699m;
        Map d5 = uu.d();
        if (d5 != null) {
            return d5.get(this.f11697k);
        }
        a();
        int i = this.f11698l;
        if (i == -1) {
            return null;
        }
        return uu.c()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Uu uu = this.f11699m;
        Map d5 = uu.d();
        Object obj2 = this.f11697k;
        if (d5 != null) {
            return d5.put(obj2, obj);
        }
        a();
        int i = this.f11698l;
        if (i == -1) {
            uu.put(obj2, obj);
            return null;
        }
        Object obj3 = uu.c()[i];
        uu.c()[this.f11698l] = obj;
        return obj3;
    }
}
