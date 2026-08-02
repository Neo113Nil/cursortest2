package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzkt extends zzacd<zzkt> {
    public zzku[] zzavf = zzku.zzma();

    public zzkt() {
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzkt)) {
            return false;
        }
        zzkt zzktVar = (zzkt) obj;
        if (zzach.equals(this.zzavf, zzktVar.zzavf)) {
            return (this.zzbzd == null || this.zzbzd.isEmpty()) ? zzktVar.zzbzd == null || zzktVar.zzbzd.isEmpty() : this.zzbzd.equals(zzktVar.zzbzd);
        }
        return false;
    }

    public final int hashCode() {
        return ((((getClass().getName().hashCode() + 527) * 31) + zzach.hashCode(this.zzavf)) * 31) + ((this.zzbzd == null || this.zzbzd.isEmpty()) ? 0 : this.zzbzd.hashCode());
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    protected final int zza() {
        int zza = super.zza();
        zzku[] zzkuVarArr = this.zzavf;
        if (zzkuVarArr != null && zzkuVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzku[] zzkuVarArr2 = this.zzavf;
                if (i >= zzkuVarArr2.length) {
                    break;
                }
                zzku zzkuVar = zzkuVarArr2[i];
                if (zzkuVar != null) {
                    zza += zzacb.zzb(1, zzkuVar);
                }
                i++;
            }
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzacd, com.google.android.gms.internal.measurement.zzacj
    public final void zza(zzacb zzacbVar) throws IOException {
        zzku[] zzkuVarArr = this.zzavf;
        if (zzkuVarArr != null && zzkuVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzku[] zzkuVarArr2 = this.zzavf;
                if (i >= zzkuVarArr2.length) {
                    break;
                }
                zzku zzkuVar = zzkuVarArr2[i];
                if (zzkuVar != null) {
                    zzacbVar.zza(1, zzkuVar);
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
            if (zzvl == 10) {
                int zzb = zzacm.zzb(zzacaVar, 10);
                zzku[] zzkuVarArr = this.zzavf;
                int length = zzkuVarArr == null ? 0 : zzkuVarArr.length;
                zzku[] zzkuVarArr2 = new zzku[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzavf, 0, zzkuVarArr2, 0, length);
                }
                while (length < zzkuVarArr2.length - 1) {
                    zzkuVarArr2[length] = new zzku();
                    zzacaVar.zza(zzkuVarArr2[length]);
                    zzacaVar.zzvl();
                    length++;
                }
                zzkuVarArr2[length] = new zzku();
                zzacaVar.zza(zzkuVarArr2[length]);
                this.zzavf = zzkuVarArr2;
            } else if (!super.zza(zzacaVar, zzvl)) {
                return this;
            }
        }
    }
}
