package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0088y {

    /* renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f2376a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2377b;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        f2376a = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2377b = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        try {
            new androidx.datastore.preferences.protobuf.C0072h(bArr, 0, 0, false).e(0);
        } catch (androidx.datastore.preferences.protobuf.A e2) {
            throw new java.lang.IllegalArgumentException(e2);
        }
    }

    public static void a(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    public static int b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }
}
