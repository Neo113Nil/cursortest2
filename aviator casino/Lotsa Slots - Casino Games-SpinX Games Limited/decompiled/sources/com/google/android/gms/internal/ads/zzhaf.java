package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhaf implements java.io.Serializable {
    private static final com.google.android.gms.internal.ads.zzhaf zza = new com.google.android.gms.internal.ads.zzhaf(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzhaf(int[] iArr, int i, int i2) {
        this.zzb = iArr;
        this.zzc = i2;
    }

    /* synthetic */ zzhaf(int[] iArr, int i, int i2, byte[] bArr) {
        this(iArr, 0, i2);
    }

    public static com.google.android.gms.internal.ads.zzhaf zza() {
        return zza;
    }

    public static com.google.android.gms.internal.ads.zzhaf zzb(int i, int i2, int i3) {
        return new com.google.android.gms.internal.ads.zzhaf(new int[]{0, 2, 1}, 0, 3);
    }

    public static com.google.android.gms.internal.ads.zzhaf zzc(int i, int i2, int i3, int i4, int i5) {
        return new com.google.android.gms.internal.ads.zzhaf(new int[]{0, 2, 1, 3, 4}, 0, 5);
    }

    public static com.google.android.gms.internal.ads.zzhaf zzd(int i, int i2, int i3, int i4, int i5, int i6) {
        return new com.google.android.gms.internal.ads.zzhaf(new int[]{0, 2, 1, 5, 3, 4}, 0, 6);
    }

    public static com.google.android.gms.internal.ads.zzhaf zze(int i, int... iArr) {
        int length = iArr.length;
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        iArr2[0] = 0;
        java.lang.System.arraycopy(iArr, 0, iArr2, 1, length);
        return new com.google.android.gms.internal.ads.zzhaf(iArr2, 0, i2);
    }

    public static com.google.android.gms.internal.ads.zzhaf zzf(int[] iArr) {
        int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length);
        return new com.google.android.gms.internal.ads.zzhaf(copyOf, 0, copyOf.length);
    }

    public static com.google.android.gms.internal.ads.zzhae zzg(int i) {
        com.google.android.gms.internal.ads.zzgtj.zzd(i >= 0, "Invalid initialCapacity: %s", i);
        return new com.google.android.gms.internal.ads.zzhae(i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzhaf)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzhaf zzhafVar = (com.google.android.gms.internal.ads.zzhaf) obj;
        int i = this.zzc;
        if (i != zzhafVar.zzc) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (zzi(i2) != zzhafVar.zzi(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zzb[i2];
        }
        return i;
    }

    public final java.lang.String toString() {
        int i = this.zzc;
        if (i == 0) {
            return okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i * 5);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int[] iArr = this.zzb;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public final int zzh() {
        return this.zzc;
    }

    public final int zzi(int i) {
        com.google.android.gms.internal.ads.zzgtj.zzm(i, this.zzc, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return this.zzb[i];
    }
}
