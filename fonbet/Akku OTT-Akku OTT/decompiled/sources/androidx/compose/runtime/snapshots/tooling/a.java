package androidx.compose.runtime.snapshots.tooling;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.android.d;
import kotlinx.coroutines.android.e;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit mergeObservers$lambda$6;
        switch (this.a) {
            case 0:
                mergeObservers$lambda$6 = SnapshotObserverKt.mergeObservers$lambda$6((Function1) this.b, (Function1) this.c, obj);
                return mergeObservers$lambda$6;
            default:
                e eVar = (e) this.b;
                eVar.a.removeCallbacks((d) this.c);
                return Unit.INSTANCE;
        }
    }
}
