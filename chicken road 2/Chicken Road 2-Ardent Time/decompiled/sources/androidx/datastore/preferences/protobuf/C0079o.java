package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0079o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile androidx.datastore.preferences.protobuf.C0079o f2344a;

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.C0079o f2345b;

    static {
        androidx.datastore.preferences.protobuf.C0079o c0079o = new androidx.datastore.preferences.protobuf.C0079o();
        java.util.Collections.emptyMap();
        f2345b = c0079o;
    }

    public static androidx.datastore.preferences.protobuf.C0079o a() {
        androidx.datastore.preferences.protobuf.T t = androidx.datastore.preferences.protobuf.T.f2259c;
        androidx.datastore.preferences.protobuf.C0079o c0079o = f2344a;
        if (c0079o == null) {
            synchronized (androidx.datastore.preferences.protobuf.C0079o.class) {
                try {
                    c0079o = f2344a;
                    if (c0079o == null) {
                        java.lang.Class cls = androidx.datastore.preferences.protobuf.AbstractC0078n.f2343a;
                        androidx.datastore.preferences.protobuf.C0079o c0079o2 = null;
                        if (cls != null) {
                            try {
                                c0079o2 = (androidx.datastore.preferences.protobuf.C0079o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (java.lang.Exception unused) {
                            }
                        }
                        if (c0079o2 == null) {
                            c0079o2 = f2345b;
                        }
                        f2344a = c0079o2;
                        c0079o = c0079o2;
                    }
                } finally {
                }
            }
        }
        return c0079o;
    }
}
