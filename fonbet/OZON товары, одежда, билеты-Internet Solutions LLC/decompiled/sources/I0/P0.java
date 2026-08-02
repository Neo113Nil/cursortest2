package I0;

import B1.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class P0 implements B1.V {

    /* renamed from: a, reason: collision with root package name */
    public static final P0 f11360a = new P0();

    static final class a extends AbstractC7737t implements Function1<m0.a, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f11361b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList) {
            super(1);
            this.f11361b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(m0.a aVar) {
            m0.a aVar2 = aVar;
            ArrayList arrayList = this.f11361b;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                aVar2.d((B1.m0) arrayList.get(i11), 0, 0, 0.0f);
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
        Integer num = 0;
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(list.get(i11).a0(j11));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i12 = 0; i12 < size2; i12++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((B1.m0) arrayList.get(i12)).u0()));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((B1.m0) arrayList.get(i13)).l0()));
        }
        z02 = y11.z0(intValue, num.intValue(), kotlin.collections.U.c(), new a(arrayList));
        return z02;
    }
}
