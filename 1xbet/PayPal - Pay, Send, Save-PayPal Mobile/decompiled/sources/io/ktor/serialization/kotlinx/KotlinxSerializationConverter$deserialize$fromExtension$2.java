package io.ktor.serialization.kotlinx;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2", f = "KotlinxSerializationConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class KotlinxSerializationConverter$deserialize$fromExtension$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ io.ktor.utils.io.ByteReadChannel getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.Camera2StreamConfigurationMap != null || this.getHighSpeedVideoFpsRanges.isClosedForRead());
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return ((io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2) create(obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2 kotlinxSerializationConverter$deserialize$fromExtension$2 = new io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2(this.getHighSpeedVideoFpsRanges, continuation);
        kotlinxSerializationConverter$deserialize$fromExtension$2.Camera2StreamConfigurationMap = obj;
        return kotlinxSerializationConverter$deserialize$fromExtension$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    KotlinxSerializationConverter$deserialize$fromExtension$2(io.ktor.utils.io.ByteReadChannel byteReadChannel, kotlin.coroutines.Continuation<? super io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$fromExtension$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = byteReadChannel;
    }
}
