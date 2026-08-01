package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdfg implements zzinw {
    private final zziof zza;

    private zzdfg(zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdfg zzc(zziof zziofVar) {
        return new zzdfg(zziofVar);
    }

    public static zzdff zzd(Set set) {
        return new zzdff(set);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdff zzb() {
        return new zzdff(((zzioi) this.zza).zzb());
    }
}
