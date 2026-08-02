package K30;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: K30.a$a, reason: collision with other inner class name */
    public static final class C0294a extends a {

        /* renamed from: a, reason: collision with root package name */
        private final Exception f15168a;

        public C0294a() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0294a) && Intrinsics.d(this.f15168a, ((C0294a) obj).f15168a);
        }

        public final int hashCode() {
            Exception exc = this.f15168a;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Error(e=" + this.f15168a + ")";
        }

        public C0294a(Exception exc) {
            super(0);
            this.f15168a = exc;
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f15169a = new b(0);
    }

    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f15170a = new c(0);
    }

    public a(int i11) {
    }
}
