package com.google.android.gms.internal.ads;

import I2.C0303k;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public final class zzcti implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzcti(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel zza = ((zzcgw) this.zzb).zza();
        final zzfba zza2 = ((zzcuh) this.zzc).zza();
        return new zzfsw() { // from class: com.google.android.gms.internal.ads.zzcth
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                zzfaf zzfafVar = (zzfaf) obj;
                C0303k c0303k = new C0303k(context);
                c0303k.f3616c = zzfafVar.zzB;
                c0303k.f3619f = zzfafVar.zzC.toString();
                c0303k.f3618e = zza.f10834a;
                c0303k.f3617d = zza2.zzf;
                return c0303k;
            }
        };
    }
}
