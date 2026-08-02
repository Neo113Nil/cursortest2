package Xd;

import je.N;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* loaded from: classes.dex */
public abstract class l extends g<Unit> {

    /* loaded from: classes10.dex */
    public static final class a {
        @NotNull
        public static b a(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new b(message);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b extends l {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f34405b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String message) {
            super(Unit.f71690a);
            Intrinsics.checkNotNullParameter(message, "message");
            this.f34405b = message;
        }

        @Override // Xd.g
        public final N a(InterfaceC9815F module) {
            Intrinsics.checkNotNullParameter(module, "module");
            return le.l.c(le.k.ERROR_CONSTANT_VALUE, this.f34405b);
        }

        @Override // Xd.g
        @NotNull
        public final String toString() {
            return this.f34405b;
        }
    }

    @Override // Xd.g
    public final Unit b() {
        throw new UnsupportedOperationException();
    }
}
