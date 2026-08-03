package io.ktor.network.sockets;

/* compiled from: CIOReader.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1", f = "CIOReader.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4}, l = {42, 44, 42, 44, 55}, m = "invokeSuspend", n = {"timeout", "rc", "timeout", "rc", "timeout", "rc", "$this$withTimeout$iv", "timeout", "rc", "$this$withTimeout$iv", "timeout"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes6.dex */
final class CIOReaderKt$attachForReadingImpl$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.WriterScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.nio.ByteBuffer $buffer;
    final /* synthetic */ io.ktor.utils.io.ByteChannel $channel;
    final /* synthetic */ java.nio.channels.ReadableByteChannel $nioChannel;
    final /* synthetic */ io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> $pool;
    final /* synthetic */ io.ktor.network.selector.Selectable $selectable;
    final /* synthetic */ io.ktor.network.selector.SelectorManager $selector;
    final /* synthetic */ io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions $socketOptions;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOReaderKt$attachForReadingImpl$1(io.ktor.network.sockets.SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, io.ktor.utils.io.ByteChannel byteChannel, io.ktor.network.selector.Selectable selectable, java.nio.ByteBuffer byteBuffer, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> objectPool, java.nio.channels.ReadableByteChannel readableByteChannel, io.ktor.network.selector.SelectorManager selectorManager, kotlin.coroutines.Continuation<? super io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1> continuation) {
        super(2, continuation);
        this.$socketOptions = tCPClientSocketOptions;
        this.$channel = byteChannel;
        this.$selectable = selectable;
        this.$buffer = byteBuffer;
        this.$pool = objectPool;
        this.$nioChannel = readableByteChannel;
        this.$selector = selectorManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1 cIOReaderKt$attachForReadingImpl$1 = new io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1(this.$socketOptions, this.$channel, this.$selectable, this.$buffer, this.$pool, this.$nioChannel, this.$selector, continuation);
        cIOReaderKt$attachForReadingImpl$1.L$0 = obj;
        return cIOReaderKt$attachForReadingImpl$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(io.ktor.utils.io.WriterScope writerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1) create(writerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0165 A[Catch: all -> 0x0248, TRY_LEAVE, TryCatch #2 {all -> 0x0248, blocks: (B:10:0x001e, B:11:0x023c, B:12:0x00f1, B:14:0x0102, B:16:0x010c, B:21:0x0132, B:25:0x015f, B:28:0x01d5, B:30:0x01da, B:32:0x01e1, B:45:0x020d, B:48:0x0165, B:63:0x01d2, B:84:0x0244, B:85:0x0247, B:72:0x0094, B:74:0x00b5, B:76:0x00c1, B:78:0x00c5, B:80:0x00d1, B:50:0x016b, B:52:0x0175, B:56:0x019d, B:60:0x01cc, B:62:0x01d0, B:68:0x004b, B:70:0x0070), top: B:2:0x000e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175 A[Catch: all -> 0x0075, TryCatch #1 {all -> 0x0075, blocks: (B:50:0x016b, B:52:0x0175, B:56:0x019d, B:60:0x01cc, B:62:0x01d0, B:68:0x004b, B:70:0x0070), top: B:2:0x000e, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d0 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #1 {all -> 0x0075, blocks: (B:50:0x016b, B:52:0x0175, B:56:0x019d, B:60:0x01cc, B:62:0x01d0, B:68:0x004b, B:70:0x0070), top: B:2:0x000e, outer: #2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0161 -> B:14:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0239 -> B:11:0x023c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01ce -> B:50:0x016b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
