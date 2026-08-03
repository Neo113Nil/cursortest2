package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgoo implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzgoo(com.google.android.gms.internal.ads.zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzgoo zza(com.google.android.gms.internal.ads.zzind zzindVar) {
        return new com.google.android.gms.internal.ads.zzgoo(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        return new java.io.File(new java.io.File((java.io.File) this.zza.zzb(), "ocs"), "pmtd");
    }
}
