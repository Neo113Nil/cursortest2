package androidx.compose.ui.layout;

import B1.B;
import D1.AbstractC2810k0;
import D1.InterfaceC2821v;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class d extends e.c implements InterfaceC2821v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super B, Unit> f40484a;

    public d(@NotNull Function1<? super B, Unit> function1) {
        this.f40484a = function1;
    }

    public final void I1(@NotNull Function1<? super B, Unit> function1) {
        this.f40484a = function1;
    }

    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f40484a.invoke(abstractC2810k0);
    }
}
