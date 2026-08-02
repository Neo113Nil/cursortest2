package androidx.compose.ui.layout;

import D1.AbstractC2810k0;
import D1.B;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class f extends e.c implements B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super B1.B, Unit> f40485a;

    public f(@NotNull Function1<? super B1.B, Unit> function1) {
        this.f40485a = function1;
    }

    public final void I1(@NotNull Function1<? super B1.B, Unit> function1) {
        this.f40485a = function1;
    }

    @Override // D1.B
    public final void y(@NotNull AbstractC2810k0 abstractC2810k0) {
        this.f40485a.invoke(abstractC2810k0);
    }
}
