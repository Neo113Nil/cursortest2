package p0;

/* renamed from: p0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0966r {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f8285a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f8286b;

    /* renamed from: c, reason: collision with root package name */
    public static int f8287c;

    public static void a(A0.a aVar) {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != aVar.getLooper()) {
            java.lang.String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new java.lang.IllegalStateException("Must be called on " + aVar.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static void b(java.lang.String str) {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException(str);
        }
    }

    public static void c(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("null reference");
        }
    }

    public static void d(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    public static boolean e(java.lang.Object obj, java.lang.Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
