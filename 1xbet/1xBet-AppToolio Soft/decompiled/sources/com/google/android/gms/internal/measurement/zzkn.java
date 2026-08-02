package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkn extends zzacd<zzkn> {
    public Long zzaum = null;
    public String zzafa = null;
    private Integer zzaun = null;
    public zzko[] zzauo = zzko.zzlv();
    public zzkm[] zzaup = zzkm.zzlu();
    public zzkg[] zzauq = zzkg.zzlq();

    public zzkn() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkn)) {
            return false;
        }
        zzkn zzknVar = (zzkn) obj;
        Long l = this.zzaum;
        if (l == null) {
            if (zzknVar.zzaum != null) {
                return false;
            }
        } else if (!l.equals(zzknVar.zzaum)) {
            return false;
        }
        String str = this.zzafa;
        if (str == null) {
            if (zzknVar.zzafa != null) {
                return false;
            }
        } else if (!str.equals(zzknVar.zzafa)) {
            return false;
        }
        Integer num = this.zzaun;
        if (num == null) {
            if (zzknVar.zzaun != null) {
                return false;
            }
        } else if (!num.equals(zzknVar.zzaun)) {
            return false;
        }
        if (zzach.equals(this.zzauo, zzknVar.zzauo) && zzach.equals(this.zzaup, zzknVar.zzaup) && zzach.equals(this.zzauq, zzknVar.zzauq)) {
            return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzknVar.zzbzd == null || zzknVar.zzbzd.isEmpty() : this.zzbzd.equals(zzknVar.zzbzd);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Long l = this.zzaum;
        int i = 0;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.zzafa;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.zzaun;
        int hashCode4 = (((((((hashCode3 + (num == null ? 0 : num.hashCode())) * 31) + zzach.hashCode(this.zzauo)) * 31) + zzach.hashCode(this.zzaup)) * 31) + zzach.hashCode(this.zzauq)) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode4 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        Long l = this.zzaum;
        if (l != null) {
            zza += zzacb.zzc(1, l.longValue());
        }
        String str = this.zzafa;
        if (str != null) {
            zza += zzacb.zzc(2, str);
        }
        Integer num = this.zzaun;
        if (num != null) {
            zza += zzacb.zzf(3, num.intValue());
        }
        zzko[] zzkoVarArr = this.zzauo;
        int i = 0;
        if (zzkoVarArr != null && zzkoVarArr.length > 0) {
            int i2 = zza;
            int i3 = 0;
            while (true) {
                zzko[] zzkoVarArr2 = this.zzauo;
                if (i3 >= zzkoVarArr2.length) {
                    break;
                }
                zzko zzkoVar = zzkoVarArr2[i3];
                if (zzkoVar != null) {
                    i2 += zzacb.zzb(4, zzkoVar);
                }
                i3++;
            }
            zza = i2;
        }
        zzkm[] zzkmVarArr = this.zzaup;
        if (zzkmVarArr != null && zzkmVarArr.length > 0) {
            int i4 = zza;
            int i5 = 0;
            while (true) {
                zzkm[] zzkmVarArr2 = this.zzaup;
                if (i5 >= zzkmVarArr2.length) {
                    break;
                }
                zzkm zzkmVar = zzkmVarArr2[i5];
                if (zzkmVar != null) {
                    i4 += zzacb.zzb(5, zzkmVar);
                }
                i5++;
            }
            zza = i4;
        }
        zzkg[] zzkgVarArr = this.zzauq;
        if (zzkgVarArr != null && zzkgVarArr.length > 0) {
            while (true) {
                zzkg[] zzkgVarArr2 = this.zzauq;
                if (i >= zzkgVarArr2.length) {
                    break;
                }
                zzkg zzkgVar = zzkgVarArr2[i];
                if (zzkgVar != null) {
                    zza += zzacb.zzb(6, zzkgVar);
                }
                i++;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        Long l = this.zzaum;
        if (l != null) {
            zzacbVar.zzb(1, l.longValue());
        }
        String str = this.zzafa;
        if (str != null) {
            zzacbVar.zzb(2, str);
        }
        Integer num = this.zzaun;
        if (num != null) {
            zzacbVar.zze(3, num.intValue());
        }
        zzko[] zzkoVarArr = this.zzauo;
        int i = 0;
        if (zzkoVarArr != null && zzkoVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzko[] zzkoVarArr2 = this.zzauo;
                if (i2 >= zzkoVarArr2.length) {
                    break;
                }
                zzko zzkoVar = zzkoVarArr2[i2];
                if (zzkoVar != null) {
                    zzacbVar.zza(4, zzkoVar);
                }
                i2++;
            }
        }
        zzkm[] zzkmVarArr = this.zzaup;
        if (zzkmVarArr != null && zzkmVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                zzkm[] zzkmVarArr2 = this.zzaup;
                if (i3 >= zzkmVarArr2.length) {
                    break;
                }
                zzkm zzkmVar = zzkmVarArr2[i3];
                if (zzkmVar != null) {
                    zzacbVar.zza(5, zzkmVar);
                }
                i3++;
            }
        }
        zzkg[] zzkgVarArr = this.zzauq;
        if (zzkgVarArr != null && zzkgVarArr.length > 0) {
            while (true) {
                zzkg[] zzkgVarArr2 = this.zzauq;
                if (i >= zzkgVarArr2.length) {
                    break;
                }
                zzkg zzkgVar = zzkgVarArr2[i];
                if (zzkgVar != null) {
                    zzacbVar.zza(6, zzkgVar);
                }
                i++;
            }
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
                this.zzaum = Long.valueOf(zzacaVar.zzvo());
            } else if (zzvl == 18) {
                this.zzafa = zzacaVar.readString();
            } else if (zzvl == 24) {
                this.zzaun = Integer.valueOf(zzacaVar.zzvn());
            } else if (zzvl == 34) {
                int zzb = zzacm.zzb(zzacaVar, 34);
                zzko[] zzkoVarArr = this.zzauo;
                int length = zzkoVarArr == null ? 0 : zzkoVarArr.length;
                zzko[] zzkoVarArr2 = new zzko[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzauo, 0, zzkoVarArr2, 0, length);
                }
                while (length < zzkoVarArr2.length - 1) {
                    zzkoVarArr2[length] = new zzko();
                    zzacaVar.zza(zzkoVarArr2[length]);
                    zzacaVar.zzvl();
                    length++;
                }
                zzkoVarArr2[length] = new zzko();
                zzacaVar.zza(zzkoVarArr2[length]);
                this.zzauo = zzkoVarArr2;
            } else if (zzvl == 42) {
                int zzb2 = zzacm.zzb(zzacaVar, 42);
                zzkm[] zzkmVarArr = this.zzaup;
                int length2 = zzkmVarArr == null ? 0 : zzkmVarArr.length;
                zzkm[] zzkmVarArr2 = new zzkm[zzb2 + length2];
                if (length2 != 0) {
                    System.arraycopy(this.zzaup, 0, zzkmVarArr2, 0, length2);
                }
                while (length2 < zzkmVarArr2.length - 1) {
                    zzkmVarArr2[length2] = new zzkm();
                    zzacaVar.zza(zzkmVarArr2[length2]);
                    zzacaVar.zzvl();
                    length2++;
                }
                zzkmVarArr2[length2] = new zzkm();
                zzacaVar.zza(zzkmVarArr2[length2]);
                this.zzaup = zzkmVarArr2;
            } else if (zzvl == 50) {
                int zzb3 = zzacm.zzb(zzacaVar, 50);
                zzkg[] zzkgVarArr = this.zzauq;
                int length3 = zzkgVarArr == null ? 0 : zzkgVarArr.length;
                zzkg[] zzkgVarArr2 = new zzkg[zzb3 + length3];
                if (length3 != 0) {
                    System.arraycopy(this.zzauq, 0, zzkgVarArr2, 0, length3);
                }
                while (length3 < zzkgVarArr2.length - 1) {
                    zzkgVarArr2[length3] = new zzkg();
                    zzacaVar.zza(zzkgVarArr2[length3]);
                    zzacaVar.zzvl();
                    length3++;
                }
                zzkgVarArr2[length3] = new zzkg();
                zzacaVar.zza(zzkgVarArr2[length3]);
                this.zzauq = zzkgVarArr2;
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
