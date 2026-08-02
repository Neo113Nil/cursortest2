package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzks extends zzacd<zzks> {
    private static volatile zzks[] zzavd;
    public String name = null;
    public String zzale = null;
    public Long zzave = null;
    private Float zzasv = null;
    public Double zzasw = null;

    public zzks() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzks[] zzlz() {
        if (zzavd == null) {
            synchronized (zzach.zzbzn) {
                if (zzavd == null) {
                    zzavd = new zzks[0];
                }
            }
        }
        return zzavd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzks)) {
            return false;
        }
        zzks zzksVar = (zzks) obj;
        String str = this.name;
        if (str == null) {
            if (zzksVar.name != null) {
                return false;
            }
        } else if (!str.equals(zzksVar.name)) {
            return false;
        }
        String str2 = this.zzale;
        if (str2 == null) {
            if (zzksVar.zzale != null) {
                return false;
            }
        } else if (!str2.equals(zzksVar.zzale)) {
            return false;
        }
        Long l = this.zzave;
        if (l == null) {
            if (zzksVar.zzave != null) {
                return false;
            }
        } else if (!l.equals(zzksVar.zzave)) {
            return false;
        }
        Float f = this.zzasv;
        if (f == null) {
            if (zzksVar.zzasv != null) {
                return false;
            }
        } else if (!f.equals(zzksVar.zzasv)) {
            return false;
        }
        Double d = this.zzasw;
        if (d == null) {
            if (zzksVar.zzasw != null) {
                return false;
            }
        } else if (!d.equals(zzksVar.zzasw)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzksVar.zzbzd == null || zzksVar.zzbzd.isEmpty() : this.zzbzd.equals(zzksVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zzale;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.zzave;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Float f = this.zzasv;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Double d = this.zzasw;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode6 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        String str = this.name;
        if (str != null) {
            zza += zzacb.zzc(1, str);
        }
        String str2 = this.zzale;
        if (str2 != null) {
            zza += zzacb.zzc(2, str2);
        }
        Long l = this.zzave;
        if (l != null) {
            zza += zzacb.zzc(3, l.longValue());
        }
        Float f = this.zzasv;
        if (f != null) {
            f.floatValue();
            zza += zzacb.zzaq(4) + 4;
        }
        Double d = this.zzasw;
        if (d == null) {
            return zza;
        }
        d.doubleValue();
        return zza + zzacb.zzaq(5) + 8;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        String str = this.name;
        if (str != null) {
            zzacbVar.zzb(1, str);
        }
        String str2 = this.zzale;
        if (str2 != null) {
            zzacbVar.zzb(2, str2);
        }
        Long l = this.zzave;
        if (l != null) {
            zzacbVar.zzb(3, l.longValue());
        }
        Float f = this.zzasv;
        if (f != null) {
            zzacbVar.zza(4, f.floatValue());
        }
        Double d = this.zzasw;
        if (d != null) {
            zzacbVar.zza(5, d.doubleValue());
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
            } else if (zzvl == 18) {
                this.zzale = zzacaVar.readString();
            } else if (zzvl == 24) {
                this.zzave = Long.valueOf(zzacaVar.zzvo());
            } else if (zzvl == 37) {
                this.zzasv = Float.valueOf(Float.intBitsToFloat(zzacaVar.zzvp()));
            } else if (zzvl == 41) {
                this.zzasw = Double.valueOf(Double.longBitsToDouble(zzacaVar.zzvq()));
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
