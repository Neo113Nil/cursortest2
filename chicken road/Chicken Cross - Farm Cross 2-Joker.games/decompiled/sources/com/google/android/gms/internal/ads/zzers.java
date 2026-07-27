package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzers implements zzemq {
    private final zzems zza;
    private final zzemw zzb;
    private final zzfqi zzc;
    private final zzhdi zzd;

    public zzers(zzfqi zzfqiVar, zzhdi zzhdiVar, zzems zzemsVar, zzemw zzemwVar) {
        this.zzc = zzfqiVar;
        this.zzd = zzhdiVar;
        this.zzb = zzemwVar;
        this.zza = zzemsVar;
    }

    static final String zze(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final boolean zza(zzflo zzfloVar, zzfld zzfldVar) {
        return !zzfldVar.zzt.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzemq
    public final ListenableFuture zzb(final zzflo zzfloVar, final zzfld zzfldVar) {
        final zzemt zzemtVar;
        Iterator it = zzfldVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzemtVar = null;
                break;
            }
            try {
                zzemtVar = this.zza.zza((String) it.next(), zzfldVar.zzv);
                break;
            } catch (zzfmd unused) {
            }
        }
        if (zzemtVar == null) {
            return zzhcy.zzc(new zzepj("Unable to instantiate mediation adapter class."));
        }
        zzcgo zzcgoVar = new zzcgo();
        zzemtVar.zzc.zza(new zzerp(this, zzemtVar, zzcgoVar));
        if (zzfldVar.zzM) {
            Bundle bundle = zzfloVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfqi zzfqiVar = this.zzc;
        zzfqc zzfqcVar = zzfqc.ADAPTER_LOAD_AD_SYN;
        Objects.requireNonNull(zzfqiVar);
        return zzfpt.zzd(new zzfpo() { // from class: com.google.android.gms.internal.ads.zzerr
            @Override // com.google.android.gms.internal.ads.zzfpo
            public final /* synthetic */ void zza() {
                zzers.this.zzc(zzfloVar, zzfldVar, zzemtVar);
            }
        }, this.zzd, zzfqcVar, zzfqiVar).zzj(zzfqc.ADAPTER_LOAD_AD_ACK).zze(zzcgoVar).zzj(zzfqc.ADAPTER_WRAP_ADAPTER).zzb(new zzfpi() { // from class: com.google.android.gms.internal.ads.zzerq
            @Override // com.google.android.gms.internal.ads.zzfpi
            public final /* synthetic */ Object zza(Object obj) {
                return zzers.this.zzd(zzfloVar, zzfldVar, zzemtVar, (Void) obj);
            }
        }).zzi();
    }

    final /* synthetic */ void zzc(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar) {
        this.zzb.zza(zzfloVar, zzfldVar, zzemtVar);
    }

    final /* synthetic */ Object zzd(zzflo zzfloVar, zzfld zzfldVar, zzemt zzemtVar, Void r4) {
        return this.zzb.zzb(zzfloVar, zzfldVar, zzemtVar);
    }
}
