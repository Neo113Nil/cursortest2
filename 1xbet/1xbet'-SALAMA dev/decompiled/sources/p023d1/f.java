package p023d1;

import java.util.HashMap;
import java.util.Map;
import p098n4.C0934g;
import p120q4.b;
import v4.r;

/* JADX INFO: loaded from: classes.dex */
public final class f implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12360a;

    public f(HashMap map) {
        this.f12360a = map;
    }

    @Override // p120q4.b
    public Object a(C0934g c0934g, Object obj, Object obj2) {
        this.f12360a.put(c0934g.F(), ((r) obj).u(true));
        return null;
    }

    public void b(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap map2 = this.f12360a;
            if (value == null) {
                map2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else {
                    int i7 = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = g.f12361b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i7 < zArr.length) {
                            boolArr[i7] = Boolean.valueOf(zArr[i7]);
                            i7++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = g.f12361b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i7 < bArr.length) {
                            bArr2[i7] = Byte.valueOf(bArr[i7]);
                            i7++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = g.f12361b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i7 < iArr.length) {
                            numArr[i7] = Integer.valueOf(iArr[i7]);
                            i7++;
                        }
                        map2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = g.f12361b;
                        Long[] lArr = new Long[jArr.length];
                        while (i7 < jArr.length) {
                            lArr[i7] = Long.valueOf(jArr[i7]);
                            i7++;
                        }
                        map2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = g.f12361b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i7 < fArr.length) {
                            fArr2[i7] = Float.valueOf(fArr[i7]);
                            i7++;
                        }
                        map2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = g.f12361b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i7 < dArr.length) {
                            dArr2[i7] = Double.valueOf(dArr[i7]);
                            i7++;
                        }
                        map2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public f() {
        this.f12360a = new HashMap();
    }
}
