package com.discover.mpos.sdk.card.apdu.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/emv/DirectoryEntry;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "adfName", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "cardApplication", "Lcom/discover/mpos/sdk/card/apdu/emv/CardApplication;", "kernelIdentifier", "extendedSelection", "orderInData", "", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/card/apdu/emv/CardApplication;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;I)V", "getAdfName", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getCardApplication", "()Lcom/discover/mpos/sdk/card/apdu/emv/CardApplication;", "getExtendedSelection", "getKernelIdentifier", "getOrderInData", "()I", "clear", "", "equals", "", "other", "", "hashCode", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.a.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DirectoryEntry implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv f2933a;
    public final com.discover.mpos.sdk.card.apdu.emv.CardApplication b;
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv c;
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv d;
    private final int e;

    public DirectoryEntry(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.card.apdu.emv.CardApplication cardApplication, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv3, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardApplication, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv3, "");
        this.f2933a = tlv;
        this.b = cardApplication;
        this.c = tlv2;
        this.d = tlv3;
        this.e = i;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry");
        }
        com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry directoryEntry = (com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f2933a, directoryEntry.f2933a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, directoryEntry.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, directoryEntry.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, directoryEntry.d) && this.e == directoryEntry.e;
    }

    public final int hashCode() {
        int hashCode = this.f2933a.hashCode();
        int hashCode2 = this.b.hashCode();
        return (((((((hashCode * 31) + hashCode2) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DirectoryEntry(adfName=");
        sb.append(this.f2933a);
        sb.append(", cardApplication=");
        sb.append(this.b);
        sb.append(", kernelIdentifier=");
        sb.append(this.c);
        sb.append(", extendedSelection=");
        sb.append(this.d);
        sb.append(", orderInData=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        this.f2933a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
    }
}
