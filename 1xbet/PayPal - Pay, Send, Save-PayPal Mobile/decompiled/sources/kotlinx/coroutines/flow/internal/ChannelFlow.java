package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0011\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0011\u0010\b\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\b\u0010%R6\u0010+\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140'\u0012\u0006\u0012\u0004\u0018\u00010(0&8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00058AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", "T", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlinx/coroutines/flow/Flow;", "dropChannelOperators", "()Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "create", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/channels/ProducerScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "", "collectTo", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "produceImpl", "(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "additionalToStringProps", "()Ljava/lang/String;", "toString", "Lkotlin/coroutines/CoroutineContext;", com.visa.cbp.getEncExpo.warmup, "Lkotlinx/coroutines/channels/BufferOverflow;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "getCollectToFun$kotlinx_coroutines_core", "()Lkotlin/jvm/functions/Function2;", "collectToFun", "getProduceCapacity$kotlinx_coroutines_core", "()I", "produceCapacity"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ChannelFlow<T> implements kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    public final int capacity;
    public final kotlin.coroutines.CoroutineContext context;
    public final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;

    protected java.lang.String additionalToStringProps() {
        return null;
    }

    protected abstract java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    protected abstract kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext context, int capacity, kotlinx.coroutines.channels.BufferOverflow onBufferOverflow);

    public kotlinx.coroutines.flow.Flow<T> dropChannelOperators() {
        return null;
    }

    public ChannelFlow(kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        this.context = coroutineContext;
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && i == -1) {
            throw new java.lang.AssertionError();
        }
    }

    public final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getCollectToFun$kotlinx_coroutines_core() {
        return new kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1(this, null);
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
        int i = this.capacity;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext context, int capacity, kotlinx.coroutines.channels.BufferOverflow onBufferOverflow) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && capacity == -1) {
            throw new java.lang.AssertionError();
        }
        kotlin.coroutines.CoroutineContext plus = context.plus(this.context);
        if (onBufferOverflow == kotlinx.coroutines.channels.BufferOverflow.SUSPEND) {
            int i = this.capacity;
            if (i != -3) {
                if (capacity != -3) {
                    if (i != -2) {
                        if (capacity != -2) {
                            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.capacity < 0) {
                                throw new java.lang.AssertionError();
                            }
                            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && capacity < 0) {
                                throw new java.lang.AssertionError();
                            }
                            i = this.capacity + capacity;
                            if (i < 0) {
                                capacity = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                capacity = i;
            }
            onBufferOverflow = this.onBufferOverflow;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(plus, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) {
            return this;
        }
        return create(plus, capacity, onBufferOverflow);
    }

    public kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(kotlinx.coroutines.CoroutineScope scope) {
        return kotlinx.coroutines.channels.ProduceKt.produce$default(scope, this.context, getProduceCapacity$kotlinx_coroutines_core(), this.onBufferOverflow, kotlinx.coroutines.CoroutineStart.ATOMIC, null, getCollectToFun$kotlinx_coroutines_core(), 16, null);
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        java.lang.String additionalToStringProps = additionalToStringProps();
        if (additionalToStringProps != null) {
            arrayList.add(additionalToStringProps);
        }
        if (this.context != kotlin.coroutines.EmptyCoroutineContext.INSTANCE) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("context=");
            sb.append(this.context);
            arrayList.add(sb.toString());
        }
        if (this.capacity != -3) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("capacity=");
            sb2.append(this.capacity);
            arrayList.add(sb2.toString());
        }
        if (this.onBufferOverflow != kotlinx.coroutines.channels.BufferOverflow.SUSPEND) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("onBufferOverflow=");
            sb3.append(this.onBufferOverflow);
            arrayList.add(sb3.toString());
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this));
        sb4.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        sb4.append(kotlin.collections.CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null));
        sb4.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb4.toString();
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new kotlinx.coroutines.flow.internal.ChannelFlow$collect$2(flowCollector, this, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }
}
