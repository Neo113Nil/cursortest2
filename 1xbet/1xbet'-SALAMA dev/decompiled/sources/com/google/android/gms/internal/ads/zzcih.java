package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class zzcih implements zzezy {
    private final zzchl zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzcih(zzchl zzchlVar, zzcip zzcipVar) {
        this.zza = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezy
    public final /* synthetic */ zzezy zza(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezy
    public final /* bridge */ /* synthetic */ zzezy zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzezy
    public final zzezz zzc() {
        zzheo.zzc(this.zzb, Context.class);
        return new zzcii(this.zza, this.zzb, this.zzc);
    }
}
