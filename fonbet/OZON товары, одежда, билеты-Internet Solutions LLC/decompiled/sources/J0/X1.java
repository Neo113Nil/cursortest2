package J0;

import B1.m0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class X1 extends AbstractC7737t implements Function1<m0.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ArrayList f13070b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f13071c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f13072d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ArrayList f13073e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ArrayList f13074f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f13075g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f13076h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f13077i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Integer f13078j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C3368z0 f13079k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ Integer f13080l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, int i11, int i12, int i13, Integer num, C3368z0 c3368z0, Integer num2) {
        super(1);
        this.f13070b = arrayList;
        this.f13071c = arrayList2;
        this.f13072d = arrayList3;
        this.f13073e = arrayList4;
        this.f13074f = arrayList5;
        this.f13075g = i11;
        this.f13076h = i12;
        this.f13077i = i13;
        this.f13078j = num;
        this.f13079k = c3368z0;
        this.f13080l = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(m0.a aVar) {
        int i11;
        m0.a aVar2 = aVar;
        ArrayList arrayList = this.f13070b;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            aVar2.d((B1.m0) arrayList.get(i12), 0, this.f13075g, 0.0f);
        }
        ArrayList arrayList2 = this.f13071c;
        int size2 = arrayList2.size();
        for (int i13 = 0; i13 < size2; i13++) {
            aVar2.d((B1.m0) arrayList2.get(i13), 0, 0, 0.0f);
        }
        ArrayList arrayList3 = this.f13072d;
        int size3 = arrayList3.size();
        int i14 = 0;
        while (true) {
            i11 = this.f13076h;
            if (i14 >= size3) {
                break;
            }
            aVar2.d((B1.m0) arrayList3.get(i14), 0, i11 - this.f13077i, 0.0f);
            i14++;
        }
        ArrayList arrayList4 = this.f13073e;
        int size4 = arrayList4.size();
        for (int i15 = 0; i15 < size4; i15++) {
            B1.m0 m0Var = (B1.m0) arrayList4.get(i15);
            Integer num = this.f13078j;
            aVar2.d(m0Var, 0, i11 - (num != null ? num.intValue() : 0), 0.0f);
        }
        ArrayList arrayList5 = this.f13074f;
        int size5 = arrayList5.size();
        for (int i16 = 0; i16 < size5; i16++) {
            B1.m0 m0Var2 = (B1.m0) arrayList5.get(i16);
            C3368z0 c3368z0 = this.f13079k;
            int b11 = c3368z0 != null ? c3368z0.b() : 0;
            Integer num2 = this.f13080l;
            aVar2.d(m0Var2, b11, i11 - (num2 != null ? num2.intValue() : 0), 0.0f);
        }
        return Unit.f71690a;
    }
}
