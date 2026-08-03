package a1;

/* loaded from: classes.dex */
public final class p implements a1.j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f1951a = java.nio.charset.Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final a1.p f1952b = new a1.p();

    public static java.lang.String a(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr;
        int i2;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i2 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i2 = 0;
        }
        return new java.lang.String(bArr, i2, remaining, f1951a);
    }

    public static java.nio.ByteBuffer b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f1951a);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // a1.j
    public final /* bridge */ /* synthetic */ java.lang.Object decodeMessage(java.nio.ByteBuffer byteBuffer) {
        return a(byteBuffer);
    }

    @Override // a1.j
    public final /* bridge */ /* synthetic */ java.nio.ByteBuffer encodeMessage(java.lang.Object obj) {
        return b((java.lang.String) obj);
    }
}
