package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkx extends zzacd<zzkx> {
    private static volatile zzkx[] zzawr;
    public Long zzaws = null;
    public String name = null;
    public String zzale = null;
    public Long zzave = null;
    private Float zzasv = null;
    public Double zzasw = null;

    public zzkx() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkx[] zzmc() {
        if (zzawr == null) {
            synchronized (zzach.zzbzn) {
                if (zzawr == null) {
                    zzawr = new zzkx[0];
                }
            }
        }
        return zzawr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkx)) {
            return false;
        }
        zzkx zzkxVar = (zzkx) obj;
        Long l = this.zzaws;
        if (l == null) {
            if (zzkxVar.zzaws != null) {
                return false;
            }
        } else if (!l.equals(zzkxVar.zzaws)) {
            return false;
        }
        String str = this.name;
        if (str == null) {
            if (zzkxVar.name != null) {
                return false;
            }
        } else if (!str.equals(zzkxVar.name)) {
            return false;
        }
        String str2 = this.zzale;
        if (str2 == null) {
            if (zzkxVar.zzale != null) {
                return false;
            }
        } else if (!str2.equals(zzkxVar.zzale)) {
            return false;
        }
        Long l2 = this.zzave;
        if (l2 == null) {
            if (zzkxVar.zzave != null) {
                return false;
            }
        } else if (!l2.equals(zzkxVar.zzave)) {
            return false;
        }
        Float f = this.zzasv;
        if (f == null) {
            if (zzkxVar.zzasv != null) {
                return false;
            }
        } else if (!f.equals(zzkxVar.zzasv)) {
            return false;
        }
        Double d = this.zzasw;
        if (d == null) {
            if (zzkxVar.zzasw != null) {
                return false;
            }
        } else if (!d.equals(zzkxVar.zzasw)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkxVar.zzbzd == null || zzkxVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkxVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Long l = this.zzaws;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zzale;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.zzave;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f = this.zzasv;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.zzasw;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode7 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        Long l = this.zzaws;
        if (l != null) {
            zza += zzacb.zzc(1, l.longValue());
        }
        String str = this.name;
        if (str != null) {
            zza += zzacb.zzc(2, str);
        }
        String str2 = this.zzale;
        if (str2 != null) {
            zza += zzacb.zzc(3, str2);
        }
        Long l2 = this.zzave;
        if (l2 != null) {
            zza += zzacb.zzc(4, l2.longValue());
        }
        Float f = this.zzasv;
        if (f != null) {
            f.floatValue();
            zza += zzacb.zzaq(5) + 4;
        }
        Double d = this.zzasw;
        if (d == null) {
            return zza;
        }
        d.doubleValue();
        return zza + zzacb.zzaq(6) + 8;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        Long l = this.zzaws;
        if (l != null) {
            zzacbVar.zzb(1, l.longValue());
        }
        String str = this.name;
        if (str != null) {
            zzacbVar.zzb(2, str);
        }
        String str2 = this.zzale;
        if (str2 != null) {
            zzacbVar.zzb(3, str2);
        }
        Long l2 = this.zzave;
        if (l2 != null) {
            zzacbVar.zzb(4, l2.longValue());
        }
        Float f = this.zzasv;
        if (f != null) {
            zzacbVar.zza(5, f.floatValue());
        }
        Double d = this.zzasw;
        if (d != null) {
            zzacbVar.zza(6, d.doubleValue());
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
                this.zzaws = Long.valueOf(zzacaVar.zzvo());
            } else if (zzvl == 18) {
                this.name = zzacaVar.readString();
            } else if (zzvl == 26) {
                this.zzale = zzacaVar.readString();
            } else if (zzvl == 32) {
                this.zzave = Long.valueOf(zzacaVar.zzvo());
            } else if (zzvl == 45) {
                this.zzasv = Float.valueOf(Float.intBitsToFloat(zzacaVar.zzvp()));
            } else if (zzvl == 49) {
                this.zzasw = Double.valueOf(Double.longBitsToDouble(zzacaVar.zzvq()));
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
