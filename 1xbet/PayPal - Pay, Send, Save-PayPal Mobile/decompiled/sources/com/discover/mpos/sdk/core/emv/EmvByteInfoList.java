package com.discover.mpos.sdk.core.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB!\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u001dj\b\u0012\u0004\u0012\u00020\f`\u001e8\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%"}, d2 = {"Lcom/discover/mpos/sdk/core/emv/EmvByteInfoList;", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "", "byteArray", "", "expectedSize", "<init>", "([BI)V", "", "hexString", "(Ljava/lang/String;)V", "", "Lcom/discover/mpos/sdk/core/data/ByteInfo;", "byteList", "(Ljava/util/List;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "reset", "()V", "toByteArray", "()[B", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "byteInfoList", "Ljava/util/ArrayList;", "getByteInfoList", "()Ljava/util/ArrayList;", "isEmpty", "Z", "()Z"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public abstract class EmvByteInfoList implements com.discover.mpos.sdk.core.emv.EmvData {
    private final java.util.ArrayList<com.discover.mpos.sdk.core.data.ByteInfo> byteInfoList;
    private final boolean isEmpty;

    /* JADX WARN: Multi-variable type inference failed */
    public EmvByteInfoList(java.util.List<com.discover.mpos.sdk.core.data.ByteInfo> list, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<com.discover.mpos.sdk.core.data.ByteInfo> arrayList = new java.util.ArrayList<>(i);
        this.byteInfoList = arrayList;
        this.isEmpty = list.isEmpty();
        int size = i - list.size();
        arrayList.addAll(list);
        if (size > 0) {
            java.util.ArrayList<com.discover.mpos.sdk.core.data.ByteInfo> arrayList2 = arrayList;
            com.discover.mpos.sdk.core.data.ByteInfo[] byteInfoArr = new com.discover.mpos.sdk.core.data.ByteInfo[size];
            for (int i2 = 0; i2 < size; i2++) {
                byteInfoArr[i2] = new com.discover.mpos.sdk.core.data.ByteInfo(null, 1, 0 == true ? 1 : 0);
            }
            kotlin.collections.CollectionsKt.addAll(arrayList2, byteInfoArr);
        }
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.EmvData.DefaultImpls.toHexString(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EmvByteInfoList(java.util.List list, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((java.util.List<com.discover.mpos.sdk.core.data.ByteInfo>) list, (i2 & 2) != 0 ? list.size() : i);
        list = (i2 & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public /* synthetic */ EmvByteInfoList(byte[] bArr, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmvByteInfoList(java.lang.String str) {
        this(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(str), 0, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    protected final java.util.ArrayList<com.discover.mpos.sdk.core.data.ByteInfo> getByteInfoList() {
        return this.byteInfoList;
    }

    /* renamed from: isEmpty, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public byte[] getK() {
        int size = this.byteInfoList.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = kotlin.collections.ArraysKt.first(this.byteInfoList.get(i).getK());
        }
        return bArr;
    }

    public java.lang.String toString() {
        return toHexString();
    }

    public boolean equals(java.lang.Object other) {
        byte[] k;
        if (!(other instanceof com.discover.mpos.sdk.core.emv.EmvByteInfoList)) {
            other = null;
        }
        com.discover.mpos.sdk.core.emv.EmvByteInfoList emvByteInfoList = (com.discover.mpos.sdk.core.emv.EmvByteInfoList) other;
        if (emvByteInfoList == null || (k = emvByteInfoList.getK()) == null) {
            return false;
        }
        return java.util.Arrays.equals(k, getK());
    }

    public int hashCode() {
        return (int) com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.numToLong(getK());
    }

    public final void reset() {
        java.util.Iterator<T> it = this.byteInfoList.iterator();
        while (it.hasNext()) {
            ((com.discover.mpos.sdk.core.data.ByteInfo) it.next()).reset();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EmvByteInfoList(byte[] bArr, int i) {
        this((java.util.List<com.discover.mpos.sdk.core.data.ByteInfo>) r0, i);
        java.util.ArrayList emptyList;
        if (bArr == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length);
            for (byte b : bArr) {
                arrayList.add(new com.discover.mpos.sdk.core.data.ByteInfo(b));
            }
            emptyList = arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmvByteInfoList() {
        this((java.util.List) null, 0, 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
