package b9;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: b9.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C5587b {
    @KeepForSdk
    public static int a(int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 90) {
            return 1;
        }
        if (i11 == 180) {
            return 2;
        }
        if (i11 == 270) {
            return 3;
        }
        throw new IllegalArgumentException(Ej.b.a(i11, "Invalid rotation: "));
    }
}
