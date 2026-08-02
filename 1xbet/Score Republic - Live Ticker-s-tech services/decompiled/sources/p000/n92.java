package p000;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n92 implements ha2 {

    /* JADX INFO: renamed from: j */
    public final n92 f5338j;

    /* JADX INFO: renamed from: k */
    public final UUID f5339k;

    /* JADX INFO: renamed from: l */
    public final String f5340l;

    /* JADX INFO: renamed from: m */
    public final String f5341m;

    /* JADX INFO: renamed from: n */
    public Thread f5342n;

    public n92(String str, n92 n92Var, ga2 ga2Var) {
        this.f5341m = str;
        this.f5338j = n92Var;
        this.f5339k = n92Var.f5339k;
        this.f5340l = n92Var.f5340l;
        this.f5342n = Thread.currentThread();
    }

    /* JADX INFO: renamed from: a */
    public static String m3505a(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ga2 ga2VarM4511c = s92.m4511c();
        ha2 ha2Var = ga2VarM4511c.f2681b;
        String str = this.f5341m;
        if (ha2Var == null) {
            throw new C0877xh(AbstractC0024an.m286i(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."));
        }
        if (this == ha2Var) {
            s92.m4510b(ga2VarM4511c, ((n92) ha2Var).f5338j);
            this.f5342n = null;
            return;
        }
        String str2 = ((n92) ha2Var).f5341m;
        StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
        sb.append("Tried to end span ");
        sb.append(str);
        sb.append(", but that span is not the current span. The current span is ");
        sb.append(str2);
        sb.append(".");
        throw new C0877xh(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:76:0x0213  */
    public final String toString() {
        int i;
        int i2;
        C0263gv c0263gv;
        Iterator it;
        ea2 ea2Var;
        int i3;
        fa2 fa2Var;
        AtomicReference atomicReference = s92.f7076a;
        n92 n92Var = this;
        int i4 = 0;
        int length = 0;
        while (n92Var != null) {
            i4++;
            length += n92Var.f5341m.length();
            n92Var = n92Var.f5338j;
            if (n92Var != null) {
                length += 4;
            }
        }
        if (i4 > 250) {
            String[] strArr = new String[i4];
            n92 n92Var2 = this;
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                strArr[i5] = n92Var2.f5341m;
                n92Var2 = n92Var2.f5338j;
            }
            C0163e6 c0163e6 = new C0163e6(4, 4);
            int i6 = 1;
            sf1 sf1VarMo3208h = (i4 != 0 ? i4 != 1 ? sc0.m4514l(i4, (Object[]) strArr.clone()) : new n81(strArr[0]) : w01.f8328s).iterator();
            int i7 = 0;
            while (sf1VarMo3208h.hasNext()) {
                c0163e6.m1371g(sf1VarMo3208h.next(), Integer.valueOf(i7));
                i7++;
            }
            v01 v01VarM1369d = c0163e6.m1369d(true);
            int i8 = v01VarM1369d.f7991o;
            int i9 = i4 >> 2;
            if (i8 > i9) {
                c0263gv = null;
            } else {
                int i10 = i4 + 1;
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i4; i11++) {
                    iArr[i11] = ((Integer) v01VarM1369d.get(strArr[i11])).intValue();
                }
                iArr[i4] = i8;
                C0928yv c0928yv = new C0928yv(iArr);
                int i12 = 0;
                while (true) {
                    int i13 = -1;
                    if (i12 >= i10) {
                        break;
                    }
                    c0928yv.f9507d += i6;
                    int i14 = iArr[i12];
                    while (true) {
                        fa2 fa2Var2 = null;
                        while (true) {
                            if (c0928yv.f9507d <= 0) {
                                i3 = i6;
                                break;
                            }
                            int i15 = c0928yv.f9506c;
                            fa2Var = (fa2) c0928yv.f9510g;
                            i3 = i6;
                            if (i15 == 0) {
                                break;
                            }
                            int i16 = ((fa2) fa2Var.f2365d.get(Integer.valueOf(iArr[c0928yv.f9505b]))).f2362a;
                            int i17 = c0928yv.f9506c;
                            if (iArr[i16 + i17] == i14) {
                                if (fa2Var2 != null) {
                                    fa2Var2.f2364c = (fa2) c0928yv.f9510g;
                                }
                                c0928yv.f9506c = i17 + 1;
                                c0928yv.m5842c();
                                break;
                            }
                            fa2 fa2Var3 = (fa2) ((fa2) c0928yv.f9510g).f2365d.get(Integer.valueOf(iArr[c0928yv.f9505b]));
                            int i18 = fa2Var3.f2362a;
                            int i19 = i13;
                            fa2 fa2Var4 = new fa2(i18, (c0928yv.f9506c + i18) - 1);
                            ((fa2) c0928yv.f9510g).f2365d.put(Integer.valueOf(iArr[c0928yv.f9505b]), fa2Var4);
                            int i20 = fa2Var4.f2363b + 1;
                            Integer numValueOf = Integer.valueOf(iArr[i20]);
                            HashMap map = fa2Var4.f2365d;
                            map.put(numValueOf, fa2Var3);
                            fa2Var3.f2362a = i20;
                            if (fa2Var2 != null) {
                                fa2Var2.f2364c = fa2Var4;
                            }
                            map.put(Integer.valueOf(i14), new fa2(i12, 1073741824));
                            c0928yv.f9507d--;
                            c0928yv.m5843d();
                            fa2Var2 = fa2Var4;
                            i6 = i3;
                            i13 = i19;
                        }
                        HashMap map2 = fa2Var.f2365d;
                        Integer numValueOf2 = Integer.valueOf(i14);
                        if (map2.containsKey(numValueOf2)) {
                            if (fa2Var2 != null) {
                                fa2Var2.f2364c = (fa2) c0928yv.f9510g;
                            }
                            c0928yv.f9505b = i12;
                            c0928yv.f9506c++;
                            c0928yv.m5842c();
                            break;
                        }
                        ((fa2) c0928yv.f9510g).f2365d.put(numValueOf2, new fa2(i12, 1073741824));
                        if (fa2Var2 != null) {
                            fa2Var2.f2364c = (fa2) c0928yv.f9510g;
                        }
                        c0928yv.f9507d += i13;
                        c0928yv.m5843d();
                        i6 = i3;
                    }
                    i12++;
                    i6 = i3;
                }
                int i21 = i6;
                ArrayDeque arrayDeque = new ArrayDeque();
                fa2 fa2Var5 = (fa2) c0928yv.f9509f;
                ea2 ea2Var2 = new ea2(fa2Var5, 0, -1, -1);
                arrayDeque.push(ea2Var2);
                while (!arrayDeque.isEmpty()) {
                    ea2 ea2Var3 = (ea2) arrayDeque.pop();
                    Iterator it2 = ea2Var3.f2047d.f2365d.values().iterator();
                    while (it2.hasNext()) {
                        fa2 fa2Var6 = (fa2) it2.next();
                        int i22 = ea2Var3.f2045b;
                        int i23 = ea2Var3.f2046c;
                        int i24 = fa2Var6.f2362a;
                        fa2 fa2Var7 = fa2Var5;
                        int i25 = fa2Var6.f2363b;
                        if (c0928yv.m5846g(i22, i23, i24, i25)) {
                            it = it2;
                        } else {
                            if (fa2Var6.f2365d.isEmpty()) {
                                int i26 = fa2Var6.f2362a;
                                it = it2;
                                if (c0928yv.m5846g(i22, i23, i26, (i26 + i23) - i22)) {
                                }
                                if (ea2Var2.f2044a < ea2Var.f2044a) {
                                    ea2Var2 = ea2Var;
                                }
                                arrayDeque.push(ea2Var);
                                fa2Var5 = fa2Var7;
                                it2 = it;
                                i21 = 1;
                            } else {
                                it = it2;
                            }
                            ea2Var = new ea2(fa2Var6, i21, fa2Var6.f2362a, i25);
                            if (ea2Var2.f2044a < ea2Var.f2044a) {
                                ea2Var2 = ea2Var;
                            }
                            arrayDeque.push(ea2Var);
                            fa2Var5 = fa2Var7;
                            it2 = it;
                            i21 = 1;
                        }
                        ea2Var = new ea2(fa2Var6, ea2Var3.f2044a + i21, i22, i23);
                        if (ea2Var2.f2044a < ea2Var.f2044a) {
                            ea2Var2 = ea2Var;
                        }
                        arrayDeque.push(ea2Var);
                        fa2Var5 = fa2Var7;
                        it2 = it;
                        i21 = 1;
                    }
                    i21 = 1;
                }
                int iMin = Math.min(iArr.length, ea2Var2.f2046c + 1);
                int i27 = 0;
                loop9: while (true) {
                    i = ea2Var2.f2045b;
                    i2 = iMin - i;
                    fa2Var5 = (fa2) fa2Var5.f2365d.get(Integer.valueOf(iArr[(i27 % i2) + i]));
                    if (fa2Var5 == null) {
                        break;
                    }
                    for (int i28 = fa2Var5.f2362a; i28 < fa2Var5.f2363b + 1 && i28 < iArr.length; i28++) {
                        if (iArr[(i27 % i2) + i] != iArr[i28]) {
                            break loop9;
                        }
                        i27++;
                    }
                }
                int i29 = i27 / i2;
                C0263gv c0263gv2 = new C0263gv();
                c0263gv2.f2941a = i;
                c0263gv2.f2942b = iMin;
                c0263gv2.f2943c = i29;
                if (i2 * i29 < i9) {
                    c0263gv = null;
                } else {
                    c0263gv = c0263gv2;
                }
            }
            String strConcat = "";
            if (c0263gv != null) {
                int i30 = c0263gv.f2941a;
                String strConcat2 = i30 > 0 ? String.valueOf(TextUtils.join(" -> ", Arrays.copyOf(strArr, i30))).concat(" -> ") : "";
                int i31 = c0263gv.f2942b;
                int i32 = c0263gv.f2943c;
                int i33 = ((i31 - i30) * i32) + i30;
                strConcat = i33 < i4 ? " -> ".concat(String.valueOf(TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i33, i4)))) : "";
                String strJoin = TextUtils.join(" -> ", Arrays.copyOfRange(strArr, i30, i31));
                Locale locale = Locale.US;
                strConcat = strConcat2 + "{" + strJoin + "}x" + i32 + strConcat;
            }
            if (!strConcat.isEmpty()) {
                return strConcat;
            }
        }
        char[] cArr = new char[length];
        n92 n92Var3 = this;
        while (n92Var3 != null) {
            String str = n92Var3.f5341m;
            length -= str.length();
            str.getChars(0, str.length(), cArr, length);
            n92Var3 = n92Var3.f5338j;
            if (n92Var3 != null) {
                length -= 4;
                " -> ".getChars(0, 4, cArr, length);
            }
        }
        return new String(cArr);
    }

    public n92(String str, UUID uuid, String str2, ga2 ga2Var) {
        this.f5341m = str;
        this.f5338j = null;
        this.f5339k = uuid;
        this.f5340l = str2;
        ga2Var.getClass();
        this.f5342n = Thread.currentThread();
    }
}
