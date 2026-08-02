package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzchu implements zzewt {
    private final zzchl zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    public /* synthetic */ zzchu(zzchl zzchlVar, zzcip zzcipVar) {
        this.zza = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final /* bridge */ /* synthetic */ zzewt zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final /* bridge */ /* synthetic */ zzewt zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final /* bridge */ /* synthetic */ zzewt zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzewt
    public final zzewu zzd() {
        zzheo.zzc(this.zzb, Context.class);
        zzheo.zzc(this.zzc, String.class);
        zzheo.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzchv(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
