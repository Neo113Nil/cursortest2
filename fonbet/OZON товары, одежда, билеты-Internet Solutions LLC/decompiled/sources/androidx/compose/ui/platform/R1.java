package androidx.compose.ui.platform;

import androidx.compose.ui.e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class R1 extends e.c implements D1.E0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f40734a;

    public R1(@NotNull String str) {
        this.f40734a = str;
    }

    public final void I1(@NotNull String str) {
        this.f40734a = str;
    }

    @Override // D1.E0
    public final void applySemantics(@NotNull I1.D d11) {
        I1.z.t(d11, this.f40734a);
    }
}
