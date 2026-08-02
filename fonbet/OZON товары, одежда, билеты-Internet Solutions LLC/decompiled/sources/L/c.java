package L;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.I0;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.p;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final IncorrectJpegMetadataQuirk f16061a;

    public c(@NonNull I0 i02) {
        this.f16061a = (IncorrectJpegMetadataQuirk) i02.b(IncorrectJpegMetadataQuirk.class);
    }

    @NonNull
    public final byte[] a(@NonNull p pVar) {
        byte b11;
        int i11 = 0;
        IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = this.f16061a;
        if (incorrectJpegMetadataQuirk == null) {
            ByteBuffer f7 = pVar.c0()[0].f();
            byte[] bArr = new byte[f7.capacity()];
            f7.rewind();
            f7.get(bArr);
            return bArr;
        }
        incorrectJpegMetadataQuirk.getClass();
        ByteBuffer f11 = pVar.c0()[0].f();
        int capacity = f11.capacity();
        byte[] bArr2 = new byte[capacity];
        f11.rewind();
        f11.get(bArr2);
        int i12 = 2;
        for (int i13 = 2; i13 + 4 <= capacity && (b11 = bArr2[i13]) == -1; i13 += (((bArr2[i13 + 2] & 255) << 8) | (bArr2[i13 + 3] & 255)) + 2) {
            if (b11 == -1 && bArr2[i13 + 1] == -38) {
                break;
            }
        }
        while (true) {
            int i14 = i12 + 1;
            if (i14 > capacity) {
                i11 = -1;
                break;
            }
            if (bArr2[i12] == -1 && bArr2[i14] == -40) {
                i11 = i12;
                break;
            }
            i12 = i14;
        }
        if (i11 == -1) {
            return bArr2;
        }
        return Arrays.copyOfRange(bArr2, i11, f11.limit());
    }
}
