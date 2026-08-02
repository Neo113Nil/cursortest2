package androidx.compose.ui.platform;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class N0 implements P1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Q1.M f40725a;

    public N0(@NotNull Q1.M m11) {
        this.f40725a = m11;
    }

    @Override // androidx.compose.ui.platform.P1
    public final void hide() {
        this.f40725a.b();
    }

    @Override // androidx.compose.ui.platform.P1
    public final void show() {
        this.f40725a.c();
    }
}
