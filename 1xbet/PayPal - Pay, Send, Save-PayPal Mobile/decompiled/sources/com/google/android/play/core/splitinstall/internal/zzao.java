package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzao {
    public static com.google.android.play.core.splitinstall.internal.zzan zza() {
        int i = android.os.Build.VERSION.SDK_INT;
        return i != 26 ? (i == 27 && android.os.Build.VERSION.PREVIEW_SDK_INT == 0) ? new com.google.android.play.core.splitinstall.internal.zzbe() : new com.google.android.play.core.splitinstall.internal.zzbg() : new com.google.android.play.core.splitinstall.internal.zzbd();
    }
}
