package K20;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import androidx.lifecycle.w0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w20.C10420b;

/* loaded from: classes3.dex */
public final class t extends w0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10420b f15163a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final F20.a f15164b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0<s> f15165c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M0<s> f15166d;

    public t(@NotNull C10420b debugMenuRouter, @NotNull F20.a getDependenciesUseCase) {
        Intrinsics.checkNotNullParameter(debugMenuRouter, "debugMenuRouter");
        Intrinsics.checkNotNullParameter(getDependenciesUseCase, "getDependenciesUseCase");
        this.f15163a = debugMenuRouter;
        this.f15164b = getDependenciesUseCase;
        x0<s> a11 = O0.a(new s(3, getDependenciesUseCase.a("", false)));
        this.f15165c = a11;
        this.f15166d = C2399j.b(a11);
    }

    public final void d0() {
        this.f15163a.d();
    }

    public final void e0(boolean z11) {
        s value;
        ArrayList a11 = this.f15164b.a(this.f15166d.getValue().c(), z11);
        x0<s> x0Var = this.f15165c;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, s.a(value, null, z11, a11, 1)));
    }

    @NotNull
    public final M0<s> getState() {
        return this.f15166d;
    }

    public final void setInput(@NotNull String input) {
        s value;
        Intrinsics.checkNotNullParameter(input, "input");
        ArrayList a11 = this.f15164b.a(input, this.f15166d.getValue().d());
        x0<s> x0Var = this.f15165c;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, s.a(value, input, false, a11, 2)));
    }
}
