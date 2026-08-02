package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzgz extends zzgn<zzgz> {
    public String zzjm = "";
    private String zzgu = "";
    public String zzai = "";
    public String zzjo = "";
    private String zzyl = "";

    public zzgz() {
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
                this.zzjm = zzgkVar.readString();
            } else if (zzcc == 18) {
                this.zzgu = zzgkVar.readString();
            } else if (zzcc == 26) {
                this.zzai = zzgkVar.readString();
            } else if (zzcc == 34) {
                this.zzjo = zzgkVar.readString();
            } else if (zzcc == 42) {
                this.zzyl = zzgkVar.readString();
            } else if (!super.zza(zzgkVar, zzcc)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    public final void zza(zzgl zzglVar) throws IOException {
        String str = this.zzjm;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzjm);
        }
        String str2 = this.zzgu;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(2, this.zzgu);
        }
        String str3 = this.zzai;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(3, this.zzai);
        }
        String str4 = this.zzjo;
        if (str4 != null && !str4.equals("")) {
            zzglVar.zza(4, this.zzjo);
        }
        String str5 = this.zzyl;
        if (str5 != null && !str5.equals("")) {
            zzglVar.zza(5, this.zzyl);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int zzb = super.zzb();
        String str = this.zzjm;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(1, this.zzjm);
        }
        String str2 = this.zzgu;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(2, this.zzgu);
        }
        String str3 = this.zzai;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(3, this.zzai);
        }
        String str4 = this.zzjo;
        if (str4 != null && !str4.equals("")) {
            zzb += zzgl.zzb(4, this.zzjo);
        }
        String str5 = this.zzyl;
        return (str5 == null || str5.equals("")) ? zzb : zzb + zzgl.zzb(5, this.zzyl);
    }
}
