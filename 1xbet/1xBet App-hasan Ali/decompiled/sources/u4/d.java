package u4;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;
import q4.C2312b;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20084a;

    static {
        try {
            f20084a = n4.i.N(n4.i.L(Arrays.asList(new C2312b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
