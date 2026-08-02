package com.discover.mpos.sdk.core.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nB!\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u00168\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/discover/mpos/sdk/core/emv/EmvDataObject;", "Lcom/discover/mpos/sdk/core/emv/EmvDataFormatter;", "", "", "byteArray", "", "expectedSize", "<init>", "([BI)V", "hexString", "(Ljava/lang/String;)V", "", "Lcom/discover/mpos/sdk/core/data/ByteInfo;", "byteList", "(Ljava/util/List;I)V", "", "reset", "()V", "toEmvFormat", "()Ljava/lang/String;", "toString", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "byteInfoList", "Ljava/util/ArrayList;", "getByteInfoList", "()Ljava/util/ArrayList;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public abstract class EmvDataObject implements com.discover.mpos.sdk.core.emv.EmvDataFormatter<java.lang.String> {
    private final java.util.ArrayList<com.discover.mpos.sdk.core.data.ByteInfo> byteInfoList;

    public EmvDataObject(java.util.List<com.discover.mpos.sdk.core.data.ByteInfo> list, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList<com.discover.mpos.sdk.core.data.ByteInfo> arrayList = new java.util.ArrayList<>(i);
        this.byteInfoList = arrayList;
        int size = i - list.size();
        arrayList.addAll(list);
        if (size > 0) {
            java.util.ArrayList<com.discover.mpos.sdk.core.data.ByteInfo> arrayList2 = arrayList;
            com.discover.mpos.sdk.core.data.ByteInfo[] byteInfoArr = new com.discover.mpos.sdk.core.data.ByteInfo[size];
            for (int i2 = 0; i2 < size; i2++) {
                byteInfoArr[i2] = new com.discover.mpos.sdk.core.data.ByteInfo(null, 1, null);
            }
            kotlin.collections.CollectionsKt.addAll(arrayList2, byteInfoArr);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ EmvDataObject(java.util.List list, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((java.util.List<com.discover.mpos.sdk.core.data.ByteInfo>) list, (i2 & 2) != 0 ? list.size() : i);
        list = (i2 & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    public /* synthetic */ EmvDataObject(byte[] bArr, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmvDataObject(java.lang.String str) {
        this(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toByteInfo(str), 0, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    protected final java.util.ArrayList<com.discover.mpos.sdk.core.data.ByteInfo> getByteInfoList() {
        return this.byteInfoList;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvDataFormatter
    public java.lang.String toEmvFormat() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<T> it = this.byteInfoList.iterator();
        while (it.hasNext()) {
            sb.append(((com.discover.mpos.sdk.core.data.ByteInfo) it.next()).toHexString());
        }
        return sb.toString();
    }

    public java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
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
    public EmvDataObject(byte[] bArr, int i) {
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
    public EmvDataObject() {
        this((java.util.List) null, 0, 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
