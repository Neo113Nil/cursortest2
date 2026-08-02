package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzchp implements zzevf {
    private final zzchl zza;
    private Context zzb;
    private String zzc;

    public /* synthetic */ zzchp(zzchl zzchlVar, zzcip zzcipVar) {
        this.zza = zzchlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevf
    public final /* bridge */ /* synthetic */ zzevf zza(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzevf
    public final /* bridge */ /* synthetic */ zzevf zzb(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzevf
    public final zzevg zzc() {
        zzheo.zzc(this.zzb, Context.class);
        zzheo.zzc(this.zzc, String.class);
        return new zzchq(this.zza, this.zzb, this.zzc);
    }
}
