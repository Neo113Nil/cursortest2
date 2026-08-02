package com.google.android.odml.image;

/* loaded from: classes9.dex */
final /* synthetic */ class zzd {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[android.graphics.Bitmap.Config.values().length];
        zza = iArr;
        try {
            iArr[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            zza[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
    }
}
