package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "", "<init>", "()V", "Success", "Failure", "Cancelled", "Timeout", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Failure;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Timeout;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class LivenessResult {
    public static final int $stable = 0;

    private LivenessResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJp\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0014R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010\u0014R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "", "sessionId", "faceScanData", "", "auditTrailImages", "lowQualityAuditTrailImages", "", "metadata", "", "retryCount", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "deviceCaptureData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ILcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/util/Map;", "component6", "()I", "component7", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ILcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getSessionId", "getFaceScanData", "Ljava/util/List;", "getAuditTrailImages", "getLowQualityAuditTrailImages", "Ljava/util/Map;", "getMetadata", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceCaptureData;", "getDeviceCaptureData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> auditTrailImages;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData;
        private final java.lang.String faceScanData;
        private final java.util.List<java.lang.String> lowQualityAuditTrailImages;
        private final java.util.Map<java.lang.String, java.lang.String> metadata;
        private final int retryCount;
        private final java.lang.String sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.util.Map<java.lang.String, java.lang.String> map, int i, com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.sessionId = str;
            this.faceScanData = str2;
            this.auditTrailImages = list;
            this.lowQualityAuditTrailImages = list2;
            this.metadata = map;
            this.retryCount = i;
            this.deviceCaptureData = deviceCaptureData;
        }

        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public final java.lang.String getFaceScanData() {
            return this.faceScanData;
        }

        public /* synthetic */ Success(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, java.util.Map map, int i, com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i2 & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : deviceCaptureData);
        }

        public final java.util.List<java.lang.String> getAuditTrailImages() {
            return this.auditTrailImages;
        }

        public final java.util.List<java.lang.String> getLowQualityAuditTrailImages() {
            return this.lowQualityAuditTrailImages;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getMetadata() {
            return this.metadata;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData getDeviceCaptureData() {
            return this.deviceCaptureData;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sessionId;
            java.lang.String str2 = this.faceScanData;
            java.util.List<java.lang.String> list = this.auditTrailImages;
            java.util.List<java.lang.String> list2 = this.lowQualityAuditTrailImages;
            java.util.Map<java.lang.String, java.lang.String> map = this.metadata;
            int i = this.retryCount;
            com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData = this.deviceCaptureData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(sessionId=");
            sb.append(str);
            sb.append(", faceScanData=");
            sb.append(str2);
            sb.append(", auditTrailImages=");
            sb.append(list);
            sb.append(", lowQualityAuditTrailImages=");
            sb.append(list2);
            sb.append(", metadata=");
            sb.append(map);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(", deviceCaptureData=");
            sb.append(deviceCaptureData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.sessionId.hashCode();
            int hashCode2 = this.faceScanData.hashCode();
            int hashCode3 = this.auditTrailImages.hashCode();
            int hashCode4 = this.lowQualityAuditTrailImages.hashCode();
            int hashCode5 = this.metadata.hashCode();
            int hashCode6 = java.lang.Integer.hashCode(this.retryCount);
            com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData = this.deviceCaptureData;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (deviceCaptureData == null ? 0 : deviceCaptureData.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success success = (com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, success.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.faceScanData, success.faceScanData) && kotlin.jvm.internal.Intrinsics.areEqual(this.auditTrailImages, success.auditTrailImages) && kotlin.jvm.internal.Intrinsics.areEqual(this.lowQualityAuditTrailImages, success.lowQualityAuditTrailImages) && kotlin.jvm.internal.Intrinsics.areEqual(this.metadata, success.metadata) && this.retryCount == success.retryCount && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceCaptureData, success.deviceCaptureData);
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success copy(java.lang.String sessionId, java.lang.String faceScanData, java.util.List<java.lang.String> auditTrailImages, java.util.List<java.lang.String> lowQualityAuditTrailImages, java.util.Map<java.lang.String, java.lang.String> metadata, int retryCount, com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceScanData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auditTrailImages, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowQualityAuditTrailImages, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
            return new com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success(sessionId, faceScanData, auditTrailImages, lowQualityAuditTrailImages, metadata, retryCount, deviceCaptureData);
        }

        /* renamed from: component7, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData getDeviceCaptureData() {
            return this.deviceCaptureData;
        }

        /* renamed from: component6, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component5() {
            return this.metadata;
        }

        public final java.util.List<java.lang.String> component4() {
            return this.lowQualityAuditTrailImages;
        }

        public final java.util.List<java.lang.String> component3() {
            return this.auditTrailImages;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFaceScanData() {
            return this.faceScanData;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Success success, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, java.util.Map map, int i, com.paypal.oslo.feature.verificationcapture.domain.model.DeviceCaptureData deviceCaptureData, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = success.sessionId;
            }
            if ((i2 & 2) != 0) {
                str2 = success.faceScanData;
            }
            java.lang.String str3 = str2;
            if ((i2 & 4) != 0) {
                list = success.auditTrailImages;
            }
            java.util.List list3 = list;
            if ((i2 & 8) != 0) {
                list2 = success.lowQualityAuditTrailImages;
            }
            java.util.List list4 = list2;
            if ((i2 & 16) != 0) {
                map = success.metadata;
            }
            java.util.Map map2 = map;
            if ((i2 & 32) != 0) {
                i = success.retryCount;
            }
            int i3 = i;
            if ((i2 & 64) != 0) {
                deviceCaptureData = success.deviceCaptureData;
            }
            return success.copy(str, str3, list3, list4, map2, i3, deviceCaptureData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Failure;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "error", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;)V", "component1", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "copy", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/VerificationError;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failure extends com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError verificationError) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verificationError, "");
            this.error = verificationError;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError verificationError = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(error=");
            sb.append(verificationError);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure) other).error);
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure copy(com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
            return new com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Failure failure, com.paypal.oslo.feature.verificationcapture.domain.model.VerificationError verificationError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                verificationError = failure.error;
            }
            return failure.copy(verificationError);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled extends com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Cancelled INSTANCE = new com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Cancelled();

        public final int hashCode() {
            return -829861442;
        }

        private Cancelled() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Timeout;", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult;", "", "durationMs", "<init>", "(J)V", "component1", "()J", "copy", "(J)Lcom/paypal/oslo/feature/verificationcapture/domain/model/LivenessResult$Timeout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDurationMs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Timeout extends com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult {
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
            return (other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Timeout) && this.durationMs == ((com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Timeout) other).durationMs;
        }

        public final com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Timeout copy(long durationMs) {
            return new com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Timeout(durationMs);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Timeout copy$default(com.paypal.oslo.feature.verificationcapture.domain.model.LivenessResult.Timeout timeout, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = timeout.durationMs;
            }
            return timeout.copy(j);
        }
    }

    public /* synthetic */ LivenessResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
