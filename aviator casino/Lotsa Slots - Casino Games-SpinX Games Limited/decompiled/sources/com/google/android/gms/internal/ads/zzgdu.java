package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgdu implements com.google.android.gms.internal.ads.zzggx {
    private final com.google.android.gms.internal.ads.zzgdl zza;
    private final com.google.android.gms.internal.ads.zzgdr zzb;
    private android.content.Context zzc;
    private android.view.View zzd;
    private android.app.Activity zze;
    private java.lang.String zzf;
    private java.util.Map zzg;
    private com.google.android.gms.internal.ads.zzaxm zzh;
    private com.google.android.gms.internal.ads.zzgec zzi;

    /* synthetic */ zzgdu(com.google.android.gms.internal.ads.zzgdl zzgdlVar, com.google.android.gms.internal.ads.zzgdr zzgdrVar, byte[] bArr) {
        this.zza = zzgdlVar;
        this.zzb = zzgdrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggx
    public final com.google.android.gms.internal.ads.zzggy zza() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzc, android.content.Context.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzg, java.util.Map.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzh, com.google.android.gms.internal.ads.zzaxm.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzi, com.google.android.gms.internal.ads.zzgec.class);
        return new com.google.android.gms.internal.ads.zzgdv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzggx
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzggx zzd(java.util.Map map) {
        this.zzg = map;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggx
    public final /* synthetic */ com.google.android.gms.internal.ads.zzggx zze(java.lang.String str) {
        this.zzf = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggx
    public final /* synthetic */ com.google.android.gms.internal.ads.zzggx zzf(android.app.Activity activity) {
        this.zze = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggx
    public final /* synthetic */ com.google.android.gms.internal.ads.zzggx zzg(android.view.View view) {
        this.zzd = view;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggx
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzggx zzb(com.google.android.gms.internal.ads.zzgec zzgecVar) {
        zzgecVar.getClass();
        this.zzi = zzgecVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggx
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzggx zzc(com.google.android.gms.internal.ads.zzaxm zzaxmVar) {
        zzaxmVar.getClass();
        this.zzh = zzaxmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzggx
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzggx zzh(android.content.Context context) {
        context.getClass();
        this.zzc = context;
        return this;
    }
}
