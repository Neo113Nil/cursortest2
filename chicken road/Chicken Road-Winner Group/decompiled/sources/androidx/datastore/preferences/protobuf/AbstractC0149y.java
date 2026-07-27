package androidx.datastore.preferences.protobuf;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0149y {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2300a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2301b;

    static {
        Charset.forName(CharEncoding.US_ASCII);
        f2300a = Charset.forName(CharEncoding.UTF_8);
        Charset.forName(CharEncoding.ISO_8859_1);
        byte[] bArr = new byte[0];
        f2301b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0133h(bArr, 0, 0, false).e(0);
        } catch (A e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
