package I1;

import D1.E0;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: I1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3225d extends e.c implements E0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11686a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f11687b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Function1<? super D, Unit> f11688c;

    public C3225d(boolean z11, boolean z12, @NotNull Function1<? super D, Unit> function1) {
        this.f11686a = z11;
        this.f11687b = z12;
        this.f11688c = function1;
    }

    public final void I1(boolean z11) {
        this.f11686a = z11;
    }

    public final void J1(@NotNull Function1<? super D, Unit> function1) {
        this.f11688c = function1;
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull D d11) {
        this.f11688c.invoke(d11);
    }

    @Override // D1.E0
    public final boolean getShouldClearDescendantSemantics() {
        return this.f11687b;
    }

    @Override // D1.E0
    public final boolean getShouldMergeDescendantSemantics() {
        return this.f11686a;
    }
}
