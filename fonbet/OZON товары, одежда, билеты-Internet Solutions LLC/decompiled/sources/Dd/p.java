package Dd;

import Gd.C3085o;
import Jd.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import je.N;
import org.jetbrains.annotations.NotNull;
import td.i0;
import td.p0;

/* loaded from: classes.dex */
public interface p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f6590a = new a();

    static class a implements p {
        private static /* synthetic */ void c(int i11) {
            Object[] objArr = new Object[3];
            switch (i11) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i11 == 5 || i11 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Dd.p
        public final void a(@NotNull Ed.e eVar, @NotNull List list) {
            if (list != null) {
                throw new UnsupportedOperationException("Should not be called");
            }
            c(6);
            throw null;
        }

        @Override // Dd.p
        @NotNull
        public final b b(@NotNull q qVar, @NotNull C3085o c3085o, @NotNull N n11, @NotNull List list, @NotNull ArrayList arrayList) {
            if (qVar == null) {
                c(0);
                throw null;
            }
            if (c3085o == null) {
                c(1);
                throw null;
            }
            if (n11 == null) {
                c(2);
                throw null;
            }
            if (list != null) {
                List list2 = Collections.EMPTY_LIST;
                return new b(n11, list, arrayList);
            }
            c(3);
            throw null;
        }
    }

    /* loaded from: classes10.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final N f6591a;

        /* renamed from: b, reason: collision with root package name */
        private final List<p0> f6592b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f6593c;

        /* renamed from: d, reason: collision with root package name */
        private final List<String> f6594d;

        public b(@NotNull N n11, @NotNull List list, @NotNull ArrayList arrayList) {
            List<String> list2 = Collections.EMPTY_LIST;
            if (n11 == null) {
                a(0);
                throw null;
            }
            if (list == null) {
                a(1);
                throw null;
            }
            if (list2 == null) {
                a(3);
                throw null;
            }
            this.f6591a = n11;
            this.f6592b = list;
            this.f6593c = arrayList;
            this.f6594d = list2;
        }

        private static /* synthetic */ void a(int i11) {
            String str = (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
            switch (i11) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i11 == 4) {
                objArr[1] = "getReturnType";
            } else if (i11 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i11 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i11 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @NotNull
        public final List<String> b() {
            List<String> list = this.f6594d;
            if (list != null) {
                return list;
            }
            a(7);
            throw null;
        }

        @NotNull
        public final N c() {
            N n11 = this.f6591a;
            if (n11 != null) {
                return n11;
            }
            a(4);
            throw null;
        }

        @NotNull
        public final List<i0> d() {
            return this.f6593c;
        }

        @NotNull
        public final List<p0> e() {
            List<p0> list = this.f6592b;
            if (list != null) {
                return list;
            }
            a(5);
            throw null;
        }
    }

    void a(@NotNull Ed.e eVar, @NotNull List list);

    @NotNull
    b b(@NotNull q qVar, @NotNull C3085o c3085o, @NotNull N n11, @NotNull List list, @NotNull ArrayList arrayList);
}
