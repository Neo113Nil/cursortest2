package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000bH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0006*\u00020\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/ThalesGetAllCardsUseCase;", "", "Landroid/content/Context;", "context", "Lcom/paypal/android/taptopay/data/thales/card/ThalesGetDigitizedCardUseCase;", "thalesGetDigitizedCardUseCase", "<init>", "(Landroid/content/Context;Lcom/paypal/android/taptopay/data/thales/card/ThalesGetDigitizedCardUseCase;)V", "", "getHighSpeedVideoFpsRanges", "()Z", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/card/DigitizedCard;", "Lcom/paypal/android/taptopay/domain/model/card/GetAllCardsError;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "Lcom/paypal/android/taptopay/data/thales/card/ThalesGetDigitizedCardUseCase;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThalesGetAllCardsUseCase {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;

    public ThalesGetAllCardsUseCase(android.content.Context context, com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase thalesGetDigitizedCardUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thalesGetDigitizedCardUseCase, "");
        this.Camera2StreamConfigurationMap = thalesGetDigitizedCardUseCase;
        this.getHighSpeedVideoFpsRanges = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b1, code lost:
    
        if (r12 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00b1 -> B:11:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<? extends java.util.List<com.paypal.android.taptopay.domain.model.card.DigitizedCard>, com.paypal.android.taptopay.domain.model.card.GetAllCardsError>> continuation) {
        com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$invoke$1 thalesGetAllCardsUseCase$invoke$1;
        int i;
        com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase thalesGetAllCardsUseCase;
        com.paypal.android.taptopay.domain.Result result;
        com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase thalesGetAllCardsUseCase2;
        int length;
        java.lang.Object[] objArr;
        java.util.Collection collection;
        int i2;
        if (continuation instanceof com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$invoke$1) {
            thalesGetAllCardsUseCase$invoke$1 = (com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$invoke$1) continuation;
            if ((thalesGetAllCardsUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                thalesGetAllCardsUseCase$invoke$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = thalesGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = thalesGetAllCardsUseCase$invoke$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    thalesGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes = this;
                    thalesGetAllCardsUseCase$invoke$1.getOutputFormats = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$getThalesCards$2(this, null), thalesGetAllCardsUseCase$invoke$1);
                    if (obj != coroutine_suspended) {
                        thalesGetAllCardsUseCase = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    thalesGetAllCardsUseCase = (com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase) thalesGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = thalesGetAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    i2 = thalesGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                    objArr = (java.lang.Object[]) thalesGetAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap;
                    collection = (java.util.Collection) thalesGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    thalesGetAllCardsUseCase2 = (com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase) thalesGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.taptopay.domain.model.card.DigitizedCard digitizedCard = (com.paypal.android.taptopay.domain.model.card.DigitizedCard) obj;
                    if (digitizedCard != null) {
                        collection.add(digitizedCard);
                    }
                    i2++;
                    if (i2 < length) {
                        return new com.paypal.android.taptopay.domain.Result.Success((java.util.List) collection);
                    }
                    java.lang.String str = (java.lang.String) objArr[i2];
                    com.paypal.android.taptopay.data.thales.card.ThalesGetDigitizedCardUseCase thalesGetDigitizedCardUseCase = thalesGetAllCardsUseCase2.Camera2StreamConfigurationMap;
                    thalesGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizes = thalesGetAllCardsUseCase2;
                    thalesGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = collection;
                    thalesGetAllCardsUseCase$invoke$1.Camera2StreamConfigurationMap = objArr;
                    thalesGetAllCardsUseCase$invoke$1.getHighSpeedVideoFpsRanges = i2;
                    thalesGetAllCardsUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = length;
                    thalesGetAllCardsUseCase$invoke$1.getOutputFormats = 2;
                    obj = thalesGetDigitizedCardUseCase.invoke(str, thalesGetAllCardsUseCase$invoke$1);
                }
                result = (com.paypal.android.taptopay.domain.Result) obj;
                if (!(result instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
                    return new com.paypal.android.taptopay.domain.Result.Failure(((com.paypal.android.taptopay.domain.Result.Failure) result).getError());
                }
                if (!(result instanceof com.paypal.android.taptopay.domain.Result.Success)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.lang.Object[] objArr2 = (java.lang.Object[]) ((com.paypal.android.taptopay.domain.Result.Success) result).getResult();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                thalesGetAllCardsUseCase2 = thalesGetAllCardsUseCase;
                length = objArr2.length;
                objArr = objArr2;
                collection = arrayList;
                i2 = 0;
                if (i2 < length) {
                }
            }
        }
        thalesGetAllCardsUseCase$invoke$1 = new com.paypal.android.taptopay.data.thales.card.ThalesGetAllCardsUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = thalesGetAllCardsUseCase$invoke$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = thalesGetAllCardsUseCase$invoke$1.getOutputFormats;
        if (i != 0) {
        }
        result = (com.paypal.android.taptopay.domain.Result) obj2;
        if (!(result instanceof com.paypal.android.taptopay.domain.Result.Failure)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHighSpeedVideoFpsRanges() {
        com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMEligibilityResult checkDeviceEligibility = com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMEligibilityChecker.checkDeviceEligibility(this.getHighSpeedVideoFpsRanges);
        if (checkDeviceEligibility.getBiometricsSupport() == com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport.SUPPORTED) {
            try {
                com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager.INSTANCE.initialize(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.BIOMETRICS);
                return true;
            } catch (java.lang.Throwable th) {
                com.paypal.android.taptopay.data.thales.logging.LoggerKt.getLog().e("Error from Thales DeviceCVMManager.initialize", th);
                return false;
            }
        }
        if (checkDeviceEligibility.getDeviceKeyguardSupport() == com.gemalto.mfs.mwsdk.cdcvm.DeviceKeyguardSupport.SUPPORTED) {
            try {
                com.gemalto.mfs.mwsdk.dcm.cdcvm.DeviceCVMManager.INSTANCE.initialize(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod.DEVICE_KEYGUARD);
                return true;
            } catch (com.gemalto.mfs.mwsdk.exception.DeviceCVMException unused) {
            }
        }
        return false;
    }
}
