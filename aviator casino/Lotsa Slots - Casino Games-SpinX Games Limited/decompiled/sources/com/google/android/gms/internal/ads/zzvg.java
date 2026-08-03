package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzvg {
    public final com.google.android.gms.internal.ads.zzvm zza;
    public final android.media.MediaFormat zzb;
    public final com.google.android.gms.internal.ads.zzv zzc;
    public final android.view.Surface zzd;
    public final android.media.MediaCrypto zze = null;
    public final com.google.android.gms.internal.ads.zzvf zzf;

    private zzvg(com.google.android.gms.internal.ads.zzvm zzvmVar, android.media.MediaFormat mediaFormat, com.google.android.gms.internal.ads.zzv zzvVar, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, com.google.android.gms.internal.ads.zzvf zzvfVar) {
        this.zza = zzvmVar;
        this.zzb = mediaFormat;
        this.zzc = zzvVar;
        this.zzd = surface;
        this.zzf = zzvfVar;
    }

    public static com.google.android.gms.internal.ads.zzvg zza(com.google.android.gms.internal.ads.zzvm zzvmVar, android.media.MediaFormat mediaFormat, com.google.android.gms.internal.ads.zzv zzvVar, android.media.MediaCrypto mediaCrypto, com.google.android.gms.internal.ads.zzvf zzvfVar) {
        return new com.google.android.gms.internal.ads.zzvg(zzvmVar, mediaFormat, zzvVar, null, null, zzvfVar);
    }

    public static com.google.android.gms.internal.ads.zzvg zzb(com.google.android.gms.internal.ads.zzvm zzvmVar, android.media.MediaFormat mediaFormat, com.google.android.gms.internal.ads.zzv zzvVar, android.view.Surface surface, android.media.MediaCrypto mediaCrypto) {
        return new com.google.android.gms.internal.ads.zzvg(zzvmVar, mediaFormat, zzvVar, surface, null, null);
    }
}
