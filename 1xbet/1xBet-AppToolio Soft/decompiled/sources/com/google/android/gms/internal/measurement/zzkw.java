package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkw extends zzacd<zzkw> {
    private static volatile zzkw[] zzawp;
    private Integer zzaux = null;
    private long[] zzawq = zzacm.zzbzt;

    public zzkw() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public static zzkw[] zzmb() {
        if (zzawp == null) {
            synchronized (zzach.zzbzn) {
                if (zzawp == null) {
                    zzawp = new zzkw[0];
                }
            }
        }
        return zzawp;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkw)) {
            return false;
        }
        zzkw zzkwVar = (zzkw) obj;
        Integer num = this.zzaux;
        if (num == null) {
            if (zzkwVar.zzaux != null) {
                return false;
            }
        } else if (!num.equals(zzkwVar.zzaux)) {
            return false;
        }
        if (zzach.equals(this.zzawq, zzkwVar.zzawq)) {
            return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkwVar.zzbzd == null || zzkwVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkwVar.zzbzd);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        Integer num = this.zzaux;
        int i = 0;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + zzach.hashCode(this.zzawq)) * 31;
        if (this.zzbzd != null && !this.zzbzd.isEmpty()) {
            i = this.zzbzd.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        Integer num = this.zzaux;
        if (num != null) {
            zza += zzacb.zzf(1, num.intValue());
        }
        long[] jArr = this.zzawq;
        if (jArr == null || jArr.length <= 0) {
            return zza;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long[] jArr2 = this.zzawq;
            if (i >= jArr2.length) {
                return zza + i2 + (jArr2.length * 1);
            }
            i2 += zzacb.zzat(jArr2[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        Integer num = this.zzaux;
        if (num != null) {
            zzacbVar.zze(1, num.intValue());
        }
        long[] jArr = this.zzawq;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.zzawq;
                if (i >= jArr2.length) {
                    break;
                }
                zzacbVar.zzb(2, jArr2[i]);
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
                this.zzaux = Integer.valueOf(zzacaVar.zzvn());
            } else if (zzvl == 16) {
                int zzb = zzacm.zzb(zzacaVar, 16);
                long[] jArr = this.zzawq;
                int length = jArr == null ? 0 : jArr.length;
                long[] jArr2 = new long[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzawq, 0, jArr2, 0, length);
                }
                while (length < jArr2.length - 1) {
                    jArr2[length] = zzacaVar.zzvo();
                    zzacaVar.zzvl();
                    length++;
                }
                jArr2[length] = zzacaVar.zzvo();
                this.zzawq = jArr2;
            } else if (zzvl == 18) {
                int zzaf = zzacaVar.zzaf(zzacaVar.zzvn());
                int position = zzacaVar.getPosition();
                int i = 0;
                while (zzacaVar.zzvr() > 0) {
                    zzacaVar.zzvo();
                    i++;
                }
                zzacaVar.zzam(position);
                long[] jArr3 = this.zzawq;
                int length2 = jArr3 == null ? 0 : jArr3.length;
                long[] jArr4 = new long[i + length2];
                if (length2 != 0) {
                    System.arraycopy(this.zzawq, 0, jArr4, 0, length2);
                }
                while (length2 < jArr4.length) {
                    jArr4[length2] = zzacaVar.zzvo();
                    length2++;
                }
                this.zzawq = jArr4;
                zzacaVar.zzal(zzaf);
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
