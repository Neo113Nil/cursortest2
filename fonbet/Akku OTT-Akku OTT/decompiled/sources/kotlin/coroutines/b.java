package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String string$lambda$0;
        string$lambda$0 = CombinedContext.toString$lambda$0((String) obj, (CoroutineContext.Element) obj2);
        return string$lambda$0;
    }
}
