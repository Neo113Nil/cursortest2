package androidx.room.coroutines;

import com.neptunesoft.bacdz.QuizContract;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConnectionPoolImpl.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", i = {0, 0, 0}, l = {562}, m = "beginTransaction", n = {"this", QuizContract.QuestionTable.COLUMN_TYPE, "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes.dex */
final class PooledConnectionImpl$beginTransaction$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PooledConnectionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$beginTransaction$1(PooledConnectionImpl pooledConnectionImpl, Continuation<? super PooledConnectionImpl$beginTransaction$1> continuation) {
        super(continuation);
        this.this$0 = pooledConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object beginTransaction;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        beginTransaction = this.this$0.beginTransaction(null, this);
        return beginTransaction;
    }
}
