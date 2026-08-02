package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import android.os.Parcelable;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class zzfco implements zzfcn {
    private final ConcurrentHashMap zza;
    private final zzfcu zzb;
    private final zzfcq zzc = new zzfcq();

    public zzfco(zzfcu zzfcuVar) {
        this.zza = new ConcurrentHashMap(zzfcuVar.zzd);
        this.zzb = zzfcuVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfcu> creator = zzfcu.CREATOR;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgm)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i7 = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i7++;
                sb.append(i7);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfcx) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i8 = 0; i8 < ((zzfcm) entry.getValue()).zzb(); i8++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzfcm) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfcm) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i7 < this.zzb.zzc) {
                i7++;
                sb.append(i7);
                sb.append(".\n");
            }
            String sb2 = sb.toString();
            int i9 = J.f3546b;
            j.b(sb2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfcn
    public final zzfcu zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfcn
    public final synchronized zzfcw zzb(zzfcx zzfcxVar) {
        zzfcw zzfcwVar;
        try {
            zzfcm zzfcmVar = (zzfcm) this.zza.get(zzfcxVar);
            if (zzfcmVar != null) {
                zzfcwVar = zzfcmVar.zze();
                if (zzfcwVar == null) {
                    this.zzc.zze();
                }
                zzfdk zzf = zzfcmVar.zzf();
                if (zzfcwVar != null) {
                    zzbbd.zzb.zzc zzd = zzbbd.zzb.zzd();
                    zzbbd.zzb.zza.C0003zza zza = zzbbd.zzb.zza.zza();
                    zza.zzf(zzbbd.zzb.zzd.IN_MEMORY);
                    zzbbd.zzb.zze.zza zzb = zzbbd.zzb.zze.zzb();
                    zzb.zzd(zzf.zza);
                    zzb.zze(zzf.zzb);
                    zza.zzg(zzb);
                    zzd.zzd(zza);
                    zzfcwVar.zza.zzb().zzc().zzi(zzd.zzbr());
                }
                zzf();
            } else {
                this.zzc.zzf();
                zzf();
                zzfcwVar = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcn
    @Deprecated
    public final zzfcx zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        return new zzfcy(zzmVar, str, new zzbur(this.zzb.zza).zza().zzj, this.zzb.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfcn
    public final synchronized boolean zzd(zzfcx zzfcxVar, zzfcw zzfcwVar) {
        boolean zzh;
        try {
            zzfcm zzfcmVar = (zzfcm) this.zza.get(zzfcxVar);
            o.f1952C.j.getClass();
            zzfcwVar.zzd = System.currentTimeMillis();
            if (zzfcmVar == null) {
                zzfcu zzfcuVar = this.zzb;
                zzfcm zzfcmVar2 = new zzfcm(zzfcuVar.zzd, zzfcuVar.zze * zzbbd.zzq.zzf);
                if (this.zza.size() == this.zzb.zzc) {
                    int i7 = this.zzb.zzg;
                    int i8 = i7 - 1;
                    zzfcx zzfcxVar2 = null;
                    if (i7 == 0) {
                        throw null;
                    }
                    long j = Long.MAX_VALUE;
                    if (i8 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfcm) entry.getValue()).zzc() < j) {
                                j = ((zzfcm) entry.getValue()).zzc();
                                zzfcxVar2 = (zzfcx) entry.getKey();
                            }
                        }
                        if (zzfcxVar2 != null) {
                            this.zza.remove(zzfcxVar2);
                        }
                    } else if (i8 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfcm) entry2.getValue()).zzd() < j) {
                                j = ((zzfcm) entry2.getValue()).zzd();
                                zzfcxVar2 = (zzfcx) entry2.getKey();
                            }
                        }
                        if (zzfcxVar2 != null) {
                            this.zza.remove(zzfcxVar2);
                        }
                    } else if (i8 == 2) {
                        int i9 = f.API_PRIORITY_OTHER;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfcm) entry3.getValue()).zza() < i9) {
                                i9 = ((zzfcm) entry3.getValue()).zza();
                                zzfcxVar2 = (zzfcx) entry3.getKey();
                            }
                        }
                        if (zzfcxVar2 != null) {
                            this.zza.remove(zzfcxVar2);
                        }
                    }
                    this.zzc.zzg();
                }
                this.zza.put(zzfcxVar, zzfcmVar2);
                this.zzc.zzd();
                zzfcmVar = zzfcmVar2;
            }
            zzh = zzfcmVar.zzh(zzfcwVar);
            this.zzc.zzc();
            zzfcp zza = this.zzc.zza();
            zzfdk zzf = zzfcmVar.zzf();
            zzbbd.zzb.zzc zzd = zzbbd.zzb.zzd();
            zzbbd.zzb.zza.C0003zza zza2 = zzbbd.zzb.zza.zza();
            zza2.zzf(zzbbd.zzb.zzd.IN_MEMORY);
            zzbbd.zzb.zzg.zza zzb = zzbbd.zzb.zzg.zzb();
            zzb.zze(zza.zza);
            zzb.zzf(zza.zzb);
            zzb.zzg(zzf.zzb);
            zza2.zzi(zzb);
            zzd.zzd(zza2);
            zzfcwVar.zza.zzb().zzc().zzj(zzd.zzbr());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfcn
    public final synchronized boolean zze(zzfcx zzfcxVar) {
        zzfcm zzfcmVar = (zzfcm) this.zza.get(zzfcxVar);
        if (zzfcmVar == null) {
            return true;
        }
        return zzfcmVar.zzb() < this.zzb.zzd;
    }
}
