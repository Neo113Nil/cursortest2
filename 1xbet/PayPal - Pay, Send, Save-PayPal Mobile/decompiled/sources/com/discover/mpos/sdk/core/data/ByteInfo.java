package com.discover.mpos.sdk.core.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0006HÂ\u0003J\u0006\u0010\r\u001a\u00020\u0000J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000fJ\u0006\u0010\u001a\u001a\u00020\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/discover/mpos/sdk/core/data/ByteInfo;", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "byte", "", "(B)V", "bitInfo", "", "([Z)V", "byteArraySize", "", "falseValueForEmv", "trueValueForEmv", "component1", "copy", "equals", "", "other", "", "getBitValue", "index", "Lcom/discover/mpos/sdk/core/data/ByteInfo$BitIndex;", "hashCode", "reset", "", "setBitValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "toByte", "toByteArray", "", "toString", "", "BitIndex", "mpos-sdk-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class ByteInfo implements com.discover.mpos.sdk.core.emv.EmvData {
    private final boolean[] bitInfo;
    private final int byteArraySize;
    private final int falseValueForEmv;
    private final int trueValueForEmv;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/discover/mpos/sdk/core/data/ByteInfo$BitIndex;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST", "SECOND", "THIRD", "FOURTH", "FIFTH", "SIXTH", "SEVENTH", "EIGHTH"}, k = 1, mv = {1, 4, 1})
    public enum BitIndex {
        FIRST,
        SECOND,
        THIRD,
        FOURTH,
        FIFTH,
        SIXTH,
        SEVENTH,
        EIGHTH
    }

    public ByteInfo(boolean[] zArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zArr, "");
        this.bitInfo = zArr;
        this.trueValueForEmv = 1;
        this.byteArraySize = 1;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.EmvData.DefaultImpls.toHexString(this);
    }

    public /* synthetic */ ByteInfo(boolean[] zArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new boolean[com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.values().length] : zArr);
    }

    public ByteInfo(byte b) {
        this(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toBooleanArray(b));
    }

    public final boolean getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex index) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(index, "");
        return this.bitInfo[index.ordinal()];
    }

    public final void setBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex index, boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(index, "");
        this.bitInfo[index.ordinal()] = value;
    }

    public final byte toByte() {
        return (byte) com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toInt(this.bitInfo);
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getB() {
        int i = this.byteArraySize;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = toByte();
        }
        return bArr;
    }

    public final void reset() {
        kotlin.collections.ArraysKt.fill$default(this.bitInfo, false, 0, 0, 6, (java.lang.Object) null);
    }

    public final com.discover.mpos.sdk.core.data.ByteInfo copy() {
        return new com.discover.mpos.sdk.core.data.ByteInfo((boolean[]) this.bitInfo.clone());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other != null) {
            return java.util.Arrays.equals(this.bitInfo, ((com.discover.mpos.sdk.core.data.ByteInfo) other).bitInfo);
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.core.data.ByteInfo");
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.bitInfo);
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.Boolean> reversed = kotlin.collections.ArraysKt.reversed(this.bitInfo);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(reversed, 10));
        java.util.Iterator<T> it = reversed.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((java.lang.Boolean) it.next()).booleanValue() ? this.trueValueForEmv : this.falseValueForEmv));
        }
        return arrayList.toString();
    }

    public final com.discover.mpos.sdk.core.data.ByteInfo copy(boolean[] bitInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitInfo, "");
        return new com.discover.mpos.sdk.core.data.ByteInfo(bitInfo);
    }

    public static /* synthetic */ com.discover.mpos.sdk.core.data.ByteInfo copy$default(com.discover.mpos.sdk.core.data.ByteInfo byteInfo, boolean[] zArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            zArr = byteInfo.bitInfo;
        }
        return byteInfo.copy(zArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ByteInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
