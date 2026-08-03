package io.ktor.util.cio;

/* compiled from: FileChannelsAtNioPath.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/nio/file/Path;", "", "start", "endInclusive", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/utils/io/ByteReadChannel;", "readChannel", "(Ljava/nio/file/Path;JJLkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FileChannelsAtNioPathKt {
    public static /* synthetic */ io.ktor.utils.io.ByteReadChannel readChannel$default(java.nio.file.Path path, long j, long j2, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = -1;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getIO();
        }
        return readChannel(path, j3, j4, coroutineContext);
    }

    public static final io.ktor.utils.io.ByteReadChannel readChannel(java.nio.file.Path path, long j, long j2, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return io.ktor.utils.io.ByteWriteChannelOperationsKt.writer(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineContext), new kotlinx.coroutines.CoroutineName("file-reader").plus(coroutineContext), false, (kotlin.jvm.functions.Function2<? super io.ktor.utils.io.WriterScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new io.ktor.util.cio.FileChannelsAtNioPathKt$readChannel$1(j, j2, java.nio.file.Files.size(path), path, null)).getChannel();
    }
}
