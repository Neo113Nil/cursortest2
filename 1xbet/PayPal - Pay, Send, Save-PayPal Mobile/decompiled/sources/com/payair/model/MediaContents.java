package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/payair/model/MediaContents;", "", "", "Lcom/payair/model/Asset;", "assets", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/payair/model/MediaContents;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAssets"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MediaContents {
    private final java.util.List<com.payair.model.Asset> assets;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaContents() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.util.List<com.payair.model.Asset> getAssets() {
        return this.assets;
    }

    public MediaContents(java.util.List<com.payair.model.Asset> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.assets = list;
    }

    public /* synthetic */ MediaContents(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.lang.String toString() {
        java.util.List<com.payair.model.Asset> list = this.assets;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaContents(assets=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.assets.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.payair.model.MediaContents) && kotlin.jvm.internal.Intrinsics.areEqual(this.assets, ((com.payair.model.MediaContents) other).assets);
    }

    public final com.payair.model.MediaContents copy(java.util.List<com.payair.model.Asset> assets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assets, "");
        return new com.payair.model.MediaContents(assets);
    }

    public final java.util.List<com.payair.model.Asset> component1() {
        return this.assets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.payair.model.MediaContents copy$default(com.payair.model.MediaContents mediaContents, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = mediaContents.assets;
        }
        return mediaContents.copy(list);
    }
}
