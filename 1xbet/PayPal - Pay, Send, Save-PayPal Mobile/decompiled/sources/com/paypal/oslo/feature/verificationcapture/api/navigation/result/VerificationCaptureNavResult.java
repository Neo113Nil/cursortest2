package com.paypal.oslo.feature.verificationcapture.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002\u0082\u0001\u0005\b\t\n\u000b\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Companion", "Success", "Cancelled", "Error", "Timeout", "SessionExpired", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Error;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$SessionExpired;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Timeout;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface VerificationCaptureNavResult extends com.paypal.oslo.core.navigation.result.NavResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Companion INSTANCE = com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Companion.getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.SessionExpired.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$Cancelled$$serializer.INSTANCE, com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$Error$$serializer.INSTANCE, com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$SessionExpired$$serializer.INSTANCE, com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$Success$$serializer.INSTANCE, com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$Timeout$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult;", "", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/CaptureResult;", "captureResults", "", "livenessCompleted", "", "sessionId", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;ZLjava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_api_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getCaptureResults", "Z", "getLivenessCompleted", "Ljava/lang/String;", "getSessionId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Success implements com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult {
        private final java.util.List<com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult> captureResults;
        private final boolean livenessCompleted;
        private final java.lang.String sessionId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$Success$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success.m20595$r8$lambda$3aanE3ws_8JprLVsu1BLrH2_lU();
            }
        }), null, null};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success> serializer() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$Success$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Success(int i, java.util.List list, boolean z, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            this.captureResults = (i & 1) == 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.livenessCompleted = false;
            } else {
                this.livenessCompleted = z;
            }
            if ((i & 4) == 0) {
                this.sessionId = "";
            } else {
                this.sessionId = str;
            }
        }

        public Success(java.util.List<com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult> list, boolean z, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.captureResults = list;
            this.livenessCompleted = z;
            this.sessionId = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$verification_capture_api_prodRelease(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.captureResults, kotlin.collections.CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.captureResults);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.livenessCompleted) {
                output.encodeBooleanElement(serialDesc, 1, self.livenessCompleted);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !kotlin.jvm.internal.Intrinsics.areEqual(self.sessionId, "")) {
                output.encodeStringElement(serialDesc, 2, self.sessionId);
            }
        }

        public /* synthetic */ Success(java.util.List list, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str);
        }

        public final java.util.List<com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult> getCaptureResults() {
            return this.captureResults;
        }

        public final boolean getLivenessCompleted() {
            return this.livenessCompleted;
        }

        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        /* renamed from: $r8$lambda$3aanE3ws_8JprLVsu1B-LrH2_lU, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m20595$r8$lambda$3aanE3ws_8JprLVsu1BLrH2_lU() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult$$serializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult> list = this.captureResults;
            boolean z = this.livenessCompleted;
            java.lang.String str = this.sessionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(captureResults=");
            sb.append(list);
            sb.append(", livenessCompleted=");
            sb.append(z);
            sb.append(", sessionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.captureResults.hashCode() * 31) + java.lang.Boolean.hashCode(this.livenessCompleted)) * 31) + this.sessionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success success = (com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.captureResults, success.captureResults) && this.livenessCompleted == success.livenessCompleted && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, success.sessionId);
        }

        public final com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success copy(java.util.List<com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult> captureResults, boolean livenessCompleted, java.lang.String sessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureResults, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
            return new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success(captureResults, livenessCompleted, sessionId);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getLivenessCompleted() {
            return this.livenessCompleted;
        }

        public final java.util.List<com.paypal.oslo.feature.verificationcapture.api.navigation.result.CaptureResult> component1() {
            return this.captureResults;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success copy$default(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Success success, java.util.List list, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.captureResults;
            }
            if ((i & 2) != 0) {
                z = success.livenessCompleted;
            }
            if ((i & 4) != 0) {
                str = success.sessionId;
            }
            return success.copy(list, z, str);
        }

        public Success() {
            this((java.util.List) null, false, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult;", "", "stage", "", "documentsUploaded", "<init>", "(Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Cancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_api_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Cancelled;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getStage", com.visa.cbp.getEncExpo.warmup, "getDocumentsUploaded", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Cancelled implements com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled.Companion(null);
        private final int documentsUploaded;
        private final java.lang.String stage;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Cancelled$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Cancelled;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled> serializer() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$Cancelled$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Cancelled(int i, java.lang.String str, int i2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            this.stage = (i & 1) == 0 ? "UNKNOWN" : str;
            if ((i & 2) == 0) {
                this.documentsUploaded = 0;
            } else {
                this.documentsUploaded = i2;
            }
        }

        public Cancelled(java.lang.String str, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.stage = str;
            this.documentsUploaded = i;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$verification_capture_api_prodRelease(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.stage, "UNKNOWN")) {
                output.encodeStringElement(serialDesc, 0, self.stage);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.documentsUploaded != 0) {
                output.encodeIntElement(serialDesc, 1, self.documentsUploaded);
            }
        }

        public /* synthetic */ Cancelled(java.lang.String str, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "UNKNOWN" : str, (i2 & 2) != 0 ? 0 : i);
        }

        public final java.lang.String getStage() {
            return this.stage;
        }

        public final int getDocumentsUploaded() {
            return this.documentsUploaded;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.stage;
            int i = this.documentsUploaded;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cancelled(stage=");
            sb.append(str);
            sb.append(", documentsUploaded=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.stage.hashCode() * 31) + java.lang.Integer.hashCode(this.documentsUploaded);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled cancelled = (com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.stage, cancelled.stage) && this.documentsUploaded == cancelled.documentsUploaded;
        }

        public final com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled copy(java.lang.String stage, int documentsUploaded) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stage, "");
            return new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled(stage, documentsUploaded);
        }

        /* renamed from: component2, reason: from getter */
        public final int getDocumentsUploaded() {
            return this.documentsUploaded;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getStage() {
            return this.stage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled copy$default(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Cancelled cancelled, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = cancelled.stage;
            }
            if ((i2 & 2) != 0) {
                i = cancelled.documentsUploaded;
            }
            return cancelled.copy(str, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Cancelled() {
            this((java.lang.String) null, 0, 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b\u0006\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Error;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult;", "", "errorCode", "errorMessage", "", "isRecoverable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_api_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorCode", "getErrorMessage", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Error implements com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error.Companion(null);
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;
        private final boolean isRecoverable;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error> serializer() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$Error$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Error(int i, java.lang.String str, java.lang.String str2, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$Error$$serializer.INSTANCE.getDescriptor());
            }
            this.errorCode = str;
            this.errorMessage = str2;
            if ((i & 4) == 0) {
                this.isRecoverable = false;
            } else {
                this.isRecoverable = z;
            }
        }

        public Error(java.lang.String str, java.lang.String str2, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorCode = str;
            this.errorMessage = str2;
            this.isRecoverable = z;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$verification_capture_api_prodRelease(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.errorCode);
            output.encodeStringElement(serialDesc, 1, self.errorMessage);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isRecoverable) {
                output.encodeBooleanElement(serialDesc, 2, self.isRecoverable);
            }
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z);
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean isRecoverable() {
            return this.isRecoverable;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorMessage;
            boolean z = this.isRecoverable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorCode=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(", isRecoverable=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorCode.hashCode() * 31) + this.errorMessage.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isRecoverable);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error error = (com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && this.isRecoverable == error.isRecoverable;
        }

        public final com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error copy(java.lang.String errorCode, java.lang.String errorMessage, boolean isRecoverable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error(errorCode, errorMessage, isRecoverable);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsRecoverable() {
            return this.isRecoverable;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error copy$default(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Error error, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = error.errorMessage;
            }
            if ((i & 4) != 0) {
                z = error.isRecoverable;
            }
            return error.copy(str, str2, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Timeout;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult;", "", "timeoutStage", "", "timeoutSeconds", "<init>", "(Ljava/lang/String;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Timeout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_api_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Timeout;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getTimeoutStage", com.visa.cbp.getEncExpo.warmup, "getTimeoutSeconds", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Timeout implements com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout.Companion(null);
        private final int timeoutSeconds;
        private final java.lang.String timeoutStage;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Timeout$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$Timeout;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout> serializer() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$Timeout$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Timeout(int i, java.lang.String str, int i2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$Timeout$$serializer.INSTANCE.getDescriptor());
            }
            this.timeoutStage = str;
            this.timeoutSeconds = i2;
        }

        public Timeout(java.lang.String str, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.timeoutStage = str;
            this.timeoutSeconds = i;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$verification_capture_api_prodRelease(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.timeoutStage);
            output.encodeIntElement(serialDesc, 1, self.timeoutSeconds);
        }

        public final java.lang.String getTimeoutStage() {
            return this.timeoutStage;
        }

        public final int getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.timeoutStage;
            int i = this.timeoutSeconds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Timeout(timeoutStage=");
            sb.append(str);
            sb.append(", timeoutSeconds=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.timeoutStage.hashCode() * 31) + java.lang.Integer.hashCode(this.timeoutSeconds);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout timeout = (com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.timeoutStage, timeout.timeoutStage) && this.timeoutSeconds == timeout.timeoutSeconds;
        }

        public final com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout copy(java.lang.String timeoutStage, int timeoutSeconds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeoutStage, "");
            return new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout(timeoutStage, timeoutSeconds);
        }

        /* renamed from: component2, reason: from getter */
        public final int getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getTimeoutStage() {
            return this.timeoutStage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout copy$default(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.Timeout timeout, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = timeout.timeoutStage;
            }
            if ((i2 & 2) != 0) {
                i = timeout.timeoutSeconds;
            }
            return timeout.copy(str, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$SessionExpired;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult;", "", "sessionId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$SessionExpired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_api_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$SessionExpired;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getSessionId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class SessionExpired implements com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.SessionExpired.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.SessionExpired.Companion(null);
        private final java.lang.String sessionId;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$SessionExpired$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/api/navigation/result/VerificationCaptureNavResult$SessionExpired;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.SessionExpired> serializer() {
                return com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$SessionExpired$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ SessionExpired(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult$SessionExpired$$serializer.INSTANCE.getDescriptor());
            }
            this.sessionId = str;
        }

        public SessionExpired(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.sessionId = str;
        }

        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.sessionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SessionExpired(sessionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.sessionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.SessionExpired) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, ((com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.SessionExpired) other).sessionId);
        }

        public final com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.SessionExpired copy(java.lang.String sessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
            return new com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.SessionExpired(sessionId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.SessionExpired copy$default(com.paypal.oslo.feature.verificationcapture.api.navigation.result.VerificationCaptureNavResult.SessionExpired sessionExpired, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sessionExpired.sessionId;
            }
            return sessionExpired.copy(str);
        }
    }
}
