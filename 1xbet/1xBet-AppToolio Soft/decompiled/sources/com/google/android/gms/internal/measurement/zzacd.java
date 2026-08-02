package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzacd;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzacd<M extends zzacd<M>> extends zzacj {
    protected zzacf zzbzd;

    @Override // com.google.android.gms.internal.measurement.zzacj
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzacd zzacdVar = (zzacd) super.clone();
        zzach.zza(this, zzacdVar);
        return zzacdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    protected int zza() {
        if (this.zzbzd == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzbzd.size(); i2++) {
            i += this.zzbzd.zzau(i2).zza();
        }
        return i;
    }

    public final <T> T zza(zzace<M, T> zzaceVar) {
        zzacg zzat;
        zzacf zzacfVar = this.zzbzd;
        if (zzacfVar == null || (zzat = zzacfVar.zzat(zzaceVar.tag >>> 3)) == null) {
            return null;
        }
        return (T) zzat.zzb(zzaceVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    public void zza(zzacb zzacbVar) throws IOException {
        if (this.zzbzd == null) {
            return;
        }
        for (int i = 0; i < this.zzbzd.size(); i++) {
            this.zzbzd.zzau(i).zza(zzacbVar);
        }
    }

    protected final boolean zza(zzaca zzacaVar, int i) throws IOException {
        int position = zzacaVar.getPosition();
        if (!zzacaVar.zzak(i)) {
            return false;
        }
        int i2 = i >>> 3;
        zzacl zzaclVar = new zzacl(i, zzacaVar.zzc(position, zzacaVar.getPosition() - position));
        zzacg zzacgVar = null;
        zzacf zzacfVar = this.zzbzd;
        if (zzacfVar == null) {
            this.zzbzd = new zzacf();
        } else {
            zzacgVar = zzacfVar.zzat(i2);
        }
        if (zzacgVar == null) {
            zzacgVar = new zzacg();
            this.zzbzd.zza(i2, zzacgVar);
        }
        zzacgVar.zza(zzaclVar);
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzacj
    /* renamed from: zzvu */
    public final /* synthetic */ zzacj clone() throws CloneNotSupportedException {
        return (zzacd) clone();
    }
}
