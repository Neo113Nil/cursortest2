package d1;

import java.util.HashMap;
import java.util.Map;
import n4.C1473g;

/* renamed from: d1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953f implements q4.b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12354a;

    public C0953f(HashMap hashMap) {
        this.f12354a = hashMap;
    }

    @Override // q4.b
    public Object a(C1473g c1473g, Object obj, Object obj2) {
        this.f12354a.put(c1473g.F(), ((v4.r) obj).u(true));
        return null;
    }

    public void b(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = this.f12354a;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    hashMap2.put(str, value);
                } else {
                    int i7 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = C0954g.f12355b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i7 < zArr.length) {
                            boolArr[i7] = Boolean.valueOf(zArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = C0954g.f12355b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i7 < bArr.length) {
                            bArr2[i7] = Byte.valueOf(bArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = C0954g.f12355b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i7 < iArr.length) {
                            numArr[i7] = Integer.valueOf(iArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = C0954g.f12355b;
                        Long[] lArr = new Long[jArr.length];
                        while (i7 < jArr.length) {
                            lArr[i7] = Long.valueOf(jArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = C0954g.f12355b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i7 < fArr.length) {
                            fArr2[i7] = Float.valueOf(fArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = C0954g.f12355b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i7 < dArr.length) {
                            dArr2[i7] = Double.valueOf(dArr[i7]);
                            i7++;
                        }
                        hashMap2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public C0953f() {
        this.f12354a = new HashMap();
    }
}
