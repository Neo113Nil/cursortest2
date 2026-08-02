package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzh extends zzgn<zzh> {
    public String zzg = "";
    public String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private zzf[] zzt = zzf.zza();
    private String zzu = "";
    private long zzv = 0;

    public zzh() {
        this.zzya = -1;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgt
    public final /* synthetic */ zzgt zza(zzgk zzgkVar) throws IOException {
        while (true) {
            int zzcc = zzgkVar.zzcc();
            switch (zzcc) {
                case 0:
                    return this;
                case 10:
                    this.zzg = zzgkVar.readString();
                    break;
                case 18:
                    this.zzh = zzgkVar.readString();
                    break;
                case 26:
                    this.zzi = zzgkVar.readString();
                    break;
                case 34:
                    this.zzj = zzgkVar.readString();
                    break;
                case 42:
                    this.zzk = zzgkVar.readString();
                    break;
                case 50:
                    this.zzl = zzgkVar.readString();
                    break;
                case 58:
                    this.zzm = zzgkVar.readString();
                    break;
                case 66:
                    this.zzn = zzgkVar.readString();
                    break;
                case 74:
                    this.zzo = zzgkVar.readString();
                    break;
                case 82:
                    this.zzp = zzgkVar.readString();
                    break;
                case 90:
                    this.zzq = zzgkVar.readString();
                    break;
                case 98:
                    this.zzr = zzgkVar.readString();
                    break;
                case 106:
                    this.zzs = zzgkVar.readString();
                    break;
                case 114:
                    int zzb = zzgw.zzb(zzgkVar, 114);
                    zzf[] zzfVarArr = this.zzt;
                    int length = zzfVarArr == null ? 0 : zzfVarArr.length;
                    zzf[] zzfVarArr2 = new zzf[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzt, 0, zzfVarArr2, 0, length);
                    }
                    while (length < zzfVarArr2.length - 1) {
                        zzfVarArr2[length] = new zzf();
                        zzgkVar.zzb(zzfVarArr2[length]);
                        zzgkVar.zzcc();
                        length++;
                    }
                    zzfVarArr2[length] = new zzf();
                    zzgkVar.zzb(zzfVarArr2[length]);
                    this.zzt = zzfVarArr2;
                    break;
                case 122:
                    this.zzu = zzgkVar.readString();
                    break;
                case 128:
                    this.zzv = zzgkVar.zzcv();
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
        String str = this.zzg;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzg);
        }
        String str2 = this.zzh;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(2, this.zzh);
        }
        String str3 = this.zzi;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(3, this.zzi);
        }
        String str4 = this.zzj;
        if (str4 != null && !str4.equals("")) {
            zzglVar.zza(4, this.zzj);
        }
        String str5 = this.zzk;
        if (str5 != null && !str5.equals("")) {
            zzglVar.zza(5, this.zzk);
        }
        String str6 = this.zzl;
        if (str6 != null && !str6.equals("")) {
            zzglVar.zza(6, this.zzl);
        }
        String str7 = this.zzm;
        if (str7 != null && !str7.equals("")) {
            zzglVar.zza(7, this.zzm);
        }
        String str8 = this.zzn;
        if (str8 != null && !str8.equals("")) {
            zzglVar.zza(8, this.zzn);
        }
        String str9 = this.zzo;
        if (str9 != null && !str9.equals("")) {
            zzglVar.zza(9, this.zzo);
        }
        String str10 = this.zzp;
        if (str10 != null && !str10.equals("")) {
            zzglVar.zza(10, this.zzp);
        }
        String str11 = this.zzq;
        if (str11 != null && !str11.equals("")) {
            zzglVar.zza(11, this.zzq);
        }
        String str12 = this.zzr;
        if (str12 != null && !str12.equals("")) {
            zzglVar.zza(12, this.zzr);
        }
        String str13 = this.zzs;
        if (str13 != null && !str13.equals("")) {
            zzglVar.zza(13, this.zzs);
        }
        zzf[] zzfVarArr = this.zzt;
        if (zzfVarArr != null && zzfVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzf[] zzfVarArr2 = this.zzt;
                if (i >= zzfVarArr2.length) {
                    break;
                }
                zzf zzfVar = zzfVarArr2[i];
                if (zzfVar != null) {
                    zzglVar.zza(14, zzfVar);
                }
                i++;
            }
        }
        String str14 = this.zzu;
        if (str14 != null && !str14.equals("")) {
            zzglVar.zza(15, this.zzu);
        }
        long j = this.zzv;
        if (j != 0) {
            zzglVar.zza(16, j);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int zzb = super.zzb();
        String str = this.zzg;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(1, this.zzg);
        }
        String str2 = this.zzh;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(2, this.zzh);
        }
        String str3 = this.zzi;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(3, this.zzi);
        }
        String str4 = this.zzj;
        if (str4 != null && !str4.equals("")) {
            zzb += zzgl.zzb(4, this.zzj);
        }
        String str5 = this.zzk;
        if (str5 != null && !str5.equals("")) {
            zzb += zzgl.zzb(5, this.zzk);
        }
        String str6 = this.zzl;
        if (str6 != null && !str6.equals("")) {
            zzb += zzgl.zzb(6, this.zzl);
        }
        String str7 = this.zzm;
        if (str7 != null && !str7.equals("")) {
            zzb += zzgl.zzb(7, this.zzm);
        }
        String str8 = this.zzn;
        if (str8 != null && !str8.equals("")) {
            zzb += zzgl.zzb(8, this.zzn);
        }
        String str9 = this.zzo;
        if (str9 != null && !str9.equals("")) {
            zzb += zzgl.zzb(9, this.zzo);
        }
        String str10 = this.zzp;
        if (str10 != null && !str10.equals("")) {
            zzb += zzgl.zzb(10, this.zzp);
        }
        String str11 = this.zzq;
        if (str11 != null && !str11.equals("")) {
            zzb += zzgl.zzb(11, this.zzq);
        }
        String str12 = this.zzr;
        if (str12 != null && !str12.equals("")) {
            zzb += zzgl.zzb(12, this.zzr);
        }
        String str13 = this.zzs;
        if (str13 != null && !str13.equals("")) {
            zzb += zzgl.zzb(13, this.zzs);
        }
        zzf[] zzfVarArr = this.zzt;
        if (zzfVarArr != null && zzfVarArr.length > 0) {
            int i = 0;
            while (true) {
                zzf[] zzfVarArr2 = this.zzt;
                if (i >= zzfVarArr2.length) {
                    break;
                }
                zzf zzfVar = zzfVarArr2[i];
                if (zzfVar != null) {
                    zzb += zzgl.zzb(14, zzfVar);
                }
                i++;
            }
        }
        String str14 = this.zzu;
        if (str14 != null && !str14.equals("")) {
            zzb += zzgl.zzb(15, this.zzu);
        }
        long j = this.zzv;
        return j != 0 ? zzb + zzgl.zze(16, j) : zzb;
    }
}
