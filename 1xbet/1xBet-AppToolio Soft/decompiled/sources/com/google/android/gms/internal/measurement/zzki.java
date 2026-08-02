package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzki extends zzacd<zzki> {
    private static volatile zzki[] zzatp;
    public zzkl zzatq = null;
    public zzkj zzatr = null;
    public Boolean zzats = null;
    public String zzatt = null;
    public Boolean zzatu = null;
    public Boolean zzatv = null;

    public zzki() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzki[] zzls() {
        if (zzatp == null) {
            synchronized (zzach.zzbzn) {
                if (zzatp == null) {
                    zzatp = new zzki[0];
                }
            }
        }
        return zzatp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzki)) {
            return false;
        }
        zzki zzkiVar = (zzki) obj;
        zzkl zzklVar = this.zzatq;
        if (zzklVar == null) {
            if (zzkiVar.zzatq != null) {
                return false;
            }
        } else if (!zzklVar.equals(zzkiVar.zzatq)) {
            return false;
        }
        zzkj zzkjVar = this.zzatr;
        if (zzkjVar == null) {
            if (zzkiVar.zzatr != null) {
                return false;
            }
        } else if (!zzkjVar.equals(zzkiVar.zzatr)) {
            return false;
        }
        Boolean bool = this.zzats;
        if (bool == null) {
            if (zzkiVar.zzats != null) {
                return false;
            }
        } else if (!bool.equals(zzkiVar.zzats)) {
            return false;
        }
        String str = this.zzatt;
        if (str == null) {
            if (zzkiVar.zzatt != null) {
                return false;
            }
        } else if (!str.equals(zzkiVar.zzatt)) {
            return false;
        }
        Boolean bool2 = this.zzatu;
        if (bool2 == null) {
            if (zzkiVar.zzatu != null) {
                return false;
            }
        } else if (!bool2.equals(zzkiVar.zzatu)) {
            return false;
        }
        Boolean bool3 = this.zzatv;
        if (bool3 == null) {
            if (zzkiVar.zzatv != null) {
                return false;
            }
        } else if (!bool3.equals(zzkiVar.zzatv)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkiVar.zzbzd == null || zzkiVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkiVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode() + 527;
        zzkl zzklVar = this.zzatq;
        int i = 0;
        int hashCode2 = (hashCode * 31) + (zzklVar == null ? 0 : zzklVar.hashCode());
        zzkj zzkjVar = this.zzatr;
        int hashCode3 = ((hashCode2 * 31) + (zzkjVar == null ? 0 : zzkjVar.hashCode())) * 31;
        Boolean bool = this.zzats;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.zzatt;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.zzatu;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.zzatv;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode7 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        zzkl zzklVar = this.zzatq;
        if (zzklVar != null) {
            zza += zzacb.zzb(1, zzklVar);
        }
        zzkj zzkjVar = this.zzatr;
        if (zzkjVar != null) {
            zza += zzacb.zzb(2, zzkjVar);
        }
        Boolean bool = this.zzats;
        if (bool != null) {
            bool.booleanValue();
            zza += zzacb.zzaq(3) + 1;
        }
        String str = this.zzatt;
        if (str != null) {
            zza += zzacb.zzc(4, str);
        }
        Boolean bool2 = this.zzatu;
        if (bool2 != null) {
            bool2.booleanValue();
            zza += zzacb.zzaq(5) + 1;
        }
        Boolean bool3 = this.zzatv;
        if (bool3 == null) {
            return zza;
        }
        bool3.booleanValue();
        return zza + zzacb.zzaq(6) + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        zzkl zzklVar = this.zzatq;
        if (zzklVar != null) {
            zzacbVar.zza(1, zzklVar);
        }
        zzkj zzkjVar = this.zzatr;
        if (zzkjVar != null) {
            zzacbVar.zza(2, zzkjVar);
        }
        Boolean bool = this.zzats;
        if (bool != null) {
            zzacbVar.zza(3, bool.booleanValue());
        }
        String str = this.zzatt;
        if (str != null) {
            zzacbVar.zzb(4, str);
        }
        Boolean bool2 = this.zzatu;
        if (bool2 != null) {
            zzacbVar.zza(5, bool2.booleanValue());
        }
        Boolean bool3 = this.zzatv;
        if (bool3 != null) {
            zzacbVar.zza(6, bool3.booleanValue());
        }
        super.zza(zzacbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final /* synthetic */ zzacj zzb(zzaca zzacaVar) throws IOException {
        zzacj zzacjVar;
        while (true) {
            int zzvl = zzacaVar.zzvl();
            if (zzvl == 0) {
                return this;
            }
            if (zzvl == 10) {
                if (this.zzatq == null) {
                    this.zzatq = new zzkl();
                }
                zzacjVar = this.zzatq;
            } else if (zzvl == 18) {
                if (this.zzatr == null) {
                    this.zzatr = new zzkj();
                }
                zzacjVar = this.zzatr;
            } else if (zzvl == 24) {
                this.zzats = Boolean.valueOf(zzacaVar.zzvm());
            } else if (zzvl == 34) {
                this.zzatt = zzacaVar.readString();
            } else if (zzvl == 40) {
                this.zzatu = Boolean.valueOf(zzacaVar.zzvm());
            } else if (zzvl == 48) {
                this.zzatv = Boolean.valueOf(zzacaVar.zzvm());
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
            zzacaVar.zza(zzacjVar);
        }
    }
}
