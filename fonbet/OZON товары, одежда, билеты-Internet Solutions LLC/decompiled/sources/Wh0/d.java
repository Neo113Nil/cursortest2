package Wh0;

import T7.E;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public abstract class d<T> {

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f33874a;

        public a(Throwable th2) {
            super(0);
            this.f33874a = th2;
        }

        public final Throwable a() {
            return this.f33874a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f33874a, ((a) obj).f33874a);
        }

        public final int hashCode() {
            Throwable th2 = this.f33874a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Failure(t=" + this.f33874a + ")";
        }
    }

    public static final class b<T> extends d<T> {

        /* renamed from: a, reason: collision with root package name */
        private final T f33875a;

        public b(T t2) {
            super(0);
            this.f33875a = t2;
        }

        public final T a() {
            return this.f33875a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f33875a, ((b) obj).f33875a);
        }

        public final int hashCode() {
            T t2 = this.f33875a;
            if (t2 == null) {
                return 0;
            }
            return t2.hashCode();
        }

        @NotNull
        public final String toString() {
            return E.c(this.f33875a, ")", new StringBuilder("Success(data="));
        }
    }

    public d(int i11) {
    }
}
