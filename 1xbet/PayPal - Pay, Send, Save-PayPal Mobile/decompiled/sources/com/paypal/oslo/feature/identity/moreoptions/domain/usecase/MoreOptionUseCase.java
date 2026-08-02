package com.paypal.oslo.feature.identity.moreoptions.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/domain/usecase/MoreOptionUseCase;", "", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/repository/MoreOptionRepository;", "repository", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/repository/BiometricEligibilityRepository;", "biometricEligibilityRepository", "<init>", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/repository/MoreOptionRepository;Lcom/paypal/oslo/feature/identity/biometriclogin/domain/repository/BiometricEligibilityRepository;)V", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "currentOptionType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/MoreOptionError;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/MoreOptionResult;", "invoke", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/repository/MoreOptionRepository;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/repository/BiometricEligibilityRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MoreOptionUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Set<com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType> Camera2StreamConfigurationMap = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType[]{com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_NEW_CODE, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER});

    @javax.inject.Inject
    public MoreOptionUseCase(com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository moreOptionRepository, com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository biometricEligibilityRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moreOptionRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(biometricEligibilityRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = moreOptionRepository;
        this.getHighSpeedVideoFpsRanges = biometricEligibilityRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
    
        if (r11 == r1) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionError, com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionResult>> continuation) {
        com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase$invoke$1 moreOptionUseCase$invoke$1;
        int i;
        int i2;
        java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list;
        java.lang.Object isEligibleForLogin;
        java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list2;
        boolean isRight;
        java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list3;
        if (continuation instanceof com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase$invoke$1) {
            moreOptionUseCase$invoke$1 = (com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase$invoke$1) continuation;
            if ((moreOptionUseCase$invoke$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                moreOptionUseCase$invoke$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = moreOptionUseCase$invoke$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moreOptionUseCase$invoke$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> allAuthOptions = this.getHighResolutionOutputSizeshNQ4ISI.getAllAuthOptions();
                    i2 = (optionType == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_PASSWORD || optionType == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.CREATE_NEW_PASSWORD) ? 1 : 0;
                    if (allAuthOptions.isEmpty() && i2 == 0) {
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionError.NoOptionsAvailable.INSTANCE);
                    }
                    if (i2 != 0) {
                        java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list4 = allAuthOptions;
                        if (!(list4 instanceof java.util.Collection) || !list4.isEmpty()) {
                            java.util.Iterator<T> it = list4.iterator();
                            while (it.hasNext()) {
                                if (((com.paypal.oslo.feature.identity.login.domain.model.AuthOptions) it.next()) instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption) {
                                }
                            }
                        }
                        list = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption>) allAuthOptions, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.INSTANCE);
                        com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository biometricEligibilityRepository = this.getHighSpeedVideoFpsRanges;
                        moreOptionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = optionType;
                        moreOptionUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(allAuthOptions);
                        moreOptionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = list;
                        moreOptionUseCase$invoke$1.Camera2StreamConfigurationMap = i2;
                        moreOptionUseCase$invoke$1.getHighSpeedVideoSizesFor = 1;
                        isEligibleForLogin = biometricEligibilityRepository.isEligibleForLogin(moreOptionUseCase$invoke$1);
                        if (isEligibleForLogin != coroutine_suspended) {
                            list2 = allAuthOptions;
                            obj = isEligibleForLogin;
                        }
                        return coroutine_suspended;
                    }
                    list = allAuthOptions;
                    com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository biometricEligibilityRepository2 = this.getHighSpeedVideoFpsRanges;
                    moreOptionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = optionType;
                    moreOptionUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(allAuthOptions);
                    moreOptionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = list;
                    moreOptionUseCase$invoke$1.Camera2StreamConfigurationMap = i2;
                    moreOptionUseCase$invoke$1.getHighSpeedVideoSizesFor = 1;
                    isEligibleForLogin = biometricEligibilityRepository2.isEligibleForLogin(moreOptionUseCase$invoke$1);
                    if (isEligibleForLogin != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z = moreOptionUseCase$invoke$1.getInputFormats;
                    int i3 = moreOptionUseCase$invoke$1.Camera2StreamConfigurationMap;
                    optionType = (com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType) moreOptionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    arrow.core.Either either = (arrow.core.Either) obj;
                    if (either instanceof arrow.core.Either.Right) {
                        java.util.List<com.paypal.oslo.feature.identity.moreoptions.domain.model.Option> options = ((com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionResult) ((arrow.core.Either.Right) either).getValue()).getOptions();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        for (java.lang.Object obj2 : options) {
                            com.paypal.oslo.feature.identity.moreoptions.domain.model.Option option = (com.paypal.oslo.feature.identity.moreoptions.domain.model.Option) obj2;
                            if (Camera2StreamConfigurationMap.contains(optionType) || optionType == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.CREATE_NEW_PASSWORD || option.getType() != optionType) {
                                arrayList.add(obj2);
                            }
                        }
                        java.util.ArrayList arrayList2 = arrayList;
                        if (arrayList2.isEmpty()) {
                            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionError.NoOptionsAvailable.INSTANCE);
                        }
                        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionResult(arrayList2));
                    }
                    if (either instanceof arrow.core.Either.Left) {
                        return arrow.core.EitherKt.left((com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionError) ((arrow.core.Either.Left) either).getValue());
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                int i4 = moreOptionUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list5 = (java.util.List) moreOptionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                list2 = (java.util.List) moreOptionUseCase$invoke$1.getHighSpeedVideoSizes;
                com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType2 = (com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType) moreOptionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                i2 = i4;
                optionType = optionType2;
                list = list5;
                isRight = ((arrow.core.Either) obj).isRight();
                if (isRight) {
                    java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list6 = list;
                    if (!(list6 instanceof java.util.Collection) || !list6.isEmpty()) {
                        java.util.Iterator<T> it2 = list6.iterator();
                        while (it2.hasNext()) {
                            if (((com.paypal.oslo.feature.identity.login.domain.model.AuthOptions) it2.next()) instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption) {
                            }
                        }
                    }
                    list3 = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption>) list, com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption.INSTANCE);
                    com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository moreOptionRepository = this.getHighResolutionOutputSizeshNQ4ISI;
                    moreOptionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = optionType;
                    moreOptionUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                    moreOptionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    moreOptionUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                    moreOptionUseCase$invoke$1.Camera2StreamConfigurationMap = i2;
                    moreOptionUseCase$invoke$1.getInputFormats = isRight;
                    moreOptionUseCase$invoke$1.getHighSpeedVideoSizesFor = 2;
                    obj = moreOptionRepository.getOptions(list3, optionType, moreOptionUseCase$invoke$1);
                }
                list3 = list;
                com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository moreOptionRepository2 = this.getHighResolutionOutputSizeshNQ4ISI;
                moreOptionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = optionType;
                moreOptionUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
                moreOptionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                moreOptionUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
                moreOptionUseCase$invoke$1.Camera2StreamConfigurationMap = i2;
                moreOptionUseCase$invoke$1.getInputFormats = isRight;
                moreOptionUseCase$invoke$1.getHighSpeedVideoSizesFor = 2;
                obj = moreOptionRepository2.getOptions(list3, optionType, moreOptionUseCase$invoke$1);
            }
        }
        moreOptionUseCase$invoke$1 = new com.paypal.oslo.feature.identity.moreoptions.domain.usecase.MoreOptionUseCase$invoke$1(this, continuation);
        java.lang.Object obj3 = moreOptionUseCase$invoke$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moreOptionUseCase$invoke$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        isRight = ((arrow.core.Either) obj3).isRight();
        if (isRight) {
        }
        list3 = list;
        com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository moreOptionRepository22 = this.getHighResolutionOutputSizeshNQ4ISI;
        moreOptionUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = optionType;
        moreOptionUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list2);
        moreOptionUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
        moreOptionUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list3);
        moreOptionUseCase$invoke$1.Camera2StreamConfigurationMap = i2;
        moreOptionUseCase$invoke$1.getInputFormats = isRight;
        moreOptionUseCase$invoke$1.getHighSpeedVideoSizesFor = 2;
        obj3 = moreOptionRepository22.getOptions(list3, optionType, moreOptionUseCase$invoke$1);
    }
}
