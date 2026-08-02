package Fj0;

import id.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b {
    @NotNull
    public static final <T> f<Object, T> a(@NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new a(message);
    }
}
