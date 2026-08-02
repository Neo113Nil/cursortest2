package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C0875q;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzpc {
    com.google.android.gms.internal.measurement.zzid zza;
    List zzb;
    List zzc;
    long zzd;
    final /* synthetic */ zzpg zze;

    public /* synthetic */ zzpc(zzpg zzpgVar, byte[] bArr) {
        Objects.requireNonNull(zzpgVar);
        this.zze = zzpgVar;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        return ((zzhsVar.zzf() / 1000) / 60) / 60;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r2 < com.google.android.gms.measurement.internal.zzal.zzG()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r2 >= com.google.android.gms.measurement.internal.zzal.zzG()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zza(long j, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        C0875q.g(zzhsVar);
        if (this.zzc == null) {
            this.zzc = new ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new ArrayList();
        }
        if (this.zzc.isEmpty() || zzb((com.google.android.gms.internal.measurement.zzhs) this.zzc.get(0)) == zzb(zzhsVar)) {
            long zzcn = this.zzd + zzhsVar.zzcn();
            zzpg zzpgVar = this.zze;
            if (zzpgVar.zzd().zzp(null, zzfy.zzbd)) {
                if (!this.zzc.isEmpty()) {
                    zzpgVar.zzd();
                }
                this.zzd = zzcn;
                this.zzc.add(zzhsVar);
                this.zzb.add(Long.valueOf(j));
                int size = this.zzc.size();
                zzpgVar.zzd();
                if (size < Math.max(1, ((Integer) zzfy.zzj.zzb(null)).intValue())) {
                    return true;
                }
            } else {
                zzpgVar.zzd();
            }
        }
        return false;
    }
}
