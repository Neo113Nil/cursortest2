package com.ingo.sdk.android.ux.feature.manual_verification;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$loadSelfieImage$2", f = "CaptureIdentityDocumentsFragment.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class CaptureIdentityDocumentsFragment$loadSelfieImage$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.ingo.sdk.android.ux.activity.ActivityResultEvent getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$loadSelfieImage$2$1", f = "CaptureIdentityDocumentsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$loadSelfieImage$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.ingo.sdk.android.ux.activity.ActivityResultEvent getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String str;
            androidx.compose.runtime.MutableState mutableState;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), null, 2, null);
            java.lang.String stringExtra = this.getHighResolutionOutputSizeshNQ4ISI.getIntent().getStringExtra(com.ingo.sdk.android.ux.activity.IngoSdkCameraActivity.SELFIE_URI);
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Got URI ".concat(java.lang.String.valueOf(stringExtra)), null, 2, null);
            java.io.File file = stringExtra != null ? new java.io.File(stringExtra) : null;
            if (file != null) {
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Selfie ID File Size: ".concat(java.lang.String.valueOf(file.length())), null, 2, null);
                int access$exifToDegrees = com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment.access$exifToDegrees(this.getHighSpeedVideoSizes, new androidx.exifinterface.media.ExifInterface(stringExtra).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1));
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.preRotate(access$exifToDegrees);
                android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile(stringExtra);
                com.ingo.sdk.android.core.ux.utils.ImageResizer imageResizer = com.ingo.sdk.android.core.ux.utils.ImageResizer.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNull(decodeFile);
                android.graphics.Bitmap reduceBitmapSize = imageResizer.reduceBitmapSize(decodeFile, 2073600);
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(reduceBitmapSize, 0, 0, reduceBitmapSize.getWidth(), reduceBitmapSize.getHeight(), matrix, true);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "");
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                createBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Selfie ID Bytes Size: ".concat(java.lang.String.valueOf(byteArray.length)), null, 2, null);
                this.getHighSpeedVideoSizes.getHighSpeedVideoSizes = android.util.Base64.encodeToString(byteArray, 0);
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                str = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(ingoLogging, "Selfie ID Base 64 Length: ".concat(java.lang.String.valueOf(str != null ? kotlin.coroutines.jvm.internal.Boxing.boxInt(str.length()) : null)), null, 2, null);
                mutableState = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                mutableState.setValue(androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(createBitmap));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$loadSelfieImage$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$loadSelfieImage$2.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.ingo.sdk.android.ux.activity.ActivityResultEvent activityResultEvent, com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment, kotlin.coroutines.Continuation<? super com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$loadSelfieImage$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = activityResultEvent;
            this.getHighSpeedVideoSizes = captureIdentityDocumentsFragment;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.core.IngoDispatchers.class));
            if (obj2 != null) {
                this.Camera2StreamConfigurationMap = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(((com.ingo.sdk.kotlin.common.core.IngoDispatchers) obj2).getBackgroundDispatcher(), new com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$loadSelfieImage$2.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.core.IngoDispatchers");
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
        return ((com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$loadSelfieImage$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$loadSelfieImage$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptureIdentityDocumentsFragment$loadSelfieImage$2(com.ingo.sdk.android.ux.activity.ActivityResultEvent activityResultEvent, com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment captureIdentityDocumentsFragment, kotlin.coroutines.Continuation<? super com.ingo.sdk.android.ux.feature.manual_verification.CaptureIdentityDocumentsFragment$loadSelfieImage$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = activityResultEvent;
        this.getHighSpeedVideoSizes = captureIdentityDocumentsFragment;
    }
}
