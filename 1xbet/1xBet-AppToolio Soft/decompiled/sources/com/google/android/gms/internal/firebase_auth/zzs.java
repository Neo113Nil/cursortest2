package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzs extends zzgn<zzs> {
    public String zzah = "";
    public String zzbi = "";
    private String zzcc = "";
    private String zzbm = "";
    private String zzbn = "";
    private String zzdi = "";
    private String zzbq = "";
    private long zzae = 0;
    private String zzaf = "";
    public boolean zzbt = false;
    private String zzu = "";
    private long zzv = 0;

    public zzs() {
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
                    this.zzcc = zzgkVar.readString();
                    break;
                case 34:
                    this.zzbm = zzgkVar.readString();
                    break;
                case 42:
                    this.zzbn = zzgkVar.readString();
                    break;
                case 50:
                    this.zzdi = zzgkVar.readString();
                    break;
                case 58:
                    this.zzbq = zzgkVar.readString();
                    break;
                case 64:
                    this.zzae = zzgkVar.zzcv();
                    break;
                case 74:
                    this.zzaf = zzgkVar.readString();
                    break;
                case 80:
                    this.zzbt = zzgkVar.zzci();
                    break;
                case 90:
                    this.zzu = zzgkVar.readString();
                    break;
                case 96:
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
        String str3 = this.zzcc;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(3, this.zzcc);
        }
        String str4 = this.zzbm;
        if (str4 != null && !str4.equals("")) {
            zzglVar.zza(4, this.zzbm);
        }
        String str5 = this.zzbn;
        if (str5 != null && !str5.equals("")) {
            zzglVar.zza(5, this.zzbn);
        }
        String str6 = this.zzdi;
        if (str6 != null && !str6.equals("")) {
            zzglVar.zza(6, this.zzdi);
        }
        String str7 = this.zzbq;
        if (str7 != null && !str7.equals("")) {
            zzglVar.zza(7, this.zzbq);
        }
        long j = this.zzae;
        if (j != 0) {
            zzglVar.zzi(8, j);
        }
        String str8 = this.zzaf;
        if (str8 != null && !str8.equals("")) {
            zzglVar.zza(9, this.zzaf);
        }
        boolean z = this.zzbt;
        if (z) {
            zzglVar.zzb(10, z);
        }
        String str9 = this.zzu;
        if (str9 != null && !str9.equals("")) {
            zzglVar.zza(11, this.zzu);
        }
        long j2 = this.zzv;
        if (j2 != 0) {
            zzglVar.zza(12, j2);
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
        String str3 = this.zzcc;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(3, this.zzcc);
        }
        String str4 = this.zzbm;
        if (str4 != null && !str4.equals("")) {
            zzb += zzgl.zzb(4, this.zzbm);
        }
        String str5 = this.zzbn;
        if (str5 != null && !str5.equals("")) {
            zzb += zzgl.zzb(5, this.zzbn);
        }
        String str6 = this.zzdi;
        if (str6 != null && !str6.equals("")) {
            zzb += zzgl.zzb(6, this.zzdi);
        }
        String str7 = this.zzbq;
        if (str7 != null && !str7.equals("")) {
            zzb += zzgl.zzb(7, this.zzbq);
        }
        long j = this.zzae;
        if (j != 0) {
            zzb += zzgl.zzd(8, j);
        }
        String str8 = this.zzaf;
        if (str8 != null && !str8.equals("")) {
            zzb += zzgl.zzb(9, this.zzaf);
        }
        if (this.zzbt) {
            zzb += zzgl.zzaa(10) + 1;
        }
        String str9 = this.zzu;
        if (str9 != null && !str9.equals("")) {
            zzb += zzgl.zzb(11, this.zzu);
        }
        long j2 = this.zzv;
        return j2 != 0 ? zzb + zzgl.zze(12, j2) : zzb;
    }
}
