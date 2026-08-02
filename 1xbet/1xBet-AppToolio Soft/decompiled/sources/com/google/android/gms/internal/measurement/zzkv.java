package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkv extends zzacd<zzkv> {
    public long[] zzawl = zzacm.zzbzt;
    public long[] zzawm = zzacm.zzbzt;
    public zzkq[] zzawn = zzkq.zzlx();
    private zzkw[] zzawo = zzkw.zzmb();

    public zzkv() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkv)) {
            return false;
        }
        zzkv zzkvVar = (zzkv) obj;
        if (zzach.equals(this.zzawl, zzkvVar.zzawl) && zzach.equals(this.zzawm, zzkvVar.zzawm) && zzach.equals(this.zzawn, zzkvVar.zzawn) && zzach.equals(this.zzawo, zzkvVar.zzawo)) {
            return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzkvVar.zzbzd == null || zzkvVar.zzbzd.isEmpty() : this.zzbzd.equals(zzkvVar.zzbzd);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((getClass().getName().hashCode() + 527) * 31) + zzach.hashCode(this.zzawl)) * 31) + zzach.hashCode(this.zzawm)) * 31) + zzach.hashCode(this.zzawn)) * 31) + zzach.hashCode(this.zzawo)) * 31) + ((this.zzbzd == null || this.zzbzd.isEmpty()) ? 0 : this.zzbzd.hashCode());
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        long[] jArr;
        long[] jArr2;
        int zza = super.zza();
        long[] jArr3 = this.zzawl;
        int i = 0;
        if (jArr3 != null && jArr3.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                jArr2 = this.zzawl;
                if (i2 >= jArr2.length) {
                    break;
                }
                i3 += zzacb.zzat(jArr2[i2]);
                i2++;
            }
            zza = zza + i3 + (jArr2.length * 1);
        }
        long[] jArr4 = this.zzawm;
        if (jArr4 != null && jArr4.length > 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                jArr = this.zzawm;
                if (i4 >= jArr.length) {
                    break;
                }
                i5 += zzacb.zzat(jArr[i4]);
                i4++;
            }
            zza = zza + i5 + (jArr.length * 1);
        }
        zzkq[] zzkqVarArr = this.zzawn;
        if (zzkqVarArr != null && zzkqVarArr.length > 0) {
            int i6 = zza;
            int i7 = 0;
            while (true) {
                zzkq[] zzkqVarArr2 = this.zzawn;
                if (i7 >= zzkqVarArr2.length) {
                    break;
                }
                zzkq zzkqVar = zzkqVarArr2[i7];
                if (zzkqVar != null) {
                    i6 += zzacb.zzb(3, zzkqVar);
                }
                i7++;
            }
            zza = i6;
        }
        zzkw[] zzkwVarArr = this.zzawo;
        if (zzkwVarArr != null && zzkwVarArr.length > 0) {
            while (true) {
                zzkw[] zzkwVarArr2 = this.zzawo;
                if (i >= zzkwVarArr2.length) {
                    break;
                }
                zzkw zzkwVar = zzkwVarArr2[i];
                if (zzkwVar != null) {
                    zza += zzacb.zzb(4, zzkwVar);
                }
                i++;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        long[] jArr = this.zzawl;
        int i = 0;
        if (jArr != null && jArr.length > 0) {
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.zzawl;
                if (i2 >= jArr2.length) {
                    break;
                }
                zzacbVar.zza(1, jArr2[i2]);
                i2++;
            }
        }
        long[] jArr3 = this.zzawm;
        if (jArr3 != null && jArr3.length > 0) {
            int i3 = 0;
            while (true) {
                long[] jArr4 = this.zzawm;
                if (i3 >= jArr4.length) {
                    break;
                }
                zzacbVar.zza(2, jArr4[i3]);
                i3++;
            }
        }
        zzkq[] zzkqVarArr = this.zzawn;
        if (zzkqVarArr != null && zzkqVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                zzkq[] zzkqVarArr2 = this.zzawn;
                if (i4 >= zzkqVarArr2.length) {
                    break;
                }
                zzkq zzkqVar = zzkqVarArr2[i4];
                if (zzkqVar != null) {
                    zzacbVar.zza(3, zzkqVar);
                }
                i4++;
            }
        }
        zzkw[] zzkwVarArr = this.zzawo;
        if (zzkwVarArr != null && zzkwVarArr.length > 0) {
            while (true) {
                zzkw[] zzkwVarArr2 = this.zzawo;
                if (i >= zzkwVarArr2.length) {
                    break;
                }
                zzkw zzkwVar = zzkwVarArr2[i];
                if (zzkwVar != null) {
                    zzacbVar.zza(4, zzkwVar);
                }
                i++;
            }
        }
        super.zza(zzacbVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public final /* synthetic */ zzacj zzb(zzaca zzacaVar) throws IOException {
        int zzaf;
        while (true) {
            int zzvl = zzacaVar.zzvl();
            if (zzvl == 0) {
                return this;
            }
            if (zzvl != 8) {
                if (zzvl == 10) {
                    zzaf = zzacaVar.zzaf(zzacaVar.zzvn());
                    int position = zzacaVar.getPosition();
                    int i = 0;
                    while (zzacaVar.zzvr() > 0) {
                        zzacaVar.zzvo();
                        i++;
                    }
                    zzacaVar.zzam(position);
                    long[] jArr = this.zzawl;
                    int length = jArr == null ? 0 : jArr.length;
                    long[] jArr2 = new long[i + length];
                    if (length != 0) {
                        System.arraycopy(this.zzawl, 0, jArr2, 0, length);
                    }
                    while (length < jArr2.length) {
                        jArr2[length] = zzacaVar.zzvo();
                        length++;
                    }
                    this.zzawl = jArr2;
                } else if (zzvl == 16) {
                    int zzb = zzacm.zzb(zzacaVar, 16);
                    long[] jArr3 = this.zzawm;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    long[] jArr4 = new long[zzb + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzawm, 0, jArr4, 0, length2);
                    }
                    while (length2 < jArr4.length - 1) {
                        jArr4[length2] = zzacaVar.zzvo();
                        zzacaVar.zzvl();
                        length2++;
                    }
                    jArr4[length2] = zzacaVar.zzvo();
                    this.zzawm = jArr4;
                } else if (zzvl == 18) {
                    zzaf = zzacaVar.zzaf(zzacaVar.zzvn());
                    int position2 = zzacaVar.getPosition();
                    int i2 = 0;
                    while (zzacaVar.zzvr() > 0) {
                        zzacaVar.zzvo();
                        i2++;
                    }
                    zzacaVar.zzam(position2);
                    long[] jArr5 = this.zzawm;
                    int length3 = jArr5 == null ? 0 : jArr5.length;
                    long[] jArr6 = new long[i2 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.zzawm, 0, jArr6, 0, length3);
                    }
                    while (length3 < jArr6.length) {
                        jArr6[length3] = zzacaVar.zzvo();
                        length3++;
                    }
                    this.zzawm = jArr6;
                } else if (zzvl == 26) {
                    int zzb2 = zzacm.zzb(zzacaVar, 26);
                    zzkq[] zzkqVarArr = this.zzawn;
                    int length4 = zzkqVarArr == null ? 0 : zzkqVarArr.length;
                    zzkq[] zzkqVarArr2 = new zzkq[zzb2 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.zzawn, 0, zzkqVarArr2, 0, length4);
                    }
                    while (length4 < zzkqVarArr2.length - 1) {
                        zzkqVarArr2[length4] = new zzkq();
                        zzacaVar.zza(zzkqVarArr2[length4]);
                        zzacaVar.zzvl();
                        length4++;
                    }
                    zzkqVarArr2[length4] = new zzkq();
                    zzacaVar.zza(zzkqVarArr2[length4]);
                    this.zzawn = zzkqVarArr2;
                } else if (zzvl == 34) {
                    int zzb3 = zzacm.zzb(zzacaVar, 34);
                    zzkw[] zzkwVarArr = this.zzawo;
                    int length5 = zzkwVarArr == null ? 0 : zzkwVarArr.length;
                    zzkw[] zzkwVarArr2 = new zzkw[zzb3 + length5];
                    if (length5 != 0) {
                        System.arraycopy(this.zzawo, 0, zzkwVarArr2, 0, length5);
                    }
                    while (length5 < zzkwVarArr2.length - 1) {
                        zzkwVarArr2[length5] = new zzkw();
                        zzacaVar.zza(zzkwVarArr2[length5]);
                        zzacaVar.zzvl();
                        length5++;
                    }
                    zzkwVarArr2[length5] = new zzkw();
                    zzacaVar.zza(zzkwVarArr2[length5]);
                    this.zzawo = zzkwVarArr2;
                } else if (!super.zza(zzacaVar, zzvl)) {
                    return this;
                }
                zzacaVar.zzal(zzaf);
            } else {
                int zzb4 = zzacm.zzb(zzacaVar, 8);
                long[] jArr7 = this.zzawl;
                int length6 = jArr7 == null ? 0 : jArr7.length;
                long[] jArr8 = new long[zzb4 + length6];
                if (length6 != 0) {
                    System.arraycopy(this.zzawl, 0, jArr8, 0, length6);
                }
                while (length6 < jArr8.length - 1) {
                    jArr8[length6] = zzacaVar.zzvo();
                    zzacaVar.zzvl();
                    length6++;
                }
                jArr8[length6] = zzacaVar.zzvo();
                this.zzawl = jArr8;
            }
        }
    }
}
