package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzj extends zzgn<zzj> {
    public String zzag = "";
    public String zzah = "";
    public String zzaf = "";
    private String zzu = "";
    private long zzv = 0;

    public zzj() {
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
                this.zzag = zzgkVar.readString();
            } else if (zzcc == 18) {
                this.zzah = zzgkVar.readString();
            } else if (zzcc == 26) {
                this.zzaf = zzgkVar.readString();
            } else if (zzcc == 50) {
                this.zzu = zzgkVar.readString();
            } else if (zzcc == 56) {
                this.zzv = zzgkVar.zzcv();
            } else if (!super.zza(zzgkVar, zzcc)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    public final void zza(zzgl zzglVar) throws IOException {
        String str = this.zzag;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzag);
        }
        String str2 = this.zzah;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(2, this.zzah);
        }
        String str3 = this.zzaf;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(3, this.zzaf);
        }
        String str4 = this.zzu;
        if (str4 != null && !str4.equals("")) {
            zzglVar.zza(6, this.zzu);
        }
        long j = this.zzv;
        if (j != 0) {
            zzglVar.zza(7, j);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int zzb = super.zzb();
        String str = this.zzag;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(1, this.zzag);
        }
        String str2 = this.zzah;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(2, this.zzah);
        }
        String str3 = this.zzaf;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(3, this.zzaf);
        }
        String str4 = this.zzu;
        if (str4 != null && !str4.equals("")) {
            zzb += zzgl.zzb(6, this.zzu);
        }
        long j = this.zzv;
        return j != 0 ? zzb + zzgl.zze(7, j) : zzb;
    }
}
