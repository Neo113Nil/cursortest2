package De;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.Y0;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2857A f6602a = new C2857A("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final D f6603b = new D();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final E f6604c = new E();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final F f6605d = new F();

    public static final void a(@NotNull CoroutineContext coroutineContext, Object obj) {
        if (obj == f6602a) {
            return;
        }
        if (obj instanceof L) {
            ((L) obj).b(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, f6604c);
        Intrinsics.g(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((Y0) fold).O(obj);
    }

    @NotNull
    public static final Object b(@NotNull CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f6603b);
        Intrinsics.f(fold);
        return fold;
    }

    public static final Object c(@NotNull CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        return obj == 0 ? f6602a : obj instanceof Integer ? coroutineContext.fold(new L(((Number) obj).intValue(), coroutineContext), f6605d) : ((Y0) obj).s0(coroutineContext);
    }
}
