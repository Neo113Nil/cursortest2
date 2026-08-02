package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/payair/model/QrConsumerDeviceData;", "", "", "ced", "cvn", "digitalWalletID", "aip", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/QrConsumerDeviceData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAip", "getCed", "getCvn", "getDigitalWalletID"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class QrConsumerDeviceData {
    public java.lang.String aip;
    public java.lang.String ced;
    public java.lang.String cvn;
    public java.lang.String digitalWalletID;

    public QrConsumerDeviceData() {
        this(null, null, null, null, 15, null);
    }

    public final java.lang.String getAip() {
        return this.aip;
    }

    public final java.lang.String getCed() {
        return this.ced;
    }

    public final java.lang.String getCvn() {
        return this.cvn;
    }

    public final java.lang.String getDigitalWalletID() {
        return this.digitalWalletID;
    }

    public QrConsumerDeviceData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.ced = str;
        this.cvn = str2;
        this.digitalWalletID = str3;
        this.aip = str4;
    }

    public /* synthetic */ QrConsumerDeviceData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.ced;
        java.lang.String str2 = this.cvn;
        java.lang.String str3 = this.digitalWalletID;
        java.lang.String str4 = this.aip;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("QrConsumerDeviceData(ced=");
        sb.append(str);
        sb.append(", cvn=");
        sb.append(str2);
        sb.append(", digitalWalletID=");
        sb.append(str3);
        sb.append(", aip=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.ced;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.cvn;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.digitalWalletID;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.aip;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.QrConsumerDeviceData)) {
            return false;
        }
        com.payair.model.QrConsumerDeviceData qrConsumerDeviceData = (com.payair.model.QrConsumerDeviceData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.ced, qrConsumerDeviceData.ced) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvn, qrConsumerDeviceData.cvn) && kotlin.jvm.internal.Intrinsics.areEqual(this.digitalWalletID, qrConsumerDeviceData.digitalWalletID) && kotlin.jvm.internal.Intrinsics.areEqual(this.aip, qrConsumerDeviceData.aip);
    }

    public final com.payair.model.QrConsumerDeviceData copy(java.lang.String ced, java.lang.String cvn, java.lang.String digitalWalletID, java.lang.String aip) {
        return new com.payair.model.QrConsumerDeviceData(ced, cvn, digitalWalletID, aip);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAip() {
        return this.aip;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDigitalWalletID() {
        return this.digitalWalletID;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCvn() {
        return this.cvn;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCed() {
        return this.ced;
    }

    public static /* synthetic */ com.payair.model.QrConsumerDeviceData copy$default(com.payair.model.QrConsumerDeviceData qrConsumerDeviceData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = qrConsumerDeviceData.ced;
        }
        if ((i & 2) != 0) {
            str2 = qrConsumerDeviceData.cvn;
        }
        if ((i & 4) != 0) {
            str3 = qrConsumerDeviceData.digitalWalletID;
        }
        if ((i & 8) != 0) {
            str4 = qrConsumerDeviceData.aip;
        }
        return qrConsumerDeviceData.copy(str, str2, str3, str4);
    }
}
