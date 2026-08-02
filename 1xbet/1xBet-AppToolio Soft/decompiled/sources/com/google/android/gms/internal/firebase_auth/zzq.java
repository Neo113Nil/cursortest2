package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzq extends zzgn<zzq> {
    public String zzca = "";
    public String zzcb = "";
    private String zzcc = "";
    private boolean zzcd = false;
    public String zzr = "";
    private String zzbq = "";
    private long zzae = 0;
    public String zzaf = "";
    public boolean zzbt = false;
    private boolean zzce = false;
    public boolean zzcf = true;
    private String zzu = "";
    private long zzv = 0;

    public zzq() {
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
                    this.zzca = zzgkVar.readString();
                    break;
                case 18:
                    this.zzcb = zzgkVar.readString();
                    break;
                case 26:
                    this.zzcc = zzgkVar.readString();
                    break;
                case 32:
                    this.zzcd = zzgkVar.zzci();
                    break;
                case 42:
                    this.zzr = zzgkVar.readString();
                    break;
                case 50:
                    this.zzbq = zzgkVar.readString();
                    break;
                case 56:
                    this.zzae = zzgkVar.zzcv();
                    break;
                case 66:
                    this.zzaf = zzgkVar.readString();
                    break;
                case 72:
                    this.zzbt = zzgkVar.zzci();
                    break;
                case 80:
                    this.zzce = zzgkVar.zzci();
                    break;
                case 88:
                    this.zzcf = zzgkVar.zzci();
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
        String str = this.zzca;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzca);
        }
        String str2 = this.zzcb;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(2, this.zzcb);
        }
        String str3 = this.zzcc;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(3, this.zzcc);
        }
        boolean z = this.zzcd;
        if (z) {
            zzglVar.zzb(4, z);
        }
        String str4 = this.zzr;
        if (str4 != null && !str4.equals("")) {
            zzglVar.zza(5, this.zzr);
        }
        String str5 = this.zzbq;
        if (str5 != null && !str5.equals("")) {
            zzglVar.zza(6, this.zzbq);
        }
        long j = this.zzae;
        if (j != 0) {
            zzglVar.zzi(7, j);
        }
        String str6 = this.zzaf;
        if (str6 != null && !str6.equals("")) {
            zzglVar.zza(8, this.zzaf);
        }
        boolean z2 = this.zzbt;
        if (z2) {
            zzglVar.zzb(9, z2);
        }
        boolean z3 = this.zzce;
        if (z3) {
            zzglVar.zzb(10, z3);
        }
        boolean z4 = this.zzcf;
        if (!z4) {
            zzglVar.zzb(11, z4);
        }
        String str7 = this.zzu;
        if (str7 != null && !str7.equals("")) {
            zzglVar.zza(13, this.zzu);
        }
        long j2 = this.zzv;
        if (j2 != 0) {
            zzglVar.zza(14, j2);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int zzb = super.zzb();
        String str = this.zzca;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(1, this.zzca);
        }
        String str2 = this.zzcb;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(2, this.zzcb);
        }
        String str3 = this.zzcc;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(3, this.zzcc);
        }
        if (this.zzcd) {
            zzb += zzgl.zzaa(4) + 1;
        }
        String str4 = this.zzr;
        if (str4 != null && !str4.equals("")) {
            zzb += zzgl.zzb(5, this.zzr);
        }
        String str5 = this.zzbq;
        if (str5 != null && !str5.equals("")) {
            zzb += zzgl.zzb(6, this.zzbq);
        }
        long j = this.zzae;
        if (j != 0) {
            zzb += zzgl.zzd(7, j);
        }
        String str6 = this.zzaf;
        if (str6 != null && !str6.equals("")) {
            zzb += zzgl.zzb(8, this.zzaf);
        }
        if (this.zzbt) {
            zzb += zzgl.zzaa(9) + 1;
        }
        if (this.zzce) {
            zzb += zzgl.zzaa(10) + 1;
        }
        if (!this.zzcf) {
            zzb += zzgl.zzaa(11) + 1;
        }
        String str7 = this.zzu;
        if (str7 != null && !str7.equals("")) {
            zzb += zzgl.zzb(13, this.zzu);
        }
        long j2 = this.zzv;
        return j2 != 0 ? zzb + zzgl.zze(14, j2) : zzb;
    }
}
