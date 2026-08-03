package R1;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f1690a = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f1691b;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.Package r2 = I1.s.class.getPackage();
        java.lang.String name = r2 == null ? null : r2.getName();
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(I1.s.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(P1.g.class.getName(), "okhttp.Http2");
        linkedHashMap.put(L1.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f1691b = i1.AbstractC0202u.K(linkedHashMap);
    }
}
