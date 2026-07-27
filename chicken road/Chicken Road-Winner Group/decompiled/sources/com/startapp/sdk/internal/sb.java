package com.startapp.sdk.internal;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class sb {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f4328a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ib f4329b;

    /* renamed from: c, reason: collision with root package name */
    public final ib f4330c;

    public sb(ib ibVar, ib ibVar2) {
        this.f4329b = ibVar;
        this.f4330c = ibVar2;
    }

    public final rb a(String str) {
        if (this.f4328a.containsKey(str)) {
            return (rb) this.f4328a.get(str);
        }
        rb rbVar = new rb(new a9(this.f4329b, this.f4330c));
        this.f4328a.put(str, rbVar);
        return rbVar;
    }
}
