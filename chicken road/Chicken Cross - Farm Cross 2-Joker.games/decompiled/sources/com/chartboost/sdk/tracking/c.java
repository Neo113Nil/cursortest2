package com.chartboost.sdk.tracking;

import com.chartboost.sdk.tracking.g;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f5135a;
    public int b;
    public final Map c = new LinkedHashMap();
    public final Map d = new LinkedHashMap();
    public final Set e = new LinkedHashSet();

    public c(int i, int i2) {
        this.f5135a = i;
        this.b = i2;
    }

    public final long a(f fVar) {
        Long l = (Long) this.c.get(fVar.f());
        return l != null ? l.longValue() : fVar.i();
    }

    public final long b(f fVar) {
        return (fVar.i() - a(fVar)) / 1000;
    }

    public final int c(f fVar) {
        Integer num = (Integer) this.d.get(fVar.f());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void d(f fVar) {
        if (this.c.containsKey(fVar.f())) {
            return;
        }
        this.c.put(fVar.f(), Long.valueOf(fVar.i()));
    }

    public final synchronized f e(f fVar) {
        if (fVar == null) {
            return null;
        }
        d(fVar);
        if (b(fVar) > this.b) {
            g(fVar);
        }
        if (this.e.contains(fVar.f())) {
            return null;
        }
        if (i(fVar) <= this.f5135a) {
            return fVar;
        }
        return f(fVar);
    }

    public final f f(f fVar) {
        e eVar = new e(g.f.i, fVar.f().getValue(), null, null, null, null, 60, null);
        this.e.add(fVar.f());
        return eVar;
    }

    public final void g(f fVar) {
        h(fVar);
        this.d.remove(fVar.f());
    }

    public final void h(f fVar) {
        this.c.put(fVar.f(), Long.valueOf(fVar.i()));
    }

    public final int i(f fVar) {
        int c = c(fVar) + 1;
        this.d.put(fVar.f(), Integer.valueOf(c));
        return c;
    }
}
