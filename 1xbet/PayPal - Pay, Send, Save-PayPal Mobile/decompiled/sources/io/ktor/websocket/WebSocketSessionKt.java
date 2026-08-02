package io.ktor.websocket;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a1\u0010\u0004\u001a\u00028\u0000\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000*\u00020\u00022\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0000*\u00020\u00022\u0010\u0010\u0004\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\fH\u0086@¢\u0006\u0004\b\n\u0010\r\u001a\u001e\u0010\u0010\u001a\u00020\t*\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001e\u0010\u0010\u001a\u00020\t*\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0087@¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u001c\u0010\u0015\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0014"}, d2 = {"Lio/ktor/websocket/WebSocketExtension;", "T", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/websocket/WebSocketExtensionFactory;", "extension", "(Lio/ktor/websocket/WebSocketSession;Lio/ktor/websocket/WebSocketExtensionFactory;)Lio/ktor/websocket/WebSocketExtension;", "extensionOrNull", "", "content", "", "send", "(Lio/ktor/websocket/WebSocketSession;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Lio/ktor/websocket/WebSocketSession;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/websocket/CloseReason;", "reason", "close", "(Lio/ktor/websocket/WebSocketSession;Lio/ktor/websocket/CloseReason;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "(Lio/ktor/websocket/WebSocketSession;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeExceptionally"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebSocketSessionKt {
    public static final <T extends io.ktor.websocket.WebSocketExtension<?>> T extension(io.ktor.websocket.WebSocketSession webSocketSession, io.ktor.websocket.WebSocketExtensionFactory<?, T> webSocketExtensionFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketExtensionFactory, "");
        T t = (T) extensionOrNull(webSocketSession, webSocketExtensionFactory);
        if (t != null) {
            return t;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Extension ");
        sb.append(webSocketExtensionFactory);
        sb.append(" not found.");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public static final <T extends io.ktor.websocket.WebSocketExtension<?>> T extensionOrNull(io.ktor.websocket.WebSocketSession webSocketSession, io.ktor.websocket.WebSocketExtensionFactory<?, T> webSocketExtensionFactory) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketExtensionFactory, "");
        java.util.Iterator<T> it = webSocketSession.getExtensions().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((io.ktor.websocket.WebSocketExtension) obj).getFactory().getKey() == webSocketExtensionFactory.getKey()) {
                break;
            }
        }
        if (obj instanceof io.ktor.websocket.WebSocketExtension) {
            return (T) obj;
        }
        return null;
    }

    public static final java.lang.Object send(io.ktor.websocket.WebSocketSession webSocketSession, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object send = webSocketSession.send(new io.ktor.websocket.Frame.Text(str), continuation);
        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object send(io.ktor.websocket.WebSocketSession webSocketSession, byte[] bArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object send = webSocketSession.send(new io.ktor.websocket.Frame.Binary(true, bArr), continuation);
        return send == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(2:25|21))|19))|27|6|7|(0)(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r5.flush(r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object close(io.ktor.websocket.WebSocketSession webSocketSession, io.ktor.websocket.CloseReason closeReason, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.websocket.WebSocketSessionKt$close$1 webSocketSessionKt$close$1;
        int i;
        if (continuation instanceof io.ktor.websocket.WebSocketSessionKt$close$1) {
            webSocketSessionKt$close$1 = (io.ktor.websocket.WebSocketSessionKt$close$1) continuation;
            if ((webSocketSessionKt$close$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                webSocketSessionKt$close$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = webSocketSessionKt$close$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = webSocketSessionKt$close$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.websocket.Frame.Close close = new io.ktor.websocket.Frame.Close(closeReason);
                    webSocketSessionKt$close$1.getHighSpeedVideoFpsRangesFor = webSocketSession;
                    webSocketSessionKt$close$1.getHighSpeedVideoSizes = 1;
                    if (webSocketSession.send(close, webSocketSessionKt$close$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    webSocketSession = (io.ktor.websocket.WebSocketSession) webSocketSessionKt$close$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                webSocketSessionKt$close$1.getHighSpeedVideoFpsRangesFor = null;
                webSocketSessionKt$close$1.getHighSpeedVideoSizes = 2;
            }
        }
        webSocketSessionKt$close$1 = new io.ktor.websocket.WebSocketSessionKt$close$1(continuation);
        java.lang.Object obj2 = webSocketSessionKt$close$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = webSocketSessionKt$close$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        webSocketSessionKt$close$1.getHighSpeedVideoFpsRangesFor = null;
        webSocketSessionKt$close$1.getHighSpeedVideoSizes = 2;
    }

    public static /* synthetic */ java.lang.Object close$default(io.ktor.websocket.WebSocketSession webSocketSession, io.ktor.websocket.CloseReason closeReason, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            closeReason = new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.NORMAL, "");
        }
        return close(webSocketSession, closeReason, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Close with reason or terminate instead.")
    public static final java.lang.Object close(io.ktor.websocket.WebSocketSession webSocketSession, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (th == null) {
            java.lang.Object close$default = close$default(webSocketSession, null, continuation, 1, null);
            return close$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? close$default : kotlin.Unit.INSTANCE;
        }
        java.lang.Object closeExceptionally = closeExceptionally(webSocketSession, th, continuation);
        return closeExceptionally == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? closeExceptionally : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object closeExceptionally(io.ktor.websocket.WebSocketSession webSocketSession, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object close = close(webSocketSession, th instanceof java.util.concurrent.CancellationException ? new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.NORMAL, "") : new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR, th.toString()), continuation);
        return close == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? close : kotlin.Unit.INSTANCE;
    }
}
