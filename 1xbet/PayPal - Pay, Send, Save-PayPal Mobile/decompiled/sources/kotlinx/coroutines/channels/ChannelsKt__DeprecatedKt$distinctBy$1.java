package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {417, 418, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING}, m = "invokeSuspend", n = {"$this$produce", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "$this$produce", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "e", "$this$produce", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
/* loaded from: classes3.dex */
final class ChannelsKt__DeprecatedKt$distinctBy$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0076, code lost:
    
        if (r11 == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerScope] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00a0 -> B:8:0x00bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b6 -> B:7:0x00b7). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        java.util.HashSet hashSet;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        ?? r7;
        java.util.HashSet hashSet2;
        kotlinx.coroutines.channels.ChannelIterator<E> channelIterator;
        java.lang.Object obj2;
        java.lang.Object obj3;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
            java.util.HashSet hashSet3 = new java.util.HashSet();
            producerScope = producerScope4;
            hashSet = hashSet3;
            it = this.Camera2StreamConfigurationMap.iterator();
            this.getOutputMinFrameDuration = producerScope;
            this.getHighResolutionOutputSizeshNQ4ISI = hashSet;
            this.getHighSpeedVideoSizes = it;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getInputSizeshNQ4ISI = 1;
            obj = it.hasNext(this);
        } else {
            if (i == 1) {
                it = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
                hashSet = (java.util.HashSet) this.getHighResolutionOutputSizeshNQ4ISI;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    E next = it.next();
                    kotlin.jvm.functions.Function2 function2 = this.getHighSpeedVideoFpsRanges;
                    this.getOutputMinFrameDuration = producerScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = hashSet;
                    this.getHighSpeedVideoSizes = it;
                    this.getHighSpeedVideoFpsRangesFor = next;
                    this.getInputSizeshNQ4ISI = 2;
                    java.lang.Object invoke = function2.invoke(next, this);
                    if (invoke != coroutine_suspended) {
                        kotlinx.coroutines.channels.ChannelIterator<E> channelIterator2 = it;
                        obj2 = next;
                        obj = invoke;
                        r7 = producerScope;
                        hashSet2 = hashSet;
                        channelIterator = channelIterator2;
                        producerScope2 = r7;
                        if (!hashSet2.contains(obj)) {
                        }
                        it = channelIterator;
                        hashSet = hashSet2;
                        producerScope = producerScope2;
                        this.getOutputMinFrameDuration = producerScope;
                        this.getHighResolutionOutputSizeshNQ4ISI = hashSet;
                        this.getHighSpeedVideoSizes = it;
                        this.getHighSpeedVideoFpsRangesFor = null;
                        this.getInputSizeshNQ4ISI = 1;
                        obj = it.hasNext(this);
                    }
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
            if (i == 2) {
                obj2 = this.getHighSpeedVideoFpsRangesFor;
                channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
                hashSet2 = (java.util.HashSet) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.channels.ProducerScope producerScope5 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                r7 = producerScope5;
                producerScope2 = r7;
                if (!hashSet2.contains(obj)) {
                    this.getOutputMinFrameDuration = r7;
                    this.getHighResolutionOutputSizeshNQ4ISI = hashSet2;
                    this.getHighSpeedVideoSizes = channelIterator;
                    this.getHighSpeedVideoFpsRangesFor = obj;
                    this.getInputSizeshNQ4ISI = 3;
                    if (r7.send(obj2, this) != coroutine_suspended) {
                        obj3 = obj;
                        producerScope3 = r7;
                        hashSet2.add(obj3);
                        producerScope2 = producerScope3;
                    }
                    return coroutine_suspended;
                }
                it = channelIterator;
                hashSet = hashSet2;
                producerScope = producerScope2;
                this.getOutputMinFrameDuration = producerScope;
                this.getHighResolutionOutputSizeshNQ4ISI = hashSet;
                this.getHighSpeedVideoSizes = it;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getInputSizeshNQ4ISI = 1;
                obj = it.hasNext(this);
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj3 = this.getHighSpeedVideoFpsRangesFor;
                channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.getHighSpeedVideoSizes;
                hashSet2 = (java.util.HashSet) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlinx.coroutines.channels.ProducerScope producerScope6 = (kotlinx.coroutines.channels.ProducerScope) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope3 = producerScope6;
                hashSet2.add(obj3);
                producerScope2 = producerScope3;
                it = channelIterator;
                hashSet = hashSet2;
                producerScope = producerScope2;
                this.getOutputMinFrameDuration = producerScope;
                this.getHighResolutionOutputSizeshNQ4ISI = hashSet;
                this.getHighSpeedVideoSizes = it;
                this.getHighSpeedVideoFpsRangesFor = null;
                this.getInputSizeshNQ4ISI = 1;
                obj = it.hasNext(this);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1) create((kotlinx.coroutines.channels.ProducerScope) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        channelsKt__DeprecatedKt$distinctBy$1.getOutputMinFrameDuration = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$distinctBy$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = receiveChannel;
        this.getHighSpeedVideoFpsRanges = function2;
    }
}
