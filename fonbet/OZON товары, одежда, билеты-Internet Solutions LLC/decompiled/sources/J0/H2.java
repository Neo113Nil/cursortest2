package J0;

import B1.C2533b;
import B1.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class H2 implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    public static final H2 f12817a = new H2();

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList<B1.m0> f12818b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12819c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, ArrayList arrayList) {
            super(1);
            this.f12818b = arrayList;
            this.f12819c = i11;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            ArrayList<B1.m0> arrayList = this.f12818b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                B1.m0 m0Var = arrayList.get(i11);
                aVar2.h(m0Var, 0, (this.f12819c - m0Var.l0()) / 2, 0.0f);
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
        boolean z11 = false;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            B1.m0 a02 = list.get(i14).a0(j11);
            arrayList.add(a02);
            if (a02.E(C2533b.a()) != Integer.MIN_VALUE && (i11 == Integer.MIN_VALUE || a02.E(C2533b.a()) < i11)) {
                i11 = a02.E(C2533b.a());
            }
            if (a02.E(C2533b.b()) != Integer.MIN_VALUE && (i12 == Integer.MIN_VALUE || a02.E(C2533b.b()) > i12)) {
                i12 = a02.E(C2533b.b());
            }
            i13 = Math.max(i13, a02.l0());
        }
        if (i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE) {
            z11 = true;
        }
        int max = Math.max(y11.Y0((i11 == i12 || !z11) ? J2.f12881f : J2.f12882g), i13);
        z02 = y11.z0(Z1.b.k(j11), max, kotlin.collections.U.c(), new a(max, arrayList));
        return z02;
    }
}
