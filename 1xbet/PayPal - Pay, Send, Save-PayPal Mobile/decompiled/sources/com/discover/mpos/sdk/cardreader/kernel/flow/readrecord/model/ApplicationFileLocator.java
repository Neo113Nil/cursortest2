package com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003J\b\u0010\u000e\u001a\u00020\fH\u0016J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\u0011\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\u0002J\t\u0010\u0018\u001a\u00020\u0017HÖ\u0001J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u0096\u0002J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ApplicationFileLocator;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "", "Lcom/discover/mpos/sdk/card/apdu/readrecord/ReadRecordResponse;", "readRecordParameter", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ReadRecordParameter;", "(Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ReadRecordParameter;)V", "getReadRecordParameter", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ReadRecordParameter;", "records", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "", "readRecordResponse", "clear", "component1", "copy", "equals", "", "other", "", "get", "index", "", "hashCode", "iterator", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.k.c.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class ApplicationFileLocator implements com.discover.mpos.sdk.core.emv.Clearable, java.lang.Iterable<com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List<com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse> f3171a;
    public final com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordParameter b;

    public ApplicationFileLocator(com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordParameter readRecordParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readRecordParameter, "");
        this.b = readRecordParameter;
        this.f3171a = new java.util.ArrayList();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse> iterator() {
        return this.f3171a.iterator();
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        java.util.Iterator<T> it = this.f3171a.iterator();
        while (it.hasNext()) {
            ((com.discover.mpos.sdk.card.apdu.readrecord.ReadRecordResponse) it.next()).clear();
        }
        this.f3171a.clear();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ApplicationFileLocator(readRecordParameter=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordParameter readRecordParameter = this.b;
        if (readRecordParameter != null) {
            return readRecordParameter.hashCode();
        }
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, ((com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator) other).b);
        }
        return true;
    }
}
