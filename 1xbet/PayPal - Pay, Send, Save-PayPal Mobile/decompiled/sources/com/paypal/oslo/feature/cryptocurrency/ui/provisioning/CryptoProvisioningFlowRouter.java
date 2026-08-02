package com.paypal.oslo.feature.cryptocurrency.ui.provisioning;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "featureGateManager", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;)V", "", "intent", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult;", "routeProvisioningFlow", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "mapIntentToIntentId", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/cryptocurrency/domain/remoteconfig/gates/FeatureGateManager;", "getHighResolutionOutputSizeshNQ4ISI", "Companion", "ProvisioningFlowResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoProvisioningFlowRouter {
    public static final java.lang.String INTENT_CRYPTO = "CRYPTO";
    public static final java.lang.String INTENT_CRYPTO_PRO = "CRYPTO_PRO";
    public static final java.lang.String INTENT_CRYPTO_PRO_DEEPLINK = "CRYPTOPRO";

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager getHighResolutionOutputSizeshNQ4ISI;
    public static final int $stable = 8;

    @javax.inject.Inject
    public CryptoProvisioningFlowRouter(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGateManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = featureGateManager;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult routeProvisioningFlow(java.lang.String intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI.isMockApiEnabled()) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Mock(intent);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.isBizAccountEnabled()) {
            return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Eop(intent);
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI.isOneOnboardingIntegrationEnabled()) {
            com.paypal.oslo.feature.oneonboarding.api.domain.IntentId mapIntentToIntentId = mapIntentToIntentId(intent);
            if (mapIntentToIntentId != null) {
                return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.OneOnboarding(mapIntentToIntentId);
            }
            return com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Error.INSTANCE;
        }
        return com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.OneOnboardingDisabled.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r5.equals(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO_DEEPLINK) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.CryptoPro(r3 == true ? 1 : 0, r2, r3 == true ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r5.equals(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.INTENT_CRYPTO_PRO) == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId mapIntentToIntentId(java.lang.String intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        java.lang.String upperCase = intent.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        int hashCode = upperCase.hashCode();
        int i = 1;
        com.paypal.oslo.feature.oneonboarding.api.domain.JourneyContext journeyContext = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        if (hashCode != -1506016753) {
            if (hashCode != 89951788) {
                if (hashCode == 1996612801 && upperCase.equals(INTENT_CRYPTO)) {
                    return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Crypto(journeyContext, i, objArr3 == true ? 1 : 0);
                }
            }
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult;", "", "OneOnboarding", "OneOnboardingDisabled", "Eop", "Mock", "Error", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$Eop;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$Error;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$Mock;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$OneOnboarding;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$OneOnboardingDisabled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface ProvisioningFlowResult {

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$OneOnboarding;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$OneOnboarding;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OneOnboarding implements com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult {
            public static final int $stable = 8;
            private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;

            public OneOnboarding(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
                this.intentId = intentId;
            }

            public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
                return this.intentId;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OneOnboarding(intentId=");
                sb.append(intentId);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.intentId.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.OneOnboarding) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, ((com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.OneOnboarding) other).intentId);
            }

            public final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.OneOnboarding copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
                return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.OneOnboarding(intentId);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
                return this.intentId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.OneOnboarding copy$default(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.OneOnboarding oneOnboarding, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    intentId = oneOnboarding.intentId;
                }
                return oneOnboarding.copy(intentId);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$OneOnboardingDisabled;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class OneOnboardingDisabled implements com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.OneOnboardingDisabled INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.OneOnboardingDisabled();

            public final int hashCode() {
                return 382376990;
            }

            private OneOnboardingDisabled() {
            }

            public final java.lang.String toString() {
                return "OneOnboardingDisabled";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.OneOnboardingDisabled)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$Eop;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult;", "", "intent", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$Eop;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Eop implements com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult {
            public static final int $stable = 0;
            private final java.lang.String intent;

            public Eop(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.intent = str;
            }

            public final java.lang.String getIntent() {
                return this.intent;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.intent;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Eop(intent=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.intent.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Eop) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, ((com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Eop) other).intent);
            }

            public final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Eop copy(java.lang.String intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Eop(intent);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getIntent() {
                return this.intent;
            }

            public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Eop copy$default(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Eop eop, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = eop.intent;
                }
                return eop.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$Mock;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult;", "", "intent", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$Mock;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Mock implements com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult {
            public static final int $stable = 0;
            private final java.lang.String intent;

            public Mock(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.intent = str;
            }

            public final java.lang.String getIntent() {
                return this.intent;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.intent;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Mock(intent=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.intent.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Mock) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, ((com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Mock) other).intent);
            }

            public final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Mock copy(java.lang.String intent) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
                return new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Mock(intent);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getIntent() {
                return this.intent;
            }

            public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Mock copy$default(com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Mock mock, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = mock.intent;
                }
                return mock.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult$Error;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/provisioning/CryptoProvisioningFlowRouter$ProvisioningFlowResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error implements com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Error INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Error();

            public final int hashCode() {
                return 797108585;
            }

            private Error() {
            }

            public final java.lang.String toString() {
                return "Error";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.provisioning.CryptoProvisioningFlowRouter.ProvisioningFlowResult.Error)) {
                    return false;
                }
                return true;
            }
        }
    }
}
