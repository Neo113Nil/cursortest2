package com.discover.mpos.sdk.card.apdu.readrecord;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/readrecord/ReadRecordResponseContent;", "Lcom/discover/mpos/sdk/card/apdu/readrecord/ReadApduResponse;", "content", "", "([B)V", "tlvs", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getTlvs", "()Ljava/util/List;", "clear", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toByteArray", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.f.e, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class ReadRecordResponseContent implements com.discover.mpos.sdk.card.apdu.readrecord.ReadApduResponse {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> f2963a;
    private final byte[] b;

    public ReadRecordResponseContent(byte[] bArr) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.b = bArr;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.split$default(bArr, false, false, 3, null));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            new java.lang.Object[]{m23439exceptionOrNullimpl};
            m23436constructorimpl = kotlin.collections.CollectionsKt.emptyList();
        }
        this.f2963a = (java.util.List) m23436constructorimpl;
    }

    @Override // com.discover.mpos.sdk.card.apdu.readrecord.ReadApduResponse
    public final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> a() {
        return this.f2963a;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getE() {
        byte[] bArr = this.b;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.b);
        java.util.Iterator<T> it = this.f2963a.iterator();
        while (it.hasNext()) {
            ((com.discover.mpos.sdk.core.emv.tlv.Tlv) it.next()).clear();
        }
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.ClearableEmvData.DefaultImpls.toHexString(this);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadRecordResponseContent(content=");
        sb.append(java.util.Arrays.toString(this.b));
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        byte[] bArr = this.b;
        if (bArr != null) {
            return java.util.Arrays.hashCode(bArr);
        }
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponseContent) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponseContent) other).b);
        }
        return true;
    }
}
