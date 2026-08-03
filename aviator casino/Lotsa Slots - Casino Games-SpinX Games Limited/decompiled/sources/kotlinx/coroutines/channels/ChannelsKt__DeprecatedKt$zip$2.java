package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {514, 499, com.ironsource.mediationsdk.logger.IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
/* loaded from: classes6.dex */
final class ChannelsKt__DeprecatedKt$zip$2<V> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super V>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<R> $other;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_zip;
    final /* synthetic */ kotlin.jvm.functions.Function2<E, R, V> $transform;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$zip$2(kotlinx.coroutines.channels.ReceiveChannel<? extends R> receiveChannel, kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2> continuation) {
        super(2, continuation);
        this.$other = receiveChannel;
        this.$this_zip = receiveChannel2;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2(this.$other, this.$this_zip, this.$transform, continuation);
        channelsKt__DeprecatedKt$zip$2.L$0 = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super V> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        r14 = r7;
        r6 = r8;
        r7 = r9;
        r8 = r10;
        r9 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b8 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #3 {all -> 0x0057, blocks: (B:15:0x00b0, B:17:0x00b8, B:39:0x0109, B:50:0x004a), top: B:49:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3 A[Catch: all -> 0x0106, TRY_LEAVE, TryCatch #2 {all -> 0x0106, blocks: (B:23:0x00db, B:25:0x00e3), top: B:22:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109 A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0057, blocks: (B:15:0x00b0, B:17:0x00b8, B:39:0x0109, B:50:0x004a), top: B:49:0x004a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel;
        kotlin.jvm.functions.Function2 function2;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator2;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator3;
        kotlin.jvm.functions.Function2 function22;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        java.lang.Throwable th2;
        java.lang.Object obj2;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        kotlinx.coroutines.channels.ChannelIterator channelIterator4;
        kotlin.jvm.functions.Function2 function23;
        kotlinx.coroutines.channels.ChannelIterator channelIterator5;
        java.lang.Throwable th3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ProducerScope producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlinx.coroutines.channels.ChannelIterator it2 = this.$other.iterator();
                receiveChannel = this.$this_zip;
                function2 = this.$transform;
                producerScope = producerScope4;
                th = null;
                channelIterator = it2;
                it = receiveChannel.iterator();
            } else if (i == 1) {
                kotlinx.coroutines.channels.ChannelIterator channelIterator6 = (kotlinx.coroutines.channels.ChannelIterator) this.L$4;
                kotlinx.coroutines.channels.ReceiveChannel receiveChannel4 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$3;
                kotlin.jvm.functions.Function2 function24 = (kotlin.jvm.functions.Function2) this.L$2;
                kotlinx.coroutines.channels.ChannelIterator channelIterator7 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
                kotlinx.coroutines.channels.ProducerScope producerScope5 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope3 = producerScope5;
                channelIterator4 = channelIterator7;
                function23 = function24;
                receiveChannel2 = receiveChannel4;
                channelIterator5 = channelIterator6;
                th3 = null;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object next = channelIterator5.next();
                    this.L$0 = producerScope3;
                    this.L$1 = channelIterator4;
                    this.L$2 = function23;
                    this.L$3 = receiveChannel2;
                    this.L$4 = channelIterator5;
                    this.L$5 = next;
                    this.label = 2;
                    java.lang.Object hasNext = channelIterator4.hasNext(this);
                    if (hasNext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channelIterator2 = channelIterator5;
                    obj2 = next;
                    obj = hasNext;
                    producerScope2 = producerScope3;
                    channelIterator3 = channelIterator4;
                    function22 = function23;
                    receiveChannel3 = receiveChannel2;
                    th2 = th3;
                    it = channelIterator2;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                    }
                    th = th2;
                    receiveChannel = receiveChannel3;
                    function2 = function22;
                    channelIterator = channelIterator3;
                    producerScope = producerScope2;
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th3);
                    return kotlin.Unit.INSTANCE;
                }
            } else if (i == 2) {
                java.lang.Object obj3 = this.L$5;
                kotlinx.coroutines.channels.ChannelIterator channelIterator8 = (kotlinx.coroutines.channels.ChannelIterator) this.L$4;
                receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$3;
                kotlin.jvm.functions.Function2 function25 = (kotlin.jvm.functions.Function2) this.L$2;
                kotlinx.coroutines.channels.ChannelIterator channelIterator9 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
                kotlinx.coroutines.channels.ProducerScope producerScope6 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    producerScope2 = producerScope6;
                    channelIterator3 = channelIterator9;
                    function22 = function25;
                    receiveChannel3 = receiveChannel2;
                    th2 = null;
                    channelIterator2 = channelIterator8;
                    obj2 = obj3;
                    it = channelIterator2;
                    try {
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            java.lang.Object invoke = function22.invoke(obj2, channelIterator3.next());
                            this.L$0 = producerScope2;
                            this.L$1 = channelIterator3;
                            this.L$2 = function22;
                            this.L$3 = receiveChannel3;
                            this.L$4 = it;
                            this.L$5 = null;
                            this.label = 3;
                            if (producerScope2.send(invoke, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        th = th2;
                        receiveChannel = receiveChannel3;
                        function2 = function22;
                        channelIterator = channelIterator3;
                        producerScope = producerScope2;
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        receiveChannel = receiveChannel3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th5) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
                            throw th5;
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    receiveChannel = receiveChannel2;
                    throw th;
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (kotlinx.coroutines.channels.ChannelIterator) this.L$4;
                receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) this.L$3;
                function2 = (kotlin.jvm.functions.Function2) this.L$2;
                channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                th = null;
            }
            this.L$0 = producerScope;
            this.L$1 = channelIterator;
            this.L$2 = function2;
            this.L$3 = receiveChannel;
            this.L$4 = it;
            this.L$5 = null;
            this.label = 1;
            java.lang.Object hasNext2 = it.hasNext(this);
            if (hasNext2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            kotlinx.coroutines.channels.ChannelIterator channelIterator10 = it;
            th3 = th;
            obj = hasNext2;
            producerScope3 = producerScope;
            channelIterator4 = channelIterator;
            function23 = function2;
            receiveChannel2 = receiveChannel;
            channelIterator5 = channelIterator10;
            if (!((java.lang.Boolean) obj).booleanValue()) {
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
