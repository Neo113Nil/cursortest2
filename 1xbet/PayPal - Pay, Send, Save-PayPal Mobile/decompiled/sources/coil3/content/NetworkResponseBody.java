package coil3.content;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcoil3/network/NetworkResponseBody;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "writeTo", "", "sink", "Lokio/BufferedSink;", "(Lokio/BufferedSink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fileSystem", "Lokio/FileSystem;", "path", "Lokio/Path;", "(Lokio/FileSystem;Lokio/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface NetworkResponseBody extends java.lang.AutoCloseable {
    java.lang.Object writeTo(okio.BufferedSink bufferedSink, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object writeTo(okio.FileSystem fileSystem, okio.Path path, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
