package com.paypal.oslo.feature.qrc.domain.model.scanner;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J \u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u0014R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u00106R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010,\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u00106R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010<R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010,\u001a\u0004\b=\u0010\u0014\"\u0004\b>\u00106R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010!\"\u0004\bA\u0010B"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/scanner/DeviceMetadata;", "", "", "deviceId", "deviceType", "osVersion", "osName", "deviceName", "consumerAppName", "consumerAppVersion", "devicePublicKey", "devicePublicKeyAlgorithm", "Lcom/paypal/oslo/feature/qrc/domain/model/scanner/GeoCoordinates;", "geoCoordinates", "geoCountry", "Lcom/paypal/oslo/feature/qrc/domain/model/scanner/VettedStatus;", "vettedStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/scanner/GeoCoordinates;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/scanner/VettedStatus;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Lcom/paypal/oslo/feature/qrc/domain/model/scanner/GeoCoordinates;", "component11", "component12", "()Lcom/paypal/oslo/feature/qrc/domain/model/scanner/VettedStatus;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/scanner/GeoCoordinates;Ljava/lang/String;Lcom/paypal/oslo/feature/qrc/domain/model/scanner/VettedStatus;)Lcom/paypal/oslo/feature/qrc/domain/model/scanner/DeviceMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceId", "getDeviceType", "getOsVersion", "getOsName", "getDeviceName", "getConsumerAppName", "getConsumerAppVersion", "getDevicePublicKey", "setDevicePublicKey", "(Ljava/lang/String;)V", "getDevicePublicKeyAlgorithm", "setDevicePublicKeyAlgorithm", "Lcom/paypal/oslo/feature/qrc/domain/model/scanner/GeoCoordinates;", "getGeoCoordinates", "setGeoCoordinates", "(Lcom/paypal/oslo/feature/qrc/domain/model/scanner/GeoCoordinates;)V", "getGeoCountry", "setGeoCountry", "Lcom/paypal/oslo/feature/qrc/domain/model/scanner/VettedStatus;", "getVettedStatus", "setVettedStatus", "(Lcom/paypal/oslo/feature/qrc/domain/model/scanner/VettedStatus;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DeviceMetadata {
    public static final int $stable = 8;
    private final java.lang.String consumerAppName;
    private final java.lang.String consumerAppVersion;
    private final java.lang.String deviceId;
    private final java.lang.String deviceName;
    private java.lang.String devicePublicKey;
    private java.lang.String devicePublicKeyAlgorithm;
    private final java.lang.String deviceType;
    private com.paypal.oslo.feature.qrc.domain.model.scanner.GeoCoordinates geoCoordinates;
    private java.lang.String geoCountry;
    private final java.lang.String osName;
    private final java.lang.String osVersion;
    private com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus vettedStatus;

    public DeviceMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, com.paypal.oslo.feature.qrc.domain.model.scanner.GeoCoordinates geoCoordinates, java.lang.String str10, com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus vettedStatus) {
        this.deviceId = str;
        this.deviceType = str2;
        this.osVersion = str3;
        this.osName = str4;
        this.deviceName = str5;
        this.consumerAppName = str6;
        this.consumerAppVersion = str7;
        this.devicePublicKey = str8;
        this.devicePublicKeyAlgorithm = str9;
        this.geoCoordinates = geoCoordinates;
        this.geoCountry = str10;
        this.vettedStatus = vettedStatus;
    }

    public /* synthetic */ DeviceMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, com.paypal.oslo.feature.qrc.domain.model.scanner.GeoCoordinates geoCoordinates, java.lang.String str10, com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus vettedStatus, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : geoCoordinates, (i & 1024) != 0 ? null : str10, (i & 2048) == 0 ? vettedStatus : null);
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final java.lang.String getDeviceType() {
        return this.deviceType;
    }

    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    public final java.lang.String getOsName() {
        return this.osName;
    }

    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    public final java.lang.String getConsumerAppName() {
        return this.consumerAppName;
    }

    public final java.lang.String getConsumerAppVersion() {
        return this.consumerAppVersion;
    }

    public final java.lang.String getDevicePublicKey() {
        return this.devicePublicKey;
    }

    public final void setDevicePublicKey(java.lang.String str) {
        this.devicePublicKey = str;
    }

    public final java.lang.String getDevicePublicKeyAlgorithm() {
        return this.devicePublicKeyAlgorithm;
    }

    public final void setDevicePublicKeyAlgorithm(java.lang.String str) {
        this.devicePublicKeyAlgorithm = str;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.scanner.GeoCoordinates getGeoCoordinates() {
        return this.geoCoordinates;
    }

    public final void setGeoCoordinates(com.paypal.oslo.feature.qrc.domain.model.scanner.GeoCoordinates geoCoordinates) {
        this.geoCoordinates = geoCoordinates;
    }

    public final java.lang.String getGeoCountry() {
        return this.geoCountry;
    }

    public final void setGeoCountry(java.lang.String str) {
        this.geoCountry = str;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus getVettedStatus() {
        return this.vettedStatus;
    }

    public final void setVettedStatus(com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus vettedStatus) {
        this.vettedStatus = vettedStatus;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceId;
        java.lang.String str2 = this.deviceType;
        java.lang.String str3 = this.osVersion;
        java.lang.String str4 = this.osName;
        java.lang.String str5 = this.deviceName;
        java.lang.String str6 = this.consumerAppName;
        java.lang.String str7 = this.consumerAppVersion;
        java.lang.String str8 = this.devicePublicKey;
        java.lang.String str9 = this.devicePublicKeyAlgorithm;
        com.paypal.oslo.feature.qrc.domain.model.scanner.GeoCoordinates geoCoordinates = this.geoCoordinates;
        java.lang.String str10 = this.geoCountry;
        com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus vettedStatus = this.vettedStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceMetadata(deviceId=");
        sb.append(str);
        sb.append(", deviceType=");
        sb.append(str2);
        sb.append(", osVersion=");
        sb.append(str3);
        sb.append(", osName=");
        sb.append(str4);
        sb.append(", deviceName=");
        sb.append(str5);
        sb.append(", consumerAppName=");
        sb.append(str6);
        sb.append(", consumerAppVersion=");
        sb.append(str7);
        sb.append(", devicePublicKey=");
        sb.append(str8);
        sb.append(", devicePublicKeyAlgorithm=");
        sb.append(str9);
        sb.append(", geoCoordinates=");
        sb.append(geoCoordinates);
        sb.append(", geoCountry=");
        sb.append(str10);
        sb.append(", vettedStatus=");
        sb.append(vettedStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.deviceId;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.deviceType;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.osVersion;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.osName;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.deviceName;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.consumerAppName;
        int hashCode6 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.consumerAppVersion;
        int hashCode7 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.devicePublicKey;
        int hashCode8 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.devicePublicKeyAlgorithm;
        int hashCode9 = str9 == null ? 0 : str9.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.scanner.GeoCoordinates geoCoordinates = this.geoCoordinates;
        int hashCode10 = geoCoordinates == null ? 0 : geoCoordinates.hashCode();
        java.lang.String str10 = this.geoCountry;
        int hashCode11 = str10 == null ? 0 : str10.hashCode();
        com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus vettedStatus = this.vettedStatus;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (vettedStatus != null ? vettedStatus.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata deviceMetadata = (com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, deviceMetadata.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceType, deviceMetadata.deviceType) && kotlin.jvm.internal.Intrinsics.areEqual(this.osVersion, deviceMetadata.osVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.osName, deviceMetadata.osName) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceName, deviceMetadata.deviceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.consumerAppName, deviceMetadata.consumerAppName) && kotlin.jvm.internal.Intrinsics.areEqual(this.consumerAppVersion, deviceMetadata.consumerAppVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.devicePublicKey, deviceMetadata.devicePublicKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.devicePublicKeyAlgorithm, deviceMetadata.devicePublicKeyAlgorithm) && kotlin.jvm.internal.Intrinsics.areEqual(this.geoCoordinates, deviceMetadata.geoCoordinates) && kotlin.jvm.internal.Intrinsics.areEqual(this.geoCountry, deviceMetadata.geoCountry) && this.vettedStatus == deviceMetadata.vettedStatus;
    }

    public final com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata copy(java.lang.String deviceId, java.lang.String deviceType, java.lang.String osVersion, java.lang.String osName, java.lang.String deviceName, java.lang.String consumerAppName, java.lang.String consumerAppVersion, java.lang.String devicePublicKey, java.lang.String devicePublicKeyAlgorithm, com.paypal.oslo.feature.qrc.domain.model.scanner.GeoCoordinates geoCoordinates, java.lang.String geoCountry, com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus vettedStatus) {
        return new com.paypal.oslo.feature.qrc.domain.model.scanner.DeviceMetadata(deviceId, deviceType, osVersion, osName, deviceName, consumerAppName, consumerAppVersion, devicePublicKey, devicePublicKeyAlgorithm, geoCoordinates, geoCountry, vettedStatus);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getDevicePublicKeyAlgorithm() {
        return this.devicePublicKeyAlgorithm;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getDevicePublicKey() {
        return this.devicePublicKey;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getConsumerAppVersion() {
        return this.consumerAppVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getConsumerAppName() {
        return this.consumerAppName;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getOsName() {
        return this.osName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.scanner.VettedStatus getVettedStatus() {
        return this.vettedStatus;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getGeoCountry() {
        return this.geoCountry;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.qrc.domain.model.scanner.GeoCoordinates getGeoCoordinates() {
        return this.geoCoordinates;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public DeviceMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null);
    }
}
