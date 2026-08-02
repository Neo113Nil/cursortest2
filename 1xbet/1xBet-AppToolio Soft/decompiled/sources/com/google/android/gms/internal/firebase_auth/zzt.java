package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzt extends zzgn<zzt> {
    private static volatile zzt[] zzdj;
    public String zzj = "";
    public String zzbh = "";
    public String zzbr = "";
    public String zzcg = "";
    public String zzah = "";
    private String zzdk = "";
    private String zzde = "";
    public String zzbd = "";

    public zzt() {
        this.zzya = -1;
    }

    public static zzt[] zzc() {
        if (zzdj == null) {
            synchronized (zzgr.zzxz) {
                if (zzdj == null) {
                    zzdj = new zzt[0];
                }
            }
        }
        return zzdj;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgt
    public final /* synthetic */ zzgt zza(zzgk zzgkVar) throws IOException {
        while (true) {
            int zzcc = zzgkVar.zzcc();
            if (zzcc == 0) {
                return this;
            }
            if (zzcc == 10) {
                this.zzj = zzgkVar.readString();
            } else if (zzcc == 18) {
                this.zzbh = zzgkVar.readString();
            } else if (zzcc == 26) {
                this.zzbr = zzgkVar.readString();
            } else if (zzcc == 34) {
                this.zzcg = zzgkVar.readString();
            } else if (zzcc == 42) {
                this.zzah = zzgkVar.readString();
            } else if (zzcc == 50) {
                this.zzdk = zzgkVar.readString();
            } else if (zzcc == 58) {
                this.zzde = zzgkVar.readString();
            } else if (zzcc == 74) {
                this.zzbd = zzgkVar.readString();
            } else if (!super.zza(zzgkVar, zzcc)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    public final void zza(zzgl zzglVar) throws IOException {
        String str = this.zzj;
        if (str != null && !str.equals("")) {
            zzglVar.zza(1, this.zzj);
        }
        String str2 = this.zzbh;
        if (str2 != null && !str2.equals("")) {
            zzglVar.zza(2, this.zzbh);
        }
        String str3 = this.zzbr;
        if (str3 != null && !str3.equals("")) {
            zzglVar.zza(3, this.zzbr);
        }
        String str4 = this.zzcg;
        if (str4 != null && !str4.equals("")) {
            zzglVar.zza(4, this.zzcg);
        }
        String str5 = this.zzah;
        if (str5 != null && !str5.equals("")) {
            zzglVar.zza(5, this.zzah);
        }
        String str6 = this.zzdk;
        if (str6 != null && !str6.equals("")) {
            zzglVar.zza(6, this.zzdk);
        }
        String str7 = this.zzde;
        if (str7 != null && !str7.equals("")) {
            zzglVar.zza(7, this.zzde);
        }
        String str8 = this.zzbd;
        if (str8 != null && !str8.equals("")) {
            zzglVar.zza(9, this.zzbd);
        }
        super.zza(zzglVar);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
    protected final int zzb() {
        int zzb = super.zzb();
        String str = this.zzj;
        if (str != null && !str.equals("")) {
            zzb += zzgl.zzb(1, this.zzj);
        }
        String str2 = this.zzbh;
        if (str2 != null && !str2.equals("")) {
            zzb += zzgl.zzb(2, this.zzbh);
        }
        String str3 = this.zzbr;
        if (str3 != null && !str3.equals("")) {
            zzb += zzgl.zzb(3, this.zzbr);
        }
        String str4 = this.zzcg;
        if (str4 != null && !str4.equals("")) {
            zzb += zzgl.zzb(4, this.zzcg);
        }
        String str5 = this.zzah;
        if (str5 != null && !str5.equals("")) {
            zzb += zzgl.zzb(5, this.zzah);
        }
        String str6 = this.zzdk;
        if (str6 != null && !str6.equals("")) {
            zzb += zzgl.zzb(6, this.zzdk);
        }
        String str7 = this.zzde;
        if (str7 != null && !str7.equals("")) {
            zzb += zzgl.zzb(7, this.zzde);
        }
        String str8 = this.zzbd;
        return (str8 == null || str8.equals("")) ? zzb : zzb + zzgl.zzb(9, this.zzbd);
    }
}
