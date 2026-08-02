package De;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import xe.Y0;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        L l11 = (L) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (element instanceof Y0) {
            Y0<?> y02 = (Y0) element;
            l11.a(y02, y02.s0(l11.f6612a));
        }
        return l11;
    }
}
