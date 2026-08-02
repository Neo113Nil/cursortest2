package Ve;

import R2.C3909c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.of, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4502of extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C4502of f31727b = new C4502of(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3909c exception = (C3909c) obj;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Lm0.a.f17149a.e("DataStore corruptionHandler catch error " + exception, new Object[0]);
        return W2.g.a();
    }
}
