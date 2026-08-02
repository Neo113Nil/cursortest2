package g0;

import java.util.Comparator;
import z0.AbstractC2749f;
import z0.C2731G;

/* loaded from: classes.dex */
public final class t implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public static final t f17063k = new t();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        int i = 0;
        if (AbstractC1961f.r(sVar) && AbstractC1961f.r(sVar2)) {
            C2731G v4 = AbstractC2749f.v(sVar);
            C2731G v5 = AbstractC2749f.v(sVar2);
            if (!kotlin.jvm.internal.l.a(v4, v5)) {
                C2731G[] c2731gArr = new C2731G[16];
                int i5 = 0;
                while (v4 != null) {
                    int i6 = i5 + 1;
                    if (c2731gArr.length < i6) {
                        int length = c2731gArr.length;
                        ?? r5 = new Object[Math.max(i6, length * 2)];
                        System.arraycopy(c2731gArr, 0, r5, 0, length);
                        c2731gArr = r5;
                    }
                    if (i5 != 0) {
                        System.arraycopy(c2731gArr, 0, c2731gArr, 0 + 1, i5 + 0);
                    }
                    c2731gArr[0] = v4;
                    i5++;
                    v4 = v4.u();
                }
                C2731G[] c2731gArr2 = new C2731G[16];
                int i7 = 0;
                while (v5 != null) {
                    int i8 = i7 + 1;
                    if (c2731gArr2.length < i8) {
                        int length2 = c2731gArr2.length;
                        ?? r52 = new Object[Math.max(i8, length2 * 2)];
                        System.arraycopy(c2731gArr2, 0, r52, 0, length2);
                        c2731gArr2 = r52;
                    }
                    if (i7 != 0) {
                        System.arraycopy(c2731gArr2, 0, c2731gArr2, 0 + 1, i7 + 0);
                    }
                    c2731gArr2[0] = v5;
                    i7++;
                    v5 = v5.u();
                }
                int min = Math.min(i5 - 1, i7 - 1);
                if (min >= 0) {
                    while (kotlin.jvm.internal.l.a(c2731gArr[i], c2731gArr2[i])) {
                        if (i != min) {
                            i++;
                        }
                    }
                    return kotlin.jvm.internal.l.g(c2731gArr[i].v(), c2731gArr2[i].v());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (AbstractC1961f.r(sVar)) {
                return -1;
            }
            if (AbstractC1961f.r(sVar2)) {
                return 1;
            }
        }
        return 0;
    }
}
