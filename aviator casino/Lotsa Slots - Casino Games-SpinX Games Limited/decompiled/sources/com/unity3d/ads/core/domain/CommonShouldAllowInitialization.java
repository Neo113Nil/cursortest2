package com.unity3d.ads.core.domain;

/* compiled from: CommonShouldAllowInitialization.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonShouldAllowInitialization;", "Lcom/unity3d/ads/core/domain/ShouldAllowInitialization;", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "checkForGameIdAndTestModeChanges", "Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "setInitializationState", "Lcom/unity3d/ads/core/domain/SetInitializationState;", "validateGameId", "Lcom/unity3d/ads/core/domain/ValidateGameId;", "(Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/SetInitializationState;Lcom/unity3d/ads/core/domain/ValidateGameId;)V", "getAlternativeFlowReader", "()Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "getCheckForGameIdAndTestModeChanges", "()Lcom/unity3d/ads/core/domain/CheckForGameIdAndTestModeChanges;", "getGetInitializationState", "()Lcom/unity3d/ads/core/domain/GetInitializationState;", "getSetInitializationState", "()Lcom/unity3d/ads/core/domain/SetInitializationState;", "getValidateGameId", "()Lcom/unity3d/ads/core/domain/ValidateGameId;", "invoke", "", com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonShouldAllowInitialization implements com.unity3d.ads.core.domain.ShouldAllowInitialization {
    private final com.unity3d.ads.core.configuration.AlternativeFlowReader alternativeFlowReader;
    private final com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges;
    private final com.unity3d.ads.core.domain.GetInitializationState getInitializationState;
    private final com.unity3d.ads.core.domain.SetInitializationState setInitializationState;
    private final com.unity3d.ads.core.domain.ValidateGameId validateGameId;

    /* compiled from: CommonShouldAllowInitialization.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.unity3d.ads.core.data.model.InitializationState.values().length];
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.INITIALIZING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.INITIALIZED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.FAILED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CommonShouldAllowInitialization(com.unity3d.ads.core.configuration.AlternativeFlowReader alternativeFlowReader, com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges checkForGameIdAndTestModeChanges, com.unity3d.ads.core.domain.GetInitializationState getInitializationState, com.unity3d.ads.core.domain.SetInitializationState setInitializationState, com.unity3d.ads.core.domain.ValidateGameId validateGameId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkForGameIdAndTestModeChanges, "checkForGameIdAndTestModeChanges");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setInitializationState, "setInitializationState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validateGameId, "validateGameId");
        this.alternativeFlowReader = alternativeFlowReader;
        this.checkForGameIdAndTestModeChanges = checkForGameIdAndTestModeChanges;
        this.getInitializationState = getInitializationState;
        this.setInitializationState = setInitializationState;
        this.validateGameId = validateGameId;
    }

    public final com.unity3d.ads.core.configuration.AlternativeFlowReader getAlternativeFlowReader() {
        return this.alternativeFlowReader;
    }

    public final com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges getCheckForGameIdAndTestModeChanges() {
        return this.checkForGameIdAndTestModeChanges;
    }

    public final com.unity3d.ads.core.domain.GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final com.unity3d.ads.core.domain.SetInitializationState getSetInitializationState() {
        return this.setInitializationState;
    }

    public final com.unity3d.ads.core.domain.ValidateGameId getValidateGameId() {
        return this.validateGameId;
    }

    @Override // com.unity3d.ads.core.domain.ShouldAllowInitialization
    public boolean invoke(java.lang.String gameId) {
        if (!this.validateGameId.invoke(gameId)) {
            return false;
        }
        if (this.alternativeFlowReader.invoke()) {
            int i = com.unity3d.ads.core.domain.CommonShouldAllowInitialization.WhenMappings.$EnumSwitchMapping$0[this.getInitializationState.invoke(false).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 || i == 4) {
                        this.checkForGameIdAndTestModeChanges.invoke(false);
                        this.setInitializationState.invoke(com.unity3d.ads.core.data.model.InitializationState.INITIALIZING, false);
                        return true;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.unity3d.services.core.properties.SdkProperties.notifyInitializationComplete();
            }
            return false;
        }
        int i2 = com.unity3d.ads.core.domain.CommonShouldAllowInitialization.WhenMappings.$EnumSwitchMapping$0[this.getInitializationState.invoke(true).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to previous failed reason");
                        return false;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!com.unity3d.services.core.configuration.EnvironmentCheck.isEnvironmentOk()) {
                    com.unity3d.services.core.log.DeviceLog.error("Error during Unity Services environment check, halting Unity Services init");
                    com.unity3d.services.core.properties.SdkProperties.notifyInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK failed to initialize due to environment check failed");
                    com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().sendMetric(com.unity3d.services.core.request.metrics.InitMetric.newInitEnvironmentNotOk());
                    return false;
                }
                com.unity3d.services.core.log.DeviceLog.info("Unity Services environment check OK");
                com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().sendMetric(com.unity3d.services.core.request.metrics.InitMetric.newInitEnvironmentOk());
                this.checkForGameIdAndTestModeChanges.invoke(true);
                this.setInitializationState.invoke(com.unity3d.ads.core.data.model.InitializationState.INITIALIZING, true);
                return true;
            }
            com.unity3d.services.core.properties.SdkProperties.notifyInitializationComplete();
        }
        return false;
    }
}
