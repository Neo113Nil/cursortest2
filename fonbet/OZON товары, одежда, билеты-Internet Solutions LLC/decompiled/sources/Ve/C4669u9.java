package Ve;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDtoKt;

/* renamed from: Ve.u9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4669u9 extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C4669u9 f32198b = new C4669u9(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Map it = (Map) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return BindingV3SessionResponseBodyDtoKt.toBindingCheckResult(it);
    }
}
