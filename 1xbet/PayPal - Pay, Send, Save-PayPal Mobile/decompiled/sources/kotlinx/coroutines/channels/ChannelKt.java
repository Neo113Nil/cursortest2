package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aR\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\b\u0010\t\u001aV\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u000e\u0010\t\u001aX\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0010\u0010\t\u001aX\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012#\u0010\r\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\f0\u0002H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0011\u0010\t\u001aE\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019\"\u0004\b\u0000\u0010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001a\u0010\u001c"}, d2 = {"T", "Lkotlinx/coroutines/channels/ChannelResult;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "exception", "onFailure", "getOrElse-WpGqRn0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getOrElse", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "action", "onSuccess-WpGqRn0", "onSuccess", "onFailure-WpGqRn0", "onClosed-WpGqRn0", "onClosed", "E", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "onUndeliveredElement", "Lkotlinx/coroutines/channels/Channel;", "Channel", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/channels/Channel;", "(I)Lkotlinx/coroutines/channels/Channel;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChannelKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOrElse-WpGqRn0, reason: not valid java name */
    public static final <T> T m24075getOrElseWpGqRn0(java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends T> function1) {
        return obj instanceof kotlinx.coroutines.channels.ChannelResult.Failed ? function1.invoke(kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(obj)) : obj;
    }

    /* renamed from: onSuccess-WpGqRn0, reason: not valid java name */
    public static final <T> java.lang.Object m24078onSuccessWpGqRn0(java.lang.Object obj, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        if (!(obj instanceof kotlinx.coroutines.channels.ChannelResult.Failed)) {
            function1.invoke(obj);
        }
        return obj;
    }

    /* renamed from: onFailure-WpGqRn0, reason: not valid java name */
    public static final <T> java.lang.Object m24077onFailureWpGqRn0(java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1) {
        if (obj instanceof kotlinx.coroutines.channels.ChannelResult.Failed) {
            function1.invoke(kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(obj));
        }
        return obj;
    }

    /* renamed from: onClosed-WpGqRn0, reason: not valid java name */
    public static final <T> java.lang.Object m24076onClosedWpGqRn0(java.lang.Object obj, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1) {
        if (obj instanceof kotlinx.coroutines.channels.ChannelResult.Closed) {
            function1.invoke(kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(obj));
        }
        return obj;
    }

    public static /* synthetic */ kotlinx.coroutines.channels.Channel Channel$default(int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, kotlin.jvm.functions.Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = kotlinx.coroutines.channels.BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return Channel(i, bufferOverflow, function1);
    }

    public static final <E> kotlinx.coroutines.channels.Channel<E> Channel(int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1) {
        kotlinx.coroutines.channels.ConflatedBufferedChannel conflatedBufferedChannel;
        if (i == -2) {
            return bufferOverflow == kotlinx.coroutines.channels.BufferOverflow.SUSPEND ? new kotlinx.coroutines.channels.BufferedChannel<>(kotlinx.coroutines.channels.Channel.INSTANCE.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), function1) : new kotlinx.coroutines.channels.ConflatedBufferedChannel(1, bufferOverflow, function1);
        }
        if (i == -1) {
            if (bufferOverflow != kotlinx.coroutines.channels.BufferOverflow.SUSPEND) {
                throw new java.lang.IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            return new kotlinx.coroutines.channels.ConflatedBufferedChannel(1, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, function1);
        }
        if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new kotlinx.coroutines.channels.BufferedChannel(Integer.MAX_VALUE, function1);
            }
            return bufferOverflow == kotlinx.coroutines.channels.BufferOverflow.SUSPEND ? new kotlinx.coroutines.channels.BufferedChannel<>(i, function1) : new kotlinx.coroutines.channels.ConflatedBufferedChannel(i, bufferOverflow, function1);
        }
        if (bufferOverflow == kotlinx.coroutines.channels.BufferOverflow.SUSPEND) {
            conflatedBufferedChannel = new kotlinx.coroutines.channels.BufferedChannel<>(0, function1);
        } else {
            conflatedBufferedChannel = new kotlinx.coroutines.channels.ConflatedBufferedChannel(1, bufferOverflow, function1);
        }
        return conflatedBufferedChannel;
    }

    public static /* synthetic */ kotlinx.coroutines.channels.Channel Channel$default(int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return Channel(i);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.channels.Channel Channel(int i) {
        return Channel$default(i, null, null, 6, null);
    }
}
