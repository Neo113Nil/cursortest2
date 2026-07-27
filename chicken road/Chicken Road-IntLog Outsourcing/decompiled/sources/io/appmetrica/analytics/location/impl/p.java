package io.appmetrica.analytics.location.impl;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public i f9724a;

    /* renamed from: b, reason: collision with root package name */
    public final m f9725b;

    /* renamed from: c, reason: collision with root package name */
    public final h f9726c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9727d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f9728e = new HashMap();

    public p(List list, i iVar) {
        this.f9727d = list;
        this.f9724a = iVar;
        m mVar = new m();
        this.f9725b = mVar;
        this.f9726c = new h(mVar);
    }

    public final m a() {
        return this.f9725b;
    }
}
