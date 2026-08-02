package w1;

import java.util.HashMap;

/* renamed from: w1.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1764z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f17940b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f17941c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final C1764z0 f17942d = new C1764z0("APP");

    /* renamed from: a, reason: collision with root package name */
    public final String f17943a;

    static {
        new C1764z0("KILLSWITCH");
    }

    public C1764z0(String str) {
        this.f17943a = str;
        f17940b.put(str, this);
    }

    public static C1764z0 a(String str) {
        HashMap hashMap = f17940b;
        if (hashMap.containsKey(str)) {
            return (C1764z0) hashMap.get(str);
        }
        C1764z0 c1764z0 = new C1764z0(str);
        f17941c.put(str, c1764z0);
        return c1764z0;
    }

    public final String toString() {
        return this.f17943a;
    }
}
