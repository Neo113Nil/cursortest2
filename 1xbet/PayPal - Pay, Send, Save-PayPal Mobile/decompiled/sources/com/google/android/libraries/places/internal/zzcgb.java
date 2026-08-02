package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcgb {
    public static final int zza(com.google.android.libraries.places.internal.zzcfs zzcfsVar, int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzcfsVar, "");
        int[] zzr = zzcfsVar.zzr();
        int length = zzcfsVar.zzq().length;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzr, "");
        int i3 = length - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= i3) {
                int i5 = i + 1;
                i2 = (i4 + i3) >>> 1;
                int i6 = zzr[i2];
                if (i6 >= i5) {
                    if (i6 <= i5) {
                        break;
                    }
                    i3 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }
}
