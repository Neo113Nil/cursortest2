package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0948x2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0392bf f8603a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8604b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8605c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f8606d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f8607e;

    public C0948x2(X4 x4, C0392bf c0392bf) {
        this.f8603a = c0392bf;
        x4.b();
        this.f8604b = TimeUnit.MINUTES.toMillis(1L);
        this.f8605c = TimeUnit.DAYS.toMillis(7L);
        this.f8606d = new SystemTimeProvider();
        Map<String, Long> f = c0392bf.f();
        a(f);
        this.f8607e = f;
    }

    public final void a(Map map) {
        long currentTimeMillis = this.f8606d.currentTimeMillis();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (((Number) entry.getValue()).longValue() < currentTimeMillis - this.f8605c) {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }
}
