package com.google.android.recaptcha.internal;

import Y4.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p050g6.g;
import p050g6.j;
import p050g6.p;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class zzff implements zzfe {
    public static final zzff zza = new zzff();

    private zzff() {
    }

    private static final List zzc(Object obj) {
        boolean z4 = obj instanceof byte[];
        p pVar = p.f13308a;
        int i7 = 0;
        if (z4) {
            byte[] bArr = (byte[]) obj;
            h.e(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                return pVar;
            }
            if (length == 1) {
                return D.D(Byte.valueOf(bArr[0]));
            }
            ArrayList arrayList = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i7 < length2) {
                arrayList.add(Byte.valueOf(bArr[i7]));
                i7++;
            }
            return arrayList;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            h.e(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                return pVar;
            }
            if (length3 == 1) {
                return D.D(Short.valueOf(sArr[0]));
            }
            ArrayList arrayList2 = new ArrayList(sArr.length);
            int length4 = sArr.length;
            while (i7 < length4) {
                arrayList2.add(Short.valueOf(sArr[i7]));
                i7++;
            }
            return arrayList2;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            h.e(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 == 0) {
                return pVar;
            }
            if (length5 == 1) {
                return D.D(Integer.valueOf(iArr[0]));
            }
            ArrayList arrayList3 = new ArrayList(iArr.length);
            int length6 = iArr.length;
            while (i7 < length6) {
                arrayList3.add(Integer.valueOf(iArr[i7]));
                i7++;
            }
            return arrayList3;
        }
        if (obj instanceof long[]) {
            return g.v0((long[]) obj);
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            h.e(fArr, "<this>");
            int length7 = fArr.length;
            if (length7 == 0) {
                return pVar;
            }
            if (length7 == 1) {
                return D.D(Float.valueOf(fArr[0]));
            }
            ArrayList arrayList4 = new ArrayList(fArr.length);
            int length8 = fArr.length;
            while (i7 < length8) {
                arrayList4.add(Float.valueOf(fArr[i7]));
                i7++;
            }
            return arrayList4;
        }
        if (!(obj instanceof double[])) {
            return null;
        }
        double[] dArr = (double[]) obj;
        h.e(dArr, "<this>");
        int length9 = dArr.length;
        if (length9 == 0) {
            return pVar;
        }
        if (length9 == 1) {
            return D.D(Double.valueOf(dArr[0]));
        }
        ArrayList arrayList5 = new ArrayList(dArr.length);
        int length10 = dArr.length;
        while (i7 < length10) {
            arrayList5.add(Double.valueOf(dArr[i7]));
            i7++;
        }
        return arrayList5;
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i7, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object objZza = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzby(4, 5, null);
        }
        Object objZza2 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 == null) {
            throw new zzby(4, 5, null);
        }
        zzekVar.zzc().zze(i7, zzb(objZza, objZza2));
    }

    public final Object zzb(Object obj, Object obj2) throws zzby {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                ArrayList arrayList = new ArrayList(j.N0(listZzc2));
                Iterator it = listZzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(j.N0(listZzc));
            Iterator it2 = listZzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            throw new zzby(4, 5, null);
        }
        zzfd.zza(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i7 = 0; i7 < size; i7++) {
            dArr[i7] = Double.valueOf(Math.pow(((Number) listZzc.get(i7)).doubleValue(), ((Number) listZzc2.get(i7)).doubleValue()));
        }
        return dArr;
    }
}
