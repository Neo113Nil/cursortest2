package S0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class O0 extends AbstractC7737t implements Function1<Object, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ G f25293b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O0(G g10) {
        super(1);
        this.f25293b = g10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.f25293b.a(obj);
        return Unit.f71690a;
    }
}
