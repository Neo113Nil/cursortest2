package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkh extends zzacd<zzkh> {
    private static volatile zzkh[] zzatj;
    public Integer zzatk = null;
    public String zzatl = null;
    public zzki[] zzatm = zzki.zzls();
    private Boolean zzatn = null;
    public zzkj zzato = null;

    public zzkh() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkh[] zzlr() {
        if (zzatj == null) {
            synchronized (zzach.zzbzn) {
                if (zzatj == null) {
                    zzatj = new zzkh[0];
                }
            }
        }
        return zzatj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkh)) {
            return false;
        }
        zzkh zzkhVar = (zzkh) obj;
        Integer num = this.zzatk;
        if (num == null) {
            if (zzkhVar.zzatk != null) {
                return false;
            }
        } else if (!num.equals(zzkhVar.zzatk)) {
            return false;
        }
        String str = this.zzatl;
        if (str == null) {
            if (zzkhVar.zzatl != null) {
                return false;
            }
        } else if (!str.equals(zzkhVar.zzatl)) {
            return false;
        }
        if (!zzach.equals(this.zzatm, zzkhVar.zzatm)) {
            return false;
        }
        Boolean bool = this.zzatn;
        if (bool == null) {
            if (zzkhVar.zzatn != null) {
                return false;
            }
        } else if (!bool.equals(zzkhVar.zzatn)) {
            return false;
        }
        zzkj zzkjVar = this.zzato;
        if (zzkjVar == null) {
            if (zzkhVar.zzato != null) {
                return false;
            }
        } else if (!zzkjVar.equals(zzkhVar.zzato)) {
            return false;
        }
        return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkhVar.zzbzd == null || zzkhVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkhVar.zzbzd);
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.zzatk;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.zzatl;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + zzach.hashCode(this.zzatm)) * 31;
        Boolean bool = this.zzatn;
        int hashCode4 = hashCode3 + (bool == null ? 0 : bool.hashCode());
        zzkj zzkjVar = this.zzato;
        int hashCode5 = ((hashCode4 * 31) + (zzkjVar == null ? 0 : zzkjVar.hashCode())) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        Integer num = this.zzatk;
        if (num != null) {
            zza += zzacb.zzf(1, num.intValue());
        }
        String str = this.zzatl;
        if (str != null) {
            zza += zzacb.zzc(2, str);
        }
        zzki[] zzkiVarArr = this.zzatm;
        if (zzkiVarArr != null && zzkiVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzki[] zzkiVarArr2 = this.zzatm;
                if (i >= zzkiVarArr2.length) {
                    break;
                }
                zzki zzkiVar = zzkiVarArr2[i];
                if (zzkiVar != null) {
                    zza += zzacb.zzb(3, zzkiVar);
                }
                i++;
            }
        }
        Boolean bool = this.zzatn;
        if (bool != null) {
            bool.booleanValue();
            zza += zzacb.zzaq(4) + 1;
        }
        zzkj zzkjVar = this.zzato;
        return zzkjVar != null ? zza + zzacb.zzb(5, zzkjVar) : zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        Integer num = this.zzatk;
        if (num != null) {
            zzacbVar.zze(1, num.intValue());
        }
        String str = this.zzatl;
        if (str != null) {
            zzacbVar.zzb(2, str);
        }
        zzki[] zzkiVarArr = this.zzatm;
        if (zzkiVarArr != null && zzkiVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzki[] zzkiVarArr2 = this.zzatm;
                if (i >= zzkiVarArr2.length) {
                    break;
                }
                zzki zzkiVar = zzkiVarArr2[i];
                if (zzkiVar != null) {
                    zzacbVar.zza(3, zzkiVar);
                }
                i++;
            }
        }
        Boolean bool = this.zzatn;
        if (bool != null) {
            zzacbVar.zza(4, bool.booleanValue());
        }
        zzkj zzkjVar = this.zzato;
        if (zzkjVar != null) {
            zzacbVar.zza(5, zzkjVar);
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
                this.zzatl = zzacaVar.readString();
            } else if (zzvl == 26) {
                int zzb = zzacm.zzb(zzacaVar, 26);
                zzki[] zzkiVarArr = this.zzatm;
                int length = zzkiVarArr == null ? 0 : zzkiVarArr.length;
                zzki[] zzkiVarArr2 = new zzki[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzatm, 0, zzkiVarArr2, 0, length);
                }
                while (length < zzkiVarArr2.length - 1) {
                    zzkiVarArr2[length] = new zzki();
                    zzacaVar.zza(zzkiVarArr2[length]);
                    zzacaVar.zzvl();
                    length++;
                }
                zzkiVarArr2[length] = new zzki();
                zzacaVar.zza(zzkiVarArr2[length]);
                this.zzatm = zzkiVarArr2;
            } else if (zzvl == 32) {
                this.zzatn = Boolean.valueOf(zzacaVar.zzvm());
            } else if (zzvl == 42) {
                if (this.zzato == null) {
                    this.zzato = new zzkj();
                }
                zzacaVar.zza(this.zzato);
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
