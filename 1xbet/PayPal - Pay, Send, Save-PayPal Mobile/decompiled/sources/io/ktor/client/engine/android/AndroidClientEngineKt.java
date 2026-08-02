package io.ktor.client.engine.android;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Ljava/io/OutputStream;", "stream", "Lkotlin/coroutines/CoroutineContext;", "callContext", "", "writeTo", "(Lio/ktor/http/content/OutgoingContent;Ljava/io/OutputStream;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lio/ktor/http/HttpMethod;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AndroidClientEngineKt {
    private static final java.util.List<io.ktor.http.HttpMethod> Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new io.ktor.http.HttpMethod[]{io.ktor.http.HttpMethod.INSTANCE.getGet(), io.ktor.http.HttpMethod.INSTANCE.getHead()});

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object writeTo(io.ktor.http.content.OutgoingContent outgoingContent, java.io.OutputStream outputStream, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$1;
        int i;
        java.io.OutputStream outputStream2;
        java.io.OutputStream outputStream3;
        java.io.OutputStream outputStream4;
        java.io.OutputStream outputStream5 = outputStream;
        try {
            if (continuation instanceof io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1) {
                androidClientEngineKt$writeTo$1 = (io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1) continuation;
                if ((androidClientEngineKt$writeTo$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    androidClientEngineKt$writeTo$1.Camera2StreamConfigurationMap -= 2147483648;
                    io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$12 = androidClientEngineKt$writeTo$1;
                    java.lang.Object obj = androidClientEngineKt$writeTo$12.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidClientEngineKt$writeTo$12.Camera2StreamConfigurationMap;
                    if (i == 0) {
                        if (i == 1) {
                            ?? r1 = (java.io.Closeable) androidClientEngineKt$writeTo$12.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            outputStream4 = r1;
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            outputStream5 = outputStream4;
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            kotlin.io.CloseableKt.closeFinally(outputStream5, null);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i == 2) {
                            ?? r12 = (java.io.Closeable) androidClientEngineKt$writeTo$12.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            outputStream5 = r12;
                            kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                            kotlin.io.CloseableKt.closeFinally(outputStream5, null);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r13 = (java.io.Closeable) androidClientEngineKt$writeTo$12.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        outputStream3 = r13;
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        outputStream5 = outputStream3;
                        kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(outputStream5, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    outputStream2 = outputStream5;
                    try {
                        java.io.OutputStream outputStream6 = outputStream2;
                        if (!(outgoingContent instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent)) {
                            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
                                io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRanges = ((io.ktor.http.content.OutgoingContent.ReadChannelContent) outgoingContent).getGetHighSpeedVideoFpsRanges();
                                androidClientEngineKt$writeTo$12.getHighSpeedVideoFpsRangesFor = outputStream2;
                                androidClientEngineKt$writeTo$12.Camera2StreamConfigurationMap = 1;
                                if (io.ktor.utils.io.jvm.javaio.WritingKt.copyTo$default(getHighSpeedVideoFpsRanges, outputStream6, 0L, androidClientEngineKt$writeTo$12, 2, null) != coroutine_suspended) {
                                    outputStream4 = outputStream2;
                                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                    outputStream5 = outputStream4;
                                    kotlin.Unit unit2222 = kotlin.Unit.INSTANCE;
                                    kotlin.io.CloseableKt.closeFinally(outputStream5, null);
                                    return kotlin.Unit.INSTANCE;
                                }
                            } else {
                                if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent) {
                                    io.ktor.utils.io.ByteReadChannel channel = io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, false, (kotlin.jvm.functions.Function2) new io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$2$channel$1(outgoingContent, null), 2, (java.lang.Object) null).getChannel();
                                    androidClientEngineKt$writeTo$12.getHighSpeedVideoFpsRangesFor = outputStream2;
                                    androidClientEngineKt$writeTo$12.Camera2StreamConfigurationMap = 2;
                                    if (io.ktor.utils.io.jvm.javaio.WritingKt.copyTo$default(channel, outputStream6, 0L, androidClientEngineKt$writeTo$12, 2, null) == coroutine_suspended) {
                                    }
                                } else if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent) {
                                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                } else {
                                    if (!(outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper)) {
                                        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade) {
                                            throw new io.ktor.client.call.UnsupportedContentTypeException(outgoingContent);
                                        }
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    io.ktor.http.content.OutgoingContent getHighSpeedVideoFpsRanges2 = ((io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent).getGetHighSpeedVideoFpsRanges();
                                    androidClientEngineKt$writeTo$12.getHighSpeedVideoFpsRangesFor = outputStream2;
                                    androidClientEngineKt$writeTo$12.Camera2StreamConfigurationMap = 3;
                                    if (writeTo(getHighSpeedVideoFpsRanges2, outputStream5, coroutineContext, androidClientEngineKt$writeTo$12) != coroutine_suspended) {
                                        outputStream3 = outputStream2;
                                        kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                                        outputStream5 = outputStream3;
                                    }
                                }
                                kotlin.Unit unit22222 = kotlin.Unit.INSTANCE;
                                kotlin.io.CloseableKt.closeFinally(outputStream5, null);
                                return kotlin.Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        }
                        outputStream6.write(((io.ktor.http.content.OutgoingContent.ByteArrayContent) outgoingContent).getGetHighSpeedVideoFpsRangesFor());
                        kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                        outputStream5 = outputStream2;
                        kotlin.Unit unit222222 = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(outputStream5, null);
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        java.lang.Throwable th2 = th;
                        try {
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            kotlin.io.CloseableKt.closeFinally(outputStream2, th2);
                            throw th3;
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            outputStream2 = outputStream5;
        }
        androidClientEngineKt$writeTo$1 = new io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1(continuation);
        io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$122 = androidClientEngineKt$writeTo$1;
        java.lang.Object obj2 = androidClientEngineKt$writeTo$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidClientEngineKt$writeTo$122.Camera2StreamConfigurationMap;
    }
}
