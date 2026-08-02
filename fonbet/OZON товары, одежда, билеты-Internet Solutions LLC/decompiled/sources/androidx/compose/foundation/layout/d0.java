package androidx.compose.foundation.layout;

import D1.A0;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import e1.d;
import org.jetbrains.annotations.NotNull;
import u0.C9889B;

/* loaded from: classes.dex */
public final class d0 extends e.c implements A0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private d.b f39476a;

    public d0(@NotNull d.b bVar) {
        this.f39476a = bVar;
    }

    public final void I1(@NotNull d.b bVar) {
        this.f39476a = bVar;
    }

    @Override // D1.A0
    public final Object M(Z1.d dVar, Object obj) {
        C9889B c9889b = obj instanceof C9889B ? (C9889B) obj : null;
        if (c9889b == null) {
            c9889b = new C9889B(0);
        }
        int i11 = r.f39536a;
        c9889b.d(new r.f(this.f39476a));
        return c9889b;
    }
}
