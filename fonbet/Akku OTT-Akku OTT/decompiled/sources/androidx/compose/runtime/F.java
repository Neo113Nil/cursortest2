package androidx.compose.runtime;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult$groups$1;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ F(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit component2$lambda$4;
        MatchGroup matchGroup;
        switch (this.a) {
            case 0:
                component2$lambda$4 = SnapshotMutableDoubleStateImpl.component2$lambda$4((SnapshotMutableDoubleStateImpl) this.b, ((Double) obj).doubleValue());
                return component2$lambda$4;
            default:
                matchGroup = ((MatcherMatchResult$groups$1) this.b).get(((Integer) obj).intValue());
                return matchGroup;
        }
    }
}
