package androidx.compose.runtime;

import io.flutter.plugin.common.BasicMessageChannel;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ H(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit component2$lambda$4;
        switch (this.a) {
            case 0:
                component2$lambda$4 = SnapshotMutableIntStateImpl.component2$lambda$4((SnapshotMutableIntStateImpl) this.b, ((Integer) obj).intValue());
                return component2$lambda$4;
            default:
                BasicMessageChannel.Reply reply = (BasicMessageChannel.Reply) this.b;
                Result result = (Result) obj;
                Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result.getValue());
                if (m1719exceptionOrNullimpl != null) {
                    reply.reply(com.google.android.gms.common.p.a(m1719exceptionOrNullimpl));
                } else {
                    Object value = result.getValue();
                    if (Result.m1722isFailureimpl(value)) {
                        value = null;
                    }
                    reply.reply(CollectionsKt.listOf((String) value));
                }
                return Unit.INSTANCE;
        }
    }
}
