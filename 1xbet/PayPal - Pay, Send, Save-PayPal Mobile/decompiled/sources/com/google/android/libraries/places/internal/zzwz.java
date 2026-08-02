package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public abstract class zzwz extends com.google.android.libraries.places.internal.zzwx {
    private static final java.lang.String zza;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L4;
     */
    static {
        java.lang.String str;
        try {
            str = java.lang.System.getProperty("line.separator");
        } catch (java.lang.SecurityException unused) {
        }
        str = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE;
        zza = str;
    }

    static int zze(java.lang.String str, int i) throws com.google.android.libraries.places.internal.zzwy {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else {
                if (i2 >= str.length()) {
                    throw com.google.android.libraries.places.internal.zzwy.zzc("trailing unquoted '%' character", str, i);
                }
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i;
                }
                i += 2;
            }
        }
        return -1;
    }

    abstract int zzb(com.google.android.libraries.places.internal.zzww zzwwVar, int i, java.lang.String str, int i2, int i3, int i4) throws com.google.android.libraries.places.internal.zzwy;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
    
        r4 = zze(r7, zzb(r15, r12, r7, r4, r5, r6));
        r0 = r11;
        r1 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    @Override // com.google.android.libraries.places.internal.zzwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzc(com.google.android.libraries.places.internal.zzww zzwwVar) throws com.google.android.libraries.places.internal.zzwy {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        java.lang.String zzi = zzwwVar.zzi();
        int zze = zze(zzi, 0);
        int i6 = 0;
        int i7 = -1;
        while (zze >= 0) {
            int i8 = zze + 1;
            int i9 = i8;
            int i10 = 0;
            while (i9 < zzi.length()) {
                int i11 = i9 + 1;
                char charAt = zzi.charAt(i9);
                char c = (char) (charAt - '0');
                if (c >= '\n') {
                    if (charAt == '$') {
                        if (i9 - i8 == 0) {
                            throw com.google.android.libraries.places.internal.zzwy.zza("missing index", zzi, zze, i11);
                        }
                        if (zzi.charAt(i8) == '0') {
                            throw com.google.android.libraries.places.internal.zzwy.zza("index has leading zero", zzi, zze, i11);
                        }
                        if (i11 == zzi.length()) {
                            throw com.google.android.libraries.places.internal.zzwy.zzc("unterminated parameter", zzi, zze);
                        }
                        i4 = i9 + 2;
                        i2 = i6;
                        i = i10 - 1;
                    } else {
                        if (charAt != '<') {
                            i = i6;
                            i2 = i6 + 1;
                            i3 = i8;
                            i5 = i11 - 1;
                            while (i5 < zzi.length()) {
                                if (((char) ((zzi.charAt(i5) & 65503) - 65)) < 26) {
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            throw com.google.android.libraries.places.internal.zzwy.zzc("unterminated parameter", zzi, zze);
                        }
                        if (i7 == -1) {
                            throw com.google.android.libraries.places.internal.zzwy.zza("invalid relative parameter", zzi, zze, i11);
                        }
                        if (i11 == zzi.length()) {
                            throw com.google.android.libraries.places.internal.zzwy.zzc("unterminated parameter", zzi, zze);
                        }
                        i4 = i9 + 2;
                        i2 = i6;
                        i = i7;
                    }
                    i3 = i11;
                    i11 = i4;
                    i5 = i11 - 1;
                    while (i5 < zzi.length()) {
                    }
                    throw com.google.android.libraries.places.internal.zzwy.zzc("unterminated parameter", zzi, zze);
                }
                i10 = (i10 * 10) + c;
                if (i10 >= 1000000) {
                    throw com.google.android.libraries.places.internal.zzwy.zza("index too large", zzi, zze, i11);
                }
                i9 = i11;
            }
            throw com.google.android.libraries.places.internal.zzwy.zzc("unterminated parameter", zzi, zze);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzwx
    public final void zzd(java.lang.StringBuilder sb, java.lang.String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append((java.lang.CharSequence) str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append((java.lang.CharSequence) str, i3, i);
                    sb.append(zza);
                }
                i3 = i + 2;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((java.lang.CharSequence) str, i3, i2);
        }
    }
}
