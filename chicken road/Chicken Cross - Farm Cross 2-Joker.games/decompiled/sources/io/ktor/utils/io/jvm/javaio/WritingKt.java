package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.ByteReadChannel;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.io.BuffersJvmKt;

/* compiled from: Writing.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Ljava/io/OutputStream;", "out", "", "limit", "copyTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/io/OutputStream;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WritingKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0053 -> B:11:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:10:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object copyTo(ByteReadChannel byteReadChannel, OutputStream outputStream, long j, Continuation<? super Long> continuation) {
        WritingKt$copyTo$1 writingKt$copyTo$1;
        int i;
        long j2;
        if (continuation instanceof WritingKt$copyTo$1) {
            writingKt$copyTo$1 = (WritingKt$copyTo$1) continuation;
            if ((writingKt$copyTo$1.label & Integer.MIN_VALUE) != 0) {
                writingKt$copyTo$1.label -= Integer.MIN_VALUE;
                Object obj = writingKt$copyTo$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = writingKt$copyTo$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    j2 = 0;
                    if (j < 0) {
                        throw new IllegalArgumentException(("Limit shouldn't be negative: " + j).toString());
                    }
                    if (!byteReadChannel.isClosedForRead()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = writingKt$copyTo$1.J$0;
                    OutputStream outputStream2 = (OutputStream) writingKt$copyTo$1.L$1;
                    ByteReadChannel byteReadChannel2 = (ByteReadChannel) writingKt$copyTo$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    j2 = j3;
                    outputStream = outputStream2;
                    byteReadChannel = byteReadChannel2;
                    long sizeMut = byteReadChannel.getReadBuffer().getBufferField().getSizeMut() + j2;
                    BuffersJvmKt.readTo$default(byteReadChannel.getReadBuffer().getBufferField(), outputStream, 0L, 2, null);
                    j2 = sizeMut;
                    if (!byteReadChannel.isClosedForRead()) {
                        if (byteReadChannel.getReadBuffer().exhausted()) {
                            writingKt$copyTo$1.L$0 = byteReadChannel;
                            writingKt$copyTo$1.L$1 = outputStream;
                            writingKt$copyTo$1.J$0 = j2;
                            writingKt$copyTo$1.label = 1;
                            if (ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, writingKt$copyTo$1, 1, null) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            byteReadChannel2 = byteReadChannel;
                            outputStream2 = outputStream;
                            j3 = j2;
                            j2 = j3;
                            outputStream = outputStream2;
                            byteReadChannel = byteReadChannel2;
                        }
                        long sizeMut2 = byteReadChannel.getReadBuffer().getBufferField().getSizeMut() + j2;
                        BuffersJvmKt.readTo$default(byteReadChannel.getReadBuffer().getBufferField(), outputStream, 0L, 2, null);
                        j2 = sizeMut2;
                        if (!byteReadChannel.isClosedForRead()) {
                        }
                    } else {
                        return Boxing.boxLong(j2);
                    }
                }
            }
        }
        writingKt$copyTo$1 = new WritingKt$copyTo$1(continuation);
        Object obj2 = writingKt$copyTo$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = writingKt$copyTo$1.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannel byteReadChannel, OutputStream outputStream, long j, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, outputStream, j, continuation);
    }
}
