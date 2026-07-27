package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516ga {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0516ga f7364c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f7365a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f7366b = new HashMap();

    public C0516ga(Context context) {
        this.f7365a = context;
    }

    public static final C0516ga a(Context context) {
        if (f7364c == null) {
            synchronized (kotlin.jvm.internal.r.a(C0516ga.class)) {
                if (f7364c == null) {
                    f7364c = new C0516ga(context);
                }
            }
        }
        C0516ga c0516ga = f7364c;
        if (c0516ga != null) {
            return c0516ga;
        }
        kotlin.jvm.internal.j.g("INSTANCE");
        throw null;
    }

    public final synchronized E9 b(String str) {
        Object obj;
        try {
            HashMap hashMap = this.f7366b;
            obj = hashMap.get(str);
            if (obj == null) {
                obj = new E9(this.f7365a, str);
                hashMap.put(str, obj);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (E9) obj;
    }

    public final synchronized void a(String str) {
        this.f7366b.remove(str);
    }
}
