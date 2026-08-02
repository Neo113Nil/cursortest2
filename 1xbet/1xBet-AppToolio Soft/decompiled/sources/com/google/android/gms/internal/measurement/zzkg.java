package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkg extends zzacd<zzkg> {
    private static volatile zzkg[] zzatd;
    public Integer zzate = null;
    public zzkk[] zzatf = zzkk.zzlt();
    public zzkh[] zzatg = zzkh.zzlr();
    public Boolean zzath = null;
    public Boolean zzati = null;

    public zzkg() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkg[] zzlq() {
        if (zzatd == null) {
            synchronized (zzach.zzbzn) {
                if (zzatd == null) {
                    zzatd = new zzkg[0];
                }
            }
        }
        return zzatd;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkg)) {
            return false;
        }
        zzkg zzkgVar = (zzkg) obj;
        Integer num = this.zzate;
        if (num == null) {
            if (zzkgVar.zzate != null) {
                return false;
            }
        } else if (!num.equals(zzkgVar.zzate)) {
            return false;
        }
        if (!zzach.equals(this.zzatf, zzkgVar.zzatf) || !zzach.equals(this.zzatg, zzkgVar.zzatg)) {
            return false;
        }
        Boolean bool = this.zzath;
        if (bool == null) {
            if (zzkgVar.zzath != null) {
                return false;
            }
        } else if (!bool.equals(zzkgVar.zzath)) {
            return false;
        }
        Boolean bool2 = this.zzati;
        if (bool2 == null) {
            if (zzkgVar.zzati != null) {
                return false;
            }
        } else if (!bool2.equals(zzkgVar.zzati)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkgVar.zzbzd == null || zzkgVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkgVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.zzate;
        int i = 0;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + zzach.hashCode(this.zzatf)) * 31) + zzach.hashCode(this.zzatg)) * 31;
        Boolean bool = this.zzath;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.zzati;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        Integer num = this.zzate;
        if (num != null) {
            zza += zzacb.zzf(1, num.intValue());
        }
        zzkk[] zzkkVarArr = this.zzatf;
        int i = 0;
        if (zzkkVarArr != null && zzkkVarArr.length > 0) {
            int i2 = zza;
            int i3 = 0;
            while (true) {
                zzkk[] zzkkVarArr2 = this.zzatf;
                if (i3 >= zzkkVarArr2.length) {
                    break;
                }
                zzkk zzkkVar = zzkkVarArr2[i3];
                if (zzkkVar != null) {
                    i2 += zzacb.zzb(2, zzkkVar);
                }
                i3++;
            }
            zza = i2;
        }
        zzkh[] zzkhVarArr = this.zzatg;
        if (zzkhVarArr != null && zzkhVarArr.length > 0) {
            while (true) {
                zzkh[] zzkhVarArr2 = this.zzatg;
                if (i >= zzkhVarArr2.length) {
                    break;
                }
                zzkh zzkhVar = zzkhVarArr2[i];
                if (zzkhVar != null) {
                    zza += zzacb.zzb(3, zzkhVar);
                }
                i++;
            }
        }
        Boolean bool = this.zzath;
        if (bool != null) {
            bool.booleanValue();
            zza += zzacb.zzaq(4) + 1;
        }
        Boolean bool2 = this.zzati;
        if (bool2 == null) {
            return zza;
        }
        bool2.booleanValue();
        return zza + zzacb.zzaq(5) + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        Integer num = this.zzate;
        if (num != null) {
            zzacbVar.zze(1, num.intValue());
        }
        zzkk[] zzkkVarArr = this.zzatf;
        int i = 0;
        if (zzkkVarArr != null && zzkkVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzkk[] zzkkVarArr2 = this.zzatf;
                if (i2 >= zzkkVarArr2.length) {
                    break;
                }
                zzkk zzkkVar = zzkkVarArr2[i2];
                if (zzkkVar != null) {
                    zzacbVar.zza(2, zzkkVar);
                }
                i2++;
            }
        }
        zzkh[] zzkhVarArr = this.zzatg;
        if (zzkhVarArr != null && zzkhVarArr.length > 0) {
            while (true) {
                zzkh[] zzkhVarArr2 = this.zzatg;
                if (i >= zzkhVarArr2.length) {
                    break;
                }
                zzkh zzkhVar = zzkhVarArr2[i];
                if (zzkhVar != null) {
                    zzacbVar.zza(3, zzkhVar);
                }
                i++;
            }
        }
        Boolean bool = this.zzath;
        if (bool != null) {
            zzacbVar.zza(4, bool.booleanValue());
        }
        Boolean bool2 = this.zzati;
        if (bool2 != null) {
            zzacbVar.zza(5, bool2.booleanValue());
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
                this.zzate = Integer.valueOf(zzacaVar.zzvn());
            } else if (zzvl == 18) {
                int zzb = zzacm.zzb(zzacaVar, 18);
                zzkk[] zzkkVarArr = this.zzatf;
                int length = zzkkVarArr == null ? 0 : zzkkVarArr.length;
                zzkk[] zzkkVarArr2 = new zzkk[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzatf, 0, zzkkVarArr2, 0, length);
                }
                while (length < zzkkVarArr2.length - 1) {
                    zzkkVarArr2[length] = new zzkk();
                    zzacaVar.zza(zzkkVarArr2[length]);
                    zzacaVar.zzvl();
                    length++;
                }
                zzkkVarArr2[length] = new zzkk();
                zzacaVar.zza(zzkkVarArr2[length]);
                this.zzatf = zzkkVarArr2;
            } else if (zzvl == 26) {
                int zzb2 = zzacm.zzb(zzacaVar, 26);
                zzkh[] zzkhVarArr = this.zzatg;
                int length2 = zzkhVarArr == null ? 0 : zzkhVarArr.length;
                zzkh[] zzkhVarArr2 = new zzkh[zzb2 + length2];
                if (length2 != 0) {
                    System.arraycopy(this.zzatg, 0, zzkhVarArr2, 0, length2);
                }
                while (length2 < zzkhVarArr2.length - 1) {
                    zzkhVarArr2[length2] = new zzkh();
                    zzacaVar.zza(zzkhVarArr2[length2]);
                    zzacaVar.zzvl();
                    length2++;
                }
                zzkhVarArr2[length2] = new zzkh();
                zzacaVar.zza(zzkhVarArr2[length2]);
                this.zzatg = zzkhVarArr2;
            } else if (zzvl == 32) {
                this.zzath = Boolean.valueOf(zzacaVar.zzvm());
            } else if (zzvl == 40) {
                this.zzati = Boolean.valueOf(zzacaVar.zzvm());
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
