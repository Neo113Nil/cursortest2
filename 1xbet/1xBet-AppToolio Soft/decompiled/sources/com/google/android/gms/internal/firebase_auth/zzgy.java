package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzgy {

    public static final class zza extends zzgn<zza> {
        public String zzdv = "";
        public long zzaj = 0;
        public String zzjy = "";
        public String zzai = "";
        private String zzaf = "";
        private String zzkv = "";
        private long zzym = 0;

        public zza() {
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
                    this.zzdv = zzgkVar.readString();
                } else if (zzcc == 16) {
                    this.zzaj = zzgkVar.zzce();
                } else if (zzcc == 26) {
                    this.zzjy = zzgkVar.readString();
                } else if (zzcc == 34) {
                    this.zzai = zzgkVar.readString();
                } else if (zzcc == 42) {
                    this.zzaf = zzgkVar.readString();
                } else if (zzcc == 50) {
                    this.zzkv = zzgkVar.readString();
                } else if (zzcc == 56) {
                    this.zzym = zzgkVar.zzce();
                } else if (!super.zza(zzgkVar, zzcc)) {
                    return this;
                }
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        public final void zza(zzgl zzglVar) throws IOException {
            String str = this.zzdv;
            if (str != null && !str.equals("")) {
                zzglVar.zza(1, this.zzdv);
            }
            long j = this.zzaj;
            if (j != 0) {
                zzglVar.zzi(2, j);
            }
            String str2 = this.zzjy;
            if (str2 != null && !str2.equals("")) {
                zzglVar.zza(3, this.zzjy);
            }
            String str3 = this.zzai;
            if (str3 != null && !str3.equals("")) {
                zzglVar.zza(4, this.zzai);
            }
            String str4 = this.zzaf;
            if (str4 != null && !str4.equals("")) {
                zzglVar.zza(5, this.zzaf);
            }
            String str5 = this.zzkv;
            if (str5 != null && !str5.equals("")) {
                zzglVar.zza(6, this.zzkv);
            }
            long j2 = this.zzym;
            if (j2 != 0) {
                zzglVar.zzi(7, j2);
            }
            super.zza(zzglVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        protected final int zzb() {
            int zzb = super.zzb();
            String str = this.zzdv;
            if (str != null && !str.equals("")) {
                zzb += zzgl.zzb(1, this.zzdv);
            }
            long j = this.zzaj;
            if (j != 0) {
                zzb += zzgl.zzd(2, j);
            }
            String str2 = this.zzjy;
            if (str2 != null && !str2.equals("")) {
                zzb += zzgl.zzb(3, this.zzjy);
            }
            String str3 = this.zzai;
            if (str3 != null && !str3.equals("")) {
                zzb += zzgl.zzb(4, this.zzai);
            }
            String str4 = this.zzaf;
            if (str4 != null && !str4.equals("")) {
                zzb += zzgl.zzb(5, this.zzaf);
            }
            String str5 = this.zzkv;
            if (str5 != null && !str5.equals("")) {
                zzb += zzgl.zzb(6, this.zzkv);
            }
            long j2 = this.zzym;
            return j2 != 0 ? zzb + zzgl.zzd(7, j2) : zzb;
        }
    }
}
