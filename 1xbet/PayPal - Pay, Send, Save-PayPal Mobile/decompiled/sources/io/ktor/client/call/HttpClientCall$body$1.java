package io.ktor.client.call;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", i = {}, l = {125}, m = com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, n = {}, s = {})
/* loaded from: classes3.dex */
final class HttpClientCall$body$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ io.ktor.client.call.HttpClientCall getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.body(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpClientCall$body$1(io.ktor.client.call.HttpClientCall httpClientCall, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall$body$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = httpClientCall;
    }
}
