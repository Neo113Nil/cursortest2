package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzo extends zzgn<zzo> {
    private zzfm zzbo;
    public String zzaf = "";
    private String zzad = "";
    public String zzbh = "";
    public String zzah = "";
    public String zzbi = "";
    private String[] zzbj = zzgw.EMPTY_STRING_ARRAY;
    public String zzag = "";
    private boolean zzbk = false;
    private boolean zzbl = false;
    private String zzbm = "";
    private String zzbn = "";
    private boolean zzbp = false;
    private String zzbq = "";
    private long zzae = 0;
    public String zzbr = "";
    public int[] zzbs = zzgw.zzti;
    public boolean zzbt = false;
    public String[] zzbu = zzgw.EMPTY_STRING_ARRAY;
    private long zzbv = 0;
    private long zzbw = 0;

    public zzo() {
        this.zzya = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.firebase_auth.zzgt
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzo zza(zzgk zzgkVar) throws IOException {
        while (true) {
            int zzcc = zzgkVar.zzcc();
            switch (zzcc) {
                case 0:
                    return this;
                case 18:
                    this.zzaf = zzgkVar.readString();
                    break;
                case 26:
                    this.zzad = zzgkVar.readString();
                    break;
                case 34:
                    this.zzbh = zzgkVar.readString();
                    break;
                case 42:
                    this.zzah = zzgkVar.readString();
                    break;
                case 50:
                    this.zzbi = zzgkVar.readString();
                    break;
                case 58:
                    int zzb = zzgw.zzb(zzgkVar, 58);
                    String[] strArr = this.zzbj;
                    int length = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzbj, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = zzgkVar.readString();
                        zzgkVar.zzcc();
                        length++;
                    }
                    strArr2[length] = zzgkVar.readString();
                    this.zzbj = strArr2;
                    break;
                case 66:
                    this.zzag = zzgkVar.readString();
                    break;
                case 72:
                    this.zzbk = zzgkVar.zzci();
                    break;
                case 80:
                    this.zzbl = zzgkVar.zzci();
                    break;
                case 90:
                    this.zzbm = zzgkVar.readString();
                    break;
                case 98:
                    this.zzbn = zzgkVar.readString();
                    break;
                case 106:
                    this.zzbo = (zzfm) zzgkVar.zza(zzfm.zzfw());
                    break;
                case 112:
                    this.zzbp = zzgkVar.zzci();
                    break;
                case 122:
                    this.zzbq = zzgkVar.readString();
                    break;
                case 128:
                    this.zzae = zzgkVar.zzcv();
                    break;
                case 138:
                    this.zzbr = zzgkVar.readString();
                    break;
                case 144:
                    int zzb2 = zzgw.zzb(zzgkVar, 144);
                    int[] iArr = new int[zzb2];
                    int i = 0;
                    for (int i2 = 0; i2 < zzb2; i2++) {
                        if (i2 != 0) {
                            zzgkVar.zzcc();
                        }
                        int position = zzgkVar.getPosition();
                        try {
                            iArr[i] = zze.zza(zzgkVar.zzcu());
                            i++;
                        } catch (IllegalArgumentException unused) {
                            zzgkVar.zzay(position);
                            zza(zzgkVar, zzcc);
                        }
                    }
                    if (i == 0) {
                        break;
                    } else {
                        int[] iArr2 = this.zzbs;
                        int length2 = iArr2 == null ? 0 : iArr2.length;
                        if (length2 != 0 || i != iArr.length) {
                            int[] iArr3 = new int[length2 + i];
                            if (length2 != 0) {
                                System.arraycopy(this.zzbs, 0, iArr3, 0, length2);
                            }
                            System.arraycopy(iArr, 0, iArr3, length2, i);
                            this.zzbs = iArr3;
                            break;
                        } else {
                            this.zzbs = iArr;
                            break;
                        }
                    }
                case 146:
                    int zzp = zzgkVar.zzp(zzgkVar.zzcu());
                    int position2 = zzgkVar.getPosition();
                    int i3 = 0;
                    while (zzgkVar.zzgl() > 0) {
                        try {
                            zze.zza(zzgkVar.zzcu());
                            i3++;
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    if (i3 != 0) {
                        zzgkVar.zzay(position2);
                        int[] iArr4 = this.zzbs;
                        int length3 = iArr4 == null ? 0 : iArr4.length;
                        int[] iArr5 = new int[i3 + length3];
                        if (length3 != 0) {
                            System.arraycopy(this.zzbs, 0, iArr5, 0, length3);
                        }
                        while (zzgkVar.zzgl() > 0) {
                            int position3 = zzgkVar.getPosition();
                            try {
                                iArr5[length3] = zze.zza(zzgkVar.zzcu());
                                length3++;
                            } catch (IllegalArgumentException unused3) {
                                zzgkVar.zzay(position3);
                                zza(zzgkVar, 144);
                            }
                        }
                        this.zzbs = iArr5;
                    }
                    zzgkVar.zzq(zzp);
                    break;
                case 152:
                    this.zzbt = zzgkVar.zzci();
                    break;
                case 162:
                    int zzb3 = zzgw.zzb(zzgkVar, 162);
                    String[] strArr3 = this.zzbu;
                    int length4 = strArr3 == null ? 0 : strArr3.length;
                    String[] strArr4 = new String[zzb3 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.zzbu, 0, strArr4, 0, length4);
                    }
                    while (length4 < strArr4.length - 1) {
                        strArr4[length4] = zzgkVar.readString();
                        zzgkVar.zzcc();
                        length4++;
                    }
                    strArr4[length4] = zzgkVar.readString();
                    this.zzbu = strArr4;
                    break;
                case 168:
                    this.zzbv = zzgkVar.zzcv();
                    break;
                case 176:
                    this.zzbw = zzgkVar.zzcv();
                    break;
                default:
                    if (!super.zza(zzgkVar, zzcc)) {
                        return this;
                    }
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    public final void zza(zzgl zzglVar) throws IOException {
        String str = this.zzaf;
        if (str != null && !str.equals("")) {
            zzglVar.zza(2, this.zzaf);
        }
        String str2 = this.zzad;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(3, this.zzad);
        }
        String str3 = this.zzbh;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(4, this.zzbh);
        }
        String str4 = this.zzah;
        if (str4 != null && !str4.equals("")) {
            zzglVar.zza(5, this.zzah);
        }
        String str5 = this.zzbi;
        if (str5 != null && !str5.equals("")) {
            zzglVar.zza(6, this.zzbi);
        }
        String[] strArr = this.zzbj;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.zzbj;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str6 = strArr2[i2];
                if (str6 != null) {
                    zzglVar.zza(7, str6);
                }
                i2++;
            }
        }
        String str7 = this.zzag;
        if (str7 != null && !str7.equals("")) {
            zzglVar.zza(8, this.zzag);
        }
        boolean z = this.zzbk;
        if (z) {
            zzglVar.zzb(9, z);
        }
        boolean z2 = this.zzbl;
        if (z2) {
            zzglVar.zzb(10, z2);
        }
        String str8 = this.zzbm;
        if (str8 != null && !str8.equals("")) {
            zzglVar.zza(11, this.zzbm);
        }
        String str9 = this.zzbn;
        if (str9 != null && !str9.equals("")) {
            zzglVar.zza(12, this.zzbn);
        }
        zzfm zzfmVar = this.zzbo;
        if (zzfmVar != null) {
            zzglVar.zze(13, zzfmVar);
        }
        boolean z3 = this.zzbp;
        if (z3) {
            zzglVar.zzb(14, z3);
        }
        String str10 = this.zzbq;
        if (str10 != null && !str10.equals("")) {
            zzglVar.zza(15, this.zzbq);
        }
        long j = this.zzae;
        if (j != 0) {
            zzglVar.zzi(16, j);
        }
        String str11 = this.zzbr;
        if (str11 != null && !str11.equals("")) {
            zzglVar.zza(17, this.zzbr);
        }
        int[] iArr = this.zzbs;
        if (iArr != null && iArr.length > 0) {
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.zzbs;
                if (i3 >= iArr2.length) {
                    break;
                }
                zzglVar.zzc(18, iArr2[i3]);
                i3++;
            }
        }
        boolean z4 = this.zzbt;
        if (z4) {
            zzglVar.zzb(19, z4);
        }
        String[] strArr3 = this.zzbu;
        if (strArr3 != null && strArr3.length > 0) {
            while (true) {
                String[] strArr4 = this.zzbu;
                if (i >= strArr4.length) {
                    break;
                }
                String str12 = strArr4[i];
                if (str12 != null) {
                    zzglVar.zza(20, str12);
                }
                i++;
            }
        }
        long j2 = this.zzbv;
        if (j2 != 0) {
            zzglVar.zzi(21, j2);
        }
        long j3 = this.zzbw;
        if (j3 != 0) {
            zzglVar.zzi(22, j3);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int[] iArr;
        int zzb = super.zzb();
        String str = this.zzaf;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(2, this.zzaf);
        }
        String str2 = this.zzad;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(3, this.zzad);
        }
        String str3 = this.zzbh;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(4, this.zzbh);
        }
        String str4 = this.zzah;
        if (str4 != null && !str4.equals("")) {
            zzb += zzgl.zzb(5, this.zzah);
        }
        String str5 = this.zzbi;
        if (str5 != null && !str5.equals("")) {
            zzb += zzgl.zzb(6, this.zzbi);
        }
        String[] strArr = this.zzbj;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.zzbj;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str6 = strArr2[i2];
                if (str6 != null) {
                    i4++;
                    i3 += zzgl.zzam(str6);
                }
                i2++;
            }
            zzb = zzb + i3 + (i4 * 1);
        }
        String str7 = this.zzag;
        if (str7 != null && !str7.equals("")) {
            zzb += zzgl.zzb(8, this.zzag);
        }
        if (this.zzbk) {
            zzb += zzgl.zzaa(9) + 1;
        }
        if (this.zzbl) {
            zzb += zzgl.zzaa(10) + 1;
        }
        String str8 = this.zzbm;
        if (str8 != null && !str8.equals("")) {
            zzb += zzgl.zzb(11, this.zzbm);
        }
        String str9 = this.zzbn;
        if (str9 != null && !str9.equals("")) {
            zzb += zzgl.zzb(12, this.zzbn);
        }
        zzfm zzfmVar = this.zzbo;
        if (zzfmVar != null) {
            zzb += zzci.zzc(13, zzfmVar);
        }
        if (this.zzbp) {
            zzb += zzgl.zzaa(14) + 1;
        }
        String str10 = this.zzbq;
        if (str10 != null && !str10.equals("")) {
            zzb += zzgl.zzb(15, this.zzbq);
        }
        long j = this.zzae;
        if (j != 0) {
            zzb += zzgl.zzd(16, j);
        }
        String str11 = this.zzbr;
        if (str11 != null && !str11.equals("")) {
            zzb += zzgl.zzb(17, this.zzbr);
        }
        int[] iArr2 = this.zzbs;
        if (iArr2 != null && iArr2.length > 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                iArr = this.zzbs;
                if (i5 >= iArr.length) {
                    break;
                }
                i6 += zzgl.zzab(iArr[i5]);
                i5++;
            }
            zzb = zzb + i6 + (iArr.length * 2);
        }
        if (this.zzbt) {
            zzb += zzgl.zzaa(19) + 1;
        }
        String[] strArr3 = this.zzbu;
        if (strArr3 != null && strArr3.length > 0) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr4 = this.zzbu;
                if (i >= strArr4.length) {
                    break;
                }
                String str12 = strArr4[i];
                if (str12 != null) {
                    i8++;
                    i7 += zzgl.zzam(str12);
                }
                i++;
            }
            zzb = zzb + i7 + (i8 * 2);
        }
        long j2 = this.zzbv;
        if (j2 != 0) {
            zzb += zzgl.zzd(21, j2);
        }
        long j3 = this.zzbw;
        return j3 != 0 ? zzb + zzgl.zzd(22, j3) : zzb;
    }
}
