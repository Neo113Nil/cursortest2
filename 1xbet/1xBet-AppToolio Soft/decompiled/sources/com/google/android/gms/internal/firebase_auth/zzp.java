package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzp extends zzgn<zzp> {
    public String zzah = "";
    public String zzbi = "";
    public String zzbh = "";
    private String zzbm = "";
    private String zzbn = "";
    private String zzbq = "";
    private String zzaf = "";
    private boolean zzbk = false;
    private String zzbr = "";
    private boolean zzbz = false;
    private String zzu = "";
    private long zzv = 0;

    public zzp() {
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
                    this.zzah = zzgkVar.readString();
                    break;
                case 18:
                    this.zzbi = zzgkVar.readString();
                    break;
                case 26:
                    this.zzbh = zzgkVar.readString();
                    break;
                case 34:
                    this.zzbm = zzgkVar.readString();
                    break;
                case 42:
                    this.zzbn = zzgkVar.readString();
                    break;
                case 50:
                    this.zzbq = zzgkVar.readString();
                    break;
                case 58:
                    this.zzaf = zzgkVar.readString();
                    break;
                case 64:
                    this.zzbk = zzgkVar.zzci();
                    break;
                case 74:
                    this.zzbr = zzgkVar.readString();
                    break;
                case 80:
                    this.zzbz = zzgkVar.zzci();
                    break;
                case 106:
                    this.zzu = zzgkVar.readString();
                    break;
                case 112:
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
        String str = this.zzah;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzah);
        }
        String str2 = this.zzbi;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(2, this.zzbi);
        }
        String str3 = this.zzbh;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(3, this.zzbh);
        }
        String str4 = this.zzbm;
        if (str4 != null && !str4.equals("")) {
            zzglVar.zza(4, this.zzbm);
        }
        String str5 = this.zzbn;
        if (str5 != null && !str5.equals("")) {
            zzglVar.zza(5, this.zzbn);
        }
        String str6 = this.zzbq;
        if (str6 != null && !str6.equals("")) {
            zzglVar.zza(6, this.zzbq);
        }
        String str7 = this.zzaf;
        if (str7 != null && !str7.equals("")) {
            zzglVar.zza(7, this.zzaf);
        }
        boolean z = this.zzbk;
        if (z) {
            zzglVar.zzb(8, z);
        }
        String str8 = this.zzbr;
        if (str8 != null && !str8.equals("")) {
            zzglVar.zza(9, this.zzbr);
        }
        boolean z2 = this.zzbz;
        if (z2) {
            zzglVar.zzb(10, z2);
        }
        String str9 = this.zzu;
        if (str9 != null && !str9.equals("")) {
            zzglVar.zza(13, this.zzu);
        }
        long j = this.zzv;
        if (j != 0) {
            zzglVar.zza(14, j);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int zzb = super.zzb();
        String str = this.zzah;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(1, this.zzah);
        }
        String str2 = this.zzbi;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(2, this.zzbi);
        }
        String str3 = this.zzbh;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(3, this.zzbh);
        }
        String str4 = this.zzbm;
        if (str4 != null && !str4.equals("")) {
            zzb += zzgl.zzb(4, this.zzbm);
        }
        String str5 = this.zzbn;
        if (str5 != null && !str5.equals("")) {
            zzb += zzgl.zzb(5, this.zzbn);
        }
        String str6 = this.zzbq;
        if (str6 != null && !str6.equals("")) {
            zzb += zzgl.zzb(6, this.zzbq);
        }
        String str7 = this.zzaf;
        if (str7 != null && !str7.equals("")) {
            zzb += zzgl.zzb(7, this.zzaf);
        }
        if (this.zzbk) {
            zzb += zzgl.zzaa(8) + 1;
        }
        String str8 = this.zzbr;
        if (str8 != null && !str8.equals("")) {
            zzb += zzgl.zzb(9, this.zzbr);
        }
        if (this.zzbz) {
            zzb += zzgl.zzaa(10) + 1;
        }
        String str9 = this.zzu;
        if (str9 != null && !str9.equals("")) {
            zzb += zzgl.zzb(13, this.zzu);
        }
        long j = this.zzv;
        return j != 0 ? zzb + zzgl.zze(14, j) : zzb;
    }
}
