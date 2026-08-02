package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult;", "", "<init>", "()V", "FrameCollected", "PossibleBlockage", "InsufficientQuality", "AlreadyComplete", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult$AlreadyComplete;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult$FrameCollected;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult$InsufficientQuality;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult$PossibleBlockage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class FrameAddResult {
    public static final int $stable = 0;

    private FrameAddResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult$FrameCollected;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult;", "", "collected", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_RESIDENT_KEY, "", "eyeOpenScore", "<init>", "(IIF)V", "component1", "()I", "component2", "component3", "()F", "copy", "(IIF)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult$FrameCollected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getCollected", "getRequired", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getEyeOpenScore"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FrameCollected extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult {
        public static final int $stable = 0;
        private final int collected;
        private final float eyeOpenScore;
        private final int required;

        public FrameCollected(int i, int i2, float f) {
            super(null);
            this.collected = i;
            this.required = i2;
            this.eyeOpenScore = f;
        }

        public final int getCollected() {
            return this.collected;
        }

        public final int getRequired() {
            return this.required;
        }

        public final float getEyeOpenScore() {
            return this.eyeOpenScore;
        }

        public final java.lang.String toString() {
            int i = this.collected;
            int i2 = this.required;
            float f = this.eyeOpenScore;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FrameCollected(collected=");
            sb.append(i);
            sb.append(", required=");
            sb.append(i2);
            sb.append(", eyeOpenScore=");
            sb.append(f);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Integer.hashCode(this.collected) * 31) + java.lang.Integer.hashCode(this.required)) * 31) + java.lang.Float.hashCode(this.eyeOpenScore);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.FrameCollected)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.FrameCollected frameCollected = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.FrameCollected) other;
            return this.collected == frameCollected.collected && this.required == frameCollected.required && java.lang.Float.compare(this.eyeOpenScore, frameCollected.eyeOpenScore) == 0;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.FrameCollected copy(int collected, int required, float eyeOpenScore) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.FrameCollected(collected, required, eyeOpenScore);
        }

        /* renamed from: component3, reason: from getter */
        public final float getEyeOpenScore() {
            return this.eyeOpenScore;
        }

        /* renamed from: component2, reason: from getter */
        public final int getRequired() {
            return this.required;
        }

        /* renamed from: component1, reason: from getter */
        public final int getCollected() {
            return this.collected;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.FrameCollected copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.FrameCollected frameCollected, int i, int i2, float f, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = frameCollected.collected;
            }
            if ((i3 & 2) != 0) {
                i2 = frameCollected.required;
            }
            if ((i3 & 4) != 0) {
                f = frameCollected.eyeOpenScore;
            }
            return frameCollected.copy(i, i2, f);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult$PossibleBlockage;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult;", "", "eyeOpenScore", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult$PossibleBlockage;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getEyeOpenScore"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PossibleBlockage extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult {
        public static final int $stable = 0;
        private final float eyeOpenScore;

        public PossibleBlockage(float f) {
            super(null);
            this.eyeOpenScore = f;
        }

        public final float getEyeOpenScore() {
            return this.eyeOpenScore;
        }

        public final java.lang.String toString() {
            float f = this.eyeOpenScore;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PossibleBlockage(eyeOpenScore=");
            sb.append(f);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Float.hashCode(this.eyeOpenScore);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.PossibleBlockage) && java.lang.Float.compare(this.eyeOpenScore, ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.PossibleBlockage) other).eyeOpenScore) == 0;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.PossibleBlockage copy(float eyeOpenScore) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.PossibleBlockage(eyeOpenScore);
        }

        /* renamed from: component1, reason: from getter */
        public final float getEyeOpenScore() {
            return this.eyeOpenScore;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.PossibleBlockage copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.PossibleBlockage possibleBlockage, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = possibleBlockage.eyeOpenScore;
            }
            return possibleBlockage.copy(f);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult$InsufficientQuality;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult;", "", "eyeOpenScore", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult$InsufficientQuality;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getEyeOpenScore"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InsufficientQuality extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult {
        public static final int $stable = 0;
        private final float eyeOpenScore;

        public InsufficientQuality(float f) {
            super(null);
            this.eyeOpenScore = f;
        }

        public final float getEyeOpenScore() {
            return this.eyeOpenScore;
        }

        public final java.lang.String toString() {
            float f = this.eyeOpenScore;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InsufficientQuality(eyeOpenScore=");
            sb.append(f);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Float.hashCode(this.eyeOpenScore);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.InsufficientQuality) && java.lang.Float.compare(this.eyeOpenScore, ((com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.InsufficientQuality) other).eyeOpenScore) == 0;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.InsufficientQuality copy(float eyeOpenScore) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.InsufficientQuality(eyeOpenScore);
        }

        /* renamed from: component1, reason: from getter */
        public final float getEyeOpenScore() {
            return this.eyeOpenScore;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.InsufficientQuality copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.InsufficientQuality insufficientQuality, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = insufficientQuality.eyeOpenScore;
            }
            return insufficientQuality.copy(f);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult$AlreadyComplete;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/FrameAddResult;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AlreadyComplete extends com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.AlreadyComplete INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FrameAddResult.AlreadyComplete();

        private AlreadyComplete() {
            super(null);
        }
    }

    public /* synthetic */ FrameAddResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
