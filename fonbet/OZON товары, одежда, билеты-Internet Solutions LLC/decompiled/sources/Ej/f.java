package Ej;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.ozonLogger.core.LogEntry;

/* loaded from: classes6.dex */
public final /* synthetic */ class f implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LogEntry it = (LogEntry) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.asJSONString();
    }
}
