package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import j1.v;
import j1.w;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class b extends e.c implements j1.e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super v, Unit> f40391a;

    /* renamed from: b, reason: collision with root package name */
    private w f40392b;

    public b(@NotNull Function1<? super v, Unit> function1) {
        this.f40391a = function1;
    }

    public final void I1(@NotNull Function1<? super v, Unit> function1) {
        this.f40391a = function1;
    }

    @Override // j1.e
    public final void L(@NotNull w wVar) {
        if (Intrinsics.d(this.f40392b, wVar)) {
            return;
        }
        this.f40392b = wVar;
        this.f40391a.invoke(wVar);
    }
}
