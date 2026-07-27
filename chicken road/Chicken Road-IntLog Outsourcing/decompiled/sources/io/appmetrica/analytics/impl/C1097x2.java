package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1097x2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0541bf f9562a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9563b;

    /* renamed from: c, reason: collision with root package name */
    public final long f9564c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f9565d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f9566e;

    public C1097x2(X4 x42, C0541bf c0541bf) {
        this.f9562a = c0541bf;
        x42.b();
        this.f9563b = TimeUnit.MINUTES.toMillis(1L);
        this.f9564c = TimeUnit.DAYS.toMillis(7L);
        this.f9565d = new SystemTimeProvider();
        Map<String, Long> f3 = c0541bf.f();
        a(f3);
        this.f9566e = f3;
    }

    public final void a(Map map) {
        long currentTimeMillis = this.f9565d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < currentTimeMillis - this.f9564c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
