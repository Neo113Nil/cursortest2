package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkq extends zzacd<zzkq> {
    private static volatile zzkq[] zzauw;
    public Integer zzaux = null;
    public Long zzauy = null;

    public zzkq() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkq[] zzlx() {
        if (zzauw == null) {
            synchronized (zzach.zzbzn) {
                if (zzauw == null) {
                    zzauw = new zzkq[0];
                }
            }
        }
        return zzauw;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkq)) {
            return false;
        }
        zzkq zzkqVar = (zzkq) obj;
        Integer num = this.zzaux;
        if (num == null) {
            if (zzkqVar.zzaux != null) {
                return false;
            }
        } else if (!num.equals(zzkqVar.zzaux)) {
            return false;
        }
        Long l = this.zzauy;
        if (l == null) {
            if (zzkqVar.zzauy != null) {
                return false;
            }
        } else if (!l.equals(zzkqVar.zzauy)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkqVar.zzbzd == null || zzkqVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkqVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.zzaux;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.zzauy;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        Integer num = this.zzaux;
        if (num != null) {
            zza += zzacb.zzf(1, num.intValue());
        }
        Long l = this.zzauy;
        return l != null ? zza + zzacb.zzc(2, l.longValue()) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        Integer num = this.zzaux;
        if (num != null) {
            zzacbVar.zze(1, num.intValue());
        }
        Long l = this.zzauy;
        if (l != null) {
            zzacbVar.zzb(2, l.longValue());
        }
        super.zza(zzacbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final /* synthetic */ zzacj zzb(zzaca zzacaVar) throws IOException {
        while (true) {
            int zzvl = zzacaVar.zzvl();
            if (zzvl == 0) {
                return this;
            }
            if (zzvl == 8) {
                this.zzaux = Integer.valueOf(zzacaVar.zzvn());
            } else if (zzvl == 16) {
                this.zzauy = Long.valueOf(zzacaVar.zzvo());
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
