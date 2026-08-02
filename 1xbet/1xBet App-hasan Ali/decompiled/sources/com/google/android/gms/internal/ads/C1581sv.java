package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1581sv extends Qu implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final transient Map f15613n;

    /* renamed from: o, reason: collision with root package name */
    public transient int f15614o;

    /* renamed from: p, reason: collision with root package name */
    public final transient Au f15615p;

    public C1581sv(Map map, Au au) {
        AbstractC1400ot.W(map.isEmpty());
        this.f15613n = map;
        this.f15615p = au;
    }

    public final void b() {
        Map map = this.f15613n;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f15614o = 0;
    }
}
