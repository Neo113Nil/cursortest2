package Ej;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f8026a;

    static {
        try {
            Iterator it = Arrays.asList(new xj.b()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            List C11 = kotlin.sequences.l.C(kotlin.sequences.l.b(it));
            if (C11.size() <= 0) {
                throw new IllegalArgumentException("No SelfLoggerWriter implementation is found!");
            }
            if (C11.size() >= 2) {
                throw new IllegalArgumentException("More than one SelfLoggerWriter implementation is found!");
            }
            f8026a = (q) C11.get(0);
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
