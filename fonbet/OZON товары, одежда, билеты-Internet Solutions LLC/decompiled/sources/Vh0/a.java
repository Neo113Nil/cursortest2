package Vh0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: Vh0.a$a, reason: collision with other inner class name */
    public static final class C0584a extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0584a f32800a = new C0584a(0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0584a);
        }

        public final int hashCode() {
            return 121388546;
        }

        @NotNull
        public final String toString() {
            return "Available";
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Throwable f32801a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Throwable t2) {
            super(0);
            Intrinsics.checkNotNullParameter(t2, "t");
            this.f32801a = t2;
        }

        @NotNull
        public final Throwable a() {
            return this.f32801a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f32801a, ((b) obj).f32801a);
        }

        public final int hashCode() {
            return this.f32801a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Unavailable(t=" + this.f32801a + ")";
        }
    }

    public /* synthetic */ a(int i11) {
        this();
    }

    private a() {
    }
}
