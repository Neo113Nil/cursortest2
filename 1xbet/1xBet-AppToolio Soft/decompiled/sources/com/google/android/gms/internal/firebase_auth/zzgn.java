package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzgn;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzgn<M extends zzgn<M>> extends zzgt {
    protected zzgp zzxr;

    @Override // com.google.android.gms.internal.firebase_auth.zzgt
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgn zzgnVar = (zzgn) super.clone();
        zzgr.zza(this, zzgnVar);
        return zzgnVar;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgt
    public void zza(zzgl zzglVar) throws IOException {
        if (this.zzxr == null) {
            return;
        }
        for (int i = 0; i < this.zzxr.size(); i++) {
            this.zzxr.zzbc(i).zza(zzglVar);
        }
    }

    protected final boolean zza(zzgk zzgkVar, int i) throws IOException {
        int position = zzgkVar.getPosition();
        if (!zzgkVar.zzn(i)) {
            return false;
        }
        int i2 = i >>> 3;
        zzgv zzgvVar = new zzgv(i, zzgkVar.zzr(position, zzgkVar.getPosition() - position));
        zzgq zzgqVar = null;
        zzgp zzgpVar = this.zzxr;
        if (zzgpVar == null) {
            this.zzxr = new zzgp();
        } else {
            zzgqVar = zzgpVar.zzbb(i2);
        }
        if (zzgqVar == null) {
            zzgqVar = new zzgq();
            this.zzxr.zza(i2, zzgqVar);
        }
        zzgqVar.zza(zzgvVar);
        return true;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgt
    protected int zzb() {
        if (this.zzxr == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzxr.size(); i2++) {
            i += this.zzxr.zzbc(i2).zzb();
        }
        return i;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgt
    /* renamed from: zzgn */
    public final /* synthetic */ zzgt clone() throws CloneNotSupportedException {
        return (zzgn) clone();
    }
}
