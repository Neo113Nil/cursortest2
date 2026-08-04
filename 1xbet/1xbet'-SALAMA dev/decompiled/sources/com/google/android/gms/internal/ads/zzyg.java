package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzyg {
    public final zzbo zza;
    public final int[] zzb;

    public zzyg(zzbo zzboVar, int[] iArr, int i7) {
        if (iArr.length == 0) {
            zzdq.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzboVar;
        this.zzb = iArr;
    }
}
