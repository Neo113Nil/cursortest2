package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzewa implements zzfdi {
    private final zzhdi zza;
    private final zzdya zzb;
    private final zzecu zzc;
    private final zzewc zzd;

    public zzewa(zzhdi zzhdiVar, zzdya zzdyaVar, zzecu zzecuVar, zzewc zzewcVar) {
        this.zza = zzhdiVar;
        this.zzb = zzdyaVar;
        this.zzc = zzecuVar;
        this.zzd = zzewcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        zzbix zzbixVar = zzbjg.zzno;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue()) {
            zzewc zzewcVar = this.zzd;
            if (zzewcVar.zzd() != null) {
                zzewb zzd = zzewcVar.zzd();
                zzd.getClass();
                return zzhcy.zza(zzd);
            }
        }
        if (zzgvb.zzc((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzch)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzhcy.zza(new zzewb(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzewa.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 1;
    }

    final /* synthetic */ zzewb zzc() {
        List<String> asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzch)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                zzfmu zza = this.zzb.zza(str, new JSONObject());
                zza.zzn();
                boolean zze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzno)).booleanValue() || zze) {
                    try {
                        zzbyi zzC = zza.zzC();
                        if (zzC != null) {
                            bundle2.putString("sdk_version", zzC.toString());
                        }
                    } catch (zzfmd unused) {
                    }
                }
                try {
                    zzbyi zzB = zza.zzB();
                    if (zzB != null) {
                        bundle2.putString("adapter_version", zzB.toString());
                    }
                } catch (zzfmd unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfmd unused3) {
            }
        }
        zzewb zzewbVar = new zzewb(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzno)).booleanValue()) {
            this.zzd.zzc(zzewbVar);
        }
        return zzewbVar;
    }
}
