package io.ktor.client.engine.android;

/* compiled from: AndroidClientEngine.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Ljava/io/OutputStream;", "stream", "Lkotlin/coroutines/CoroutineContext;", "callContext", "", "writeTo", "(Lio/ktor/http/content/OutgoingContent;Ljava/io/OutputStream;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidClientEngineKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object writeTo(io.ktor.http.content.OutgoingContent outgoingContent, java.io.OutputStream outputStream, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$1;
        int i;
        java.io.OutputStream outputStream2;
        java.io.OutputStream outputStream3;
        java.io.OutputStream outputStream4 = outputStream;
        try {
            if (continuation instanceof io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1) {
                androidClientEngineKt$writeTo$1 = (io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1) continuation;
                if ((androidClientEngineKt$writeTo$1.label & Integer.MIN_VALUE) != 0) {
                    androidClientEngineKt$writeTo$1.label -= Integer.MIN_VALUE;
                    io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$12 = androidClientEngineKt$writeTo$1;
                    java.lang.Object obj = androidClientEngineKt$writeTo$12.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidClientEngineKt$writeTo$12.label;
                    if (i == 0) {
                        if (i == 1) {
                            ?? r1 = (java.io.Closeable) androidClientEngineKt$writeTo$12.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            outputStream3 = r1;
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            outputStream4 = outputStream3;
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                            kotlin.io.CloseableKt.closeFinally(outputStream4, null);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i == 2) {
                            ?? r12 = (java.io.Closeable) androidClientEngineKt$writeTo$12.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            outputStream4 = r12;
                            kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                            kotlin.io.CloseableKt.closeFinally(outputStream4, null);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r13 = (java.io.Closeable) androidClientEngineKt$writeTo$12.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        outputStream2 = r13;
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        outputStream4 = outputStream2;
                        kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(outputStream4, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.io.OutputStream outputStream5 = outputStream4;
                    try {
                        java.io.OutputStream outputStream6 = outputStream5;
                        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ByteArrayContent) {
                            outputStream6.write(((io.ktor.http.content.OutgoingContent.ByteArrayContent) outgoingContent).getBytes());
                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                        } else {
                            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ReadChannelContent) {
                                io.ktor.utils.io.ByteReadChannel readFrom = ((io.ktor.http.content.OutgoingContent.ReadChannelContent) outgoingContent).readFrom();
                                androidClientEngineKt$writeTo$12.L$0 = outputStream5;
                                androidClientEngineKt$writeTo$12.label = 1;
                                if (io.ktor.utils.io.jvm.javaio.WritingKt.copyTo$default(readFrom, outputStream6, 0L, androidClientEngineKt$writeTo$12, 2, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                outputStream3 = outputStream5;
                                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                outputStream4 = outputStream3;
                                kotlin.Unit unit2222 = kotlin.Unit.INSTANCE;
                                kotlin.io.CloseableKt.closeFinally(outputStream4, null);
                                return kotlin.Unit.INSTANCE;
                            }
                            if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.WriteChannelContent) {
                                io.ktor.utils.io.ByteReadChannel channel = io.ktor.utils.io.ByteWriteChannelOperationsKt.writer$default((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, false, (kotlin.jvm.functions.Function2) new io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$2$channel$1(outgoingContent, null), 2, (java.lang.Object) null).getChannel();
                                androidClientEngineKt$writeTo$12.L$0 = outputStream5;
                                androidClientEngineKt$writeTo$12.label = 2;
                                if (io.ktor.utils.io.jvm.javaio.WritingKt.copyTo$default(channel, outputStream6, 0L, androidClientEngineKt$writeTo$12, 2, null) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (!(outgoingContent instanceof io.ktor.http.content.OutgoingContent.NoContent)) {
                                    if (!(outgoingContent instanceof io.ktor.http.content.OutgoingContent.ContentWrapper)) {
                                        if (outgoingContent instanceof io.ktor.http.content.OutgoingContent.ProtocolUpgrade) {
                                            throw new io.ktor.client.call.UnsupportedContentTypeException(outgoingContent);
                                        }
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    io.ktor.http.content.OutgoingContent delegate = ((io.ktor.http.content.OutgoingContent.ContentWrapper) outgoingContent).getDelegate();
                                    androidClientEngineKt$writeTo$12.L$0 = outputStream5;
                                    androidClientEngineKt$writeTo$12.label = 3;
                                    if (writeTo(delegate, outputStream4, coroutineContext, androidClientEngineKt$writeTo$12) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    outputStream2 = outputStream5;
                                    kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                                    outputStream4 = outputStream2;
                                    kotlin.Unit unit22222 = kotlin.Unit.INSTANCE;
                                    kotlin.io.CloseableKt.closeFinally(outputStream4, null);
                                    return kotlin.Unit.INSTANCE;
                                }
                                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                            }
                        }
                        outputStream4 = outputStream5;
                        kotlin.Unit unit222222 = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(outputStream4, null);
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        outputStream4 = outputStream5;
                        java.lang.Throwable th2 = th;
                        try {
                            throw th2;
                        } catch (java.lang.Throwable th3) {
                            kotlin.io.CloseableKt.closeFinally(outputStream4, th2);
                            throw th3;
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
        androidClientEngineKt$writeTo$1 = new io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1(continuation);
        io.ktor.client.engine.android.AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$122 = androidClientEngineKt$writeTo$1;
        java.lang.Object obj2 = androidClientEngineKt$writeTo$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidClientEngineKt$writeTo$122.label;
    }
}
