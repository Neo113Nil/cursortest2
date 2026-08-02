package io.ktor.client.request.forms;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5, 6}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 125, 126, 131, 135, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 142, 146, 146, 146}, m = "writeTo", n = {"channel", "part", "channel", "part", "channel", "part", "channel", "channel", "channel", "channel"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes17.dex */
final class MultiPartFormDataContent$writeTo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.client.request.forms.MultiPartFormDataContent getHighSpeedVideoSizesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.writeTo(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiPartFormDataContent$writeTo$1(io.ktor.client.request.forms.MultiPartFormDataContent multiPartFormDataContent, kotlin.coroutines.Continuation<? super io.ktor.client.request.forms.MultiPartFormDataContent$writeTo$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = multiPartFormDataContent;
    }
}
