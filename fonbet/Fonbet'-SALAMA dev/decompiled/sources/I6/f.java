package I6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f3727a;

    static {
        try {
            Iterator it = Arrays.asList(new E6.b()).iterator();
            t6.h.e(it, "<this>");
            f3727a = B6.d.K0(new B6.a(new B6.e(it, 1)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
