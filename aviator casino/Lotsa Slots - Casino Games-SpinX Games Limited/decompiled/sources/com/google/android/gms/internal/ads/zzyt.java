package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzyt implements com.google.android.gms.internal.ads.zzxj {
    private final com.google.android.gms.internal.ads.zzho zza;
    private final com.google.android.gms.internal.ads.zzyc zzb;
    private int zzc;
    private final com.google.android.gms.internal.ads.zzabu zzd;

    public zzyt(com.google.android.gms.internal.ads.zzho zzhoVar, final com.google.android.gms.internal.ads.zzage zzageVar) {
        com.google.android.gms.internal.ads.zzyc zzycVar = new com.google.android.gms.internal.ads.zzyc() { // from class: com.google.android.gms.internal.ads.zzys
            @Override // com.google.android.gms.internal.ads.zzyc
            public final /* synthetic */ com.google.android.gms.internal.ads.zzyd zza(com.google.android.gms.internal.ads.zzqf zzqfVar) {
                return new com.google.android.gms.internal.ads.zzwm(com.google.android.gms.internal.ads.zzage.this);
            }
        };
        com.google.android.gms.internal.ads.zzabu zzabuVar = new com.google.android.gms.internal.ads.zzabu(-1);
        this.zza = zzhoVar;
        this.zzb = zzycVar;
        this.zzd = zzabuVar;
        this.zzc = 1048576;
    }

    public final com.google.android.gms.internal.ads.zzyt zza(int i) {
        this.zzc = i;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzyu zzb(com.google.android.gms.internal.ads.zzak zzakVar) {
        com.google.android.gms.internal.ads.zzag zzagVar = zzakVar.zzb;
        zzagVar.getClass();
        com.google.android.gms.internal.ads.zzho zzhoVar = this.zza;
        com.google.android.gms.internal.ads.zzyc zzycVar = this.zzb;
        zzagVar.getClass();
        return new com.google.android.gms.internal.ads.zzyu(zzakVar, zzhoVar, zzycVar, com.google.android.gms.internal.ads.zzun.zza, this.zzd, this.zzc, false, 0, null, null, null);
    }
}
