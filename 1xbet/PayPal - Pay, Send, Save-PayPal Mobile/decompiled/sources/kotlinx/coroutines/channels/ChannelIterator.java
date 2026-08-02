package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003H¦B¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H\u0097@¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/channels/ChannelIterator;", "E", "", "", "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ChannelIterator<E> {
    java.lang.Object hasNext(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    E next();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
    /* synthetic */ java.lang.Object next(kotlin.coroutines.Continuation continuation);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ java.lang.Object next(kotlinx.coroutines.channels.ChannelIterator channelIterator, kotlin.coroutines.Continuation continuation) {
            kotlinx.coroutines.channels.ChannelIterator$next0$1 channelIterator$next0$1;
            java.lang.Object obj;
            int i;
            if (continuation instanceof kotlinx.coroutines.channels.ChannelIterator$next0$1) {
                channelIterator$next0$1 = (kotlinx.coroutines.channels.ChannelIterator$next0$1) continuation;
                if ((channelIterator$next0$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    channelIterator$next0$1.getHighSpeedVideoSizes -= 2147483648;
                    obj = channelIterator$next0$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = channelIterator$next0$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        channelIterator$next0$1.getHighResolutionOutputSizeshNQ4ISI = channelIterator;
                        channelIterator$next0$1.getHighSpeedVideoSizes = 1;
                        obj = channelIterator.hasNext(channelIterator$next0$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelIterator$next0$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        throw new kotlinx.coroutines.channels.ClosedReceiveChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE);
                    }
                    return channelIterator.next();
                }
            }
            channelIterator$next0$1 = new kotlinx.coroutines.channels.ChannelIterator$next0$1(continuation);
            obj = channelIterator$next0$1.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = channelIterator$next0$1.getHighSpeedVideoSizes;
            if (i != 0) {
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
        }
    }
}
