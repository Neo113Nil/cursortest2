package p000;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r92 {

    /* JADX INFO: renamed from: a */
    public static final WeakHashMap f6758a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap f6759b = new WeakHashMap();

    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m4282a(Throwable th) {
        Throwable cause;
        dx1 dx1Var;
        Closeable closeable;
        int i;
        WeakHashMap weakHashMap = f6759b;
        synchronized (weakHashMap) {
            cause = th;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            weakHashMap.put(th, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = f6758a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (cause2 == null) {
                dx1Var = null;
            } else {
                weakHashMap2.put(th, (o92) weakHashMap2.get(cause2));
                dx1Var = new dx1(7);
            }
        }
        if (dx1Var != null || (closeable = s92.m4511c().f2681b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (closeable = s92.m4511c().f2681b; closeable != null; closeable = ((n92) closeable).f5338j) {
            arrayList.add(closeable);
        }
        UUID uuid = ((n92) ((ha2) arrayList.get(0))).f5339k;
        if (uuid == null) {
            C0270h1.m2192h("Null rootTraceId");
            return;
        }
        ((ha2) arrayList.get(0)).getClass();
        int size = arrayList.size();
        nc0 nc0Var = qc0.f6464k;
        wm1.m5355a("expectedSize", size);
        wm1.m5355a("initialCapacity", size);
        Object[] objArrCopyOf = new Object[size];
        int size2 = arrayList.size();
        wm1.m5355a("expectedSize", size2);
        wm1.m5355a("initialCapacity", size2);
        Object[] objArrCopyOf2 = new Object[size2];
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        for (ha2 ha2Var : AbstractC0875xf.m5653m(arrayList)) {
            String str = ((n92) ha2Var).f5341m;
            int i4 = i3 + 1;
            if (objArrCopyOf2.length < i4) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, kc0.m3003b(objArrCopyOf2.length, i4));
            } else {
                if (z2) {
                    objArrCopyOf2 = (Object[]) objArrCopyOf2.clone();
                }
                int i5 = i3 + 1;
                objArrCopyOf2[i3] = str;
                da2 da2VarMo2246d = ha2Var.mo2246d();
                da2VarMo2246d.getClass();
                i = i2 + 1;
                if (objArrCopyOf.length < i) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, kc0.m3003b(objArrCopyOf.length, i));
                } else {
                    if (z) {
                        objArrCopyOf = (Object[]) objArrCopyOf.clone();
                    }
                    objArrCopyOf[i2] = da2VarMo2246d;
                    i2++;
                    i3 = i5;
                }
                z = false;
                objArrCopyOf[i2] = da2VarMo2246d;
                i2++;
                i3 = i5;
            }
            z2 = false;
            int i6 = i3 + 1;
            objArrCopyOf2[i3] = str;
            da2 da2VarMo2246d2 = ha2Var.mo2246d();
            da2VarMo2246d2.getClass();
            i = i2 + 1;
            if (objArrCopyOf.length < i) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, kc0.m3003b(objArrCopyOf.length, i));
            } else {
                if (z) {
                    objArrCopyOf = (Object[]) objArrCopyOf.clone();
                }
                objArrCopyOf[i2] = da2VarMo2246d2;
                i2++;
                i3 = i6;
            }
            z = false;
            objArrCopyOf[i2] = da2VarMo2246d2;
            i2++;
            i3 = i6;
        }
        WeakHashMap weakHashMap3 = f6758a;
        synchronized (weakHashMap3) {
            try {
                q01 q01VarM4055j = qc0.m4055j(i3, objArrCopyOf2);
                if (q01VarM4055j == null) {
                    throw new NullPointerException("Null spansNames");
                }
                q01 q01VarM4055j2 = qc0.m4055j(i2, objArrCopyOf);
                if (q01VarM4055j2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th, new o92(q01VarM4055j, q01VarM4055j2, uuid));
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
