package De;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import xe.Y0;

/* loaded from: classes.dex */
public final /* synthetic */ class E implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Y0 y02 = (Y0) obj;
        CoroutineContext.Element element = (CoroutineContext.Element) obj2;
        if (y02 != null) {
            return y02;
        }
        if (element instanceof Y0) {
            return (Y0) element;
        }
        return null;
    }
}
