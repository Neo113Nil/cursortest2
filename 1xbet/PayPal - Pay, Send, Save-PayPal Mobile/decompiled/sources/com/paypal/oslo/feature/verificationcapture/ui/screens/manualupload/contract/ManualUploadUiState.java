package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "Idle", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Uploading", "Success", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Idle;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Ready;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Success;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Uploading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ManualUploadUiState extends com.paypal.oslo.core.mvi.UiState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Idle;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Idle INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Idle();
        private static final java.lang.String name = "ManualUploadUiState.Idle";

        public final int hashCode() {
            return 453379182;
        }

        private Idle() {
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0011HÆ\u0003¢\u0006\u0004\b#\u0010$J\u008e\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0011HÆ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010\u001aJ\u0010\u0010-\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b-\u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b4\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b5\u0010\u001aR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b6\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b8\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010!R\u001a\u0010\u0010\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b;\u0010!R&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010$R\u001a\u0010>\u001a\u00020\u000b8\u0017X\u0097D¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010!R\u0011\u0010B\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010D\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\bC\u0010A"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Ready;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "captureMode", "", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/DocumentPreview;", "documents", "", "maxFiles", "maxFileSizeKB", "minFileSizeKB", "", "acceptedMimeTypes", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/UiError;", "error", "documentType", "documentSide", "", "uploadMetadata", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;Ljava/util/List;IIILjava/util/List;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/UiError;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "component2", "()Ljava/util/List;", "component3", "()I", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/UiError;", "component8", "()Ljava/lang/String;", "component9", "component10", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;Ljava/util/List;IIILjava/util/List;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/UiError;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Ready;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "getCaptureMode", "Ljava/util/List;", "getDocuments", com.visa.cbp.getEncExpo.warmup, "getMaxFiles", "getMaxFileSizeKB", "getMinFileSizeKB", "getAcceptedMimeTypes", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/UiError;", "getError", "Ljava/lang/String;", "getDocumentType", "getDocumentSide", "Ljava/util/Map;", "getUploadMetadata", "name", "getName", "getCanAddMore", "()Z", "canAddMore", "getHasDocuments", "hasDocuments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> acceptedMimeTypes;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode;
        private final java.lang.String documentSide;
        private final java.lang.String documentType;
        private final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError error;
        private final int maxFileSizeKB;
        private final int maxFiles;
        private final int minFileSizeKB;
        private final java.lang.String name;
        private final java.util.Map<java.lang.String, java.lang.String> uploadMetadata;

        public Ready(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> list, int i, int i2, int i3, java.util.List<java.lang.String> list2, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError uiError, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.captureMode = captureMode;
            this.documents = list;
            this.maxFiles = i;
            this.maxFileSizeKB = i2;
            this.minFileSizeKB = i3;
            this.acceptedMimeTypes = list2;
            this.error = uiError;
            this.documentType = str;
            this.documentSide = str2;
            this.uploadMetadata = map;
            this.name = "ManualUploadUiState.Ready";
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode getCaptureMode() {
            return this.captureMode;
        }

        public /* synthetic */ Ready(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, java.util.List list, int i, int i2, int i3, java.util.List list2, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError uiError, java.lang.String str, java.lang.String str2, java.util.Map map, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(captureMode, (i4 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i4 & 4) != 0 ? 2 : i, (i4 & 8) != 0 ? androidx.work.Data.MAX_DATA_BYTES : i2, (i4 & 16) != 0 ? 10 : i3, (i4 & 32) != 0 ? com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiStateKt.getHighSpeedVideoFpsRanges : list2, (i4 & 64) != 0 ? null : uiError, (i4 & 128) != 0 ? "DRIVERS_LICENSE" : str, (i4 & 256) != 0 ? com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT : str2, (i4 & 512) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> getDocuments() {
            return this.documents;
        }

        public final int getMaxFiles() {
            return this.maxFiles;
        }

        public final int getMaxFileSizeKB() {
            return this.maxFileSizeKB;
        }

        public final int getMinFileSizeKB() {
            return this.minFileSizeKB;
        }

        public final java.util.List<java.lang.String> getAcceptedMimeTypes() {
            return this.acceptedMimeTypes;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError getError() {
            return this.error;
        }

        public final java.lang.String getDocumentType() {
            return this.documentType;
        }

        public final java.lang.String getDocumentSide() {
            return this.documentSide;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getUploadMetadata() {
            return this.uploadMetadata;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final boolean getCanAddMore() {
            return this.documents.size() < this.maxFiles;
        }

        public final boolean getHasDocuments() {
            return !this.documents.isEmpty();
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode = this.captureMode;
            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> list = this.documents;
            int i = this.maxFiles;
            int i2 = this.maxFileSizeKB;
            int i3 = this.minFileSizeKB;
            java.util.List<java.lang.String> list2 = this.acceptedMimeTypes;
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError uiError = this.error;
            java.lang.String str = this.documentType;
            java.lang.String str2 = this.documentSide;
            java.util.Map<java.lang.String, java.lang.String> map = this.uploadMetadata;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(captureMode=");
            sb.append(captureMode);
            sb.append(", documents=");
            sb.append(list);
            sb.append(", maxFiles=");
            sb.append(i);
            sb.append(", maxFileSizeKB=");
            sb.append(i2);
            sb.append(", minFileSizeKB=");
            sb.append(i3);
            sb.append(", acceptedMimeTypes=");
            sb.append(list2);
            sb.append(", error=");
            sb.append(uiError);
            sb.append(", documentType=");
            sb.append(str);
            sb.append(", documentSide=");
            sb.append(str2);
            sb.append(", uploadMetadata=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.captureMode.hashCode();
            int hashCode2 = this.documents.hashCode();
            int hashCode3 = java.lang.Integer.hashCode(this.maxFiles);
            int hashCode4 = java.lang.Integer.hashCode(this.maxFileSizeKB);
            int hashCode5 = java.lang.Integer.hashCode(this.minFileSizeKB);
            int hashCode6 = this.acceptedMimeTypes.hashCode();
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError uiError = this.error;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (uiError == null ? 0 : uiError.hashCode())) * 31) + this.documentType.hashCode()) * 31) + this.documentSide.hashCode()) * 31) + this.uploadMetadata.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready ready = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready) other;
            return this.captureMode == ready.captureMode && kotlin.jvm.internal.Intrinsics.areEqual(this.documents, ready.documents) && this.maxFiles == ready.maxFiles && this.maxFileSizeKB == ready.maxFileSizeKB && this.minFileSizeKB == ready.minFileSizeKB && kotlin.jvm.internal.Intrinsics.areEqual(this.acceptedMimeTypes, ready.acceptedMimeTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ready.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentType, ready.documentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentSide, ready.documentSide) && kotlin.jvm.internal.Intrinsics.areEqual(this.uploadMetadata, ready.uploadMetadata);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready copy(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents, int maxFiles, int maxFileSizeKB, int minFileSizeKB, java.util.List<java.lang.String> acceptedMimeTypes, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError error, java.lang.String documentType, java.lang.String documentSide, java.util.Map<java.lang.String, java.lang.String> uploadMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documents, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptedMimeTypes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadMetadata, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Ready(captureMode, documents, maxFiles, maxFileSizeKB, minFileSizeKB, acceptedMimeTypes, error, documentType, documentSide, uploadMetadata);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getDocumentSide() {
            return this.documentSide;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getDocumentType() {
            return this.documentType;
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.UiError getError() {
            return this.error;
        }

        public final java.util.List<java.lang.String> component6() {
            return this.acceptedMimeTypes;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMinFileSizeKB() {
            return this.minFileSizeKB;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxFileSizeKB() {
            return this.maxFileSizeKB;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxFiles() {
            return this.maxFiles;
        }

        public final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> component2() {
            return this.documents;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component10() {
            return this.uploadMetadata;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode getCaptureMode() {
            return this.captureMode;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0010HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0092\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0010HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0015R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u0017R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b3\u0010\u001aR\u001a\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b4\u0010\u001aR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b5\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b8\u0010\u001fR&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010\"R\u001a\u0010;\u001a\u00020\u00078\u0017X\u0097D¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Uploading;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "captureMode", "", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/DocumentPreview;", "documents", "", "uploadingIds", "", "maxFiles", "maxFileSizeKB", "minFileSizeKB", "acceptedMimeTypes", "documentType", "documentSide", "", "uploadMetadata", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;Ljava/util/List;Ljava/util/List;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "component2", "()Ljava/util/List;", "component3", "component4", "()I", "component5", "component6", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;Ljava/util/List;Ljava/util/List;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Uploading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "getCaptureMode", "Ljava/util/List;", "getDocuments", "getUploadingIds", com.visa.cbp.getEncExpo.warmup, "getMaxFiles", "getMaxFileSizeKB", "getMinFileSizeKB", "getAcceptedMimeTypes", "Ljava/lang/String;", "getDocumentType", "getDocumentSide", "Ljava/util/Map;", "getUploadMetadata", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Uploading implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> acceptedMimeTypes;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode;
        private final java.lang.String documentSide;
        private final java.lang.String documentType;
        private final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents;
        private final int maxFileSizeKB;
        private final int maxFiles;
        private final int minFileSizeKB;
        private final java.lang.String name;
        private final java.util.Map<java.lang.String, java.lang.String> uploadMetadata;
        private final java.util.List<java.lang.String> uploadingIds;

        public Uploading(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> list, java.util.List<java.lang.String> list2, int i, int i2, int i3, java.util.List<java.lang.String> list3, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.captureMode = captureMode;
            this.documents = list;
            this.uploadingIds = list2;
            this.maxFiles = i;
            this.maxFileSizeKB = i2;
            this.minFileSizeKB = i3;
            this.acceptedMimeTypes = list3;
            this.documentType = str;
            this.documentSide = str2;
            this.uploadMetadata = map;
            this.name = "ManualUploadUiState.Uploading";
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode getCaptureMode() {
            return this.captureMode;
        }

        public final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> getDocuments() {
            return this.documents;
        }

        public final java.util.List<java.lang.String> getUploadingIds() {
            return this.uploadingIds;
        }

        public final int getMaxFiles() {
            return this.maxFiles;
        }

        public final int getMaxFileSizeKB() {
            return this.maxFileSizeKB;
        }

        public final int getMinFileSizeKB() {
            return this.minFileSizeKB;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Uploading(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, java.util.List list, java.util.List list2, int i, int i2, int i3, java.util.List list3, java.lang.String str, java.lang.String str2, java.util.Map map, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(captureMode, list, list2, r6, r7, r8, r9, (i4 & 128) != 0 ? "DRIVERS_LICENSE" : str, (i4 & 256) != 0 ? com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT : str2, (i4 & 512) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
            java.util.List list4;
            java.util.List list5;
            int i5 = (i4 & 8) != 0 ? 2 : i;
            int i6 = (i4 & 16) != 0 ? 10240 : i2;
            int i7 = (i4 & 32) != 0 ? 10 : i3;
            if ((i4 & 64) != 0) {
                list5 = com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiStateKt.getHighSpeedVideoFpsRanges;
                list4 = list5;
            } else {
                list4 = list3;
            }
        }

        public final java.util.List<java.lang.String> getAcceptedMimeTypes() {
            return this.acceptedMimeTypes;
        }

        public final java.lang.String getDocumentType() {
            return this.documentType;
        }

        public final java.lang.String getDocumentSide() {
            return this.documentSide;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getUploadMetadata() {
            return this.uploadMetadata;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode = this.captureMode;
            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> list = this.documents;
            java.util.List<java.lang.String> list2 = this.uploadingIds;
            int i = this.maxFiles;
            int i2 = this.maxFileSizeKB;
            int i3 = this.minFileSizeKB;
            java.util.List<java.lang.String> list3 = this.acceptedMimeTypes;
            java.lang.String str = this.documentType;
            java.lang.String str2 = this.documentSide;
            java.util.Map<java.lang.String, java.lang.String> map = this.uploadMetadata;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Uploading(captureMode=");
            sb.append(captureMode);
            sb.append(", documents=");
            sb.append(list);
            sb.append(", uploadingIds=");
            sb.append(list2);
            sb.append(", maxFiles=");
            sb.append(i);
            sb.append(", maxFileSizeKB=");
            sb.append(i2);
            sb.append(", minFileSizeKB=");
            sb.append(i3);
            sb.append(", acceptedMimeTypes=");
            sb.append(list3);
            sb.append(", documentType=");
            sb.append(str);
            sb.append(", documentSide=");
            sb.append(str2);
            sb.append(", uploadMetadata=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((((((this.captureMode.hashCode() * 31) + this.documents.hashCode()) * 31) + this.uploadingIds.hashCode()) * 31) + java.lang.Integer.hashCode(this.maxFiles)) * 31) + java.lang.Integer.hashCode(this.maxFileSizeKB)) * 31) + java.lang.Integer.hashCode(this.minFileSizeKB)) * 31) + this.acceptedMimeTypes.hashCode()) * 31) + this.documentType.hashCode()) * 31) + this.documentSide.hashCode()) * 31) + this.uploadMetadata.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading uploading = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading) other;
            return this.captureMode == uploading.captureMode && kotlin.jvm.internal.Intrinsics.areEqual(this.documents, uploading.documents) && kotlin.jvm.internal.Intrinsics.areEqual(this.uploadingIds, uploading.uploadingIds) && this.maxFiles == uploading.maxFiles && this.maxFileSizeKB == uploading.maxFileSizeKB && this.minFileSizeKB == uploading.minFileSizeKB && kotlin.jvm.internal.Intrinsics.areEqual(this.acceptedMimeTypes, uploading.acceptedMimeTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentType, uploading.documentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentSide, uploading.documentSide) && kotlin.jvm.internal.Intrinsics.areEqual(this.uploadMetadata, uploading.uploadMetadata);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading copy(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents, java.util.List<java.lang.String> uploadingIds, int maxFiles, int maxFileSizeKB, int minFileSizeKB, java.util.List<java.lang.String> acceptedMimeTypes, java.lang.String documentType, java.lang.String documentSide, java.util.Map<java.lang.String, java.lang.String> uploadMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documents, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadingIds, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptedMimeTypes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadMetadata, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Uploading(captureMode, documents, uploadingIds, maxFiles, maxFileSizeKB, minFileSizeKB, acceptedMimeTypes, documentType, documentSide, uploadMetadata);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getDocumentSide() {
            return this.documentSide;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getDocumentType() {
            return this.documentType;
        }

        public final java.util.List<java.lang.String> component7() {
            return this.acceptedMimeTypes;
        }

        /* renamed from: component6, reason: from getter */
        public final int getMinFileSizeKB() {
            return this.minFileSizeKB;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMaxFileSizeKB() {
            return this.maxFileSizeKB;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxFiles() {
            return this.maxFiles;
        }

        public final java.util.List<java.lang.String> component3() {
            return this.uploadingIds;
        }

        public final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> component2() {
            return this.documents;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component10() {
            return this.uploadMetadata;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode getCaptureMode() {
            return this.captureMode;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0010HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u008e\u0001\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0010HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010\u001bJ\u0010\u0010+\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b+\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b4\u0010\u001bR\u001a\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b5\u0010\u001bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b6\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b7\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b8\u0010\u0017R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010\"R\u001a\u0010;\u001a\u00020\u00058\u0017X\u0097D¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b<\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Success;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState;", "", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/DocumentPreview;", "documents", "", "docId", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "captureMode", "", "maxFiles", "maxFileSizeKB", "minFileSizeKB", "acceptedMimeTypes", "documentType", "documentSide", "", "uploadMetadata", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "component4", "()I", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/Map;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/util/List;", "getDocuments", "Ljava/lang/String;", "getDocId", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "getCaptureMode", com.visa.cbp.getEncExpo.warmup, "getMaxFiles", "getMaxFileSizeKB", "getMinFileSizeKB", "getAcceptedMimeTypes", "getDocumentType", "getDocumentSide", "Ljava/util/Map;", "getUploadMetadata", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> acceptedMimeTypes;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode;
        private final java.lang.String docId;
        private final java.lang.String documentSide;
        private final java.lang.String documentType;
        private final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents;
        private final int maxFileSizeKB;
        private final int maxFiles;
        private final int minFileSizeKB;
        private final java.lang.String name;
        private final java.util.Map<java.lang.String, java.lang.String> uploadMetadata;

        public Success(java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> list, java.lang.String str, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, int i, int i2, int i3, java.util.List<java.lang.String> list2, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.documents = list;
            this.docId = str;
            this.captureMode = captureMode;
            this.maxFiles = i;
            this.maxFileSizeKB = i2;
            this.minFileSizeKB = i3;
            this.acceptedMimeTypes = list2;
            this.documentType = str2;
            this.documentSide = str3;
            this.uploadMetadata = map;
            this.name = "ManualUploadUiState.Success";
        }

        public final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> getDocuments() {
            return this.documents;
        }

        public final java.lang.String getDocId() {
            return this.docId;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode getCaptureMode() {
            return this.captureMode;
        }

        public final int getMaxFiles() {
            return this.maxFiles;
        }

        public final int getMaxFileSizeKB() {
            return this.maxFileSizeKB;
        }

        public final int getMinFileSizeKB() {
            return this.minFileSizeKB;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Success(java.util.List list, java.lang.String str, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, int i, int i2, int i3, java.util.List list2, java.lang.String str2, java.lang.String str3, java.util.Map map, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, r4, captureMode, r6, r7, r8, r9, (i4 & 128) != 0 ? "DRIVERS_LICENSE" : str2, (i4 & 256) != 0 ? com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT : str3, (i4 & 512) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
            java.util.List list3;
            java.util.List list4;
            java.lang.String str4 = (i4 & 2) != 0 ? null : str;
            int i5 = (i4 & 8) != 0 ? 2 : i;
            int i6 = (i4 & 16) != 0 ? 10240 : i2;
            int i7 = (i4 & 32) != 0 ? 10 : i3;
            if ((i4 & 64) != 0) {
                list4 = com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiStateKt.getHighSpeedVideoFpsRanges;
                list3 = list4;
            } else {
                list3 = list2;
            }
        }

        public final java.util.List<java.lang.String> getAcceptedMimeTypes() {
            return this.acceptedMimeTypes;
        }

        public final java.lang.String getDocumentType() {
            return this.documentType;
        }

        public final java.lang.String getDocumentSide() {
            return this.documentSide;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getUploadMetadata() {
            return this.uploadMetadata;
        }

        @Override // com.paypal.oslo.core.mvi.UiState
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> list = this.documents;
            java.lang.String str = this.docId;
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode = this.captureMode;
            int i = this.maxFiles;
            int i2 = this.maxFileSizeKB;
            int i3 = this.minFileSizeKB;
            java.util.List<java.lang.String> list2 = this.acceptedMimeTypes;
            java.lang.String str2 = this.documentType;
            java.lang.String str3 = this.documentSide;
            java.util.Map<java.lang.String, java.lang.String> map = this.uploadMetadata;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(documents=");
            sb.append(list);
            sb.append(", docId=");
            sb.append(str);
            sb.append(", captureMode=");
            sb.append(captureMode);
            sb.append(", maxFiles=");
            sb.append(i);
            sb.append(", maxFileSizeKB=");
            sb.append(i2);
            sb.append(", minFileSizeKB=");
            sb.append(i3);
            sb.append(", acceptedMimeTypes=");
            sb.append(list2);
            sb.append(", documentType=");
            sb.append(str2);
            sb.append(", documentSide=");
            sb.append(str3);
            sb.append(", uploadMetadata=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.documents.hashCode();
            java.lang.String str = this.docId;
            return (((((((((((((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.captureMode.hashCode()) * 31) + java.lang.Integer.hashCode(this.maxFiles)) * 31) + java.lang.Integer.hashCode(this.maxFileSizeKB)) * 31) + java.lang.Integer.hashCode(this.minFileSizeKB)) * 31) + this.acceptedMimeTypes.hashCode()) * 31) + this.documentType.hashCode()) * 31) + this.documentSide.hashCode()) * 31) + this.uploadMetadata.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success success = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.documents, success.documents) && kotlin.jvm.internal.Intrinsics.areEqual(this.docId, success.docId) && this.captureMode == success.captureMode && this.maxFiles == success.maxFiles && this.maxFileSizeKB == success.maxFileSizeKB && this.minFileSizeKB == success.minFileSizeKB && kotlin.jvm.internal.Intrinsics.areEqual(this.acceptedMimeTypes, success.acceptedMimeTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentType, success.documentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentSide, success.documentSide) && kotlin.jvm.internal.Intrinsics.areEqual(this.uploadMetadata, success.uploadMetadata);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success copy(java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> documents, java.lang.String docId, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, int maxFiles, int maxFileSizeKB, int minFileSizeKB, java.util.List<java.lang.String> acceptedMimeTypes, java.lang.String documentType, java.lang.String documentSide, java.util.Map<java.lang.String, java.lang.String> uploadMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documents, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptedMimeTypes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadMetadata, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadUiState.Success(documents, docId, captureMode, maxFiles, maxFileSizeKB, minFileSizeKB, acceptedMimeTypes, documentType, documentSide, uploadMetadata);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getDocumentSide() {
            return this.documentSide;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getDocumentType() {
            return this.documentType;
        }

        public final java.util.List<java.lang.String> component7() {
            return this.acceptedMimeTypes;
        }

        /* renamed from: component6, reason: from getter */
        public final int getMinFileSizeKB() {
            return this.minFileSizeKB;
        }

        /* renamed from: component5, reason: from getter */
        public final int getMaxFileSizeKB() {
            return this.maxFileSizeKB;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMaxFiles() {
            return this.maxFiles;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode getCaptureMode() {
            return this.captureMode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDocId() {
            return this.docId;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component10() {
            return this.uploadMetadata;
        }

        public final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.DocumentPreview> component1() {
            return this.documents;
        }
    }
}
