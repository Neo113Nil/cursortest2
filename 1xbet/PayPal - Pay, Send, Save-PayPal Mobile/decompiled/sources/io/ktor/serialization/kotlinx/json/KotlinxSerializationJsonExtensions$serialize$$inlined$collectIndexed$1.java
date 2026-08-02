package io.ktor.serialization.kotlinx.json;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¸\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2;", "Lkotlinx/coroutines/flow/FlowCollector;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getInputFormats", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "kotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    final /* synthetic */ io.ktor.utils.io.ByteWriteChannel Camera2StreamConfigurationMap;
    final /* synthetic */ io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.serialization.KSerializer getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.nio.charset.Charset getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ io.ktor.serialization.kotlinx.json.JsonArraySymbols getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    public KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1(io.ktor.utils.io.ByteWriteChannel byteWriteChannel, io.ktor.serialization.kotlinx.json.JsonArraySymbols jsonArraySymbols, io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions kotlinxSerializationJsonExtensions, kotlinx.serialization.KSerializer kSerializer, java.nio.charset.Charset charset) {
        this.Camera2StreamConfigurationMap = byteWriteChannel;
        this.getHighSpeedVideoSizes = jsonArraySymbols;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinxSerializationJsonExtensions;
        this.getHighSpeedVideoFpsRanges = kSerializer;
        this.getHighSpeedVideoFpsRangesFor = charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (r12.flush(r0) == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r1, r2, 0, 0, r0, 6, null) == r8) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r1, r13, 0, 0, r0, 6, null) != r8) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.AnonymousClass1 anonymousClass1;
        int i;
        kotlinx.serialization.json.Json json;
        if (continuation instanceof io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.AnonymousClass1) {
            anonymousClass1 = (io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.AnonymousClass1) continuation;
            if ((anonymousClass1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                anonymousClass1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = anonymousClass1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i2 = this.Camera2StreamConfigurationMap;
                    this.Camera2StreamConfigurationMap = i2 + 1;
                    if (i2 < 0) {
                        throw new java.lang.ArithmeticException("Index overflow has happened");
                    }
                    if (i2 > 0) {
                        io.ktor.utils.io.ByteWriteChannel byteWriteChannel = this.Camera2StreamConfigurationMap;
                        byte[] bArr = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = t;
                        anonymousClass1.getHighSpeedVideoFpsRanges = 1;
                    }
                } else if (i == 1) {
                    t = (T) anonymousClass1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    io.ktor.utils.io.ByteWriteChannel byteWriteChannel2 = this.Camera2StreamConfigurationMap;
                    anonymousClass1.getHighSpeedVideoFpsRanges = 3;
                }
                json = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.String encodeToString = json.encodeToString(this.getHighSpeedVideoFpsRanges, t);
                io.ktor.utils.io.ByteWriteChannel byteWriteChannel3 = this.Camera2StreamConfigurationMap;
                byte[] byteArray = io.ktor.utils.io.core.StringsKt.toByteArray(encodeToString, this.getHighSpeedVideoFpsRangesFor);
                anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = null;
                anonymousClass1.getHighSpeedVideoFpsRanges = 2;
            }
        }
        anonymousClass1 = new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.AnonymousClass1(continuation);
        java.lang.Object obj2 = anonymousClass1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        json = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String encodeToString2 = json.encodeToString(this.getHighSpeedVideoFpsRanges, t);
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel32 = this.Camera2StreamConfigurationMap;
        byte[] byteArray2 = io.ktor.utils.io.core.StringsKt.toByteArray(encodeToString2, this.getHighSpeedVideoFpsRangesFor);
        anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = null;
        anonymousClass1.getHighSpeedVideoFpsRanges = 2;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", f = "KotlinxSerializationJsonExtensions.kt", i = {0}, l = {120, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "emit", n = {com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, s = {"L$0"})
    /* renamed from: io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.getHighSpeedVideoFpsRangesFor = obj;
            this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
            return io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1.this.emit(null, this);
        }

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }
    }
}
