package kotlinx.coroutines;

/* loaded from: classes5.dex */
public final class Q {
    public static final U a;

    static {
        String str;
        kotlinx.coroutines.android.f fVar;
        int i = kotlinx.coroutines.internal.y.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
            kotlinx.coroutines.android.f fVar2 = kotlinx.coroutines.internal.p.a;
            fVar2.getClass();
            fVar = !(fVar2 instanceof U) ? P.j : fVar2;
        } else {
            fVar = P.j;
        }
        a = fVar;
    }
}
