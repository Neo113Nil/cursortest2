package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/MdaProvider;", "provider", "", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "refUrl", "id", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/MdaProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/MdaProvider;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/MdaProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/MediaItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/domain/model/MdaProvider;", "getProvider", "Ljava/lang/String;", "getContentType", "getRefUrl", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MediaItem {
    public static final int $stable = 0;
    private final java.lang.String contentType;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.p2p.domain.model.MdaProvider provider;
    private final java.lang.String refUrl;

    public MediaItem(com.paypal.oslo.feature.p2p.domain.model.MdaProvider mdaProvider, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mdaProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.provider = mdaProvider;
        this.contentType = str;
        this.refUrl = str2;
        this.id = str3;
    }

    public /* synthetic */ MediaItem(com.paypal.oslo.feature.p2p.domain.model.MdaProvider mdaProvider, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mdaProvider, str, (i & 4) != 0 ? null : str2, str3);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.MdaProvider getProvider() {
        return this.provider;
    }

    public final java.lang.String getContentType() {
        return this.contentType;
    }

    public final java.lang.String getRefUrl() {
        return this.refUrl;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.p2p.domain.model.MdaProvider mdaProvider = this.provider;
        java.lang.String str = this.contentType;
        java.lang.String str2 = this.refUrl;
        java.lang.String str3 = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaItem(provider=");
        sb.append(mdaProvider);
        sb.append(", contentType=");
        sb.append(str);
        sb.append(", refUrl=");
        sb.append(str2);
        sb.append(", id=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.provider.hashCode();
        int hashCode2 = this.contentType.hashCode();
        java.lang.String str = this.refUrl;
        return (((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.id.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.MediaItem)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem = (com.paypal.oslo.feature.p2p.domain.model.MediaItem) other;
        return this.provider == mediaItem.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.contentType, mediaItem.contentType) && kotlin.jvm.internal.Intrinsics.areEqual(this.refUrl, mediaItem.refUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, mediaItem.id);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.MediaItem copy(com.paypal.oslo.feature.p2p.domain.model.MdaProvider provider, java.lang.String contentType, java.lang.String refUrl, java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.p2p.domain.model.MediaItem(provider, contentType, refUrl, id);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getRefUrl() {
        return this.refUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getContentType() {
        return this.contentType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.MdaProvider getProvider() {
        return this.provider;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.MediaItem copy$default(com.paypal.oslo.feature.p2p.domain.model.MediaItem mediaItem, com.paypal.oslo.feature.p2p.domain.model.MdaProvider mdaProvider, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            mdaProvider = mediaItem.provider;
        }
        if ((i & 2) != 0) {
            str = mediaItem.contentType;
        }
        if ((i & 4) != 0) {
            str2 = mediaItem.refUrl;
        }
        if ((i & 8) != 0) {
            str3 = mediaItem.id;
        }
        return mediaItem.copy(mdaProvider, str, str2, str3);
    }
}
