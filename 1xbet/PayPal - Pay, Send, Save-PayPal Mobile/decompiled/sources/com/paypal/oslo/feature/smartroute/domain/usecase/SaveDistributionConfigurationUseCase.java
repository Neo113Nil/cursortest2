package com.paypal.oslo.feature.smartroute.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase;", "", "Lcom/paypal/oslo/feature/smartroute/domain/repository/DistributionRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/repository/DistributionRepository;)V", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$SaveResult;", "invoke", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/smartroute/domain/repository/DistributionRepository;", "SaveResult", "ToastMessage", "ValidationErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SaveDistributionConfigurationUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SaveDistributionConfigurationUseCase(com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository distributionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionRepository, "");
        this.Camera2StreamConfigurationMap = distributionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.smartroute.domain.error.DistributionError, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult>> continuation) {
        com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase$invoke$1 saveDistributionConfigurationUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteActivated smartRouteActivated;
        if (continuation instanceof com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase$invoke$1) {
            saveDistributionConfigurationUseCase$invoke$1 = (com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase$invoke$1) continuation;
            if ((saveDistributionConfigurationUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                saveDistributionConfigurationUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = saveDistributionConfigurationUseCase$invoke$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = saveDistributionConfigurationUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (distributionConfiguration.getStatus() == com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.ACTIVE && distributionConfiguration.getTotalTargetPercentage() == 0.0f) {
                        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError("Move the slider to at least 1% to set up PayPal Smart Route.", com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType.ZeroPercentActivation.INSTANCE));
                    }
                    com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository distributionRepository = this.Camera2StreamConfigurationMap;
                    saveDistributionConfigurationUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(distributionConfiguration);
                    saveDistributionConfigurationUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = distributionRepository.saveConfiguration(distributionConfiguration, saveDistributionConfigurationUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration2 = (com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration) ((arrow.core.Either.Right) either).getValue();
                    int i2 = com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.WhenMappings.$EnumSwitchMapping$0[distributionConfiguration2.getStatus().ordinal()];
                    if (i2 == 1) {
                        smartRouteActivated = com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteActivated.INSTANCE;
                    } else {
                        if (i2 != 2) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        smartRouteActivated = com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteTurnedOff.INSTANCE;
                    }
                    return new arrow.core.Either.Right(new com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult(distributionConfiguration2, smartRouteActivated));
                }
                if (either instanceof arrow.core.Either.Left) {
                    return either;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        saveDistributionConfigurationUseCase$invoke$1 = new com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = saveDistributionConfigurationUseCase$invoke$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = saveDistributionConfigurationUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$SaveResult;", "", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "toastMessage", "<init>", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;)V", "component1", "()Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "component2", "()Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "copy", "(Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;)Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$SaveResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/smartroute/domain/model/DistributionConfiguration;", "getConfiguration", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "getToastMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration configuration;
        private final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage;

        public SaveResult(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionConfiguration, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessage, "");
            this.configuration = distributionConfiguration;
            this.toastMessage = toastMessage;
        }

        public final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration getConfiguration() {
            return this.configuration;
        }

        public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage getToastMessage() {
            return this.toastMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration = this.configuration;
            com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage = this.toastMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveResult(configuration=");
            sb.append(distributionConfiguration);
            sb.append(", toastMessage=");
            sb.append(toastMessage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.configuration.hashCode() * 31) + this.toastMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult saveResult = (com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, saveResult.configuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.toastMessage, saveResult.toastMessage);
        }

        public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult copy(com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration configuration, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toastMessage, "");
            return new com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult(configuration, toastMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage getToastMessage() {
            return this.toastMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration getConfiguration() {
            return this.configuration;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult copy$default(com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.SaveResult saveResult, com.paypal.oslo.feature.smartroute.domain.model.DistributionConfiguration distributionConfiguration, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage toastMessage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                distributionConfiguration = saveResult.configuration;
            }
            if ((i & 2) != 0) {
                toastMessage = saveResult.toastMessage;
            }
            return saveResult.copy(distributionConfiguration, toastMessage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "", "<init>", "()V", "SmartRouteActivated", "SettingsSaved", "SmartRouteTurnedOff", "SmartRouteTurnedOffWithAutoReload", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage$SettingsSaved;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage$SmartRouteActivated;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage$SmartRouteTurnedOff;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage$SmartRouteTurnedOffWithAutoReload;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ToastMessage {
        public static final int $stable = 0;

        private ToastMessage() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage$SmartRouteActivated;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SmartRouteActivated extends com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteActivated INSTANCE = new com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteActivated();

            public final int hashCode() {
                return 1300618955;
            }

            private SmartRouteActivated() {
                super(null);
            }

            public final java.lang.String toString() {
                return "SmartRouteActivated";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteActivated)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage$SettingsSaved;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SettingsSaved extends com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SettingsSaved INSTANCE = new com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SettingsSaved();

            public final int hashCode() {
                return -1964780866;
            }

            private SettingsSaved() {
                super(null);
            }

            public final java.lang.String toString() {
                return "SettingsSaved";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SettingsSaved)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage$SmartRouteTurnedOff;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SmartRouteTurnedOff extends com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteTurnedOff INSTANCE = new com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteTurnedOff();

            public final int hashCode() {
                return 977029869;
            }

            private SmartRouteTurnedOff() {
                super(null);
            }

            public final java.lang.String toString() {
                return "SmartRouteTurnedOff";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteTurnedOff)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage$SmartRouteTurnedOffWithAutoReload;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ToastMessage;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SmartRouteTurnedOffWithAutoReload extends com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteTurnedOffWithAutoReload INSTANCE = new com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteTurnedOffWithAutoReload();

            public final int hashCode() {
                return 722521563;
            }

            private SmartRouteTurnedOffWithAutoReload() {
                super(null);
            }

            public final java.lang.String toString() {
                return "SmartRouteTurnedOffWithAutoReload";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ToastMessage.SmartRouteTurnedOffWithAutoReload)) {
                    return false;
                }
                return true;
            }
        }

        public /* synthetic */ ToastMessage(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType;", "", "<init>", "()V", "ZeroPercentActivation", "Other", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType$Other;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType$ZeroPercentActivation;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class ValidationErrorType {
        public static final int $stable = 0;

        private ValidationErrorType() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType$ZeroPercentActivation;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ZeroPercentActivation extends com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType.ZeroPercentActivation INSTANCE = new com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType.ZeroPercentActivation();

            public final int hashCode() {
                return -1848952634;
            }

            private ZeroPercentActivation() {
                super(null);
            }

            public final java.lang.String toString() {
                return "ZeroPercentActivation";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType.ZeroPercentActivation)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType$Other;", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType$Other;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Other extends com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Other(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Other(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType.Other) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType.Other) other).message);
            }

            public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType.Other copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType.Other(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType.Other copy$default(com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType.Other other, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = other.message;
                }
                return other.copy(str);
            }
        }

        public /* synthetic */ ValidationErrorType(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.ACTIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.smartroute.api.model.SmartRouteStatus.INACTIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
