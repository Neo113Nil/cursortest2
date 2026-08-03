package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {211, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
final class ChannelsKt__DeprecatedKt$dropWhile$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_dropWhile;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$dropWhile$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1> continuation) {
        super(2, continuation);
        this.$this_dropWhile = receiveChannel;
        this.$predicate = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1(this.$this_dropWhile, this.$predicate, continuation);
        channelsKt__DeprecatedKt$dropWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00f8 -> B:9:0x0023). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00a2 -> B:28:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlinx.coroutines.channels.ChannelIterator<E> it2;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        kotlinx.coroutines.channels.ChannelIterator<E> channelIterator;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            it = this.$this_dropWhile.iterator();
            producerScope = producerScope4;
            this.L$0 = producerScope;
            this.L$1 = it;
            this.L$2 = null;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
            }
            kotlinx.coroutines.channels.ProducerScope producerScope5 = producerScope;
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator2 = it;
            producerScope2 = producerScope5;
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
            it2 = this.$this_dropWhile.iterator();
            this.L$0 = producerScope2;
            this.L$1 = it2;
            this.label = 4;
            hasNext = it2.hasNext(this);
            if (hasNext == coroutine_suspended) {
            }
        } else if (i == 1) {
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope52 = producerScope;
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator22 = it;
            producerScope2 = producerScope52;
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
            it2 = this.$this_dropWhile.iterator();
            this.L$0 = producerScope2;
            this.L$1 = it2;
            this.label = 4;
            hasNext = it2.hasNext(this);
            if (hasNext == coroutine_suspended) {
            }
        } else if (i == 2) {
            java.lang.Object obj2 = this.L$2;
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator3 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope6 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator4 = channelIterator3;
            E e = obj2;
            it = channelIterator4;
            if (((java.lang.Boolean) obj).booleanValue()) {
                this.L$0 = producerScope6;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                if (producerScope6.send(e, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope2 = producerScope6;
                it2 = this.$this_dropWhile.iterator();
                this.L$0 = producerScope2;
                this.L$1 = it2;
                this.label = 4;
                hasNext = it2.hasNext(this);
                if (hasNext == coroutine_suspended) {
                }
            } else {
                producerScope = producerScope6;
                this.L$0 = producerScope;
                this.L$1 = it;
                this.L$2 = null;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                kotlinx.coroutines.channels.ProducerScope producerScope522 = producerScope;
                kotlinx.coroutines.channels.ChannelIterator<E> channelIterator222 = it;
                producerScope2 = producerScope522;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    E next = channelIterator222.next();
                    kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.$predicate;
                    this.L$0 = producerScope2;
                    this.L$1 = channelIterator222;
                    this.L$2 = next;
                    this.label = 2;
                    java.lang.Object invoke = function2.invoke(next, this);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channelIterator4 = channelIterator222;
                    e = next;
                    obj = invoke;
                    producerScope6 = producerScope2;
                    it = channelIterator4;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                    }
                }
                it2 = this.$this_dropWhile.iterator();
                this.L$0 = producerScope2;
                this.L$1 = it2;
                this.label = 4;
                hasNext = it2.hasNext(this);
                if (hasNext == coroutine_suspended) {
                }
            }
        } else if (i == 3) {
            producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            it2 = this.$this_dropWhile.iterator();
            this.L$0 = producerScope2;
            this.L$1 = it2;
            this.label = 4;
            hasNext = it2.hasNext(this);
            if (hasNext == coroutine_suspended) {
            }
        } else if (i == 4) {
            channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            if (!((java.lang.Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 5) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            it2 = channelIterator;
            producerScope2 = producerScope3;
            this.L$0 = producerScope2;
            this.L$1 = it2;
            this.label = 4;
            hasNext = it2.hasNext(this);
            if (hasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            kotlinx.coroutines.channels.ProducerScope producerScope7 = producerScope2;
            channelIterator = it2;
            obj = hasNext;
            producerScope3 = producerScope7;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                this.L$0 = producerScope3;
                this.L$1 = channelIterator;
                this.label = 5;
                if (producerScope3.send(channelIterator.next(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                it2 = channelIterator;
                producerScope2 = producerScope3;
                this.L$0 = producerScope2;
                this.L$1 = it2;
                this.label = 4;
                hasNext = it2.hasNext(this);
                if (hasNext == coroutine_suspended) {
                }
            } else {
                return kotlin.Unit.INSTANCE;
            }
        }
    }
}
