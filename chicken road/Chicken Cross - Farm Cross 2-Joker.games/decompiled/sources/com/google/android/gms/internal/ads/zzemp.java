package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzemp implements zzinw {
    private final zziof zza;

    private zzemp(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzemp zzc(zziof zziofVar) {
        return new zzemp(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzemo zzb() {
        return new zzemo(((zzcok) this.zza).zza());
    }
}
