package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkr extends zzacd<zzkr> {
    private static volatile zzkr[] zzauz;
    public zzks[] zzava = zzks.zzlz();
    public String name = null;
    public Long zzavb = null;
    public Long zzavc = null;
    public Integer count = null;

    public zzkr() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkr[] zzly() {
        if (zzauz == null) {
            synchronized (zzach.zzbzn) {
                if (zzauz == null) {
                    zzauz = new zzkr[0];
                }
            }
        }
        return zzauz;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkr)) {
            return false;
        }
        zzkr zzkrVar = (zzkr) obj;
        if (!zzach.equals(this.zzava, zzkrVar.zzava)) {
            return false;
        }
        String str = this.name;
        if (str == null) {
            if (zzkrVar.name != null) {
                return false;
            }
        } else if (!str.equals(zzkrVar.name)) {
            return false;
        }
        Long l = this.zzavb;
        if (l == null) {
            if (zzkrVar.zzavb != null) {
                return false;
            }
        } else if (!l.equals(zzkrVar.zzavb)) {
            return false;
        }
        Long l2 = this.zzavc;
        if (l2 == null) {
            if (zzkrVar.zzavc != null) {
                return false;
            }
        } else if (!l2.equals(zzkrVar.zzavc)) {
            return false;
        }
        Integer num = this.count;
        if (num == null) {
            if (zzkrVar.count != null) {
                return false;
            }
        } else if (!num.equals(zzkrVar.count)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkrVar.zzbzd == null || zzkrVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkrVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (((getClass().getName().hashCode() + 527) * 31) + zzach.hashCode(this.zzava)) * 31;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.zzavb;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.zzavc;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.count;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        zzks[] zzksVarArr = this.zzava;
        if (zzksVarArr != null && zzksVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzks[] zzksVarArr2 = this.zzava;
                if (i >= zzksVarArr2.length) {
                    break;
                }
                zzks zzksVar = zzksVarArr2[i];
                if (zzksVar != null) {
                    zza += zzacb.zzb(1, zzksVar);
                }
                i++;
            }
        }
        String str = this.name;
        if (str != null) {
            zza += zzacb.zzc(2, str);
        }
        Long l = this.zzavb;
        if (l != null) {
            zza += zzacb.zzc(3, l.longValue());
        }
        Long l2 = this.zzavc;
        if (l2 != null) {
            zza += zzacb.zzc(4, l2.longValue());
        }
        Integer num = this.count;
        return num != null ? zza + zzacb.zzf(5, num.intValue()) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        zzks[] zzksVarArr = this.zzava;
        if (zzksVarArr != null && zzksVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzks[] zzksVarArr2 = this.zzava;
                if (i >= zzksVarArr2.length) {
                    break;
                }
                zzks zzksVar = zzksVarArr2[i];
                if (zzksVar != null) {
                    zzacbVar.zza(1, zzksVar);
                }
                i++;
            }
        }
        String str = this.name;
        if (str != null) {
            zzacbVar.zzb(2, str);
        }
        Long l = this.zzavb;
        if (l != null) {
            zzacbVar.zzb(3, l.longValue());
        }
        Long l2 = this.zzavc;
        if (l2 != null) {
            zzacbVar.zzb(4, l2.longValue());
        }
        Integer num = this.count;
        if (num != null) {
            zzacbVar.zze(5, num.intValue());
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
                int zzb = zzacm.zzb(zzacaVar, 10);
                zzks[] zzksVarArr = this.zzava;
                int length = zzksVarArr == null ? 0 : zzksVarArr.length;
                zzks[] zzksVarArr2 = new zzks[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzava, 0, zzksVarArr2, 0, length);
                }
                while (length < zzksVarArr2.length - 1) {
                    zzksVarArr2[length] = new zzks();
                    zzacaVar.zza(zzksVarArr2[length]);
                    zzacaVar.zzvl();
                    length++;
                }
                zzksVarArr2[length] = new zzks();
                zzacaVar.zza(zzksVarArr2[length]);
                this.zzava = zzksVarArr2;
            } else if (zzvl == 18) {
                this.name = zzacaVar.readString();
            } else if (zzvl == 24) {
                this.zzavb = Long.valueOf(zzacaVar.zzvo());
            } else if (zzvl == 32) {
                this.zzavc = Long.valueOf(zzacaVar.zzvo());
            } else if (zzvl == 40) {
                this.count = Integer.valueOf(zzacaVar.zzvn());
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
