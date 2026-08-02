package com.paypal.oslo.feature.identity.moreoptions.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/data/repository/MoreOptionRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/repository/MoreOptionRepository;", "Lcom/paypal/oslo/feature/identity/userverification/data/cache/AuthOptionCache;", "authOptionCache", "Lcom/paypal/oslo/feature/identity/moreoptions/data/AuthOptionBuilder;", "optionBuilder", "<init>", "(Lcom/paypal/oslo/feature/identity/userverification/data/cache/AuthOptionCache;Lcom/paypal/oslo/feature/identity/moreoptions/data/AuthOptionBuilder;)V", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "authOptions", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "currentOptionType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/MoreOptionError;", "Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/MoreOptionResult;", "getOptions", "(Ljava/util/List;Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllAuthOptions", "()Ljava/util/List;", "optionType", "mapToAuthOption", "(Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/userverification/data/cache/AuthOptionCache;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/moreoptions/data/AuthOptionBuilder;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MoreOptionRepositoryImpl implements com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder getHighSpeedVideoSizes;

    @javax.inject.Inject
    public MoreOptionRepositoryImpl(com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache authOptionCache, com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder authOptionBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authOptionCache, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authOptionBuilder, "");
        this.getHighResolutionOutputSizeshNQ4ISI = authOptionCache;
        this.getHighSpeedVideoSizes = authOptionBuilder;
    }

    @Override // com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository
    public final java.lang.Object getOptions(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list, com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionError, com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionResult>> continuation) {
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.moreoptions.domain.model.MoreOptionResult(this.getHighSpeedVideoSizes.build(list, optionType)));
    }

    @Override // com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository
    public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getAllAuthOptions() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOptions();
    }

    @Override // com.paypal.oslo.feature.identity.moreoptions.domain.repository.MoreOptionRepository
    public final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions mapToAuthOption(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionType, "");
        java.util.Iterator<T> it = this.getHighResolutionOutputSizeshNQ4ISI.getOptions().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOptions = (com.paypal.oslo.feature.identity.login.domain.model.AuthOptions) obj;
            if (authOptions instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption) {
                if (optionType == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_NEW_CODE || optionType == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.TEXT_A_CODE || optionType == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_DIFFERENT_NUMBER) {
                    break;
                }
            } else if (authOptions instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption) {
                if (optionType == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_PASSWORD || optionType == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.CREATE_NEW_PASSWORD) {
                    break;
                }
            } else if (authOptions instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption) {
                if (optionType == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_PASSKEY) {
                    break;
                }
            } else {
                if (!(authOptions instanceof com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.BiometricAuthOption)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (optionType == com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.USE_BIOMETRIC) {
                    break;
                }
            }
        }
        return (com.paypal.oslo.feature.identity.login.domain.model.AuthOptions) obj;
    }
}
