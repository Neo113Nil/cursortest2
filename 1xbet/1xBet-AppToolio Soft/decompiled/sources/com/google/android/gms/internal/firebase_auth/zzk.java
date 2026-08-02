package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzk extends zzgn<zzk> {
    public String zzaf = "";
    private String[] zzal = zzgw.EMPTY_STRING_ARRAY;
    private String[] zzam = zzgw.EMPTY_STRING_ARRAY;
    private long zzae = 0;

    public zzk() {
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
                this.zzaf = zzgkVar.readString();
            } else if (zzcc == 18) {
                int zzb = zzgw.zzb(zzgkVar, 18);
                String[] strArr = this.zzal;
                int length = strArr == null ? 0 : strArr.length;
                String[] strArr2 = new String[zzb + length];
                if (length != 0) {
                    System.arraycopy(this.zzal, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = zzgkVar.readString();
                    zzgkVar.zzcc();
                    length++;
                }
                strArr2[length] = zzgkVar.readString();
                this.zzal = strArr2;
            } else if (zzcc == 26) {
                int zzb2 = zzgw.zzb(zzgkVar, 26);
                String[] strArr3 = this.zzam;
                int length2 = strArr3 == null ? 0 : strArr3.length;
                String[] strArr4 = new String[zzb2 + length2];
                if (length2 != 0) {
                    System.arraycopy(this.zzam, 0, strArr4, 0, length2);
                }
                while (length2 < strArr4.length - 1) {
                    strArr4[length2] = zzgkVar.readString();
                    zzgkVar.zzcc();
                    length2++;
                }
                strArr4[length2] = zzgkVar.readString();
                this.zzam = strArr4;
            } else if (zzcc == 32) {
                this.zzae = zzgkVar.zzcv();
            } else if (!super.zza(zzgkVar, zzcc)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    public final void zza(zzgl zzglVar) throws IOException {
        String str = this.zzaf;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzaf);
        }
        String[] strArr = this.zzal;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.zzal;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    zzglVar.zza(2, str2);
                }
                i2++;
            }
        }
        String[] strArr3 = this.zzam;
        if (strArr3 != null && strArr3.length > 0) {
            while (true) {
                String[] strArr4 = this.zzam;
                if (i >= strArr4.length) {
                    break;
                }
                String str3 = strArr4[i];
                if (str3 != null) {
                    zzglVar.zza(3, str3);
                }
                i++;
            }
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
        String str = this.zzaf;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(1, this.zzaf);
        }
        String[] strArr = this.zzal;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.zzal;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str2 = strArr2[i2];
                if (str2 != null) {
                    i4++;
                    i3 += zzgl.zzam(str2);
                }
                i2++;
            }
            zzb = zzb + i3 + (i4 * 1);
        }
        String[] strArr3 = this.zzam;
        if (strArr3 != null && strArr3.length > 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.zzam;
                if (i >= strArr4.length) {
                    break;
                }
                String str3 = strArr4[i];
                if (str3 != null) {
                    i6++;
                    i5 += zzgl.zzam(str3);
                }
                i++;
            }
            zzb = zzb + i5 + (i6 * 1);
        }
        long j = this.zzae;
        return j != 0 ? zzb + zzgl.zzd(4, j) : zzb;
    }
}
