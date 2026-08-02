package androidx.compose.foundation.layout;

import B1.m0;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.foundation.layout.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5186i implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6250b f39500a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39501b;

    /* renamed from: androidx.compose.foundation.layout.i$a */
    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f39502b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            return Unit.f71690a;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.i$b */
    static final class b extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0 f39503b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B1.U f39504c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B1.Y f39505d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f39506e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f39507f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C5186i f39508g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0 m0Var, B1.U u11, B1.Y y11, int i11, int i12, C5186i c5186i) {
            super(1);
            this.f39503b = m0Var;
            this.f39504c = u11;
            this.f39505d = y11;
            this.f39506e = i11;
            this.f39507f = i12;
            this.f39508g = c5186i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            Z1.s layoutDirection = this.f39505d.getLayoutDirection();
            InterfaceC6250b interfaceC6250b = this.f39508g.f39500a;
            C5185h.c(aVar, this.f39503b, this.f39504c, layoutDirection, this.f39506e, this.f39507f, interfaceC6250b);
            return Unit.f71690a;
        }
    }

    /* renamed from: androidx.compose.foundation.layout.i$c */
    static final class c extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m0[] f39509b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<B1.U> f39510c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B1.Y f39511d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f39512e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f39513f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C5186i f39514g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(m0[] m0VarArr, List<? extends B1.U> list, B1.Y y11, kotlin.jvm.internal.K k11, kotlin.jvm.internal.K k12, C5186i c5186i) {
            super(1);
            this.f39509b = m0VarArr;
            this.f39510c = list;
            this.f39511d = y11;
            this.f39512e = k11;
            this.f39513f = k12;
            this.f39514g = c5186i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            m0[] m0VarArr = this.f39509b;
            int length = m0VarArr.length;
            int i11 = 0;
            int i12 = 0;
            while (i12 < length) {
                int i13 = i11;
                m0 m0Var = m0VarArr[i12];
                Intrinsics.g(m0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                C5185h.c(aVar2, m0Var, this.f39510c.get(i13), this.f39511d.getLayoutDirection(), this.f39512e.f71785a, this.f39513f.f71785a, this.f39514g.f39500a);
                i12++;
                i11 = i13 + 1;
            }
            return Unit.f71690a;
        }
    }

    public C5186i(@NotNull InterfaceC6250b interfaceC6250b, boolean z11) {
        this.f39500a = interfaceC6250b;
        this.f39501b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5186i)) {
            return false;
        }
        C5186i c5186i = (C5186i) obj;
        return Intrinsics.d(this.f39500a, c5186i.f39500a) && this.f39501b == c5186i.f39501b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39501b) + (this.f39500a.hashCode() * 31);
    }

    @Override // B1.V
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo2measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends B1.U> list, long j11) {
        B1.W z02;
        int m11;
        int l11;
        m0 a02;
        B1.W z03;
        B1.W z04;
        if (list.isEmpty()) {
            z04 = y11.z0(Z1.b.m(j11), Z1.b.l(j11), kotlin.collections.U.c(), a.f39502b);
            return z04;
        }
        long c11 = this.f39501b ? j11 : Z1.b.c(0, 0, 0, 0, 10, j11);
        if (list.size() == 1) {
            B1.U u11 = list.get(0);
            if (C5185h.b(u11)) {
                m11 = Z1.b.m(j11);
                l11 = Z1.b.l(j11);
                int m12 = Z1.b.m(j11);
                int l12 = Z1.b.l(j11);
                if (m12 < 0 || l12 < 0) {
                    Z1.l.a("width(" + m12 + ") and height(" + l12 + ") must be >= 0");
                    throw null;
                }
                a02 = u11.a0(Z1.c.i(m12, m12, l12, l12));
            } else {
                a02 = u11.a0(c11);
                m11 = Math.max(Z1.b.m(j11), a02.u0());
                l11 = Math.max(Z1.b.l(j11), a02.l0());
            }
            int i11 = l11;
            int i12 = m11;
            z03 = y11.z0(i12, i11, kotlin.collections.U.c(), new b(a02, u11, y11, i12, i11, this));
            return z03;
        }
        m0[] m0VarArr = new m0[list.size()];
        kotlin.jvm.internal.K k11 = new kotlin.jvm.internal.K();
        k11.f71785a = Z1.b.m(j11);
        kotlin.jvm.internal.K k12 = new kotlin.jvm.internal.K();
        k12.f71785a = Z1.b.l(j11);
        int size = list.size();
        boolean z11 = false;
        for (int i13 = 0; i13 < size; i13++) {
            B1.U u12 = list.get(i13);
            if (C5185h.b(u12)) {
                z11 = true;
            } else {
                m0 a03 = u12.a0(c11);
                m0VarArr[i13] = a03;
                k11.f71785a = Math.max(k11.f71785a, a03.u0());
                k12.f71785a = Math.max(k12.f71785a, a03.l0());
            }
        }
        if (z11) {
            int i14 = k11.f71785a;
            int i15 = i14 != Integer.MAX_VALUE ? i14 : 0;
            int i16 = k12.f71785a;
            long a11 = Z1.c.a(i15, i14, i16 != Integer.MAX_VALUE ? i16 : 0, i16);
            int size2 = list.size();
            for (int i17 = 0; i17 < size2; i17++) {
                B1.U u13 = list.get(i17);
                if (C5185h.b(u13)) {
                    m0VarArr[i17] = u13.a0(a11);
                }
            }
        }
        z02 = y11.z0(k11.f71785a, k12.f71785a, kotlin.collections.U.c(), new c(m0VarArr, list, y11, k11, k12, this));
        return z02;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f39500a);
        sb2.append(", propagateMinConstraints=");
        return B4.V.d(sb2, this.f39501b, ')');
    }
}
