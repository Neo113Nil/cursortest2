package Rb;

import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f24967a;

    /* renamed from: Rb.a$a, reason: collision with other inner class name */
    public static final class C0495a {
        public static a a(byte[] input) {
            a output = new a();
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(output, "output");
            C7705l.o(0, 0, 32, input, output.b());
            output.b()[31] = (byte) (output.b()[31] & Byte.MAX_VALUE);
            return output;
        }
    }

    public a() {
        byte[] data = new byte[32];
        Intrinsics.checkNotNullParameter(data, "data");
        this.f24967a = data;
    }

    public static byte[] c(a aVar) {
        byte[] output = new byte[64];
        Intrinsics.checkNotNullParameter(output, "output");
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            int i13 = i12 * 2;
            byte[] bArr = aVar.f24967a;
            output[i13] = (byte) (bArr[i12] & 15);
            output[i13 + 1] = (byte) ((bArr[i12] >>> 4) & 15);
        }
        while (i11 < 63) {
            byte b11 = output[i11];
            int i14 = (b11 + 8) >> 4;
            output[i11] = (byte) (b11 - (i14 << 4));
            i11++;
            output[i11] = (byte) (output[i11] + i14);
        }
        return output;
    }

    @NotNull
    public final byte[] a() {
        byte[] bArr = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr[i11] = (byte) ((this.f24967a[i11 >> 3] >> (i11 & 7)) & 1);
        }
        return bArr;
    }

    @NotNull
    public final byte[] b() {
        return this.f24967a;
    }
}
