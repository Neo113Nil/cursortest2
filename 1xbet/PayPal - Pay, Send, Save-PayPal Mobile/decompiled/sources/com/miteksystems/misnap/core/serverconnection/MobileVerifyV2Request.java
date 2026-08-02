package com.miteksystems.misnap.core.serverconnection;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 '2\u00020\u0001:\u0003\r()B\u001f\b\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request;", "", "", "getRequest", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$DocumentResult;", "result", "referenceId", "", "addDocumentResult", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$FaceResult;", "setFaceResult", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult;", "setNfcResult", "a", "Ljava/lang/String;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV3Request.CUSTOMER_REFERENCE_ID_KEY, "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$Configuration;", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Lkotlinx/serialization/json/Json;", "c", "Lkotlinx/serialization/json/Json;", "json", "", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image;", "d", "Ljava/util/List;", "documentImages", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "e", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "nfc", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Face;", "f", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Face;", "face", "<init>", "(Ljava/lang/String;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$Configuration;)V", "Companion", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "MobileVerifyV2RequestModel", "core_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MobileVerifyV2Request {
    public static final /* synthetic */ java.lang.String CONFIG_KEY = "configuration";
    public static final java.lang.String ENCODED_DATA_KEY = "encodedData";
    public static final java.lang.String ENCRYPTED_PAYLOAD_KEY = "encryptedPayload";
    public static final /* synthetic */ java.lang.String EVIDENCE_KEY = "evidence";
    public static final java.lang.String IMAGES_KEY = "images";
    public static final int MAXIMUM_ALLOWED_DOCUMENT_IMAGES = 2;
    public static final /* synthetic */ java.lang.String METADATA_KEY = "dossierMetadata";
    private final kotlinx.serialization.json.Json Camera2StreamConfigurationMap;
    private com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc getHighResolutionOutputSizeshNQ4ISI;
    private final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.Configuration getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image> getHighSpeedVideoSizes;
    private com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Face getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJV\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0003\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\u0004\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b\u0007\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b\b\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b\t\u0010\r"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$Configuration;", "", "", "enableFaceLiveness", "enableFaceComparison", "enableInjectionAttackDetection", "enableInjectionAttackDetectionAi", "shouldIncludeCroppedPortrait", "shouldIncludeCroppedDocument", "shouldIncludeCroppedSignature", "<init>", "(ZZZZZZZ)V", "hasRequestedResponseImages$core_release", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZZZZZZZ)Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$Configuration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", util.h.xy.cb.b.f1091, "c", "d", "e", "f", "g"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes10.dex */
    public static final /* data */ class Configuration {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean enableFaceLiveness;

        /* renamed from: b, reason: from kotlin metadata */
        private final boolean enableFaceComparison;

        /* renamed from: c, reason: from kotlin metadata */
        private final boolean enableInjectionAttackDetection;

        /* renamed from: d, reason: from kotlin metadata */
        private final boolean enableInjectionAttackDetectionAi;

        /* renamed from: e, reason: from kotlin metadata */
        private final boolean shouldIncludeCroppedPortrait;

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean shouldIncludeCroppedDocument;

        /* renamed from: g, reason: from kotlin metadata */
        private final boolean shouldIncludeCroppedSignature;

        public Configuration() {
            this(false, false, false, false, false, false, false, 127, null);
        }

        public Configuration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.enableFaceLiveness = z;
            this.enableFaceComparison = z2;
            this.enableInjectionAttackDetection = z3;
            this.enableInjectionAttackDetectionAi = z4;
            this.shouldIncludeCroppedPortrait = z5;
            this.shouldIncludeCroppedDocument = z6;
            this.shouldIncludeCroppedSignature = z7;
        }

        public /* synthetic */ Configuration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) == 0 ? z2 : true, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(enableFaceLiveness=");
            sb.append(this.enableFaceLiveness);
            sb.append(", enableFaceComparison=");
            sb.append(this.enableFaceComparison);
            sb.append(", enableInjectionAttackDetection=");
            sb.append(this.enableInjectionAttackDetection);
            sb.append(", enableInjectionAttackDetectionAi=");
            sb.append(this.enableInjectionAttackDetectionAi);
            sb.append(", shouldIncludeCroppedPortrait=");
            sb.append(this.shouldIncludeCroppedPortrait);
            sb.append(", shouldIncludeCroppedDocument=");
            sb.append(this.shouldIncludeCroppedDocument);
            sb.append(", shouldIncludeCroppedSignature=");
            sb.append(this.shouldIncludeCroppedSignature);
            sb.append(')');
            return sb.toString();
        }

        public final boolean shouldIncludeCroppedSignature() {
            return this.shouldIncludeCroppedSignature;
        }

        public final boolean shouldIncludeCroppedPortrait() {
            return this.shouldIncludeCroppedPortrait;
        }

        public final boolean shouldIncludeCroppedDocument() {
            return this.shouldIncludeCroppedDocument;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
        public final int hashCode() {
            boolean z = this.enableFaceLiveness;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            ?? r2 = this.enableFaceComparison;
            int i = r2;
            if (r2 != 0) {
                i = 1;
            }
            ?? r3 = this.enableInjectionAttackDetection;
            int i2 = r3;
            if (r3 != 0) {
                i2 = 1;
            }
            ?? r4 = this.enableInjectionAttackDetectionAi;
            int i3 = r4;
            if (r4 != 0) {
                i3 = 1;
            }
            ?? r5 = this.shouldIncludeCroppedPortrait;
            int i4 = r5;
            if (r5 != 0) {
                i4 = 1;
            }
            ?? r6 = this.shouldIncludeCroppedDocument;
            int i5 = r6;
            if (r6 != 0) {
                i5 = 1;
            }
            boolean z2 = this.shouldIncludeCroppedSignature;
            return (((((((((((r0 * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + (z2 ? 1 : z2 ? 1 : 0);
        }

        public final /* synthetic */ boolean hasRequestedResponseImages$core_release() {
            return this.shouldIncludeCroppedDocument || this.shouldIncludeCroppedPortrait || this.shouldIncludeCroppedSignature;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.Configuration)) {
                return false;
            }
            com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.Configuration configuration = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.Configuration) other;
            return this.enableFaceLiveness == configuration.enableFaceLiveness && this.enableFaceComparison == configuration.enableFaceComparison && this.enableInjectionAttackDetection == configuration.enableInjectionAttackDetection && this.enableInjectionAttackDetectionAi == configuration.enableInjectionAttackDetectionAi && this.shouldIncludeCroppedPortrait == configuration.shouldIncludeCroppedPortrait && this.shouldIncludeCroppedDocument == configuration.shouldIncludeCroppedDocument && this.shouldIncludeCroppedSignature == configuration.shouldIncludeCroppedSignature;
        }

        public final boolean enableInjectionAttackDetectionAi() {
            return this.enableInjectionAttackDetectionAi;
        }

        public final boolean enableInjectionAttackDetection() {
            return this.enableInjectionAttackDetection;
        }

        public final boolean enableFaceLiveness() {
            return this.enableFaceLiveness;
        }

        public final boolean enableFaceComparison() {
            return this.enableFaceComparison;
        }

        public final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.Configuration copy(boolean enableFaceLiveness, boolean enableFaceComparison, boolean enableInjectionAttackDetection, boolean enableInjectionAttackDetectionAi, boolean shouldIncludeCroppedPortrait, boolean shouldIncludeCroppedDocument, boolean shouldIncludeCroppedSignature) {
            return new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.Configuration(enableFaceLiveness, enableFaceComparison, enableInjectionAttackDetection, enableInjectionAttackDetectionAi, shouldIncludeCroppedPortrait, shouldIncludeCroppedDocument, shouldIncludeCroppedSignature);
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShouldIncludeCroppedSignature() {
            return this.shouldIncludeCroppedSignature;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShouldIncludeCroppedDocument() {
            return this.shouldIncludeCroppedDocument;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getShouldIncludeCroppedPortrait() {
            return this.shouldIncludeCroppedPortrait;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getEnableInjectionAttackDetectionAi() {
            return this.enableInjectionAttackDetectionAi;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getEnableInjectionAttackDetection() {
            return this.enableInjectionAttackDetection;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getEnableFaceComparison() {
            return this.enableFaceComparison;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getEnableFaceLiveness() {
            return this.enableFaceLiveness;
        }

        public static /* synthetic */ com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.Configuration copy$default(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.Configuration configuration, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = configuration.enableFaceLiveness;
            }
            if ((i & 2) != 0) {
                z2 = configuration.enableFaceComparison;
            }
            boolean z8 = z2;
            if ((i & 4) != 0) {
                z3 = configuration.enableInjectionAttackDetection;
            }
            boolean z9 = z3;
            if ((i & 8) != 0) {
                z4 = configuration.enableInjectionAttackDetectionAi;
            }
            boolean z10 = z4;
            if ((i & 16) != 0) {
                z5 = configuration.shouldIncludeCroppedPortrait;
            }
            boolean z11 = z5;
            if ((i & 32) != 0) {
                z6 = configuration.shouldIncludeCroppedDocument;
            }
            boolean z12 = z6;
            if ((i & 64) != 0) {
                z7 = configuration.shouldIncludeCroppedSignature;
            }
            return configuration.copy(z, z8, z9, z10, z11, z12, z7);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\b-,./0\b12B/\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b&\u0010'BE\b\u0017\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010\u0015\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData;", "getMetaData", "()Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData;", "getMetaData$annotations", "()V", "metaData", "", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Evidence;", util.h.xy.cb.b.f1091, "Ljava/util/List;", "getEvidence", "()Ljava/util/List;", "getEvidence$annotations", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.EVIDENCE_KEY, "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration;", "c", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration;", "getConfiguration", "()Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration;", "getConfiguration$annotations", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData;Ljava/util/List;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData;Ljava/util/List;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "Document", "Evidence", "Face", "MetaData", "core_release"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class MobileVerifyV2RequestModel {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.MetaData metaData;

        /* renamed from: b, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence> evidence;

        /* renamed from: c, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration configuration;

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0003%$&B%\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017¢\u0006\u0004\b\u001e\u0010\u001fB9\b\u0017\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0001\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications;", "getVerifications", "()Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications;", "getVerifications$annotations", "()V", "verifications", "", util.h.xy.cb.b.f1091, "Ljava/util/List;", "getResponse", "()Ljava/util/List;", "getResponse$annotations", "response", "<init>", "(Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Verifications", "core_release"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final /* data */ class Configuration {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications verifications;

            /* renamed from: b, reason: from kotlin metadata */
            private final java.util.List<java.lang.String> response;

            @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B7\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\"\u0010#BK\b\u0017\u0012\u0006\u0010$\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b\"\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\"\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0012R\"\u0010!\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u0012\u0004\b \u0010\u0014\u001a\u0004\b\u001f\u0010\u0012¨\u0006*"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Boolean;", "getFaceComparison", "()Ljava/lang/Boolean;", "getFaceComparison$annotations", "()V", "faceComparison", util.h.xy.cb.b.f1091, "getFaceLiveness", "getFaceLiveness$annotations", "faceLiveness", "c", "getInjectionAttackDetection", "getInjectionAttackDetection$annotations", "injectionAttackDetection", "d", "getInjectionAttackDetectionAi", "getInjectionAttackDetectionAi$annotations", "injectionAttackDetectionAi", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
            @kotlinx.serialization.Serializable
            public static final /* data */ class Verifications {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications.Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final java.lang.Boolean faceComparison;

                /* renamed from: b, reason: from kotlin metadata */
                private final java.lang.Boolean faceLiveness;

                /* renamed from: c, reason: from kotlin metadata */
                private final java.lang.Boolean injectionAttackDetection;

                /* renamed from: d, reason: from kotlin metadata */
                private final java.lang.Boolean injectionAttackDetectionAi;

                public Verifications() {
                    this((java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Boolean) null, 15, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                }

                @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
                public /* synthetic */ Verifications(int i, @kotlinx.serialization.SerialName("faceComparison") java.lang.Boolean bool, @kotlinx.serialization.SerialName("faceLiveness") java.lang.Boolean bool2, @kotlinx.serialization.SerialName("injectionAttackDetection") java.lang.Boolean bool3, @kotlinx.serialization.SerialName("injectionAttackDetectionAI") java.lang.Boolean bool4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.faceComparison = null;
                    } else {
                        this.faceComparison = bool;
                    }
                    if ((i & 2) == 0) {
                        this.faceLiveness = null;
                    } else {
                        this.faceLiveness = bool2;
                    }
                    if ((i & 4) == 0) {
                        this.injectionAttackDetection = null;
                    } else {
                        this.injectionAttackDetection = bool3;
                    }
                    if ((i & 8) == 0) {
                        this.injectionAttackDetectionAi = null;
                    } else {
                        this.injectionAttackDetectionAi = bool4;
                    }
                }

                public Verifications(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4) {
                    this.faceComparison = bool;
                    this.faceLiveness = bool2;
                    this.injectionAttackDetection = bool3;
                    this.injectionAttackDetectionAi = bool4;
                }

                public /* synthetic */ Verifications(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4);
                }

                public final java.lang.String toString() {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Verifications(faceComparison=");
                    sb.append(this.faceComparison);
                    sb.append(", faceLiveness=");
                    sb.append(this.faceLiveness);
                    sb.append(", injectionAttackDetection=");
                    sb.append(this.injectionAttackDetection);
                    sb.append(", injectionAttackDetectionAi=");
                    sb.append(this.injectionAttackDetectionAi);
                    sb.append(')');
                    return sb.toString();
                }

                public final int hashCode() {
                    java.lang.Boolean bool = this.faceComparison;
                    int hashCode = bool == null ? 0 : bool.hashCode();
                    java.lang.Boolean bool2 = this.faceLiveness;
                    int hashCode2 = bool2 == null ? 0 : bool2.hashCode();
                    java.lang.Boolean bool3 = this.injectionAttackDetection;
                    int hashCode3 = bool3 == null ? 0 : bool3.hashCode();
                    java.lang.Boolean bool4 = this.injectionAttackDetectionAi;
                    return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool4 != null ? bool4.hashCode() : 0);
                }

                @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications> serializer() {
                        return com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications)) {
                        return false;
                    }
                    com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications verifications = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications) other;
                    return kotlin.jvm.internal.Intrinsics.areEqual(this.faceComparison, verifications.faceComparison) && kotlin.jvm.internal.Intrinsics.areEqual(this.faceLiveness, verifications.faceLiveness) && kotlin.jvm.internal.Intrinsics.areEqual(this.injectionAttackDetection, verifications.injectionAttackDetection) && kotlin.jvm.internal.Intrinsics.areEqual(this.injectionAttackDetectionAi, verifications.injectionAttackDetectionAi);
                }

                @kotlin.jvm.JvmStatic
                public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                    if (output.shouldEncodeElementDefault(serialDesc, 0) || self.faceComparison != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.faceComparison);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 1) || self.faceLiveness != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.faceLiveness);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 2) || self.injectionAttackDetection != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.injectionAttackDetection);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 3) || self.injectionAttackDetectionAi != null) {
                        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.injectionAttackDetectionAi);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Configuration() {
                this((com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications) null, (java.util.List) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ Configuration(int i, @kotlinx.serialization.SerialName("verifications") com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications verifications, @kotlinx.serialization.SerialName("responseImages") java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.verifications = null;
                } else {
                    this.verifications = verifications;
                }
                if ((i & 2) == 0) {
                    this.response = null;
                } else {
                    this.response = list;
                }
            }

            public Configuration(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications verifications, java.util.List<java.lang.String> list) {
                this.verifications = verifications;
                this.response = list;
            }

            public /* synthetic */ Configuration(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications verifications, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : verifications, (i & 2) != 0 ? null : list);
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Configuration(verifications=");
                sb.append(this.verifications);
                sb.append(", response=");
                sb.append(this.response);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications verifications = this.verifications;
                int hashCode = verifications == null ? 0 : verifications.hashCode();
                java.util.List<java.lang.String> list = this.response;
                return (hashCode * 31) + (list != null ? list.hashCode() : 0);
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration> serializer() {
                    return com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration)) {
                    return false;
                }
                com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration configuration = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.verifications, configuration.verifications) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, configuration.response);
            }

            @kotlin.jvm.JvmStatic
            public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                if (output.shouldEncodeElementDefault(serialDesc, 0) || self.verifications != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$$serializer.INSTANCE, self.verifications);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.response != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), self.response);
                }
            }
        }

        @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0004+*,-B)\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b$\u0010%BC\b\u0017\u0012\u0006\u0010&\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b$\u0010)J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0013\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\b\u0010\u0012R&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u001b\u001a\u0004\b \u0010!¨\u0006."}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Evidence;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "()Ljava/lang/String;", "type", "", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image;", util.h.xy.cb.b.f1091, "Ljava/util/List;", "getImages", "()Ljava/util/List;", "getImages$annotations", "()V", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.IMAGES_KEY, "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "c", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "getNfc", "()Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "getNfc$annotations", "nfc", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, "Nfc", "core_release"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final /* data */ class Document extends com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String type;

            /* renamed from: b, reason: from kotlin metadata */
            private final java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image> images;

            /* renamed from: c, reason: from kotlin metadata */
            private final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc nfc;

            @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0003,+-B3\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b%\u0010&BK\b\u0017\u0012\u0006\u0010'\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\"\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0012R\"\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0014\u001a\u0004\b!\u0010\"¨\u0006."}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getData", "()Ljava/lang/String;", "getData$annotations", "()V", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, util.h.xy.cb.b.f1091, "getEncryptedPayload", "getEncryptedPayload$annotations", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.ENCRYPTED_PAYLOAD_KEY, "c", "getCustReferenceId", "getCustReferenceId$annotations", "custReferenceId", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData;", "d", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData;", "getEncodedData", "()Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData;", "getEncodedData$annotations", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.ENCODED_DATA_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "EncodedData", "core_release"}, k = 1, mv = {1, 8, 0})
            @kotlinx.serialization.Serializable
            public static final /* data */ class Image {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final java.lang.String data;

                /* renamed from: b, reason: from kotlin metadata */
                private final java.lang.String encryptedPayload;

                /* renamed from: c, reason: from kotlin metadata */
                private final java.lang.String custReferenceId;

                /* renamed from: d, reason: from kotlin metadata */
                private final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData encodedData;

                @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002! B\u001f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bB3\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001a\u0010\u001fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012¨\u0006\""}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getEncodedPDF", "()Ljava/lang/String;", "getEncodedPDF$annotations", "()V", "encodedPDF", util.h.xy.cb.b.f1091, "getEncodedQR", "getEncodedQR$annotations", "encodedQR", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
                @kotlinx.serialization.Serializable
                public static final /* data */ class EncodedData {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData.Companion(null);

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final java.lang.String encodedPDF;

                    /* renamed from: b, reason: from kotlin metadata */
                    private final java.lang.String encodedQR;

                    /* JADX WARN: Multi-variable type inference failed */
                    public EncodedData() {
                        this((java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
                    }

                    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
                    public /* synthetic */ EncodedData(int i, @kotlinx.serialization.SerialName("PDF417") java.lang.String str, @kotlinx.serialization.SerialName("QRCODE") java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.encodedPDF = null;
                        } else {
                            this.encodedPDF = str;
                        }
                        if ((i & 2) == 0) {
                            this.encodedQR = null;
                        } else {
                            this.encodedQR = str2;
                        }
                    }

                    public EncodedData(java.lang.String str, java.lang.String str2) {
                        this.encodedPDF = str;
                        this.encodedQR = str2;
                    }

                    public /* synthetic */ EncodedData(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                    }

                    public final java.lang.String toString() {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("EncodedData(encodedPDF=");
                        sb.append(this.encodedPDF);
                        sb.append(", encodedQR=");
                        sb.append(this.encodedQR);
                        sb.append(')');
                        return sb.toString();
                    }

                    public final int hashCode() {
                        java.lang.String str = this.encodedPDF;
                        int hashCode = str == null ? 0 : str.hashCode();
                        java.lang.String str2 = this.encodedQR;
                        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
                    }

                    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData> serializer() {
                            return com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    public final boolean equals(java.lang.Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData)) {
                            return false;
                        }
                        com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData encodedData = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData) other;
                        return kotlin.jvm.internal.Intrinsics.areEqual(this.encodedPDF, encodedData.encodedPDF) && kotlin.jvm.internal.Intrinsics.areEqual(this.encodedQR, encodedData.encodedQR);
                    }

                    @kotlin.jvm.JvmStatic
                    public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.encodedPDF != null) {
                            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.encodedPDF);
                        }
                        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.encodedQR != null) {
                            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.encodedQR);
                        }
                    }
                }

                @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
                public /* synthetic */ Image(int i, @kotlinx.serialization.SerialName("data") java.lang.String str, @kotlinx.serialization.SerialName("encryptedPayload") java.lang.String str2, @kotlinx.serialization.SerialName("customerReferenceId") java.lang.String str3, @kotlinx.serialization.SerialName("encodedData") com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData encodedData, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                    if (1 != (i & 1)) {
                        kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer.INSTANCE.getDescriptor());
                    }
                    this.data = str;
                    if ((i & 2) == 0) {
                        this.encryptedPayload = null;
                    } else {
                        this.encryptedPayload = str2;
                    }
                    if ((i & 4) == 0) {
                        this.custReferenceId = null;
                    } else {
                        this.custReferenceId = str3;
                    }
                    if ((i & 8) == 0) {
                        this.encodedData = null;
                    } else {
                        this.encodedData = encodedData;
                    }
                }

                public Image(java.lang.String str, java.lang.String str2, java.lang.String str3, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData encodedData) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    this.data = str;
                    this.encryptedPayload = str2;
                    this.custReferenceId = str3;
                    this.encodedData = encodedData;
                }

                public final java.lang.String toString() {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Image(data=");
                    sb.append(this.data);
                    sb.append(", encryptedPayload=");
                    sb.append(this.encryptedPayload);
                    sb.append(", custReferenceId=");
                    sb.append(this.custReferenceId);
                    sb.append(", encodedData=");
                    sb.append(this.encodedData);
                    sb.append(')');
                    return sb.toString();
                }

                public final int hashCode() {
                    int hashCode = this.data.hashCode();
                    java.lang.String str = this.encryptedPayload;
                    int hashCode2 = str == null ? 0 : str.hashCode();
                    java.lang.String str2 = this.custReferenceId;
                    int hashCode3 = str2 == null ? 0 : str2.hashCode();
                    com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData encodedData = this.encodedData;
                    return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (encodedData != null ? encodedData.hashCode() : 0);
                }

                @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image> serializer() {
                        return com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image)) {
                        return false;
                    }
                    com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image image = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image) other;
                    return kotlin.jvm.internal.Intrinsics.areEqual(this.data, image.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedPayload, image.encryptedPayload) && kotlin.jvm.internal.Intrinsics.areEqual(this.custReferenceId, image.custReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.encodedData, image.encodedData);
                }

                @kotlin.jvm.JvmStatic
                public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                    output.encodeStringElement(serialDesc, 0, self.data);
                    if (output.shouldEncodeElementDefault(serialDesc, 1) || self.encryptedPayload != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.encryptedPayload);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 2) || self.custReferenceId != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.custReferenceId);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 3) || self.encodedData != null) {
                        output.encodeNullableSerializableElement(serialDesc, 3, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData$$serializer.INSTANCE, self.encodedData);
                    }
                }
            }

            @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0003?@>Bs\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001e\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b8\u00109B\u0087\u0001\b\u0017\u0012\u0006\u0010:\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0001\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001e\u0012\n\b\u0001\u0010+\u001a\u0004\u0018\u00010%\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\t\u0012\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b8\u0010=J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\"\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0012R.\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u0014\u001a\u0004\b!\u0010\"R\"\u0010+\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0014\u001a\u0004\b(\u0010)R\"\u0010/\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010\u0010\u0012\u0004\b.\u0010\u0014\u001a\u0004\b-\u0010\u0012R\"\u00103\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\u0010\u0012\u0004\b2\u0010\u0014\u001a\u0004\b1\u0010\u0012R\"\u00107\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010\u0010\u0012\u0004\b6\u0010\u0014\u001a\u0004\b5\u0010\u0012¨\u0006A"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSod", "()Ljava/lang/String;", "getSod$annotations", "()V", "sod", util.h.xy.cb.b.f1091, "getCom", "getCom$annotations", "com", "c", "getDataFormat", "getDataFormat$annotations", "dataFormat", "", "d", "Ljava/util/Map;", "getDataGroups", "()Ljava/util/Map;", "getDataGroups$annotations", "dataGroups", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput;", "e", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput;", "getActiveAuthInput", "()Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput;", "getActiveAuthInput$annotations", "activeAuthInput", "f", "getChipAuthOutput", "getChipAuthOutput$annotations", "chipAuthOutput", "g", "getPortrait", "getPortrait$annotations", "portrait", "h", "getMibiString", "getMibiString$annotations", "mibiString", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "ActiveAuthInput", "core_release"}, k = 1, mv = {1, 8, 0})
            @kotlinx.serialization.Serializable
            public static final /* data */ class Nfc {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.Companion(null);

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final java.lang.String sod;

                /* renamed from: b, reason: from kotlin metadata */
                private final java.lang.String com;

                /* renamed from: c, reason: from kotlin metadata */
                private final java.lang.String dataFormat;

                /* renamed from: d, reason: from kotlin metadata */
                private final java.util.Map<java.lang.String, java.lang.String> dataGroups;

                /* renamed from: e, reason: from kotlin metadata */
                private final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput activeAuthInput;

                /* renamed from: f, reason: from kotlin metadata */
                private final java.lang.String chipAuthOutput;

                /* renamed from: g, reason: from kotlin metadata */
                private final java.lang.String portrait;

                /* renamed from: h, reason: from kotlin metadata */
                private final java.lang.String mibiString;

                @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B+\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001e\u0010\u001fB?\b\u0017\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001e\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\"\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0012¨\u0006&"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getPublicKey", "()Ljava/lang/String;", "getPublicKey$annotations", "()V", "publicKey", util.h.xy.cb.b.f1091, "getSignature", "getSignature$annotations", "signature", "c", "getChallenge", "getChallenge$annotations", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
                @kotlinx.serialization.Serializable
                public static final /* data */ class ActiveAuthInput {

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput.Companion(null);

                    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                    private final java.lang.String publicKey;

                    /* renamed from: b, reason: from kotlin metadata */
                    private final java.lang.String signature;

                    /* renamed from: c, reason: from kotlin metadata */
                    private final java.lang.String challenge;

                    public ActiveAuthInput() {
                        this((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    }

                    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
                    public /* synthetic */ ActiveAuthInput(int i, @kotlinx.serialization.SerialName("ecdsaPublicKey") java.lang.String str, @kotlinx.serialization.SerialName("signature") java.lang.String str2, @kotlinx.serialization.SerialName("challenge") java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                        if ((i & 1) == 0) {
                            this.publicKey = null;
                        } else {
                            this.publicKey = str;
                        }
                        if ((i & 2) == 0) {
                            this.signature = null;
                        } else {
                            this.signature = str2;
                        }
                        if ((i & 4) == 0) {
                            this.challenge = null;
                        } else {
                            this.challenge = str3;
                        }
                    }

                    public ActiveAuthInput(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                        this.publicKey = str;
                        this.signature = str2;
                        this.challenge = str3;
                    }

                    public /* synthetic */ ActiveAuthInput(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
                    }

                    public final java.lang.String toString() {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActiveAuthInput(publicKey=");
                        sb.append(this.publicKey);
                        sb.append(", signature=");
                        sb.append(this.signature);
                        sb.append(", challenge=");
                        sb.append(this.challenge);
                        sb.append(')');
                        return sb.toString();
                    }

                    public final int hashCode() {
                        java.lang.String str = this.publicKey;
                        int hashCode = str == null ? 0 : str.hashCode();
                        java.lang.String str2 = this.signature;
                        int hashCode2 = str2 == null ? 0 : str2.hashCode();
                        java.lang.String str3 = this.challenge;
                        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
                    }

                    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput> serializer() {
                            return com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    public final boolean equals(java.lang.Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput)) {
                            return false;
                        }
                        com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput activeAuthInput = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput) other;
                        return kotlin.jvm.internal.Intrinsics.areEqual(this.publicKey, activeAuthInput.publicKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.signature, activeAuthInput.signature) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, activeAuthInput.challenge);
                    }

                    @kotlin.jvm.JvmStatic
                    public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.publicKey != null) {
                            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.publicKey);
                        }
                        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.signature != null) {
                            output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.signature);
                        }
                        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.challenge != null) {
                            output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.challenge);
                        }
                    }
                }

                public Nfc() {
                    this((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 255, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                }

                @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
                public /* synthetic */ Nfc(int i, @kotlinx.serialization.SerialName("sod") java.lang.String str, @kotlinx.serialization.SerialName("com") java.lang.String str2, @kotlinx.serialization.SerialName("dataFormat") java.lang.String str3, @kotlinx.serialization.SerialName("dataGroups") java.util.Map map, @kotlinx.serialization.SerialName("activeAuthInput") com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput activeAuthInput, @kotlinx.serialization.SerialName("chipAuthOutput") java.lang.String str4, @kotlinx.serialization.SerialName("portrait") java.lang.String str5, @kotlinx.serialization.SerialName("mibi") java.lang.String str6, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                    if ((i & 1) == 0) {
                        this.sod = null;
                    } else {
                        this.sod = str;
                    }
                    if ((i & 2) == 0) {
                        this.com = null;
                    } else {
                        this.com = str2;
                    }
                    if ((i & 4) == 0) {
                        this.dataFormat = null;
                    } else {
                        this.dataFormat = str3;
                    }
                    if ((i & 8) == 0) {
                        this.dataGroups = kotlin.collections.MapsKt.emptyMap();
                    } else {
                        this.dataGroups = map;
                    }
                    if ((i & 16) == 0) {
                        this.activeAuthInput = null;
                    } else {
                        this.activeAuthInput = activeAuthInput;
                    }
                    if ((i & 32) == 0) {
                        this.chipAuthOutput = null;
                    } else {
                        this.chipAuthOutput = str4;
                    }
                    if ((i & 64) == 0) {
                        this.portrait = null;
                    } else {
                        this.portrait = str5;
                    }
                    if ((i & 128) == 0) {
                        this.mibiString = null;
                    } else {
                        this.mibiString = str6;
                    }
                }

                public Nfc(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput activeAuthInput, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
                    this.sod = str;
                    this.com = str2;
                    this.dataFormat = str3;
                    this.dataGroups = map;
                    this.activeAuthInput = activeAuthInput;
                    this.chipAuthOutput = str4;
                    this.portrait = str5;
                    this.mibiString = str6;
                }

                public /* synthetic */ Nfc(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput activeAuthInput, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i & 16) != 0 ? null : activeAuthInput, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? str6 : null);
                }

                public final java.lang.String toString() {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Nfc(sod=");
                    sb.append(this.sod);
                    sb.append(", com=");
                    sb.append(this.com);
                    sb.append(", dataFormat=");
                    sb.append(this.dataFormat);
                    sb.append(", dataGroups=");
                    sb.append(this.dataGroups);
                    sb.append(", activeAuthInput=");
                    sb.append(this.activeAuthInput);
                    sb.append(", chipAuthOutput=");
                    sb.append(this.chipAuthOutput);
                    sb.append(", portrait=");
                    sb.append(this.portrait);
                    sb.append(", mibiString=");
                    sb.append(this.mibiString);
                    sb.append(')');
                    return sb.toString();
                }

                public final int hashCode() {
                    java.lang.String str = this.sod;
                    int hashCode = str == null ? 0 : str.hashCode();
                    java.lang.String str2 = this.com;
                    int hashCode2 = str2 == null ? 0 : str2.hashCode();
                    java.lang.String str3 = this.dataFormat;
                    int hashCode3 = str3 == null ? 0 : str3.hashCode();
                    java.util.Map<java.lang.String, java.lang.String> map = this.dataGroups;
                    int hashCode4 = map == null ? 0 : map.hashCode();
                    com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput activeAuthInput = this.activeAuthInput;
                    int hashCode5 = activeAuthInput == null ? 0 : activeAuthInput.hashCode();
                    java.lang.String str4 = this.chipAuthOutput;
                    int hashCode6 = str4 == null ? 0 : str4.hashCode();
                    java.lang.String str5 = this.portrait;
                    int hashCode7 = str5 == null ? 0 : str5.hashCode();
                    java.lang.String str6 = this.mibiString;
                    return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str6 != null ? str6.hashCode() : 0);
                }

                @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc> serializer() {
                        return com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer.INSTANCE;
                    }

                    private Companion() {
                    }
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc)) {
                        return false;
                    }
                    com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc nfc = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc) other;
                    return kotlin.jvm.internal.Intrinsics.areEqual(this.sod, nfc.sod) && kotlin.jvm.internal.Intrinsics.areEqual(this.com, nfc.com) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataFormat, nfc.dataFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataGroups, nfc.dataGroups) && kotlin.jvm.internal.Intrinsics.areEqual(this.activeAuthInput, nfc.activeAuthInput) && kotlin.jvm.internal.Intrinsics.areEqual(this.chipAuthOutput, nfc.chipAuthOutput) && kotlin.jvm.internal.Intrinsics.areEqual(this.portrait, nfc.portrait) && kotlin.jvm.internal.Intrinsics.areEqual(this.mibiString, nfc.mibiString);
                }

                @kotlin.jvm.JvmStatic
                public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                    if (output.shouldEncodeElementDefault(serialDesc, 0) || self.sod != null) {
                        output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.sod);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 1) || self.com != null) {
                        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.com);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 2) || self.dataFormat != null) {
                        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.dataFormat);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 3) || !kotlin.jvm.internal.Intrinsics.areEqual(self.dataGroups, kotlin.collections.MapsKt.emptyMap())) {
                        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
                        output.encodeNullableSerializableElement(serialDesc, 3, new kotlinx.serialization.internal.LinkedHashMapSerializer(stringSerializer, stringSerializer), self.dataGroups);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 4) || self.activeAuthInput != null) {
                        output.encodeNullableSerializableElement(serialDesc, 4, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput$$serializer.INSTANCE, self.activeAuthInput);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 5) || self.chipAuthOutput != null) {
                        output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.chipAuthOutput);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 6) || self.portrait != null) {
                        output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.portrait);
                    }
                    if (output.shouldEncodeElementDefault(serialDesc, 7) || self.mibiString != null) {
                        output.encodeNullableSerializableElement(serialDesc, 7, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.mibiString);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ Document(int i, java.lang.String str, @kotlinx.serialization.SerialName("images") java.util.List list, @kotlinx.serialization.SerialName("nfc") com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc nfc, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                super(null);
                if (3 != (i & 3)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$$serializer.INSTANCE.getDescriptor());
                }
                this.type = str;
                this.images = list;
                if ((i & 4) == 0) {
                    this.nfc = null;
                } else {
                    this.nfc = nfc;
                }
            }

            /* renamed from: a, reason: from getter */
            public final java.lang.String getType() {
                return this.type;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Document(java.lang.String str, java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image> list, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc nfc) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.type = str;
                this.images = list;
                this.nfc = nfc;
            }

            @kotlin.jvm.JvmStatic
            public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                output.encodeStringElement(serialDesc, 0, self.getType());
                output.encodeSerializableElement(serialDesc, 1, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer.INSTANCE), self.images);
                if (output.shouldEncodeElementDefault(serialDesc, 2) || self.nfc != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer.INSTANCE, self.nfc);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Document(type=");
                sb.append(getType());
                sb.append(", images=");
                sb.append(this.images);
                sb.append(", nfc=");
                sb.append(this.nfc);
                sb.append(')');
                return sb.toString();
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document> serializer() {
                    return com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public final int hashCode() {
                int hashCode = getType().hashCode();
                int hashCode2 = this.images.hashCode();
                com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc nfc = this.nfc;
                return (((hashCode * 31) + hashCode2) * 31) + (nfc == null ? 0 : nfc.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document)) {
                    return false;
                }
                com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document document = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(getType(), document.getType()) && kotlin.jvm.internal.Intrinsics.areEqual(this.images, document.images) && kotlin.jvm.internal.Intrinsics.areEqual(this.nfc, document.nfc);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B/\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t¢\u0006\u0004\b!\u0010\"BI\b\u0017\u0012\u0006\u0010#\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b!\u0010&J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0013\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\b\u0010\u0012R \u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0012R\"\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0012R\"\u0010 \u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0011\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001e\u0010\u0012¨\u0006)"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Face;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Evidence;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "()Ljava/lang/String;", "type", util.h.xy.cb.b.f1091, "getBiometricType", "getBiometricType$annotations", "()V", "biometricType", "c", "getData", "getData$annotations", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "d", "getEncryptedPayload", "getEncryptedPayload$annotations", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.ENCRYPTED_PAYLOAD_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final /* data */ class Face extends com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Face.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Face.Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String type;

            /* renamed from: b, reason: from kotlin metadata */
            private final java.lang.String biometricType;

            /* renamed from: c, reason: from kotlin metadata */
            private final java.lang.String data;

            /* renamed from: d, reason: from kotlin metadata */
            private final java.lang.String encryptedPayload;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ Face(int i, java.lang.String str, @kotlinx.serialization.SerialName("biometricType") java.lang.String str2, @kotlinx.serialization.SerialName("data") java.lang.String str3, @kotlinx.serialization.SerialName("encryptedPayload") java.lang.String str4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                super(null);
                if (3 != (i & 3)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Face$$serializer.INSTANCE.getDescriptor());
                }
                this.type = str;
                this.biometricType = str2;
                if ((i & 4) == 0) {
                    this.data = null;
                } else {
                    this.data = str3;
                }
                if ((i & 8) == 0) {
                    this.encryptedPayload = null;
                } else {
                    this.encryptedPayload = str4;
                }
            }

            /* renamed from: a, reason: from getter */
            public final java.lang.String getType() {
                return this.type;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Face(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.type = str;
                this.biometricType = str2;
                this.data = str3;
                this.encryptedPayload = str4;
            }

            @kotlin.jvm.JvmStatic
            public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Face self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                output.encodeStringElement(serialDesc, 0, self.getType());
                output.encodeStringElement(serialDesc, 1, self.biometricType);
                if (output.shouldEncodeElementDefault(serialDesc, 2) || self.data != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.data);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 3) || self.encryptedPayload != null) {
                    output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.encryptedPayload);
                }
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Face(type=");
                sb.append(getType());
                sb.append(", biometricType=");
                sb.append(this.biometricType);
                sb.append(", data=");
                sb.append(this.data);
                sb.append(", encryptedPayload=");
                sb.append(this.encryptedPayload);
                sb.append(')');
                return sb.toString();
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Face$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Face;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Face> serializer() {
                    return com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Face$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public final int hashCode() {
                int hashCode = getType().hashCode();
                int hashCode2 = this.biometricType.hashCode();
                java.lang.String str = this.data;
                int hashCode3 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.encryptedPayload;
                return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Face)) {
                    return false;
                }
                com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Face face = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Face) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(getType(), face.getType()) && kotlin.jvm.internal.Intrinsics.areEqual(this.biometricType, face.biometricType) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, face.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedPayload, face.encryptedPayload);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u000f\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017B'\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getRefId", "()Ljava/lang/String;", "getRefId$annotations", "()V", "refId", "<init>", "(Ljava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final /* data */ class MetaData {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.MetaData.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.MetaData.Companion(null);

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String refId;

            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ MetaData(int i, @kotlinx.serialization.SerialName("customerReferenceId") java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData$$serializer.INSTANCE.getDescriptor());
                }
                this.refId = str;
            }

            public MetaData(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.refId = str;
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MetaData(refId=");
                sb.append(this.refId);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return this.refId.hashCode();
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.MetaData> serializer() {
                    return com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.MetaData) && kotlin.jvm.internal.Intrinsics.areEqual(this.refId, ((com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.MetaData) other).refId);
            }

            @kotlin.jvm.JvmStatic
            public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.MetaData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                output.encodeStringElement(serialDesc, 0, self.refId);
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ MobileVerifyV2RequestModel(int i, @kotlinx.serialization.SerialName("dossierMetadata") com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.MetaData metaData, @kotlinx.serialization.SerialName("evidence") java.util.List list, @kotlinx.serialization.SerialName("configuration") com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration configuration, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (2 != (i & 2)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 2, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$$serializer.INSTANCE.getDescriptor());
            }
            if ((i & 1) == 0) {
                this.metaData = null;
            } else {
                this.metaData = metaData;
            }
            this.evidence = list;
            if ((i & 4) == 0) {
                this.configuration = null;
            } else {
                this.configuration = configuration;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MobileVerifyV2RequestModel(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.MetaData metaData, java.util.List<? extends com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence> list, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration configuration) {
            this.metaData = metaData;
            this.evidence = list;
            this.configuration = configuration;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MobileVerifyV2RequestModel(metaData=");
            sb.append(this.metaData);
            sb.append(", evidence=");
            sb.append(this.evidence);
            sb.append(", configuration=");
            sb.append(this.configuration);
            sb.append(')');
            return sb.toString();
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Evidence;", "", "<init>", "()V", "Companion", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Face;"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable(with = com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.a.class)
        public static abstract class Evidence {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence.Companion INSTANCE = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence.Companion(null);

            public /* synthetic */ Evidence(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Evidence$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Evidence;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* loaded from: classes10.dex */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence> serializer() {
                    return com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.a.f4129a;
                }

                private Companion() {
                }
            }

            private Evidence() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$a;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Evidence;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lkotlinx/serialization/KSerializer;", "a", "<init>", "()V", "core_release"}, k = 1, mv = {1, 8, 0})
        public static final class a extends kotlinx.serialization.json.JsonContentPolymorphicSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence> {

            /* renamed from: a, reason: collision with root package name */
            public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.a f4129a = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.a();

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlinx.serialization.KSerializer<? extends com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence> selectDeserializer(kotlinx.serialization.json.JsonElement element) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
                return kotlinx.serialization.json.JsonElementKt.getJsonObject(element).containsKey((java.lang.Object) "IdDocument") ? com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.INSTANCE.serializer() : kotlinx.serialization.json.JsonElementKt.getJsonObject(element).containsKey((java.lang.Object) "Biometric") ? com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Face.INSTANCE.serializer() : com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence.INSTANCE.serializer();
            }

            private a() {
                super(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence.class));
            }
        }

        public final int hashCode() {
            com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.MetaData metaData = this.metaData;
            int hashCode = metaData == null ? 0 : metaData.hashCode();
            java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Evidence> list = this.evidence;
            int hashCode2 = list == null ? 0 : list.hashCode();
            com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration configuration = this.configuration;
            return (((hashCode * 31) + hashCode2) * 31) + (configuration != null ? configuration.hashCode() : 0);
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel> serializer() {
                return com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel)) {
                return false;
            }
            com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel mobileVerifyV2RequestModel = (com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.metaData, mobileVerifyV2RequestModel.metaData) && kotlin.jvm.internal.Intrinsics.areEqual(this.evidence, mobileVerifyV2RequestModel.evidence) && kotlin.jvm.internal.Intrinsics.areEqual(this.configuration, mobileVerifyV2RequestModel.configuration);
        }

        @kotlin.jvm.JvmStatic
        public static final void a(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.metaData != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData$$serializer.INSTANCE, self.metaData);
            }
            output.encodeNullableSerializableElement(serialDesc, 1, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.a.f4129a), self.evidence);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.configuration != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$$serializer.INSTANCE, self.configuration);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileVerifyV2Request() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final void addDocumentResult(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.DocumentResult documentResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentResult, "");
        addDocumentResult$default(this, documentResult, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileVerifyV2Request(java.lang.String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final void addDocumentResult(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.DocumentResult result, java.lang.String referenceId) {
        com.miteksystems.misnap.core.Barcode.Type type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        int i = 1;
        int i2 = 2;
        if (this.getHighSpeedVideoSizes.size() >= 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a maximum of (2) document images per request, found ");
            sb.append(this.getHighSpeedVideoSizes.size() + 1);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.util.List<com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image> list = this.getHighSpeedVideoSizes;
        java.lang.String encodeToString = android.util.Base64.encodeToString(result.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME java.lang.String(), 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData encodedData = 0;
        encodedData = 0;
        java.lang.String rts = this.getHighSpeedVideoFpsRanges.enableInjectionAttackDetection() ? result.getRts() : null;
        com.miteksystems.misnap.core.Barcode barcode = result.getBarcode();
        if (barcode != null && (type = barcode.getType()) != null) {
            encodedData = type == com.miteksystems.misnap.core.Barcode.Type.QR ? new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData((java.lang.String) encodedData, barcode.getEncodedBarcode(), i, (kotlin.jvm.internal.DefaultConstructorMarker) encodedData) : new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image.EncodedData(barcode.getEncodedBarcode(), (java.lang.String) encodedData, i2, (kotlin.jvm.internal.DefaultConstructorMarker) encodedData);
        }
        list.add(new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Image(encodeToString, rts, referenceId, encodedData));
    }

    public MobileVerifyV2Request(java.lang.String str, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = configuration;
        this.Camera2StreamConfigurationMap = kotlinx.serialization.json.JsonKt.Json$default(null, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.b.Camera2StreamConfigurationMap, 1, null);
        this.getHighSpeedVideoSizes = new java.util.ArrayList();
    }

    public /* synthetic */ MobileVerifyV2Request(java.lang.String str, com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.Configuration configuration, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.Configuration(false, false, false, false, false, false, false, 127, null) : configuration);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/serialization/json/JsonBuilder;", "", "a", "(Lkotlinx/serialization/json/JsonBuilder;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit> {
        public static final com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.b Camera2StreamConfigurationMap = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.b();

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

    public final void setNfcResult(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult result) {
        com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc nfc;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        java.lang.String str = null;
        if (result instanceof com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.Icao) {
            com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.Icao icao = (com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.Icao) result;
            java.lang.String sod = icao.getAuthenticationData().getSod();
            java.lang.String com2 = icao.getAuthenticationData().getCom();
            java.lang.String dataFormat = icao.getAuthenticationData().getDataFormat();
            java.util.Map<java.lang.String, java.lang.String> dataGroups = icao.getAuthenticationData().getDataGroups();
            com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo activeAuthInfo = icao.getAuthenticationData().getActiveAuthInfo();
            com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput activeAuthInput = activeAuthInfo != null ? new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput(activeAuthInfo.getKey(), activeAuthInfo.getSignature(), activeAuthInfo.getChallenge()) : null;
            java.lang.String chipAuthInfo = icao.getAuthenticationData().getChipAuthInfo();
            java.lang.String encodeToString = android.util.Base64.encodeToString(icao.getPhoto(), 2);
            if (icao.getPhoto().length == 0) {
                byte[] bytes = icao.getMibiString().getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                str = android.util.Base64.encodeToString(bytes, 2);
            }
            nfc = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc(sod, com2, dataFormat, dataGroups, activeAuthInput, chipAuthInfo, encodeToString, str);
        } else {
            if (!(result instanceof com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.EuDl)) {
                return;
            }
            com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.EuDl euDl = (com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.EuDl) result;
            java.lang.String sod2 = euDl.getAuthenticationData().getSod();
            java.lang.String com3 = euDl.getAuthenticationData().getCom();
            java.lang.String dataFormat2 = euDl.getAuthenticationData().getDataFormat();
            java.util.Map<java.lang.String, java.lang.String> dataGroups2 = euDl.getAuthenticationData().getDataGroups();
            com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo activeAuthInfo2 = euDl.getAuthenticationData().getActiveAuthInfo();
            com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput activeAuthInput2 = activeAuthInfo2 != null ? new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc.ActiveAuthInput(activeAuthInfo2.getKey(), activeAuthInfo2.getSignature(), activeAuthInfo2.getChallenge()) : null;
            java.lang.String chipAuthInfo2 = euDl.getAuthenticationData().getChipAuthInfo();
            java.lang.String encodeToString2 = android.util.Base64.encodeToString(euDl.getPhoto(), 2);
            if (euDl.getPhoto().length == 0) {
                byte[] bytes2 = euDl.getMibiString().getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
                str = android.util.Base64.encodeToString(bytes2, 2);
            }
            nfc = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document.Nfc(sod2, com3, dataFormat2, dataGroups2, activeAuthInput2, chipAuthInfo2, encodeToString2, str);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = nfc;
    }

    public final void setFaceResult(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.FaceResult result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        this.getOutputMinFrameDuration = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Face("Biometric", "Selfie", (!this.getHighSpeedVideoFpsRanges.enableInjectionAttackDetectionAi() || result.getAiBasedRts() == null) ? android.util.Base64.encodeToString(result.getAndroidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME java.lang.String(), 2) : android.util.Base64.encodeToString(result.getAiBasedRts(), 2), this.getHighSpeedVideoFpsRanges.enableInjectionAttackDetection() ? result.getRts() : null);
    }

    public final java.lang.String getRequest() {
        java.util.ArrayList arrayList;
        if (this.getHighSpeedVideoSizes.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Expected a minimum of 1 document data per request, found 0".toString());
        }
        com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications verifications = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration.Verifications(java.lang.Boolean.valueOf(this.getOutputMinFrameDuration != null ? this.getHighSpeedVideoFpsRanges.enableFaceComparison() : false), java.lang.Boolean.valueOf(this.getOutputMinFrameDuration != null ? this.getHighSpeedVideoFpsRanges.enableFaceLiveness() : false), java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges.enableInjectionAttackDetection()), java.lang.Boolean.valueOf(this.getHighSpeedVideoFpsRanges.enableInjectionAttackDetectionAi()));
        if (this.getHighSpeedVideoFpsRanges.hasRequestedResponseImages$core_release()) {
            arrayList = new java.util.ArrayList();
            if (this.getHighSpeedVideoFpsRanges.shouldIncludeCroppedDocument()) {
                arrayList.add("CroppedDocument");
            }
            if (this.getHighSpeedVideoFpsRanges.shouldIncludeCroppedPortrait()) {
                arrayList.add("CroppedPortrait");
            }
            if (this.getHighSpeedVideoFpsRanges.shouldIncludeCroppedSignature()) {
                arrayList.add("CroppedSignature");
            }
        } else {
            arrayList = null;
        }
        com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration configuration = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Configuration(verifications, arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Document("IdDocument", this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI));
        com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.Face face = this.getOutputMinFrameDuration;
        if (face != null) {
            arrayList2.add(face);
        }
        kotlinx.serialization.json.Json json = this.Camera2StreamConfigurationMap;
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel mobileVerifyV2RequestModel = new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel(str != null ? new com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.MetaData(str) : null, arrayList2, configuration);
        json.getSerializersModule();
        return json.encodeToString(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.MobileVerifyV2RequestModel.INSTANCE.serializer(), mobileVerifyV2RequestModel);
    }

    public static /* synthetic */ void addDocumentResult$default(com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request mobileVerifyV2Request, com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.DocumentResult documentResult, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        mobileVerifyV2Request.addDocumentResult(documentResult, str);
    }
}
