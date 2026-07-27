package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class Fn {

    /* renamed from: a, reason: collision with root package name */
    public final En f5966a;

    /* renamed from: b, reason: collision with root package name */
    public final BiFunction f5967b;

    /* renamed from: c, reason: collision with root package name */
    public final Hf f5968c;

    public Fn() {
        this(new Cn(), new C0826sa(), C0587j4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map map;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Dn());
        try {
            map = this.f5966a.c();
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
                arrayList.add((C0994yn) this.f5967b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public Fn(En en, C0826sa c0826sa, C0977y6 c0977y6) {
        this.f5966a = en;
        this.f5967b = c0826sa;
        this.f5968c = c0977y6;
    }
}
