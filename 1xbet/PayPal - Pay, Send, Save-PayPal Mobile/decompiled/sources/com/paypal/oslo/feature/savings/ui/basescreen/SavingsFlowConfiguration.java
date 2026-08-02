package com.paypal.oslo.feature.savings.ui.basescreen;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0000\u0018\u0000 $2\u00020\u0001:\u0002%$BI\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001e\u0010\u0012R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012R\u001a\u0010!\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration;", "", "", "p0", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsInitialFlowType;", "p1", "Lcom/paypal/oslo/feature/savings/api/navigation/SavingsOnBoardingFlowType;", "p2", "p3", "p4", "p5", "", "p6", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsInitialFlowType;Lcom/paypal/oslo/feature/savings/api/navigation/SavingsOnBoardingFlowType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "source", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "initialFlowType", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsInitialFlowType;", "getInitialFlowType", "()Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsInitialFlowType;", "onBoardingFlowType", "Lcom/paypal/oslo/feature/savings/api/navigation/SavingsOnBoardingFlowType;", "getOnBoardingFlowType", "()Lcom/paypal/oslo/feature/savings/api/navigation/SavingsOnBoardingFlowType;", "moneyBoxId", "getMoneyBoxId", "settingId", "getSettingId", "fitype", "getFitype", "isDeepLinkFlow", "Z", "()Z", "Companion", "Builder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsFlowConfiguration {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Companion INSTANCE = new com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Companion(null);
    private final java.lang.String fitype;
    private final com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType initialFlowType;
    private final boolean isDeepLinkFlow;
    private final java.lang.String moneyBoxId;
    private final com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingFlowType onBoardingFlowType;
    private final java.lang.String settingId;
    private final java.lang.String source;

    private SavingsFlowConfiguration(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType savingsInitialFlowType, com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingFlowType savingsOnBoardingFlowType, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        this.source = str;
        this.initialFlowType = savingsInitialFlowType;
        this.onBoardingFlowType = savingsOnBoardingFlowType;
        this.moneyBoxId = str2;
        this.settingId = str3;
        this.fitype = str4;
        this.isDeepLinkFlow = z;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType getInitialFlowType() {
        return this.initialFlowType;
    }

    public final com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingFlowType getOnBoardingFlowType() {
        return this.onBoardingFlowType;
    }

    public final java.lang.String getMoneyBoxId() {
        return this.moneyBoxId;
    }

    public final java.lang.String getSettingId() {
        return this.settingId;
    }

    public final java.lang.String getFitype() {
        return this.fitype;
    }

    /* renamed from: isDeepLinkFlow, reason: from getter */
    public final boolean getIsDeepLinkFlow() {
        return this.isDeepLinkFlow;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0018\u0010#\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010%\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration$Builder;", "", "<init>", "()V", "", "source", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration$Builder;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsInitialFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "initialFlowType", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsInitialFlowType;)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration$Builder;", "Lcom/paypal/oslo/feature/savings/api/navigation/SavingsOnBoardingFlowType;", "onBoardingFlowType", "(Lcom/paypal/oslo/feature/savings/api/navigation/SavingsOnBoardingFlowType;)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration$Builder;", "id", "moneyBoxId", "settingId", "type", "fitype", "", "isDeepLink", "(Z)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration$Builder;", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration;", "build", "()Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration;", "getOutputMinFrameDuration", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsInitialFlowType;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/savings/api/navigation/SavingsOnBoardingFlowType;", "getHighSpeedVideoFpsRanges", "getOutputFormats", "getInputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private java.lang.String getInputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private boolean getHighSpeedVideoSizesFor;
        private com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingFlowType getHighSpeedVideoSizes;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private java.lang.String getHighSpeedVideoFpsRanges;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private java.lang.String Camera2StreamConfigurationMap = "NONE";

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType getHighSpeedVideoFpsRangesFor = com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.NONE;

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder source(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            this.Camera2StreamConfigurationMap = source;
            return this;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder initialFlowType(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType flowType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            this.getHighSpeedVideoFpsRangesFor = flowType;
            return this;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder onBoardingFlowType(com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingFlowType flowType) {
            this.getHighSpeedVideoSizes = flowType;
            return this;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder moneyBoxId(java.lang.String id) {
            this.getHighResolutionOutputSizeshNQ4ISI = id;
            return this;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder settingId(java.lang.String id) {
            this.getHighSpeedVideoFpsRanges = id;
            return this;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder fitype(java.lang.String type) {
            this.getInputSizeshNQ4ISI = type;
            return this;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder isDeepLink(boolean isDeepLink) {
            this.getHighSpeedVideoSizesFor = isDeepLink;
            return this;
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration build() {
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000bJ)\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001a\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration$Builder;", "builder", "()Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration$Builder;", "", "source", "Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration;", "home", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration;", "Lcom/paypal/oslo/feature/savings/api/navigation/SavingsOnBoardingFlowType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, com.paypal.oslo.feature.onboarding.api.analytics.OnboardingAnalytics.PRODUCT, "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/api/navigation/SavingsOnBoardingFlowType;)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration;", "deeplinkHub", "deeplinkCreateGoal", "moneyBoxId", "deeplinkGoalDetails", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration;", "deeplinkTransferToSavings", "settingId", "deeplinkAutoSave", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/basescreen/SavingsFlowConfiguration;", "fitype", "deeplinkAddMoney"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder builder() {
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder();
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration home$default(com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Companion companion, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "NONE";
            }
            return companion.home(str);
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration home(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder().source(source).initialFlowType(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.NONE).isDeepLink(false).build();
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration onboarding(java.lang.String source, com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingFlowType flowType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowType, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder().source(source).onBoardingFlowType(flowType).initialFlowType(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.NONE).isDeepLink(false).build();
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration deeplinkHub(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder().source(source).initialFlowType(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.NONE).isDeepLink(true).build();
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration deeplinkCreateGoal(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder().source(source).initialFlowType(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.CREATE_GOAL).isDeepLink(true).build();
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration deeplinkGoalDetails(java.lang.String source, java.lang.String moneyBoxId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder().source(source).initialFlowType(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.GOAL_DETAILS).moneyBoxId(moneyBoxId).isDeepLink(true).build();
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration deeplinkTransferToSavings(java.lang.String source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder().source(source).initialFlowType(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.TRANSFER_TO_SAVINGS).isDeepLink(true).build();
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration deeplinkAutoSave(java.lang.String source, java.lang.String moneyBoxId, java.lang.String settingId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder().source(source).initialFlowType(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.AUTO_SAVE).moneyBoxId(moneyBoxId).settingId(settingId).isDeepLink(true).build();
        }

        public final com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration deeplinkAddMoney(java.lang.String source, java.lang.String fitype) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.savings.ui.basescreen.SavingsFlowConfiguration.Builder().source(source).initialFlowType(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.ADD_MONEY).fitype(fitype).isDeepLink(true).build();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SavingsFlowConfiguration(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType savingsInitialFlowType, com.paypal.oslo.feature.savings.api.navigation.SavingsOnBoardingFlowType savingsOnBoardingFlowType, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, savingsInitialFlowType, savingsOnBoardingFlowType, str2, str3, str4, z);
    }
}
