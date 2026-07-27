package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class Fn {

    /* renamed from: a, reason: collision with root package name */
    public final En f6811a;

    /* renamed from: b, reason: collision with root package name */
    public final BiFunction f6812b;

    /* renamed from: c, reason: collision with root package name */
    public final Hf f6813c;

    public Fn() {
        this(new Cn(), new C0975sa(), C0736j4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Dn());
        try {
            map = this.f6811a.c();
        } catch (SecurityException unused) {
            map = null;
        }
        if (map != null) {
            treeMap.putAll(map);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C1143yn) this.f6812b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public Fn(En en, C0975sa c0975sa, C1126y6 c1126y6) {
        this.f6811a = en;
        this.f6812b = c0975sa;
        this.f6813c = c1126y6;
    }
}
