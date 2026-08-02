package De;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import org.jetbrains.annotations.NotNull;
import ye.C10888b;

/* renamed from: De.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2863f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Collection<xe.J> f6620a;

    static {
        try {
            f6620a = kotlin.sequences.l.C(kotlin.sequences.l.b(Arrays.asList(new C10888b()).iterator()));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    @NotNull
    public static final Collection<xe.J> a() {
        return f6620a;
    }
}
