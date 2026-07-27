package H2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class t implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1153a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final t f1154b = new t();

    public static String a(ByteBuffer byteBuffer) {
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
        return new String(bArr, i2, remaining, f1153a);
    }

    public static ByteBuffer b(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f1153a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // H2.k
    public final /* bridge */ /* synthetic */ Object decodeMessage(ByteBuffer byteBuffer) {
        return a(byteBuffer);
    }

    @Override // H2.k
    public final /* bridge */ /* synthetic */ ByteBuffer encodeMessage(Object obj) {
        return b((String) obj);
    }
}
