package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzuk {
    private static final long zza;
    private static final com.google.android.libraries.places.internal.zzuk zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        zza = j;
        zzb = new com.google.android.libraries.places.internal.zzuk(0, -1, -1);
    }

    static int zzc(java.lang.String str, boolean z) {
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int zzm = zzm(str.charAt(i2));
            if (zzm < 0) {
                throw new java.lang.IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << zzm;
        }
        return i;
    }

    private static int zzn(java.lang.String str, int i, int i2) throws com.google.android.libraries.places.internal.zzwy {
        if (i == i2) {
            throw com.google.android.libraries.places.internal.zzwy.zzb("missing precision", str, i - 1);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char charAt = (char) (str.charAt(i4) - '0');
            if (charAt >= '\n') {
                throw com.google.android.libraries.places.internal.zzwy.zzb("invalid precision character", str, i4);
            }
            i3 = (i3 * 10) + charAt;
            if (i3 > 999999) {
                throw com.google.android.libraries.places.internal.zzwy.zza("precision too large", str, i, i2);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw com.google.android.libraries.places.internal.zzwy.zza("invalid precision", str, i, i2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.internal.zzuk)) {
            return false;
        }
        com.google.android.libraries.places.internal.zzuk zzukVar = (com.google.android.libraries.places.internal.zzuk) obj;
        return zzukVar.zzc == this.zzc && zzukVar.zzd == this.zzd && zzukVar.zze == this.zze;
    }

    public final boolean zzi(com.google.android.libraries.places.internal.zzuj zzujVar) {
        return zzh(zzujVar.zzd(), zzujVar.zzc().zza());
    }

    public final java.lang.StringBuilder zzl(java.lang.StringBuilder sb) {
        if (!zze()) {
            int i = this.zzc;
            int i2 = 0;
            while (true) {
                int i3 = i & (-129);
                int i4 = 1 << i2;
                if (i4 > i3) {
                    break;
                }
                if ((i3 & i4) != 0) {
                    sb.append(" #(+,-0".charAt(i2));
                }
                i2++;
            }
            int i5 = this.zzd;
            if (i5 != -1) {
                sb.append(i5);
            }
            int i6 = this.zze;
            if (i6 != -1) {
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                sb.append(i6);
            }
        }
        return sb;
    }

    public static com.google.android.libraries.places.internal.zzuk zzb(java.lang.String str, int i, int i2, boolean z) throws com.google.android.libraries.places.internal.zzwy {
        if (i == i2 && !z) {
            return zzb;
        }
        int i3 = true != z ? 0 : 128;
        while (i != i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '0') {
                if (charAt > '9') {
                    throw com.google.android.libraries.places.internal.zzwy.zzb("invalid flag", str, i);
                }
                int i5 = charAt - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                while (i4 != i2) {
                    int i6 = i4 + 1;
                    char charAt2 = str.charAt(i4);
                    if (charAt2 == '.') {
                        return new com.google.android.libraries.places.internal.zzuk(i3, i5, zzn(str, i6, i2));
                    }
                    char c = (char) (charAt2 - '0');
                    if (c >= '\n') {
                        throw com.google.android.libraries.places.internal.zzwy.zzb("invalid width character", str, i4);
                    }
                    i5 = (i5 * 10) + c;
                    if (i5 > 999999) {
                        throw com.google.android.libraries.places.internal.zzwy.zza("width too large", str, i, i2);
                    }
                    i4 = i6;
                }
                return new com.google.android.libraries.places.internal.zzuk(i3, i5, -1);
            }
            int zzm = zzm(charAt);
            if (zzm < 0) {
                if (charAt == '.') {
                    return new com.google.android.libraries.places.internal.zzuk(i3, -1, zzn(str, i4, i2));
                }
                throw com.google.android.libraries.places.internal.zzwy.zzb("invalid flag", str, i);
            }
            int i7 = 1 << zzm;
            if ((i3 & i7) != 0) {
                throw com.google.android.libraries.places.internal.zzwy.zzb("repeated flag", str, i);
            }
            i3 |= i7;
            i = i4;
        }
        return new com.google.android.libraries.places.internal.zzuk(i3, -1, -1);
    }

    public final boolean zzk() {
        return (this.zzc & 128) != 0;
    }

    public final int zzj() {
        return this.zzc;
    }

    public final boolean zzh(int i, boolean z) {
        int i2;
        if (zze()) {
            return true;
        }
        int i3 = this.zzc;
        if (((~i) & i3) != 0) {
            return false;
        }
        if (!z && this.zze != -1) {
            return false;
        }
        int i4 = this.zzd;
        if ((i3 & 9) == 9 || (i2 = i3 & 96) == 96) {
            return false;
        }
        return i2 == 0 || i4 != -1;
    }

    public final int zzg() {
        return this.zze;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final boolean zze() {
        return this == zzb;
    }

    public final com.google.android.libraries.places.internal.zzuk zzd(int i, boolean z, boolean z2) {
        if (!zze()) {
            int i2 = this.zzc;
            int i3 = i2 & 128;
            if (i3 == 0) {
                return zzb;
            }
            if (i3 != i2 || this.zzd != -1 || this.zze != -1) {
                return new com.google.android.libraries.places.internal.zzuk(i3, -1, -1);
            }
        }
        return this;
    }

    public final int hashCode() {
        return (((this.zzc * 31) + this.zzd) * 31) + this.zze;
    }

    private static int zzm(char c) {
        return ((int) ((zza >>> ((c - ' ') * 3)) & 7)) - 1;
    }

    public static com.google.android.libraries.places.internal.zzuk zza() {
        return zzb;
    }

    private zzuk(int i, int i2, int i3) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
    }
}
