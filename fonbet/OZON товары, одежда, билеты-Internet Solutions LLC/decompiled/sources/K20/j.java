package K20;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
public final class j extends AbstractC7737t implements Function1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1 f15143b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f15144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Function1 function1, List list) {
        super(1);
        this.f15143b = function1;
        this.f15144c = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        return this.f15143b.invoke(this.f15144c.get(num.intValue()));
    }
}
