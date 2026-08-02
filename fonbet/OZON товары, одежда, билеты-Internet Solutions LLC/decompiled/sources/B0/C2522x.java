package B0;

import S0.InterfaceC3978p0;
import java.util.List;
import k1.C7460f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: B0.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2522x extends AbstractC7737t implements Function0<List<? extends C7460f>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<List<C7460f>> f1998b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2522x(InterfaceC3978p0<List<C7460f>> interfaceC3978p0) {
        super(0);
        this.f1998b = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C7460f> invoke() {
        InterfaceC3978p0<List<C7460f>> interfaceC3978p0 = this.f1998b;
        if (interfaceC3978p0 != null) {
            return interfaceC3978p0.getValue();
        }
        return null;
    }
}
