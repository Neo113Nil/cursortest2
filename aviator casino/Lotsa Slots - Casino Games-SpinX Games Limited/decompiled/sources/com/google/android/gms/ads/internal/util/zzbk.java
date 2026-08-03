package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzbk extends com.google.android.gms.internal.ads.zzate {
    private final com.google.android.gms.internal.ads.zzcfw zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(java.lang.String str, java.util.Map map, com.google.android.gms.internal.ads.zzcfw zzcfwVar) {
        super(0, str, new com.google.android.gms.ads.internal.util.zzbj(zzcfwVar));
        this.zza = zzcfwVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzate
    protected final com.google.android.gms.internal.ads.zzatk zzr(com.google.android.gms.internal.ads.zzata zzataVar) {
        return com.google.android.gms.internal.ads.zzatk.zza(zzataVar, com.google.android.gms.internal.ads.zzaub.zza(zzataVar));
    }

    @Override // com.google.android.gms.internal.ads.zzate
    protected final /* bridge */ /* synthetic */ void zzs(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzata zzataVar = (com.google.android.gms.internal.ads.zzata) obj;
        java.util.Map map = zzataVar.zzc;
        int i = zzataVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i);
        byte[] bArr = zzataVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzataVar);
    }
}
