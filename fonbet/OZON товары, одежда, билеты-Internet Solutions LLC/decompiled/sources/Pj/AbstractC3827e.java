package Pj;

import B0.C2454a;
import Sc.InterfaceC3999a;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* renamed from: Pj.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC3827e {

    /* renamed from: Pj.e$a */
    public static final class a extends AbstractC3827e {

        /* renamed from: a, reason: collision with root package name */
        private final int f22565a;

        public a(int i11) {
            this.f22565a = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f22565a == ((a) obj).f22565a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f22565a);
        }

        @NotNull
        public final String toString() {
            return K00.b.e(this.f22565a, ")", new StringBuilder("all(paddingAll="));
        }
    }

    /* renamed from: Pj.e$b */
    public static final class b extends AbstractC3827e {

        /* renamed from: a, reason: collision with root package name */
        private final int f22566a;

        /* renamed from: b, reason: collision with root package name */
        private final int f22567b;

        /* renamed from: c, reason: collision with root package name */
        private final int f22568c;

        public b(int i11, int i12, int i13) {
            this.f22566a = i11;
            this.f22567b = i12;
            this.f22568c = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.f22566a == bVar.f22566a && this.f22567b == bVar.f22567b && this.f22568c == bVar.f22568c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f22568c) + C2454a.a(this.f22567b, C2454a.a(this.f22566a, Integer.hashCode(0) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("padding(start=0, top=");
            sb2.append(this.f22566a);
            sb2.append(", end=");
            sb2.append(this.f22567b);
            sb2.append(", bottom=");
            return K00.b.e(this.f22568c, ")", sb2);
        }
    }

    /* renamed from: Pj.e$c */
    public static final class c extends AbstractC3827e {

        /* renamed from: a, reason: collision with root package name */
        private final int f22569a;

        public c(int i11) {
            this.f22569a = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f22569a == ((c) obj).f22569a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f22569a);
        }

        @NotNull
        public final String toString() {
            return K00.b.e(this.f22569a, ")", new StringBuilder("vertical(topBottom="));
        }
    }

    /* renamed from: Pj.e$d */
    public static final class d extends AbstractC3827e {
    }
}
