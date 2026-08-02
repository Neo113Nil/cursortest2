package androidx.compose.runtime;

import androidx.work.impl.model.RawWorkInfoDao_Impl;
import io.flutter.plugin.common.BasicMessageChannel;
import java.util.HashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ J(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit component2$lambda$6;
        Unit lambda$__fetchRelationshipWorkTagAsjavaLangString$0;
        switch (this.a) {
            case 0:
                component2$lambda$6 = SnapshotMutableStateImpl.component2$lambda$6((SnapshotMutableStateImpl) this.b, obj);
                return component2$lambda$6;
            case 1:
                lambda$__fetchRelationshipWorkTagAsjavaLangString$0 = ((RawWorkInfoDao_Impl) this.b).lambda$__fetchRelationshipWorkTagAsjavaLangString$0((HashMap) obj);
                return lambda$__fetchRelationshipWorkTagAsjavaLangString$0;
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
