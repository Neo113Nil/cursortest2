package Sd;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Regex f26142a = new Regex("[^\\p{L}\\p{Digit}]");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f26143b = "$context_receiver";

    @NotNull
    public static final f a(int i11) {
        f f7 = f.f(f26143b + '_' + i11);
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        return f7;
    }

    @NotNull
    public static final String b(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f26142a.replace(name, "_");
    }
}
