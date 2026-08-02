package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkl extends zzacd<zzkl> {
    public Integer zzaue = null;
    public String zzauf = null;
    public Boolean zzaug = null;
    public String[] zzauh = zzacm.zzbzx;

    public zzkl() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzacj
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzkl zzb(zzaca zzacaVar) throws IOException {
        while (true) {
            int zzvl = zzacaVar.zzvl();
            if (zzvl == 0) {
                return this;
            }
            if (zzvl == 8) {
                int position = zzacaVar.getPosition();
                try {
                    int zzvn = zzacaVar.zzvn();
                    if (zzvn < 0 || zzvn > 6) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append(zzvn);
                        sb.append(" is not a valid enum MatchType");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.zzaue = Integer.valueOf(zzvn);
                } catch (IllegalArgumentException unused) {
                    zzacaVar.zzam(position);
                    zza(zzacaVar, zzvl);
                }
            } else if (zzvl == 18) {
                this.zzauf = zzacaVar.readString();
            } else if (zzvl == 24) {
                this.zzaug = Boolean.valueOf(zzacaVar.zzvm());
            } else if (zzvl == 34) {
                int zzb = zzacm.zzb(zzacaVar, 34);
                String[] strArr = this.zzauh;
                int length = strArr == null ? 0 : strArr.length;
                String[] strArr2 = new String[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzauh, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = zzacaVar.readString();
                    zzacaVar.zzvl();
                    length++;
                }
                strArr2[length] = zzacaVar.readString();
                this.zzauh = strArr2;
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkl)) {
            return false;
        }
        zzkl zzklVar = (zzkl) obj;
        Integer num = this.zzaue;
        if (num == null) {
            if (zzklVar.zzaue != null) {
                return false;
            }
        } else if (!num.equals(zzklVar.zzaue)) {
            return false;
        }
        String str = this.zzauf;
        if (str == null) {
            if (zzklVar.zzauf != null) {
                return false;
            }
        } else if (!str.equals(zzklVar.zzauf)) {
            return false;
        }
        Boolean bool = this.zzaug;
        if (bool == null) {
            if (zzklVar.zzaug != null) {
                return false;
            }
        } else if (!bool.equals(zzklVar.zzaug)) {
            return false;
        }
        if (zzach.equals(this.zzauh, zzklVar.zzauh)) {
            return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzklVar.zzbzd == null || zzklVar.zzbzd.isEmpty() : this.zzbzd.equals(zzklVar.zzbzd);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.zzaue;
        int i = 0;
        int intValue = (hashCode + (num == null ? 0 : num.intValue())) * 31;
        String str = this.zzauf;
        int hashCode2 = (intValue + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.zzaug;
        int hashCode3 = (((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + zzach.hashCode(this.zzauh)) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode3 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        Integer num = this.zzaue;
        if (num != null) {
            zza += zzacb.zzf(1, num.intValue());
        }
        String str = this.zzauf;
        if (str != null) {
            zza += zzacb.zzc(2, str);
        }
        Boolean bool = this.zzaug;
        if (bool != null) {
            bool.booleanValue();
            zza += zzacb.zzaq(3) + 1;
        }
        String[] strArr = this.zzauh;
        if (strArr == null || strArr.length <= 0) {
            return zza;
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.zzauh;
            if (i >= strArr2.length) {
                return zza + i2 + (i3 * 1);
            }
            String str2 = strArr2[i];
            if (str2 != null) {
                i3++;
                i2 += zzacb.zzfr(str2);
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        Integer num = this.zzaue;
        if (num != null) {
            zzacbVar.zze(1, num.intValue());
        }
        String str = this.zzauf;
        if (str != null) {
            zzacbVar.zzb(2, str);
        }
        Boolean bool = this.zzaug;
        if (bool != null) {
            zzacbVar.zza(3, bool.booleanValue());
        }
        String[] strArr = this.zzauh;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.zzauh;
                if (i >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i];
                if (str2 != null) {
                    zzacbVar.zzb(4, str2);
                }
                i++;
            }
        }
        super.zza(zzacbVar);
    }
}
