package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzf extends zzgn<zzf> {
    private static volatile zzf[] zze;
    private String zzf = "";
    private String value = "";

    public zzf() {
        this.zzya = -1;
    }

    public static zzf[] zza() {
        if (zze == null) {
            synchronized (zzgr.zzxz) {
                if (zze == null) {
                    zze = new zzf[0];
                }
            }
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgt
    public final /* synthetic */ zzgt zza(zzgk zzgkVar) throws IOException {
        while (true) {
            int zzcc = zzgkVar.zzcc();
            if (zzcc == 0) {
                return this;
            }
            if (zzcc == 10) {
                this.zzf = zzgkVar.readString();
            } else if (zzcc == 18) {
                this.value = zzgkVar.readString();
            } else if (!super.zza(zzgkVar, zzcc)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    public final void zza(zzgl zzglVar) throws IOException {
        String str = this.zzf;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzf);
        }
        String str2 = this.value;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(2, this.value);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int zzb = super.zzb();
        String str = this.zzf;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(1, this.zzf);
        }
        String str2 = this.value;
        return (str2 == null || str2.equals("")) ? zzb : zzb + zzgl.zzb(2, this.value);
    }
}
