package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {417, 418, 420}, m = "invokeSuspend", n = {"$this$produce", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "$this$produce", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "e", "$this$produce", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
/* loaded from: classes6.dex */
final class ChannelsKt__DeprecatedKt$distinctBy$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> $selector;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_distinctBy;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelsKt__DeprecatedKt$distinctBy$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super K>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1> continuation) {
        super(2, continuation);
        this.$this_distinctBy = receiveChannel;
        this.$selector = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1 channelsKt__DeprecatedKt$distinctBy$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1(this.$this_distinctBy, this.$selector, continuation);
        channelsKt__DeprecatedKt$distinctBy$1.L$0 = obj;
        return channelsKt__DeprecatedKt$distinctBy$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a4 -> B:8:0x00c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00ba -> B:7:0x00bc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        java.util.HashSet hashSet;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.util.HashSet hashSet2;
        E e;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            java.util.HashSet hashSet3 = new java.util.HashSet();
            producerScope = producerScope3;
            hashSet = hashSet3;
            it = this.$this_distinctBy.iterator();
            this.L$0 = producerScope;
            this.L$1 = hashSet;
            this.L$2 = it;
            this.L$3 = null;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
        } else if (i == 1) {
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$2;
            hashSet = (java.util.HashSet) this.L$1;
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
        } else if (i == 2) {
            java.lang.Object obj2 = this.L$3;
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$2;
            hashSet2 = (java.util.HashSet) this.L$1;
            producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            e = obj2;
            it = channelIterator;
            if (!hashSet2.contains(obj)) {
            }
            hashSet = hashSet2;
            producerScope = producerScope2;
            this.L$0 = producerScope;
            this.L$1 = hashSet;
            this.L$2 = it;
            this.L$3 = null;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
        } else {
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = this.L$3;
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) this.L$2;
            hashSet2 = (java.util.HashSet) this.L$1;
            producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            hashSet2.add(obj3);
            it = channelIterator2;
            hashSet = hashSet2;
            producerScope = producerScope2;
            this.L$0 = producerScope;
            this.L$1 = hashSet;
            this.L$2 = it;
            this.L$3 = null;
            this.label = 1;
            obj = it.hasNext(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                E next = it.next();
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super K>, java.lang.Object> function2 = this.$selector;
                this.L$0 = producerScope;
                this.L$1 = hashSet;
                this.L$2 = it;
                this.L$3 = next;
                this.label = 2;
                java.lang.Object invoke = function2.invoke(next, this);
                if (invoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                java.util.HashSet hashSet4 = hashSet;
                e = next;
                obj = invoke;
                producerScope2 = producerScope;
                hashSet2 = hashSet4;
                if (!hashSet2.contains(obj)) {
                    this.L$0 = producerScope2;
                    this.L$1 = hashSet2;
                    this.L$2 = it;
                    this.L$3 = obj;
                    this.label = 3;
                    if (producerScope2.send(e, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channelIterator2 = it;
                    obj3 = obj;
                    hashSet2.add(obj3);
                    it = channelIterator2;
                }
                hashSet = hashSet2;
                producerScope = producerScope2;
                this.L$0 = producerScope;
                this.L$1 = hashSet;
                this.L$2 = it;
                this.L$3 = null;
                this.label = 1;
                obj = it.hasNext(this);
                if (obj == coroutine_suspended) {
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }
}
