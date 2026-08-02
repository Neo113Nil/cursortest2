package io.ktor.serialization.kotlinx.json;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ByteWriteChannel;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$serialize$2", f = "ExperimentalJsonConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class ExperimentalJsonConverter$serialize$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<io.ktor.utils.io.ByteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.io.Buffer Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ((io.ktor.utils.io.ByteWriteChannel) this.getHighSpeedVideoFpsRangesFor).getWriteBuffer().transferFrom(this.Camera2StreamConfigurationMap);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$serialize$2) create(byteWriteChannel, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$serialize$2 experimentalJsonConverter$serialize$2 = new io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$serialize$2(this.Camera2StreamConfigurationMap, continuation);
        experimentalJsonConverter$serialize$2.getHighSpeedVideoFpsRangesFor = obj;
        return experimentalJsonConverter$serialize$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExperimentalJsonConverter$serialize$2(kotlinx.io.Buffer buffer, kotlin.coroutines.Continuation<? super io.ktor.serialization.kotlinx.json.ExperimentalJsonConverter$serialize$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = buffer;
    }
}
