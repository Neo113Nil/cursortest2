package H30;

import Sc.InterfaceC4008j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f10566a = Sc.k.b(new n());

    public static final void a(@NotNull Object obj, @NotNull Function0 listener) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (((w) f10566a.getValue()).a()) {
            return;
        }
        listener.invoke();
    }
}
