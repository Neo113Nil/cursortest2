package androidx.compose.ui.draw;

import D1.InterfaceC2819t;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class d extends e.c implements InterfaceC2819t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super InterfaceC8410c, Unit> f40354a;

    public d(@NotNull Function1<? super InterfaceC8410c, Unit> function1) {
        this.f40354a = function1;
    }

    public final void I1(@NotNull Function1<? super InterfaceC8410c, Unit> function1) {
        this.f40354a = function1;
    }

    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        this.f40354a.invoke(interfaceC8410c);
    }
}
