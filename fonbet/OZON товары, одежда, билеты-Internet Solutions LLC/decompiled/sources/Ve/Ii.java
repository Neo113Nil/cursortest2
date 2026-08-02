package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class Ii extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4744x f29238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ii(C4744x c4744x) {
        super(0);
        this.f29238b = c4744x;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C4744x c4744x = this.f29238b;
        ((Yq) c4744x.f32426o).f30521b = true;
        c4744x.f32401F.setValue(new L5(C4358jg.f31368a));
        return Unit.f71690a;
    }
}
