package S0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class Q0 extends AbstractC7737t implements Function1<Object, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ G f25308b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.collection.M<Object> f25309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q0(G g10, androidx.collection.M<Object> m11) {
        super(1);
        this.f25308b = g10;
        this.f25309c = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        this.f25308b.q(obj);
        androidx.collection.M<Object> m11 = this.f25309c;
        if (m11 != null) {
            m11.d(obj);
        }
        return Unit.f71690a;
    }
}
