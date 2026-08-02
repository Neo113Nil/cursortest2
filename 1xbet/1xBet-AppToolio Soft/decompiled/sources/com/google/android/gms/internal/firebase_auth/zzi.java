package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzi extends zzgn<zzi> {
    private String zzad = "";
    private long zzae = 0;
    public String zzaf = "";

    public zzi() {
        this.zzya = -1;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgt
    public final /* synthetic */ zzgt zza(zzgk zzgkVar) throws IOException {
        while (true) {
            int zzcc = zzgkVar.zzcc();
            if (zzcc == 0) {
                return this;
            }
            if (zzcc == 10) {
                this.zzad = zzgkVar.readString();
            } else if (zzcc == 16) {
                this.zzae = zzgkVar.zzcv();
            } else if (zzcc == 26) {
                this.zzaf = zzgkVar.readString();
            } else if (!super.zza(zzgkVar, zzcc)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    public final void zza(zzgl zzglVar) throws IOException {
        String str = this.zzad;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzad);
        }
        long j = this.zzae;
        if (j != 0) {
            zzglVar.zzi(2, j);
        }
        String str2 = this.zzaf;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(3, this.zzaf);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int zzb = super.zzb();
        String str = this.zzad;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(1, this.zzad);
        }
        long j = this.zzae;
        if (j != 0) {
            zzb += zzgl.zzd(2, j);
        }
        String str2 = this.zzaf;
        return (str2 == null || str2.equals("")) ? zzb : zzb + zzgl.zzb(3, this.zzaf);
    }
}
