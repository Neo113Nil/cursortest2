package com.discover.mpos.sdk.core.extensions.tlv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/discover/mpos/sdk/core/extensions/tlv/DataLength;", "", "", "lengthValue", "bytesForStorage", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/discover/mpos/sdk/core/extensions/tlv/DataLength;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getBytesForStorage", "getLengthValue"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class DataLength {
    private final int bytesForStorage;
    private final int lengthValue;

    public DataLength(int i, int i2) {
        this.lengthValue = i;
        this.bytesForStorage = i2;
    }

    public /* synthetic */ DataLength(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getBytesForStorage() {
        return this.bytesForStorage;
    }

    public final int getLengthValue() {
        return this.lengthValue;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataLength(lengthValue=");
        sb.append(this.lengthValue);
        sb.append(", bytesForStorage=");
        sb.append(this.bytesForStorage);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Integer.hashCode(this.lengthValue) * 31) + java.lang.Integer.hashCode(this.bytesForStorage);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.core.extensions.tlv.DataLength)) {
            return false;
        }
        com.discover.mpos.sdk.core.extensions.tlv.DataLength dataLength = (com.discover.mpos.sdk.core.extensions.tlv.DataLength) other;
        return this.lengthValue == dataLength.lengthValue && this.bytesForStorage == dataLength.bytesForStorage;
    }

    public final com.discover.mpos.sdk.core.extensions.tlv.DataLength copy(int lengthValue, int bytesForStorage) {
        return new com.discover.mpos.sdk.core.extensions.tlv.DataLength(lengthValue, bytesForStorage);
    }

    /* renamed from: component2, reason: from getter */
    public final int getBytesForStorage() {
        return this.bytesForStorage;
    }

    /* renamed from: component1, reason: from getter */
    public final int getLengthValue() {
        return this.lengthValue;
    }

    public static /* synthetic */ com.discover.mpos.sdk.core.extensions.tlv.DataLength copy$default(com.discover.mpos.sdk.core.extensions.tlv.DataLength dataLength, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = dataLength.lengthValue;
        }
        if ((i3 & 2) != 0) {
            i2 = dataLength.bytesForStorage;
        }
        return dataLength.copy(i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataLength() {
        this(r2, r2, 3, null);
        int i = 0;
    }
}
