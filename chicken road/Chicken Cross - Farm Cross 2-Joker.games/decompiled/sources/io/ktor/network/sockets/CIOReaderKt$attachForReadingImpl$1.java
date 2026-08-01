package io.ktor.network.sockets;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import io.ktor.network.selector.Selectable;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: CIOReader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1", f = "CIOReader.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4}, l = {42, 44, 42, 44, 55}, m = "invokeSuspend", n = {"timeout", DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "timeout", DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "timeout", DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "$this$withTimeout$iv", "timeout", DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "$this$withTimeout$iv", "timeout"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes7.dex */
final class CIOReaderKt$attachForReadingImpl$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteBuffer $buffer;
    final /* synthetic */ ByteChannel $channel;
    final /* synthetic */ ReadableByteChannel $nioChannel;
    final /* synthetic */ ObjectPool<ByteBuffer> $pool;
    final /* synthetic */ Selectable $selectable;
    final /* synthetic */ SelectorManager $selector;
    final /* synthetic */ SocketOptions.TCPClientSocketOptions $socketOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOReaderKt$attachForReadingImpl$1(SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, ByteChannel byteChannel, Selectable selectable, ByteBuffer byteBuffer, ObjectPool<ByteBuffer> objectPool, ReadableByteChannel readableByteChannel, SelectorManager selectorManager, Continuation<? super CIOReaderKt$attachForReadingImpl$1> continuation) {
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
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CIOReaderKt$attachForReadingImpl$1 cIOReaderKt$attachForReadingImpl$1 = new CIOReaderKt$attachForReadingImpl$1(this.$socketOptions, this.$channel, this.$selectable, this.$buffer, this.$pool, this.$nioChannel, this.$selector, continuation);
        cIOReaderKt$attachForReadingImpl$1.L$0 = obj;
        return cIOReaderKt$attachForReadingImpl$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super Unit> continuation) {
        return ((CIOReaderKt$attachForReadingImpl$1) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
