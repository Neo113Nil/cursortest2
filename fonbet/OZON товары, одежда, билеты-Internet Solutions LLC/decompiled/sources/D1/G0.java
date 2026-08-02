package D1;

import androidx.compose.ui.e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class G0 extends e.c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5232a;

    public G0() {
        setAggregateChildKindSet$ui_release(0);
    }

    public final boolean I1() {
        return this.f5232a;
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        this.f5232a = true;
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        this.f5232a = false;
    }

    @NotNull
    public final String toString() {
        return "<tail>";
    }
}
