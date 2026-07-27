package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfdq implements zzinw {
    private final zziof zza;

    private zzfdq(zziof zziofVar, zziof zziofVar2) {
        this.zza = zziofVar;
    }

    public static zzfdq zzc(zziof zziofVar, zziof zziofVar2) {
        return new zzfdq(zziofVar, zziofVar2);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfdo zzb() {
        return new zzfdo(((zzcok) this.zza).zza(), zzfoy.zzc());
    }
}
