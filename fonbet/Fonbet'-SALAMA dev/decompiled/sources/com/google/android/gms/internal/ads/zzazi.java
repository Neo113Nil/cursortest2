package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class zzazi implements Comparator {
    public zzazi(zzazj zzazjVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzayx zzayxVar = (zzayx) obj;
        zzayx zzayxVar2 = (zzayx) obj2;
        if (zzayxVar.zzd() < zzayxVar2.zzd()) {
            return -1;
        }
        if (zzayxVar.zzd() <= zzayxVar2.zzd()) {
            if (zzayxVar.zzb() < zzayxVar2.zzb()) {
                return -1;
            }
            if (zzayxVar.zzb() <= zzayxVar2.zzb()) {
                float zza = (zzayxVar.zza() - zzayxVar.zzd()) * (zzayxVar.zzc() - zzayxVar.zzb());
                float zza2 = (zzayxVar2.zza() - zzayxVar2.zzd()) * (zzayxVar2.zzc() - zzayxVar2.zzb());
                if (zza > zza2) {
                    return -1;
                }
                if (zza >= zza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
