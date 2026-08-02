package B0;

import S0.InterfaceC3978p0;
import java.util.List;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2528z extends AbstractC7737t implements Function1<List<? extends C7460f>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<List<C7460f>> f2020b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2528z(InterfaceC3978p0<List<C7460f>> interfaceC3978p0) {
        super(1);
        this.f2020b = interfaceC3978p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends C7460f> list) {
        List<? extends C7460f> list2 = list;
        InterfaceC3978p0<List<C7460f>> interfaceC3978p0 = this.f2020b;
        if (interfaceC3978p0 != 0) {
            interfaceC3978p0.setValue(list2);
        }
        return Unit.f71690a;
    }
}
