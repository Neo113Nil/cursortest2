package com.paypal.oslo.feature.verificationcapture.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bq\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Companion", "Success", "Cancelled", "Timeout", "Error", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Error;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Timeout;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface DocumentCaptureNavResult extends com.paypal.oslo.core.navigation.result.NavResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Companion INSTANCE = com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Companion.getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled", com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Error$$serializer.INSTANCE, com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Success$$serializer.INSTANCE, com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Timeout$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJB\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010!J\u0092\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b0\u0010!J\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u0010\u001cJ'\u00108\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b>\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b@\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bC\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bD\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bE\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bF\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bG\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\b\u0011\u0010(R\u001a\u0010\u0012\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bI\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult;", "", "imageBytes", "", "documentType", "documentSide", "", "documentDetectionScore", "", "captureTimeSeconds", "documentId", "verificationPlatformId", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "extractedData", "metaData", "", "isManualCapture", "retryCount", "<init>", "([BLjava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(I[BLjava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()[B", "component2", "()Ljava/lang/String;", "component3", "component4", "()F", "component5", "()I", "component6", "component7", "component8", "component9", "component10", "component11", "()Z", "component12", "copy", "([BLjava/lang/String;Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "[B", "getImageBytes", "Ljava/lang/String;", "getDocumentType", "getDocumentSide", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDocumentDetectionScore", com.visa.cbp.getEncExpo.warmup, "getCaptureTimeSeconds", "getDocumentId", "getVerificationPlatformId", "getBarcode", "getExtractedData", "getMetaData", "Z", "getRetryCount", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Success implements com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult {
        private final java.lang.String barcode;
        private final int captureTimeSeconds;
        private final float documentDetectionScore;
        private final java.lang.String documentId;
        private final java.lang.String documentSide;
        private final java.lang.String documentType;
        private final java.lang.String extractedData;
        private final byte[] imageBytes;
        private final boolean isManualCapture;
        private final java.lang.String metaData;
        private final int retryCount;
        private final java.lang.String verificationPlatformId;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success.Companion(null);
        public static final int $stable = 8;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success> serializer() {
                return com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Success$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Success(int i, byte[] bArr, java.lang.String str, java.lang.String str2, float f, int i2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, int i3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (31 != (i & 31)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Success$$serializer.INSTANCE.getDescriptor());
            }
            this.imageBytes = bArr;
            this.documentType = str;
            this.documentSide = str2;
            this.documentDetectionScore = f;
            this.captureTimeSeconds = i2;
            if ((i & 32) == 0) {
                this.documentId = null;
            } else {
                this.documentId = str3;
            }
            if ((i & 64) == 0) {
                this.verificationPlatformId = null;
            } else {
                this.verificationPlatformId = str4;
            }
            if ((i & 128) == 0) {
                this.barcode = null;
            } else {
                this.barcode = str5;
            }
            if ((i & 256) == 0) {
                this.extractedData = null;
            } else {
                this.extractedData = str6;
            }
            if ((i & 512) == 0) {
                this.metaData = null;
            } else {
                this.metaData = str7;
            }
            if ((i & 1024) == 0) {
                this.isManualCapture = false;
            } else {
                this.isManualCapture = z;
            }
            if ((i & 2048) == 0) {
                this.retryCount = 0;
            } else {
                this.retryCount = i3;
            }
        }

        public Success(byte[] bArr, java.lang.String str, java.lang.String str2, float f, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.imageBytes = bArr;
            this.documentType = str;
            this.documentSide = str2;
            this.documentDetectionScore = f;
            this.captureTimeSeconds = i;
            this.documentId = str3;
            this.verificationPlatformId = str4;
            this.barcode = str5;
            this.extractedData = str6;
            this.metaData = str7;
            this.isManualCapture = z;
            this.retryCount = i2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$verification_capture_prodRelease(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, self.imageBytes);
            output.encodeStringElement(serialDesc, 1, self.documentType);
            output.encodeStringElement(serialDesc, 2, self.documentSide);
            output.encodeFloatElement(serialDesc, 3, self.documentDetectionScore);
            output.encodeIntElement(serialDesc, 4, self.captureTimeSeconds);
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.documentId != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.documentId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.verificationPlatformId != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.verificationPlatformId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.barcode != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.barcode);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.extractedData != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.extractedData);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 9) || self.metaData != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.metaData);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 10) || self.isManualCapture) {
                output.encodeBooleanElement(serialDesc, 10, self.isManualCapture);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 11) || self.retryCount != 0) {
                output.encodeIntElement(serialDesc, 11, self.retryCount);
            }
        }

        public /* synthetic */ Success(byte[] bArr, java.lang.String str, java.lang.String str2, float f, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, str, str2, f, i, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : str4, (i3 & 128) != 0 ? null : str5, (i3 & 256) != 0 ? null : str6, (i3 & 512) != 0 ? null : str7, (i3 & 1024) != 0 ? false : z, (i3 & 2048) != 0 ? 0 : i2);
        }

        public final byte[] getImageBytes() {
            return this.imageBytes;
        }

        public final java.lang.String getDocumentType() {
            return this.documentType;
        }

        public final java.lang.String getDocumentSide() {
            return this.documentSide;
        }

        public final float getDocumentDetectionScore() {
            return this.documentDetectionScore;
        }

        public final int getCaptureTimeSeconds() {
            return this.captureTimeSeconds;
        }

        public final java.lang.String getDocumentId() {
            return this.documentId;
        }

        public final java.lang.String getVerificationPlatformId() {
            return this.verificationPlatformId;
        }

        public final java.lang.String getBarcode() {
            return this.barcode;
        }

        public final java.lang.String getExtractedData() {
            return this.extractedData;
        }

        public final java.lang.String getMetaData() {
            return this.metaData;
        }

        public final boolean isManualCapture() {
            return this.isManualCapture;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final java.lang.String toString() {
            java.lang.String arrays = java.util.Arrays.toString(this.imageBytes);
            java.lang.String str = this.documentType;
            java.lang.String str2 = this.documentSide;
            float f = this.documentDetectionScore;
            int i = this.captureTimeSeconds;
            java.lang.String str3 = this.documentId;
            java.lang.String str4 = this.verificationPlatformId;
            java.lang.String str5 = this.barcode;
            java.lang.String str6 = this.extractedData;
            java.lang.String str7 = this.metaData;
            boolean z = this.isManualCapture;
            int i2 = this.retryCount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(imageBytes=");
            sb.append(arrays);
            sb.append(", documentType=");
            sb.append(str);
            sb.append(", documentSide=");
            sb.append(str2);
            sb.append(", documentDetectionScore=");
            sb.append(f);
            sb.append(", captureTimeSeconds=");
            sb.append(i);
            sb.append(", documentId=");
            sb.append(str3);
            sb.append(", verificationPlatformId=");
            sb.append(str4);
            sb.append(", barcode=");
            sb.append(str5);
            sb.append(", extractedData=");
            sb.append(str6);
            sb.append(", metaData=");
            sb.append(str7);
            sb.append(", isManualCapture=");
            sb.append(z);
            sb.append(", retryCount=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.util.Arrays.hashCode(this.imageBytes);
            int hashCode2 = this.documentType.hashCode();
            int hashCode3 = this.documentSide.hashCode();
            int hashCode4 = java.lang.Float.hashCode(this.documentDetectionScore);
            int hashCode5 = java.lang.Integer.hashCode(this.captureTimeSeconds);
            java.lang.String str = this.documentId;
            int hashCode6 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.verificationPlatformId;
            int hashCode7 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.barcode;
            int hashCode8 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.extractedData;
            int hashCode9 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.metaData;
            return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isManualCapture)) * 31) + java.lang.Integer.hashCode(this.retryCount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success success = (com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.imageBytes, success.imageBytes) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentType, success.documentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentSide, success.documentSide) && java.lang.Float.compare(this.documentDetectionScore, success.documentDetectionScore) == 0 && this.captureTimeSeconds == success.captureTimeSeconds && kotlin.jvm.internal.Intrinsics.areEqual(this.documentId, success.documentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.verificationPlatformId, success.verificationPlatformId) && kotlin.jvm.internal.Intrinsics.areEqual(this.barcode, success.barcode) && kotlin.jvm.internal.Intrinsics.areEqual(this.extractedData, success.extractedData) && kotlin.jvm.internal.Intrinsics.areEqual(this.metaData, success.metaData) && this.isManualCapture == success.isManualCapture && this.retryCount == success.retryCount;
        }

        public final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success copy(byte[] imageBytes, java.lang.String documentType, java.lang.String documentSide, float documentDetectionScore, int captureTimeSeconds, java.lang.String documentId, java.lang.String verificationPlatformId, java.lang.String barcode, java.lang.String extractedData, java.lang.String metaData, boolean isManualCapture, int retryCount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageBytes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentSide, "");
            return new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success(imageBytes, documentType, documentSide, documentDetectionScore, captureTimeSeconds, documentId, verificationPlatformId, barcode, extractedData, metaData, isManualCapture, retryCount);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getExtractedData() {
            return this.extractedData;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getBarcode() {
            return this.barcode;
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
        public final int getCaptureTimeSeconds() {
            return this.captureTimeSeconds;
        }

        /* renamed from: component4, reason: from getter */
        public final float getDocumentDetectionScore() {
            return this.documentDetectionScore;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDocumentSide() {
            return this.documentSide;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDocumentType() {
            return this.documentType;
        }

        /* renamed from: component12, reason: from getter */
        public final int getRetryCount() {
            return this.retryCount;
        }

        /* renamed from: component11, reason: from getter */
        public final boolean getIsManualCapture() {
            return this.isManualCapture;
        }

        /* renamed from: component10, reason: from getter */
        public final java.lang.String getMetaData() {
            return this.metaData;
        }

        /* renamed from: component1, reason: from getter */
        public final byte[] getImageBytes() {
            return this.imageBytes;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Cancelled;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes15.dex */
    public static final /* data */ class Cancelled implements com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled INSTANCE = new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Cancelled$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled.$r8$lambda$xU7ilyerJIrYf5waREybJf8m7XU();
            }
        });

        public final int hashCode() {
            return -523990402;
        }

        private Cancelled() {
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$xU7ilyerJIrYf5waREybJf8m7XU() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "Cancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Cancelled)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Timeout;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult;", "", "timeoutSeconds", "<init>", "(I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Timeout;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Timeout;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getTimeoutSeconds", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Timeout implements com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout.Companion(null);
        private final int timeoutSeconds;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Timeout$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Timeout;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout> serializer() {
                return com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Timeout$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Timeout(int i) {
            this.timeoutSeconds = i;
        }

        public /* synthetic */ Timeout(int i, int i2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Timeout$$serializer.INSTANCE.getDescriptor());
            }
            this.timeoutSeconds = i2;
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
            return (other instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout) && this.timeoutSeconds == ((com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout) other).timeoutSeconds;
        }

        public final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout copy(int timeoutSeconds) {
            return new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout(timeoutSeconds);
        }

        /* renamed from: component1, reason: from getter */
        public final int getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout copy$default(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Timeout timeout, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = timeout.timeoutSeconds;
            }
            return timeout.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Error;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult;", "", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$verification_capture_prodRelease", "(Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorCode", "getErrorMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Error implements com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error.Companion(null);
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error> serializer() {
                return com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Error$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Error(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult$Error$$serializer.INSTANCE.getDescriptor());
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
        public static final /* synthetic */ void write$Self$verification_capture_prodRelease(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
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
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error error = (com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage);
        }

        public final com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error copy(java.lang.String errorCode, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error(errorCode, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error copy$default(com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Error error, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
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
