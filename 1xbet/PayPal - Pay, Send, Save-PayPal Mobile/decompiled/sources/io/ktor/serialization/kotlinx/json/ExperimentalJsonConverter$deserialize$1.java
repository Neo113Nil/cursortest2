package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter", f = "ExperimentalJsonConverter.kt", i = {0}, l = {51}, m = "deserialize", n = {"serializer"}, s = {"L$0"})
/* loaded from: classes17.dex */
final class ExperimentalJsonConverter$deserialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.deserialize(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExperimentalJsonConverter$deserialize$1(io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter experimentalJsonConverter, kotlin.coroutines.Continuation<? super io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$deserialize$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = experimentalJsonConverter;
    }
}
