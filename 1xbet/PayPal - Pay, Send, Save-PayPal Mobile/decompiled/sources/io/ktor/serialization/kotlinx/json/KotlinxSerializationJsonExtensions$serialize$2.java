package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ByteWriteChannel;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2", f = "KotlinxSerializationJsonExtensions.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class KotlinxSerializationJsonExtensions$serialize$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.ByteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.nio.charset.Charset Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlinx.serialization.KSerializer<?> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            io.ktor.utils.io.ByteWriteChannel byteWriteChannel = (io.ktor.utils.io.ByteWriteChannel) this.getOutputFormats;
            io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object obj2 = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            kotlinx.serialization.KSerializer<?> kSerializer = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(kSerializer, "");
            this.getHighSpeedVideoSizes = 1;
            if (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions.access$serialize(kotlinxSerializationJsonExtensions, (kotlinx.coroutines.flow.Flow) obj2, kSerializer, this.Camera2StreamConfigurationMap, byteWriteChannel, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2) create(byteWriteChannel, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2 kotlinxSerializationJsonExtensions$serialize$2 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        kotlinxSerializationJsonExtensions$serialize$2.getOutputFormats = obj;
        return kotlinxSerializationJsonExtensions$serialize$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KotlinxSerializationJsonExtensions$serialize$2(io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions, java.lang.Object obj, kotlinx.serialization.KSerializer<?> kSerializer, java.nio.charset.Charset charset, kotlin.coroutines.Continuation<? super io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinxSerializationJsonExtensions;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor = kSerializer;
        this.Camera2StreamConfigurationMap = charset;
    }
}
