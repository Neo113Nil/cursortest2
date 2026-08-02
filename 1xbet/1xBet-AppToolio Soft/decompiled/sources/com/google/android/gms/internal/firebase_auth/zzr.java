package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzr extends zzgn<zzr> {
    public String zzdh = "";
    private String zzbq = "";
    public boolean zzbt = false;
    private long zzae = 0;

    public zzr() {
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
                this.zzdh = zzgkVar.readString();
            } else if (zzcc == 18) {
                this.zzbq = zzgkVar.readString();
            } else if (zzcc == 24) {
                this.zzbt = zzgkVar.zzci();
            } else if (zzcc == 32) {
                this.zzae = zzgkVar.zzcv();
            } else if (!super.zza(zzgkVar, zzcc)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    public final void zza(zzgl zzglVar) throws IOException {
        String str = this.zzdh;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzdh);
        }
        String str2 = this.zzbq;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(2, this.zzbq);
        }
        boolean z = this.zzbt;
        if (z) {
            zzglVar.zzb(3, z);
        }
        long j = this.zzae;
        if (j != 0) {
            zzglVar.zzi(4, j);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int zzb = super.zzb();
        String str = this.zzdh;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(1, this.zzdh);
        }
        String str2 = this.zzbq;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(2, this.zzbq);
        }
        if (this.zzbt) {
            zzb += zzgl.zzaa(3) + 1;
        }
        long j = this.zzae;
        return j != 0 ? zzb + zzgl.zzd(4, j) : zzb;
    }
}
