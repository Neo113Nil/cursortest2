package io.ktor.network.sockets;

import io.ktor.network.selector.Selectable;
import io.ktor.network.selector.SelectorManager;
import io.ktor.network.sockets.SocketOptions;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.WriterScope;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: CIOReader.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1", f = "CIOReader.kt", i = {0, 1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7}, l = {96, 105, 108, 109, 96, 105, 108, 109}, m = "invokeSuspend", n = {"timeout", "timeout", "timeout", "timeout", "timeout", "$this$withTimeout$iv", "timeout", "$this$withTimeout$iv", "timeout", "$this$withTimeout$iv", "timeout", "$this$withTimeout$iv"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes7.dex */
final class CIOReaderKt$attachForReadingDirectImpl$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteChannel $channel;
    final /* synthetic */ ReadableByteChannel $nioChannel;
    final /* synthetic */ Selectable $selectable;
    final /* synthetic */ SelectorManager $selector;
    final /* synthetic */ SocketOptions.TCPClientSocketOptions $socketOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CIOReaderKt$attachForReadingDirectImpl$1(Selectable selectable, SocketOptions.TCPClientSocketOptions tCPClientSocketOptions, ByteChannel byteChannel, ReadableByteChannel readableByteChannel, SelectorManager selectorManager, Continuation<? super CIOReaderKt$attachForReadingDirectImpl$1> continuation) {
        super(2, continuation);
        this.$selectable = selectable;
        this.$socketOptions = tCPClientSocketOptions;
        this.$channel = byteChannel;
        this.$nioChannel = readableByteChannel;
        this.$selector = selectorManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CIOReaderKt$attachForReadingDirectImpl$1 cIOReaderKt$attachForReadingDirectImpl$1 = new CIOReaderKt$attachForReadingDirectImpl$1(this.$selectable, this.$socketOptions, this.$channel, this.$nioChannel, this.$selector, continuation);
        cIOReaderKt$attachForReadingDirectImpl$1.L$0 = obj;
        return cIOReaderKt$attachForReadingDirectImpl$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super Unit> continuation) {
        return ((CIOReaderKt$attachForReadingDirectImpl$1) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0228 -> B:9:0x022b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0165 -> B:19:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0169 -> B:19:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01b0 -> B:34:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01b2 -> B:19:0x012c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01df -> B:17:0x0233). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01e3 -> B:17:0x0233). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
