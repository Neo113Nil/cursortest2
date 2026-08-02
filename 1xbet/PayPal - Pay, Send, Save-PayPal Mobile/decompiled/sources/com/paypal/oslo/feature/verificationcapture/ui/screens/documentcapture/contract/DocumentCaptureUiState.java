package com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "Initial", "WaitingForCamera", "Loading", "Capturing", "Processing", "Preview", "Success", "Error", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Capturing;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Error;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Initial;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Loading;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Preview;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Processing;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Success;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$WaitingForCamera;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface DocumentCaptureUiState extends com.paypal.oslo.core.mvi.UiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Initial;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Initial INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Initial();
        private static final java.lang.String name = "DocumentCaptureUiState.Initial";

        public final int hashCode() {
            return 1287581556;
        }

        private Initial() {
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$WaitingForCamera;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WaitingForCamera implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.WaitingForCamera INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.WaitingForCamera();
        private static final java.lang.String name = "DocumentCaptureUiState.WaitingForCamera";

        public final int hashCode() {
            return -1767461039;
        }

        private WaitingForCamera() {
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "WaitingForCamera";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.WaitingForCamera)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Loading;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Loading INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Loading();
        private static final java.lang.String name = "DocumentCaptureUiState.Loading";

        public final int hashCode() {
            return -324109972;
        }

        private Loading() {
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J`\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b\u000b\u0010\u001aR\u001a\u0010\f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b1\u0010\u0018R\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b2\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b3\u0010\u0018R\u001a\u00104\u001a\u00020%8\u0017X\u0097D¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Capturing;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "detectionStatus", "", "guidanceMessageResId", "", "isFlashEnabled", "remainingTimeSeconds", "totalTimeoutSeconds", "viewRecreationKey", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;IZIII)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "component3", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "component4", "()I", "component5", "()Z", "component6", "component7", "component8", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;IZIII)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Capturing;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "getDocumentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "getDocumentSide", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentDetectionStatus;", "getDetectionStatus", com.visa.cbp.getEncExpo.warmup, "getGuidanceMessageResId", "Z", "getRemainingTimeSeconds", "getTotalTimeoutSeconds", "getViewRecreationKey", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Capturing implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus detectionStatus;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType;
        private final int guidanceMessageResId;
        private final boolean isFlashEnabled;
        private final java.lang.String name;
        private final int remainingTimeSeconds;
        private final int totalTimeoutSeconds;
        private final int viewRecreationKey;

        public Capturing(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus documentDetectionStatus, int i, boolean z, int i2, int i3, int i4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentDetectionStatus, "");
            this.documentType = documentType;
            this.documentSide = documentSide;
            this.detectionStatus = documentDetectionStatus;
            this.guidanceMessageResId = i;
            this.isFlashEnabled = z;
            this.remainingTimeSeconds = i2;
            this.totalTimeoutSeconds = i3;
            this.viewRecreationKey = i4;
            this.name = "DocumentCaptureUiState.Capturing";
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
            return this.documentSide;
        }

        public /* synthetic */ Capturing(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus documentDetectionStatus, int i, boolean z, int i2, int i3, int i4, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(documentType, documentSide, (i5 & 4) != 0 ? com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus.NoDocument.INSTANCE : documentDetectionStatus, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? 30 : i3, (i5 & 128) != 0 ? 0 : i4);
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus getDetectionStatus() {
            return this.detectionStatus;
        }

        public final int getGuidanceMessageResId() {
            return this.guidanceMessageResId;
        }

        public final boolean isFlashEnabled() {
            return this.isFlashEnabled;
        }

        public final int getRemainingTimeSeconds() {
            return this.remainingTimeSeconds;
        }

        public final int getTotalTimeoutSeconds() {
            return this.totalTimeoutSeconds;
        }

        public final int getViewRecreationKey() {
            return this.viewRecreationKey;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType = this.documentType;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = this.documentSide;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus documentDetectionStatus = this.detectionStatus;
            int i = this.guidanceMessageResId;
            boolean z = this.isFlashEnabled;
            int i2 = this.remainingTimeSeconds;
            int i3 = this.totalTimeoutSeconds;
            int i4 = this.viewRecreationKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Capturing(documentType=");
            sb.append(documentType);
            sb.append(", documentSide=");
            sb.append(documentSide);
            sb.append(", detectionStatus=");
            sb.append(documentDetectionStatus);
            sb.append(", guidanceMessageResId=");
            sb.append(i);
            sb.append(", isFlashEnabled=");
            sb.append(z);
            sb.append(", remainingTimeSeconds=");
            sb.append(i2);
            sb.append(", totalTimeoutSeconds=");
            sb.append(i3);
            sb.append(", viewRecreationKey=");
            sb.append(i4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((this.documentType.hashCode() * 31) + this.documentSide.hashCode()) * 31) + this.detectionStatus.hashCode()) * 31) + java.lang.Integer.hashCode(this.guidanceMessageResId)) * 31) + java.lang.Boolean.hashCode(this.isFlashEnabled)) * 31) + java.lang.Integer.hashCode(this.remainingTimeSeconds)) * 31) + java.lang.Integer.hashCode(this.totalTimeoutSeconds)) * 31) + java.lang.Integer.hashCode(this.viewRecreationKey);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing capturing = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing) other;
            return this.documentType == capturing.documentType && this.documentSide == capturing.documentSide && kotlin.jvm.internal.Intrinsics.areEqual(this.detectionStatus, capturing.detectionStatus) && this.guidanceMessageResId == capturing.guidanceMessageResId && this.isFlashEnabled == capturing.isFlashEnabled && this.remainingTimeSeconds == capturing.remainingTimeSeconds && this.totalTimeoutSeconds == capturing.totalTimeoutSeconds && this.viewRecreationKey == capturing.viewRecreationKey;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing copy(com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus detectionStatus, int guidanceMessageResId, boolean isFlashEnabled, int remainingTimeSeconds, int totalTimeoutSeconds, int viewRecreationKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detectionStatus, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Capturing(documentType, documentSide, detectionStatus, guidanceMessageResId, isFlashEnabled, remainingTimeSeconds, totalTimeoutSeconds, viewRecreationKey);
        }

        /* renamed from: component8, reason: from getter */
        public final int getViewRecreationKey() {
            return this.viewRecreationKey;
        }

        /* renamed from: component7, reason: from getter */
        public final int getTotalTimeoutSeconds() {
            return this.totalTimeoutSeconds;
        }

        /* renamed from: component6, reason: from getter */
        public final int getRemainingTimeSeconds() {
            return this.remainingTimeSeconds;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsFlashEnabled() {
            return this.isFlashEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final int getGuidanceMessageResId() {
            return this.guidanceMessageResId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentDetectionStatus getDetectionStatus() {
            return this.detectionStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
            return this.documentSide;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\u00020\u001a8\u0017X\u0097D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Processing;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "result", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "component3", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Processing;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "getResult", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "getDocumentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "getDocumentSide", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Processing implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success result;

        public Processing(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            this.result = success;
            this.documentType = documentType;
            this.documentSide = documentSide;
            this.name = "DocumentCaptureUiState.Processing";
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success getResult() {
            return this.result;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
            return this.documentSide;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success = this.result;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType = this.documentType;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = this.documentSide;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Processing(result=");
            sb.append(success);
            sb.append(", documentType=");
            sb.append(documentType);
            sb.append(", documentSide=");
            sb.append(documentSide);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.result.hashCode() * 31) + this.documentType.hashCode()) * 31) + this.documentSide.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing processing = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.result, processing.result) && this.documentType == processing.documentType && this.documentSide == processing.documentSide;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing copy(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success result, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing(result, documentType, documentSide);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
            return this.documentSide;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Processing processing, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                success = processing.result;
            }
            if ((i & 2) != 0) {
                documentType = processing.documentType;
            }
            if ((i & 4) != 0) {
                documentSide = processing.documentSide;
            }
            return processing.copy(success, documentType, documentSide);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\u00020\u001a8\u0017X\u0097D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Preview;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "result", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "component3", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Preview;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "getResult", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "getDocumentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "getDocumentSide", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Preview implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success result;

        public Preview(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            this.result = success;
            this.documentType = documentType;
            this.documentSide = documentSide;
            this.name = "DocumentCaptureUiState.Preview";
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success getResult() {
            return this.result;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
            return this.documentSide;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success = this.result;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType = this.documentType;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = this.documentSide;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Preview(result=");
            sb.append(success);
            sb.append(", documentType=");
            sb.append(documentType);
            sb.append(", documentSide=");
            sb.append(documentSide);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.result.hashCode() * 31) + this.documentType.hashCode()) * 31) + this.documentSide.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview preview = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.result, preview.result) && this.documentType == preview.documentType && this.documentSide == preview.documentSide;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview copy(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success result, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview(result, documentType, documentSide);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
            return this.documentSide;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Preview preview, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                success = preview.result;
            }
            if ((i & 2) != 0) {
                documentType = preview.documentType;
            }
            if ((i & 4) != 0) {
                documentSide = preview.documentSide;
            }
            return preview.copy(success, documentType, documentSide);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Success;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "result", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "getResult", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState {
        public static final int $stable = 8;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success result;

        public Success(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
            this.result = success;
            this.name = "DocumentCaptureUiState.Success";
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success getResult() {
            return this.result;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success = this.result;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(result=");
            sb.append(success);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Success) other).result);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Success copy(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success result) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Success(result);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success getResult() {
            return this.result;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Success copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Success success, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                success2 = success.result;
            }
            return success.copy(success2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\u00020\u001a8\u0017X\u0097D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Error;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/UiError;", "error", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/UiError;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/UiError;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "component3", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/UiError;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/DocumentCaptureUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentcapture/contract/UiError;", "getError", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "getDocumentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "getDocumentSide", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error implements com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError error;
        private final java.lang.String name;

        public Error(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError uiError, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiError, "");
            this.error = uiError;
            this.documentType = documentType;
            this.documentSide = documentSide;
            this.name = "DocumentCaptureUiState.Error";
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError uiError, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(uiError, (i & 2) != 0 ? null : documentType, (i & 4) != 0 ? null : documentSide);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError getError() {
            return this.error;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
            return this.documentSide;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError uiError = this.error;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType = this.documentType;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = this.documentSide;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(error=");
            sb.append(uiError);
            sb.append(", documentType=");
            sb.append(documentType);
            sb.append(", documentSide=");
            sb.append(documentSide);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.error.hashCode();
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType = this.documentType;
            int hashCode2 = documentType == null ? 0 : documentType.hashCode();
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = this.documentSide;
            return (((hashCode * 31) + hashCode2) * 31) + (documentSide != null ? documentSide.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error error = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.error, error.error) && this.documentType == error.documentType && this.documentSide == error.documentSide;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error copy(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError error, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error(error, documentType, documentSide);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
            return this.documentSide;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.DocumentCaptureUiState.Error error, com.paypal.oslo.feature.verificationcapture.ui.screens.documentcapture.contract.UiError uiError, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiError = error.error;
            }
            if ((i & 2) != 0) {
                documentType = error.documentType;
            }
            if ((i & 4) != 0) {
                documentSide = error.documentSide;
            }
            return error.copy(uiError, documentType, documentSide);
        }
    }
}
