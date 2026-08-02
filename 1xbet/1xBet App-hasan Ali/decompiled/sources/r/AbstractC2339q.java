package r;

import java.util.ConcurrentModificationException;
import s.AbstractC2351a;

/* renamed from: r.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2339q {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f19033a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f19034b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f19035c = new Object();

    public static final void a(S s2) {
        int i = s2.f18965n;
        int[] iArr = s2.f18963l;
        Object[] objArr = s2.f18964m;
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            if (obj != f19035c) {
                if (i6 != i5) {
                    iArr[i5] = iArr[i6];
                    objArr[i5] = obj;
                    objArr[i6] = null;
                }
                i5++;
            }
        }
        s2.f18962k = false;
        s2.f18965n = i5;
    }

    public static final void b(C2328f c2328f, int i) {
        kotlin.jvm.internal.l.f("<this>", c2328f);
        c2328f.f18994k = new int[i];
        c2328f.f18995l = new Object[i];
    }

    public static final int c(C2328f c2328f, Object obj, int i) {
        kotlin.jvm.internal.l.f("<this>", c2328f);
        int i5 = c2328f.f18996m;
        if (i5 == 0) {
            return -1;
        }
        try {
            int a5 = AbstractC2351a.a(c2328f.f18996m, i, c2328f.f18994k);
            if (a5 < 0 || kotlin.jvm.internal.l.a(obj, c2328f.f18995l[a5])) {
                return a5;
            }
            int i6 = a5 + 1;
            while (i6 < i5 && c2328f.f18994k[i6] == i) {
                if (kotlin.jvm.internal.l.a(obj, c2328f.f18995l[i6])) {
                    return i6;
                }
                i6++;
            }
            for (int i7 = a5 - 1; i7 >= 0 && c2328f.f18994k[i7] == i; i7--) {
                if (kotlin.jvm.internal.l.a(obj, c2328f.f18995l[i7])) {
                    return i7;
                }
            }
            return ~i6;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
