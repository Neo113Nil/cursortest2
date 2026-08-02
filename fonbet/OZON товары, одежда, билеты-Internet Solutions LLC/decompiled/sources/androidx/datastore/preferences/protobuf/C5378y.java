package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5378y {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f42628a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f42629b;

    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    /* loaded from: classes8.dex */
    public interface a {
        int getNumber();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$b */
    public interface b {
        boolean a();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y$c */
    /* loaded from: classes8.dex */
    public interface c<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        c<E> mutableCopyWithCapacity(int i11);
    }

    static {
        Charset.forName("US-ASCII");
        f42628a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f42629b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC5363i.d(bArr, 0, 0, false);
    }

    static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j11) {
        return (int) (j11 ^ (j11 >>> 32));
    }
}
