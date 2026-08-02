package androidx.compose.ui.input.rotary;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import z1.C10972b;
import z1.InterfaceC10971a;

/* loaded from: classes.dex */
final class b extends e.c implements InterfaceC10971a {

    /* renamed from: a, reason: collision with root package name */
    private Function1<? super C10972b, Boolean> f40478a;

    public b(Function1 function1) {
        this.f40478a = function1;
    }

    public final void I1(Function1<? super C10972b, Boolean> function1) {
        this.f40478a = function1;
    }

    @Override // z1.InterfaceC10971a
    public final boolean X0(@NotNull C10972b c10972b) {
        Function1<? super C10972b, Boolean> function1 = this.f40478a;
        if (function1 != null) {
            return function1.invoke(c10972b).booleanValue();
        }
        return false;
    }

    @Override // z1.InterfaceC10971a
    public final boolean a0(@NotNull C10972b c10972b) {
        return false;
    }
}
