package Nc0;

import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f18998a = new LinkedHashSet();

    @Override // Nc0.i
    public final void b(@NotNull Function0<Unit> onReloadListener) {
        Intrinsics.checkNotNullParameter(onReloadListener, "onReloadListener");
        this.f18998a.add(onReloadListener);
    }

    @Override // Nc0.i
    public final void d(@NotNull Function0<Unit> onReloadListener) {
        Intrinsics.checkNotNullParameter(onReloadListener, "onReloadListener");
        this.f18998a.remove(onReloadListener);
    }

    @Override // Nc0.i
    public final void m() {
        Function0 function0 = (Function0) C7714v.Y(this.f18998a);
        if (function0 != null) {
            function0.invoke();
        }
    }
}
