package x2;

import java.util.HashMap;
import java.util.Map;

/* renamed from: x2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1545h {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1545h f12297b;

    /* renamed from: c, reason: collision with root package name */
    public static C1545h f12298c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12299a;

    public C1545h(int i2) {
        switch (i2) {
            case 1:
                this.f12299a = new HashMap();
                break;
            case 2:
                this.f12299a = new HashMap();
                break;
            case 3:
                this.f12299a = new HashMap();
                break;
            default:
                this.f12299a = new HashMap();
                break;
        }
    }

    public void a(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap hashMap2 = this.f12299a;
            if (value == null) {
                hashMap2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    hashMap2.put(str, value);
                } else {
                    int i2 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = s0.g.f11776b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i2 < zArr.length) {
                            boolArr[i2] = Boolean.valueOf(zArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = s0.g.f11776b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i2 < bArr.length) {
                            bArr2[i2] = Byte.valueOf(bArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = s0.g.f11776b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i2 < iArr.length) {
                            numArr[i2] = Integer.valueOf(iArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = s0.g.f11776b;
                        Long[] lArr = new Long[jArr.length];
                        while (i2 < jArr.length) {
                            lArr[i2] = Long.valueOf(jArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = s0.g.f11776b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i2 < fArr.length) {
                            fArr2[i2] = Float.valueOf(fArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + "has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = s0.g.f11776b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i2 < dArr.length) {
                            dArr2[i2] = Double.valueOf(dArr[i2]);
                            i2++;
                        }
                        hashMap2.put(str, dArr2);
                    }
                }
            }
        }
    }
}
