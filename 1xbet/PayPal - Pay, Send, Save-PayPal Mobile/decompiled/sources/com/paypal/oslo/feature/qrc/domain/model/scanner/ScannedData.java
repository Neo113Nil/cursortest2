package com.paypal.oslo.feature.qrc.domain.model.scanner;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/scanner/ScannedData;", "", "", "qrCode", "", "latitude", "longitude", "geoCountry", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Double;", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/domain/model/scanner/ScannedData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getQrCode", "Ljava/lang/Double;", "getLatitude", "getLongitude", "getGeoCountry"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ScannedData {
    public static final int $stable = 0;
    private final java.lang.String geoCountry;
    private final java.lang.Double latitude;
    private final java.lang.Double longitude;
    private final java.lang.String qrCode;

    public ScannedData(java.lang.String str, java.lang.Double d, java.lang.Double d2, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.qrCode = str;
        this.latitude = d;
        this.longitude = d2;
        this.geoCountry = str2;
    }

    public /* synthetic */ ScannedData(java.lang.String str, java.lang.Double d, java.lang.Double d2, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : str2);
    }

    public final java.lang.String getQrCode() {
        return this.qrCode;
    }

    public final java.lang.Double getLatitude() {
        return this.latitude;
    }

    public final java.lang.Double getLongitude() {
        return this.longitude;
    }

    public final java.lang.String getGeoCountry() {
        return this.geoCountry;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.qrCode;
        java.lang.Double d = this.latitude;
        java.lang.Double d2 = this.longitude;
        java.lang.String str2 = this.geoCountry;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScannedData(qrCode=");
        sb.append(str);
        sb.append(", latitude=");
        sb.append(d);
        sb.append(", longitude=");
        sb.append(d2);
        sb.append(", geoCountry=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.qrCode.hashCode();
        java.lang.Double d = this.latitude;
        int hashCode2 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.longitude;
        int hashCode3 = d2 == null ? 0 : d2.hashCode();
        java.lang.String str = this.geoCountry;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData scannedData = (com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.qrCode, scannedData.qrCode) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.latitude, (java.lang.Object) scannedData.latitude) && kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) this.longitude, (java.lang.Object) scannedData.longitude) && kotlin.jvm.internal.Intrinsics.areEqual(this.geoCountry, scannedData.geoCountry);
    }

    public final com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData copy(java.lang.String qrCode, java.lang.Double latitude, java.lang.Double longitude, java.lang.String geoCountry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrCode, "");
        return new com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData(qrCode, latitude, longitude, geoCountry);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getGeoCountry() {
        return this.geoCountry;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Double getLongitude() {
        return this.longitude;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Double getLatitude() {
        return this.latitude;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getQrCode() {
        return this.qrCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData copy$default(com.paypal.oslo.feature.qrc.domain.model.scanner.ScannedData scannedData, java.lang.String str, java.lang.Double d, java.lang.Double d2, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = scannedData.qrCode;
        }
        if ((i & 2) != 0) {
            d = scannedData.latitude;
        }
        if ((i & 4) != 0) {
            d2 = scannedData.longitude;
        }
        if ((i & 8) != 0) {
            str2 = scannedData.geoCountry;
        }
        return scannedData.copy(str, d, d2, str2);
    }
}
