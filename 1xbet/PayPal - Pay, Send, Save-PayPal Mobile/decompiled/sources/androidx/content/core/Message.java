package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f"}, d2 = {"Landroidx/datastore/core/Message;", "T", "", "<init>", "()V", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "lastState", "Read", "Update", "Landroidx/datastore/core/Message$Read;", "Landroidx/datastore/core/Message$Update;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Message<T> {
    public abstract androidx.content.core.State<T> getLastState();

    private Message() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/datastore/core/Message$Read;", "T", "Landroidx/datastore/core/Message;", "Landroidx/datastore/core/State;", "lastState", "<init>", "(Landroidx/datastore/core/State;)V", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Read<T> extends androidx.content.core.Message<T> {
        private final androidx.content.core.State<T> lastState;

        public Read(androidx.content.core.State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.content.core.Message
        public final androidx.content.core.State<T> getLastState() {
            return this.lastState;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002BV\u0012'\u0010\u0007\u001a#\b\u0001\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR8\u0010\u0007\u001a#\b\u0001\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/datastore/core/Message$Update;", "T", "Landroidx/datastore/core/Message;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "transform", "Lkotlinx/coroutines/CompletableDeferred;", "ack", "Landroidx/datastore/core/State;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/CompletableDeferred;Landroidx/datastore/core/State;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/jvm/functions/Function2;", "getTransform", "()Lkotlin/jvm/functions/Function2;", "Lkotlinx/coroutines/CompletableDeferred;", "getAck", "()Lkotlinx/coroutines/CompletableDeferred;", "Landroidx/datastore/core/State;", "getLastState", "()Landroidx/datastore/core/State;", "Lkotlin/coroutines/CoroutineContext;", "getCallerContext", "()Lkotlin/coroutines/CoroutineContext;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Update<T> extends androidx.content.core.Message<T> {
        private final kotlinx.coroutines.CompletableDeferred<T> ack;
        private final kotlin.coroutines.CoroutineContext callerContext;
        private final androidx.content.core.State<T> lastState;
        private final kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Update(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlinx.coroutines.CompletableDeferred<T> completableDeferred, androidx.content.core.State<T> state, kotlin.coroutines.CoroutineContext coroutineContext) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completableDeferred, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
            this.transform = function2;
            this.ack = completableDeferred;
            this.lastState = state;
            this.callerContext = coroutineContext;
        }

        public final kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getTransform() {
            return this.transform;
        }

        public final kotlinx.coroutines.CompletableDeferred<T> getAck() {
            return this.ack;
        }

        @Override // androidx.content.core.Message
        public final androidx.content.core.State<T> getLastState() {
            return this.lastState;
        }

        public final kotlin.coroutines.CoroutineContext getCallerContext() {
            return this.callerContext;
        }
    }

    public /* synthetic */ Message(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
