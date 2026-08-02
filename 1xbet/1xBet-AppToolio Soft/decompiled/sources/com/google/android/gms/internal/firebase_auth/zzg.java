package com.google.android.gms.internal.firebase_auth;

import android.support.v7.widget.helper.ItemTouchHelper;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzg {

    public static final class zza extends zzgn<zza> {
        private String zzw = "";
        public String zzx = "";
        public String[] zzy = zzgw.EMPTY_STRING_ARRAY;
        public boolean zzz = false;
        public String zzj = "";
        public boolean zzaa = false;
        private boolean zzab = false;
        private String zzr = "";
        public String[] zzac = zzgw.EMPTY_STRING_ARRAY;

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
                    this.zzw = zzgkVar.readString();
                } else if (zzcc == 18) {
                    this.zzx = zzgkVar.readString();
                } else if (zzcc == 26) {
                    int zzb = zzgw.zzb(zzgkVar, 26);
                    String[] strArr = this.zzy;
                    int length = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzy, 0, strArr2, 0, length);
                    }
                    while (length < strArr2.length - 1) {
                        strArr2[length] = zzgkVar.readString();
                        zzgkVar.zzcc();
                        length++;
                    }
                    strArr2[length] = zzgkVar.readString();
                    this.zzy = strArr2;
                } else if (zzcc == 32) {
                    this.zzz = zzgkVar.zzci();
                } else if (zzcc == 42) {
                    this.zzj = zzgkVar.readString();
                } else if (zzcc == 48) {
                    this.zzaa = zzgkVar.zzci();
                } else if (zzcc == 56) {
                    this.zzab = zzgkVar.zzci();
                } else if (zzcc == 66) {
                    this.zzr = zzgkVar.readString();
                } else if (zzcc == 74) {
                    int zzb2 = zzgw.zzb(zzgkVar, 74);
                    String[] strArr3 = this.zzac;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    String[] strArr4 = new String[zzb2 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.zzac, 0, strArr4, 0, length2);
                    }
                    while (length2 < strArr4.length - 1) {
                        strArr4[length2] = zzgkVar.readString();
                        zzgkVar.zzcc();
                        length2++;
                    }
                    strArr4[length2] = zzgkVar.readString();
                    this.zzac = strArr4;
                } else if (!super.zza(zzgkVar, zzcc)) {
                    return this;
                }
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        public final void zza(zzgl zzglVar) throws IOException {
            zzglVar.zza(1, this.zzw);
            String str = this.zzx;
            if (str != null && !str.equals("")) {
                zzglVar.zza(2, this.zzx);
            }
            String[] strArr = this.zzy;
            int i = 0;
            if (strArr != null && strArr.length > 0) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.zzy;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    String str2 = strArr2[i2];
                    if (str2 != null) {
                        zzglVar.zza(3, str2);
                    }
                    i2++;
                }
            }
            boolean z = this.zzz;
            if (z) {
                zzglVar.zzb(4, z);
            }
            String str3 = this.zzj;
            if (str3 != null && !str3.equals("")) {
                zzglVar.zza(5, this.zzj);
            }
            boolean z2 = this.zzaa;
            if (z2) {
                zzglVar.zzb(6, z2);
            }
            boolean z3 = this.zzab;
            if (z3) {
                zzglVar.zzb(7, z3);
            }
            String str4 = this.zzr;
            if (str4 != null && !str4.equals("")) {
                zzglVar.zza(8, this.zzr);
            }
            String[] strArr3 = this.zzac;
            if (strArr3 != null && strArr3.length > 0) {
                while (true) {
                    String[] strArr4 = this.zzac;
                    if (i >= strArr4.length) {
                        break;
                    }
                    String str5 = strArr4[i];
                    if (str5 != null) {
                        zzglVar.zza(9, str5);
                    }
                    i++;
                }
            }
            super.zza(zzglVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        protected final int zzb() {
            int zzb = super.zzb() + zzgl.zzb(1, this.zzw);
            String str = this.zzx;
            if (str != null && !str.equals("")) {
                zzb += zzgl.zzb(2, this.zzx);
            }
            String[] strArr = this.zzy;
            int i = 0;
            if (strArr != null && strArr.length > 0) {
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    String[] strArr2 = this.zzy;
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
            if (this.zzz) {
                zzb += zzgl.zzaa(4) + 1;
            }
            String str3 = this.zzj;
            if (str3 != null && !str3.equals("")) {
                zzb += zzgl.zzb(5, this.zzj);
            }
            if (this.zzaa) {
                zzb += zzgl.zzaa(6) + 1;
            }
            if (this.zzab) {
                zzb += zzgl.zzaa(7) + 1;
            }
            String str4 = this.zzr;
            if (str4 != null && !str4.equals("")) {
                zzb += zzgl.zzb(8, this.zzr);
            }
            String[] strArr3 = this.zzac;
            if (strArr3 == null || strArr3.length <= 0) {
                return zzb;
            }
            int i5 = 0;
            int i6 = 0;
            while (true) {
                String[] strArr4 = this.zzac;
                if (i >= strArr4.length) {
                    return zzb + i5 + (i6 * 1);
                }
                String str5 = strArr4[i];
                if (str5 != null) {
                    i6++;
                    i5 += zzgl.zzam(str5);
                }
                i++;
            }
        }
    }

    public static final class zzb extends zzgn<zzb> {
        private String zzw = "";
        public String zzaf = "";
        public String zzah = "";
        public String zzai = "";
        public long zzaj = 0;
        public String zzad = "";
        public boolean zzak = false;

        public zzb() {
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
                    this.zzw = zzgkVar.readString();
                } else if (zzcc == 18) {
                    this.zzaf = zzgkVar.readString();
                } else if (zzcc == 26) {
                    this.zzah = zzgkVar.readString();
                } else if (zzcc == 34) {
                    this.zzai = zzgkVar.readString();
                } else if (zzcc == 40) {
                    this.zzaj = zzgkVar.zzcv();
                } else if (zzcc == 50) {
                    this.zzad = zzgkVar.readString();
                } else if (zzcc == 56) {
                    this.zzak = zzgkVar.zzci();
                } else if (!super.zza(zzgkVar, zzcc)) {
                    return this;
                }
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        public final void zza(zzgl zzglVar) throws IOException {
            zzglVar.zza(1, this.zzw);
            String str = this.zzaf;
            if (str != null && !str.equals("")) {
                zzglVar.zza(2, this.zzaf);
            }
            String str2 = this.zzah;
            if (str2 != null && !str2.equals("")) {
                zzglVar.zza(3, this.zzah);
            }
            String str3 = this.zzai;
            if (str3 != null && !str3.equals("")) {
                zzglVar.zza(4, this.zzai);
            }
            long j = this.zzaj;
            if (j != 0) {
                zzglVar.zzi(5, j);
            }
            String str4 = this.zzad;
            if (str4 != null && !str4.equals("")) {
                zzglVar.zza(6, this.zzad);
            }
            boolean z = this.zzak;
            if (z) {
                zzglVar.zzb(7, z);
            }
            super.zza(zzglVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        protected final int zzb() {
            int zzb = super.zzb() + zzgl.zzb(1, this.zzw);
            String str = this.zzaf;
            if (str != null && !str.equals("")) {
                zzb += zzgl.zzb(2, this.zzaf);
            }
            String str2 = this.zzah;
            if (str2 != null && !str2.equals("")) {
                zzb += zzgl.zzb(3, this.zzah);
            }
            String str3 = this.zzai;
            if (str3 != null && !str3.equals("")) {
                zzb += zzgl.zzb(4, this.zzai);
            }
            long j = this.zzaj;
            if (j != 0) {
                zzb += zzgl.zzd(5, j);
            }
            String str4 = this.zzad;
            if (str4 != null && !str4.equals("")) {
                zzb += zzgl.zzb(6, this.zzad);
            }
            return this.zzak ? zzb + zzgl.zzaa(7) + 1 : zzb;
        }
    }

    public static final class zzc extends zzgn<zzc> {
        private String zzw = "";
        public zzu[] zzan = zzu.zzd();

        public zzc() {
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
                    this.zzw = zzgkVar.readString();
                } else if (zzcc == 18) {
                    int zzb = zzgw.zzb(zzgkVar, 18);
                    zzu[] zzuVarArr = this.zzan;
                    int length = zzuVarArr == null ? 0 : zzuVarArr.length;
                    zzu[] zzuVarArr2 = new zzu[zzb + length];
                    if (length != 0) {
                        System.arraycopy(this.zzan, 0, zzuVarArr2, 0, length);
                    }
                    while (length < zzuVarArr2.length - 1) {
                        zzuVarArr2[length] = new zzu();
                        zzgkVar.zzb(zzuVarArr2[length]);
                        zzgkVar.zzcc();
                        length++;
                    }
                    zzuVarArr2[length] = new zzu();
                    zzgkVar.zzb(zzuVarArr2[length]);
                    this.zzan = zzuVarArr2;
                } else if (!super.zza(zzgkVar, zzcc)) {
                    return this;
                }
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        public final void zza(zzgl zzglVar) throws IOException {
            zzglVar.zza(1, this.zzw);
            zzu[] zzuVarArr = this.zzan;
            if (zzuVarArr != null && zzuVarArr.length > 0) {
                int i = 0;
                while (true) {
                    zzu[] zzuVarArr2 = this.zzan;
                    if (i >= zzuVarArr2.length) {
                        break;
                    }
                    zzu zzuVar = zzuVarArr2[i];
                    if (zzuVar != null) {
                        zzglVar.zza(2, zzuVar);
                    }
                    i++;
                }
            }
            super.zza(zzglVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        protected final int zzb() {
            int zzb = super.zzb() + zzgl.zzb(1, this.zzw);
            zzu[] zzuVarArr = this.zzan;
            if (zzuVarArr != null && zzuVarArr.length > 0) {
                int i = 0;
                while (true) {
                    zzu[] zzuVarArr2 = this.zzan;
                    if (i >= zzuVarArr2.length) {
                        break;
                    }
                    zzu zzuVar = zzuVarArr2[i];
                    if (zzuVar != null) {
                        zzb += zzgl.zzb(2, zzuVar);
                    }
                    i++;
                }
            }
            return zzb;
        }
    }

    public static final class zzd extends zzgn<zzd> {
        private String zzw = "";
        public String zzah = "";
        public String zzas = "";
        public int zzbc = 0;

        public zzd() {
            this.zzya = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.firebase_auth.zzgt
        /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
        public final zzd zza(zzgk zzgkVar) throws IOException {
            while (true) {
                int zzcc = zzgkVar.zzcc();
                if (zzcc == 0) {
                    return this;
                }
                if (zzcc == 10) {
                    this.zzw = zzgkVar.readString();
                } else if (zzcc == 18) {
                    this.zzah = zzgkVar.readString();
                } else if (zzcc == 26) {
                    this.zzas = zzgkVar.readString();
                } else if (zzcc == 32) {
                    int position = zzgkVar.getPosition();
                    try {
                        this.zzbc = zzgx.zzbe(zzgkVar.zzcu());
                    } catch (IllegalArgumentException unused) {
                        zzgkVar.zzay(position);
                        zza(zzgkVar, zzcc);
                    }
                } else if (!super.zza(zzgkVar, zzcc)) {
                    return this;
                }
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        public final void zza(zzgl zzglVar) throws IOException {
            zzglVar.zza(1, this.zzw);
            String str = this.zzah;
            if (str != null && !str.equals("")) {
                zzglVar.zza(2, this.zzah);
            }
            String str2 = this.zzas;
            if (str2 != null && !str2.equals("")) {
                zzglVar.zza(3, this.zzas);
            }
            int i = this.zzbc;
            if (i != 0) {
                zzglVar.zzc(4, i);
            }
            super.zza(zzglVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        protected final int zzb() {
            int zzb = super.zzb() + zzgl.zzb(1, this.zzw);
            String str = this.zzah;
            if (str != null && !str.equals("")) {
                zzb += zzgl.zzb(2, this.zzah);
            }
            String str2 = this.zzas;
            if (str2 != null && !str2.equals("")) {
                zzb += zzgl.zzb(3, this.zzas);
            }
            int i = this.zzbc;
            return i != 0 ? zzb + zzgl.zzg(4, i) : zzb;
        }
    }

    public static final class zze extends zzgn<zze> {
        private String zzw = "";
        private String zzad = "";
        public String zzah = "";
        public String zzbh = "";
        private String[] zzbj = zzgw.EMPTY_STRING_ARRAY;
        public String zzaf = "";
        public zzt[] zzbx = zzt.zzc();
        private String zzas = "";
        public String zzbr = "";
        public String zzai = "";
        public long zzaj = 0;
        public String zzby = "";
        public boolean zzbk = false;

        public zze() {
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
                        this.zzw = zzgkVar.readString();
                        break;
                    case 18:
                        this.zzad = zzgkVar.readString();
                        break;
                    case 26:
                        this.zzah = zzgkVar.readString();
                        break;
                    case 34:
                        this.zzbh = zzgkVar.readString();
                        break;
                    case 42:
                        int zzb = zzgw.zzb(zzgkVar, 42);
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
                    case 50:
                        this.zzaf = zzgkVar.readString();
                        break;
                    case 58:
                        int zzb2 = zzgw.zzb(zzgkVar, 58);
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
                    case 66:
                        this.zzas = zzgkVar.readString();
                        break;
                    case 74:
                        this.zzbr = zzgkVar.readString();
                        break;
                    case 82:
                        this.zzai = zzgkVar.readString();
                        break;
                    case 88:
                        this.zzaj = zzgkVar.zzcv();
                        break;
                    case 98:
                        this.zzby = zzgkVar.readString();
                        break;
                    case 104:
                        this.zzbk = zzgkVar.zzci();
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
            zzglVar.zza(1, this.zzw);
            String str = this.zzad;
            if (str != null && !str.equals("")) {
                zzglVar.zza(2, this.zzad);
            }
            String str2 = this.zzah;
            if (str2 != null && !str2.equals("")) {
                zzglVar.zza(3, this.zzah);
            }
            String str3 = this.zzbh;
            if (str3 != null && !str3.equals("")) {
                zzglVar.zza(4, this.zzbh);
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
                        zzglVar.zza(5, str4);
                    }
                    i2++;
                }
            }
            String str5 = this.zzaf;
            if (str5 != null && !str5.equals("")) {
                zzglVar.zza(6, this.zzaf);
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
                        zzglVar.zza(7, zztVar);
                    }
                    i++;
                }
            }
            String str6 = this.zzas;
            if (str6 != null && !str6.equals("")) {
                zzglVar.zza(8, this.zzas);
            }
            String str7 = this.zzbr;
            if (str7 != null && !str7.equals("")) {
                zzglVar.zza(9, this.zzbr);
            }
            String str8 = this.zzai;
            if (str8 != null && !str8.equals("")) {
                zzglVar.zza(10, this.zzai);
            }
            long j = this.zzaj;
            if (j != 0) {
                zzglVar.zzi(11, j);
            }
            String str9 = this.zzby;
            if (str9 != null && !str9.equals("")) {
                zzglVar.zza(12, this.zzby);
            }
            boolean z = this.zzbk;
            if (z) {
                zzglVar.zzb(13, z);
            }
            super.zza(zzglVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        protected final int zzb() {
            int zzb = super.zzb() + zzgl.zzb(1, this.zzw);
            String str = this.zzad;
            if (str != null && !str.equals("")) {
                zzb += zzgl.zzb(2, this.zzad);
            }
            String str2 = this.zzah;
            if (str2 != null && !str2.equals("")) {
                zzb += zzgl.zzb(3, this.zzah);
            }
            String str3 = this.zzbh;
            if (str3 != null && !str3.equals("")) {
                zzb += zzgl.zzb(4, this.zzbh);
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
            String str5 = this.zzaf;
            if (str5 != null && !str5.equals("")) {
                zzb += zzgl.zzb(6, this.zzaf);
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
                        zzb += zzgl.zzb(7, zztVar);
                    }
                    i++;
                }
            }
            String str6 = this.zzas;
            if (str6 != null && !str6.equals("")) {
                zzb += zzgl.zzb(8, this.zzas);
            }
            String str7 = this.zzbr;
            if (str7 != null && !str7.equals("")) {
                zzb += zzgl.zzb(9, this.zzbr);
            }
            String str8 = this.zzai;
            if (str8 != null && !str8.equals("")) {
                zzb += zzgl.zzb(10, this.zzai);
            }
            long j = this.zzaj;
            if (j != 0) {
                zzb += zzgl.zzd(11, j);
            }
            String str9 = this.zzby;
            if (str9 != null && !str9.equals("")) {
                zzb += zzgl.zzb(12, this.zzby);
            }
            return this.zzbk ? zzb + zzgl.zzaa(13) + 1 : zzb;
        }
    }

    public static final class zzf extends zzgn<zzf> {
        private String zzw = "";
        public String zzaf = "";
        public String zzbh = "";
        public String zzah = "";
        public String zzai = "";
        public long zzaj = 0;
        private String zzad = "";

        public zzf() {
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
                    this.zzw = zzgkVar.readString();
                } else if (zzcc == 18) {
                    this.zzaf = zzgkVar.readString();
                } else if (zzcc == 34) {
                    this.zzbh = zzgkVar.readString();
                } else if (zzcc == 42) {
                    this.zzah = zzgkVar.readString();
                } else if (zzcc == 50) {
                    this.zzai = zzgkVar.readString();
                } else if (zzcc == 56) {
                    this.zzaj = zzgkVar.zzcv();
                } else if (zzcc == 66) {
                    this.zzad = zzgkVar.readString();
                } else if (!super.zza(zzgkVar, zzcc)) {
                    return this;
                }
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        public final void zza(zzgl zzglVar) throws IOException {
            zzglVar.zza(1, this.zzw);
            String str = this.zzaf;
            if (str != null && !str.equals("")) {
                zzglVar.zza(2, this.zzaf);
            }
            String str2 = this.zzbh;
            if (str2 != null && !str2.equals("")) {
                zzglVar.zza(4, this.zzbh);
            }
            String str3 = this.zzah;
            if (str3 != null && !str3.equals("")) {
                zzglVar.zza(5, this.zzah);
            }
            String str4 = this.zzai;
            if (str4 != null && !str4.equals("")) {
                zzglVar.zza(6, this.zzai);
            }
            long j = this.zzaj;
            if (j != 0) {
                zzglVar.zzi(7, j);
            }
            String str5 = this.zzad;
            if (str5 != null && !str5.equals("")) {
                zzglVar.zza(8, this.zzad);
            }
            super.zza(zzglVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        protected final int zzb() {
            int zzb = super.zzb() + zzgl.zzb(1, this.zzw);
            String str = this.zzaf;
            if (str != null && !str.equals("")) {
                zzb += zzgl.zzb(2, this.zzaf);
            }
            String str2 = this.zzbh;
            if (str2 != null && !str2.equals("")) {
                zzb += zzgl.zzb(4, this.zzbh);
            }
            String str3 = this.zzah;
            if (str3 != null && !str3.equals("")) {
                zzb += zzgl.zzb(5, this.zzah);
            }
            String str4 = this.zzai;
            if (str4 != null && !str4.equals("")) {
                zzb += zzgl.zzb(6, this.zzai);
            }
            long j = this.zzaj;
            if (j != 0) {
                zzb += zzgl.zzd(7, j);
            }
            String str5 = this.zzad;
            return (str5 == null || str5.equals("")) ? zzb : zzb + zzgl.zzb(8, this.zzad);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase_auth.zzg$zzg, reason: collision with other inner class name */
    public static final class C0009zzg extends zzgn<C0009zzg> {
        private String zzcg = "";
        public String zzj = "";
        public String zzah = "";
        private boolean zzbk = false;
        private String zzch = "";
        private String zzci = "";
        private String zzcj = "";
        private String zzck = "";
        private String zzcl = "";
        private String zzcm = "";
        public String zzbr = "";
        private String zzcn = "";
        private String zzco = "";
        private String zzl = "";
        private String zzcp = "";
        private String zzcq = "";
        public String zzad = "";
        private boolean zzcr = false;
        public String zzbh = "";
        public String zzaf = "";
        private String zzcs = "";
        private String zzn = "";
        private String[] zzct = zzgw.EMPTY_STRING_ARRAY;
        public boolean zzcu = false;
        private String zzcv = "";
        private String zzcw = "";
        public String zzcx = "";
        private String zzcy = "";
        private long zzcz = 0;
        private String zzda = "";
        public boolean zzdb = false;
        private String zzdc = "";
        public String zzai = "";
        public long zzaj = 0;
        public String zzdd = "";
        private String zzde = "";
        public String zzdf = "";
        private String zzdg = "";
        public boolean zzak = false;

        public C0009zzg() {
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
                        this.zzcg = zzgkVar.readString();
                        break;
                    case 18:
                        this.zzj = zzgkVar.readString();
                        break;
                    case 26:
                        this.zzah = zzgkVar.readString();
                        break;
                    case 32:
                        this.zzbk = zzgkVar.zzci();
                        break;
                    case 42:
                        this.zzch = zzgkVar.readString();
                        break;
                    case 50:
                        this.zzci = zzgkVar.readString();
                        break;
                    case 58:
                        this.zzcj = zzgkVar.readString();
                        break;
                    case 66:
                        this.zzck = zzgkVar.readString();
                        break;
                    case 74:
                        this.zzcl = zzgkVar.readString();
                        break;
                    case 82:
                        this.zzcm = zzgkVar.readString();
                        break;
                    case 90:
                        this.zzbr = zzgkVar.readString();
                        break;
                    case 98:
                        this.zzcn = zzgkVar.readString();
                        break;
                    case 106:
                        this.zzco = zzgkVar.readString();
                        break;
                    case 114:
                        this.zzl = zzgkVar.readString();
                        break;
                    case 122:
                        this.zzcp = zzgkVar.readString();
                        break;
                    case 130:
                        this.zzcq = zzgkVar.readString();
                        break;
                    case 138:
                        this.zzad = zzgkVar.readString();
                        break;
                    case 144:
                        this.zzcr = zzgkVar.zzci();
                        break;
                    case 154:
                        this.zzbh = zzgkVar.readString();
                        break;
                    case 162:
                        this.zzaf = zzgkVar.readString();
                        break;
                    case 170:
                        this.zzcs = zzgkVar.readString();
                        break;
                    case 186:
                        this.zzn = zzgkVar.readString();
                        break;
                    case 194:
                        int zzb = zzgw.zzb(zzgkVar, 194);
                        String[] strArr = this.zzct;
                        int length = strArr == null ? 0 : strArr.length;
                        String[] strArr2 = new String[zzb + length];
                        if (length != 0) {
                            System.arraycopy(this.zzct, 0, strArr2, 0, length);
                        }
                        while (length < strArr2.length - 1) {
                            strArr2[length] = zzgkVar.readString();
                            zzgkVar.zzcc();
                            length++;
                        }
                        strArr2[length] = zzgkVar.readString();
                        this.zzct = strArr2;
                        break;
                    case ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION /* 200 */:
                        this.zzcu = zzgkVar.zzci();
                        break;
                    case 210:
                        this.zzcv = zzgkVar.readString();
                        break;
                    case 218:
                        this.zzcw = zzgkVar.readString();
                        break;
                    case 226:
                        this.zzcx = zzgkVar.readString();
                        break;
                    case 234:
                        this.zzcy = zzgkVar.readString();
                        break;
                    case 240:
                        this.zzcz = zzgkVar.zzcv();
                        break;
                    case ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION /* 250 */:
                        this.zzda = zzgkVar.readString();
                        break;
                    case 256:
                        this.zzdb = zzgkVar.zzci();
                        break;
                    case 266:
                        this.zzdc = zzgkVar.readString();
                        break;
                    case 274:
                        this.zzai = zzgkVar.readString();
                        break;
                    case 280:
                        this.zzaj = zzgkVar.zzcv();
                        break;
                    case 290:
                        this.zzdd = zzgkVar.readString();
                        break;
                    case 298:
                        this.zzde = zzgkVar.readString();
                        break;
                    case 306:
                        this.zzdf = zzgkVar.readString();
                        break;
                    case 314:
                        this.zzdg = zzgkVar.readString();
                        break;
                    case 320:
                        this.zzak = zzgkVar.zzci();
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
            String str = this.zzcg;
            if (str != null && !str.equals("")) {
                zzglVar.zza(1, this.zzcg);
            }
            String str2 = this.zzj;
            if (str2 != null && !str2.equals("")) {
                zzglVar.zza(2, this.zzj);
            }
            String str3 = this.zzah;
            if (str3 != null && !str3.equals("")) {
                zzglVar.zza(3, this.zzah);
            }
            boolean z = this.zzbk;
            if (z) {
                zzglVar.zzb(4, z);
            }
            String str4 = this.zzch;
            if (str4 != null && !str4.equals("")) {
                zzglVar.zza(5, this.zzch);
            }
            String str5 = this.zzci;
            if (str5 != null && !str5.equals("")) {
                zzglVar.zza(6, this.zzci);
            }
            String str6 = this.zzcj;
            if (str6 != null && !str6.equals("")) {
                zzglVar.zza(7, this.zzcj);
            }
            String str7 = this.zzck;
            if (str7 != null && !str7.equals("")) {
                zzglVar.zza(8, this.zzck);
            }
            String str8 = this.zzcl;
            if (str8 != null && !str8.equals("")) {
                zzglVar.zza(9, this.zzcl);
            }
            String str9 = this.zzcm;
            if (str9 != null && !str9.equals("")) {
                zzglVar.zza(10, this.zzcm);
            }
            String str10 = this.zzbr;
            if (str10 != null && !str10.equals("")) {
                zzglVar.zza(11, this.zzbr);
            }
            String str11 = this.zzcn;
            if (str11 != null && !str11.equals("")) {
                zzglVar.zza(12, this.zzcn);
            }
            String str12 = this.zzco;
            if (str12 != null && !str12.equals("")) {
                zzglVar.zza(13, this.zzco);
            }
            String str13 = this.zzl;
            if (str13 != null && !str13.equals("")) {
                zzglVar.zza(14, this.zzl);
            }
            String str14 = this.zzcp;
            if (str14 != null && !str14.equals("")) {
                zzglVar.zza(15, this.zzcp);
            }
            String str15 = this.zzcq;
            if (str15 != null && !str15.equals("")) {
                zzglVar.zza(16, this.zzcq);
            }
            String str16 = this.zzad;
            if (str16 != null && !str16.equals("")) {
                zzglVar.zza(17, this.zzad);
            }
            boolean z2 = this.zzcr;
            if (z2) {
                zzglVar.zzb(18, z2);
            }
            String str17 = this.zzbh;
            if (str17 != null && !str17.equals("")) {
                zzglVar.zza(19, this.zzbh);
            }
            String str18 = this.zzaf;
            if (str18 != null && !str18.equals("")) {
                zzglVar.zza(20, this.zzaf);
            }
            String str19 = this.zzcs;
            if (str19 != null && !str19.equals("")) {
                zzglVar.zza(21, this.zzcs);
            }
            String str20 = this.zzn;
            if (str20 != null && !str20.equals("")) {
                zzglVar.zza(23, this.zzn);
            }
            String[] strArr = this.zzct;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                while (true) {
                    String[] strArr2 = this.zzct;
                    if (i >= strArr2.length) {
                        break;
                    }
                    String str21 = strArr2[i];
                    if (str21 != null) {
                        zzglVar.zza(24, str21);
                    }
                    i++;
                }
            }
            boolean z3 = this.zzcu;
            if (z3) {
                zzglVar.zzb(25, z3);
            }
            String str22 = this.zzcv;
            if (str22 != null && !str22.equals("")) {
                zzglVar.zza(26, this.zzcv);
            }
            String str23 = this.zzcw;
            if (str23 != null && !str23.equals("")) {
                zzglVar.zza(27, this.zzcw);
            }
            String str24 = this.zzcx;
            if (str24 != null && !str24.equals("")) {
                zzglVar.zza(28, this.zzcx);
            }
            String str25 = this.zzcy;
            if (str25 != null && !str25.equals("")) {
                zzglVar.zza(29, this.zzcy);
            }
            long j = this.zzcz;
            if (j != 0) {
                zzglVar.zzi(30, j);
            }
            String str26 = this.zzda;
            if (str26 != null && !str26.equals("")) {
                zzglVar.zza(31, this.zzda);
            }
            boolean z4 = this.zzdb;
            if (z4) {
                zzglVar.zzb(32, z4);
            }
            String str27 = this.zzdc;
            if (str27 != null && !str27.equals("")) {
                zzglVar.zza(33, this.zzdc);
            }
            String str28 = this.zzai;
            if (str28 != null && !str28.equals("")) {
                zzglVar.zza(34, this.zzai);
            }
            long j2 = this.zzaj;
            if (j2 != 0) {
                zzglVar.zzi(35, j2);
            }
            String str29 = this.zzdd;
            if (str29 != null && !str29.equals("")) {
                zzglVar.zza(36, this.zzdd);
            }
            String str30 = this.zzde;
            if (str30 != null && !str30.equals("")) {
                zzglVar.zza(37, this.zzde);
            }
            String str31 = this.zzdf;
            if (str31 != null && !str31.equals("")) {
                zzglVar.zza(38, this.zzdf);
            }
            String str32 = this.zzdg;
            if (str32 != null && !str32.equals("")) {
                zzglVar.zza(39, this.zzdg);
            }
            boolean z5 = this.zzak;
            if (z5) {
                zzglVar.zzb(40, z5);
            }
            super.zza(zzglVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        protected final int zzb() {
            int zzb = super.zzb();
            String str = this.zzcg;
            if (str != null && !str.equals("")) {
                zzb += zzgl.zzb(1, this.zzcg);
            }
            String str2 = this.zzj;
            if (str2 != null && !str2.equals("")) {
                zzb += zzgl.zzb(2, this.zzj);
            }
            String str3 = this.zzah;
            if (str3 != null && !str3.equals("")) {
                zzb += zzgl.zzb(3, this.zzah);
            }
            if (this.zzbk) {
                zzb += zzgl.zzaa(4) + 1;
            }
            String str4 = this.zzch;
            if (str4 != null && !str4.equals("")) {
                zzb += zzgl.zzb(5, this.zzch);
            }
            String str5 = this.zzci;
            if (str5 != null && !str5.equals("")) {
                zzb += zzgl.zzb(6, this.zzci);
            }
            String str6 = this.zzcj;
            if (str6 != null && !str6.equals("")) {
                zzb += zzgl.zzb(7, this.zzcj);
            }
            String str7 = this.zzck;
            if (str7 != null && !str7.equals("")) {
                zzb += zzgl.zzb(8, this.zzck);
            }
            String str8 = this.zzcl;
            if (str8 != null && !str8.equals("")) {
                zzb += zzgl.zzb(9, this.zzcl);
            }
            String str9 = this.zzcm;
            if (str9 != null && !str9.equals("")) {
                zzb += zzgl.zzb(10, this.zzcm);
            }
            String str10 = this.zzbr;
            if (str10 != null && !str10.equals("")) {
                zzb += zzgl.zzb(11, this.zzbr);
            }
            String str11 = this.zzcn;
            if (str11 != null && !str11.equals("")) {
                zzb += zzgl.zzb(12, this.zzcn);
            }
            String str12 = this.zzco;
            if (str12 != null && !str12.equals("")) {
                zzb += zzgl.zzb(13, this.zzco);
            }
            String str13 = this.zzl;
            if (str13 != null && !str13.equals("")) {
                zzb += zzgl.zzb(14, this.zzl);
            }
            String str14 = this.zzcp;
            if (str14 != null && !str14.equals("")) {
                zzb += zzgl.zzb(15, this.zzcp);
            }
            String str15 = this.zzcq;
            if (str15 != null && !str15.equals("")) {
                zzb += zzgl.zzb(16, this.zzcq);
            }
            String str16 = this.zzad;
            if (str16 != null && !str16.equals("")) {
                zzb += zzgl.zzb(17, this.zzad);
            }
            if (this.zzcr) {
                zzb += zzgl.zzaa(18) + 1;
            }
            String str17 = this.zzbh;
            if (str17 != null && !str17.equals("")) {
                zzb += zzgl.zzb(19, this.zzbh);
            }
            String str18 = this.zzaf;
            if (str18 != null && !str18.equals("")) {
                zzb += zzgl.zzb(20, this.zzaf);
            }
            String str19 = this.zzcs;
            if (str19 != null && !str19.equals("")) {
                zzb += zzgl.zzb(21, this.zzcs);
            }
            String str20 = this.zzn;
            if (str20 != null && !str20.equals("")) {
                zzb += zzgl.zzb(23, this.zzn);
            }
            String[] strArr = this.zzct;
            if (strArr != null && strArr.length > 0) {
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    String[] strArr2 = this.zzct;
                    if (i >= strArr2.length) {
                        break;
                    }
                    String str21 = strArr2[i];
                    if (str21 != null) {
                        i3++;
                        i2 += zzgl.zzam(str21);
                    }
                    i++;
                }
                zzb = zzb + i2 + (i3 * 2);
            }
            if (this.zzcu) {
                zzb += zzgl.zzaa(25) + 1;
            }
            String str22 = this.zzcv;
            if (str22 != null && !str22.equals("")) {
                zzb += zzgl.zzb(26, this.zzcv);
            }
            String str23 = this.zzcw;
            if (str23 != null && !str23.equals("")) {
                zzb += zzgl.zzb(27, this.zzcw);
            }
            String str24 = this.zzcx;
            if (str24 != null && !str24.equals("")) {
                zzb += zzgl.zzb(28, this.zzcx);
            }
            String str25 = this.zzcy;
            if (str25 != null && !str25.equals("")) {
                zzb += zzgl.zzb(29, this.zzcy);
            }
            long j = this.zzcz;
            if (j != 0) {
                zzb += zzgl.zzd(30, j);
            }
            String str26 = this.zzda;
            if (str26 != null && !str26.equals("")) {
                zzb += zzgl.zzb(31, this.zzda);
            }
            if (this.zzdb) {
                zzb += zzgl.zzaa(32) + 1;
            }
            String str27 = this.zzdc;
            if (str27 != null && !str27.equals("")) {
                zzb += zzgl.zzb(33, this.zzdc);
            }
            String str28 = this.zzai;
            if (str28 != null && !str28.equals("")) {
                zzb += zzgl.zzb(34, this.zzai);
            }
            long j2 = this.zzaj;
            if (j2 != 0) {
                zzb += zzgl.zzd(35, j2);
            }
            String str29 = this.zzdd;
            if (str29 != null && !str29.equals("")) {
                zzb += zzgl.zzb(36, this.zzdd);
            }
            String str30 = this.zzde;
            if (str30 != null && !str30.equals("")) {
                zzb += zzgl.zzb(37, this.zzde);
            }
            String str31 = this.zzdf;
            if (str31 != null && !str31.equals("")) {
                zzb += zzgl.zzb(38, this.zzdf);
            }
            String str32 = this.zzdg;
            if (str32 != null && !str32.equals("")) {
                zzb += zzgl.zzb(39, this.zzdg);
            }
            return this.zzak ? zzb + zzgl.zzaa(40) + 1 : zzb;
        }
    }

    public static final class zzh extends zzgn<zzh> {
        private String zzw = "";
        public String zzaf = "";
        public String zzai = "";
        public long zzaj = 0;
        public boolean zzak = false;

        public zzh() {
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
                    this.zzw = zzgkVar.readString();
                } else if (zzcc == 18) {
                    this.zzaf = zzgkVar.readString();
                } else if (zzcc == 26) {
                    this.zzai = zzgkVar.readString();
                } else if (zzcc == 32) {
                    this.zzaj = zzgkVar.zzcv();
                } else if (zzcc == 40) {
                    this.zzak = zzgkVar.zzci();
                } else if (!super.zza(zzgkVar, zzcc)) {
                    return this;
                }
            }
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        public final void zza(zzgl zzglVar) throws IOException {
            zzglVar.zza(1, this.zzw);
            String str = this.zzaf;
            if (str != null && !str.equals("")) {
                zzglVar.zza(2, this.zzaf);
            }
            String str2 = this.zzai;
            if (str2 != null && !str2.equals("")) {
                zzglVar.zza(3, this.zzai);
            }
            long j = this.zzaj;
            if (j != 0) {
                zzglVar.zzi(4, j);
            }
            boolean z = this.zzak;
            if (z) {
                zzglVar.zzb(5, z);
            }
            super.zza(zzglVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        protected final int zzb() {
            int zzb = super.zzb() + zzgl.zzb(1, this.zzw);
            String str = this.zzaf;
            if (str != null && !str.equals("")) {
                zzb += zzgl.zzb(2, this.zzaf);
            }
            String str2 = this.zzai;
            if (str2 != null && !str2.equals("")) {
                zzb += zzgl.zzb(3, this.zzai);
            }
            long j = this.zzaj;
            if (j != 0) {
                zzb += zzgl.zzd(4, j);
            }
            return this.zzak ? zzb + zzgl.zzaa(5) + 1 : zzb;
        }
    }

    public static final class zzi extends zzgn<zzi> {
        private String zzw = "";
        public String zzad = "";
        public String zzah = "";
        public String zzbh = "";
        public String zzaf = "";
        private boolean zzz = false;
        public String zzbr = "";
        private String zzcx = "";
        private long zzcz = 0;
        private String zzda = "";
        public String zzai = "";
        public long zzaj = 0;

        public zzi() {
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
                        this.zzw = zzgkVar.readString();
                        break;
                    case 18:
                        this.zzad = zzgkVar.readString();
                        break;
                    case 26:
                        this.zzah = zzgkVar.readString();
                        break;
                    case 34:
                        this.zzbh = zzgkVar.readString();
                        break;
                    case 42:
                        this.zzaf = zzgkVar.readString();
                        break;
                    case 48:
                        this.zzz = zzgkVar.zzci();
                        break;
                    case 58:
                        this.zzbr = zzgkVar.readString();
                        break;
                    case 66:
                        this.zzcx = zzgkVar.readString();
                        break;
                    case 72:
                        this.zzcz = zzgkVar.zzcv();
                        break;
                    case 82:
                        this.zzda = zzgkVar.readString();
                        break;
                    case 90:
                        this.zzai = zzgkVar.readString();
                        break;
                    case 96:
                        this.zzaj = zzgkVar.zzcv();
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
            zzglVar.zza(1, this.zzw);
            String str = this.zzad;
            if (str != null && !str.equals("")) {
                zzglVar.zza(2, this.zzad);
            }
            String str2 = this.zzah;
            if (str2 != null && !str2.equals("")) {
                zzglVar.zza(3, this.zzah);
            }
            String str3 = this.zzbh;
            if (str3 != null && !str3.equals("")) {
                zzglVar.zza(4, this.zzbh);
            }
            String str4 = this.zzaf;
            if (str4 != null && !str4.equals("")) {
                zzglVar.zza(5, this.zzaf);
            }
            boolean z = this.zzz;
            if (z) {
                zzglVar.zzb(6, z);
            }
            String str5 = this.zzbr;
            if (str5 != null && !str5.equals("")) {
                zzglVar.zza(7, this.zzbr);
            }
            String str6 = this.zzcx;
            if (str6 != null && !str6.equals("")) {
                zzglVar.zza(8, this.zzcx);
            }
            long j = this.zzcz;
            if (j != 0) {
                zzglVar.zzi(9, j);
            }
            String str7 = this.zzda;
            if (str7 != null && !str7.equals("")) {
                zzglVar.zza(10, this.zzda);
            }
            String str8 = this.zzai;
            if (str8 != null && !str8.equals("")) {
                zzglVar.zza(11, this.zzai);
            }
            long j2 = this.zzaj;
            if (j2 != 0) {
                zzglVar.zzi(12, j2);
            }
            super.zza(zzglVar);
        }

        @Override // com.google.android.gms.internal.firebase_auth.zzgn, com.google.android.gms.internal.firebase_auth.zzgt
        protected final int zzb() {
            int zzb = super.zzb() + zzgl.zzb(1, this.zzw);
            String str = this.zzad;
            if (str != null && !str.equals("")) {
                zzb += zzgl.zzb(2, this.zzad);
            }
            String str2 = this.zzah;
            if (str2 != null && !str2.equals("")) {
                zzb += zzgl.zzb(3, this.zzah);
            }
            String str3 = this.zzbh;
            if (str3 != null && !str3.equals("")) {
                zzb += zzgl.zzb(4, this.zzbh);
            }
            String str4 = this.zzaf;
            if (str4 != null && !str4.equals("")) {
                zzb += zzgl.zzb(5, this.zzaf);
            }
            if (this.zzz) {
                zzb += zzgl.zzaa(6) + 1;
            }
            String str5 = this.zzbr;
            if (str5 != null && !str5.equals("")) {
                zzb += zzgl.zzb(7, this.zzbr);
            }
            String str6 = this.zzcx;
            if (str6 != null && !str6.equals("")) {
                zzb += zzgl.zzb(8, this.zzcx);
            }
            long j = this.zzcz;
            if (j != 0) {
                zzb += zzgl.zzd(9, j);
            }
            String str7 = this.zzda;
            if (str7 != null && !str7.equals("")) {
                zzb += zzgl.zzb(10, this.zzda);
            }
            String str8 = this.zzai;
            if (str8 != null && !str8.equals("")) {
                zzb += zzgl.zzb(11, this.zzai);
            }
            long j2 = this.zzaj;
            return j2 != 0 ? zzb + zzgl.zzd(12, j2) : zzb;
        }
    }
}
