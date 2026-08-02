package androidx.compose.runtime.snapshots;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.AbstractC1099m0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit _init_$lambda$2;
        switch (this.a) {
            case 0:
                _init_$lambda$2 = GlobalSnapshot._init_$lambda$2(obj);
                return _init_$lambda$2;
            default:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof AbstractC1099m0) {
                    return (AbstractC1099m0) element;
                }
                return null;
        }
    }
}
