package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import v1.C10177b;
import v1.InterfaceC10180e;

/* loaded from: classes.dex */
final class b extends e.c implements InterfaceC10180e {

    /* renamed from: a, reason: collision with root package name */
    private Function1<? super C10177b, Boolean> f40468a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7737t f40469b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Function1<? super C10177b, Boolean> function1, Function1<? super C10177b, Boolean> function12) {
        this.f40468a = function1;
        this.f40469b = (AbstractC7737t) function12;
    }

    public final void I1(Function1<? super C10177b, Boolean> function1) {
        this.f40468a = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J1(Function1<? super C10177b, Boolean> function1) {
        this.f40469b = (AbstractC7737t) function1;
    }

    @Override // v1.InterfaceC10180e
    public final boolean g1(@NotNull KeyEvent keyEvent) {
        Function1<? super C10177b, Boolean> function1 = this.f40468a;
        if (function1 != null) {
            return function1.invoke(C10177b.a(keyEvent)).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // v1.InterfaceC10180e
    public final boolean j0(@NotNull KeyEvent keyEvent) {
        ?? r02 = this.f40469b;
        if (r02 != 0) {
            return ((Boolean) r02.invoke(C10177b.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
