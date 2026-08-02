package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class do1 {
    protected transient int zza;

    /* JADX INFO: renamed from: d */
    public static void m1273d(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof dq1) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof fq1) {
                fq1 fq1Var = (fq1) list;
                int i = fq1Var.f2478l + size;
                int length = fq1Var.f2477k.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        fq1Var.f2477k = Arrays.copyOf(fq1Var.f2477k, length);
                    } else {
                        fq1Var.f2477k = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    xo1.m5680a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                xo1.m5680a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m1274a() {
        try {
            zo1 zo1Var = (zo1) this;
            int iM5971m = zo1Var.m5971m();
            byte[] bArr = new byte[iM5971m];
            boolean z = ro1.f6926b;
            no1 no1Var = new no1(iM5971m, bArr);
            zo1Var.m5964f(no1Var);
            if (no1Var.m3576x() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (no1Var.m3576x() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            C0270h1.m2189e(AbstractC0024an.m286i(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1275b(OutputStream outputStream) {
        zo1 zo1Var = (zo1) this;
        int iM5971m = zo1Var.m5971m();
        boolean z = ro1.f6926b;
        if (iM5971m > 4096) {
            iM5971m = 4096;
        }
        oo1 oo1Var = new oo1(outputStream, iM5971m);
        zo1Var.m5964f(oo1Var);
        if (oo1Var.f5819e > 0) {
            oo1Var.m3721B();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo1276c(hq1 hq1Var);
}
