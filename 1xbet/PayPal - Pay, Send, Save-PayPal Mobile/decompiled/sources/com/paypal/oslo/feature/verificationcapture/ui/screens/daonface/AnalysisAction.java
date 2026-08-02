package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction;", "", "<init>", "()V", "CollectLivenessFrame", "ShowWarning", "WaitForBlink", "StartLiveness", "WaitForQuality", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$CollectLivenessFrame;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$ShowWarning;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$StartLiveness;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$WaitForBlink;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$WaitForQuality;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class AnalysisAction {
    public static final int $stable = 0;

    private AnalysisAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$CollectLivenessFrame;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction;", "Lcom/daon/sdk/face/QualityResult;", com.daon.sdk.face.license.License.FEATURE_QUALITY, "<init>", "(Lcom/daon/sdk/face/QualityResult;)V", "component1", "()Lcom/daon/sdk/face/QualityResult;", "copy", "(Lcom/daon/sdk/face/QualityResult;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$CollectLivenessFrame;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/daon/sdk/face/QualityResult;", "getQuality"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CollectLivenessFrame extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction {
        public static final int $stable = 8;
        private final com.daon.sdk.face.QualityResult quality;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CollectLivenessFrame(com.daon.sdk.face.QualityResult qualityResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualityResult, "");
            this.quality = qualityResult;
        }

        public final com.daon.sdk.face.QualityResult getQuality() {
            return this.quality;
        }

        public final java.lang.String toString() {
            com.daon.sdk.face.QualityResult qualityResult = this.quality;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CollectLivenessFrame(quality=");
            sb.append(qualityResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.quality.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.CollectLivenessFrame) && kotlin.jvm.internal.Intrinsics.areEqual(this.quality, ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.CollectLivenessFrame) other).quality);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.CollectLivenessFrame copy(com.daon.sdk.face.QualityResult quality) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quality, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.CollectLivenessFrame(quality);
        }

        /* renamed from: component1, reason: from getter */
        public final com.daon.sdk.face.QualityResult getQuality() {
            return this.quality;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.CollectLivenessFrame copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.CollectLivenessFrame collectLivenessFrame, com.daon.sdk.face.QualityResult qualityResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qualityResult = collectLivenessFrame.quality;
            }
            return collectLivenessFrame.copy(qualityResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$ShowWarning;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "ovalColor", "", "tutorialVisible", "blinkVisible", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.ErrorTypes.WARNING, "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;ZZLcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "component2", "()Z", "component3", "component4", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;ZZLcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$ShowWarning;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "getOvalColor", "Z", "getTutorialVisible", "getBlinkVisible", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", "getWarning"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowWarning extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction {
        public static final int $stable = 0;
        private final boolean blinkVisible;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalColor;
        private final boolean tutorialVisible;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warning;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowWarning(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor, boolean z, boolean z2, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ovalStrokeColor, "");
            this.ovalColor = ovalStrokeColor;
            this.tutorialVisible = z;
            this.blinkVisible = z2;
            this.warning = warningMessage;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor getOvalColor() {
            return this.ovalColor;
        }

        public final boolean getTutorialVisible() {
            return this.tutorialVisible;
        }

        public final boolean getBlinkVisible() {
            return this.blinkVisible;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage getWarning() {
            return this.warning;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor = this.ovalColor;
            boolean z = this.tutorialVisible;
            boolean z2 = this.blinkVisible;
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage = this.warning;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowWarning(ovalColor=");
            sb.append(ovalStrokeColor);
            sb.append(", tutorialVisible=");
            sb.append(z);
            sb.append(", blinkVisible=");
            sb.append(z2);
            sb.append(", warning=");
            sb.append(warningMessage);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.ovalColor.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.tutorialVisible);
            int hashCode3 = java.lang.Boolean.hashCode(this.blinkVisible);
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage = this.warning;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (warningMessage == null ? 0 : warningMessage.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.ShowWarning)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.ShowWarning showWarning = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.ShowWarning) other;
            return this.ovalColor == showWarning.ovalColor && this.tutorialVisible == showWarning.tutorialVisible && this.blinkVisible == showWarning.blinkVisible && this.warning == showWarning.warning;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.ShowWarning copy(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalColor, boolean tutorialVisible, boolean blinkVisible, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warning) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ovalColor, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.ShowWarning(ovalColor, tutorialVisible, blinkVisible, warning);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage getWarning() {
            return this.warning;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getBlinkVisible() {
            return this.blinkVisible;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getTutorialVisible() {
            return this.tutorialVisible;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor getOvalColor() {
            return this.ovalColor;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.ShowWarning copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.ShowWarning showWarning, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor, boolean z, boolean z2, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                ovalStrokeColor = showWarning.ovalColor;
            }
            if ((i & 2) != 0) {
                z = showWarning.tutorialVisible;
            }
            if ((i & 4) != 0) {
                z2 = showWarning.blinkVisible;
            }
            if ((i & 8) != 0) {
                warningMessage = showWarning.warning;
            }
            return showWarning.copy(ovalStrokeColor, z, z2, warningMessage);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$WaitForBlink;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction;", "Lcom/daon/sdk/face/QualityResult;", com.daon.sdk.face.license.License.FEATURE_QUALITY, "<init>", "(Lcom/daon/sdk/face/QualityResult;)V", "component1", "()Lcom/daon/sdk/face/QualityResult;", "copy", "(Lcom/daon/sdk/face/QualityResult;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$WaitForBlink;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/daon/sdk/face/QualityResult;", "getQuality"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WaitForBlink extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction {
        public static final int $stable = 8;
        private final com.daon.sdk.face.QualityResult quality;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitForBlink(com.daon.sdk.face.QualityResult qualityResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualityResult, "");
            this.quality = qualityResult;
        }

        public final com.daon.sdk.face.QualityResult getQuality() {
            return this.quality;
        }

        public final java.lang.String toString() {
            com.daon.sdk.face.QualityResult qualityResult = this.quality;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WaitForBlink(quality=");
            sb.append(qualityResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.quality.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForBlink) && kotlin.jvm.internal.Intrinsics.areEqual(this.quality, ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForBlink) other).quality);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForBlink copy(com.daon.sdk.face.QualityResult quality) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quality, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForBlink(quality);
        }

        /* renamed from: component1, reason: from getter */
        public final com.daon.sdk.face.QualityResult getQuality() {
            return this.quality;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForBlink copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForBlink waitForBlink, com.daon.sdk.face.QualityResult qualityResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qualityResult = waitForBlink.quality;
            }
            return waitForBlink.copy(qualityResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$StartLiveness;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction;", "Lcom/daon/sdk/face/QualityResult;", com.daon.sdk.face.license.License.FEATURE_QUALITY, "<init>", "(Lcom/daon/sdk/face/QualityResult;)V", "component1", "()Lcom/daon/sdk/face/QualityResult;", "copy", "(Lcom/daon/sdk/face/QualityResult;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$StartLiveness;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/daon/sdk/face/QualityResult;", "getQuality"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartLiveness extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction {
        public static final int $stable = 8;
        private final com.daon.sdk.face.QualityResult quality;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StartLiveness(com.daon.sdk.face.QualityResult qualityResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualityResult, "");
            this.quality = qualityResult;
        }

        public final com.daon.sdk.face.QualityResult getQuality() {
            return this.quality;
        }

        public final java.lang.String toString() {
            com.daon.sdk.face.QualityResult qualityResult = this.quality;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartLiveness(quality=");
            sb.append(qualityResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.quality.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.StartLiveness) && kotlin.jvm.internal.Intrinsics.areEqual(this.quality, ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.StartLiveness) other).quality);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.StartLiveness copy(com.daon.sdk.face.QualityResult quality) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quality, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.StartLiveness(quality);
        }

        /* renamed from: component1, reason: from getter */
        public final com.daon.sdk.face.QualityResult getQuality() {
            return this.quality;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.StartLiveness copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.StartLiveness startLiveness, com.daon.sdk.face.QualityResult qualityResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qualityResult = startLiveness.quality;
            }
            return startLiveness.copy(qualityResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$WaitForQuality;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction;", "Lcom/daon/sdk/face/QualityResult;", com.daon.sdk.face.license.License.FEATURE_QUALITY, "<init>", "(Lcom/daon/sdk/face/QualityResult;)V", "component1", "()Lcom/daon/sdk/face/QualityResult;", "copy", "(Lcom/daon/sdk/face/QualityResult;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/AnalysisAction$WaitForQuality;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/daon/sdk/face/QualityResult;", "getQuality"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WaitForQuality extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction {
        public static final int $stable = 8;
        private final com.daon.sdk.face.QualityResult quality;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitForQuality(com.daon.sdk.face.QualityResult qualityResult) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qualityResult, "");
            this.quality = qualityResult;
        }

        public final com.daon.sdk.face.QualityResult getQuality() {
            return this.quality;
        }

        public final java.lang.String toString() {
            com.daon.sdk.face.QualityResult qualityResult = this.quality;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WaitForQuality(quality=");
            sb.append(qualityResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.quality.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForQuality) && kotlin.jvm.internal.Intrinsics.areEqual(this.quality, ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForQuality) other).quality);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForQuality copy(com.daon.sdk.face.QualityResult quality) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quality, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForQuality(quality);
        }

        /* renamed from: component1, reason: from getter */
        public final com.daon.sdk.face.QualityResult getQuality() {
            return this.quality;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForQuality copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.AnalysisAction.WaitForQuality waitForQuality, com.daon.sdk.face.QualityResult qualityResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                qualityResult = waitForQuality.quality;
            }
            return waitForQuality.copy(qualityResult);
        }
    }

    public /* synthetic */ AnalysisAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
