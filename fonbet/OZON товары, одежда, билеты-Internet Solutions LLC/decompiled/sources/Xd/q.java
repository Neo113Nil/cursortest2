package Xd;

import Sc.InterfaceC4008j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import je.A0;
import je.D0;
import je.L0;
import je.N;
import je.Q;
import je.Y;
import je.o0;
import je.s0;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;
import td.InterfaceC9842h;
import td.i0;

/* loaded from: classes10.dex */
public final class q implements s0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f34408a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9815F f34409b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f34410c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Y f34411d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f34412e;

    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: Xd.q$a$a, reason: collision with other inner class name */
        private static final class EnumC0619a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ EnumC0619a[] $VALUES;
            public static final EnumC0619a COMMON_SUPER_TYPE;
            public static final EnumC0619a INTERSECTION_TYPE;

            static {
                EnumC0619a enumC0619a = new EnumC0619a("COMMON_SUPER_TYPE", 0);
                COMMON_SUPER_TYPE = enumC0619a;
                EnumC0619a enumC0619a2 = new EnumC0619a("INTERSECTION_TYPE", 1);
                INTERSECTION_TYPE = enumC0619a2;
                EnumC0619a[] enumC0619aArr = {enumC0619a, enumC0619a2};
                $VALUES = enumC0619aArr;
                $ENTRIES = Xc.b.a(enumC0619aArr);
            }

            private EnumC0619a() {
                throw null;
            }

            public static EnumC0619a valueOf(String str) {
                return (EnumC0619a) Enum.valueOf(EnumC0619a.class, str);
            }

            public static EnumC0619a[] values() {
                return (EnumC0619a[]) $VALUES.clone();
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f34413a;

            static {
                int[] iArr = new int[EnumC0619a.values().length];
                try {
                    iArr[EnumC0619a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC0619a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f34413a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v18, types: [je.Y] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, je.N, je.Y] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public static Y a(@NotNull ArrayList types) {
            LinkedHashSet T11;
            Intrinsics.checkNotNullParameter(types, "types");
            EnumC0619a enumC0619a = EnumC0619a.INTERSECTION_TYPE;
            if (types.isEmpty()) {
                return null;
            }
            Iterator it = types.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            ?? next = it.next();
            while (it.hasNext()) {
                Y y11 = (Y) it.next();
                next = (Y) next;
                if (next != 0 && y11 != null) {
                    s0 H02 = next.H0();
                    s0 H03 = y11.H0();
                    boolean z11 = H02 instanceof q;
                    if (z11 && (H03 instanceof q)) {
                        q qVar = (q) H02;
                        q qVar2 = (q) H03;
                        int i11 = b.f34413a[enumC0619a.ordinal()];
                        if (i11 == 1) {
                            T11 = C7714v.T(qVar.e(), qVar2.e());
                        } else {
                            if (i11 != 2) {
                                throw new Sc.o();
                            }
                            Set<N> e11 = qVar.e();
                            Set<N> other = qVar2.e();
                            Intrinsics.checkNotNullParameter(e11, "<this>");
                            Intrinsics.checkNotNullParameter(other, "other");
                            T11 = C7714v.X0(e11);
                            C7714v.p(other, T11);
                        }
                        q constructor = new q(qVar.f34408a, qVar.f34409b, T11);
                        o0.f69907b.getClass();
                        o0 attributes = o0.f69908c;
                        Intrinsics.checkNotNullParameter(attributes, "attributes");
                        Intrinsics.checkNotNullParameter(constructor, "constructor");
                        next = Q.g(le.l.a(le.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), K.f71697a, attributes, constructor, false);
                    } else if (z11) {
                        if (!((q) H02).e().contains(y11)) {
                            y11 = null;
                        }
                        next = y11;
                    } else if ((H03 instanceof q) && ((q) H03).e().contains(next)) {
                    }
                }
                next = 0;
            }
            return (Y) next;
        }
    }

    private q() {
        throw null;
    }

    public q(long j11, InterfaceC9815F interfaceC9815F, LinkedHashSet linkedHashSet) {
        o0.f69907b.getClass();
        o0 attributes = o0.f69908c;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(this, "constructor");
        this.f34411d = Q.g(le.l.a(le.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), K.f71697a, attributes, this, false);
        this.f34412e = Sc.k.b(new o(this));
        this.f34408a = j11;
        this.f34409b = interfaceC9815F;
        this.f34410c = linkedHashSet;
    }

    static ArrayList d(q qVar) {
        Y q11 = qVar.f34409b.n().v().q();
        Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
        ArrayList m02 = C7714v.m0(D0.e(q11, C7714v.a0(new A0(qVar.f34411d, L0.IN_VARIANCE)), null, 2));
        InterfaceC9815F interfaceC9815F = qVar.f34409b;
        Intrinsics.checkNotNullParameter(interfaceC9815F, "<this>");
        List b02 = C7714v.b0(interfaceC9815F.n().z(), interfaceC9815F.n().A(), interfaceC9815F.n().s(), interfaceC9815F.n().L());
        if (!(b02 instanceof Collection) || !b02.isEmpty()) {
            Iterator it = b02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (qVar.f34410c.contains((N) it.next())) {
                    m02.add(interfaceC9815F.n().F());
                    break;
                }
            }
        }
        return m02;
    }

    @NotNull
    public final Set<N> e() {
        return this.f34410c;
    }

    @Override // je.s0
    @NotNull
    public final List<i0> getParameters() {
        return K.f71697a;
    }

    @Override // je.s0
    @NotNull
    public final qd.m n() {
        return this.f34409b.n();
    }

    @Override // je.s0
    @NotNull
    public final Collection<N> o() {
        return (List) this.f34412e.getValue();
    }

    @Override // je.s0
    public final InterfaceC9842h p() {
        return null;
    }

    @Override // je.s0
    public final boolean q() {
        return false;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append("[" + C7714v.V(this.f34410c, ",", null, null, p.f34407a, 30) + ']');
        return sb2.toString();
    }
}
