package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "", "<init>", "()V", "NoDocument", "DocumentDetected", "DocumentTooFar", "DocumentTooClose", "DocumentNotCentered", "LightingTooLow", "GlareDetected", "BlurDetected", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Capturing", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$BlurDetected;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$Capturing;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$DocumentDetected;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$DocumentNotCentered;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$DocumentTooClose;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$DocumentTooFar;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$GlareDetected;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$LightingTooLow;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$NoDocument;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DocumentDetectionStatus {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$NoDocument;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NoDocument extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.NoDocument INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.NoDocument();

        private NoDocument() {
            super(null);
        }
    }

    private DocumentDetectionStatus() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$DocumentDetected;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DocumentDetected extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentDetected INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentDetected();

        private DocumentDetected() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$DocumentTooFar;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DocumentTooFar extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentTooFar INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentTooFar();

        private DocumentTooFar() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$DocumentTooClose;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DocumentTooClose extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentTooClose INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentTooClose();

        private DocumentTooClose() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$DocumentNotCentered;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DocumentNotCentered extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentNotCentered INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.DocumentNotCentered();

        private DocumentNotCentered() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$LightingTooLow;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LightingTooLow extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.LightingTooLow INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.LightingTooLow();

        private LightingTooLow() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$GlareDetected;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class GlareDetected extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.GlareDetected INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.GlareDetected();

        private GlareDetected() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$BlurDetected;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BlurDetected extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.BlurDetected INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.BlurDetected();

        private BlurDetected() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$Ready;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Ready extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.Ready INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.Ready();

        private Ready() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$Capturing;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "", "progress", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus$Capturing;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getProgress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Capturing extends com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus {
        public static final int $stable = 0;
        private final float progress;

        public Capturing(float f) {
            super(null);
            this.progress = f;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final java.lang.String toString() {
            float f = this.progress;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Capturing(progress=");
            sb.append(f);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Float.hashCode(this.progress);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.Capturing) && java.lang.Float.compare(this.progress, ((com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.Capturing) other).progress) == 0;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.Capturing copy(float progress) {
            return new com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.Capturing(progress);
        }

        /* renamed from: component1, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.Capturing copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.Capturing capturing, float f, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                f = capturing.progress;
            }
            return capturing.copy(f);
        }
    }

    public /* synthetic */ DocumentDetectionStatus(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
