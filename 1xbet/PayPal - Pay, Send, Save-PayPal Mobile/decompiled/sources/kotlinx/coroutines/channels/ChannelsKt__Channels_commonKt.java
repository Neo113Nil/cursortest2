package kotlinx.coroutines.channels;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a&\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087@¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aR\u0010\f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\b\nH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r\u001a4\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\tH\u0086H¢\u0006\u0004\b\u000f\u0010\u0010\u001a&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0012\u0010\u0004\u001a!\u0010\u0014\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"", "E", "Lkotlinx/coroutines/channels/ReceiveChannel;", "receiveOrNull", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveOrNull", "(Lkotlinx/coroutines/channels/ReceiveChannel;)Lkotlinx/coroutines/selects/SelectClause1;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "p0", "consume", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "consumeEach", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toList", "", "cancelConsumed", "(Lkotlinx/coroutines/channels/ReceiveChannel;Ljava/lang/Throwable;)V", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes3.dex */
final /* synthetic */ class ChannelsKt__Channels_commonKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ java.lang.Object receiveOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(receiveChannel, "");
        return receiveChannel.receiveOrNull(continuation);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ kotlinx.coroutines.selects.SelectClause1 onReceiveOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(receiveChannel, "");
        return receiveChannel.getOnReceiveOrNull();
    }

    public static final <E, R> R consume(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> function1) {
        try {
            R invoke = function1.invoke(receiveChannel);
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
            return invoke;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: all -> 0x007a, TryCatch #0 {all -> 0x007a, blocks: (B:14:0x005f, B:16:0x0067, B:17:0x004c, B:22:0x0071, B:40:0x0048), top: B:39:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {all -> 0x007a, blocks: (B:14:0x005f, B:16:0x0067, B:17:0x004c, B:22:0x0071, B:40:0x0048), top: B:39:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005b -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 channelsKt__Channels_commonKt$consumeEach$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<? extends E> it;
        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2;
        java.lang.Throwable th;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1) {
            channelsKt__Channels_commonKt$consumeEach$1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1) continuation;
            if ((channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = channelsKt__Channels_commonKt$consumeEach$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        it = receiveChannel.iterator();
                        channelsKt__Channels_commonKt$consumeEach$1.Camera2StreamConfigurationMap = function1;
                        channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                        channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoSizes = it;
                        channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoFpsRanges = 1;
                        hasNext = it.hasNext(channelsKt__Channels_commonKt$consumeEach$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.channels.ChannelIterator<? extends E> channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoSizes;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) channelsKt__Channels_commonKt$consumeEach$1.Camera2StreamConfigurationMap;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 channelsKt__Channels_commonKt$consumeEach$12 = channelsKt__Channels_commonKt$consumeEach$1;
                        kotlinx.coroutines.channels.ChannelIterator<? extends E> channelIterator2 = channelIterator;
                        receiveChannel = receiveChannel2;
                        function1 = function12;
                        kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 channelsKt__Channels_commonKt$consumeEach$13 = channelsKt__Channels_commonKt$consumeEach$12;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            function1.invoke(channelIterator2.next());
                            it = channelIterator2;
                            channelsKt__Channels_commonKt$consumeEach$1 = channelsKt__Channels_commonKt$consumeEach$13;
                            channelsKt__Channels_commonKt$consumeEach$1.Camera2StreamConfigurationMap = function1;
                            channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                            channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoSizes = it;
                            channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoFpsRanges = 1;
                            hasNext = it.hasNext(channelsKt__Channels_commonKt$consumeEach$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            channelsKt__Channels_commonKt$consumeEach$12 = channelsKt__Channels_commonKt$consumeEach$1;
                            channelIterator2 = it;
                            obj = hasNext;
                            kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 channelsKt__Channels_commonKt$consumeEach$132 = channelsKt__Channels_commonKt$consumeEach$12;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__Channels_commonKt$consumeEach$1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1(continuation);
        java.lang.Object obj2 = channelsKt__Channels_commonKt$consumeEach$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__Channels_commonKt$consumeEach$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[Catch: all -> 0x0080, TryCatch #0 {all -> 0x0080, blocks: (B:13:0x0065, B:15:0x006d, B:16:0x0054, B:20:0x0075, B:38:0x004e), top: B:37:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:13:0x0065, B:15:0x006d, B:16:0x0054, B:20:0x0075, B:38:0x004e), top: B:37:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0062 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> java.lang.Object toList(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.util.List<? extends E>> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 channelsKt__Channels_commonKt$toList$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<? extends E> it;
        java.util.List list;
        java.util.List list2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1) {
            channelsKt__Channels_commonKt$toList$1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1) continuation;
            if ((channelsKt__Channels_commonKt$toList$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$toList$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = channelsKt__Channels_commonKt$toList$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__Channels_commonKt$toList$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                    try {
                        it = receiveChannel.iterator();
                        list = createListBuilder;
                        list2 = list;
                        channelsKt__Channels_commonKt$toList$1.getHighSpeedVideoSizes = list2;
                        channelsKt__Channels_commonKt$toList$1.getHighSpeedVideoFpsRanges = list;
                        channelsKt__Channels_commonKt$toList$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                        channelsKt__Channels_commonKt$toList$1.Camera2StreamConfigurationMap = it;
                        channelsKt__Channels_commonKt$toList$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = it.hasNext(channelsKt__Channels_commonKt$toList$1);
                        if (obj == coroutine_suspended) {
                        }
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.channels.ChannelIterator<? extends E> channelIterator = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__Channels_commonKt$toList$1.Camera2StreamConfigurationMap;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__Channels_commonKt$toList$1.getHighSpeedVideoFpsRangesFor;
                    list = (java.util.List) channelsKt__Channels_commonKt$toList$1.getHighSpeedVideoFpsRanges;
                    list2 = (java.util.List) channelsKt__Channels_commonKt$toList$1.getHighSpeedVideoSizes;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        it = channelIterator;
                        receiveChannel = receiveChannel2;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            list.add(it.next());
                            channelsKt__Channels_commonKt$toList$1.getHighSpeedVideoSizes = list2;
                            channelsKt__Channels_commonKt$toList$1.getHighSpeedVideoFpsRanges = list;
                            channelsKt__Channels_commonKt$toList$1.getHighSpeedVideoFpsRangesFor = receiveChannel;
                            channelsKt__Channels_commonKt$toList$1.Camera2StreamConfigurationMap = it;
                            channelsKt__Channels_commonKt$toList$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            obj = it.hasNext(channelsKt__Channels_commonKt$toList$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                                return kotlin.collections.CollectionsKt.build(list2);
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__Channels_commonKt$toList$1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1(continuation);
        java.lang.Object obj2 = channelsKt__Channels_commonKt$toList$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__Channels_commonKt$toList$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }

    public static final void cancelConsumed(kotlinx.coroutines.channels.ReceiveChannel<?> receiveChannel, java.lang.Throwable th) {
        if (th != null) {
            r0 = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
            if (r0 == null) {
                r0 = kotlinx.coroutines.ExceptionsKt.CancellationException("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.cancel(r0);
    }
}
