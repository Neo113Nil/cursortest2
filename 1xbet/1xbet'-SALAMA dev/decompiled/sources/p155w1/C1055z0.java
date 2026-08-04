package p155w1;

import java.util.HashMap;

/* JADX INFO: renamed from: w1.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1055z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f17946b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f17947c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1055z0 f17948d = new C1055z0("APP");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17949a;

    static {
        new C1055z0("KILLSWITCH");
    }

    public C1055z0(String str) {
        this.f17949a = str;
        f17946b.put(str, this);
    }

    public static C1055z0 a(String str) {
        HashMap map = f17946b;
        if (map.containsKey(str)) {
            return (C1055z0) map.get(str);
        }
        C1055z0 c1055z0 = new C1055z0(str);
        f17947c.put(str, c1055z0);
        return c1055z0;
    }

    public final String toString() {
        return this.f17949a;
    }
}
