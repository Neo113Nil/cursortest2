package com.facebook.internal.instrument.crashshield;

import com.facebook.S;
import com.facebook.internal.instrument.b;
import com.facebook.internal.instrument.c;
import com.facebook.w;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public static final Set<Object> a = Collections.newSetFromMap(new WeakHashMap());
    public static boolean b;

    @JvmStatic
    public static final void a(Throwable th, Object o) {
        Intrinsics.checkNotNullParameter(o, "o");
        if (b) {
            a.add(o);
            w wVar = w.a;
            if (S.c()) {
                b.a(th);
                c.a.b(th, c.EnumC0092c.e).b();
            }
        }
    }

    @JvmStatic
    public static final boolean b(Object o) {
        Intrinsics.checkNotNullParameter(o, "o");
        return a.contains(o);
    }
}
