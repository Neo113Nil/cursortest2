package com.discover.mpos.sdk.core.extensions.tlv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/discover/mpos/sdk/core/extensions/tlv/DataRegion;", "", "", "dataBytes", "Lcom/discover/mpos/sdk/core/extensions/tlv/DataLength;", "dataLength", "<init>", "([BLcom/discover/mpos/sdk/core/extensions/tlv/DataLength;)V", "component1", "()[B", "component2", "()Lcom/discover/mpos/sdk/core/extensions/tlv/DataLength;", "copy", "([BLcom/discover/mpos/sdk/core/extensions/tlv/DataLength;)Lcom/discover/mpos/sdk/core/extensions/tlv/DataRegion;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[B", "getDataBytes", "Lcom/discover/mpos/sdk/core/extensions/tlv/DataLength;", "getDataLength"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class DataRegion {
    private final byte[] dataBytes;
    private final com.discover.mpos.sdk.core.extensions.tlv.DataLength dataLength;

    public DataRegion(byte[] bArr, com.discover.mpos.sdk.core.extensions.tlv.DataLength dataLength) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataLength, "");
        this.dataBytes = bArr;
        this.dataLength = dataLength;
    }

    public /* synthetic */ DataRegion(byte[] bArr, com.discover.mpos.sdk.core.extensions.tlv.DataLength dataLength, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bArr, (i & 2) != 0 ? new com.discover.mpos.sdk.core.extensions.tlv.DataLength(0, 0, 3, null) : dataLength);
    }

    public final byte[] getDataBytes() {
        return this.dataBytes;
    }

    public final com.discover.mpos.sdk.core.extensions.tlv.DataLength getDataLength() {
        return this.dataLength;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DataRegion(dataBytes=");
        sb.append(java.util.Arrays.toString(this.dataBytes));
        sb.append(", dataLength=");
        sb.append(this.dataLength);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        byte[] bArr = this.dataBytes;
        int hashCode = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        com.discover.mpos.sdk.core.extensions.tlv.DataLength dataLength = this.dataLength;
        return (hashCode * 31) + (dataLength != null ? dataLength.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.core.extensions.tlv.DataRegion)) {
            return false;
        }
        com.discover.mpos.sdk.core.extensions.tlv.DataRegion dataRegion = (com.discover.mpos.sdk.core.extensions.tlv.DataRegion) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dataBytes, dataRegion.dataBytes) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataLength, dataRegion.dataLength);
    }

    public final com.discover.mpos.sdk.core.extensions.tlv.DataRegion copy(byte[] dataBytes, com.discover.mpos.sdk.core.extensions.tlv.DataLength dataLength) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataLength, "");
        return new com.discover.mpos.sdk.core.extensions.tlv.DataRegion(dataBytes, dataLength);
    }

    /* renamed from: component2, reason: from getter */
    public final com.discover.mpos.sdk.core.extensions.tlv.DataLength getDataLength() {
        return this.dataLength;
    }

    /* renamed from: component1, reason: from getter */
    public final byte[] getDataBytes() {
        return this.dataBytes;
    }

    public static /* synthetic */ com.discover.mpos.sdk.core.extensions.tlv.DataRegion copy$default(com.discover.mpos.sdk.core.extensions.tlv.DataRegion dataRegion, byte[] bArr, com.discover.mpos.sdk.core.extensions.tlv.DataLength dataLength, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = dataRegion.dataBytes;
        }
        if ((i & 2) != 0) {
            dataLength = dataRegion.dataLength;
        }
        return dataRegion.copy(bArr, dataLength);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataRegion() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
