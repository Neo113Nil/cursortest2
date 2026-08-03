package io.ktor.network.selector;

/* compiled from: SelectorManagerSupport.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\b&\u0018\u00002\u00020\u0001:\u00018B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H$¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0004¢\u0006\u0004\b \u0010!J!\u0010 \u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0004¢\u0006\u0004\b \u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010/\u001a\u00020(8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b/\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R,\u00107\u001a\u0004\u0018\u00010\u0004*\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00069"}, d2 = {"Lio/ktor/network/selector/SelectorManagerSupport;", "Lio/ktor/network/selector/SelectorManager;", "<init>", "()V", "Lio/ktor/network/selector/Selectable;", "selectable", "", "publishInterest", "(Lio/ktor/network/selector/Selectable;)V", "Lio/ktor/network/selector/SelectInterest;", "interest", "select", "(Lio/ktor/network/selector/Selectable;Lio/ktor/network/selector/SelectInterest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Ljava/nio/channels/SelectionKey;", "selectedKeys", "", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "handleSelectedKeys", "(Ljava/util/Set;Ljava/util/Set;)V", com.ironsource.X3.i.W, "handleSelectedKey", "(Ljava/nio/channels/SelectionKey;)V", "Ljava/nio/channels/Selector;", "selector", "applyInterest", "(Ljava/nio/channels/Selector;Lio/ktor/network/selector/Selectable;)V", com.helpshift.HelpshiftEvent.DATA_MESSAGE_TYPE_ATTACHMENT, "notifyClosedImpl", "(Ljava/nio/channels/Selector;Ljava/nio/channels/SelectionKey;Lio/ktor/network/selector/Selectable;)V", "", "cause", "cancelAllSuspensions", "(Lio/ktor/network/selector/Selectable;Ljava/lang/Throwable;)V", "(Ljava/nio/channels/Selector;Ljava/lang/Throwable;)V", "Ljava/nio/channels/spi/SelectorProvider;", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Ljava/nio/channels/spi/SelectorProvider;", "getProvider", "()Ljava/nio/channels/spi/SelectorProvider;", "", "pending", "I", "getPending", "()I", "setPending", "(I)V", com.facebook.internal.AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "getCancelled", "setCancelled", "newValue", "getSubject", "(Ljava/nio/channels/SelectionKey;)Lio/ktor/network/selector/Selectable;", "setSubject", "(Ljava/nio/channels/SelectionKey;Lio/ktor/network/selector/Selectable;)V", "subject", "ClosedSelectorCancellationException", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SelectorManagerSupport implements io.ktor.network.selector.SelectorManager {
    private int cancelled;
    private int pending;
    private final java.nio.channels.spi.SelectorProvider provider;

    protected abstract void publishInterest(io.ktor.network.selector.Selectable selectable);

    public SelectorManagerSupport() {
        java.nio.channels.spi.SelectorProvider provider = java.nio.channels.spi.SelectorProvider.provider();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(provider, "provider(...)");
        this.provider = provider;
    }

    @Override // io.ktor.network.selector.SelectorManager
    public final java.nio.channels.spi.SelectorProvider getProvider() {
        return this.provider;
    }

    protected final int getPending() {
        return this.pending;
    }

    protected final void setPending(int i) {
        this.pending = i;
    }

    protected final int getCancelled() {
        return this.cancelled;
    }

    protected final void setCancelled(int i) {
        this.cancelled = i;
    }

    @Override // io.ktor.network.selector.SelectorManager
    public final java.lang.Object select(io.ktor.network.selector.Selectable selectable, io.ktor.network.selector.SelectInterest selectInterest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        int i = selectable.get_interestedOps();
        int flag = selectInterest.getFlag();
        if (selectable.isClosed()) {
            io.ktor.network.selector.SelectorManagerSupportKt.selectableIsClosed();
            throw new kotlin.KotlinNothingValueException();
        }
        if ((i & flag) == 0) {
            io.ktor.network.selector.SelectorManagerSupportKt.selectableIsInvalid(i, flag);
            throw new kotlin.KotlinNothingValueException();
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: io.ktor.network.selector.SelectorManagerSupport$select$2$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }
        });
        selectable.getSuspensions().addSuspension(selectInterest, cancellableContinuationImpl2);
        if (!cancellableContinuationImpl2.isCancelled()) {
            publishInterest(selectable);
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    protected final void handleSelectedKeys(java.util.Set<java.nio.channels.SelectionKey> selectedKeys, java.util.Set<? extends java.nio.channels.SelectionKey> keys) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedKeys, "selectedKeys");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keys, "keys");
        int size = selectedKeys.size();
        this.pending = keys.size() - size;
        this.cancelled = 0;
        if (size <= 0) {
            return;
        }
        java.util.Iterator<java.nio.channels.SelectionKey> it = selectedKeys.iterator();
        while (it.hasNext()) {
            handleSelectedKey(it.next());
            it.remove();
        }
    }

    protected final void handleSelectedKey(java.nio.channels.SelectionKey key) {
        kotlinx.coroutines.CancellableContinuation<kotlin.Unit> removeSuspension;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        try {
            int readyOps = key.readyOps();
            int interestOps = key.interestOps();
            io.ktor.network.selector.Selectable subject = getSubject(key);
            if (subject == null) {
                key.cancel();
                this.cancelled++;
                return;
            }
            io.ktor.network.selector.InterestSuspensionsMap suspensions = subject.getSuspensions();
            int[] flags = io.ktor.network.selector.SelectInterest.INSTANCE.getFlags();
            int length = flags.length;
            for (int i = 0; i < length; i++) {
                if ((flags[i] & readyOps) != 0 && (removeSuspension = suspensions.removeSuspension(i)) != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    removeSuspension.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
                }
            }
            int i2 = (~readyOps) & interestOps;
            if (i2 != interestOps) {
                key.interestOps(i2);
            }
            if (i2 != 0) {
                this.pending++;
            }
        } catch (java.lang.Throwable th) {
            key.cancel();
            this.cancelled++;
            io.ktor.network.selector.Selectable subject2 = getSubject(key);
            if (subject2 != null) {
                cancelAllSuspensions(subject2, th);
                setSubject(key, null);
            }
        }
    }

    protected final void applyInterest(java.nio.channels.Selector selector, io.ktor.network.selector.Selectable selectable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectable, "selectable");
        try {
            java.nio.channels.SelectableChannel channel = selectable.getChannel();
            java.nio.channels.SelectionKey keyFor = channel.keyFor(selector);
            int i = selectable.get_interestedOps();
            if (keyFor == null) {
                if (i != 0) {
                    channel.register(selector, i, selectable);
                }
            } else if (keyFor.interestOps() != i) {
                keyFor.interestOps(i);
            }
            if (i != 0) {
                this.pending++;
            }
        } catch (java.lang.Throwable th) {
            java.nio.channels.SelectionKey keyFor2 = selectable.getChannel().keyFor(selector);
            if (keyFor2 != null) {
                keyFor2.cancel();
            }
            cancelAllSuspensions(selectable, th);
        }
    }

    protected final void notifyClosedImpl(java.nio.channels.Selector selector, java.nio.channels.SelectionKey key, io.ktor.network.selector.Selectable attachment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attachment, "attachment");
        cancelAllSuspensions(attachment, new java.nio.channels.ClosedChannelException());
        setSubject(key, null);
        selector.wakeup();
    }

    protected final void cancelAllSuspensions(io.ktor.network.selector.Selectable attachment, java.lang.Throwable cause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attachment, "attachment");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
        io.ktor.network.selector.InterestSuspensionsMap suspensions = attachment.getSuspensions();
        for (io.ktor.network.selector.SelectInterest selectInterest : io.ktor.network.selector.SelectInterest.INSTANCE.getAllInterests()) {
            kotlinx.coroutines.CancellableContinuation<kotlin.Unit> removeSuspension = suspensions.removeSuspension(selectInterest);
            if (removeSuspension != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                removeSuspension.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(cause)));
            }
        }
    }

    protected final void cancelAllSuspensions(java.nio.channels.Selector selector, java.lang.Throwable cause) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (cause == null) {
            cause = new io.ktor.network.selector.SelectorManagerSupport.ClosedSelectorCancellationException();
        }
        java.util.Set<java.nio.channels.SelectionKey> keys = selector.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        for (java.nio.channels.SelectionKey selectionKey : keys) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (java.nio.channels.CancelledKeyException unused) {
            }
            java.lang.Object attachment = selectionKey.attachment();
            io.ktor.network.selector.Selectable selectable = attachment instanceof io.ktor.network.selector.Selectable ? (io.ktor.network.selector.Selectable) attachment : null;
            if (selectable != null) {
                cancelAllSuspensions(selectable, cause);
            }
            selectionKey.cancel();
        }
    }

    private final io.ktor.network.selector.Selectable getSubject(java.nio.channels.SelectionKey selectionKey) {
        java.lang.Object attachment = selectionKey.attachment();
        if (attachment instanceof io.ktor.network.selector.Selectable) {
            return (io.ktor.network.selector.Selectable) attachment;
        }
        return null;
    }

    private final void setSubject(java.nio.channels.SelectionKey selectionKey, io.ktor.network.selector.Selectable selectable) {
        selectionKey.attach(selectable);
    }

    /* compiled from: SelectorManagerSupport.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/network/selector/SelectorManagerSupport$ClosedSelectorCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "<init>", "()V", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClosedSelectorCancellationException extends java.util.concurrent.CancellationException {
        public ClosedSelectorCancellationException() {
            super("Closed selector");
        }
    }
}
