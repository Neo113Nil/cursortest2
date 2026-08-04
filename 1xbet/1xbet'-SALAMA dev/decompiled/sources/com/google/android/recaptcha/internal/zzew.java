package com.google.android.recaptcha.internal;

import C6.a;
import java.util.Collection;
import java.util.Objects;
import p050g6.g;
import p050g6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzew implements zzfe {
    public static final zzew zza = new zzew();

    private zzew() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        String strT0;
        String str;
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        int i8 = 0;
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        if (objZza instanceof int[]) {
            int[] iArr = (int[]) objZza;
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int length = iArr.length;
            int i9 = 0;
            while (i8 < length) {
                int i10 = iArr[i8];
                i9++;
                if (i9 > 1) {
                    sb.append((CharSequence) ",");
                }
                sb.append((CharSequence) String.valueOf(i10));
                i8++;
            }
            sb.append((CharSequence) "]");
            strT0 = sb.toString();
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, a.f1581a);
            } else if (objZza instanceof long[]) {
                long[] jArr = (long[]) objZza;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "[");
                int length2 = jArr.length;
                int i11 = 0;
                while (i8 < length2) {
                    long j = jArr[i8];
                    i11++;
                    if (i11 > 1) {
                        sb2.append((CharSequence) ",");
                    }
                    sb2.append((CharSequence) String.valueOf(j));
                    i8++;
                }
                sb2.append((CharSequence) "]");
                strT0 = sb2.toString();
            } else if (objZza instanceof short[]) {
                short[] sArr = (short[]) objZza;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length3 = sArr.length;
                int i12 = 0;
                while (i8 < length3) {
                    short s7 = sArr[i8];
                    i12++;
                    if (i12 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf((int) s7));
                    i8++;
                }
                sb3.append((CharSequence) "]");
                strT0 = sb3.toString();
            } else if (objZza instanceof float[]) {
                float[] fArr = (float[]) objZza;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length4 = fArr.length;
                int i13 = 0;
                while (i8 < length4) {
                    float f7 = fArr[i8];
                    i13++;
                    if (i13 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf(f7));
                    i8++;
                }
                sb4.append((CharSequence) "]");
                strT0 = sb4.toString();
            } else if (objZza instanceof double[]) {
                double[] dArr = (double[]) objZza;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length5 = dArr.length;
                int i14 = 0;
                while (i8 < length5) {
                    double d7 = dArr[i8];
                    i14++;
                    if (i14 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(d7));
                    i8++;
                }
                sb5.append((CharSequence) "]");
                strT0 = sb5.toString();
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strT0 = g.u0((Object[]) objZza);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzby(4, 5, null);
                }
                strT0 = h.T0((Iterable) objZza, ",", "[", "]", null, 56);
            }
            strT0 = str;
        }
        zzekVar.zzc().zze(i7, strT0);
    }
}
