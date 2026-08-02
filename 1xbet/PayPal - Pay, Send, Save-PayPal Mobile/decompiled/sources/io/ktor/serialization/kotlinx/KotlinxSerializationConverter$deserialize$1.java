package io.ktor.serialization.kotlinx;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", i = {0, 0, 0, 1, 1}, l = {63, 67}, m = "deserialize", n = {io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "typeInfo", "content", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "serializer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes17.dex */
final class KotlinxSerializationConverter$deserialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ io.ktor.serialization.kotlinx.KotlinxSerializationConverter getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.deserialize(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KotlinxSerializationConverter$deserialize$1(io.ktor.serialization.kotlinx.KotlinxSerializationConverter kotlinxSerializationConverter, kotlin.coroutines.Continuation<? super io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = kotlinxSerializationConverter;
    }
}
