package com.miteksystems.misnap.core.serverconnection;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\b\u001cB!\b\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request;", "", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$DocumentResult;", "result", "", "addDocumentResult", "", "getRequest", "a", "Ljava/lang/String;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.TRANSACTION_REQUEST_KEY, util.h.xy.cb.b.f1091, com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.CUSTOMER_REFERENCE_ID_KEY, "Lkotlinx/serialization/json/Json;", "c", "Lkotlinx/serialization/json/Json;", "json", "", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage;", "d", "Ljava/util/List;", "documentList", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData;", "e", "barcodeDataList", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "MobileVerifyV3RequestModel", "core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MobileVerifyV3Request {
    public static final /* synthetic */ java.lang.String CUSTOMER_REFERENCE_ID_KEY = "customerReferenceId";
    public static final int MAXIMUM_ALLOWED_DOCUMENT_IMAGES = 2;
    public static final /* synthetic */ java.lang.String TRANSACTION_REQUEST_KEY = "transactionRequestId";
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData> getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final kotlinx.serialization.json.Json getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0004./-0B?\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001a¢\u0006\u0004\b'\u0010(BW\b\u0017\u0012\u0006\u0010)\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u0010\b\u0001\u0010&\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001a\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b'\u0010,J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR(\u0010&\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001d\u0012\u0004\b%\u0010\u0014\u001a\u0004\b$\u0010\u001f¨\u00061"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getTransactionRequestId", "()Ljava/lang/String;", "getTransactionRequestId$annotations", "()V", com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.TRANSACTION_REQUEST_KEY, util.h.xy.cb.b.f1091, "getCustomerReferenceId", "getCustomerReferenceId$annotations", com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.CUSTOMER_REFERENCE_ID_KEY, "", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage;", "c", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getImages$annotations", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.IMAGES_KEY, "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData;", "d", "getDeviceExtractedData", "getDeviceExtractedData$annotations", "deviceExtractedData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "BarcodeData", "DocumentImage", "core_release"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class MobileVerifyV3RequestModel {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String transactionRequestId;

        /* renamed from: b, reason: from kotlin metadata */
        private final java.lang.String customerReferenceId;

        /* renamed from: c, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage> images;

        /* renamed from: d, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData> deviceExtractedData;

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u001b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB3\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012¨\u0006\""}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getDataType", "()Ljava/lang/String;", "getDataType$annotations", "()V", "dataType", util.h.xy.cb.b.f1091, "getData", "getData$annotations", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final /* data */ class BarcodeData {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData.Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String dataType;

            /* renamed from: b, reason: from kotlin metadata */
            private final java.lang.String data;

            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ BarcodeData(int i, @kotlinx.serialization.SerialName("dataType") java.lang.String str, @kotlinx.serialization.SerialName("data") java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer.INSTANCE.getDescriptor());
                }
                this.dataType = str;
                this.data = str2;
            }

            public BarcodeData(java.lang.String str, java.lang.String str2) {
                this.dataType = str;
                this.data = str2;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("BarcodeData(dataType=");
                sb.append(this.dataType);
                sb.append(", data=");
                sb.append(this.data);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.dataType;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.data;
                return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData> serializer() {
                    return com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData)) {
                    return false;
                }
                com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData barcodeData = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.dataType, barcodeData.dataType) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, barcodeData.data);
            }

            @kotlin.jvm.JvmStatic
            public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.dataType);
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.data);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u000f\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017B'\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "getData$annotations", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final /* data */ class DocumentImage {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage.Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String data;

            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ DocumentImage(int i, @kotlinx.serialization.SerialName("data") java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage$$serializer.INSTANCE.getDescriptor());
                }
                this.data = str;
            }

            public DocumentImage(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.data = str;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentImage(data=");
                sb.append(this.data);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage> serializer() {
                    return com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage) other).data);
            }

            @kotlin.jvm.JvmStatic
            public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                output.encodeStringElement(serialDesc, 0, self.data);
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ MobileVerifyV3RequestModel(int i, @kotlinx.serialization.SerialName("transactionRequestId") java.lang.String str, @kotlinx.serialization.SerialName("customerReferenceId") java.lang.String str2, @kotlinx.serialization.SerialName("images") java.util.List list, @kotlinx.serialization.SerialName("deviceExtractedData") java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (4 != (i & 4)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 4, com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.transactionRequestId = null;
            } else {
                this.transactionRequestId = str;
            }
            if ((i & 2) == 0) {
                this.customerReferenceId = null;
            } else {
                this.customerReferenceId = str2;
            }
            this.images = list;
            if ((i & 8) == 0) {
                this.deviceExtractedData = null;
            } else {
                this.deviceExtractedData = list2;
            }
        }

        public MobileVerifyV3RequestModel(java.lang.String str, java.lang.String str2, java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage> list, java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData> list2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.transactionRequestId = str;
            this.customerReferenceId = str2;
            this.images = list;
            this.deviceExtractedData = list2;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MobileVerifyV3RequestModel(transactionRequestId=");
            sb.append(this.transactionRequestId);
            sb.append(", customerReferenceId=");
            sb.append(this.customerReferenceId);
            sb.append(", images=");
            sb.append(this.images);
            sb.append(", deviceExtractedData=");
            sb.append(this.deviceExtractedData);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.transactionRequestId;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.customerReferenceId;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            int hashCode3 = this.images.hashCode();
            java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData> list = this.deviceExtractedData;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel> serializer() {
                return com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel)) {
                return false;
            }
            com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel mobileVerifyV3RequestModel = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionRequestId, mobileVerifyV3RequestModel.transactionRequestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerReferenceId, mobileVerifyV3RequestModel.customerReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.images, mobileVerifyV3RequestModel.images) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceExtractedData, mobileVerifyV3RequestModel.deviceExtractedData);
        }

        @kotlin.jvm.JvmStatic
        public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.transactionRequestId != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.transactionRequestId);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.customerReferenceId != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.customerReferenceId);
            }
            output.encodeSerializableElement(serialDesc, 2, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage$$serializer.INSTANCE), self.images);
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.deviceExtractedData != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer.INSTANCE), self.deviceExtractedData);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileVerifyV3Request() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileVerifyV3Request(java.lang.String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public MobileVerifyV3Request(java.lang.String str, java.lang.String str2) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.getHighSpeedVideoSizes = kotlinx.serialization.json.JsonKt.Json$default(null, com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.b.getHighSpeedVideoSizes, 1, null);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    }

    public /* synthetic */ MobileVerifyV3Request(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "a", "(Lkotlinx/serialization/json/JsonBuilder;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit> {
        public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.b getHighSpeedVideoSizes = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.b();

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
        if (this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Expected a minimum of 1 document data per request, found 0".toString());
        }
        kotlinx.serialization.json.Json json = this.getHighSpeedVideoSizes;
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
        java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage> list = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData> list2 = this.getHighSpeedVideoFpsRanges;
        if (list2.isEmpty()) {
            list2 = null;
        }
        com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel mobileVerifyV3RequestModel = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel(str, str2, list, list2);
        json.getSerializersModule();
        return json.encodeToString(com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.INSTANCE.serializer(), mobileVerifyV3RequestModel);
    }

    public final void addDocumentResult(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.DocumentResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        if (this.getHighResolutionOutputSizeshNQ4ISI.size() >= 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a maximum of (2) document images per request, found ");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI.size() + 1);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage> list = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String encodeToString = android.util.Base64.encodeToString(result.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME java.lang.String(), 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        list.add(new com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.DocumentImage(encodeToString));
        com.miteksystems.misnap.core.Barcode barcode = result.getBarcode();
        if (barcode != null) {
            this.getHighSpeedVideoFpsRanges.add(new com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.MobileVerifyV3RequestModel.BarcodeData("PDF417_STRING", barcode.getEncodedBarcode()));
        }
    }
}
