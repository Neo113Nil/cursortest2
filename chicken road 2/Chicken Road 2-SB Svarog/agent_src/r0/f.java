package r0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1166a;

    static {
        try {
            Iterator it = Arrays.asList(new n0.b()).iterator();
            g0.h.e(it, "<this>");
            f1166a = k0.c.H(new k0.a(new k0.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
