package P;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f370a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final o f371b = new o();

    public static String c(ByteBuffer byteBuffer) {
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
        return new String(bArr, i2, remaining, f370a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f370a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // P.i
    public final /* bridge */ /* synthetic */ Object a(ByteBuffer byteBuffer) {
        return c(byteBuffer);
    }

    @Override // P.i
    public final /* bridge */ /* synthetic */ ByteBuffer b(Object obj) {
        return d((String) obj);
    }
}
