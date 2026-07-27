package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdxx {
    private final Map zza = new HashMap();

    zzdxx() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zza(String str, @Nullable zzfmu zzfmuVar) {
        zzbyi zzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbyi zzbyiVar = null;
        if (zzfmuVar != null) {
            try {
                zzB = zzfmuVar.zzB();
            } catch (zzfmd unused) {
            }
            if (zzfmuVar != null) {
                try {
                    zzbyiVar = zzfmuVar.zzC();
                } catch (zzfmd unused2) {
                }
            }
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkS)).booleanValue()) {
                if (zzfmuVar != null) {
                    try {
                        zzfmuVar.zzn();
                    } catch (zzfmd unused3) {
                    }
                }
                z = false;
            }
            this.zza.put(str, new zzdxw(str, zzB, zzbyiVar, z));
        }
        zzB = null;
        if (zzfmuVar != null) {
        }
        boolean z2 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkS)).booleanValue()) {
        }
        this.zza.put(str, new zzdxw(str, zzB, zzbyiVar, z2));
    }

    final synchronized void zzb(String str, zzbxt zzbxtVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdxw(str, zzbxtVar.zzf(), zzbxtVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzdxw zzc(String str) {
        return (zzdxw) this.zza.get(str);
    }

    public final String zzd(String str) {
        zzbyi zzbyiVar;
        zzdxw zzc = zzc(str);
        return (zzc == null || (zzbyiVar = zzc.zzb) == null) ? "" : zzbyiVar.toString();
    }
}
