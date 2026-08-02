package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.text.font.Font getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.text.font.PlatformFontLoader getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
        final /* synthetic */ androidx.compose.ui.text.font.Font Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.ui.text.font.PlatformFontLoader getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.getHighSpeedVideoFpsRangesFor = 1;
                    obj = kotlinx.coroutines.TimeoutKt.withTimeout(15000L, new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1.AnonymousClass1.C00371(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (obj != null) {
                    return obj;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to load font ");
                sb.append(this.Camera2StreamConfigurationMap);
                throw new java.lang.IllegalStateException(sb.toString());
            } catch (java.lang.Exception e) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to load font ");
                sb2.append(this.Camera2StreamConfigurationMap);
                throw new java.lang.IllegalStateException(sb2.toString(), e);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00371 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
            final /* synthetic */ androidx.compose.ui.text.font.PlatformFontLoader getHighSpeedVideoFpsRanges;
            final /* synthetic */ androidx.compose.ui.text.font.Font getHighSpeedVideoFpsRangesFor;
            int getHighSpeedVideoSizes;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.getHighSpeedVideoSizes;
                if (i != 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoSizes = 1;
                java.lang.Object awaitLoad = this.getHighSpeedVideoFpsRanges.awaitLoad(this.getHighSpeedVideoFpsRangesFor, this);
                return awaitLoad == coroutine_suspended ? coroutine_suspended : awaitLoad;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.jvm.functions.Function2
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
                return ((androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1.AnonymousClass1.C00371) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1.AnonymousClass1.C00371(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00371(androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, androidx.compose.ui.text.font.Font font, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1.AnonymousClass1.C00371> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRanges = platformFontLoader;
                this.getHighSpeedVideoFpsRangesFor = font;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
        public java.lang.Object invoke(kotlin.coroutines.Continuation<java.lang.Object> continuation) {
            return ((androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.ui.text.font.Font font, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1.AnonymousClass1> continuation) {
            super(1, continuation);
            this.Camera2StreamConfigurationMap = font;
            this.getHighSpeedVideoFpsRanges = platformFontLoader;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.text.font.AsyncTypefaceCache asyncTypefaceCache;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        asyncTypefaceCache = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = 1;
        java.lang.Object runCached = asyncTypefaceCache.runCached(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, true, new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, null), this);
        return runCached == coroutine_suspended ? coroutine_suspended : runCached;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        return ((androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontListFontFamilyTypefaceAdapter$preload$3$2$1(androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, androidx.compose.ui.text.font.Font font, androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = fontListFontFamilyTypefaceAdapter;
        this.getHighSpeedVideoFpsRanges = font;
        this.getHighSpeedVideoFpsRangesFor = platformFontLoader;
    }
}
