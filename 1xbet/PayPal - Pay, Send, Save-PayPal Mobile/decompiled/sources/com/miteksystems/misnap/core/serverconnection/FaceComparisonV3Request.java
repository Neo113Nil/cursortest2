package com.miteksystems.misnap.core.serverconnection;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0002\n!B+\b\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\""}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request;", "", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$DocumentResult;", "result", "", "addDocumentResult", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$FaceResult;", "addFaceResult", "", "getRequest", "a", "Ljava/lang/String;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.TRANSACTION_REQUEST_KEY, util.h.xy.cb.b.f1091, com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.CUSTOMER_REFERENCE_ID_KEY, "", "c", "Z", "enableFaceLiveness", "Lkotlinx/serialization/json/Json;", "d", "Lkotlinx/serialization/json/Json;", "json", "", "Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$Image;", "e", "Ljava/util/List;", "referenceImagesList", "f", "selfiesImagesList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Companion", "FaceComparisonV3RequestModel", "core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class FaceComparisonV3Request {
    public static final int MAXIMUM_ALLOWED_REFERENCE_IMAGES = 2;
    public static final int MAXIMUM_ALLOWED_SELFIES = 3;
    public static final /* synthetic */ java.lang.String REFERENCE_IMAGES_KEY = "referenceImages";
    public static final /* synthetic */ java.lang.String SELFIE_IMAGES_KEY = "selfieImages";
    private final java.util.List<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image> Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final kotlinx.serialization.json.Json getHighSpeedVideoSizes;
    private final java.util.List<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image> getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 32\u00020\u0001:\u00044356BG\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b-\u0010.Bc\b\u0017\u0012\u0006\u0010/\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010(\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\u0010\b\u0001\u0010,\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b-\u00102J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001e\u0010\u001aR&\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0015\u001a\u0004\b%\u0010&R&\u0010,\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010$\u0012\u0004\b+\u0010\u0015\u001a\u0004\b*\u0010&¨\u00067"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration;", "Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration;", "getConfiguration", "()Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration;", "getConfiguration$annotations", "()V", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, util.h.xy.cb.b.f1091, "Ljava/lang/String;", "getTransactionRequestId", "()Ljava/lang/String;", "getTransactionRequestId$annotations", com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.TRANSACTION_REQUEST_KEY, "c", "getCustomerReferenceId", "getCustomerReferenceId$annotations", com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.CUSTOMER_REFERENCE_ID_KEY, "", "Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$Image;", "d", "Ljava/util/List;", "getReferenceImages", "()Ljava/util/List;", "getReferenceImages$annotations", com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.REFERENCE_IMAGES_KEY, "e", "getSelfieImages", "getSelfieImages$annotations", "selfieImages", "<init>", "(Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "FaceConfiguration", com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, "core_release"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class FaceComparisonV3RequestModel {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration configuration;

        /* renamed from: b, reason: from kotlin metadata */
        private final java.lang.String transactionRequestId;

        /* renamed from: c, reason: from kotlin metadata */
        private final java.lang.String customerReferenceId;

        /* renamed from: d, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image> referenceImages;

        /* renamed from: e, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image> selfieImages;

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017B%\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u000e\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0015\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Z", "getLiveness", "()Z", "getLiveness$annotations", "()V", com.daon.sdk.face.license.License.FEATURE_LIVENESS, "<init>", "(Z)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final /* data */ class FaceConfiguration {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration.Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final boolean liveness;

            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ FaceConfiguration(int i, @kotlinx.serialization.SerialName("faceLiveness") boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer.INSTANCE.getDescriptor());
                }
                this.liveness = z;
            }

            public FaceConfiguration(boolean z) {
                this.liveness = z;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FaceConfiguration(liveness=");
                sb.append(this.liveness);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                boolean z = this.liveness;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration> serializer() {
                    return com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration) && this.liveness == ((com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration) other).liveness;
            }

            @kotlin.jvm.JvmStatic
            public static final void a(com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                output.encodeBooleanElement(serialDesc, 0, self.liveness);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u000f\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017B'\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$Image;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "getData$annotations", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final /* data */ class Image {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image.Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String data;

            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ Image(int i, @kotlinx.serialization.SerialName("data") java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$Image$$serializer.INSTANCE.getDescriptor());
                }
                this.data = str;
            }

            public Image(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.data = str;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Image(data=");
                sb.append(this.data);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$Image$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$Image;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image> serializer() {
                    return com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$Image$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image) other).data);
            }

            @kotlin.jvm.JvmStatic
            public static final void a(com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                output.encodeStringElement(serialDesc, 0, self.data);
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ FaceComparisonV3RequestModel(int i, @kotlinx.serialization.SerialName("configuration") com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration faceConfiguration, @kotlinx.serialization.SerialName("transactionRequestId") java.lang.String str, @kotlinx.serialization.SerialName("customerReferenceId") java.lang.String str2, @kotlinx.serialization.SerialName("referenceImages") java.util.List list, @kotlinx.serialization.SerialName("selfieImages") java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (24 != (i & 24)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 24, com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.configuration = null;
            } else {
                this.configuration = faceConfiguration;
            }
            if ((i & 2) == 0) {
                this.transactionRequestId = null;
            } else {
                this.transactionRequestId = str;
            }
            if ((i & 4) == 0) {
                this.customerReferenceId = null;
            } else {
                this.customerReferenceId = str2;
            }
            this.referenceImages = list;
            this.selfieImages = list2;
        }

        public FaceComparisonV3RequestModel(com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration faceConfiguration, java.lang.String str, java.lang.String str2, java.util.List<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image> list, java.util.List<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.configuration = faceConfiguration;
            this.transactionRequestId = str;
            this.customerReferenceId = str2;
            this.referenceImages = list;
            this.selfieImages = list2;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FaceComparisonV3RequestModel(configuration=");
            sb.append(this.configuration);
            sb.append(", transactionRequestId=");
            sb.append(this.transactionRequestId);
            sb.append(", customerReferenceId=");
            sb.append(this.customerReferenceId);
            sb.append(", referenceImages=");
            sb.append(this.referenceImages);
            sb.append(", selfieImages=");
            sb.append(this.selfieImages);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration faceConfiguration = this.configuration;
            int hashCode = faceConfiguration == null ? 0 : faceConfiguration.hashCode();
            java.lang.String str = this.transactionRequestId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.customerReferenceId;
            return (((((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.referenceImages.hashCode()) * 31) + this.selfieImages.hashCode();
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel> serializer() {
                return com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel)) {
                return false;
            }
            com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel faceComparisonV3RequestModel = (com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, faceComparisonV3RequestModel.configuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionRequestId, faceComparisonV3RequestModel.transactionRequestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerReferenceId, faceComparisonV3RequestModel.customerReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceImages, faceComparisonV3RequestModel.referenceImages) && kotlin.jvm.internal.Intrinsics.areEqual(this.selfieImages, faceComparisonV3RequestModel.selfieImages);
        }

        @kotlin.jvm.JvmStatic
        public static final void a(com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.configuration != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer.INSTANCE, self.configuration);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.transactionRequestId != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.transactionRequestId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.customerReferenceId != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.customerReferenceId);
            }
            com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$Image$$serializer faceComparisonV3Request$FaceComparisonV3RequestModel$Image$$serializer = com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request$FaceComparisonV3RequestModel$Image$$serializer.INSTANCE;
            output.encodeSerializableElement(serialDesc, 3, new kotlinx.serialization.internal.ArrayListSerializer(faceComparisonV3Request$FaceComparisonV3RequestModel$Image$$serializer), self.referenceImages);
            output.encodeSerializableElement(serialDesc, 4, new kotlinx.serialization.internal.ArrayListSerializer(faceComparisonV3Request$FaceComparisonV3RequestModel$Image$$serializer), self.selfieImages);
        }
    }

    public FaceComparisonV3Request() {
        this(null, null, false, 7, null);
    }

    public FaceComparisonV3Request(java.lang.String str) {
        this(str, null, false, 6, null);
    }

    public FaceComparisonV3Request(java.lang.String str, java.lang.String str2) {
        this(str, str2, false, 4, null);
    }

    public FaceComparisonV3Request(java.lang.String str, java.lang.String str2, boolean z) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoSizes = kotlinx.serialization.json.JsonKt.Json$default(null, com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.b.Camera2StreamConfigurationMap, 1, null);
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
        this.getOutputMinFrameDuration = new java.util.ArrayList();
    }

    public /* synthetic */ FaceComparisonV3Request(java.lang.String str, java.lang.String str2, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "a", "(Lkotlinx/serialization/json/JsonBuilder;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit> {
        public static final com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.b Camera2StreamConfigurationMap = new com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.b();

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

    public final java.lang.String getRequest() {
        if (this.getOutputMinFrameDuration.isEmpty() || this.Camera2StreamConfigurationMap.isEmpty()) {
            throw new java.lang.IllegalArgumentException((this.getOutputMinFrameDuration.isEmpty() ? "Expected a minimum of 1 selfie image per request, found 0" : "Expected a minimum of 1 document image per request, found 0").toString());
        }
        com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration faceConfiguration = this.getHighSpeedVideoFpsRangesFor ? new com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.FaceConfiguration(this.getHighSpeedVideoFpsRangesFor) : null;
        kotlinx.serialization.json.Json json = this.getHighSpeedVideoSizes;
        com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel faceComparisonV3RequestModel = new com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel(faceConfiguration, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration);
        json.getSerializersModule();
        return json.encodeToString(com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.INSTANCE.serializer(), faceComparisonV3RequestModel);
    }

    public final void addFaceResult(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.FaceResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (this.getOutputMinFrameDuration.size() >= 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a maximum of (3) selfie images per request, found ");
            sb.append(this.getOutputMinFrameDuration.size() + 1);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.util.List<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image> list = this.getOutputMinFrameDuration;
        java.lang.String encodeToString = android.util.Base64.encodeToString(result.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME java.lang.String(), 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        list.add(new com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image(encodeToString));
    }

    public final void addDocumentResult(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.DocumentResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (this.Camera2StreamConfigurationMap.size() >= 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a maximum of (2) document images per request, found ");
            sb.append(this.Camera2StreamConfigurationMap.size() + 1);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.util.List<com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image> list = this.Camera2StreamConfigurationMap;
        java.lang.String encodeToString = android.util.Base64.encodeToString(result.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME java.lang.String(), 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        list.add(new com.miteksystems.misnap.core.serverconnection.FaceComparisonV3Request.FaceComparisonV3RequestModel.Image(encodeToString));
    }
}
