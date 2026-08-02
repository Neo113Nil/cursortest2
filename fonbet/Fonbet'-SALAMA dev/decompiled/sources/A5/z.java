package A5;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class z implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f690a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final z f691b = new z();

    public static String c(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i7;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i7 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i7 = 0;
        }
        return new String(bArr, i7, remaining, f690a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f690a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // A5.n
    public final /* bridge */ /* synthetic */ ByteBuffer a(Object obj) {
        return d((String) obj);
    }

    @Override // A5.n
    public final /* bridge */ /* synthetic */ Object b(ByteBuffer byteBuffer) {
        return c(byteBuffer);
    }
}
