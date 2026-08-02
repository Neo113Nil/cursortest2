package com.google.android.recaptcha.internal;

import C6.a;
import g6.AbstractC1159h;
import g6.AbstractC1161j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import q2.g;
import z6.e;
import z6.f;

/* loaded from: classes.dex */
public final class zzfo implements zzfe {
    public static final zzfo zza = new zzfo();

    private zzfo() {
    }

    private final Object zzb(Object obj, Object obj2) {
        boolean z4 = obj instanceof Byte;
        if (z4 && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z7 = obj instanceof Short;
        if (z7 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z8 = obj instanceof Integer;
        if (z8 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z9 = obj instanceof Long;
        if (z9 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z10 = obj instanceof Float;
        if (z10 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z11 = obj instanceof Double;
        if (z11 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i7 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(a.f1581a);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i7 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i7] % ((Number) obj2).intValue())));
                    i7++;
                }
                return new String(AbstractC1159h.X0(arrayList), a.f1581a);
            }
            if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i7 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i7] % ((Number) obj2).intValue()));
                    i7++;
                }
                return AbstractC1159h.Z0(arrayList2);
            }
        }
        if (z4 && (obj2 instanceof byte[])) {
            byte[] bArr = (byte[]) obj2;
            ArrayList arrayList3 = new ArrayList(bArr.length);
            for (byte b7 : bArr) {
                arrayList3.add(Integer.valueOf(b7 % ((Number) obj).intValue()));
            }
            return arrayList3.toArray(new Integer[0]);
        }
        if (z7 && (obj2 instanceof short[])) {
            short[] sArr = (short[]) obj2;
            ArrayList arrayList4 = new ArrayList(sArr.length);
            for (short s7 : sArr) {
                arrayList4.add(Integer.valueOf(s7 % ((Number) obj).intValue()));
            }
            return arrayList4.toArray(new Integer[0]);
        }
        if (z8 && (obj2 instanceof int[])) {
            int[] iArr = (int[]) obj2;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            for (int i8 : iArr) {
                arrayList5.add(Integer.valueOf(i8 % ((Number) obj).intValue()));
            }
            return arrayList5.toArray(new Integer[0]);
        }
        if (z9 && (obj2 instanceof long[])) {
            long[] jArr = (long[]) obj2;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            for (long j : jArr) {
                arrayList6.add(Long.valueOf(j % ((Number) obj).longValue()));
            }
            return arrayList6.toArray(new Long[0]);
        }
        if (z10 && (obj2 instanceof float[])) {
            float[] fArr = (float[]) obj2;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            for (float f7 : fArr) {
                arrayList7.add(Float.valueOf(f7 % ((Number) obj).floatValue()));
            }
            return arrayList7.toArray(new Float[0]);
        }
        if (z11 && (obj2 instanceof double[])) {
            double[] dArr = (double[]) obj2;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            for (double d7 : dArr) {
                arrayList8.add(Double.valueOf(d7 % ((Number) obj).doubleValue()));
            }
            return arrayList8.toArray(new Double[0]);
        }
        boolean z12 = obj instanceof byte[];
        if (z12 && (obj2 instanceof Byte)) {
            byte[] bArr2 = (byte[]) obj;
            ArrayList arrayList9 = new ArrayList(bArr2.length);
            for (byte b8 : bArr2) {
                arrayList9.add(Integer.valueOf(b8 % ((Number) obj2).intValue()));
            }
            return arrayList9.toArray(new Integer[0]);
        }
        boolean z13 = obj instanceof short[];
        if (z13 && (obj2 instanceof Short)) {
            short[] sArr2 = (short[]) obj;
            ArrayList arrayList10 = new ArrayList(sArr2.length);
            for (short s8 : sArr2) {
                arrayList10.add(Integer.valueOf(s8 % ((Number) obj2).intValue()));
            }
            return arrayList10.toArray(new Integer[0]);
        }
        boolean z14 = obj instanceof int[];
        if (z14 && (obj2 instanceof Integer)) {
            int[] iArr2 = (int[]) obj;
            int length3 = iArr2.length;
            ArrayList arrayList11 = new ArrayList(length3);
            while (i7 < length3) {
                arrayList11.add(Integer.valueOf(iArr2[i7] % ((Number) obj2).intValue()));
                i7++;
            }
            return AbstractC1159h.Z0(arrayList11);
        }
        boolean z15 = obj instanceof long[];
        if (z15 && (obj2 instanceof Long)) {
            long[] jArr2 = (long[]) obj;
            ArrayList arrayList12 = new ArrayList(jArr2.length);
            for (long j3 : jArr2) {
                arrayList12.add(Long.valueOf(j3 % ((Number) obj2).longValue()));
            }
            return arrayList12.toArray(new Long[0]);
        }
        boolean z16 = obj instanceof float[];
        if (z16 && (obj2 instanceof Float)) {
            float[] fArr2 = (float[]) obj;
            ArrayList arrayList13 = new ArrayList(fArr2.length);
            for (float f8 : fArr2) {
                arrayList13.add(Float.valueOf(f8 % ((Number) obj2).floatValue()));
            }
            return arrayList13.toArray(new Float[0]);
        }
        boolean z17 = obj instanceof double[];
        if (z17 && (obj2 instanceof Double)) {
            double[] dArr2 = (double[]) obj;
            ArrayList arrayList14 = new ArrayList(dArr2.length);
            for (double d8 : dArr2) {
                arrayList14.add(Double.valueOf(d8 % ((Number) obj2).doubleValue()));
            }
            return arrayList14.toArray(new Double[0]);
        }
        if (z12 && (obj2 instanceof byte[])) {
            byte[] bArr3 = (byte[]) obj;
            int length4 = bArr3.length;
            byte[] bArr4 = (byte[]) obj2;
            zzfd.zza(this, length4, bArr4.length);
            f e7 = g.e(0, length4);
            ArrayList arrayList15 = new ArrayList(AbstractC1161j.N0(e7));
            Iterator it = e7.iterator();
            while (((e) it).f18539c) {
                int a2 = ((e) it).a();
                arrayList15.add(Integer.valueOf(bArr3[a2] % bArr4[a2]));
            }
            return arrayList15.toArray(new Integer[0]);
        }
        if (z13 && (obj2 instanceof short[])) {
            short[] sArr3 = (short[]) obj;
            int length5 = sArr3.length;
            short[] sArr4 = (short[]) obj2;
            zzfd.zza(this, length5, sArr4.length);
            f e8 = g.e(0, length5);
            ArrayList arrayList16 = new ArrayList(AbstractC1161j.N0(e8));
            Iterator it2 = e8.iterator();
            while (((e) it2).f18539c) {
                int a4 = ((e) it2).a();
                arrayList16.add(Integer.valueOf(sArr3[a4] % sArr4[a4]));
            }
            return arrayList16.toArray(new Integer[0]);
        }
        if (z14 && (obj2 instanceof int[])) {
            int[] iArr3 = (int[]) obj;
            int length6 = iArr3.length;
            int[] iArr4 = (int[]) obj2;
            zzfd.zza(this, length6, iArr4.length);
            f e9 = g.e(0, length6);
            ArrayList arrayList17 = new ArrayList(AbstractC1161j.N0(e9));
            Iterator it3 = e9.iterator();
            while (((e) it3).f18539c) {
                int a7 = ((e) it3).a();
                arrayList17.add(Integer.valueOf(iArr3[a7] % iArr4[a7]));
            }
            return arrayList17.toArray(new Integer[0]);
        }
        if (z15 && (obj2 instanceof long[])) {
            long[] jArr3 = (long[]) obj;
            int length7 = jArr3.length;
            long[] jArr4 = (long[]) obj2;
            zzfd.zza(this, length7, jArr4.length);
            f e10 = g.e(0, length7);
            ArrayList arrayList18 = new ArrayList(AbstractC1161j.N0(e10));
            Iterator it4 = e10.iterator();
            while (((e) it4).f18539c) {
                int a8 = ((e) it4).a();
                arrayList18.add(Long.valueOf(jArr3[a8] % jArr4[a8]));
            }
            return arrayList18.toArray(new Long[0]);
        }
        if (z16 && (obj2 instanceof float[])) {
            float[] fArr3 = (float[]) obj;
            int length8 = fArr3.length;
            float[] fArr4 = (float[]) obj2;
            zzfd.zza(this, length8, fArr4.length);
            f e11 = g.e(0, length8);
            ArrayList arrayList19 = new ArrayList(AbstractC1161j.N0(e11));
            Iterator it5 = e11.iterator();
            while (((e) it5).f18539c) {
                int a9 = ((e) it5).a();
                arrayList19.add(Float.valueOf(fArr3[a9] % fArr4[a9]));
            }
            return arrayList19.toArray(new Float[0]);
        }
        if (!z17 || !(obj2 instanceof double[])) {
            throw new zzby(4, 5, null);
        }
        double[] dArr3 = (double[]) obj;
        int length9 = dArr3.length;
        double[] dArr4 = (double[]) obj2;
        zzfd.zza(this, length9, dArr4.length);
        f e12 = g.e(0, length9);
        ArrayList arrayList20 = new ArrayList(AbstractC1161j.N0(e12));
        Iterator it6 = e12.iterator();
        while (((e) it6).f18539c) {
            int a10 = ((e) it6).a();
            arrayList20.add(Double.valueOf(dArr3[a10] % dArr4[a10]));
        }
        return arrayList20.toArray(new Double[0]);
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(zza2)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzby(4, 5, null);
        }
        Object zza3 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != Objects.nonNull(zza3)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzby(4, 5, null);
        }
        try {
            zzekVar.zzc().zze(i7, zzb(zza2, zza3));
        } catch (ArithmeticException e7) {
            throw new zzby(4, 6, e7);
        }
    }
}
