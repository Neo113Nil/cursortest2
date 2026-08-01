package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcok implements zzinw {
    private final zzcod zza;

    private zzcok(zzcod zzcodVar) {
        this.zza = zzcodVar;
    }

    public static zzcok zzc(zzcod zzcodVar) {
        return new zzcok(zzcodVar);
    }

    public static Context zzd(zzcod zzcodVar) {
        Context zza = zzcodVar.zza();
        zzioe.zzb(zza);
        return zza;
    }

    public final Context zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
