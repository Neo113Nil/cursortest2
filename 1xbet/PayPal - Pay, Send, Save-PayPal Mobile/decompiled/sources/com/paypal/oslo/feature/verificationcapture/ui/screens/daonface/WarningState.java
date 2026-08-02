package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u0082\u0001\u0003\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "getOvalColor", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "ovalColor", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", "getWarning", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.WARNING, "", "getTutorialVisible", "()Z", "tutorialVisible", "getBlinkVisible", "blinkVisible", "GracePeriod", com.google.common.net.HttpHeaders.WARNING, "Critical", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState$Critical;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState$GracePeriod;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState$Warning;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class WarningState {
    public static final int $stable = 0;

    public abstract boolean getBlinkVisible();

    public abstract com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor getOvalColor();

    public abstract boolean getTutorialVisible();

    public abstract com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage getWarning();

    private WarningState() {
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\f8\u0017X\u0097D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\f8\u0017X\u0097D¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState$GracePeriod;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "ovalColor", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState$GracePeriod;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "getOvalColor", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.WARNING, "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", "getWarning", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", "tutorialVisible", "Z", "getTutorialVisible", "()Z", "blinkVisible", "getBlinkVisible"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GracePeriod extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState {
        public static final int $stable = 0;
        private final boolean blinkVisible;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalColor;
        private final boolean tutorialVisible;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GracePeriod(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ovalStrokeColor, "");
            this.ovalColor = ovalStrokeColor;
            this.tutorialVisible = true;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor getOvalColor() {
            return this.ovalColor;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage getWarning() {
            return this.warning;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final boolean getTutorialVisible() {
            return this.tutorialVisible;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final boolean getBlinkVisible() {
            return this.blinkVisible;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor = this.ovalColor;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GracePeriod(ovalColor=");
            sb.append(ovalStrokeColor);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.ovalColor.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.GracePeriod) && this.ovalColor == ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.GracePeriod) other).ovalColor;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.GracePeriod copy(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalColor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ovalColor, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.GracePeriod(ovalColor);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor getOvalColor() {
            return this.ovalColor;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.GracePeriod copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.GracePeriod gracePeriod, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ovalStrokeColor = gracePeriod.ovalColor;
            }
            return gracePeriod.copy(ovalStrokeColor);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00108\u0017X\u0097D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00108\u0017X\u0097D¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState$Warning;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "ovalColor", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.WARNING, "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState$Warning;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "getOvalColor", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", "getWarning", "tutorialVisible", "Z", "getTutorialVisible", "()Z", "blinkVisible", "getBlinkVisible"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Warning extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState {
        public static final int $stable = 0;
        private final boolean blinkVisible;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalColor;
        private final boolean tutorialVisible;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Warning(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ovalStrokeColor, "");
            this.ovalColor = ovalStrokeColor;
            this.warning = warningMessage;
            this.tutorialVisible = true;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor getOvalColor() {
            return this.ovalColor;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage getWarning() {
            return this.warning;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final boolean getTutorialVisible() {
            return this.tutorialVisible;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final boolean getBlinkVisible() {
            return this.blinkVisible;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor = this.ovalColor;
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage = this.warning;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Warning(ovalColor=");
            sb.append(ovalStrokeColor);
            sb.append(", warning=");
            sb.append(warningMessage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.ovalColor.hashCode();
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage = this.warning;
            return (hashCode * 31) + (warningMessage == null ? 0 : warningMessage.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Warning)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Warning warning = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Warning) other;
            return this.ovalColor == warning.ovalColor && this.warning == warning.warning;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Warning copy(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalColor, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warning) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ovalColor, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Warning(ovalColor, warning);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage getWarning() {
            return this.warning;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor getOvalColor() {
            return this.ovalColor;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Warning copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Warning warning, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ovalStrokeColor = warning.ovalColor;
            }
            if ((i & 2) != 0) {
                warningMessage = warning.warning;
            }
            return warning.copy(ovalStrokeColor, warningMessage);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001d\u001a\u00020\u00108\u0017X\u0097D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u00108\u0017X\u0097D¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState$Critical;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "ovalColor", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.WARNING, "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningState$Critical;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "getOvalColor", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", "getWarning", "tutorialVisible", "Z", "getTutorialVisible", "()Z", "blinkVisible", "getBlinkVisible"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Critical extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState {
        public static final int $stable = 0;
        private final boolean blinkVisible;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalColor;
        private final boolean tutorialVisible;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Critical(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ovalStrokeColor, "");
            this.ovalColor = ovalStrokeColor;
            this.warning = warningMessage;
            this.tutorialVisible = true;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor getOvalColor() {
            return this.ovalColor;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage getWarning() {
            return this.warning;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final boolean getTutorialVisible() {
            return this.tutorialVisible;
        }

        @Override // com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState
        public final boolean getBlinkVisible() {
            return this.blinkVisible;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor = this.ovalColor;
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage = this.warning;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Critical(ovalColor=");
            sb.append(ovalStrokeColor);
            sb.append(", warning=");
            sb.append(warningMessage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.ovalColor.hashCode();
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage = this.warning;
            return (hashCode * 31) + (warningMessage == null ? 0 : warningMessage.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Critical)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Critical critical = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Critical) other;
            return this.ovalColor == critical.ovalColor && this.warning == critical.warning;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Critical copy(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalColor, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warning) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ovalColor, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Critical(ovalColor, warning);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage getWarning() {
            return this.warning;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor getOvalColor() {
            return this.ovalColor;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Critical copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningState.Critical critical, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ovalStrokeColor = critical.ovalColor;
            }
            if ((i & 2) != 0) {
                warningMessage = critical.warning;
            }
            return critical.copy(ovalStrokeColor, warningMessage);
        }
    }

    public /* synthetic */ WarningState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
