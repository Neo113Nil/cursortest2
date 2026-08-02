package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0018J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0018J\u0096\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010\"R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010$R\u001a\u0010\u0012\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bB\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\bC\u0010\u0018R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00103\u001a\u0004\bD\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/MetaData;", "", "", "md5", "checksum", "side", "collectionType", "verifier", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;", "sdkInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DevInfo;", "devInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/BarcodeInfo;", "barcodeInfo", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/ExtractedInfo;", "extractedInfos", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDataPayload;", "captureData", "associationType", "associatedRefId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DevInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/BarcodeInfo;Ljava/util/List;Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDataPayload;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;", "component7", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/DevInfo;", "component8", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/BarcodeInfo;", "component9", "()Ljava/util/List;", "component10", "()Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDataPayload;", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DevInfo;Lcom/paypal/oslo/feature/verificationcapture/domain/model/BarcodeInfo;Ljava/util/List;Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDataPayload;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/MetaData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMd5", "getChecksum", "getSide", "getCollectionType", "getVerifier", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/SdkInfo;", "getSdkInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DevInfo;", "getDevInfo", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/BarcodeInfo;", "getBarcodeInfo", "Ljava/util/List;", "getExtractedInfos", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureDataPayload;", "getCaptureData", "getAssociationType", "getAssociatedRefId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MetaData {
    public static final int $stable = 8;
    private final java.lang.String associatedRefId;
    private final java.lang.String associationType;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.BarcodeInfo barcodeInfo;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload captureData;
    private final java.lang.String checksum;
    private final java.lang.String collectionType;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo devInfo;
    private final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.ExtractedInfo> extractedInfos;
    private final java.lang.String md5;
    private final com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo;
    private final java.lang.String side;
    private final java.lang.String verifier;

    public MetaData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo, com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo devInfo, com.paypal.oslo.feature.verificationcapture.domain.model.BarcodeInfo barcodeInfo, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.ExtractedInfo> list, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload captureDataPayload, java.lang.String str6, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(devInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureDataPayload, "");
        this.md5 = str;
        this.checksum = str2;
        this.side = str3;
        this.collectionType = str4;
        this.verifier = str5;
        this.sdkInfo = sdkInfo;
        this.devInfo = devInfo;
        this.barcodeInfo = barcodeInfo;
        this.extractedInfos = list;
        this.captureData = captureDataPayload;
        this.associationType = str6;
        this.associatedRefId = str7;
    }

    public /* synthetic */ MetaData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo, com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo devInfo, com.paypal.oslo.feature.verificationcapture.domain.model.BarcodeInfo barcodeInfo, java.util.List list, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload captureDataPayload, java.lang.String str6, java.lang.String str7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, sdkInfo, devInfo, (i & 128) != 0 ? null : barcodeInfo, (i & 256) != 0 ? null : list, captureDataPayload, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7);
    }

    public final java.lang.String getMd5() {
        return this.md5;
    }

    public final java.lang.String getChecksum() {
        return this.checksum;
    }

    public final java.lang.String getSide() {
        return this.side;
    }

    public final java.lang.String getCollectionType() {
        return this.collectionType;
    }

    public final java.lang.String getVerifier() {
        return this.verifier;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo getSdkInfo() {
        return this.sdkInfo;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo getDevInfo() {
        return this.devInfo;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.BarcodeInfo getBarcodeInfo() {
        return this.barcodeInfo;
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.ExtractedInfo> getExtractedInfos() {
        return this.extractedInfos;
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload getCaptureData() {
        return this.captureData;
    }

    public final java.lang.String getAssociationType() {
        return this.associationType;
    }

    public final java.lang.String getAssociatedRefId() {
        return this.associatedRefId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.md5;
        java.lang.String str2 = this.checksum;
        java.lang.String str3 = this.side;
        java.lang.String str4 = this.collectionType;
        java.lang.String str5 = this.verifier;
        com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo = this.sdkInfo;
        com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo devInfo = this.devInfo;
        com.paypal.oslo.feature.verificationcapture.domain.model.BarcodeInfo barcodeInfo = this.barcodeInfo;
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.ExtractedInfo> list = this.extractedInfos;
        com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload captureDataPayload = this.captureData;
        java.lang.String str6 = this.associationType;
        java.lang.String str7 = this.associatedRefId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MetaData(md5=");
        sb.append(str);
        sb.append(", checksum=");
        sb.append(str2);
        sb.append(", side=");
        sb.append(str3);
        sb.append(", collectionType=");
        sb.append(str4);
        sb.append(", verifier=");
        sb.append(str5);
        sb.append(", sdkInfo=");
        sb.append(sdkInfo);
        sb.append(", devInfo=");
        sb.append(devInfo);
        sb.append(", barcodeInfo=");
        sb.append(barcodeInfo);
        sb.append(", extractedInfos=");
        sb.append(list);
        sb.append(", captureData=");
        sb.append(captureDataPayload);
        sb.append(", associationType=");
        sb.append(str6);
        sb.append(", associatedRefId=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.md5.hashCode();
        int hashCode2 = this.checksum.hashCode();
        int hashCode3 = this.side.hashCode();
        int hashCode4 = this.collectionType.hashCode();
        int hashCode5 = this.verifier.hashCode();
        int hashCode6 = this.sdkInfo.hashCode();
        int hashCode7 = this.devInfo.hashCode();
        com.paypal.oslo.feature.verificationcapture.domain.model.BarcodeInfo barcodeInfo = this.barcodeInfo;
        int hashCode8 = barcodeInfo == null ? 0 : barcodeInfo.hashCode();
        java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.ExtractedInfo> list = this.extractedInfos;
        int hashCode9 = list == null ? 0 : list.hashCode();
        int hashCode10 = this.captureData.hashCode();
        java.lang.String str = this.associationType;
        int hashCode11 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.associatedRefId;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.MetaData)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.MetaData metaData = (com.paypal.oslo.feature.verificationcapture.domain.model.MetaData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.md5, metaData.md5) && kotlin.jvm.internal.Intrinsics.areEqual(this.checksum, metaData.checksum) && kotlin.jvm.internal.Intrinsics.areEqual(this.side, metaData.side) && kotlin.jvm.internal.Intrinsics.areEqual(this.collectionType, metaData.collectionType) && kotlin.jvm.internal.Intrinsics.areEqual(this.verifier, metaData.verifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkInfo, metaData.sdkInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.devInfo, metaData.devInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.barcodeInfo, metaData.barcodeInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.extractedInfos, metaData.extractedInfos) && kotlin.jvm.internal.Intrinsics.areEqual(this.captureData, metaData.captureData) && kotlin.jvm.internal.Intrinsics.areEqual(this.associationType, metaData.associationType) && kotlin.jvm.internal.Intrinsics.areEqual(this.associatedRefId, metaData.associatedRefId);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.MetaData copy(java.lang.String md5, java.lang.String checksum, java.lang.String side, java.lang.String collectionType, java.lang.String verifier, com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo sdkInfo, com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo devInfo, com.paypal.oslo.feature.verificationcapture.domain.model.BarcodeInfo barcodeInfo, java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.ExtractedInfo> extractedInfos, com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload captureData, java.lang.String associationType, java.lang.String associatedRefId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(md5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checksum, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(side, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collectionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(devInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureData, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.MetaData(md5, checksum, side, collectionType, verifier, sdkInfo, devInfo, barcodeInfo, extractedInfos, captureData, associationType, associatedRefId);
    }

    public final java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.ExtractedInfo> component9() {
        return this.extractedInfos;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.BarcodeInfo getBarcodeInfo() {
        return this.barcodeInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.DevInfo getDevInfo() {
        return this.devInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.SdkInfo getSdkInfo() {
        return this.sdkInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getVerifier() {
        return this.verifier;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCollectionType() {
        return this.collectionType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSide() {
        return this.side;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getChecksum() {
        return this.checksum;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getAssociatedRefId() {
        return this.associatedRefId;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getAssociationType() {
        return this.associationType;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.verificationcapture.domain.model.CaptureDataPayload getCaptureData() {
        return this.captureData;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMd5() {
        return this.md5;
    }
}
