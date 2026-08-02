package B0;

import B1.m0;
import Bl0.C2652m;
import D1.InterfaceC2801g;
import K1.C3422b;
import K1.C3442w;
import S0.C3969l;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: B0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2472g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Pair<List<C3422b.C0288b<C3442w>>, List<C3422b.C0288b<InterfaceC6511n<String, InterfaceC3967k, Integer, Unit>>>> f1730a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f1731b = 0;

    /* renamed from: B0.g$a */
    /* loaded from: classes8.dex */
    static final class a implements B1.V {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1732a = new a();

        /* renamed from: B0.g$a$a, reason: collision with other inner class name */
        static final class C0044a extends AbstractC7737t implements Function1<m0.a, Unit> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ArrayList f1733b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0044a(ArrayList arrayList) {
                super(1);
                this.f1733b = arrayList;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(m0.a aVar) {
                m0.a aVar2 = aVar;
                ArrayList arrayList = this.f1733b;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    aVar2.h((B1.m0) arrayList.get(i11), 0, 0, 0.0f);
                }
                return Unit.f71690a;
            }
        }

        @Override // B1.V
        @NotNull
        /* renamed from: measure-3p2s80s */
        public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
            B1.W z02;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(list.get(i11).a0(j11));
            }
            z02 = y11.z0(Z1.b.k(j11), Z1.b.j(j11), kotlin.collections.U.c(), new C0044a(arrayList));
            return z02;
        }
    }

    /* renamed from: B0.g$b */
    /* loaded from: classes8.dex */
    static final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3422b f1734b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<C3422b.C0288b<InterfaceC6511n<String, InterfaceC3967k, Integer, Unit>>> f1735c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1736d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3422b c3422b, List<C3422b.C0288b<InterfaceC6511n<String, InterfaceC3967k, Integer, Unit>>> list, int i11) {
            super(2);
            this.f1734b = c3422b;
            this.f1735c = list;
            this.f1736d = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
            num.intValue();
            int e11 = C2652m.e(this.f1736d | 1);
            C2472g.a(this.f1734b, this.f1735c, interfaceC3967k, e11);
            return Unit.f71690a;
        }
    }

    static {
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        f1730a = new Pair<>(k11, k11);
    }

    public static final void a(@NotNull C3422b c3422b, @NotNull List<C3422b.C0288b<InterfaceC6511n<String, InterfaceC3967k, Integer, Unit>>> list, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-1794596951);
        int i12 = (i11 & 6) == 0 ? (u11.n(c3422b) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(list) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                C3422b.C0288b<InterfaceC6511n<String, InterfaceC3967k, Integer, Unit>> c0288b = list.get(i13);
                InterfaceC6511n<String, InterfaceC3967k, Integer, Unit> a11 = c0288b.a();
                int b11 = c0288b.b();
                int c11 = c0288b.c();
                a aVar = a.f1732a;
                e.a aVar2 = androidx.compose.ui.e.f40358c0;
                int I11 = u11.I();
                S0.A0 d11 = u11.d();
                androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, aVar2);
                Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a12);
                } else {
                    u11.e();
                }
                S0.F1.b(u11, aVar, InterfaceC2801g.a.e());
                S0.F1.b(u11, d11, InterfaceC2801g.a.g());
                Function2 b12 = InterfaceC2801g.a.b();
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    Ep.a.d(I11, u11, I11, b12);
                }
                S0.F1.b(u11, f7, InterfaceC2801g.a.f());
                a11.invoke(c3422b.subSequence(b11, c11).h(), u11, 0);
                u11.f();
            }
        }
        S0.J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(c3422b, list, i11));
        }
    }

    @NotNull
    public static final Pair<List<C3422b.C0288b<C3442w>>, List<C3422b.C0288b<InterfaceC6511n<String, InterfaceC3967k, Integer, Unit>>>> b(@NotNull C3422b c3422b, Map<String, E0> map) {
        if (map == null || map.isEmpty()) {
            return f1730a;
        }
        List g10 = c3422b.g(c3422b.h().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = g10.size();
        for (int i11 = 0; i11 < size; i11++) {
            C3422b.C0288b c0288b = (C3422b.C0288b) g10.get(i11);
            if (map.get(c0288b.f()) != null) {
                arrayList.add(new C3422b.C0288b(c0288b.g(), c0288b.e(), null));
                arrayList2.add(new C3422b.C0288b(c0288b.g(), c0288b.e(), null));
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }
}
