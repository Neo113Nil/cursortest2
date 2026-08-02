package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbkw {
    public static final java.nio.charset.Charset zza = java.nio.charset.Charset.forName("US-ASCII");
    public static final com.google.common.io.BaseEncoding zzb = com.google.android.libraries.places.internal.zzbmg.zzb;

    public static com.google.android.libraries.places.internal.zzbmc zza(java.lang.String str, com.google.android.libraries.places.internal.zzbkv zzbkvVar) {
        return new com.google.android.libraries.places.internal.zzbme(str, str.charAt(0) == ':', zzbkvVar, null);
    }

    public static byte[][] zzc(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        return zzbmgVar.zze();
    }

    public static int zzd(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        return zzbmgVar.zza();
    }

    public static com.google.android.libraries.places.internal.zzbmg zzb(byte[]... bArr) {
        return new com.google.android.libraries.places.internal.zzbmg(bArr.length >> 1, bArr);
    }
}
