package androidx.datastore.core;

import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        File lazySharedCounter$lambda$0$0;
        switch (this.a) {
            case 0:
                lazySharedCounter$lambda$0$0 = MultiProcessCoordinator.lazySharedCounter$lambda$0$0((MultiProcessCoordinator) this.b);
                return lazySharedCounter$lambda$0$0;
            default:
                return ((KType) ((List) this.b).get(0)).getClassifier();
        }
    }
}
