package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "Initialize", "ScanDocumentClicked", "UploadDocumentClicked", "UploadMethodSelected", "FilesSelected", "PhotoCaptured", "SdkCaptureCompleted", "FileProcessed", "DeleteDocumentClicked", "DeleteConfirmed", "StartUpload", "UploadSuccess", "UploadError", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR, "ShowError", "PermissionResult", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$DeleteConfirmed;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$DeleteDocumentClicked;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$DismissError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$FileProcessed;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$FilesSelected;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$PermissionResult;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$PhotoCaptured;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$ScanDocumentClicked;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$SdkCaptureCompleted;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$ShowError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$StartUpload;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadDocumentClicked;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadMethodSelected;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ManualUploadEvent extends com.paypal.oslo.core.mvi.Event {

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJr\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u0014R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001aR\u001a\u0010\f\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b1\u0010\u001aR&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001dR\u001a\u00104\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "captureMode", "", "maxFiles", "maxFileSizeKB", "minFileSizeKB", "", "", "acceptedMimeTypes", "documentType", "documentSide", "", "uploadMetadata", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "component2", "()I", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/String;", "component7", "component8", "()Ljava/util/Map;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/CaptureMode;", "getCaptureMode", com.visa.cbp.getEncExpo.warmup, "getMaxFiles", "getMaxFileSizeKB", "getMinFileSizeKB", "Ljava/util/List;", "getAcceptedMimeTypes", "Ljava/lang/String;", "getDocumentType", "getDocumentSide", "Ljava/util/Map;", "getUploadMetadata", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> acceptedMimeTypes;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode;
        private final java.lang.String documentSide;
        private final java.lang.String documentType;
        private final int maxFileSizeKB;
        private final int maxFiles;
        private final int minFileSizeKB;
        private final java.lang.String name;
        private final java.util.Map<java.lang.String, java.lang.String> uploadMetadata;

        public Initialize(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, int i, int i2, int i3, java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.captureMode = captureMode;
            this.maxFiles = i;
            this.maxFileSizeKB = i2;
            this.minFileSizeKB = i3;
            this.acceptedMimeTypes = list;
            this.documentType = str;
            this.documentSide = str2;
            this.uploadMetadata = map;
            this.name = "ManualUploadEvent.Initialize";
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

        public /* synthetic */ Initialize(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, int i, int i2, int i3, java.util.List list, java.lang.String str, java.lang.String str2, java.util.Map map, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(captureMode, (i4 & 2) != 0 ? 2 : i, (i4 & 4) != 0 ? androidx.work.Data.MAX_DATA_BYTES : i2, (i4 & 8) != 0 ? 10 : i3, (i4 & 16) != 0 ? kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"image/jpeg", androidx.media3.common.MimeTypes.IMAGE_PNG, "application/pdf"}) : list, (i4 & 32) != 0 ? "DRIVERS_LICENSE" : str, (i4 & 64) != 0 ? com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.FRONT : str2, (i4 & 128) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
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

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode = this.captureMode;
            int i = this.maxFiles;
            int i2 = this.maxFileSizeKB;
            int i3 = this.minFileSizeKB;
            java.util.List<java.lang.String> list = this.acceptedMimeTypes;
            java.lang.String str = this.documentType;
            java.lang.String str2 = this.documentSide;
            java.util.Map<java.lang.String, java.lang.String> map = this.uploadMetadata;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(captureMode=");
            sb.append(captureMode);
            sb.append(", maxFiles=");
            sb.append(i);
            sb.append(", maxFileSizeKB=");
            sb.append(i2);
            sb.append(", minFileSizeKB=");
            sb.append(i3);
            sb.append(", acceptedMimeTypes=");
            sb.append(list);
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
            return (((((((((((((this.captureMode.hashCode() * 31) + java.lang.Integer.hashCode(this.maxFiles)) * 31) + java.lang.Integer.hashCode(this.maxFileSizeKB)) * 31) + java.lang.Integer.hashCode(this.minFileSizeKB)) * 31) + this.acceptedMimeTypes.hashCode()) * 31) + this.documentType.hashCode()) * 31) + this.documentSide.hashCode()) * 31) + this.uploadMetadata.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.Initialize)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.Initialize initialize = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.Initialize) other;
            return this.captureMode == initialize.captureMode && this.maxFiles == initialize.maxFiles && this.maxFileSizeKB == initialize.maxFileSizeKB && this.minFileSizeKB == initialize.minFileSizeKB && kotlin.jvm.internal.Intrinsics.areEqual(this.acceptedMimeTypes, initialize.acceptedMimeTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentType, initialize.documentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentSide, initialize.documentSide) && kotlin.jvm.internal.Intrinsics.areEqual(this.uploadMetadata, initialize.uploadMetadata);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.Initialize copy(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode captureMode, int maxFiles, int maxFileSizeKB, int minFileSizeKB, java.util.List<java.lang.String> acceptedMimeTypes, java.lang.String documentType, java.lang.String documentSide, java.util.Map<java.lang.String, java.lang.String> uploadMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureMode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptedMimeTypes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uploadMetadata, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.Initialize(captureMode, maxFiles, maxFileSizeKB, minFileSizeKB, acceptedMimeTypes, documentType, documentSide, uploadMetadata);
        }

        public final java.util.Map<java.lang.String, java.lang.String> component8() {
            return this.uploadMetadata;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getDocumentSide() {
            return this.documentSide;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getDocumentType() {
            return this.documentType;
        }

        public final java.util.List<java.lang.String> component5() {
            return this.acceptedMimeTypes;
        }

        /* renamed from: component4, reason: from getter */
        public final int getMinFileSizeKB() {
            return this.minFileSizeKB;
        }

        /* renamed from: component3, reason: from getter */
        public final int getMaxFileSizeKB() {
            return this.maxFileSizeKB;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMaxFiles() {
            return this.maxFiles;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.CaptureMode getCaptureMode() {
            return this.captureMode;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$ScanDocumentClicked;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScanDocumentClicked implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ScanDocumentClicked INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ScanDocumentClicked();
        private static final java.lang.String name = "ManualUploadEvent.ScanDocumentClicked";

        public final int hashCode() {
            return 2131970034;
        }

        private ScanDocumentClicked() {
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "ScanDocumentClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ScanDocumentClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadDocumentClicked;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UploadDocumentClicked implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadDocumentClicked INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadDocumentClicked();
        private static final java.lang.String name = "ManualUploadEvent.UploadDocumentClicked";

        public final int hashCode() {
            return 1682418478;
        }

        private UploadDocumentClicked() {
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return "UploadDocumentClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadDocumentClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadMethodSelected;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "Camera", "Gallery", "FilePicker", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadMethodSelected$Camera;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadMethodSelected$FilePicker;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadMethodSelected$Gallery;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface UploadMethodSelected extends com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadMethodSelected$Camera;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadMethodSelected;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Camera implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.Camera INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.Camera();
            private static final java.lang.String name = "ManualUploadEvent.UploadMethodSelected.Camera";

            public final int hashCode() {
                return 1611034105;
            }

            private Camera() {
            }

            @Override // com.paypal.oslo.core.mvi.Event
            public final java.lang.String getName() {
                return name;
            }

            public final java.lang.String toString() {
                return "Camera";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.Camera)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadMethodSelected$Gallery;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadMethodSelected;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Gallery implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.Gallery INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.Gallery();
            private static final java.lang.String name = "ManualUploadEvent.UploadMethodSelected.Gallery";

            public final int hashCode() {
                return 1951737598;
            }

            private Gallery() {
            }

            @Override // com.paypal.oslo.core.mvi.Event
            public final java.lang.String getName() {
                return name;
            }

            public final java.lang.String toString() {
                return "Gallery";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.Gallery)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadMethodSelected$FilePicker;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadMethodSelected;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class FilePicker implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.FilePicker INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.FilePicker();
            private static final java.lang.String name = "ManualUploadEvent.UploadMethodSelected.FilePicker";

            public final int hashCode() {
                return -663355906;
            }

            private FilePicker() {
            }

            @Override // com.paypal.oslo.core.mvi.Event
            public final java.lang.String getName() {
                return name;
            }

            public final java.lang.String toString() {
                return "FilePicker";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadMethodSelected.FilePicker)) {
                    return false;
                }
                return true;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00178\u0017X\u0097D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$FilesSelected;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "", "Landroid/net/Uri;", "uris", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/FileSource;", "source", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/FileSource;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/FileSource;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/FileSource;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$FilesSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getUris", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/FileSource;", "getSource", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FilesSelected implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 8;
        private final java.lang.String name;
        private final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource source;
        private final java.util.List<android.net.Uri> uris;

        /* JADX WARN: Multi-variable type inference failed */
        public FilesSelected(java.util.List<? extends android.net.Uri> list, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource fileSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileSource, "");
            this.uris = list;
            this.source = fileSource;
            this.name = "ManualUploadEvent.FilesSelected";
        }

        public final java.util.List<android.net.Uri> getUris() {
            return this.uris;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource getSource() {
            return this.source;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.util.List<android.net.Uri> list = this.uris;
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource fileSource = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FilesSelected(uris=");
            sb.append(list);
            sb.append(", source=");
            sb.append(fileSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.uris.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FilesSelected)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FilesSelected filesSelected = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FilesSelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uris, filesSelected.uris) && this.source == filesSelected.source;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FilesSelected copy(java.util.List<? extends android.net.Uri> uris, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uris, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FilesSelected(uris, source);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource getSource() {
            return this.source;
        }

        public final java.util.List<android.net.Uri> component1() {
            return this.uris;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FilesSelected copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FilesSelected filesSelected, java.util.List list, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.FileSource fileSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = filesSelected.uris;
            }
            if ((i & 2) != 0) {
                fileSource = filesSelected.source;
            }
            return filesSelected.copy(list, fileSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0017\u001a\u00020\u00128\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$PhotoCaptured;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "", "imageData", "<init>", "([B)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()[B", "copy", "([B)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$PhotoCaptured;", "", "toString", "()Ljava/lang/String;", "[B", "getImageData", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PhotoCaptured implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 8;
        private final byte[] imageData;
        private final java.lang.String name;

        public PhotoCaptured(byte[] bArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            this.imageData = bArr;
            this.name = "ManualUploadEvent.PhotoCaptured";
        }

        public final byte[] getImageData() {
            return this.imageData;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
            return java.util.Arrays.equals(this.imageData, ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PhotoCaptured) other).imageData);
        }

        public final int hashCode() {
            return java.util.Arrays.hashCode(this.imageData);
        }

        public final java.lang.String toString() {
            java.lang.String arrays = java.util.Arrays.toString(this.imageData);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhotoCaptured(imageData=");
            sb.append(arrays);
            sb.append(")");
            return sb.toString();
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PhotoCaptured copy(byte[] imageData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageData, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PhotoCaptured(imageData);
        }

        /* renamed from: component1, reason: from getter */
        public final byte[] getImageData() {
            return this.imageData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PhotoCaptured copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PhotoCaptured photoCaptured, byte[] bArr, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                bArr = photoCaptured.imageData;
            }
            return photoCaptured.copy(bArr);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00138\u0017X\u0097D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$SdkCaptureCompleted;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/SdkCaptureResult;", "results", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$SdkCaptureCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getResults", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SdkCaptureCompleted implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 8;
        private final java.lang.String name;
        private final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult> results;

        public SdkCaptureCompleted(java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.results = list;
            this.name = "ManualUploadEvent.SdkCaptureCompleted";
        }

        public final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult> getResults() {
            return this.results;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult> list = this.results;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkCaptureCompleted(results=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.results.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.SdkCaptureCompleted) && kotlin.jvm.internal.Intrinsics.areEqual(this.results, ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.SdkCaptureCompleted) other).results);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.SdkCaptureCompleted copy(java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult> results) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(results, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.SdkCaptureCompleted(results);
        }

        public final java.util.List<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.SdkCaptureResult> component1() {
            return this.results;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.SdkCaptureCompleted copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.SdkCaptureCompleted sdkCaptureCompleted, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = sdkCaptureCompleted.results;
            }
            return sdkCaptureCompleted.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJB\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b$\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u001bR\u001a\u0010'\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$FileProcessed;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "", "documentId", "fileName", "", "imageData", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "sizeKB", "<init>", "(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;J)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()[B", "component4", "component5", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;J)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$FileProcessed;", "toString", "Ljava/lang/String;", "getDocumentId", "getFileName", "[B", "getImageData", "getMimeType", "J", "getSizeKB", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FileProcessed implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 8;
        private final java.lang.String documentId;
        private final java.lang.String fileName;
        private final byte[] imageData;
        private final java.lang.String mimeType;
        private final java.lang.String name;
        private final long sizeKB;

        public FileProcessed(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, long j) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.documentId = str;
            this.fileName = str2;
            this.imageData = bArr;
            this.mimeType = str3;
            this.sizeKB = j;
            this.name = "ManualUploadEvent.FileProcessed";
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public final java.lang.String getFileName() {
            return this.fileName;
        }

        public final byte[] getImageData() {
            return this.imageData;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final long getSizeKB() {
            return this.sizeKB;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed fileProcessed = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, fileProcessed.documentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileName, fileProcessed.fileName) && java.util.Arrays.equals(this.imageData, fileProcessed.imageData) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, fileProcessed.mimeType) && this.sizeKB == fileProcessed.sizeKB;
        }

        public final int hashCode() {
            int hashCode = this.documentId.hashCode();
            int hashCode2 = this.fileName.hashCode();
            return (((((((hashCode * 31) + hashCode2) * 31) + java.util.Arrays.hashCode(this.imageData)) * 31) + this.mimeType.hashCode()) * 31) + java.lang.Long.hashCode(this.sizeKB);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.documentId;
            java.lang.String str2 = this.fileName;
            java.lang.String arrays = java.util.Arrays.toString(this.imageData);
            java.lang.String str3 = this.mimeType;
            long j = this.sizeKB;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FileProcessed(documentId=");
            sb.append(str);
            sb.append(", fileName=");
            sb.append(str2);
            sb.append(", imageData=");
            sb.append(arrays);
            sb.append(", mimeType=");
            sb.append(str3);
            sb.append(", sizeKB=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed copy(java.lang.String documentId, java.lang.String fileName, byte[] imageData, java.lang.String mimeType, long sizeKB) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mimeType, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed(documentId, fileName, imageData, mimeType, sizeKB);
        }

        /* renamed from: component5, reason: from getter */
        public final long getSizeKB() {
            return this.sizeKB;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        /* renamed from: component3, reason: from getter */
        public final byte[] getImageData() {
            return this.imageData;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFileName() {
            return this.fileName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.FileProcessed fileProcessed, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fileProcessed.documentId;
            }
            if ((i & 2) != 0) {
                str2 = fileProcessed.fileName;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                bArr = fileProcessed.imageData;
            }
            byte[] bArr2 = bArr;
            if ((i & 8) != 0) {
                str3 = fileProcessed.mimeType;
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                j = fileProcessed.sizeKB;
            }
            return fileProcessed.copy(str, str4, bArr2, str5, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$DeleteDocumentClicked;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$DeleteDocumentClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocumentId", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteDocumentClicked implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 0;
        private final java.lang.String documentId;
        private final java.lang.String name;

        public DeleteDocumentClicked(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.documentId = str;
            this.name = "ManualUploadEvent.DeleteDocumentClicked";
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.documentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteDocumentClicked(documentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.documentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteDocumentClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteDocumentClicked) other).documentId);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteDocumentClicked copy(java.lang.String documentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteDocumentClicked(documentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteDocumentClicked copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteDocumentClicked deleteDocumentClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deleteDocumentClicked.documentId;
            }
            return deleteDocumentClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$DeleteConfirmed;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$DeleteConfirmed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocumentId", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeleteConfirmed implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 0;
        private final java.lang.String documentId;
        private final java.lang.String name;

        public DeleteConfirmed(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.documentId = str;
            this.name = "ManualUploadEvent.DeleteConfirmed";
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.documentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteConfirmed(documentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.documentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteConfirmed) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteConfirmed) other).documentId);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteConfirmed copy(java.lang.String documentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteConfirmed(documentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteConfirmed copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DeleteConfirmed deleteConfirmed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deleteConfirmed.documentId;
            }
            return deleteConfirmed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00038\u0017X\u0097D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$StartUpload;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "", "", "documentIds", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$StartUpload;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getDocumentIds", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StartUpload implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> documentIds;
        private final java.lang.String name;

        public StartUpload(java.util.List<java.lang.String> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.documentIds = list;
            this.name = "ManualUploadEvent.StartUpload";
        }

        public final java.util.List<java.lang.String> getDocumentIds() {
            return this.documentIds;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.documentIds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StartUpload(documentIds=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.documentIds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.StartUpload) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentIds, ((com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.StartUpload) other).documentIds);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.StartUpload copy(java.util.List<java.lang.String> documentIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentIds, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.StartUpload(documentIds);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.documentIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.StartUpload copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.StartUpload startUpload, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = startUpload.documentIds;
            }
            return startUpload.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadSuccess;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "", "documentId", "fileId", "docId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocumentId", "getFileId", "getDocId", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UploadSuccess implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 0;
        private final java.lang.String docId;
        private final java.lang.String documentId;
        private final java.lang.String fileId;
        private final java.lang.String name;

        public UploadSuccess(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.documentId = str;
            this.fileId = str2;
            this.docId = str3;
            this.name = "ManualUploadEvent.UploadSuccess";
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public final java.lang.String getFileId() {
            return this.fileId;
        }

        public final java.lang.String getDocId() {
            return this.docId;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.documentId;
            java.lang.String str2 = this.fileId;
            java.lang.String str3 = this.docId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UploadSuccess(documentId=");
            sb.append(str);
            sb.append(", fileId=");
            sb.append(str2);
            sb.append(", docId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.documentId.hashCode() * 31) + this.fileId.hashCode()) * 31) + this.docId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess uploadSuccess = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, uploadSuccess.documentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fileId, uploadSuccess.fileId) && kotlin.jvm.internal.Intrinsics.areEqual(this.docId, uploadSuccess.docId);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess copy(java.lang.String documentId, java.lang.String fileId, java.lang.String docId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docId, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess(documentId, fileId, docId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDocId() {
            return this.docId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFileId() {
            return this.fileId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadSuccess uploadSuccess, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = uploadSuccess.documentId;
            }
            if ((i & 2) != 0) {
                str2 = uploadSuccess.fileId;
            }
            if ((i & 4) != 0) {
                str3 = uploadSuccess.docId;
            }
            return uploadSuccess.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "", "documentId", "errorMessage", "", "clearDocuments", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$UploadError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocumentId", "getErrorMessage", "Z", "getClearDocuments", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UploadError implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 0;
        private final boolean clearDocuments;
        private final java.lang.String documentId;
        private final java.lang.String errorMessage;
        private final java.lang.String name;

        public UploadError(java.lang.String str, java.lang.String str2, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.documentId = str;
            this.errorMessage = str2;
            this.clearDocuments = z;
            this.name = "ManualUploadEvent.UploadError";
        }

        public /* synthetic */ UploadError(java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean getClearDocuments() {
            return this.clearDocuments;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.documentId;
            java.lang.String str2 = this.errorMessage;
            boolean z = this.clearDocuments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UploadError(documentId=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(", clearDocuments=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.documentId.hashCode() * 31) + this.errorMessage.hashCode()) * 31) + java.lang.Boolean.hashCode(this.clearDocuments);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError uploadError = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, uploadError.documentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, uploadError.errorMessage) && this.clearDocuments == uploadError.clearDocuments;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError copy(java.lang.String documentId, java.lang.String errorMessage, boolean clearDocuments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError(documentId, errorMessage, clearDocuments);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getClearDocuments() {
            return this.clearDocuments;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.UploadError uploadError, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = uploadError.documentId;
            }
            if ((i & 2) != 0) {
                str2 = uploadError.errorMessage;
            }
            if ((i & 4) != 0) {
                z = uploadError.clearDocuments;
            }
            return uploadError.copy(str, str2, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$DismissError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "name", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissError implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DismissError INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DismissError();
        private static final java.lang.String name = "ManualUploadEvent.DismissError";

        public final int hashCode() {
            return -1055381157;
        }

        private DismissError() {
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return name;
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_DISMISS_ERROR;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.DismissError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$ShowError;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "", "message", "", "isPersistent", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$ShowError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Z", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowError implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 0;
        private final boolean isPersistent;
        private final java.lang.String message;
        private final java.lang.String name;

        public ShowError(java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.isPersistent = z;
            this.name = "ManualUploadEvent.ShowError";
        }

        public /* synthetic */ ShowError(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final boolean isPersistent() {
            return this.isPersistent;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            boolean z = this.isPersistent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowError(message=");
            sb.append(str);
            sb.append(", isPersistent=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + java.lang.Boolean.hashCode(this.isPersistent);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ShowError)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ShowError showError = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ShowError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, showError.message) && this.isPersistent == showError.isPersistent;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ShowError copy(java.lang.String message, boolean isPersistent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ShowError(message, isPersistent);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsPersistent() {
            return this.isPersistent;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ShowError copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.ShowError showError, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showError.message;
            }
            if ((i & 2) != 0) {
                z = showError.isPersistent;
            }
            return showError.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$PermissionResult;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent;", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "", "granted", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/manualupload/contract/ManualUploadEvent$PermissionResult;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPermission", "Z", "getGranted", "name", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PermissionResult implements com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent {
        public static final int $stable = 0;
        private final boolean granted;
        private final java.lang.String name;
        private final java.lang.String permission;

        public PermissionResult(java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.permission = str;
            this.granted = z;
            this.name = "ManualUploadEvent.PermissionResult";
        }

        public final java.lang.String getPermission() {
            return this.permission;
        }

        public final boolean getGranted() {
            return this.granted;
        }

        @Override // com.paypal.oslo.core.mvi.Event
        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.permission;
            boolean z = this.granted;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PermissionResult(permission=");
            sb.append(str);
            sb.append(", granted=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.permission.hashCode() * 31) + java.lang.Boolean.hashCode(this.granted);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PermissionResult)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PermissionResult permissionResult = (com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PermissionResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.permission, permissionResult.permission) && this.granted == permissionResult.granted;
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PermissionResult copy(java.lang.String permission, boolean granted) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permission, "");
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PermissionResult(permission, granted);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getGranted() {
            return this.granted;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPermission() {
            return this.permission;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PermissionResult copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.contract.ManualUploadEvent.PermissionResult permissionResult, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = permissionResult.permission;
            }
            if ((i & 2) != 0) {
                z = permissionResult.granted;
            }
            return permissionResult.copy(str, z);
        }
    }
}
