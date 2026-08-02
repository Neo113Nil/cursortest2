package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
public final class K9 extends AbstractC7737t implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4497oa f29341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K9(AbstractC4497oa abstractC4497oa) {
        super(0);
        this.f29341b = abstractC4497oa;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f29341b.dismiss();
        return Unit.f71690a;
    }
}
