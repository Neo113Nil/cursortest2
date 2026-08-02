package G;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes8.dex */
final class i {

    /* renamed from: d, reason: collision with root package name */
    static final Charset f9612d = StandardCharsets.US_ASCII;

    /* renamed from: e, reason: collision with root package name */
    static final String[] f9613e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f9614f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: a, reason: collision with root package name */
    public final int f9615a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9616b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9617c;

    i(int i11, int i12, byte[] bArr) {
        this.f9615a = i11;
        this.f9616b = i12;
        this.f9617c = bArr;
    }

    @NonNull
    public static i a(long j11, @NonNull ByteOrder byteOrder) {
        return b(new long[]{j11}, byteOrder);
    }

    @NonNull
    public static i b(@NonNull long[] jArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[f9614f[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j11 : jArr) {
            wrap.putInt((int) j11);
        }
        return new i(4, jArr.length, wrap.array());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(f9613e[this.f9615a]);
        sb2.append(", data length:");
        return K00.b.e(this.f9617c.length, ")", sb2);
    }
}
