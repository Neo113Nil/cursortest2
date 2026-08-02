package Pj;

import Sc.InterfaceC3999a;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
/* renamed from: Pj.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC3826d {

    /* renamed from: Pj.d$a */
    public static final class a extends AbstractC3826d {

        /* renamed from: a, reason: collision with root package name */
        private final int f22563a;

        public a(int i11) {
            this.f22563a = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f22563a == ((a) obj).f22563a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f22563a);
        }

        @NotNull
        public final String toString() {
            return K00.b.e(this.f22563a, ")", new StringBuilder("startEnd(startEnd="));
        }
    }

    /* renamed from: Pj.d$b */
    public static final class b extends AbstractC3826d {

        /* renamed from: a, reason: collision with root package name */
        private final int f22564a;

        public b(int i11) {
            this.f22564a = i11;
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
            return this.f22564a == bVar.f22564a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f22564a) + (Integer.hashCode(2) * 31);
        }

        @NotNull
        public final String toString() {
            return K00.b.e(this.f22564a, ")", new StringBuilder("startWithEnd(startPadding=2, endPadding="));
        }
    }

    /* renamed from: Pj.d$c */
    public static final class c extends AbstractC3826d {
    }
}
