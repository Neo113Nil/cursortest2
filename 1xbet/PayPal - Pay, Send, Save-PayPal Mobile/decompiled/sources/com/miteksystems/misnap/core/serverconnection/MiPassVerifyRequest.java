package com.miteksystems.misnap.core.serverconnection;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0002\n\u001cB\u001d\b\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001d"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest;", "", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$VoiceResult;", "result", "", "setVoiceResult", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$FaceResult;", "setFaceResult", "", "getRequest", "a", "Ljava/lang/String;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.CUSTOMER_REFERENCE_ID_KEY, util.h.xy.cb.b.f1091, "enrollmentId", "Lkotlinx/serialization/json/Json;", "c", "Lkotlinx/serialization/json/Json;", "json", "Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;", "d", "Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;", com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.VOICE_FEATURE_KEY, "e", com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.SELFIE_IMAGE_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "MiPassVerifyRequestModel", "core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MiPassVerifyRequest {
    public static final int REQUIRED_VOICE_RECORDINGS = 1;
    public static final /* synthetic */ java.lang.String SELFIE_IMAGE_KEY = "selfieImage";
    public static final /* synthetic */ java.lang.String VOICE_FEATURE_KEY = "voiceFeature";
    private com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0003,+-B3\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b%\u0010&BK\b\u0017\u0012\u0006\u0010'\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\"\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001c\u0012\u0004\b#\u0010\u0014\u001a\u0004\b\"\u0010\u001e¨\u0006."}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getCustomerReferenceId", "()Ljava/lang/String;", "getCustomerReferenceId$annotations", "()V", com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.CUSTOMER_REFERENCE_ID_KEY, util.h.xy.cb.b.f1091, "getEnrollmentId", "getEnrollmentId$annotations", "enrollmentId", "Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;", "c", "Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;", "getVoiceFeature", "()Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;", "getVoiceFeature$annotations", com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.VOICE_FEATURE_KEY, "d", "getSelfieImage", "getSelfieImage$annotations", com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.SELFIE_IMAGE_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "EncodedFile", "core_release"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class MiPassVerifyRequestModel {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String customerReferenceId;

        /* renamed from: b, reason: from kotlin metadata */
        private final java.lang.String enrollmentId;

        /* renamed from: c, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile voiceFeature;

        /* renamed from: d, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile selfieImage;

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016B'\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "()Ljava/lang/String;", "getData$annotations", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final /* data */ class EncodedFile {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile.Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String data;

            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ EncodedFile(int i, @kotlinx.serialization.SerialName("data") java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile$$serializer.INSTANCE.getDescriptor());
                }
                this.data = str;
            }

            /* renamed from: a, reason: from getter */
            public final java.lang.String getData() {
                return this.data;
            }

            public EncodedFile(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.data = str;
            }

            @kotlin.jvm.JvmStatic
            public static final void a(com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                output.encodeStringElement(serialDesc, 0, self.data);
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("EncodedFile(data=");
                sb.append(this.data);
                sb.append(')');
                return sb.toString();
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile> serializer() {
                    return com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile) other).data);
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ MiPassVerifyRequestModel(int i, @kotlinx.serialization.SerialName("customerReferenceId") java.lang.String str, @kotlinx.serialization.SerialName("enrollmentId") java.lang.String str2, @kotlinx.serialization.SerialName("voiceFeature") com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile encodedFile, @kotlinx.serialization.SerialName("selfieImage") com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile encodedFile2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (2 != (i & 2)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 2, com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest$MiPassVerifyRequestModel$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.customerReferenceId = null;
            } else {
                this.customerReferenceId = str;
            }
            this.enrollmentId = str2;
            if ((i & 4) == 0) {
                this.voiceFeature = null;
            } else {
                this.voiceFeature = encodedFile;
            }
            if ((i & 8) == 0) {
                this.selfieImage = null;
            } else {
                this.selfieImage = encodedFile2;
            }
        }

        public MiPassVerifyRequestModel(java.lang.String str, java.lang.String str2, com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile encodedFile, com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile encodedFile2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.customerReferenceId = str;
            this.enrollmentId = str2;
            this.voiceFeature = encodedFile;
            this.selfieImage = encodedFile2;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MiPassVerifyRequestModel(customerReferenceId=");
            sb.append(this.customerReferenceId);
            sb.append(", enrollmentId=");
            sb.append(this.enrollmentId);
            sb.append(", voiceFeature=");
            sb.append(this.voiceFeature);
            sb.append(", selfieImage=");
            sb.append(this.selfieImage);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.customerReferenceId;
            int hashCode = str == null ? 0 : str.hashCode();
            int hashCode2 = this.enrollmentId.hashCode();
            com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile encodedFile = this.voiceFeature;
            int hashCode3 = encodedFile == null ? 0 : encodedFile.hashCode();
            com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile encodedFile2 = this.selfieImage;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (encodedFile2 != null ? encodedFile2.hashCode() : 0);
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel> serializer() {
                return com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest$MiPassVerifyRequestModel$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel)) {
                return false;
            }
            com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel miPassVerifyRequestModel = (com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.customerReferenceId, miPassVerifyRequestModel.customerReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollmentId, miPassVerifyRequestModel.enrollmentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.voiceFeature, miPassVerifyRequestModel.voiceFeature) && kotlin.jvm.internal.Intrinsics.areEqual(this.selfieImage, miPassVerifyRequestModel.selfieImage);
        }

        @kotlin.jvm.JvmStatic
        public static final void a(com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.customerReferenceId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.customerReferenceId);
            }
            output.encodeStringElement(serialDesc, 1, self.enrollmentId);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.voiceFeature != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile$$serializer.INSTANCE, self.voiceFeature);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.selfieImage != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile$$serializer.INSTANCE, self.selfieImage);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MiPassVerifyRequest(java.lang.String str) {
        this(null, str, 1, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    public MiPassVerifyRequest(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoFpsRanges = kotlinx.serialization.json.JsonKt.Json$default(null, com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.b.getHighSpeedVideoFpsRangesFor, 1, null);
    }

    public /* synthetic */ MiPassVerifyRequest(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "a", "(Lkotlinx/serialization/json/JsonBuilder;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit> {
        public static final com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.b getHighSpeedVideoFpsRangesFor = new com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.b();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
            kotlinx.serialization.json.JsonBuilder jsonBuilder2 = jsonBuilder;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonBuilder2, "");
            jsonBuilder2.setIgnoreUnknownKeys(true);
            return kotlin.Unit.INSTANCE;
        }

        b() {
            super(1);
        }
    }

    public final void setVoiceResult(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.VoiceResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (result.getVoiceSamples().size() != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a maximum of (1) voice recording sample per request, found ");
            sb.append(result.getVoiceSamples().size());
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.lang.String encodeToString = android.util.Base64.encodeToString(result.getVoiceSamples().get(0), 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        this.Camera2StreamConfigurationMap = new com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile(encodeToString);
    }

    public final void setFaceResult(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.FaceResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        java.lang.String encodeToString = android.util.Base64.encodeToString(result.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME java.lang.String(), 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        this.getHighSpeedVideoSizes = new com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile(encodeToString);
    }

    public final java.lang.String getRequest() {
        if (this.getHighSpeedVideoFpsRangesFor.length() <= 0 || kotlin.text.StringsKt.isBlank(this.getHighSpeedVideoFpsRangesFor)) {
            throw new java.lang.IllegalArgumentException("The given Enrollment ID does not exist or is invalid.".toString());
        }
        com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile encodedFile = this.Camera2StreamConfigurationMap;
        if (encodedFile == null && this.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalArgumentException("Expected either 1 voice recording or 1 selfie image per request, found none.".toString());
        }
        if (encodedFile != null && (kotlin.text.StringsKt.isBlank(encodedFile.getData()) || encodedFile.getData().length() <= 0)) {
            throw new java.lang.IllegalArgumentException("Voice recording data is invalid.".toString());
        }
        com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.EncodedFile encodedFile2 = this.getHighSpeedVideoSizes;
        if (encodedFile2 != null && (kotlin.text.StringsKt.isBlank(encodedFile2.getData()) || encodedFile2.getData().length() <= 0)) {
            throw new java.lang.IllegalArgumentException("Selfie image data is invalid.".toString());
        }
        kotlinx.serialization.json.Json json = this.getHighSpeedVideoFpsRanges;
        com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel miPassVerifyRequestModel = new com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
        json.getSerializersModule();
        return json.encodeToString(com.miteksystems.misnap.core.serverconnection.MiPassVerifyRequest.MiPassVerifyRequestModel.INSTANCE.serializer(), miPassVerifyRequestModel);
    }
}
