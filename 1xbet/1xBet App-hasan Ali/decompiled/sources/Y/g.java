package Y;

import X3.n;
import X3.w;
import a.AbstractC0444a;
import i4.InterfaceC2015a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r.C2321G;
import r.O;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: k, reason: collision with root package name */
    public final i4.c f6111k;

    /* renamed from: l, reason: collision with root package name */
    public final C2321G f6112l;

    /* renamed from: m, reason: collision with root package name */
    public C2321G f6113m;

    public g(Map map, i4.c cVar) {
        C2321G c2321g;
        this.f6111k = cVar;
        if (map == null || map.isEmpty()) {
            c2321g = null;
        } else {
            c2321g = new C2321G(map.size());
            for (Map.Entry entry : map.entrySet()) {
                c2321g.m(entry.getKey(), entry.getValue());
            }
        }
        this.f6112l = c2321g;
    }

    @Override // Y.f
    public final boolean c(Object obj) {
        return ((Boolean) this.f6111k.c(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    @Override // Y.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map d() {
        long j5;
        char c5;
        long j6;
        long j7;
        C2321G c2321g;
        int i;
        int i5;
        int i6;
        int i7;
        long j8;
        int i8 = 0;
        int i9 = 1;
        C2321G c2321g2 = this.f6112l;
        if (c2321g2 == null && this.f6113m == null) {
            return w.f6091k;
        }
        int i10 = c2321g2 != null ? c2321g2.f18932e : 0;
        C2321G c2321g3 = this.f6113m;
        HashMap hashMap = new HashMap(i10 + (c2321g3 != null ? c2321g3.f18932e : 0));
        long j9 = -9187201950435737472L;
        int i11 = 8;
        if (c2321g2 != null) {
            Object[] objArr = c2321g2.f18929b;
            Object[] objArr2 = c2321g2.f18930c;
            long[] jArr = c2321g2.f18928a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i12 = 0;
                c5 = 7;
                j6 = 128;
                while (true) {
                    long j10 = jArr[i12];
                    j7 = 255;
                    if ((((~j10) << 7) & j10 & j9) != j9) {
                        int i13 = 8 - ((~(i12 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j10 & 255) < 128) {
                                int i15 = (i12 << 3) + i14;
                                j8 = j9;
                                hashMap.put((String) objArr[i15], (List) objArr2[i15]);
                            } else {
                                j8 = j9;
                            }
                            j10 >>= 8;
                            i14++;
                            j9 = j8;
                        }
                        j5 = j9;
                        if (i13 != 8) {
                            break;
                        }
                    } else {
                        j5 = j9;
                    }
                    if (i12 == length) {
                        break;
                    }
                    i12++;
                    j9 = j5;
                }
                c2321g = this.f6113m;
                if (c2321g != null) {
                    Object[] objArr3 = c2321g.f18929b;
                    Object[] objArr4 = c2321g.f18930c;
                    long[] jArr2 = c2321g.f18928a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j11 = jArr2[i16];
                            if ((((~j11) << c5) & j11 & j5) != j5) {
                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                int i18 = i8;
                                while (i18 < i17) {
                                    if ((j11 & j7) < j6) {
                                        int i19 = (i16 << 3) + i18;
                                        Object obj = objArr3[i19];
                                        List list = (List) objArr4[i19];
                                        String str = (String) obj;
                                        i7 = i11;
                                        if (list.size() == i9) {
                                            Object invoke = ((InterfaceC2015a) list.get(i8)).invoke();
                                            if (invoke != null) {
                                                if (!c(invoke)) {
                                                    throw new IllegalStateException(k.a(invoke).toString());
                                                }
                                                Object[] objArr5 = new Object[i9];
                                                objArr5[i8] = invoke;
                                                hashMap.put(str, n.L(objArr5));
                                            }
                                            i6 = i9;
                                        } else {
                                            int size = list.size();
                                            ArrayList arrayList = new ArrayList(size);
                                            i6 = i9;
                                            int i20 = 0;
                                            while (i20 < size) {
                                                int i21 = i20;
                                                Object invoke2 = ((InterfaceC2015a) list.get(i20)).invoke();
                                                if (invoke2 != null && !c(invoke2)) {
                                                    throw new IllegalStateException(k.a(invoke2).toString());
                                                }
                                                arrayList.add(invoke2);
                                                i20 = i21 + 1;
                                            }
                                            hashMap.put(str, arrayList);
                                        }
                                    } else {
                                        i6 = i9;
                                        i7 = i11;
                                    }
                                    j11 >>= i7;
                                    i18++;
                                    i11 = i7;
                                    i9 = i6;
                                    i8 = 0;
                                }
                                i = i9;
                                i5 = i11;
                                if (i17 != i5) {
                                    break;
                                }
                            } else {
                                i = i9;
                                i5 = i11;
                            }
                            if (i16 == length2) {
                                break;
                            }
                            i16++;
                            i11 = i5;
                            i9 = i;
                            i8 = 0;
                        }
                    }
                }
                return hashMap;
            }
        }
        j5 = -9187201950435737472L;
        c5 = 7;
        j6 = 128;
        j7 = 255;
        c2321g = this.f6113m;
        if (c2321g != null) {
        }
        return hashMap;
    }

    @Override // Y.f
    public final e e(String str, InterfaceC2015a interfaceC2015a) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!AbstractC0444a.S(str.charAt(i))) {
                C2321G c2321g = this.f6113m;
                if (c2321g == null) {
                    long[] jArr = O.f18957a;
                    c2321g = new C2321G();
                    this.f6113m = c2321g;
                }
                Object g5 = c2321g.g(str);
                if (g5 == null) {
                    g5 = new ArrayList();
                    c2321g.m(str, g5);
                }
                ((List) g5).add(interfaceC2015a);
                return new v3.e(c2321g, str, interfaceC2015a, 13);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    @Override // Y.f
    public final Object f(String str) {
        C2321G c2321g = this.f6112l;
        List list = c2321g != null ? (List) c2321g.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && c2321g != null) {
            List subList = list.subList(1, list.size());
            int f = c2321g.f(str);
            if (f < 0) {
                f = ~f;
            }
            Object[] objArr = c2321g.f18930c;
            Object obj = objArr[f];
            c2321g.f18929b[f] = str;
            objArr[f] = subList;
        }
        return list.get(0);
    }
}
