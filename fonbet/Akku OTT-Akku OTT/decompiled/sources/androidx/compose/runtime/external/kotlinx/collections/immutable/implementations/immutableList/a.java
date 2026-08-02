package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Collection collection) {
        this.b = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean retainAll$lambda$3;
        switch (this.a) {
            case 0:
                retainAll$lambda$3 = AbstractPersistentList.retainAll$lambda$3((Collection) this.b, obj);
                return Boolean.valueOf(retainAll$lambda$3);
            default:
                ((kotlinx.coroutines.sync.c) this.b).c(null);
                return Unit.INSTANCE;
        }
    }
}
