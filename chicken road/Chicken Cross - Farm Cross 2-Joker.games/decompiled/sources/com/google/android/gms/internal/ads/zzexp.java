package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzexp implements zzinw {
    private final zziof zza;

    private zzexp(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar2;
    }

    public static zzexp zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzexp(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexn zzb() {
        return new zzexn(zzfoy.zzc(), ((zzcok) this.zza).zza());
    }
}
