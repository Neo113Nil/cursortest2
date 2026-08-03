package io.ktor.utils.io;

/* compiled from: CloseHookByteWriteChannel.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "onClose", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function1;)Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CloseHookByteWriteChannelKt {
    public static final io.ktor.utils.io.ByteWriteChannel onClose(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onClose) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClose, "onClose");
        return new io.ktor.utils.io.CloseHookByteWriteChannel(byteWriteChannel, onClose);
    }
}
