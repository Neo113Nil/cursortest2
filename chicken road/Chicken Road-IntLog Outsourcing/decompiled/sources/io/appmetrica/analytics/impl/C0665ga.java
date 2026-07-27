package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665ga {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0665ga f8264c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8265a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8266b = new HashMap();

    public C0665ga(Context context) {
        this.f8265a = context;
    }

    public static final C0665ga a(Context context) {
        if (f8264c == null) {
            synchronized (kotlin.jvm.internal.t.a(C0665ga.class)) {
                if (f8264c == null) {
                    f8264c = new C0665ga(context);
                }
            }
        }
        C0665ga c0665ga = f8264c;
        if (c0665ga != null) {
            return c0665ga;
        }
        kotlin.jvm.internal.i.l("INSTANCE");
        throw null;
    }

    public final synchronized E9 b(String str) {
        Object obj;
        try {
            HashMap hashMap = this.f8266b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new E9(this.f8265a, str);
                hashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (E9) obj;
    }

    public final synchronized void a(String str) {
        this.f8266b.remove(str);
    }
}
