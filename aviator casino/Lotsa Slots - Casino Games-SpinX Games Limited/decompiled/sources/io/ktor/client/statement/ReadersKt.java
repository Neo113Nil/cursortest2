package io.ktor.client.statement;

/* compiled from: Readers.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0087@¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000H\u0086@¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "", com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "", "readBytes", "(Lio/ktor/client/statement/HttpResponse;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRawBytes", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "discardRemaining", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReadersKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readBytes(io.ktor.client.statement.HttpResponse httpResponse, int i, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        io.ktor.client.statement.ReadersKt$readBytes$1 readersKt$readBytes$1;
        int i2;
        if (continuation instanceof io.ktor.client.statement.ReadersKt$readBytes$1) {
            readersKt$readBytes$1 = (io.ktor.client.statement.ReadersKt$readBytes$1) continuation;
            if ((readersKt$readBytes$1.label & Integer.MIN_VALUE) != 0) {
                readersKt$readBytes$1.label -= Integer.MIN_VALUE;
                io.ktor.client.statement.ReadersKt$readBytes$1 readersKt$readBytes$12 = readersKt$readBytes$1;
                java.lang.Object obj = readersKt$readBytes$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = readersKt$readBytes$12.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byte[] bArr = (byte[]) readersKt$readBytes$12.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return bArr;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                byte[] bArr2 = new byte[i];
                io.ktor.utils.io.ByteReadChannel rawContent = httpResponse.getRawContent();
                readersKt$readBytes$12.L$0 = bArr2;
                readersKt$readBytes$12.label = 1;
                return io.ktor.utils.io.ByteReadChannelOperationsKt.readFully$default(rawContent, bArr2, 0, 0, readersKt$readBytes$12, 6, null) == coroutine_suspended ? coroutine_suspended : bArr2;
            }
        }
        readersKt$readBytes$1 = new io.ktor.client.statement.ReadersKt$readBytes$1(continuation);
        io.ktor.client.statement.ReadersKt$readBytes$1 readersKt$readBytes$122 = readersKt$readBytes$1;
        java.lang.Object obj2 = readersKt$readBytes$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = readersKt$readBytes$122.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readRawBytes(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        io.ktor.client.statement.ReadersKt$readRawBytes$1 readersKt$readRawBytes$1;
        int i;
        if (continuation instanceof io.ktor.client.statement.ReadersKt$readRawBytes$1) {
            readersKt$readRawBytes$1 = (io.ktor.client.statement.ReadersKt$readRawBytes$1) continuation;
            if ((readersKt$readRawBytes$1.label & Integer.MIN_VALUE) != 0) {
                readersKt$readRawBytes$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = readersKt$readRawBytes$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readersKt$readRawBytes$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.utils.io.ByteReadChannel rawContent = httpResponse.getRawContent();
                    readersKt$readRawBytes$1.label = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(rawContent, readersKt$readRawBytes$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlinx.io.SourcesKt.readByteArray((kotlinx.io.Source) obj);
            }
        }
        readersKt$readRawBytes$1 = new io.ktor.client.statement.ReadersKt$readRawBytes$1(continuation);
        java.lang.Object obj2 = readersKt$readRawBytes$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readersKt$readRawBytes$1.label;
        if (i != 0) {
        }
        return kotlinx.io.SourcesKt.readByteArray((kotlinx.io.Source) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @kotlin.Deprecated(message = "This method was renamed to readRawBytes() to reflect what it does.", replaceWith = @kotlin.ReplaceWith(expression = "readRawBytes()", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readBytes(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super byte[]> continuation) {
        io.ktor.client.statement.ReadersKt$readBytes$3 readersKt$readBytes$3;
        int i;
        if (continuation instanceof io.ktor.client.statement.ReadersKt$readBytes$3) {
            readersKt$readBytes$3 = (io.ktor.client.statement.ReadersKt$readBytes$3) continuation;
            if ((readersKt$readBytes$3.label & Integer.MIN_VALUE) != 0) {
                readersKt$readBytes$3.label -= Integer.MIN_VALUE;
                java.lang.Object obj = readersKt$readBytes$3.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readersKt$readBytes$3.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.utils.io.ByteReadChannel rawContent = httpResponse.getRawContent();
                    readersKt$readBytes$3.label = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(rawContent, readersKt$readBytes$3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlinx.io.SourcesKt.readByteArray((kotlinx.io.Source) obj);
            }
        }
        readersKt$readBytes$3 = new io.ktor.client.statement.ReadersKt$readBytes$3(continuation);
        java.lang.Object obj2 = readersKt$readBytes$3.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readersKt$readBytes$3.label;
        if (i != 0) {
        }
        return kotlinx.io.SourcesKt.readByteArray((kotlinx.io.Source) obj2);
    }

    public static final java.lang.Object discardRemaining(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object discard$default = io.ktor.utils.io.ByteReadChannelOperationsKt.discard$default(httpResponse.getRawContent(), 0L, continuation, 1, null);
        return discard$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? discard$default : kotlin.Unit.INSTANCE;
    }
}
