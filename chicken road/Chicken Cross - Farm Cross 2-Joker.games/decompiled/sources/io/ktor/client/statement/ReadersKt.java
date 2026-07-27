package io.ktor.client.statement;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* compiled from: Readers.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0087@¢\u0006\u0004\b\u0004\u0010\u0007\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u0000H\u0086@¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "", "count", "", "readBytes", "(Lio/ktor/client/statement/HttpResponse;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRawBytes", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "discardRemaining", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReadersKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readBytes(HttpResponse httpResponse, int i, Continuation<? super byte[]> continuation) {
        ReadersKt$readBytes$1 readersKt$readBytes$1;
        int i2;
        if (continuation instanceof ReadersKt$readBytes$1) {
            readersKt$readBytes$1 = (ReadersKt$readBytes$1) continuation;
            if ((readersKt$readBytes$1.label & Integer.MIN_VALUE) != 0) {
                readersKt$readBytes$1.label -= Integer.MIN_VALUE;
                ReadersKt$readBytes$1 readersKt$readBytes$12 = readersKt$readBytes$1;
                Object obj = readersKt$readBytes$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = readersKt$readBytes$12.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    byte[] bArr = (byte[]) readersKt$readBytes$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    return bArr;
                }
                ResultKt.throwOnFailure(obj);
                byte[] bArr2 = new byte[i];
                ByteReadChannel rawContent = httpResponse.getRawContent();
                readersKt$readBytes$12.L$0 = bArr2;
                readersKt$readBytes$12.label = 1;
                return ByteReadChannelOperationsKt.readFully$default(rawContent, bArr2, 0, 0, readersKt$readBytes$12, 6, null) == coroutine_suspended ? coroutine_suspended : bArr2;
            }
        }
        readersKt$readBytes$1 = new ReadersKt$readBytes$1(continuation);
        ReadersKt$readBytes$1 readersKt$readBytes$122 = readersKt$readBytes$1;
        Object obj2 = readersKt$readBytes$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = readersKt$readBytes$122.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readRawBytes(HttpResponse httpResponse, Continuation<? super byte[]> continuation) {
        ReadersKt$readRawBytes$1 readersKt$readRawBytes$1;
        int i;
        if (continuation instanceof ReadersKt$readRawBytes$1) {
            readersKt$readRawBytes$1 = (ReadersKt$readRawBytes$1) continuation;
            if ((readersKt$readRawBytes$1.label & Integer.MIN_VALUE) != 0) {
                readersKt$readRawBytes$1.label -= Integer.MIN_VALUE;
                Object obj = readersKt$readRawBytes$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readersKt$readRawBytes$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteReadChannel rawContent = httpResponse.getRawContent();
                    readersKt$readRawBytes$1.label = 1;
                    obj = ByteReadChannelOperationsKt.readRemaining(rawContent, readersKt$readRawBytes$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return SourcesKt.readByteArray((Source) obj);
            }
        }
        readersKt$readRawBytes$1 = new ReadersKt$readRawBytes$1(continuation);
        Object obj2 = readersKt$readRawBytes$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readersKt$readRawBytes$1.label;
        if (i != 0) {
        }
        return SourcesKt.readByteArray((Source) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Deprecated(message = "This method was renamed to readRawBytes() to reflect what it does.", replaceWith = @ReplaceWith(expression = "readRawBytes()", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object readBytes(HttpResponse httpResponse, Continuation<? super byte[]> continuation) {
        ReadersKt$readBytes$3 readersKt$readBytes$3;
        int i;
        if (continuation instanceof ReadersKt$readBytes$3) {
            readersKt$readBytes$3 = (ReadersKt$readBytes$3) continuation;
            if ((readersKt$readBytes$3.label & Integer.MIN_VALUE) != 0) {
                readersKt$readBytes$3.label -= Integer.MIN_VALUE;
                Object obj = readersKt$readBytes$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = readersKt$readBytes$3.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteReadChannel rawContent = httpResponse.getRawContent();
                    readersKt$readBytes$3.label = 1;
                    obj = ByteReadChannelOperationsKt.readRemaining(rawContent, readersKt$readBytes$3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return SourcesKt.readByteArray((Source) obj);
            }
        }
        readersKt$readBytes$3 = new ReadersKt$readBytes$3(continuation);
        Object obj2 = readersKt$readBytes$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = readersKt$readBytes$3.label;
        if (i != 0) {
        }
        return SourcesKt.readByteArray((Source) obj2);
    }

    public static final Object discardRemaining(HttpResponse httpResponse, Continuation<? super Unit> continuation) {
        Object discard$default = ByteReadChannelOperationsKt.discard$default(httpResponse.getRawContent(), 0L, continuation, 1, null);
        return discard$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? discard$default : Unit.INSTANCE;
    }
}
