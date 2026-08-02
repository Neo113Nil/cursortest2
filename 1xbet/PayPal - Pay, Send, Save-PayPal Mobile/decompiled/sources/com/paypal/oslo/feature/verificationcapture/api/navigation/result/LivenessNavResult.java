package com.paypal.oslo.feature.verificationcapture.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Companion", "Success", "Cancelled", "Timeout", "Error", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Error;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Timeout;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface LivenessNavResult extends com.paypal.oslo.core.navigation.result.NavResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Companion INSTANCE = com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Companion.getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled", com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult$Error$$serializer.INSTANCE, com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult$Success$$serializer.INSTANCE, com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult$Timeout$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JN\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0011J'\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0014R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult;", "", "sessionId", "faceScanData", "", "auditTrailImages", "lowQualityAuditTrailImages", "", "retryCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_api_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSessionId", "getFaceScanData", "Ljava/util/List;", "getAuditTrailImages", "getLowQualityAuditTrailImages", com.visa.cbp.getEncExpo.warmup, "getRetryCount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Success implements com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult {
        private final java.util.List<java.lang.String> auditTrailImages;
        private final java.lang.String faceScanData;
        private final java.util.List<java.lang.String> lowQualityAuditTrailImages;
        private final int retryCount;
        private final java.lang.String sessionId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult$Success$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success.$r8$lambda$2PlXxBJUYfKTEtfAEDQMdxP8p8Q();
            }
        }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult$Success$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success.m20594$r8$lambda$iCJoItQDg3Mn1iUA688oW9pt5U();
            }
        }), null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success> serializer() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult$Success$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Success(int i, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, int i2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult$Success$$serializer.INSTANCE.getDescriptor());
            }
            this.sessionId = str;
            this.faceScanData = str2;
            if ((i & 4) == 0) {
                this.auditTrailImages = kotlin.collections.CollectionsKt.emptyList();
            } else {
                this.auditTrailImages = list;
            }
            if ((i & 8) == 0) {
                this.lowQualityAuditTrailImages = kotlin.collections.CollectionsKt.emptyList();
            } else {
                this.lowQualityAuditTrailImages = list2;
            }
            if ((i & 16) == 0) {
                this.retryCount = 0;
            } else {
                this.retryCount = i2;
            }
        }

        public Success(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.sessionId = str;
            this.faceScanData = str2;
            this.auditTrailImages = list;
            this.lowQualityAuditTrailImages = list2;
            this.retryCount = i;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$verification_capture_api_prodRelease(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.sessionId);
            output.encodeStringElement(serialDesc, 1, self.faceScanData);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !kotlin.jvm.internal.Intrinsics.areEqual(self.auditTrailImages, kotlin.collections.CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 2, lazyArr[2].getValue(), self.auditTrailImages);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.lowQualityAuditTrailImages, kotlin.collections.CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.lowQualityAuditTrailImages);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.retryCount != 0) {
                output.encodeIntElement(serialDesc, 4, self.retryCount);
            }
        }

        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public final java.lang.String getFaceScanData() {
            return this.faceScanData;
        }

        public /* synthetic */ Success(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i2 & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i2 & 16) != 0 ? 0 : i);
        }

        public final java.util.List<java.lang.String> getAuditTrailImages() {
            return this.auditTrailImages;
        }

        public final java.util.List<java.lang.String> getLowQualityAuditTrailImages() {
            return this.lowQualityAuditTrailImages;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$2PlXxBJUYfKTEtfAEDQMdxP8p8Q() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }

        /* renamed from: $r8$lambda$iCJoItQDg3Mn-1iUA688oW9pt5U, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m20594$r8$lambda$iCJoItQDg3Mn1iUA688oW9pt5U() {
            return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sessionId;
            java.lang.String str2 = this.faceScanData;
            java.util.List<java.lang.String> list = this.auditTrailImages;
            java.util.List<java.lang.String> list2 = this.lowQualityAuditTrailImages;
            int i = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(sessionId=");
            sb.append(str);
            sb.append(", faceScanData=");
            sb.append(str2);
            sb.append(", auditTrailImages=");
            sb.append(list);
            sb.append(", lowQualityAuditTrailImages=");
            sb.append(list2);
            sb.append(", retryCount=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.sessionId.hashCode() * 31) + this.faceScanData.hashCode()) * 31) + this.auditTrailImages.hashCode()) * 31) + this.lowQualityAuditTrailImages.hashCode()) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success success = (com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, success.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.faceScanData, success.faceScanData) && kotlin.jvm.internal.Intrinsics.areEqual(this.auditTrailImages, success.auditTrailImages) && kotlin.jvm.internal.Intrinsics.areEqual(this.lowQualityAuditTrailImages, success.lowQualityAuditTrailImages) && this.retryCount == success.retryCount;
        }

        public final com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success copy(java.lang.String sessionId, java.lang.String faceScanData, java.util.List<java.lang.String> auditTrailImages, java.util.List<java.lang.String> lowQualityAuditTrailImages, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceScanData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auditTrailImages, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowQualityAuditTrailImages, "");
            return new com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success(sessionId, faceScanData, auditTrailImages, lowQualityAuditTrailImages, retryCount);
        }

        /* renamed from: component5, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
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

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success copy$default(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Success success, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, int i, int i2, java.lang.Object obj) {
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
                i = success.retryCount;
            }
            return success.copy(str, str3, list3, list4, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes15.dex */
    public static final /* data */ class Cancelled implements com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult {
        public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult$Cancelled$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled.m20593$r8$lambda$jIk9CzOAvH4h8MkIh7EFKbtsRs();
            }
        });
        public static final int $stable = 8;

        public final int hashCode() {
            return -762115455;
        }

        private Cancelled() {
        }

        /* renamed from: $r8$lambda$jIk9Cz-OAvH4h8MkIh7EFKbtsRs, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m20593$r8$lambda$jIk9CzOAvH4h8MkIh7EFKbtsRs() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Timeout;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult;", "", "durationMs", "<init>", "(J)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()J", "copy", "(J)Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Timeout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_api_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Timeout;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "J", "getDurationMs", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Timeout implements com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout.Companion(null);
        private final long durationMs;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Timeout$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Timeout;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout> serializer() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult$Timeout$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Timeout(int i, long j, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.durationMs = 0L;
            } else {
                this.durationMs = j;
            }
        }

        public Timeout(long j) {
            this.durationMs = j;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$verification_capture_api_prodRelease(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.durationMs != 0) {
                output.encodeLongElement(serialDesc, 0, self.durationMs);
            }
        }

        public /* synthetic */ Timeout(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j);
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
            return (other instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout) && this.durationMs == ((com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout) other).durationMs;
        }

        public final com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout copy(long durationMs) {
            return new com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout(durationMs);
        }

        /* renamed from: component1, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout copy$default(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Timeout timeout, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                j = timeout.durationMs;
            }
            return timeout.copy(j);
        }

        public Timeout() {
            this(0L, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Error;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult;", "", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_api_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorCode", "getErrorMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Error implements com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error.Companion(null);
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/LivenessNavResult$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error> serializer() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult$Error$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Error(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult$Error$$serializer.INSTANCE.getDescriptor());
            }
            this.errorCode = str;
            this.errorMessage = str2;
        }

        public Error(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorCode = str;
            this.errorMessage = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$verification_capture_api_prodRelease(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.errorCode);
            output.encodeStringElement(serialDesc, 1, self.errorMessage);
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorCode=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorCode.hashCode() * 31) + this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error error = (com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage);
        }

        public final com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error copy(java.lang.String errorCode, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error(errorCode, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error copy$default(com.paypal.oslo.feature.verificationcapture.api.navigation.result.LivenessNavResult.Error error, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = error.errorMessage;
            }
            return error.copy(str, str2);
        }
    }
}
