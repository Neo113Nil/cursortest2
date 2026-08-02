package androidx.compose.ui;

import D1.C2809k;
import S0.A;
import androidx.compose.ui.e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class d extends e.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private A f40327a;

    public d(@NotNull A a11) {
        this.f40327a = a11;
    }

    public final void I1(@NotNull A a11) {
        this.f40327a = a11;
        C2809k.f(this).e(a11);
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        C2809k.f(this).e(this.f40327a);
    }
}
