package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {80, 120, 89}, m = "serialize", n = {"$this$serialize", "serializer", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "channel", "jsonArraySymbols", "channel", "jsonArraySymbols"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class KotlinxSerializationJsonExtensions$serialize$3<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.access$serialize(this.getInputSizeshNQ4ISI, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KotlinxSerializationJsonExtensions$serialize$3(io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions, kotlin.coroutines.Continuation<? super io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$3> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = kotlinxSerializationJsonExtensions;
    }
}
