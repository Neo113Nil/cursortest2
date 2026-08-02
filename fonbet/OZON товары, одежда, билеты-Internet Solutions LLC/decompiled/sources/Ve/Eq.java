package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class Eq extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4744x f28951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eq(C4744x c4744x) {
        super(0);
        this.f28951b = c4744x;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f28951b.f32411P.setValue("Auth by refresh");
        return Unit.f71690a;
    }
}
