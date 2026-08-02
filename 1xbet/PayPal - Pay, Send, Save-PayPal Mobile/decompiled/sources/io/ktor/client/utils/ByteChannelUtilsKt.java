package io.ktor.client.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "contentLength", "Lio/ktor/client/content/ProgressListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "observable", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Long;Lio/ktor/client/content/ProgressListener;)Lio/ktor/utils/io/ByteReadChannel;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteChannelUtilsKt {
    public static final io.ktor.utils.io.ByteReadChannel observable(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Long l, io.ktor.client.content.ProgressListener progressListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressListener, "");
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer((kotlinx.coroutines.CoroutineScope) kotlinx.coroutines.GlobalScope.INSTANCE, coroutineContext, true, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new io.ktor.client.utils.ByteChannelUtilsKt$observable$1(byteReadChannel, progressListener, l, null)).getChannel();
    }
}
