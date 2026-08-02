package P20;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
public final class l extends AbstractC7737t implements Function1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f21715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list) {
        super(1);
        this.f21715b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        this.f21715b.get(num.intValue());
        return null;
    }
}
