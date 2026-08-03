package kotlinx.coroutines.channels;

/* compiled from: Channels.common.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u001a$\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0087@¢\u0006\u0002\u0010\u0006\u001a$\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\b\"\b\b\u0000\u0010\u0003*\u00020\u0004*\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0007\u001aP\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0005\u0012\u0004\u0012\u0002H\n0\f¢\u0006\u0002\b\rH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000e\u001a2\u0010\u000f\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00100\fH\u0086H¢\u0006\u0002\u0010\u0012\u001a$\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0014\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0086@¢\u0006\u0002\u0010\u0006\u001a\u001a\u0010\u0015\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"DEFAULT_CLOSE_MESSAGE", "", "receiveOrNull", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "Lkotlinx/coroutines/channels/ReceiveChannel;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause1;", "consume", "R", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "consumeEach", "", "action", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toList", "", "cancelConsumed", "cause", "", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes6.dex */
final /* synthetic */ class ChannelsKt__Channels_commonKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ java.lang.Object receiveOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return receiveChannel.receiveOrNull(continuation);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ kotlinx.coroutines.selects.SelectClause1 onReceiveOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return receiveChannel.getOnReceiveOrNull();
    }

    public static final <E, R> R consume(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> function1) {
        try {
            R invoke = function1.invoke(receiveChannel);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x006f), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:11:0x0033, B:12:0x005e, B:14:0x0066, B:15:0x004c, B:20:0x006f), top: B:10:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:12:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 channelsKt__Channels_commonKt$consumeEach$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function12;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1) {
            channelsKt__Channels_commonKt$consumeEach$1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1) continuation;
            if ((channelsKt__Channels_commonKt$consumeEach$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$consumeEach$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = channelsKt__Channels_commonKt$consumeEach$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__Channels_commonKt$consumeEach$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        function12 = function1;
                        channelsKt__Channels_commonKt$consumeEach$1.L$0 = function12;
                        channelsKt__Channels_commonKt$consumeEach$1.L$1 = receiveChannel2;
                        channelsKt__Channels_commonKt$consumeEach$1.L$2 = it;
                        channelsKt__Channels_commonKt$consumeEach$1.label = 1;
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
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__Channels_commonKt$consumeEach$1.L$2;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__Channels_commonKt$consumeEach$1.L$1;
                    kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) channelsKt__Channels_commonKt$consumeEach$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            function13.invoke((java.lang.Object) it.next());
                            function12 = function13;
                            channelsKt__Channels_commonKt$consumeEach$1.L$0 = function12;
                            channelsKt__Channels_commonKt$consumeEach$1.L$1 = receiveChannel2;
                            channelsKt__Channels_commonKt$consumeEach$1.L$2 = it;
                            channelsKt__Channels_commonKt$consumeEach$1.label = 1;
                            hasNext = it.hasNext(channelsKt__Channels_commonKt$consumeEach$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            function13 = function12;
                            obj = hasNext;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__Channels_commonKt$consumeEach$1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1(continuation);
        java.lang.Object obj2 = channelsKt__Channels_commonKt$consumeEach$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__Channels_commonKt$consumeEach$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071 A[Catch: all -> 0x003b, TryCatch #3 {all -> 0x003b, blocks: (B:11:0x0037, B:12:0x0069, B:14:0x0071, B:29:0x007a), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #3 {all -> 0x003b, blocks: (B:11:0x0037, B:12:0x0069, B:14:0x0071, B:29:0x007a), top: B:10:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:12:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> java.lang.Object toList(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.util.List<? extends E>> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 channelsKt__Channels_commonKt$toList$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2;
        java.lang.Throwable th;
        java.util.List list;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.util.List list2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1) {
            channelsKt__Channels_commonKt$toList$1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1) continuation;
            if ((channelsKt__Channels_commonKt$toList$1.label & Integer.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$toList$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = channelsKt__Channels_commonKt$toList$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__Channels_commonKt$toList$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                        list = createListBuilder;
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        list2 = createListBuilder;
                        channelsKt__Channels_commonKt$toList$1.L$0 = list;
                        channelsKt__Channels_commonKt$toList$1.L$1 = list2;
                        channelsKt__Channels_commonKt$toList$1.L$2 = receiveChannel2;
                        channelsKt__Channels_commonKt$toList$1.L$3 = it;
                        channelsKt__Channels_commonKt$toList$1.label = 1;
                        hasNext = it.hasNext(channelsKt__Channels_commonKt$toList$1);
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
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__Channels_commonKt$toList$1.L$3;
                    kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__Channels_commonKt$toList$1.L$2;
                    java.util.List list3 = (java.util.List) channelsKt__Channels_commonKt$toList$1.L$1;
                    list = (java.util.List) channelsKt__Channels_commonKt$toList$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.List list4 = list3;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            list4.add(it.next());
                            receiveChannel2 = receiveChannel3;
                            list2 = list4;
                            try {
                                channelsKt__Channels_commonKt$toList$1.L$0 = list;
                                channelsKt__Channels_commonKt$toList$1.L$1 = list2;
                                channelsKt__Channels_commonKt$toList$1.L$2 = receiveChannel2;
                                channelsKt__Channels_commonKt$toList$1.L$3 = it;
                                channelsKt__Channels_commonKt$toList$1.label = 1;
                                hasNext = it.hasNext(channelsKt__Channels_commonKt$toList$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                receiveChannel3 = receiveChannel2;
                                obj = hasNext;
                                list4 = list2;
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
                                    return kotlin.collections.CollectionsKt.build(list);
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
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        receiveChannel2 = receiveChannel3;
                        throw th;
                    }
                }
            }
        }
        channelsKt__Channels_commonKt$toList$1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1(continuation);
        java.lang.Object obj2 = channelsKt__Channels_commonKt$toList$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__Channels_commonKt$toList$1.label;
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

    private static final <E> java.lang.Object consumeEach$$forInline(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        try {
            kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2 = receiveChannel;
            kotlinx.coroutines.channels.ChannelIterator<? extends E> it = receiveChannel.iterator();
            while (true) {
                kotlin.jvm.internal.InlineMarker.mark(3);
                kotlin.jvm.internal.InlineMarker.mark(0);
                java.lang.Object hasNext = it.hasNext(null);
                kotlin.jvm.internal.InlineMarker.mark(1);
                if (!((java.lang.Boolean) hasNext).booleanValue()) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    return kotlin.Unit.INSTANCE;
                }
                function1.invoke(it.next());
            }
        } finally {
        }
    }
}
