package io.appmetrica.analytics.location.impl;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public i f8759a;

    /* renamed from: b, reason: collision with root package name */
    public final m f8760b;

    /* renamed from: c, reason: collision with root package name */
    public final h f8761c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8762d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f8763e = new HashMap();

    public p(List list, i iVar) {
        this.f8762d = list;
        this.f8759a = iVar;
        m mVar = new m();
        this.f8760b = mVar;
        this.f8761c = new h(mVar);
    }

    public final m a() {
        return this.f8760b;
    }
}
