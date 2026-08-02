package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzn extends zzgn<zzn> {
    public String zzbd = "";
    private String zzbe = "";
    private String zzbf = "";
    private String zzbg = "";

    public zzn() {
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
                this.zzbd = zzgkVar.readString();
            } else if (zzcc == 18) {
                this.zzbe = zzgkVar.readString();
            } else if (zzcc == 26) {
                this.zzbf = zzgkVar.readString();
            } else if (zzcc == 34) {
                this.zzbg = zzgkVar.readString();
            } else if (!super.zza(zzgkVar, zzcc)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    public final void zza(zzgl zzglVar) throws IOException {
        String str = this.zzbd;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzbd);
        }
        String str2 = this.zzbe;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(2, this.zzbe);
        }
        String str3 = this.zzbf;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(3, this.zzbf);
        }
        String str4 = this.zzbg;
        if (str4 != null && !str4.equals("")) {
            zzglVar.zza(4, this.zzbg);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int zzb = super.zzb();
        String str = this.zzbd;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(1, this.zzbd);
        }
        String str2 = this.zzbe;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(2, this.zzbe);
        }
        String str3 = this.zzbf;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(3, this.zzbf);
        }
        String str4 = this.zzbg;
        return (str4 == null || str4.equals("")) ? zzb : zzb + zzgl.zzb(4, this.zzbg);
    }
}
