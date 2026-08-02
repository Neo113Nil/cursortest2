package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcif implements zzeyk {
    private final zzchl zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzr zzd;

    public /* synthetic */ zzcif(zzchl zzchlVar, zzcip zzcipVar) {
        this.zza = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyk
    public final /* bridge */ /* synthetic */ zzeyk zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.zzd = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyk
    public final /* bridge */ /* synthetic */ zzeyk zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyk
    public final /* bridge */ /* synthetic */ zzeyk zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyk
    public final zzeyl zzd() {
        zzheo.zzc(this.zzb, Context.class);
        zzheo.zzc(this.zzc, String.class);
        zzheo.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzr.class);
        return new zzcig(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
