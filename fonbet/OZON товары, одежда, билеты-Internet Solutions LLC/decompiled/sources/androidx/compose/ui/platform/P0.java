package androidx.compose.ui.platform;

import b1.InterfaceC5512o;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class P0 implements InterfaceC5512o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f40727a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ InterfaceC5512o f40728b;

    public P0(@NotNull InterfaceC5512o interfaceC5512o, @NotNull Function0<Unit> function0) {
        this.f40727a = function0;
        this.f40728b = interfaceC5512o;
    }

    @Override // b1.InterfaceC5512o
    public final boolean a(@NotNull Object obj) {
        return this.f40728b.a(obj);
    }

    @Override // b1.InterfaceC5512o
    @NotNull
    public final InterfaceC5512o.a b(@NotNull String str, @NotNull Function0<? extends Object> function0) {
        return this.f40728b.b(str, function0);
    }

    public final void c() {
        this.f40727a.invoke();
    }

    @Override // b1.InterfaceC5512o
    @NotNull
    public final Map<String, List<Object>> d() {
        return this.f40728b.d();
    }

    @Override // b1.InterfaceC5512o
    public final Object f(@NotNull String str) {
        return this.f40728b.f(str);
    }
}
