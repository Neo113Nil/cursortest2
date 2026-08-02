package Nf0;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
public final class d extends AbstractC7737t implements Function1<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f19510b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list) {
        super(1);
        this.f19510b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Integer num) {
        this.f19510b.get(num.intValue());
        return null;
    }
}
