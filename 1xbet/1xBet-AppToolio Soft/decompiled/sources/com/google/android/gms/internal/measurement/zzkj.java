package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkj extends zzacd<zzkj> {
    public Integer zzatw = null;
    public Boolean zzatx = null;
    public String zzaty = null;
    public String zzatz = null;
    public String zzaua = null;

    public zzkj() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzacj
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzkj zzb(zzaca zzacaVar) throws IOException {
        while (true) {
            int zzvl = zzacaVar.zzvl();
            if (zzvl == 0) {
                return this;
            }
            if (zzvl == 8) {
                int position = zzacaVar.getPosition();
                try {
                    int zzvn = zzacaVar.zzvn();
                    if (zzvn < 0 || zzvn > 4) {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append(zzvn);
                        sb.append(" is not a valid enum ComparisonType");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.zzatw = Integer.valueOf(zzvn);
                } catch (IllegalArgumentException unused) {
                    zzacaVar.zzam(position);
                    zza(zzacaVar, zzvl);
                }
            } else if (zzvl == 16) {
                this.zzatx = Boolean.valueOf(zzacaVar.zzvm());
            } else if (zzvl == 26) {
                this.zzaty = zzacaVar.readString();
            } else if (zzvl == 34) {
                this.zzatz = zzacaVar.readString();
            } else if (zzvl == 42) {
                this.zzaua = zzacaVar.readString();
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkj)) {
            return false;
        }
        zzkj zzkjVar = (zzkj) obj;
        Integer num = this.zzatw;
        if (num == null) {
            if (zzkjVar.zzatw != null) {
                return false;
            }
        } else if (!num.equals(zzkjVar.zzatw)) {
            return false;
        }
        Boolean bool = this.zzatx;
        if (bool == null) {
            if (zzkjVar.zzatx != null) {
                return false;
            }
        } else if (!bool.equals(zzkjVar.zzatx)) {
            return false;
        }
        String str = this.zzaty;
        if (str == null) {
            if (zzkjVar.zzaty != null) {
                return false;
            }
        } else if (!str.equals(zzkjVar.zzaty)) {
            return false;
        }
        String str2 = this.zzatz;
        if (str2 == null) {
            if (zzkjVar.zzatz != null) {
                return false;
            }
        } else if (!str2.equals(zzkjVar.zzatz)) {
            return false;
        }
        String str3 = this.zzaua;
        if (str3 == null) {
            if (zzkjVar.zzaua != null) {
                return false;
            }
        } else if (!str3.equals(zzkjVar.zzaua)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkjVar.zzbzd == null || zzkjVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkjVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.zzatw;
        int i = 0;
        int intValue = (hashCode + (num == null ? 0 : num.intValue())) * 31;
        Boolean bool = this.zzatx;
        int hashCode2 = (intValue + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.zzaty;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zzatz;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zzaua;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        Integer num = this.zzatw;
        if (num != null) {
            zza += zzacb.zzf(1, num.intValue());
        }
        Boolean bool = this.zzatx;
        if (bool != null) {
            bool.booleanValue();
            zza += zzacb.zzaq(2) + 1;
        }
        String str = this.zzaty;
        if (str != null) {
            zza += zzacb.zzc(3, str);
        }
        String str2 = this.zzatz;
        if (str2 != null) {
            zza += zzacb.zzc(4, str2);
        }
        String str3 = this.zzaua;
        return str3 != null ? zza + zzacb.zzc(5, str3) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        Integer num = this.zzatw;
        if (num != null) {
            zzacbVar.zze(1, num.intValue());
        }
        Boolean bool = this.zzatx;
        if (bool != null) {
            zzacbVar.zza(2, bool.booleanValue());
        }
        String str = this.zzaty;
        if (str != null) {
            zzacbVar.zzb(3, str);
        }
        String str2 = this.zzatz;
        if (str2 != null) {
            zzacbVar.zzb(4, str2);
        }
        String str3 = this.zzaua;
        if (str3 != null) {
            zzacbVar.zzb(5, str3);
        }
        super.zza(zzacbVar);
    }
}
