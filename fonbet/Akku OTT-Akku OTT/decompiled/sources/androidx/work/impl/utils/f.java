package androidx.work.impl.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.internal.C1173y0;
import kotlinx.serialization.p;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long lambda$getLastCancelAllTimeMillisLiveData$0;
        switch (this.a) {
            case 0:
                lambda$getLastCancelAllTimeMillisLiveData$0 = PreferenceUtils.lambda$getLastCancelAllTimeMillisLiveData$0((Long) obj);
                return lambda$getLastCancelAllTimeMillisLiveData$0;
            default:
                KClass it = (KClass) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                kotlinx.serialization.b c = p.c(it);
                if (c == null) {
                    c = C1173y0.c(it) ? new kotlinx.serialization.f(it) : null;
                }
                if (c != null) {
                    return kotlinx.serialization.builtins.a.c(c);
                }
                return null;
        }
    }
}
