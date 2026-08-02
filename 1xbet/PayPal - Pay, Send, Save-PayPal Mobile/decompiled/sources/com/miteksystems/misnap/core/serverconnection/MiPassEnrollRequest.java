package com.miteksystems.misnap.core.serverconnection;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0003\u001dB\u0015\b\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest;", "", "", "a", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$VoiceResult;", "result", "setVoiceResult", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$FaceResult;", "setFaceResult", "", "getNewEnrollmentRequest", "enrollmentId", "getUpdatedEnrollmentRequest", "Ljava/lang/String;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.CUSTOMER_REFERENCE_ID_KEY, "Lkotlinx/serialization/json/Json;", util.h.xy.cb.b.f1091, "Lkotlinx/serialization/json/Json;", "json", "", "Lcom/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile;", "c", "Ljava/util/List;", "voiceFeaturesList", "d", "selfiesImagesList", "<init>", "(Ljava/lang/String;)V", "Companion", "MiPassEnrollRequestModel", "core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MiPassEnrollRequest {
    public static final int REQUIRED_VOICE_RECORDINGS = 3;
    public static final /* synthetic */ java.lang.String SELFIE_IMAGES_KEY = "selfieImages";
    public static final /* synthetic */ java.lang.String VOICE_FEATURES_KEY = "voiceFeatures";
    private final java.lang.String Camera2StreamConfigurationMap;
    private java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.serialization.json.Json getHighSpeedVideoFpsRanges;
    private java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0003-,.BC\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a¢\u0006\u0004\b&\u0010'BW\b\u0017\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u0010\b\u0001\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R(\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR(\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b$\u0010\u0014\u001a\u0004\b#\u0010\u001f¨\u0006/"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getCustomerReferenceId", "()Ljava/lang/String;", "getCustomerReferenceId$annotations", "()V", com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.CUSTOMER_REFERENCE_ID_KEY, util.h.xy.cb.b.f1091, "getEnrollmentId", "getEnrollmentId$annotations", "enrollmentId", "", "Lcom/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile;", "c", "Ljava/util/List;", "getVoiceFeatures", "()Ljava/util/List;", "getVoiceFeatures$annotations", com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.VOICE_FEATURES_KEY, "d", "getSelfieImages", "getSelfieImages$annotations", "selfieImages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "EncodedFile", "core_release"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class MiPassEnrollRequestModel {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String customerReferenceId;

        /* renamed from: b, reason: from kotlin metadata */
        private final java.lang.String enrollmentId;

        /* renamed from: c, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> voiceFeatures;

        /* renamed from: d, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> selfieImages;

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016B'\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "()Ljava/lang/String;", "getData$annotations", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final /* data */ class EncodedFile {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile.Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String data;

            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ EncodedFile(int i, @kotlinx.serialization.SerialName("data") java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile$$serializer.INSTANCE.getDescriptor());
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
            public static final void a(com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
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

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> serializer() {
                    return com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile$$serializer.INSTANCE;
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
                return (other instanceof com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile) other).data);
            }
        }

        public MiPassEnrollRequestModel() {
            this((java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ MiPassEnrollRequestModel(int i, @kotlinx.serialization.SerialName("customerReferenceId") java.lang.String str, @kotlinx.serialization.SerialName("enrollmentId") java.lang.String str2, @kotlinx.serialization.SerialName("voiceFeatures") java.util.List list, @kotlinx.serialization.SerialName("selfieImages") java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.customerReferenceId = null;
            } else {
                this.customerReferenceId = str;
            }
            if ((i & 2) == 0) {
                this.enrollmentId = null;
            } else {
                this.enrollmentId = str2;
            }
            if ((i & 4) == 0) {
                this.voiceFeatures = null;
            } else {
                this.voiceFeatures = list;
            }
            if ((i & 8) == 0) {
                this.selfieImages = null;
            } else {
                this.selfieImages = list2;
            }
        }

        public MiPassEnrollRequestModel(java.lang.String str, java.lang.String str2, java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> list, java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> list2) {
            this.customerReferenceId = str;
            this.enrollmentId = str2;
            this.voiceFeatures = list;
            this.selfieImages = list2;
        }

        public /* synthetic */ MiPassEnrollRequestModel(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MiPassEnrollRequestModel(customerReferenceId=");
            sb.append(this.customerReferenceId);
            sb.append(", enrollmentId=");
            sb.append(this.enrollmentId);
            sb.append(", voiceFeatures=");
            sb.append(this.voiceFeatures);
            sb.append(", selfieImages=");
            sb.append(this.selfieImages);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.customerReferenceId;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.enrollmentId;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> list = this.voiceFeatures;
            int hashCode3 = list == null ? 0 : list.hashCode();
            java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> list2 = this.selfieImages;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel> serializer() {
                return com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest$MiPassEnrollRequestModel$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel)) {
                return false;
            }
            com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel miPassEnrollRequestModel = (com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.customerReferenceId, miPassEnrollRequestModel.customerReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.enrollmentId, miPassEnrollRequestModel.enrollmentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.voiceFeatures, miPassEnrollRequestModel.voiceFeatures) && kotlin.jvm.internal.Intrinsics.areEqual(this.selfieImages, miPassEnrollRequestModel.selfieImages);
        }

        @kotlin.jvm.JvmStatic
        public static final void a(com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.customerReferenceId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.customerReferenceId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.enrollmentId != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.enrollmentId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.voiceFeatures != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile$$serializer.INSTANCE), self.voiceFeatures);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.selfieImages != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile$$serializer.INSTANCE), self.selfieImages);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MiPassEnrollRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MiPassEnrollRequest(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = kotlinx.serialization.json.JsonKt.Json$default(null, com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.b.Camera2StreamConfigurationMap, 1, null);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    }

    public /* synthetic */ MiPassEnrollRequest(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "a", "(Lkotlinx/serialization/json/JsonBuilder;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit> {
        public static final com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.b Camera2StreamConfigurationMap = new com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.b();

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
        if (result.getVoiceSamples().size() < 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected at least (3) voice recording samples per request, found ");
            sb.append(result.getVoiceSamples().size());
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        for (byte[] bArr : result.getVoiceSamples()) {
            java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> list = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.String encodeToString = android.util.Base64.encodeToString(bArr, 2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
            list.add(new com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile(encodeToString));
        }
    }

    public final void setFaceResult(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.FaceResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRangesFor = arrayList;
        java.lang.String encodeToString = android.util.Base64.encodeToString(result.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME java.lang.String(), 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        arrayList.add(new com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile(encodeToString));
    }

    public final java.lang.String getUpdatedEnrollmentRequest(java.lang.String enrollmentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentId, "");
        getHighResolutionOutputSizeshNQ4ISI();
        if (enrollmentId.length() <= 0 || kotlin.text.StringsKt.isBlank(enrollmentId)) {
            throw new java.lang.IllegalArgumentException("EnrollmentId should be a valid Id. If this is a new enrollment, call getNewEnrollmentRequest() instead.".toString());
        }
        kotlinx.serialization.json.Json json = this.getHighSpeedVideoFpsRanges;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> list = this.getHighResolutionOutputSizeshNQ4ISI;
        if (list.isEmpty()) {
            list = null;
        }
        java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> list2 = this.getHighSpeedVideoFpsRangesFor;
        com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel miPassEnrollRequestModel = new com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel(str, enrollmentId, list, list2.isEmpty() ? null : list2);
        json.getSerializersModule();
        return json.encodeToString(com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.INSTANCE.serializer(), miPassEnrollRequestModel);
    }

    public final java.lang.String getNewEnrollmentRequest() {
        getHighResolutionOutputSizeshNQ4ISI();
        kotlinx.serialization.json.Json json = this.getHighSpeedVideoFpsRanges;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> list = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> list2 = list.isEmpty() ? null : list;
        java.util.List<com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile> list3 = this.getHighSpeedVideoFpsRangesFor;
        com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel miPassEnrollRequestModel = new com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel(str, (java.lang.String) null, list2, list3.isEmpty() ? null : list3, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        json.getSerializersModule();
        return json.encodeToString(com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.INSTANCE.serializer(), miPassEnrollRequestModel);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty() && this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Expected either 1 selfie image or 3 voice recording per request, found none.".toString());
        }
        if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.size() < 3) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected 3 voice recording per request found ");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI.size());
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            for (com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile encodedFile : this.getHighResolutionOutputSizeshNQ4ISI) {
                if (kotlin.text.StringsKt.isBlank(encodedFile.getData()) || encodedFile.getData().length() <= 0) {
                    throw new java.lang.IllegalArgumentException("Voice recording data is invalid.".toString());
                }
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            return;
        }
        for (com.miteksystems.misnap.core.serverconnection.MiPassEnrollRequest.MiPassEnrollRequestModel.EncodedFile encodedFile2 : this.getHighSpeedVideoFpsRangesFor) {
            if (kotlin.text.StringsKt.isBlank(encodedFile2.getData()) || encodedFile2.getData().length() <= 0) {
                throw new java.lang.IllegalArgumentException("Selfie image data is invalid.".toString());
            }
        }
    }
}
