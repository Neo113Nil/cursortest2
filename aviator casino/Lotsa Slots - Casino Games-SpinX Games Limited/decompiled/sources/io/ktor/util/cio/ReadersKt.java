package io.ktor.util.cio;

/* compiled from: Readers.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a=\u0010\u000b\u001a\u00020\b*\u00020\u00062\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "limit", "", "toByteArray", "(Lio/ktor/utils/io/ByteReadChannel;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "block", "use", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function1;)V", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReadersKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object toByteArray(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        io.ktor.util.cio.ReadersKt$toByteArray$1 readersKt$toByteArray$1;
        int i2;
        if (continuation instanceof io.ktor.util.cio.ReadersKt$toByteArray$1) {
            readersKt$toByteArray$1 = (io.ktor.util.cio.ReadersKt$toByteArray$1) continuation;
            if ((readersKt$toByteArray$1.label & Integer.MIN_VALUE) != 0) {
                readersKt$toByteArray$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = readersKt$toByteArray$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = readersKt$toByteArray$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    readersKt$toByteArray$1.label = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(byteReadChannel, i, readersKt$toByteArray$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlinx.io.SourcesKt.readByteArray((kotlinx.io.Source) obj);
            }
        }
        readersKt$toByteArray$1 = new io.ktor.util.cio.ReadersKt$toByteArray$1(continuation);
        java.lang.Object obj2 = readersKt$toByteArray$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = readersKt$toByteArray$1.label;
        if (i2 != 0) {
        }
        return kotlinx.io.SourcesKt.readByteArray((kotlinx.io.Source) obj2);
    }

    public static /* synthetic */ java.lang.Object toByteArray$default(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        return toByteArray(byteReadChannel, i, continuation);
    }

    public static final void use(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.jvm.functions.Function1<? super io.ktor.utils.io.ByteWriteChannel, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke(byteWriteChannel);
        } finally {
        }
    }
}
