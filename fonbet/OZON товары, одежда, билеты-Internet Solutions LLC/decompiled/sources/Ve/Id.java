package Ve;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.data.dto.response.DataDtoInterface;

/* loaded from: classes10.dex */
public final class Id extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Id f29226b = new Id(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DataDtoInterface it = (DataDtoInterface) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toModel();
    }
}
