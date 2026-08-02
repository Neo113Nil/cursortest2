package com.facebook.appevents;

import android.content.Context;
import com.facebook.appevents.l;
import com.facebook.internal.C0705a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.facebook.appevents.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0693e {
    public final HashMap<C0689a, E> a = new HashMap<>();

    public final synchronized void a(D d) {
        Set<Map.Entry<C0689a, List<C0692d>>> set = null;
        if (!com.facebook.internal.instrument.crashshield.a.b(d)) {
            try {
                Set<Map.Entry<C0689a, List<C0692d>>> entrySet = d.a.entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "events.entries");
                set = entrySet;
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, d);
            }
        }
        for (Map.Entry<C0689a, List<C0692d>> entry : set) {
            E d2 = d(entry.getKey());
            if (d2 != null) {
                Iterator<C0692d> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    d2.a(it.next());
                }
            }
        }
    }

    public final synchronized E b(C0689a accessTokenAppIdPair) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.a.get(accessTokenAppIdPair);
    }

    public final synchronized int c() {
        int i;
        int size;
        i = 0;
        for (E e : this.a.values()) {
            synchronized (e) {
                if (!com.facebook.internal.instrument.crashshield.a.b(e)) {
                    try {
                        size = e.c.size();
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, e);
                    }
                }
                size = 0;
            }
            i += size;
        }
        return i;
    }

    public final synchronized E d(C0689a c0689a) {
        E e = this.a.get(c0689a);
        if (e == null) {
            Context a = com.facebook.w.a();
            C0705a.Companion.getClass();
            C0705a a2 = C0705a.C0089a.a(a);
            if (a2 != null) {
                l.Companion.getClass();
                e = new E(a2, l.a.b(a));
            }
        }
        if (e == null) {
            return null;
        }
        this.a.put(c0689a, e);
        return e;
    }

    public final synchronized Set<C0689a> e() {
        Set<C0689a> keySet;
        keySet = this.a.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "stateMap.keys");
        return keySet;
    }
}
