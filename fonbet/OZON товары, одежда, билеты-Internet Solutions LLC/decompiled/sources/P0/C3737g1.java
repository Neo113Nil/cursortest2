package P0;

import B1.m0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: P0.g1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3737g1 extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f21045b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f21046c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f21047d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ArrayList f21048e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3788y f21049f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f21050g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f21051h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ u0.J f21052i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ B1.z0 f21053j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f21054k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f21055l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Integer f21056m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ ArrayList f21057n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Integer f21058o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3737g1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, C3788y c3788y, int i11, int i12, u0.J j11, B1.z0 z0Var, int i13, int i14, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.f21045b = arrayList;
        this.f21046c = arrayList2;
        this.f21047d = arrayList3;
        this.f21048e = arrayList4;
        this.f21049f = c3788y;
        this.f21050g = i11;
        this.f21051h = i12;
        this.f21052i = j11;
        this.f21053j = z0Var;
        this.f21054k = i13;
        this.f21055l = i14;
        this.f21056m = num;
        this.f21057n = arrayList5;
        this.f21058o = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        int i11;
        m0.a aVar2 = aVar;
        ArrayList arrayList = this.f21045b;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            aVar2.d((B1.m0) arrayList.get(i12), 0, 0, 0.0f);
        }
        ArrayList arrayList2 = this.f21046c;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            aVar2.d((B1.m0) arrayList2.get(i13), 0, 0, 0.0f);
        }
        ArrayList arrayList3 = this.f21047d;
        int size3 = arrayList3.size();
        int i14 = 0;
        while (true) {
            i11 = this.f21054k;
            if (i14 >= size3) {
                break;
            }
            B1.m0 m0Var = (B1.m0) arrayList3.get(i14);
            int i15 = (this.f21050g - this.f21051h) / 2;
            B1.z0 z0Var = this.f21053j;
            aVar2.d(m0Var, this.f21052i.a(z0Var, z0Var.getLayoutDirection()) + i15, i11 - this.f21055l, 0.0f);
            i14++;
        }
        ArrayList arrayList4 = this.f21048e;
        int size4 = arrayList4.size();
        for (int i16 = 0; i16 < size4; i16++) {
            B1.m0 m0Var2 = (B1.m0) arrayList4.get(i16);
            Integer num = this.f21056m;
            aVar2.d(m0Var2, 0, i11 - (num != null ? num.intValue() : 0), 0.0f);
        }
        C3788y c3788y = this.f21049f;
        if (c3788y != null) {
            ArrayList arrayList5 = this.f21057n;
            int size5 = arrayList5.size();
            for (int i17 = 0; i17 < size5; i17++) {
                B1.m0 m0Var3 = (B1.m0) arrayList5.get(i17);
                int b11 = c3788y.b();
                Integer num2 = this.f21058o;
                Intrinsics.f(num2);
                aVar2.d(m0Var3, b11, i11 - num2.intValue(), 0.0f);
            }
        }
        return Unit.f71690a;
    }
}
