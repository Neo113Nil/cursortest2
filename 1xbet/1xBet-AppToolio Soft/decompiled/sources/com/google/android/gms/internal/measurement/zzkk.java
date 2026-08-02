package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkk extends zzacd<zzkk> {
    private static volatile zzkk[] zzaub;
    public Integer zzatk = null;
    public String zzauc = null;
    public zzki zzaud = null;

    public zzkk() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkk[] zzlt() {
        if (zzaub == null) {
            synchronized (zzach.zzbzn) {
                if (zzaub == null) {
                    zzaub = new zzkk[0];
                }
            }
        }
        return zzaub;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkk)) {
            return false;
        }
        zzkk zzkkVar = (zzkk) obj;
        Integer num = this.zzatk;
        if (num == null) {
            if (zzkkVar.zzatk != null) {
                return false;
            }
        } else if (!num.equals(zzkkVar.zzatk)) {
            return false;
        }
        String str = this.zzauc;
        if (str == null) {
            if (zzkkVar.zzauc != null) {
                return false;
            }
        } else if (!str.equals(zzkkVar.zzauc)) {
            return false;
        }
        zzki zzkiVar = this.zzaud;
        if (zzkiVar == null) {
            if (zzkkVar.zzaud != null) {
                return false;
            }
        } else if (!zzkiVar.equals(zzkkVar.zzaud)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkkVar.zzbzd == null || zzkkVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkkVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.zzatk;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.zzauc;
        int hashCode3 = hashCode2 + (str == null ? 0 : str.hashCode());
        zzki zzkiVar = this.zzaud;
        int hashCode4 = ((hashCode3 * 31) + (zzkiVar == null ? 0 : zzkiVar.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        Integer num = this.zzatk;
        if (num != null) {
            zza += zzacb.zzf(1, num.intValue());
        }
        String str = this.zzauc;
        if (str != null) {
            zza += zzacb.zzc(2, str);
        }
        zzki zzkiVar = this.zzaud;
        return zzkiVar != null ? zza + zzacb.zzb(3, zzkiVar) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        Integer num = this.zzatk;
        if (num != null) {
            zzacbVar.zze(1, num.intValue());
        }
        String str = this.zzauc;
        if (str != null) {
            zzacbVar.zzb(2, str);
        }
        zzki zzkiVar = this.zzaud;
        if (zzkiVar != null) {
            zzacbVar.zza(3, zzkiVar);
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
                this.zzatk = Integer.valueOf(zzacaVar.zzvn());
            } else if (zzvl == 18) {
                this.zzauc = zzacaVar.readString();
            } else if (zzvl == 26) {
                if (this.zzaud == null) {
                    this.zzaud = new zzki();
                }
                zzacaVar.zza(this.zzaud);
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
