package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzdcu;
import com.google.android.gms.internal.ads.zzdcv;
import com.google.android.gms.internal.ads.zzdml;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqc;
import com.google.android.gms.internal.ads.zzfqi;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzinw;
import com.google.android.gms.internal.ads.zziof;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzay implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;

    private zzay(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
    }

    public static zzay zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzay(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfqi zzfqiVar = (zzfqi) this.zza.zzb();
        zzba zzb = ((zzbb) this.zzb).zzb();
        zzdcu zzb2 = ((zzdcv) this.zzc).zzb();
        zzdml zzdmlVar = (zzdml) this.zzd.zzb();
        zzfpp zzi = zzfqiVar.zza(zzfqc.GENERATE_SIGNALS, zzb2.zzb()).zzc(zzb).zzh(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgJ)).intValue(), TimeUnit.SECONDS).zzi();
        zzhcy.zzr(zzi, new zzar(zzdmlVar), zzcgj.zza);
        return zzi;
    }
}
