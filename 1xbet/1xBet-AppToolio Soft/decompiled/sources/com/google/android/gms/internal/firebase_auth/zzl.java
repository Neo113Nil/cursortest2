package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzl extends zzgn<zzl> {
    public int zzao = 0;
    public String zzah = "";
    private String zzap = "";
    private String zzaq = "";
    private String zzar = "";
    private String zzas = "";
    public String zzaf = "";
    public String zzat = "";
    public String zzau = "";
    public String zzav = "";
    public String zzaw = "";
    public boolean zzax = false;
    public String zzay = "";
    public boolean zzaz = false;

    public zzl() {
        this.zzya = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.firebase_auth.zzgt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzl zza(zzgk zzgkVar) throws IOException {
        while (true) {
            int zzcc = zzgkVar.zzcc();
            switch (zzcc) {
                case 0:
                    return this;
                case 8:
                    int position = zzgkVar.getPosition();
                    try {
                        this.zzao = zzgx.zzbe(zzgkVar.zzcu());
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzgkVar.zzay(position);
                        zza(zzgkVar, zzcc);
                        break;
                    }
                case 18:
                    this.zzah = zzgkVar.readString();
                    break;
                case 26:
                    this.zzap = zzgkVar.readString();
                    break;
                case 34:
                    this.zzaq = zzgkVar.readString();
                    break;
                case 42:
                    this.zzar = zzgkVar.readString();
                    break;
                case 50:
                    this.zzas = zzgkVar.readString();
                    break;
                case 58:
                    this.zzaf = zzgkVar.readString();
                    break;
                case 66:
                    this.zzat = zzgkVar.readString();
                    break;
                case 74:
                    this.zzau = zzgkVar.readString();
                    break;
                case 82:
                    this.zzav = zzgkVar.readString();
                    break;
                case 90:
                    this.zzaw = zzgkVar.readString();
                    break;
                case 96:
                    this.zzax = zzgkVar.zzci();
                    break;
                case 106:
                    this.zzay = zzgkVar.readString();
                    break;
                case 112:
                    this.zzaz = zzgkVar.zzci();
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
        int i = this.zzao;
        if (i != 0) {
            zzglVar.zzc(1, i);
        }
        String str = this.zzah;
        if (str != null && !str.equals("")) {
            zzglVar.zza(2, this.zzah);
        }
        String str2 = this.zzap;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(3, this.zzap);
        }
        String str3 = this.zzaq;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(4, this.zzaq);
        }
        String str4 = this.zzar;
        if (str4 != null && !str4.equals("")) {
            zzglVar.zza(5, this.zzar);
        }
        String str5 = this.zzas;
        if (str5 != null && !str5.equals("")) {
            zzglVar.zza(6, this.zzas);
        }
        String str6 = this.zzaf;
        if (str6 != null && !str6.equals("")) {
            zzglVar.zza(7, this.zzaf);
        }
        String str7 = this.zzat;
        if (str7 != null && !str7.equals("")) {
            zzglVar.zza(8, this.zzat);
        }
        String str8 = this.zzau;
        if (str8 != null && !str8.equals("")) {
            zzglVar.zza(9, this.zzau);
        }
        String str9 = this.zzav;
        if (str9 != null && !str9.equals("")) {
            zzglVar.zza(10, this.zzav);
        }
        String str10 = this.zzaw;
        if (str10 != null && !str10.equals("")) {
            zzglVar.zza(11, this.zzaw);
        }
        boolean z = this.zzax;
        if (z) {
            zzglVar.zzb(12, z);
        }
        String str11 = this.zzay;
        if (str11 != null && !str11.equals("")) {
            zzglVar.zza(13, this.zzay);
        }
        boolean z2 = this.zzaz;
        if (z2) {
            zzglVar.zzb(14, z2);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int zzb = super.zzb();
        int i = this.zzao;
        if (i != 0) {
            zzb += zzgl.zzg(1, i);
        }
        String str = this.zzah;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(2, this.zzah);
        }
        String str2 = this.zzap;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(3, this.zzap);
        }
        String str3 = this.zzaq;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(4, this.zzaq);
        }
        String str4 = this.zzar;
        if (str4 != null && !str4.equals("")) {
            zzb += zzgl.zzb(5, this.zzar);
        }
        String str5 = this.zzas;
        if (str5 != null && !str5.equals("")) {
            zzb += zzgl.zzb(6, this.zzas);
        }
        String str6 = this.zzaf;
        if (str6 != null && !str6.equals("")) {
            zzb += zzgl.zzb(7, this.zzaf);
        }
        String str7 = this.zzat;
        if (str7 != null && !str7.equals("")) {
            zzb += zzgl.zzb(8, this.zzat);
        }
        String str8 = this.zzau;
        if (str8 != null && !str8.equals("")) {
            zzb += zzgl.zzb(9, this.zzau);
        }
        String str9 = this.zzav;
        if (str9 != null && !str9.equals("")) {
            zzb += zzgl.zzb(10, this.zzav);
        }
        String str10 = this.zzaw;
        if (str10 != null && !str10.equals("")) {
            zzb += zzgl.zzb(11, this.zzaw);
        }
        if (this.zzax) {
            zzb += zzgl.zzaa(12) + 1;
        }
        String str11 = this.zzay;
        if (str11 != null && !str11.equals("")) {
            zzb += zzgl.zzb(13, this.zzay);
        }
        return this.zzaz ? zzb + zzgl.zzaa(14) + 1 : zzb;
    }
}
