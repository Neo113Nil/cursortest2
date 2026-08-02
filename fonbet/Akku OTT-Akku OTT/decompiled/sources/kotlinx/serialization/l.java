package kotlinx.serialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.internal.C1173y0;

/* loaded from: classes5.dex */
public final /* synthetic */ class l implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KClass it = (KClass) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        b c = p.c(it);
        if (c != null) {
            return c;
        }
        if (C1173y0.c(it)) {
            return new f(it);
        }
        return null;
    }
}
