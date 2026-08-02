package O20;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
public final class f extends AbstractC7737t implements Function1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2 f19884b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f19885c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function2 function2, List list) {
        super(1);
        this.f19884b = function2;
        this.f19885c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.f19884b.invoke(Integer.valueOf(intValue), this.f19885c.get(intValue));
    }
}
