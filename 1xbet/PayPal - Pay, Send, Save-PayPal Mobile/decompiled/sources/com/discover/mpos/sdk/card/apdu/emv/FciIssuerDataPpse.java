package com.discover.mpos.sdk.card.apdu.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/emv/FciIssuerDataPpse;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "directoryEntries", "", "Lcom/discover/mpos/sdk/card/apdu/emv/DirectoryEntry;", "(Ljava/util/List;)V", "getDirectoryEntries", "()Ljava/util/List;", "setDirectoryEntries", "clear", "", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.a.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class FciIssuerDataPpse implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List<com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry> f2934a;

    public FciIssuerDataPpse(java.util.List<com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry> list) {
        this.f2934a = list;
    }

    private /* synthetic */ FciIssuerDataPpse() {
        this(null);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FciIssuerDataPpse(directoryEntries=");
        sb.append(this.f2934a);
        sb.append(')');
        return sb.toString();
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        java.util.List<com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry> list = this.f2934a;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry) it.next()).clear();
            }
        }
        this.f2934a = null;
    }

    public final int hashCode() {
        java.util.List<com.discover.mpos.sdk.card.apdu.emv.DirectoryEntry> list = this.f2934a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataPpse) && kotlin.jvm.internal.Intrinsics.areEqual(this.f2934a, ((com.discover.mpos.sdk.card.apdu.emv.FciIssuerDataPpse) other).f2934a);
        }
        return true;
    }
}
