package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;", "", "", "memo", "Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", io.ktor.http.LinkHeader.Parameters.Media, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;)Lcom/paypal/oslo/feature/p2p/domain/model/NoteDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMemo", "Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", "getMedia"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NoteDetails {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.domain.model.MediaItem media;
    private final java.lang.String memo;

    public NoteDetails(java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem) {
        this.memo = str;
        this.media = mediaItem;
    }

    public /* synthetic */ NoteDetails(java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : mediaItem);
    }

    public final java.lang.String getMemo() {
        return this.memo;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.MediaItem getMedia() {
        return this.media;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.memo;
        com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem = this.media;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NoteDetails(memo=");
        sb.append(str);
        sb.append(", media=");
        sb.append(mediaItem);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.memo;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem = this.media;
        return (hashCode * 31) + (mediaItem != null ? mediaItem.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.NoteDetails)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails = (com.paypal.oslo.feature.p2p.domain.model.NoteDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.memo, noteDetails.memo) && kotlin.jvm.internal.Intrinsics.areEqual(this.media, noteDetails.media);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.NoteDetails copy(java.lang.String memo, com.paypal.oslo.feature.p2p.domain.model.MediaItem media) {
        return new com.paypal.oslo.feature.p2p.domain.model.NoteDetails(memo, media);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.MediaItem getMedia() {
        return this.media;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMemo() {
        return this.memo;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.NoteDetails copy$default(com.paypal.oslo.feature.p2p.domain.model.NoteDetails noteDetails, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = noteDetails.memo;
        }
        if ((i & 2) != 0) {
            mediaItem = noteDetails.media;
        }
        return noteDetails.copy(str, mediaItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoteDetails() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
