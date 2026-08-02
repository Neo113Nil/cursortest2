package androidx.compose.foundation.layout;

import B1.C2551u;
import B1.m0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.foundation.layout.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5178a {

    /* renamed from: androidx.compose.foundation.layout.a$a, reason: collision with other inner class name */
    public static final class C0728a extends AbstractC5178a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C2551u f39436a;

        public C0728a(@NotNull C2551u c2551u) {
            this.f39436a = c2551u;
        }

        public final int a(@NotNull m0 m0Var) {
            return m0Var.E(this.f39436a);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0728a) && Intrinsics.d(this.f39436a, ((C0728a) obj).f39436a);
        }

        public final int hashCode() {
            return this.f39436a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Value(alignmentLine=" + this.f39436a + ')';
        }
    }
}
