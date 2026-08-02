package P20;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
public final class n extends AbstractC7737t implements Function1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2 f21719b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f21720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Function2 function2, List list) {
        super(1);
        this.f21719b = function2;
        this.f21720c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.f21719b.invoke(Integer.valueOf(intValue), this.f21720c.get(intValue));
    }
}
