package androidx.compose.ui.focus;

import androidx.compose.ui.e;
import j1.r;
import j1.t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class j extends e.c implements t {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private r f40403a;

    public j(@NotNull r rVar) {
        this.f40403a = rVar;
    }

    public final void I1(@NotNull r rVar) {
        this.f40403a = rVar;
    }

    @NotNull
    public final r W() {
        return this.f40403a;
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        super.onAttach();
        this.f40403a.f().b(this);
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        this.f40403a.f().s(this);
        super.onDetach();
    }
}
