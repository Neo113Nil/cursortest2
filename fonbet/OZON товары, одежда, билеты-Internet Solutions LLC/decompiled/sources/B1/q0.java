package B1;

import B1.m0;
import D1.H;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class q0 extends H.e {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final q0 f2144b = new q0("Undefined intrinsics block and it is required");

    /* loaded from: classes8.dex */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f2145b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f2146b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0 m0Var) {
            super(1);
            this.f2146b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a.k(aVar, this.f2146b, 0, 0);
            return Unit.f71690a;
        }
    }

    /* loaded from: classes8.dex */
    static final class c extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2147b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ArrayList arrayList) {
            super(1);
            this.f2147b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            ArrayList arrayList = this.f2147b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                m0.a.k(aVar2, (m0) arrayList.get(i11), 0, 0);
            }
            return Unit.f71690a;
        }
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final W mo2measure3p2s80s(@NotNull Y y11, @NotNull List<? extends U> list, long j11) {
        W z02;
        W z03;
        W z04;
        if (list.isEmpty()) {
            z04 = y11.z0(Z1.b.m(j11), Z1.b.l(j11), kotlin.collections.U.c(), a.f2145b);
            return z04;
        }
        if (list.size() == 1) {
            m0 a02 = list.get(0).a0(j11);
            z03 = y11.z0(Z1.c.h(a02.u0(), j11), Z1.c.g(a02.l0(), j11), kotlin.collections.U.c(), new b(a02));
            return z03;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(list.get(i11).a0(j11));
        }
        int size2 = arrayList.size();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size2; i14++) {
            m0 m0Var = (m0) arrayList.get(i14);
            i12 = Math.max(m0Var.u0(), i12);
            i13 = Math.max(m0Var.l0(), i13);
        }
        z02 = y11.z0(Z1.c.h(i12, j11), Z1.c.g(i13, j11), kotlin.collections.U.c(), new c(arrayList));
        return z02;
    }
}
