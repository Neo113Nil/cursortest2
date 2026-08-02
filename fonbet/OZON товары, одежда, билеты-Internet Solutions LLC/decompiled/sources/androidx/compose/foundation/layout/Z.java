package androidx.compose.foundation.layout;

import B1.C2551u;
import D1.A0;
import androidx.compose.foundation.layout.AbstractC5178a;
import androidx.compose.foundation.layout.r;
import androidx.compose.ui.e;
import org.jetbrains.annotations.NotNull;
import u0.C9889B;

/* loaded from: classes.dex */
public abstract class Z extends e.c implements A0 {

    public static final class a extends Z {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private C2551u f39435a;

        public a(@NotNull C2551u c2551u) {
            this.f39435a = c2551u;
        }

        public final void I1(@NotNull C2551u c2551u) {
            this.f39435a = c2551u;
        }

        @Override // D1.A0
        @NotNull
        public final Object M(@NotNull Z1.d dVar, Object obj) {
            C9889B c9889b = obj instanceof C9889B ? (C9889B) obj : null;
            if (c9889b == null) {
                c9889b = new C9889B(0);
            }
            int i11 = r.f39536a;
            c9889b.d(new r.a(new AbstractC5178a.C0728a(this.f39435a)));
            return c9889b;
        }
    }
}
