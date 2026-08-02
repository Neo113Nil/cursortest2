package L;

import androidx.annotation.NonNull;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final LargeJpegImageQuirk f16060a = (LargeJpegImageQuirk) androidx.camera.core.internal.compat.quirk.a.b(LargeJpegImageQuirk.class);

    public final int a(@NonNull byte[] bArr) {
        int i11;
        byte b11;
        if (this.f16060a == null || !LargeJpegImageQuirk.g(bArr)) {
            return bArr.length;
        }
        int i12 = 2;
        while (true) {
            if (i12 + 4 > bArr.length || (b11 = bArr[i12]) != -1) {
                break;
            }
            int i13 = i12 + 2;
            int i14 = ((bArr[i13] & 255) << 8) | (bArr[i12 + 3] & 255);
            if (b11 == -1 && bArr[i12 + 1] == -38) {
                while (true) {
                    i11 = i13 + 2;
                    if (i11 <= bArr.length) {
                        if (bArr[i13] == -1 && bArr[i13 + 1] == -39) {
                            break;
                        }
                        i13++;
                    } else {
                        break;
                    }
                }
            } else {
                i12 += i14 + 2;
            }
        }
        i11 = -1;
        return i11 != -1 ? i11 : bArr.length;
    }
}
