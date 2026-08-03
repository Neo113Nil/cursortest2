package androidx.datastore.core;

/* compiled from: SimpleActor.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\n\u0012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n¢\u0006\u0002\u0010\rJ\u0013\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015R,\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/datastore/core/SimpleActor;", "T", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onComplete", "Lkotlin/Function1;", "", "", "onUndeliveredElement", "Lkotlin/Function2;", "consumeMessage", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "messageQueue", "Lkotlinx/coroutines/channels/Channel;", "remainingMessages", "Landroidx/datastore/core/AtomicInt;", "offer", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "(Ljava/lang/Object;)V", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SimpleActor<T> {
    private final kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> consumeMessage;
    private final kotlinx.coroutines.channels.Channel<T> messageQueue;
    private final androidx.datastore.core.AtomicInt remainingMessages;
    private final kotlinx.coroutines.CoroutineScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(kotlinx.coroutines.CoroutineScope scope, final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onComplete, final kotlin.jvm.functions.Function2<? super T, ? super java.lang.Throwable, kotlin.Unit> onUndeliveredElement, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> consumeMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new androidx.datastore.core.AtomicInt(0);
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) scope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            job.invokeOnCompletion(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.datastore.core.SimpleActor.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                    invoke2(th);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.Throwable th) {
                    kotlin.Unit unit;
                    onComplete.invoke(th);
                    ((androidx.datastore.core.SimpleActor) this).messageQueue.close(th);
                    do {
                        java.lang.Object m12323getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m12323getOrNullimpl(((androidx.datastore.core.SimpleActor) this).messageQueue.mo12311tryReceivePtdJZtk());
                        if (m12323getOrNullimpl != null) {
                            onUndeliveredElement.invoke(m12323getOrNullimpl, th);
                            unit = kotlin.Unit.INSTANCE;
                        } else {
                            unit = null;
                        }
                    } while (unit != null);
                }
            });
        }
    }

    public final void offer(T msg) {
        java.lang.Object obj = this.messageQueue.mo10716trySendJP2dKIU(msg);
        if (obj instanceof kotlinx.coroutines.channels.ChannelResult.Closed) {
            java.lang.Throwable m12322exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m12322exceptionOrNullimpl(obj);
            if (m12322exceptionOrNullimpl != null) {
                throw m12322exceptionOrNullimpl;
            }
            throw new kotlinx.coroutines.channels.ClosedSendChannelException("Channel was closed normally");
        }
        if (!kotlinx.coroutines.channels.ChannelResult.m12328isSuccessimpl(obj)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new androidx.datastore.core.SimpleActor$offer$2(this, null), 3, null);
        }
    }
}
