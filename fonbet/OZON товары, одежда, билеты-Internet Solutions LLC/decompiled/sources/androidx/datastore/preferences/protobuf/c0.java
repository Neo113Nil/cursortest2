package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class c0 {

    /* renamed from: c, reason: collision with root package name */
    private static final c0 f42502c = new c0();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f42503d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f42505b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final I f42504a = new I();

    private c0() {
    }

    public static c0 a() {
        return f42502c;
    }

    public final <T> f0<T> b(Class<T> cls) {
        C5378y.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f42505b;
        f0<T> f0Var = (f0) concurrentHashMap.get(cls);
        if (f0Var == null) {
            f0Var = this.f42504a.a(cls);
            f0<T> f0Var2 = (f0) concurrentHashMap.putIfAbsent(cls, f0Var);
            if (f0Var2 != null) {
                return f0Var2;
            }
        }
        return f0Var;
    }
}
