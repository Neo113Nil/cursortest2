package androidx.datastore.core;

import androidx.datastore.core.Message;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.K;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/K;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$handleUpdate$2$1", f = "DataStoreImpl.kt", i = {}, l = {256, 262, 265}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
public final class DataStoreImpl$handleUpdate$2$1<T> extends SuspendLambda implements Function2<K, Continuation<? super T>, Object> {
    final /* synthetic */ DataStoreImpl<T> $this_runCatching;
    final /* synthetic */ Message.Update<T> $update;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$handleUpdate$2$1(DataStoreImpl<T> dataStoreImpl, Message.Update<T> update, Continuation<? super DataStoreImpl$handleUpdate$2$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = dataStoreImpl;
        this.$update = update;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataStoreImpl$handleUpdate$2$1(this.$this_runCatching, this.$update, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r6 == r0) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object readAndInitOrPropagateAndThrowFailure;
        Object transformAndWrite;
        Object transformAndWrite2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            State<T> currentState = ((DataStoreImpl) this.$this_runCatching).inMemoryCache.getCurrentState();
            if (currentState instanceof Data) {
                DataStoreImpl<T> dataStoreImpl = this.$this_runCatching;
                Function2<T, Continuation<? super T>, Object> transform = this.$update.getTransform();
                CoroutineContext callerContext = this.$update.getCallerContext();
                this.label = 1;
                transformAndWrite = dataStoreImpl.transformAndWrite(transform, callerContext, this);
                if (transformAndWrite != coroutine_suspended) {
                    return transformAndWrite;
                }
            } else {
                if (!(currentState instanceof ReadException) && !(currentState instanceof UnInitialized)) {
                    if (currentState instanceof Final) {
                        throw ((Final) currentState).getFinalException();
                    }
                    if (currentState instanceof NoValueDataState) {
                        throw new IllegalStateException(DataStoreImpl.BUG_MESSAGE);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (currentState != this.$update.getLastState()) {
                    throw ((ReadException) currentState).getReadException();
                }
                DataStoreImpl<T> dataStoreImpl2 = this.$this_runCatching;
                this.label = 2;
                readAndInitOrPropagateAndThrowFailure = dataStoreImpl2.readAndInitOrPropagateAndThrowFailure(this);
            }
        }
        if (i == 1) {
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        if (i != 2) {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        DataStoreImpl<T> dataStoreImpl3 = this.$this_runCatching;
        Function2<T, Continuation<? super T>, Object> transform2 = this.$update.getTransform();
        CoroutineContext callerContext2 = this.$update.getCallerContext();
        this.label = 3;
        transformAndWrite2 = dataStoreImpl3.transformAndWrite(transform2, callerContext2, this);
        return transformAndWrite2 == coroutine_suspended ? coroutine_suspended : transformAndWrite2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super T> continuation) {
        return ((DataStoreImpl$handleUpdate$2$1) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
