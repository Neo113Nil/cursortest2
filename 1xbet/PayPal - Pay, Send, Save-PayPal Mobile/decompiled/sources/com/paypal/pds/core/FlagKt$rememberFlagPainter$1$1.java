package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.core.FlagKt$rememberFlagPainter$1$1", f = "Flag.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, nl = {109}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class FlagKt$rememberFlagPainter$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.pds.core.AsyncFlagPainter Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.core.FlagKt$rememberFlagPainter$1$1$1", f = "Flag.kt", i = {1}, l = {101, 102}, m = "invokeSuspend", n = {"countriesMap"}, nl = {102, 104}, s = {"L$0"}, v = 2)
    /* renamed from: com.paypal.pds.core.FlagKt$rememberFlagPainter$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.pds.core.AsyncFlagPainter getHighSpeedVideoFpsRanges;
        java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ android.content.Context getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        
            if (r6 != r0) goto L12;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.util.Map map;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap = 1;
                obj = com.paypal.pds.core.FlagProvider.INSTANCE.getOrLoadCountriesCache$pds_release(this.getHighSpeedVideoSizes, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (java.util.Map) this.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.ui.graphics.ImageBitmap imageBitmap = (androidx.compose.ui.graphics.ImageBitmap) obj;
                    java.lang.String lowerCase = this.getHighResolutionOutputSizeshNQ4ISI.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    com.paypal.pds.core.FlagProvider.Country country = (com.paypal.pds.core.FlagProvider.Country) map.get(lowerCase);
                    this.getHighSpeedVideoFpsRanges.update(imageBitmap, country == null ? country.getImageIndex() : 0, imageBitmap.getWidth());
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.util.Map map2 = (java.util.Map) obj;
            this.getHighSpeedVideoFpsRangesFor = map2;
            this.Camera2StreamConfigurationMap = 2;
            java.lang.Object orLoadSpriteCache$pds_release = com.paypal.pds.core.FlagProvider.INSTANCE.getOrLoadSpriteCache$pds_release(this.getHighSpeedVideoSizes, this);
            if (orLoadSpriteCache$pds_release != coroutine_suspended) {
                map = map2;
                obj = orLoadSpriteCache$pds_release;
                androidx.compose.ui.graphics.ImageBitmap imageBitmap2 = (androidx.compose.ui.graphics.ImageBitmap) obj;
                java.lang.String lowerCase2 = this.getHighResolutionOutputSizeshNQ4ISI.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                com.paypal.pds.core.FlagProvider.Country country2 = (com.paypal.pds.core.FlagProvider.Country) map.get(lowerCase2);
                if (country2 == null) {
                }
                this.getHighSpeedVideoFpsRanges.update(imageBitmap2, country2 == null ? country2.getImageIndex() : 0, imageBitmap2.getWidth());
                return kotlin.Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.pds.core.FlagKt$rememberFlagPainter$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.paypal.pds.core.FlagKt$rememberFlagPainter$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(android.content.Context context, java.lang.String str, com.paypal.pds.core.AsyncFlagPainter asyncFlagPainter, kotlin.coroutines.Continuation<? super com.paypal.pds.core.FlagKt$rememberFlagPainter$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = context;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRanges = asyncFlagPainter;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getIO(), new com.paypal.pds.core.FlagKt$rememberFlagPainter$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.core.FlagKt$rememberFlagPainter$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.core.FlagKt$rememberFlagPainter$1$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlagKt$rememberFlagPainter$1$1(android.content.Context context, java.lang.String str, com.paypal.pds.core.AsyncFlagPainter asyncFlagPainter, kotlin.coroutines.Continuation<? super com.paypal.pds.core.FlagKt$rememberFlagPainter$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = asyncFlagPainter;
    }
}
