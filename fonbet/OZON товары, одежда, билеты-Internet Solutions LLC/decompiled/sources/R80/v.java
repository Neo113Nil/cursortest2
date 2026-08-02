package R80;

import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v {
    @NotNull
    public static final b a(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        b i11 = c.i(deeplink);
        String[] elements = {"ozonbank", "ozonbanksme", "ozoncheck"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return c.e(c.e(c.e(c.d(c.d(c.b(c.h(i11, C7705l.j0(elements)), "login"), "phone"), "otp"), "otpId"), "password"), "login");
    }

    @NotNull
    public static final b b(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        b i11 = c.i(deeplink);
        String[] elements = {"http", "https", "ozonbank", "ozonbanksme", "ozoncheck"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return c.b(c.h(i11, C7705l.j0(elements)), "debug");
    }
}
