package com.zettle.sdk.feature.taptopay.core.transaction;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b\"\u0010\rR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "", "", "ksn", "encryptedEmvTags", "", "panToken", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage$Companion$CvmType;", "cvmType", "onlineHostRequestMessageMac", "<init>", "(Ljava/lang/String;Ljava/lang/String;[BLcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage$Companion$CvmType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()[B", "component4", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage$Companion$CvmType;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;[BLcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage$Companion$CvmType;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/zettle/sdk/feature/taptopay/core/transaction/OnlineHostRequestMessage$Companion$CvmType;", "getCvmType", "Ljava/lang/String;", "getEncryptedEmvTags", "getKsn", "getOnlineHostRequestMessageMac", "[B", "getPanToken", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OnlineHostRequestMessage {
    private final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType cvmType;
    private final java.lang.String encryptedEmvTags;
    private final java.lang.String ksn;
    private final java.lang.String onlineHostRequestMessageMac;
    private final byte[] panToken;

    public OnlineHostRequestMessage(java.lang.String str, java.lang.String str2, byte[] bArr, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType cvmType, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvmType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.ksn = str;
        this.encryptedEmvTags = str2;
        this.panToken = bArr;
        this.cvmType = cvmType;
        this.onlineHostRequestMessageMac = str3;
    }

    public final java.lang.String getKsn() {
        return this.ksn;
    }

    public final java.lang.String getEncryptedEmvTags() {
        return this.encryptedEmvTags;
    }

    public final byte[] getPanToken() {
        return this.panToken;
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType getCvmType() {
        return this.cvmType;
    }

    public final java.lang.String getOnlineHostRequestMessageMac() {
        return this.onlineHostRequestMessageMac;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.ksn;
        java.lang.String str2 = this.encryptedEmvTags;
        com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType cvmType = this.cvmType;
        java.lang.String str3 = this.onlineHostRequestMessageMac;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ksn=");
        sb.append(str);
        sb.append("\nencryptedEmvTags=");
        sb.append(str2);
        sb.append("\ncvmType=");
        sb.append(cvmType);
        sb.append("\nonlineRequestMessageMac=");
        sb.append(str3);
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.ksn.hashCode() * 31) + this.encryptedEmvTags.hashCode()) * 31) + java.util.Arrays.hashCode(this.panToken)) * 31) + this.cvmType.hashCode()) * 31) + this.onlineHostRequestMessageMac.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage)) {
            return false;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage = (com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.ksn, onlineHostRequestMessage.ksn) && kotlin.jvm.internal.Intrinsics.areEqual(this.encryptedEmvTags, onlineHostRequestMessage.encryptedEmvTags) && kotlin.jvm.internal.Intrinsics.areEqual(this.panToken, onlineHostRequestMessage.panToken) && this.cvmType == onlineHostRequestMessage.cvmType && kotlin.jvm.internal.Intrinsics.areEqual(this.onlineHostRequestMessageMac, onlineHostRequestMessage.onlineHostRequestMessageMac);
    }

    public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage copy(java.lang.String ksn, java.lang.String encryptedEmvTags, byte[] panToken, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType cvmType, java.lang.String onlineHostRequestMessageMac) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ksn, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedEmvTags, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(panToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvmType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineHostRequestMessageMac, "");
        return new com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage(ksn, encryptedEmvTags, panToken, cvmType, onlineHostRequestMessageMac);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getOnlineHostRequestMessageMac() {
        return this.onlineHostRequestMessageMac;
    }

    /* renamed from: component4, reason: from getter */
    public final com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType getCvmType() {
        return this.cvmType;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getPanToken() {
        return this.panToken;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEncryptedEmvTags() {
        return this.encryptedEmvTags;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getKsn() {
        return this.ksn;
    }

    public static /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage copy$default(com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage onlineHostRequestMessage, java.lang.String str, java.lang.String str2, byte[] bArr, com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType cvmType, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = onlineHostRequestMessage.ksn;
        }
        if ((i & 2) != 0) {
            str2 = onlineHostRequestMessage.encryptedEmvTags;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            bArr = onlineHostRequestMessage.panToken;
        }
        byte[] bArr2 = bArr;
        if ((i & 8) != 0) {
            cvmType = onlineHostRequestMessage.cvmType;
        }
        com.zettle.sdk.feature.taptopay.core.transaction.OnlineHostRequestMessage.Companion.CvmType cvmType2 = cvmType;
        if ((i & 16) != 0) {
            str3 = onlineHostRequestMessage.onlineHostRequestMessageMac;
        }
        return onlineHostRequestMessage.copy(str, str4, bArr2, cvmType2, str3);
    }
}
