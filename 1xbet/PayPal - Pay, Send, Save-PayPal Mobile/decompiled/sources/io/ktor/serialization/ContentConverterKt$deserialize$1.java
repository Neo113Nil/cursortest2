package io.ktor.serialization;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.ContentConverterKt", f = "ContentConverter.kt", i = {0, 0}, l = {113}, m = "deserialize", n = {com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "typeInfo"}, s = {"L$0", "L$1"})
/* loaded from: classes17.dex */
final class ContentConverterKt$deserialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return io.ktor.serialization.ContentConverterKt.deserialize(null, null, null, null, this);
    }

    ContentConverterKt$deserialize$1(kotlin.coroutines.Continuation<? super io.ktor.serialization.ContentConverterKt$deserialize$1> continuation) {
        super(continuation);
    }
}
