package com.paypal.oslo.feature.bnplacquisition.analytics;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/analytics/BnplAcquisitionAnalyticsConstants;", "", "<init>", "()V", "Flow", "NavigationType", "UserIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplAcquisitionAnalyticsConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants INSTANCE = new com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants();

    private BnplAcquisitionAnalyticsConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/analytics/BnplAcquisitionAnalyticsConstants$Flow;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;", "specifier", "", "fromSpecifier", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FlowSpecifier;)Ljava/lang/String;", "APPLICATION", "Ljava/lang/String;", "MANAGEMENT"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Flow {
        public static final int $stable = 0;
        public static final java.lang.String APPLICATION = "application";
        public static final com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow INSTANCE = new com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow();
        public static final java.lang.String MANAGEMENT = "management";

        private Flow() {
        }

        public final java.lang.String fromSpecifier(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier specifier) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specifier, "");
            int i = com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.Flow.WhenMappings.$EnumSwitchMapping$0[specifier.ordinal()];
            if (i == 1) {
                return "application";
            }
            if (i == 2) {
                return MANAGEMENT;
            }
            if (i == 3) {
                return "application";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier.values().length];
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier.STANDALONE_APPLICATION.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier.SELF_SERVICING.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FlowSpecifier.UNKNOWN__.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/analytics/BnplAcquisitionAnalyticsConstants$NavigationType;", "", "<init>", "()V", "", "FORWARD", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NavigationType {
        public static final int $stable = 0;
        public static final java.lang.String FORWARD = "forward";
        public static final com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType INSTANCE = new com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.NavigationType();

        private NavigationType() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/analytics/BnplAcquisitionAnalyticsConstants$UserIntent;", "", "<init>", "()V", "", "FEATURE", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UserIntent {
        public static final int $stable = 0;
        public static final java.lang.String FEATURE = "apply_pl2go";
        public static final com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.UserIntent INSTANCE = new com.paypal.oslo.feature.bnplacquisition.analytics.BnplAcquisitionAnalyticsConstants.UserIntent();

        private UserIntent() {
        }
    }
}
