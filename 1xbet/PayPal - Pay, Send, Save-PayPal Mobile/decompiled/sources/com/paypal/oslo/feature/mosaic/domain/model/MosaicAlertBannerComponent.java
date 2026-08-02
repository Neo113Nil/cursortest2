package com.paypal.oslo.feature.mosaic.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicAlertBannerComponent;", "", "", "content", "id", "name", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageContextualAlertComponentType;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageContextualAlertComponentType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageContextualAlertComponentType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageContextualAlertComponentType;)Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicAlertBannerComponent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContent", "getId", "getName", "Lcom/paypal/oslo/api/graphql/schema/type/MosaicPageContextualAlertComponentType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MosaicAlertBannerComponent {
    public static final int $stable = 0;
    private final java.lang.String content;
    private final java.lang.String id;
    private final java.lang.String name;
    private final com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType type;

    public MosaicAlertBannerComponent(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType mosaicPageContextualAlertComponentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.content = str;
        this.id = str2;
        this.name = str3;
        this.type = mosaicPageContextualAlertComponentType;
    }

    public final java.lang.String getContent() {
        return this.content;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType getType() {
        return this.type;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.content;
        java.lang.String str2 = this.id;
        java.lang.String str3 = this.name;
        com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType mosaicPageContextualAlertComponentType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MosaicAlertBannerComponent(content=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", type=");
        sb.append(mosaicPageContextualAlertComponentType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.content.hashCode();
        int hashCode2 = this.id.hashCode();
        java.lang.String str = this.name;
        int hashCode3 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType mosaicPageContextualAlertComponentType = this.type;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (mosaicPageContextualAlertComponentType != null ? mosaicPageContextualAlertComponentType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.mosaic.domain.model.MosaicAlertBannerComponent)) {
            return false;
        }
        com.paypal.oslo.feature.mosaic.domain.model.MosaicAlertBannerComponent mosaicAlertBannerComponent = (com.paypal.oslo.feature.mosaic.domain.model.MosaicAlertBannerComponent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.content, mosaicAlertBannerComponent.content) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, mosaicAlertBannerComponent.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, mosaicAlertBannerComponent.name) && this.type == mosaicAlertBannerComponent.type;
    }

    public final com.paypal.oslo.feature.mosaic.domain.model.MosaicAlertBannerComponent copy(java.lang.String content, java.lang.String id, java.lang.String name2, com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.mosaic.domain.model.MosaicAlertBannerComponent(content, id, name2, type);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getContent() {
        return this.content;
    }

    public static /* synthetic */ com.paypal.oslo.feature.mosaic.domain.model.MosaicAlertBannerComponent copy$default(com.paypal.oslo.feature.mosaic.domain.model.MosaicAlertBannerComponent mosaicAlertBannerComponent, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.api.graphql.schema.type.MosaicPageContextualAlertComponentType mosaicPageContextualAlertComponentType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mosaicAlertBannerComponent.content;
        }
        if ((i & 2) != 0) {
            str2 = mosaicAlertBannerComponent.id;
        }
        if ((i & 4) != 0) {
            str3 = mosaicAlertBannerComponent.name;
        }
        if ((i & 8) != 0) {
            mosaicPageContextualAlertComponentType = mosaicAlertBannerComponent.type;
        }
        return mosaicAlertBannerComponent.copy(str, str2, str3, mosaicPageContextualAlertComponentType);
    }
}
