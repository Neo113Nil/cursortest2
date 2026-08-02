package io.ktor.client.call;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/client/call/HttpClientCall;", "save", "(Lio/ktor/client/call/HttpClientCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SavedCallKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object save(io.ktor.client.call.HttpClientCall httpClientCall, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
        io.ktor.client.call.SavedCallKt$save$1 savedCallKt$save$1;
        int i;
        if (continuation instanceof io.ktor.client.call.SavedCallKt$save$1) {
            savedCallKt$save$1 = (io.ktor.client.call.SavedCallKt$save$1) continuation;
            if ((savedCallKt$save$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                savedCallKt$save$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = savedCallKt$save$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = savedCallKt$save$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.utils.io.ByteReadChannel rawContent = httpClientCall.getResponse().getRawContent();
                    savedCallKt$save$1.getHighResolutionOutputSizeshNQ4ISI = httpClientCall;
                    savedCallKt$save$1.getHighSpeedVideoSizes = 1;
                    obj = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(rawContent, savedCallKt$save$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpClientCall = (io.ktor.client.call.HttpClientCall) savedCallKt$save$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new io.ktor.client.call.SavedHttpCall(httpClientCall.getClient(), httpClientCall.getRequest(), httpClientCall.getResponse(), kotlinx.io.SourcesKt.readByteArray((kotlinx.io.Source) obj));
            }
        }
        savedCallKt$save$1 = new io.ktor.client.call.SavedCallKt$save$1(continuation);
        java.lang.Object obj2 = savedCallKt$save$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = savedCallKt$save$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return new io.ktor.client.call.SavedHttpCall(httpClientCall.getClient(), httpClientCall.getRequest(), httpClientCall.getResponse(), kotlinx.io.SourcesKt.readByteArray((kotlinx.io.Source) obj2));
    }
}
