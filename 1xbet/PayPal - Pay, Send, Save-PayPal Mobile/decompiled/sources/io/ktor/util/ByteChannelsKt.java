package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a%\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Pair;", "split", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/coroutines/CoroutineScope;)Lkotlin/Pair;", "Lio/ktor/utils/io/ByteWriteChannel;", "first", "second", "", "copyToBoth", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/ByteWriteChannel;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ByteChannelsKt {
    public static final kotlin.Pair<io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteReadChannel> split(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        final io.ktor.utils.io.ByteChannel byteChannel = new io.ktor.utils.io.ByteChannel(true);
        final io.ktor.utils.io.ByteChannel byteChannel2 = new io.ktor.utils.io.ByteChannel(true);
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new io.ktor.util.ByteChannelsKt$split$1(byteReadChannel, byteChannel, byteChannel2, null), 3, null);
        launch$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.ByteChannelsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.util.ByteChannelsKt.$r8$lambda$ujB64mETFBVV9IqEv54hFaGmdeE(io.ktor.utils.io.ByteChannel.this, byteChannel2, (java.lang.Throwable) obj);
            }
        });
        return kotlin.TuplesKt.to(byteChannel, byteChannel2);
    }

    public static final void copyToBoth(io.ktor.utils.io.ByteReadChannel byteReadChannel, final io.ktor.utils.io.ByteWriteChannel byteWriteChannel, final io.ktor.utils.io.ByteWriteChannel byteWriteChannel2) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteReadChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel2, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getDefault(), null, new io.ktor.util.ByteChannelsKt$copyToBoth$1(byteReadChannel, byteWriteChannel, byteWriteChannel2, null), 2, null);
        launch$default.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.util.ByteChannelsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.util.ByteChannelsKt.$r8$lambda$IMxUwwYk2ZjzHImzpZkEO1w7mO0(io.ktor.utils.io.ByteWriteChannel.this, byteWriteChannel2, (java.lang.Throwable) obj);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IMxUwwYk2ZjzHImzpZkEO1w7mO0(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel2, java.lang.Throwable th) {
        if (th == null) {
            return kotlin.Unit.INSTANCE;
        }
        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ujB64mETFBVV9IqEv54hFaGmdeE(io.ktor.utils.io.ByteChannel byteChannel, io.ktor.utils.io.ByteChannel byteChannel2, java.lang.Throwable th) {
        if (th == null) {
            return kotlin.Unit.INSTANCE;
        }
        byteChannel.cancel(th);
        byteChannel2.cancel(th);
        return kotlin.Unit.INSTANCE;
    }
}
