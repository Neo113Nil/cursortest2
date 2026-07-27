package io.ktor.client.call;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* compiled from: SavedCall.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/call/HttpClientCall;", "save", "(Lio/ktor/client/call/HttpClientCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavedCallKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object save(HttpClientCall httpClientCall, Continuation<? super HttpClientCall> continuation) {
        SavedCallKt$save$1 savedCallKt$save$1;
        int i;
        if (continuation instanceof SavedCallKt$save$1) {
            savedCallKt$save$1 = (SavedCallKt$save$1) continuation;
            if ((savedCallKt$save$1.label & Integer.MIN_VALUE) != 0) {
                savedCallKt$save$1.label -= Integer.MIN_VALUE;
                Object obj = savedCallKt$save$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savedCallKt$save$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteReadChannel rawContent = httpClientCall.getResponse().getRawContent();
                    savedCallKt$save$1.L$0 = httpClientCall;
                    savedCallKt$save$1.label = 1;
                    obj = ByteReadChannelOperationsKt.readRemaining(rawContent, savedCallKt$save$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpClientCall = (HttpClientCall) savedCallKt$save$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return new SavedHttpCall(httpClientCall.getClient(), httpClientCall.getRequest(), httpClientCall.getResponse(), SourcesKt.readByteArray((Source) obj));
            }
        }
        savedCallKt$save$1 = new SavedCallKt$save$1(continuation);
        Object obj2 = savedCallKt$save$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savedCallKt$save$1.label;
        if (i != 0) {
        }
        return new SavedHttpCall(httpClientCall.getClient(), httpClientCall.getRequest(), httpClientCall.getResponse(), SourcesKt.readByteArray((Source) obj2));
    }
}
