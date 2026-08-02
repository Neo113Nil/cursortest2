package io.ktor.http.content;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.http.content.MultipartKt", f = "Multipart.kt", i = {0, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE}, m = "readAllParts", n = {"$this$readAllParts", "$this$readAllParts", "parts"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class MultipartKt$readAllParts$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return io.ktor.http.content.MultipartKt.readAllParts(null, this);
    }

    MultipartKt$readAllParts$1(kotlin.coroutines.Continuation<? super io.ktor.http.content.MultipartKt$readAllParts$1> continuation) {
        super(continuation);
    }
}
