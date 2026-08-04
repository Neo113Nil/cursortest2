package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
final class zzhb {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void zza(zzhb zzhbVar, int i7, int i8) {
        zzhbVar.zzb.set(i7, i8);
        zzhbVar.zza.setPattern(zzhbVar.zzb);
    }
}
