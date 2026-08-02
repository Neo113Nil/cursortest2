package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzwv extends com.google.android.libraries.places.internal.zzwz {
    private static final com.google.android.libraries.places.internal.zzwz zza = new com.google.android.libraries.places.internal.zzwv();

    @Override // com.google.android.libraries.places.internal.zzwz
    public final int zzb(com.google.android.libraries.places.internal.zzww zzwwVar, int i, java.lang.String str, int i2, int i3, int i4) throws com.google.android.libraries.places.internal.zzwy {
        com.google.android.libraries.places.internal.zzwr zza2;
        char charAt = str.charAt(i4);
        com.google.android.libraries.places.internal.zzuk zzb = com.google.android.libraries.places.internal.zzuk.zzb(str, i3, i4, (charAt & ' ') == 0);
        com.google.android.libraries.places.internal.zzuj zza3 = com.google.android.libraries.places.internal.zzuj.zza(charAt);
        int i5 = i4 + 1;
        if (zza3 != null) {
            if (!zzb.zzi(zza3)) {
                throw com.google.android.libraries.places.internal.zzwy.zza("invalid format specifier", str, i2, i5);
            }
            zza2 = com.google.android.libraries.places.internal.zzwt.zza(i, zza3, zzb);
        } else if (charAt == 't' || charAt == 'T') {
            if (!zzb.zzh(160, false)) {
                throw com.google.android.libraries.places.internal.zzwy.zza("invalid format specification", str, i2, i5);
            }
            int i6 = i4 + 2;
            if (i6 > str.length()) {
                throw com.google.android.libraries.places.internal.zzwy.zzb("truncated format specifier", str, i2);
            }
            com.google.android.libraries.places.internal.zzwp zza4 = com.google.android.libraries.places.internal.zzwp.zza(str.charAt(i5));
            if (zza4 == null) {
                throw com.google.android.libraries.places.internal.zzwy.zzb("illegal date/time conversion", str, i5);
            }
            zza2 = com.google.android.libraries.places.internal.zzwq.zza(zza4, zzb, i);
            i5 = i6;
        } else {
            if (charAt != 'h' && charAt != 'H') {
                throw com.google.android.libraries.places.internal.zzwy.zza("invalid format specification", str, i2, i5);
            }
            if (!zzb.zzh(160, false)) {
                throw com.google.android.libraries.places.internal.zzwy.zza("invalid format specification", str, i2, i5);
            }
            zza2 = new com.google.android.libraries.places.internal.zzwu(zzb, i, zzb);
        }
        zzwwVar.zzk(i2, i5, zza2);
        return i5;
    }

    public static com.google.android.libraries.places.internal.zzwz zza() {
        return zza;
    }

    private zzwv() {
    }
}
