package com.paypal.oslo.feature.p2p.ui.interstitial.models;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "", "<init>", "()V", "", "getActionId", "()Ljava/lang/String;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "GetStarted", "NotNow", "Continue", "LearnMore", com.knotapi.knot.utilities.Constants.META_CLOSE, "Skip", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.NAME, "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$Close;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$Continue;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$Custom;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$GetStarted;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$LearnMore;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$NotNow;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$Skip;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class InterstitialAction {
    public static final int $stable = 0;

    public abstract java.lang.String getActionId();

    private InterstitialAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$GetStarted;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "Ljava/lang/String;", "getActionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GetStarted extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.GetStarted INSTANCE = new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.GetStarted();
        private static final java.lang.String actionId = com.paypal.oslo.feature.onboarding.signup.welcome.analytics.WelcomeAnalytics.ITEM_GET_STARTED;

        public final int hashCode() {
            return 1557388172;
        }

        private GetStarted() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction
        public final java.lang.String getActionId() {
            return actionId;
        }

        public final java.lang.String toString() {
            return "GetStarted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.GetStarted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$NotNow;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "Ljava/lang/String;", "getActionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NotNow extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.NotNow INSTANCE = new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.NotNow();
        private static final java.lang.String actionId = "not_now";

        public final int hashCode() {
            return 762206916;
        }

        private NotNow() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction
        public final java.lang.String getActionId() {
            return actionId;
        }

        public final java.lang.String toString() {
            return "NotNow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.NotNow)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$Continue;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "Ljava/lang/String;", "getActionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Continue extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Continue INSTANCE = new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Continue();
        private static final java.lang.String actionId = "continue";

        public final int hashCode() {
            return 208496680;
        }

        private Continue() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction
        public final java.lang.String getActionId() {
            return actionId;
        }

        public final java.lang.String toString() {
            return "Continue";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Continue)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$LearnMore;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "Ljava/lang/String;", "getActionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LearnMore extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.LearnMore INSTANCE = new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.LearnMore();
        private static final java.lang.String actionId = "learn_more";

        public final int hashCode() {
            return -168267688;
        }

        private LearnMore() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction
        public final java.lang.String getActionId() {
            return actionId;
        }

        public final java.lang.String toString() {
            return "LearnMore";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.LearnMore)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$Close;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "Ljava/lang/String;", "getActionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Close extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Close INSTANCE = new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Close();
        private static final java.lang.String actionId = "close";

        public final int hashCode() {
            return -1094043113;
        }

        private Close() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction
        public final java.lang.String getActionId() {
            return actionId;
        }

        public final java.lang.String toString() {
            return com.knotapi.knot.utilities.Constants.META_CLOSE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Close)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$Skip;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "Ljava/lang/String;", "getActionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Skip extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Skip INSTANCE = new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Skip();
        private static final java.lang.String actionId = "skip";

        public final int hashCode() {
            return -1558836864;
        }

        private Skip() {
            super(null);
        }

        @Override // com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction
        public final java.lang.String getActionId() {
            return actionId;
        }

        public final java.lang.String toString() {
            return "Skip";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Skip)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$Custom;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.ACTION_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialAction$Custom;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getActionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Custom extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction {
        public static final int $stable = 0;
        private final java.lang.String actionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.actionId = str;
        }

        @Override // com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction
        public final java.lang.String getActionId() {
            return this.actionId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.actionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Custom(actionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.actionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Custom) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionId, ((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Custom) other).actionId);
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Custom copy(java.lang.String actionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionId, "");
            return new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Custom(actionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getActionId() {
            return this.actionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Custom copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialAction.Custom custom, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = custom.actionId;
            }
            return custom.copy(str);
        }
    }

    public /* synthetic */ InterstitialAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
