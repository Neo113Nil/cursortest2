package io.ktor.serialization.kotlinx;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", i = {0, 0, 0, 0}, l = {48}, m = "serialize", n = {org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "typeInfo", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes17.dex */
final class KotlinxSerializationConverter$serialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ io.ktor.serialization.kotlinx.KotlinxSerializationConverter getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getInputFormats.serialize(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KotlinxSerializationConverter$serialize$1(io.ktor.serialization.kotlinx.KotlinxSerializationConverter kotlinxSerializationConverter, kotlin.coroutines.Continuation<? super io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serialize$1> continuation) {
        super(continuation);
        this.getInputFormats = kotlinxSerializationConverter;
    }
}
