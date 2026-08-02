package androidx.compose.foundation.layout;

import B0.C2454a;
import B1.InterfaceC2552v;
import B1.InterfaceC2553w;
import B1.m0;
import androidx.compose.foundation.layout.C;
import androidx.compose.foundation.layout.C5179b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u0.C9913w;
import u0.EnumC9910t;

/* loaded from: classes8.dex */
final class G implements B1.c0, E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C5179b.e f39333a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C5179b.l f39334b;

    /* renamed from: c, reason: collision with root package name */
    private final float f39335c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final r f39336d;

    /* renamed from: e, reason: collision with root package name */
    private final float f39337e;

    /* renamed from: f, reason: collision with root package name */
    private final int f39338f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final D f39339g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f39340h = F.f39330b;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f39341i = H.f39345b;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f39342j = I.f39347b;

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f39343b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f39344b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
            return Unit.f71690a;
        }
    }

    public G(C5179b.e eVar, C5179b.l lVar, float f7, r rVar, float f11, int i11, D d11) {
        this.f39333a = eVar;
        this.f39334b = lVar;
        this.f39335c = f7;
        this.f39336d = rVar;
        this.f39337e = f11;
        this.f39338f = i11;
        this.f39339g = d11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        g10.getClass();
        return this.f39333a.equals(g10.f39333a) && this.f39334b.equals(g10.f39334b) && Z1.h.b(this.f39335c, g10.f39335c) && Intrinsics.d(this.f39336d, g10.f39336d) && Z1.h.b(this.f39337e, g10.f39337e) && this.f39338f == g10.f39338f && Intrinsics.d(this.f39339g, g10.f39339g);
    }

    @Override // androidx.compose.foundation.layout.E
    @NotNull
    public final r f() {
        return this.f39336d;
    }

    @Override // androidx.compose.foundation.layout.E
    @NotNull
    public final C5179b.l g() {
        return this.f39334b;
    }

    @Override // androidx.compose.foundation.layout.E
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.f39339g.hashCode() + C2454a.a(Integer.MAX_VALUE, C2454a.a(this.f39338f, Pk0.b.a(this.f39337e, (this.f39336d.hashCode() + Pk0.b.a(this.f39335c, (this.f39334b.hashCode() + ((this.f39333a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fd.n, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r2v0, types: [fd.n, kotlin.jvm.internal.t] */
    public final int i(@NotNull List list, int i11, int i12, int i13, int i14, @NotNull D d11) {
        long e11;
        e11 = B.e(list, this.f39342j, this.f39341i, i11, i12, i13, i14, d11);
        return (int) (e11 >> 32);
    }

    @Override // androidx.compose.foundation.layout.E
    @NotNull
    public final C5179b.e l() {
        return this.f39333a;
    }

    @Override // B1.c0
    public final int maxIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends List<? extends InterfaceC2552v>> list, int i11) {
        List list2 = (List) C7714v.Q(1, list);
        InterfaceC2552v interfaceC2552v = list2 != null ? (InterfaceC2552v) C7714v.M(list2) : null;
        List list3 = (List) C7714v.Q(2, list);
        this.f39339g.h(interfaceC2552v, list3 != null ? (InterfaceC2552v) C7714v.M(list3) : null, Z1.c.b(i11, 0, 13));
        List list4 = (List) C7714v.M(list);
        if (list4 == null) {
            list4 = kotlin.collections.K.f71697a;
        }
        return i(list4, i11, interfaceC2553w.Y0(this.f39335c), interfaceC2553w.Y0(this.f39337e), this.f39338f, this.f39339g);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [fd.n, kotlin.jvm.internal.t] */
    @Override // B1.c0
    public final int maxIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends List<? extends InterfaceC2552v>> list, int i11) {
        List list2 = (List) C7714v.Q(1, list);
        InterfaceC2552v interfaceC2552v = list2 != null ? (InterfaceC2552v) C7714v.M(list2) : null;
        List list3 = (List) C7714v.Q(2, list);
        this.f39339g.h(interfaceC2552v, list3 != null ? (InterfaceC2552v) C7714v.M(list3) : null, Z1.c.b(0, i11, 7));
        List list4 = (List) C7714v.M(list);
        if (list4 == null) {
            list4 = kotlin.collections.K.f71697a;
        }
        int Y02 = interfaceC2553w.Y0(this.f39335c);
        ?? r22 = this.f39340h;
        int i12 = B.f39302b;
        int size = list4.size();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i13 < size) {
            int intValue = ((Number) r22.invoke((InterfaceC2552v) list4.get(i13), Integer.valueOf(i13), Integer.valueOf(i11))).intValue() + Y02;
            int i17 = i13 + 1;
            if (i17 - i15 == this.f39338f || i17 == list4.size()) {
                i14 = Math.max(i14, (i16 + intValue) - Y02);
                i16 = 0;
                i15 = i13;
            } else {
                i16 += intValue;
            }
            i13 = i17;
        }
        return i14;
    }

    @Override // B1.c0
    @NotNull
    /* renamed from: measure-3p2s80s */
    public final B1.W mo3measure3p2s80s(@NotNull B1.Y y11, @NotNull List<? extends List<? extends B1.U>> list, long j11) {
        B1.W z02;
        B1.W z03;
        if (this.f39338f != 0 && !((ArrayList) list).isEmpty()) {
            int j12 = Z1.b.j(j11);
            D d11 = this.f39339g;
            if (j12 != 0 || d11.g() == C.a.Visible) {
                List list2 = (List) C7714v.K(list);
                if (list2.isEmpty()) {
                    z03 = y11.z0(0, 0, kotlin.collections.U.c(), b.f39344b);
                    return z03;
                }
                List list3 = (List) C7714v.Q(1, list);
                B1.U u11 = list3 != null ? (B1.U) C7714v.M(list3) : null;
                List list4 = (List) C7714v.Q(2, list);
                B1.U u12 = list4 != null ? (B1.U) C7714v.M(list4) : null;
                list2.size();
                d11.getClass();
                this.f39339g.i(this, u11, u12, j11);
                return B.d(y11, this, list2.iterator(), this.f39335c, this.f39337e, C9913w.a(j11, EnumC9910t.Horizontal), this.f39338f, this.f39339g);
            }
        }
        z02 = y11.z0(0, 0, kotlin.collections.U.c(), a.f39343b);
        return z02;
    }

    @Override // B1.c0
    public final int minIntrinsicHeight(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends List<? extends InterfaceC2552v>> list, int i11) {
        List list2 = (List) C7714v.Q(1, list);
        InterfaceC2552v interfaceC2552v = list2 != null ? (InterfaceC2552v) C7714v.M(list2) : null;
        List list3 = (List) C7714v.Q(2, list);
        this.f39339g.h(interfaceC2552v, list3 != null ? (InterfaceC2552v) C7714v.M(list3) : null, Z1.c.b(i11, 0, 13));
        List list4 = (List) C7714v.M(list);
        if (list4 == null) {
            list4 = kotlin.collections.K.f71697a;
        }
        return i(list4, i11, interfaceC2553w.Y0(this.f39335c), interfaceC2553w.Y0(this.f39337e), this.f39338f, this.f39339g);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [fd.n, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r2v5, types: [fd.n, kotlin.jvm.internal.t] */
    @Override // B1.c0
    public final int minIntrinsicWidth(@NotNull InterfaceC2553w interfaceC2553w, @NotNull List<? extends List<? extends InterfaceC2552v>> list, int i11) {
        List list2 = (List) C7714v.Q(1, list);
        InterfaceC2552v interfaceC2552v = list2 != null ? (InterfaceC2552v) C7714v.M(list2) : null;
        List list3 = (List) C7714v.Q(2, list);
        this.f39339g.h(interfaceC2552v, list3 != null ? (InterfaceC2552v) C7714v.M(list3) : null, Z1.c.b(0, i11, 7));
        List list4 = (List) C7714v.M(list);
        if (list4 == null) {
            list4 = kotlin.collections.K.f71697a;
        }
        return B.c(list4, this.f39342j, this.f39341i, i11, interfaceC2553w.Y0(this.f39335c), interfaceC2553w.Y0(this.f39337e), this.f39338f, this.f39339g);
    }

    @NotNull
    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.f39333a + ", verticalArrangement=" + this.f39334b + ", mainAxisSpacing=" + ((Object) Z1.h.c(this.f39335c)) + ", crossAxisAlignment=" + this.f39336d + ", crossAxisArrangementSpacing=" + ((Object) Z1.h.c(this.f39337e)) + ", maxItemsInMainAxis=" + this.f39338f + ", maxLines=2147483647, overflow=" + this.f39339g + ')';
    }
}
