package Xd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.Y;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd.L;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f34402a = new i();

    private final C4885b a(List list, L l11, qd.p pVar) {
        List U02 = C7714v.U0(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = U02.iterator();
        while (it.hasNext()) {
            g b11 = b(it.next(), null);
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        if (l11 == null) {
            return new C4885b(arrayList, new h(pVar));
        }
        Y H11 = l11.n().H(pVar);
        Intrinsics.checkNotNullExpressionValue(H11, "getPrimitiveArrayKotlinType(...)");
        return new z(arrayList, H11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v26, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v33, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v38, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0, types: [Xd.i] */
    public final g b(Object obj, L l11) {
        ?? r02;
        ?? r03;
        ?? r04;
        ?? r05;
        if (obj instanceof Byte) {
            return new C4887d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new w(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new n(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new u(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C4888e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new m(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new j(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C4886c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new x((String) obj);
        }
        int i11 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            int length = bArr.length;
            if (length == 0) {
                r05 = K.f71697a;
            } else if (length != 1) {
                Intrinsics.checkNotNullParameter(bArr, "<this>");
                r05 = new ArrayList(bArr.length);
                int length2 = bArr.length;
                while (i11 < length2) {
                    r05.add(Byte.valueOf(bArr[i11]));
                    i11++;
                }
            } else {
                r05 = C7714v.a0(Byte.valueOf(bArr[0]));
            }
            return a(r05, l11, qd.p.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            Intrinsics.checkNotNullParameter(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 == 0) {
                r04 = K.f71697a;
            } else if (length3 != 1) {
                Intrinsics.checkNotNullParameter(sArr, "<this>");
                r04 = new ArrayList(sArr.length);
                int length4 = sArr.length;
                while (i11 < length4) {
                    r04.add(Short.valueOf(sArr[i11]));
                    i11++;
                }
            } else {
                r04 = C7714v.a0(Short.valueOf(sArr[0]));
            }
            return a(r04, l11, qd.p.SHORT);
        }
        if (obj instanceof int[]) {
            return a(C7705l.d0((int[]) obj), l11, qd.p.INT);
        }
        if (obj instanceof long[]) {
            return a(C7705l.e0((long[]) obj), l11, qd.p.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            Intrinsics.checkNotNullParameter(cArr, "<this>");
            int length5 = cArr.length;
            if (length5 == 0) {
                r03 = K.f71697a;
            } else if (length5 != 1) {
                Intrinsics.checkNotNullParameter(cArr, "<this>");
                r03 = new ArrayList(cArr.length);
                int length6 = cArr.length;
                while (i11 < length6) {
                    r03.add(Character.valueOf(cArr[i11]));
                    i11++;
                }
            } else {
                r03 = C7714v.a0(Character.valueOf(cArr[0]));
            }
            return a(r03, l11, qd.p.CHAR);
        }
        if (obj instanceof float[]) {
            return a(C7705l.c0((float[]) obj), l11, qd.p.FLOAT);
        }
        if (!(obj instanceof double[])) {
            if (obj instanceof boolean[]) {
                return a(C7705l.g0((boolean[]) obj), l11, qd.p.BOOLEAN);
            }
            if (obj == null) {
                return new v(null);
            }
            return null;
        }
        double[] dArr = (double[]) obj;
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length7 = dArr.length;
        if (length7 == 0) {
            r02 = K.f71697a;
        } else if (length7 != 1) {
            Intrinsics.checkNotNullParameter(dArr, "<this>");
            r02 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i11 < length8) {
                r02.add(Double.valueOf(dArr[i11]));
                i11++;
            }
        } else {
            r02 = C7714v.a0(Double.valueOf(dArr[0]));
        }
        return a(r02, l11, qd.p.DOUBLE);
    }
}
