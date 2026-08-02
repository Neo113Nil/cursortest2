package I1;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class y extends AbstractC7737t implements Function1<List<Float>, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function0<Float> f11791b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(Function0<Float> function0) {
        super(1);
        this.f11791b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<Float> list) {
        boolean z11;
        List<Float> list2 = list;
        Float invoke = this.f11791b.invoke();
        if (invoke == null) {
            z11 = false;
        } else {
            list2.add(invoke);
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
