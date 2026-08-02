package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzu extends zzgn<zzu> {
    private static volatile zzu[] zzdl;
    public String zzad = "";
    public String zzah = "";
    public String zzbh = "";
    private String[] zzbj = zzgw.EMPTY_STRING_ARRAY;
    private String zzcl = "";
    public String zzbr = "";
    private String zzcm = "";
    private String zzcn = "";
    private byte[] zzdm = zzgw.zzyk;
    private byte[] zzdn = zzgw.zzyk;
    private int version = 0;
    public boolean zzbk = false;
    private long zzdo = 0;
    public zzt[] zzbx = zzt.zzc();
    private long zzdp = 0;
    private boolean zzbz = false;
    public long zzbv = 0;
    public long zzbw = 0;
    private String zzde = "";
    private boolean zzdq = false;
    public String zzdr = "";
    public String zzbd = "";

    public zzu() {
        this.zzya = -1;
    }

    public static zzu[] zzd() {
        if (zzdl == null) {
            synchronized (zzgr.zzxz) {
                if (zzdl == null) {
                    zzdl = new zzu[0];
                }
            }
        }
        return zzdl;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgt
    public final /* synthetic */ zzgt zza(zzgk zzgkVar) throws IOException {
        while (true) {
            int zzcc = zzgkVar.zzcc();
            switch (zzcc) {
                case 0:
                    return this;
                case 10:
                    this.zzad = zzgkVar.readString();
                    break;
                case 18:
                    this.zzah = zzgkVar.readString();
                    break;
                case 26:
                    this.zzbh = zzgkVar.readString();
                    break;
                case 34:
                    int zzb = zzgw.zzb(zzgkVar, 34);
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
                case 42:
                    this.zzcl = zzgkVar.readString();
                    break;
                case 50:
                    this.zzbr = zzgkVar.readString();
                    break;
                case 58:
                    this.zzcm = zzgkVar.readString();
                    break;
                case 66:
                    this.zzcn = zzgkVar.readString();
                    break;
                case 74:
                    this.zzdm = zzgkVar.readBytes();
                    break;
                case 82:
                    this.zzdn = zzgkVar.readBytes();
                    break;
                case 88:
                    this.version = zzgkVar.zzcu();
                    break;
                case 96:
                    this.zzbk = zzgkVar.zzci();
                    break;
                case 104:
                    this.zzdo = zzgkVar.zzcv();
                    break;
                case 114:
                    int zzb2 = zzgw.zzb(zzgkVar, 114);
                    zzt[] zztVarArr = this.zzbx;
                    int length2 = zztVarArr == null ? 0 : zztVarArr.length;
                    zzt[] zztVarArr2 = new zzt[zzb2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzbx, 0, zztVarArr2, 0, length2);
                    }
                    while (length2 < zztVarArr2.length - 1) {
                        zztVarArr2[length2] = new zzt();
                        zzgkVar.zzb(zztVarArr2[length2]);
                        zzgkVar.zzcc();
                        length2++;
                    }
                    zztVarArr2[length2] = new zzt();
                    zzgkVar.zzb(zztVarArr2[length2]);
                    this.zzbx = zztVarArr2;
                    break;
                case 120:
                    this.zzdp = zzgkVar.zzcv();
                    break;
                case 128:
                    this.zzbz = zzgkVar.zzci();
                    break;
                case 136:
                    this.zzbv = zzgkVar.zzcv();
                    break;
                case 144:
                    this.zzbw = zzgkVar.zzcv();
                    break;
                case 154:
                    this.zzde = zzgkVar.readString();
                    break;
                case 160:
                    this.zzdq = zzgkVar.zzci();
                    break;
                case 170:
                    this.zzdr = zzgkVar.readString();
                    break;
                case 178:
                    this.zzbd = zzgkVar.readString();
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
        String str = this.zzad;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzad);
        }
        String str2 = this.zzah;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(2, this.zzah);
        }
        String str3 = this.zzbh;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(3, this.zzbh);
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
                String str4 = strArr2[i2];
                if (str4 != null) {
                    zzglVar.zza(4, str4);
                }
                i2++;
            }
        }
        String str5 = this.zzcl;
        if (str5 != null && !str5.equals("")) {
            zzglVar.zza(5, this.zzcl);
        }
        String str6 = this.zzbr;
        if (str6 != null && !str6.equals("")) {
            zzglVar.zza(6, this.zzbr);
        }
        String str7 = this.zzcm;
        if (str7 != null && !str7.equals("")) {
            zzglVar.zza(7, this.zzcm);
        }
        String str8 = this.zzcn;
        if (str8 != null && !str8.equals("")) {
            zzglVar.zza(8, this.zzcn);
        }
        if (!Arrays.equals(this.zzdm, zzgw.zzyk)) {
            zzglVar.zza(9, this.zzdm);
        }
        if (!Arrays.equals(this.zzdn, zzgw.zzyk)) {
            zzglVar.zza(10, this.zzdn);
        }
        int i3 = this.version;
        if (i3 != 0) {
            zzglVar.zzc(11, i3);
        }
        boolean z = this.zzbk;
        if (z) {
            zzglVar.zzb(12, z);
        }
        long j = this.zzdo;
        if (j != 0) {
            zzglVar.zzi(13, j);
        }
        zzt[] zztVarArr = this.zzbx;
        if (zztVarArr != null && zztVarArr.length > 0) {
            while (true) {
                zzt[] zztVarArr2 = this.zzbx;
                if (i >= zztVarArr2.length) {
                    break;
                }
                zzt zztVar = zztVarArr2[i];
                if (zztVar != null) {
                    zzglVar.zza(14, zztVar);
                }
                i++;
            }
        }
        long j2 = this.zzdp;
        if (j2 != 0) {
            zzglVar.zzi(15, j2);
        }
        boolean z2 = this.zzbz;
        if (z2) {
            zzglVar.zzb(16, z2);
        }
        long j3 = this.zzbv;
        if (j3 != 0) {
            zzglVar.zzi(17, j3);
        }
        long j4 = this.zzbw;
        if (j4 != 0) {
            zzglVar.zzi(18, j4);
        }
        String str9 = this.zzde;
        if (str9 != null && !str9.equals("")) {
            zzglVar.zza(19, this.zzde);
        }
        boolean z3 = this.zzdq;
        if (z3) {
            zzglVar.zzb(20, z3);
        }
        String str10 = this.zzdr;
        if (str10 != null && !str10.equals("")) {
            zzglVar.zza(21, this.zzdr);
        }
        String str11 = this.zzbd;
        if (str11 != null && !str11.equals("")) {
            zzglVar.zza(22, this.zzbd);
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
        String str2 = this.zzah;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(2, this.zzah);
        }
        String str3 = this.zzbh;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(3, this.zzbh);
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
                String str4 = strArr2[i2];
                if (str4 != null) {
                    i4++;
                    i3 += zzgl.zzam(str4);
                }
                i2++;
            }
            zzb = zzb + i3 + (i4 * 1);
        }
        String str5 = this.zzcl;
        if (str5 != null && !str5.equals("")) {
            zzb += zzgl.zzb(5, this.zzcl);
        }
        String str6 = this.zzbr;
        if (str6 != null && !str6.equals("")) {
            zzb += zzgl.zzb(6, this.zzbr);
        }
        String str7 = this.zzcm;
        if (str7 != null && !str7.equals("")) {
            zzb += zzgl.zzb(7, this.zzcm);
        }
        String str8 = this.zzcn;
        if (str8 != null && !str8.equals("")) {
            zzb += zzgl.zzb(8, this.zzcn);
        }
        if (!Arrays.equals(this.zzdm, zzgw.zzyk)) {
            zzb += zzgl.zzb(9, this.zzdm);
        }
        if (!Arrays.equals(this.zzdn, zzgw.zzyk)) {
            zzb += zzgl.zzb(10, this.zzdn);
        }
        int i5 = this.version;
        if (i5 != 0) {
            zzb += zzgl.zzg(11, i5);
        }
        if (this.zzbk) {
            zzb += zzgl.zzaa(12) + 1;
        }
        long j = this.zzdo;
        if (j != 0) {
            zzb += zzgl.zzd(13, j);
        }
        zzt[] zztVarArr = this.zzbx;
        if (zztVarArr != null && zztVarArr.length > 0) {
            while (true) {
                zzt[] zztVarArr2 = this.zzbx;
                if (i >= zztVarArr2.length) {
                    break;
                }
                zzt zztVar = zztVarArr2[i];
                if (zztVar != null) {
                    zzb += zzgl.zzb(14, zztVar);
                }
                i++;
            }
        }
        long j2 = this.zzdp;
        if (j2 != 0) {
            zzb += zzgl.zzd(15, j2);
        }
        if (this.zzbz) {
            zzb += zzgl.zzaa(16) + 1;
        }
        long j3 = this.zzbv;
        if (j3 != 0) {
            zzb += zzgl.zzd(17, j3);
        }
        long j4 = this.zzbw;
        if (j4 != 0) {
            zzb += zzgl.zzd(18, j4);
        }
        String str9 = this.zzde;
        if (str9 != null && !str9.equals("")) {
            zzb += zzgl.zzb(19, this.zzde);
        }
        if (this.zzdq) {
            zzb += zzgl.zzaa(20) + 1;
        }
        String str10 = this.zzdr;
        if (str10 != null && !str10.equals("")) {
            zzb += zzgl.zzb(21, this.zzdr);
        }
        String str11 = this.zzbd;
        return (str11 == null || str11.equals("")) ? zzb : zzb + zzgl.zzb(22, this.zzbd);
    }
}
