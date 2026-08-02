package com.paypal.oslo.feature.verificationcapture.navigation.result;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Success", "Cancelled", "Timeout", "Error", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Error;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Timeout;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class DaonFaceLivenessNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.$r8$lambda$Pgw6HUXDayPgi5wgbrqms0Ew8uw();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private DaonFaceLivenessNavResult() {
    }

    public /* synthetic */ DaonFaceLivenessNavResult(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016JB\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J'\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult;", "", "faceImageBytes", "", "activeLivenessScore", "qualityScore", "eyeOpenScore", "", "effortTimeSeconds", "<init>", "([BFFFI)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(I[BFFFILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()[B", "component2", "()F", "component3", "component4", "component5", "copy", "([BFFFI)Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Success;", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "[B", "getFaceImageBytes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getActiveLivenessScore", "getQualityScore", "getEyeOpenScore", com.visa.cbp.getEncExpo.warmup, "getEffortTimeSeconds", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Success extends com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult {
        private final float activeLivenessScore;
        private final int effortTimeSeconds;
        private final float eyeOpenScore;
        private final byte[] faceImageBytes;
        private final float qualityScore;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success.Companion(null);
        public static final int $stable = 8;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success> serializer() {
                return com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Success$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Success(int i, byte[] bArr, float f, float f2, float f3, int i2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (31 != (i & 31)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Success$$serializer.INSTANCE.getDescriptor());
            }
            this.faceImageBytes = bArr;
            this.activeLivenessScore = f;
            this.qualityScore = f2;
            this.eyeOpenScore = f3;
            this.effortTimeSeconds = i2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(byte[] bArr, float f, float f2, float f3, int i) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            this.faceImageBytes = bArr;
            this.activeLivenessScore = f;
            this.qualityScore = f2;
            this.eyeOpenScore = f3;
            this.effortTimeSeconds = i;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$verification_capture_prodRelease(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, self.faceImageBytes);
            output.encodeFloatElement(serialDesc, 1, self.activeLivenessScore);
            output.encodeFloatElement(serialDesc, 2, self.qualityScore);
            output.encodeFloatElement(serialDesc, 3, self.eyeOpenScore);
            output.encodeIntElement(serialDesc, 4, self.effortTimeSeconds);
        }

        public final byte[] getFaceImageBytes() {
            return this.faceImageBytes;
        }

        public final float getActiveLivenessScore() {
            return this.activeLivenessScore;
        }

        public final float getQualityScore() {
            return this.qualityScore;
        }

        public final float getEyeOpenScore() {
            return this.eyeOpenScore;
        }

        public final int getEffortTimeSeconds() {
            return this.effortTimeSeconds;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
                return false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
            com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success success = (com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success) other;
            return java.util.Arrays.equals(this.faceImageBytes, success.faceImageBytes) && this.activeLivenessScore == success.activeLivenessScore && this.qualityScore == success.qualityScore && this.eyeOpenScore == success.eyeOpenScore && this.effortTimeSeconds == success.effortTimeSeconds;
        }

        public final int hashCode() {
            int hashCode = java.util.Arrays.hashCode(this.faceImageBytes);
            int hashCode2 = java.lang.Float.hashCode(this.activeLivenessScore);
            return (((((((hashCode * 31) + hashCode2) * 31) + java.lang.Float.hashCode(this.qualityScore)) * 31) + java.lang.Float.hashCode(this.eyeOpenScore)) * 31) + this.effortTimeSeconds;
        }

        public final java.lang.String toString() {
            java.lang.String arrays = java.util.Arrays.toString(this.faceImageBytes);
            float f = this.activeLivenessScore;
            float f2 = this.qualityScore;
            float f3 = this.eyeOpenScore;
            int i = this.effortTimeSeconds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(faceImageBytes=");
            sb.append(arrays);
            sb.append(", activeLivenessScore=");
            sb.append(f);
            sb.append(", qualityScore=");
            sb.append(f2);
            sb.append(", eyeOpenScore=");
            sb.append(f3);
            sb.append(", effortTimeSeconds=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success copy(byte[] faceImageBytes, float activeLivenessScore, float qualityScore, float eyeOpenScore, int effortTimeSeconds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(faceImageBytes, "");
            return new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success(faceImageBytes, activeLivenessScore, qualityScore, eyeOpenScore, effortTimeSeconds);
        }

        /* renamed from: component5, reason: from getter */
        public final int getEffortTimeSeconds() {
            return this.effortTimeSeconds;
        }

        /* renamed from: component4, reason: from getter */
        public final float getEyeOpenScore() {
            return this.eyeOpenScore;
        }

        /* renamed from: component3, reason: from getter */
        public final float getQualityScore() {
            return this.qualityScore;
        }

        /* renamed from: component2, reason: from getter */
        public final float getActiveLivenessScore() {
            return this.activeLivenessScore;
        }

        /* renamed from: component1, reason: from getter */
        public final byte[] getFaceImageBytes() {
            return this.faceImageBytes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success copy$default(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success success, byte[] bArr, float f, float f2, float f3, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                bArr = success.faceImageBytes;
            }
            if ((i2 & 2) != 0) {
                f = success.activeLivenessScore;
            }
            float f4 = f;
            if ((i2 & 4) != 0) {
                f2 = success.qualityScore;
            }
            float f5 = f2;
            if ((i2 & 8) != 0) {
                f3 = success.eyeOpenScore;
            }
            float f6 = f3;
            if ((i2 & 16) != 0) {
                i = success.effortTimeSeconds;
            }
            return success.copy(bArr, f4, f5, f6, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes15.dex */
    public static final /* data */ class Cancelled extends com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Cancelled INSTANCE = new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Cancelled();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Cancelled$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Cancelled.m20623$r8$lambda$nvEIpevYQeejejlM7HxteB8CWo();
            }
        });

        public final int hashCode() {
            return 706691324;
        }

        private Cancelled() {
            super(null);
        }

        /* renamed from: $r8$lambda$nvEIpevYQeeje-jlM7HxteB8CWo, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m20623$r8$lambda$nvEIpevYQeejejlM7HxteB8CWo() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Cancelled", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Cancelled> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Timeout;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult;", "", "timeoutSeconds", "<init>", "(I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Timeout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Timeout;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getTimeoutSeconds", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Timeout extends com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout.Companion(null);
        private final int timeoutSeconds;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Timeout$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Timeout;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout> serializer() {
                return com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Timeout$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Timeout(int i) {
            super(null);
            this.timeoutSeconds = i;
        }

        public /* synthetic */ Timeout(int i, int i2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if ((i & 1) == 0) {
                this.timeoutSeconds = 60;
            } else {
                this.timeoutSeconds = i2;
            }
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$verification_capture_prodRelease(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.write$Self(self, output, serialDesc);
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.timeoutSeconds != 60) {
                output.encodeIntElement(serialDesc, 0, self.timeoutSeconds);
            }
        }

        public /* synthetic */ Timeout(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 60 : i);
        }

        public final int getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public final java.lang.String toString() {
            int i = this.timeoutSeconds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Timeout(timeoutSeconds=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.timeoutSeconds);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout) && this.timeoutSeconds == ((com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout) other).timeoutSeconds;
        }

        public final com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout copy(int timeoutSeconds) {
            return new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout(timeoutSeconds);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout copy$default(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout timeout, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = timeout.timeoutSeconds;
            }
            return timeout.copy(i);
        }

        public Timeout() {
            this(0, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Error;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult;", "", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorCode", "getErrorMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Error extends com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error.Companion(null);
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/result/DaonFaceLivenessNavResult$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error> serializer() {
                return com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Error$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Error(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Error$$serializer.INSTANCE.getDescriptor());
            }
            this.errorCode = str;
            this.errorMessage = str2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorCode = str;
            this.errorMessage = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$verification_capture_prodRelease(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.write$Self(self, output, serialDesc);
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
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error error = (com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage);
        }

        public final com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error copy(java.lang.String errorCode, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error(errorCode, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error copy$default(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error error, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = error.errorMessage;
            }
            return error.copy(str, str2);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$Pgw6HUXDayPgi5wgbrqms0Ew8uw() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Error.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Success.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Timeout.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Cancelled", com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Error$$serializer.INSTANCE, com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Success$$serializer.INSTANCE, com.paypal.oslo.feature.verificationcapture.navigation.result.DaonFaceLivenessNavResult$Timeout$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ DaonFaceLivenessNavResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
