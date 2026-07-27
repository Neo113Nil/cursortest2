package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class Kc {

    /* renamed from: a, reason: collision with root package name */
    public final Map f6182a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6183b;

    public Kc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f6182a.put(obj, obj2);
    }

    public Kc(HashMap hashMap, Object obj) {
        this.f6182a = hashMap;
        this.f6183b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f6182a.get(obj);
        return obj2 == null ? this.f6183b : obj2;
    }
}
