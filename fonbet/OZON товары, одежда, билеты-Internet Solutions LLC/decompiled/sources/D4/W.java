package D4;

import B4.C2581j;
import S0.InterfaceC3978p0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
final class W extends AbstractC7737t implements Function0<List<? extends C2581j>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0 f5880b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    W(InterfaceC3978p0 interfaceC3978p0) {
        super(0);
        this.f5880b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C2581j> invoke() {
        List list = (List) this.f5880b.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.d(((C2581j) obj).d().n(), "composable")) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
