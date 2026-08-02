package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/sequences/Sequence;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2", f = "JsonExtensionsJvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class JsonExtensionsJvmKt$deserializeSequence$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.sequences.Sequence<? extends java.lang.Object>>, java.lang.Object> {
    final /* synthetic */ kotlinx.serialization.json.Json getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.util.reflect.TypeInfo getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlinx.serialization.json.JvmStreamsKt.decodeToSequence$default(this.getHighResolutionOutputSizeshNQ4ISI, io.ktor.utils.io.jvm.javaio.BlockingKt.toInputStream$default(this.getHighSpeedVideoSizes, null, 1, null), io.ktor.serialization.kotlinx.SerializerLookupKt.serializerForTypeInfo(this.getHighResolutionOutputSizeshNQ4ISI.getSerializersModule(), io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensionsKt.argumentTypeInfo(this.getHighSpeedVideoFpsRanges)), null, 4, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.sequences.Sequence<? extends java.lang.Object>> continuation) {
        return ((io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonExtensionsJvmKt$deserializeSequence$2(io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.util.reflect.TypeInfo typeInfo, kotlinx.serialization.json.Json json, kotlin.coroutines.Continuation<? super io.ktor.serialization.kotlinx.json.JsonExtensionsJvmKt$deserializeSequence$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = byteReadChannel;
        this.getHighSpeedVideoFpsRanges = typeInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = json;
    }
}
