package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzm extends zzgn<zzm> {
    public String zzag = "";
    public String zzba = "";
    private String zzbb = "";
    private String zzah = "";

    public zzm() {
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
                this.zzba = zzgkVar.readString();
            } else if (zzcc == 26) {
                this.zzbb = zzgkVar.readString();
            } else if (zzcc == 34) {
                this.zzah = zzgkVar.readString();
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
        String str2 = this.zzba;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(2, this.zzba);
        }
        String str3 = this.zzbb;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(3, this.zzbb);
        }
        String str4 = this.zzah;
        if (str4 != null && !str4.equals("")) {
            zzglVar.zza(4, this.zzah);
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
        String str2 = this.zzba;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(2, this.zzba);
        }
        String str3 = this.zzbb;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(3, this.zzbb);
        }
        String str4 = this.zzah;
        return (str4 == null || str4.equals("")) ? zzb : zzb + zzgl.zzb(4, this.zzah);
    }
}
