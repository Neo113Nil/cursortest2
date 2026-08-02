package N0;

import B1.U;
import B1.V;
import B1.W;
import B1.Y;
import B1.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class p implements V {

    /* renamed from: a, reason: collision with root package name */
    public static final p f18320a = new p();

    public static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18321b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            return Unit.f71690a;
        }
    }

    public static final class b extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f18322b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m0 m0Var) {
            super(1);
            this.f18322b = m0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            aVar.h(this.f18322b, 0, 0, 0.0f);
            return Unit.f71690a;
        }
    }

    public static final class c extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f18323b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.f18323b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            ArrayList arrayList = this.f18323b;
            int P11 = C7714v.P(arrayList);
            if (P11 >= 0) {
                int i11 = 0;
                while (true) {
                    aVar2.h((m0) arrayList.get(i11), 0, 0, 0.0f);
                    if (i11 == P11) {
                        break;
                    }
                    i11++;
                }
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
        int i11;
        W z04;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            z02 = y11.z0(0, 0, kotlin.collections.U.c(), a.f18321b);
            return z02;
        }
        if (size == 1) {
            m0 a02 = list.get(0).a0(j11);
            z03 = y11.z0(a02.u0(), a02.l0(), kotlin.collections.U.c(), new b(a02));
            return z03;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            arrayList.add(list.get(i13).a0(j11));
        }
        int P11 = C7714v.P(arrayList);
        if (P11 >= 0) {
            int i14 = 0;
            i11 = 0;
            while (true) {
                m0 m0Var = (m0) arrayList.get(i12);
                i14 = Math.max(i14, m0Var.u0());
                i11 = Math.max(i11, m0Var.l0());
                if (i12 == P11) {
                    break;
                }
                i12++;
            }
            i12 = i14;
        } else {
            i11 = 0;
        }
        z04 = y11.z0(i12, i11, kotlin.collections.U.c(), new c(arrayList));
        return z04;
    }
}
