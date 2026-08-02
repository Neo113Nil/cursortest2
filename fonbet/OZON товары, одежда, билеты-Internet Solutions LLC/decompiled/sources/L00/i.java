package L00;

import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final i f16111b = new i(U.c());

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f16112a;

    public i(@NotNull Map<Class<?>, ? extends Object> extra) {
        Intrinsics.checkNotNullParameter(extra, "extra");
        this.f16112a = extra;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Object b() {
        Intrinsics.checkNotNullParameter(A00.a.class, "type");
        return A00.a.class.cast(this.f16112a.get(A00.a.class));
    }
}
