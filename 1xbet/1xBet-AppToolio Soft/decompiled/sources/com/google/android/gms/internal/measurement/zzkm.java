package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkm extends zzacd<zzkm> {
    private static volatile zzkm[] zzaui;
    public String name = null;
    public Boolean zzauj = null;
    public Boolean zzauk = null;
    public Integer zzaul = null;

    public zzkm() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkm[] zzlu() {
        if (zzaui == null) {
            synchronized (zzach.zzbzn) {
                if (zzaui == null) {
                    zzaui = new zzkm[0];
                }
            }
        }
        return zzaui;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkm)) {
            return false;
        }
        zzkm zzkmVar = (zzkm) obj;
        String str = this.name;
        if (str == null) {
            if (zzkmVar.name != null) {
                return false;
            }
        } else if (!str.equals(zzkmVar.name)) {
            return false;
        }
        Boolean bool = this.zzauj;
        if (bool == null) {
            if (zzkmVar.zzauj != null) {
                return false;
            }
        } else if (!bool.equals(zzkmVar.zzauj)) {
            return false;
        }
        Boolean bool2 = this.zzauk;
        if (bool2 == null) {
            if (zzkmVar.zzauk != null) {
                return false;
            }
        } else if (!bool2.equals(zzkmVar.zzauk)) {
            return false;
        }
        Integer num = this.zzaul;
        if (num == null) {
            if (zzkmVar.zzaul != null) {
                return false;
            }
        } else if (!num.equals(zzkmVar.zzaul)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkmVar.zzbzd == null || zzkmVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkmVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.zzauj;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.zzauk;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.zzaul;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        String str = this.name;
        if (str != null) {
            zza += zzacb.zzc(1, str);
        }
        Boolean bool = this.zzauj;
        if (bool != null) {
            bool.booleanValue();
            zza += zzacb.zzaq(2) + 1;
        }
        Boolean bool2 = this.zzauk;
        if (bool2 != null) {
            bool2.booleanValue();
            zza += zzacb.zzaq(3) + 1;
        }
        Integer num = this.zzaul;
        return num != null ? zza + zzacb.zzf(4, num.intValue()) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        String str = this.name;
        if (str != null) {
            zzacbVar.zzb(1, str);
        }
        Boolean bool = this.zzauj;
        if (bool != null) {
            zzacbVar.zza(2, bool.booleanValue());
        }
        Boolean bool2 = this.zzauk;
        if (bool2 != null) {
            zzacbVar.zza(3, bool2.booleanValue());
        }
        Integer num = this.zzaul;
        if (num != null) {
            zzacbVar.zze(4, num.intValue());
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
            if (zzvl == 10) {
                this.name = zzacaVar.readString();
            } else if (zzvl == 16) {
                this.zzauj = Boolean.valueOf(zzacaVar.zzvm());
            } else if (zzvl == 24) {
                this.zzauk = Boolean.valueOf(zzacaVar.zzvm());
            } else if (zzvl == 32) {
                this.zzaul = Integer.valueOf(zzacaVar.zzvn());
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
