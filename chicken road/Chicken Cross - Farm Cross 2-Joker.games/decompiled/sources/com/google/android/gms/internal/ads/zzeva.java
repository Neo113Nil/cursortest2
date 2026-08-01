package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeva implements zzinw {
    private final zziof zza;

    private zzeva(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzeva zzc(zziof zziofVar) {
        return new zzeva(zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeuy zzb() {
        return new zzeuy(((zzcok) this.zza).zza());
    }
}
