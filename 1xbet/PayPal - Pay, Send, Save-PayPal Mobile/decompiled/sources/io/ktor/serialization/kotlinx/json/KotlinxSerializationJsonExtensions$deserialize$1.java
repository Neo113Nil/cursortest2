package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions", f = "KotlinxSerializationJsonExtensions.kt", i = {}, l = {66}, m = "deserialize", n = {}, s = {})
/* loaded from: classes17.dex */
final class KotlinxSerializationJsonExtensions$deserialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.deserialize(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KotlinxSerializationJsonExtensions$deserialize$1(io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions, kotlin.coroutines.Continuation<? super io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$deserialize$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinxSerializationJsonExtensions;
    }
}
