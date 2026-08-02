package Xd;

import je.A0;
import je.K0;
import je.L0;
import je.N;
import je.Q;
import je.Y;
import je.o0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import qd.s;
import td.C9856v;
import td.InterfaceC9815F;
import td.InterfaceC9839e;

/* loaded from: classes.dex */
public final class t extends g<a> {

    public static abstract class a {

        /* renamed from: Xd.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes10.dex */
        public static final class C0620a extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final N f34414a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0620a(@NotNull N type) {
                super(0);
                Intrinsics.checkNotNullParameter(type, "type");
                this.f34414a = type;
            }

            @NotNull
            public final N a() {
                return this.f34414a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0620a) && Intrinsics.d(this.f34414a, ((C0620a) obj).f34414a);
            }

            public final int hashCode() {
                return this.f34414a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "LocalClass(type=" + this.f34414a + ')';
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final f f34415a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(@NotNull f value) {
                super(0);
                Intrinsics.checkNotNullParameter(value, "value");
                this.f34415a = value;
            }

            public final int a() {
                return this.f34415a.c();
            }

            @NotNull
            public final Sd.b b() {
                return this.f34415a.d();
            }

            @NotNull
            public final f c() {
                return this.f34415a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Intrinsics.d(this.f34415a, ((b) obj).f34415a);
            }

            public final int hashCode() {
                return this.f34415a.hashCode();
            }

            @NotNull
            public final String toString() {
                return "NormalClass(value=" + this.f34415a + ')';
            }
        }

        public /* synthetic */ a(int i11) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(@NotNull f value) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
        a.b value2 = new a.b(value);
        Intrinsics.checkNotNullParameter(value2, "value");
    }

    @Override // Xd.g
    @NotNull
    public final N a(@NotNull InterfaceC9815F module) {
        N n11;
        Intrinsics.checkNotNullParameter(module, "module");
        o0.f69907b.getClass();
        o0 o0Var = o0.f69908c;
        qd.m n12 = module.n();
        n12.getClass();
        InterfaceC9839e o11 = n12.o(s.a.f81887Q.l());
        Intrinsics.checkNotNullExpressionValue(o11, "getKClass(...)");
        Intrinsics.checkNotNullParameter(module, "module");
        a b11 = b();
        if (b11 instanceof a.C0620a) {
            n11 = ((a.C0620a) b()).a();
        } else {
            if (!(b11 instanceof a.b)) {
                throw new Sc.o();
            }
            f c11 = ((a.b) b()).c();
            Sd.b a11 = c11.a();
            int b12 = c11.b();
            InterfaceC9839e a12 = C9856v.a(module, a11);
            if (a12 == null) {
                n11 = le.l.c(le.k.UNRESOLVED_KCLASS_CONSTANT_VALUE, a11.toString(), String.valueOf(b12));
            } else {
                Y q11 = a12.q();
                Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
                K0 r11 = C8701c.r(q11);
                for (int i11 = 0; i11 < b12; i11++) {
                    r11 = module.n().m(L0.INVARIANT, r11);
                }
                n11 = r11;
            }
        }
        return Q.e(o0Var, o11, C7714v.a0(new A0(n11)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(@NotNull Sd.b classId, int i11) {
        this(new f(classId, i11));
        Intrinsics.checkNotNullParameter(classId, "classId");
    }
}
