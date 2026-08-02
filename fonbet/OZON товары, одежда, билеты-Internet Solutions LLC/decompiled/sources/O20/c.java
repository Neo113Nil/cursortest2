package O20;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function2<Integer, b, Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final c f19877b = new c(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, b bVar) {
        num.intValue();
        b item = bVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return item.b();
    }
}
