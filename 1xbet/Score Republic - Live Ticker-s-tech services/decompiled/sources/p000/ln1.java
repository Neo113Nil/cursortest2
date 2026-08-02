package p000;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ln1 extends AbstractMap {

    /* JADX INFO: renamed from: o */
    public static final ol0 f4857o = new ol0(4);

    /* JADX INFO: renamed from: j */
    public final Object[] f4858j;

    /* JADX INFO: renamed from: k */
    public final int[] f4859k;

    /* JADX INFO: renamed from: l */
    public final kn1 f4860l;

    /* JADX INFO: renamed from: m */
    public Integer f4861m;

    /* JADX INFO: renamed from: n */
    public String f4862n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, ln1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [ln1] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public ln1(ln1 ln1Var, ln1 ln1Var2) {
        Object obj;
        Object[] objArr;
        ?? abstractMap = new AbstractMap();
        abstractMap.f4860l = new kn1(abstractMap, -1);
        abstractMap.f4861m = null;
        abstractMap.f4862n = null;
        int size = ln1Var2.size() + ln1Var.size();
        int i = ln1Var.f4859k[ln1Var.size()] + ln1Var2.f4859k[ln1Var2.size()];
        int i2 = size + 1;
        Object[] objArr2 = new Object[i];
        int[] iArr = new int[i2];
        int i3 = 0;
        iArr[0] = size;
        Map.Entry entryM3239c = ln1Var.m3239c(0);
        Map.Entry entryM3239c2 = ln1Var2.m3239c(0);
        int i4 = 0;
        int i5 = 0;
        int iM3238a = size;
        int i6 = 0;
        while (true) {
            if (entryM3239c == null && entryM3239c2 == null) {
                break;
            }
            i6++;
            if (entryM3239c != null) {
                if (entryM3239c2 != null) {
                    int iCompareTo = ((String) entryM3239c.getKey()).compareTo((String) entryM3239c2.getKey());
                    if (iCompareTo == 0) {
                        int i7 = i4 + 1;
                        int i8 = i5 + 1;
                        objArr2[i6] = new AbstractMap.SimpleImmutableEntry((String) entryM3239c.getKey(), new kn1(abstractMap, i6));
                        kn1 kn1Var = (kn1) entryM3239c.getValue();
                        kn1 kn1Var2 = (kn1) entryM3239c2.getValue();
                        int i9 = 0;
                        int i10 = 0;
                        abstractMap = abstractMap;
                        while (true) {
                            int iM3058c = kn1Var.m3058c();
                            ln1 ln1Var3 = kn1Var.f4465k;
                            if (i9 >= iM3058c - kn1Var.m3057b() && i10 >= kn1Var2.m3058c() - kn1Var2.m3057b()) {
                                break;
                            }
                            int iCompare = i9 == kn1Var.m3058c() - kn1Var.m3057b() ? 1 : i10 == kn1Var2.m3058c() - kn1Var2.m3057b() ? -1 : 0;
                            if (iCompare == 0) {
                                ol0 ol0Var = mn1.f5101b;
                                iCompare = mn1.f5101b.compare(ln1Var3.f4858j[kn1Var.m3057b() + i9], kn1Var2.f4465k.f4858j[kn1Var2.m3057b() + i10]);
                            }
                            if (iCompare < 0) {
                                i9++;
                                obj = ln1Var3.f4858j[kn1Var.m3057b() + i9];
                            } else {
                                int i11 = i10 + 1;
                                Object obj2 = kn1Var2.f4465k.f4858j[kn1Var2.m3057b() + i10];
                                if (iCompare == 0) {
                                    i10 = i11;
                                    obj = obj2;
                                    i9++;
                                } else {
                                    i10 = i11;
                                    obj = obj2;
                                    i9 = i9;
                                }
                            }
                            objArr2[iM3238a] = obj;
                            abstractMap = this;
                            iM3238a++;
                        }
                        iArr[i6] = iM3238a;
                        entryM3239c = ln1Var.m3239c(i8);
                        entryM3239c2 = ln1Var2.m3239c(i7);
                        i5 = i8;
                        i4 = i7;
                        i3 = 0;
                    } else {
                        if (iCompareTo < 0) {
                        }
                        i3 = 0;
                        abstractMap = this;
                    }
                }
                i5++;
                iM3238a = m3238a(entryM3239c, i6, iM3238a, objArr2, iArr);
                entryM3239c = ln1Var.m3239c(i5);
                i3 = 0;
                abstractMap = this;
            }
            Map.Entry entry = entryM3239c;
            i4++;
            int iM3238a2 = m3238a(entryM3239c2, i6, iM3238a, objArr2, iArr);
            entryM3239c2 = ln1Var2.m3239c(i4);
            iM3238a = iM3238a2;
            entryM3239c = entry;
            i3 = 0;
            abstractMap = this;
        }
        int i12 = iArr[i3];
        int i13 = i12 - i6;
        if (i13 != 0) {
            for (int i14 = i3; i14 <= i6; i14++) {
                iArr[i14] = iArr[i14] - i13;
            }
            int i15 = iArr[i6];
            int i16 = i15 - i6;
            if (m3237b(i, i15)) {
                objArr = new Object[i15];
                System.arraycopy(objArr2, i3, objArr, i3, i6);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i12, objArr, i6, i16);
            objArr2 = objArr;
        }
        abstractMap.f4858j = objArr2;
        int i17 = iArr[i3] + 1;
        abstractMap.f4859k = m3237b(i2, i17) ? Arrays.copyOf(iArr, i17) : iArr;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m3237b(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    /* JADX INFO: renamed from: a */
    public final int m3238a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        kn1 kn1Var = (kn1) entry.getValue();
        int iM3058c = kn1Var.m3058c() - kn1Var.m3057b();
        System.arraycopy(kn1Var.f4465k.f4858j, kn1Var.m3057b(), objArr, i2, iM3058c);
        objArr[i] = new AbstractMap.SimpleImmutableEntry((String) entry.getKey(), new kn1(this, i));
        int i3 = i2 + iM3058c;
        iArr[i + 1] = i3;
        return i3;
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry m3239c(int i) {
        if (i < this.f4859k[0]) {
            return (Map.Entry) this.f4858j[i];
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f4860l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.f4861m == null) {
            this.f4861m = Integer.valueOf(super.hashCode());
        }
        return this.f4861m.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.f4862n == null) {
            this.f4862n = super.toString();
        }
        return this.f4862n;
    }

    public ln1() {
        List list = Collections.EMPTY_LIST;
        this.f4860l = new kn1(this, -1);
        this.f4861m = null;
        this.f4862n = null;
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                int[] iArr = {0};
                this.f4858j = m3237b(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.f4859k = iArr;
                return;
            }
            throw AbstractC0024an.m280c(it2);
        }
        throw AbstractC0024an.m280c(it);
    }
}
