package com.facebook.appevents.ml;

import androidx.annotation.RestrictTo;
import com.facebook.appevents.ml.d;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class b {
    public static final a Companion = new a();
    public static final HashMap m = MapsKt.hashMapOf(TuplesKt.to("embedding.weight", "embed.weight"), TuplesKt.to("dense1.weight", "fc1.weight"), TuplesKt.to("dense2.weight", "fc2.weight"), TuplesKt.to("dense3.weight", "fc3.weight"), TuplesKt.to("dense1.bias", "fc1.bias"), TuplesKt.to("dense2.bias", "fc2.bias"), TuplesKt.to("dense3.bias", "fc3.bias"));
    public final com.facebook.appevents.ml.a a;
    public final com.facebook.appevents.ml.a b;
    public final com.facebook.appevents.ml.a c;
    public final com.facebook.appevents.ml.a d;
    public final com.facebook.appevents.ml.a e;
    public final com.facebook.appevents.ml.a f;
    public final com.facebook.appevents.ml.a g;
    public final com.facebook.appevents.ml.a h;
    public final com.facebook.appevents.ml.a i;
    public final com.facebook.appevents.ml.a j;
    public final com.facebook.appevents.ml.a k;
    public final HashMap l;

    public static final class a {
    }

    public b() {
        throw null;
    }

    public b(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.a = (com.facebook.appevents.ml.a) obj;
        Object obj2 = hashMap.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.b = g.l((com.facebook.appevents.ml.a) obj2);
        Object obj3 = hashMap.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.c = g.l((com.facebook.appevents.ml.a) obj3);
        Object obj4 = hashMap.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.d = g.l((com.facebook.appevents.ml.a) obj4);
        Object obj5 = hashMap.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.e = (com.facebook.appevents.ml.a) obj5;
        Object obj6 = hashMap.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f = (com.facebook.appevents.ml.a) obj6;
        Object obj7 = hashMap.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.g = (com.facebook.appevents.ml.a) obj7;
        Object obj8 = hashMap.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.h = g.k((com.facebook.appevents.ml.a) obj8);
        Object obj9 = hashMap.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.i = g.k((com.facebook.appevents.ml.a) obj9);
        Object obj10 = hashMap.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.j = (com.facebook.appevents.ml.a) obj10;
        Object obj11 = hashMap.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.k = (com.facebook.appevents.ml.a) obj11;
        this.l = new HashMap();
        for (String str : SetsKt.setOf((Object[]) new String[]{d.a.a.a(), d.a.b.a()})) {
            String b = androidx.compose.runtime.changelist.d.b(str, ".weight");
            String b2 = androidx.compose.runtime.changelist.d.b(str, ".bias");
            com.facebook.appevents.ml.a aVar = (com.facebook.appevents.ml.a) hashMap.get(b);
            com.facebook.appevents.ml.a aVar2 = (com.facebook.appevents.ml.a) hashMap.get(b2);
            if (aVar != null) {
                this.l.put(b, g.k(aVar));
            }
            if (aVar2 != null) {
                this.l.put(b2, aVar2);
            }
        }
    }

    public final com.facebook.appevents.ml.a a(com.facebook.appevents.ml.a dense, String[] texts, String task) {
        HashMap hashMap = this.l;
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                Intrinsics.checkNotNullParameter(dense, "dense");
                Intrinsics.checkNotNullParameter(texts, "texts");
                Intrinsics.checkNotNullParameter(task, "task");
                com.facebook.appevents.ml.a c = g.c(g.e(texts, this.a), this.b);
                g.a(c, this.e);
                g.i(c);
                com.facebook.appevents.ml.a c2 = g.c(c, this.c);
                g.a(c2, this.f);
                g.i(c2);
                com.facebook.appevents.ml.a g = g.g(c2, 2);
                com.facebook.appevents.ml.a c3 = g.c(g, this.d);
                g.a(c3, this.g);
                g.i(c3);
                com.facebook.appevents.ml.a g2 = g.g(c, c.a[1]);
                com.facebook.appevents.ml.a g3 = g.g(g, g.a[1]);
                com.facebook.appevents.ml.a g4 = g.g(c3, c3.a[1]);
                g.f(g2);
                g.f(g3);
                g.f(g4);
                com.facebook.appevents.ml.a d = g.d(g.b(new com.facebook.appevents.ml.a[]{g2, g3, g4, dense}), this.h, this.j);
                g.i(d);
                com.facebook.appevents.ml.a d2 = g.d(d, this.i, this.k);
                g.i(d2);
                com.facebook.appevents.ml.a aVar = (com.facebook.appevents.ml.a) hashMap.get(task.concat(".weight"));
                com.facebook.appevents.ml.a aVar2 = (com.facebook.appevents.ml.a) hashMap.get(task.concat(".bias"));
                if (aVar != null && aVar2 != null) {
                    com.facebook.appevents.ml.a d3 = g.d(d2, aVar, aVar2);
                    g.j(d3);
                    return d3;
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }
}
