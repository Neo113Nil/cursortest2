package D6;

import i6.InterfaceC1289f;

/* loaded from: classes2.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final J f1791a;

    static {
        String str;
        J j;
        int i7 = I6.w.f3761a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            K6.d dVar = M.f1796a;
            InterfaceC1289f interfaceC1289f = I6.o.f3752a;
            E6.e eVar = ((E6.e) interfaceC1289f).f2424f;
            j = !(interfaceC1289f instanceof J) ? F.f1788A : (J) interfaceC1289f;
        } else {
            j = F.f1788A;
        }
        f1791a = j;
    }
}
