package Pd0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static Sd0.a f22273a = Sd0.a.PROD_BUILDS_ALL_USERS;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22274b = 0;

    @NotNull
    public static Sd0.a a() {
        return f22273a;
    }

    public static void b(@NotNull Sd0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        f22273a = aVar;
    }
}
