package com.discover.mpos.sdk.transaction.processing.pdol;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/discover/mpos/sdk/transaction/processing/pdol/Pdol;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "tag", "Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolTag;", "content", "", "(Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolTag;[B)V", "getContent", "()[B", "setContent", "([B)V", "getTag", "()Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolTag;", "clear", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.processing.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class Pdol implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.transaction.processing.pdol.PdolTag f3272a;
    public byte[] b;

    public /* synthetic */ Pdol(com.discover.mpos.sdk.transaction.processing.pdol.PdolTag pdolTag) {
        this(pdolTag, null);
    }

    public Pdol(com.discover.mpos.sdk.transaction.processing.pdol.PdolTag pdolTag, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolTag, "");
        this.f3272a = pdolTag;
        this.b = bArr;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f3272a.toString());
        byte[] bArr = this.b;
        sb.append(bArr != null ? com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(bArr) : null);
        return sb.toString();
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        byte[] bArr = this.b;
        if (bArr != null) {
            com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(bArr);
        }
    }

    public final int hashCode() {
        com.discover.mpos.sdk.transaction.processing.pdol.PdolTag pdolTag = this.f3272a;
        int hashCode = pdolTag != null ? pdolTag.hashCode() : 0;
        byte[] bArr = this.b;
        return (hashCode * 31) + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.transaction.processing.pdol.Pdol)) {
            return false;
        }
        com.discover.mpos.sdk.transaction.processing.pdol.Pdol pdol = (com.discover.mpos.sdk.transaction.processing.pdol.Pdol) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3272a, pdol.f3272a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, pdol.b);
    }
}
