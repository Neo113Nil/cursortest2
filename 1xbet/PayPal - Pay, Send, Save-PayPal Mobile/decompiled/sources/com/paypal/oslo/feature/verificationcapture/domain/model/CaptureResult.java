package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "", "<init>", "()V", "Success", "UploadSuccess", "Failure", "Cancelled", "Timeout", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Failure;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Timeout;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$UploadSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CaptureResult {
    public static final int $stable = 0;

    private CaptureResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jt\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b9\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b:\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "Landroid/graphics/Bitmap;", "image", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/IdCaptureData;", "captureData", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "", "compressedImagePath", "documentId", "verificationPlatformId", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "deviceCaptureData", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/MetaData;", "metadata", "<init>", "(Landroid/graphics/Bitmap;Lcom/paypal/oslo/feature/verificationcapture/domain/model/IdCaptureData;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;Lcom/paypal/oslo/feature/verificationcapture/domain/model/MetaData;)V", "component1", "()Landroid/graphics/Bitmap;", "component2", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/IdCaptureData;", "component3", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "component4", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "component5", "()Ljava/lang/String;", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "component9", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/MetaData;", "copy", "(Landroid/graphics/Bitmap;Lcom/paypal/oslo/feature/verificationcapture/domain/model/IdCaptureData;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;Lcom/paypal/oslo/feature/verificationcapture/domain/model/MetaData;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Landroid/graphics/Bitmap;", "getImage", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/IdCaptureData;", "getCaptureData", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "getDocumentSide", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "getDocumentType", "Ljava/lang/String;", "getCompressedImagePath", "getDocumentId", "getVerificationPlatformId", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "getDeviceCaptureData", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/MetaData;", "getMetadata"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData captureData;
        private final java.lang.String compressedImagePath;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData;
        private final java.lang.String documentId;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType;
        private final android.graphics.Bitmap image;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.MetaData metadata;
        private final java.lang.String verificationPlatformId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(android.graphics.Bitmap bitmap, com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData idCaptureData, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData, com.paypal.oslo.feature.verificationcapture.domain.model.MetaData metaData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idCaptureData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            this.image = bitmap;
            this.captureData = idCaptureData;
            this.documentSide = documentSide;
            this.documentType = documentType;
            this.compressedImagePath = str;
            this.documentId = str2;
            this.verificationPlatformId = str3;
            this.deviceCaptureData = deviceCaptureData;
            this.metadata = metaData;
        }

        public /* synthetic */ Success(android.graphics.Bitmap bitmap, com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData idCaptureData, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData, com.paypal.oslo.feature.verificationcapture.domain.model.MetaData metaData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bitmap, idCaptureData, documentSide, documentType, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : deviceCaptureData, (i & 256) != 0 ? null : metaData);
        }

        public final android.graphics.Bitmap getImage() {
            return this.image;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData getCaptureData() {
            return this.captureData;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
            return this.documentSide;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }

        public final java.lang.String getCompressedImagePath() {
            return this.compressedImagePath;
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public final java.lang.String getVerificationPlatformId() {
            return this.verificationPlatformId;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData getDeviceCaptureData() {
            return this.deviceCaptureData;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.MetaData getMetadata() {
            return this.metadata;
        }

        public final java.lang.String toString() {
            android.graphics.Bitmap bitmap = this.image;
            com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData idCaptureData = this.captureData;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide = this.documentSide;
            com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType = this.documentType;
            java.lang.String str = this.compressedImagePath;
            java.lang.String str2 = this.documentId;
            java.lang.String str3 = this.verificationPlatformId;
            com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData = this.deviceCaptureData;
            com.paypal.oslo.feature.verificationcapture.domain.model.MetaData metaData = this.metadata;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(image=");
            sb.append(bitmap);
            sb.append(", captureData=");
            sb.append(idCaptureData);
            sb.append(", documentSide=");
            sb.append(documentSide);
            sb.append(", documentType=");
            sb.append(documentType);
            sb.append(", compressedImagePath=");
            sb.append(str);
            sb.append(", documentId=");
            sb.append(str2);
            sb.append(", verificationPlatformId=");
            sb.append(str3);
            sb.append(", deviceCaptureData=");
            sb.append(deviceCaptureData);
            sb.append(", metadata=");
            sb.append(metaData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.image.hashCode();
            int hashCode2 = this.captureData.hashCode();
            int hashCode3 = this.documentSide.hashCode();
            int hashCode4 = this.documentType.hashCode();
            java.lang.String str = this.compressedImagePath;
            int hashCode5 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.documentId;
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.verificationPlatformId;
            int hashCode7 = str3 == null ? 0 : str3.hashCode();
            com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData = this.deviceCaptureData;
            int hashCode8 = deviceCaptureData == null ? 0 : deviceCaptureData.hashCode();
            com.paypal.oslo.feature.verificationcapture.domain.model.MetaData metaData = this.metadata;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (metaData != null ? metaData.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success success = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.image, success.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.captureData, success.captureData) && this.documentSide == success.documentSide && this.documentType == success.documentType && kotlin.jvm.internal.Intrinsics.areEqual(this.compressedImagePath, success.compressedImagePath) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, success.documentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.verificationPlatformId, success.verificationPlatformId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceCaptureData, success.deviceCaptureData) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, success.metadata);
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success copy(android.graphics.Bitmap image, com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData captureData, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, java.lang.String compressedImagePath, java.lang.String documentId, java.lang.String verificationPlatformId, com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData, com.paypal.oslo.feature.verificationcapture.domain.model.MetaData metadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Success(image, captureData, documentSide, documentType, compressedImagePath, documentId, verificationPlatformId, deviceCaptureData, metadata);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.MetaData getMetadata() {
            return this.metadata;
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData getDeviceCaptureData() {
            return this.deviceCaptureData;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getVerificationPlatformId() {
            return this.verificationPlatformId;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCompressedImagePath() {
            return this.compressedImagePath;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType getDocumentType() {
            return this.documentType;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide getDocumentSide() {
            return this.documentSide;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.IdCaptureData getCaptureData() {
            return this.captureData;
        }

        /* renamed from: component1, reason: from getter */
        public final android.graphics.Bitmap getImage() {
            return this.image;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$UploadSuccess;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "", "documentId", "status", "verificationPlatformId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$UploadSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDocumentId", "getStatus", "getVerificationPlatformId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UploadSuccess extends com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult {
        public static final int $stable = 0;
        private final java.lang.String documentId;
        private final java.lang.String status;
        private final java.lang.String verificationPlatformId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UploadSuccess(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.documentId = str;
            this.status = str2;
            this.verificationPlatformId = str3;
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public /* synthetic */ UploadSuccess(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3);
        }

        public final java.lang.String getStatus() {
            return this.status;
        }

        public final java.lang.String getVerificationPlatformId() {
            return this.verificationPlatformId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.documentId;
            java.lang.String str2 = this.status;
            java.lang.String str3 = this.verificationPlatformId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UploadSuccess(documentId=");
            sb.append(str);
            sb.append(", status=");
            sb.append(str2);
            sb.append(", verificationPlatformId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.documentId.hashCode();
            int hashCode2 = this.status.hashCode();
            java.lang.String str = this.verificationPlatformId;
            return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess uploadSuccess = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, uploadSuccess.documentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, uploadSuccess.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.verificationPlatformId, uploadSuccess.verificationPlatformId);
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess copy(java.lang.String documentId, java.lang.String status, java.lang.String verificationPlatformId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess(documentId, status, verificationPlatformId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getVerificationPlatformId() {
            return this.verificationPlatformId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getStatus() {
            return this.status;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess uploadSuccess, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = uploadSuccess.documentId;
            }
            if ((i & 2) != 0) {
                str2 = uploadSuccess.status;
            }
            if ((i & 4) != 0) {
                str3 = uploadSuccess.verificationPlatformId;
            }
            return uploadSuccess.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Failure;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "", "errorCode", "errorMessage", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorMessage", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failure extends com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult {
        public static final int $stable = 8;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;
        private final java.lang.Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorCode = str;
            this.errorMessage = str2;
            this.throwable = th;
        }

        public /* synthetic */ Failure(java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : th);
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorMessage;
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(errorCode=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(", throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorCode.hashCode();
            int hashCode2 = this.errorMessage.hashCode();
            java.lang.Throwable th = this.throwable;
            return (((hashCode * 31) + hashCode2) * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure failure = (com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, failure.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, failure.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, failure.throwable);
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure copy(java.lang.String errorCode, java.lang.String errorMessage, java.lang.Throwable throwable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure(errorCode, errorMessage, throwable);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Failure failure, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = failure.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = failure.errorMessage;
            }
            if ((i & 4) != 0) {
                th = failure.throwable;
            }
            return failure.copy(str, str2, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Cancelled extends com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Cancelled INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Cancelled();

        private Cancelled() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Timeout;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "", "durationMs", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult$Timeout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDurationMs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Timeout extends com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult {
        public static final int $stable = 0;
        private final long durationMs;

        public Timeout(long j) {
            super(null);
            this.durationMs = j;
        }

        public final long getDurationMs() {
            return this.durationMs;
        }

        public final java.lang.String toString() {
            long j = this.durationMs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Timeout(durationMs=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Long.hashCode(this.durationMs);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout) && this.durationMs == ((com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout) other).durationMs;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout copy(long durationMs) {
            return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout(durationMs);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.Timeout timeout, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = timeout.durationMs;
            }
            return timeout.copy(j);
        }
    }

    public /* synthetic */ CaptureResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
