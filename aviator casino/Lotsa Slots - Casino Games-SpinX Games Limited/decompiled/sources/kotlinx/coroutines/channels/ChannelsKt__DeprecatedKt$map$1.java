package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {514, 363, 363}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
/* loaded from: classes6.dex */
final class ChannelsKt__DeprecatedKt$map$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_map;
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$map$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1> continuation) {
        super(2, continuation);
        this.$this_map = receiveChannel;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1(this.$this_map, this.$transform, continuation);
        channelsKt__DeprecatedKt$map$1.L$0 = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:8:0x0022, B:10:0x0076, B:15:0x008b, B:17:0x0093, B:34:0x00c9, B:45:0x005e, B:48:0x006e), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9 A[Catch: all -> 0x00d1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:8:0x0022, B:10:0x0076, B:15:0x008b, B:17:0x0093, B:34:0x00c9, B:45:0x005e, B:48:0x006e), top: B:2:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c3 -> B:10:0x0076). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        java.lang.Throwable th;
        kotlin.jvm.functions.Function2 function2;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Throwable th2;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlin.jvm.functions.Function2 function22;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        java.lang.Throwable th3;
        kotlinx.coroutines.channels.ProducerScope producerScope4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                receiveChannel = this.$this_map;
                th = null;
                function2 = this.$transform;
                it = receiveChannel.iterator();
            } else if (i == 1) {
                it = (kotlinx.coroutines.channels.ChannelIterator) this.L$3;
                receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) this.L$2;
                function2 = (kotlin.jvm.functions.Function2) this.L$1;
                producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                th3 = null;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object next = it.next();
                    this.L$0 = producerScope4;
                    this.L$1 = function2;
                    this.L$2 = receiveChannel;
                    this.L$3 = it;
                    this.L$4 = producerScope4;
                    this.label = 2;
                    obj = function2.invoke(next, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    th2 = th3;
                    producerScope2 = producerScope4;
                    function22 = function2;
                    receiveChannel2 = receiveChannel;
                    channelIterator = it;
                    producerScope3 = producerScope2;
                    this.L$0 = producerScope2;
                    this.L$1 = function22;
                    this.L$2 = receiveChannel2;
                    this.L$3 = channelIterator;
                    this.L$4 = null;
                    this.label = 3;
                    if (producerScope3.send(obj, this) != coroutine_suspended) {
                    }
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th3);
                    return kotlin.Unit.INSTANCE;
                }
            } else if (i == 2) {
                producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$4;
                channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$3;
                receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$2;
                function22 = (kotlin.jvm.functions.Function2) this.L$1;
                producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    th2 = null;
                    this.L$0 = producerScope2;
                    this.L$1 = function22;
                    this.L$2 = receiveChannel2;
                    this.L$3 = channelIterator;
                    this.L$4 = null;
                    this.label = 3;
                    if (producerScope3.send(obj, this) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it = channelIterator;
                    receiveChannel = receiveChannel2;
                    function2 = function22;
                    producerScope = producerScope2;
                    th = th2;
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    receiveChannel = receiveChannel2;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th5) {
                        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
                        throw th5;
                    }
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (kotlinx.coroutines.channels.ChannelIterator) this.L$3;
                receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) this.L$2;
                function2 = (kotlin.jvm.functions.Function2) this.L$1;
                kotlinx.coroutines.channels.ProducerScope producerScope5 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope = producerScope5;
                th = null;
            }
            this.L$0 = producerScope;
            this.L$1 = function2;
            this.L$2 = receiveChannel;
            this.L$3 = it;
            this.label = 1;
            java.lang.Object hasNext = it.hasNext(this);
            if (hasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            java.lang.Throwable th6 = th;
            producerScope4 = producerScope;
            obj = hasNext;
            th3 = th6;
            if (!((java.lang.Boolean) obj).booleanValue()) {
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
