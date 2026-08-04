package D6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J f1791a;

    static {
        String property;
        J j;
        int i7 = I6.w.f3761a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            K6.d dVar = M.f1796a;
            p065i6.f fVar = I6.o.f3752a;
            E6.e eVar = ((E6.e) fVar).f2424f;
            j = !(fVar instanceof J) ? F.f1788A : (J) fVar;
        } else {
            j = F.f1788A;
        }
        f1791a = j;
    }
}
