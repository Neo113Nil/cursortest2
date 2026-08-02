package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\"B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ImageActivityAvatarFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "url", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ImageActivityAvatarFragment$FallBackAvatar;", "fallBackAvatar", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityIconType;", "iconType", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/activity/graphql/fragment/ImageActivityAvatarFragment$FallBackAvatar;Lcom/paypal/oslo/api/graphql/schema/type/ActivityIconType;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ImageActivityAvatarFragment$FallBackAvatar;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/ActivityIconType;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/activity/graphql/fragment/ImageActivityAvatarFragment$FallBackAvatar;Lcom/paypal/oslo/api/graphql/schema/type/ActivityIconType;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ImageActivityAvatarFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getUrl", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ImageActivityAvatarFragment$FallBackAvatar;", "getFallBackAvatar", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityIconType;", "getIconType", "FallBackAvatar"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ImageActivityAvatarFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar fallBackAvatar;
    private final com.paypal.oslo.api.graphql.schema.type.ActivityIconType iconType;
    private final java.lang.Object url;

    public ImageActivityAvatarFragment(java.lang.Object obj, com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar fallBackAvatar, com.paypal.oslo.api.graphql.schema.type.ActivityIconType activityIconType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fallBackAvatar, "");
        this.url = obj;
        this.fallBackAvatar = fallBackAvatar;
        this.iconType = activityIconType;
    }

    public final java.lang.Object getUrl() {
        return this.url;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar getFallBackAvatar() {
        return this.fallBackAvatar;
    }

    public final com.paypal.oslo.api.graphql.schema.type.ActivityIconType getIconType() {
        return this.iconType;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ImageActivityAvatarFragment$FallBackAvatar;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ImageActivityAvatarFragment$FallBackAvatar;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FallBackAvatar {
        public static final int $stable = 0;
        private final java.lang.String name;

        public FallBackAvatar(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FallBackAvatar(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar) other).name);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar fallBackAvatar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = fallBackAvatar.name;
            }
            return fallBackAvatar.copy(str);
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.url;
        com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar fallBackAvatar = this.fallBackAvatar;
        com.paypal.oslo.api.graphql.schema.type.ActivityIconType activityIconType = this.iconType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageActivityAvatarFragment(url=");
        sb.append(obj);
        sb.append(", fallBackAvatar=");
        sb.append(fallBackAvatar);
        sb.append(", iconType=");
        sb.append(activityIconType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode();
        int hashCode2 = this.fallBackAvatar.hashCode();
        com.paypal.oslo.api.graphql.schema.type.ActivityIconType activityIconType = this.iconType;
        return (((hashCode * 31) + hashCode2) * 31) + (activityIconType == null ? 0 : activityIconType.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment imageActivityAvatarFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, imageActivityAvatarFragment.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.fallBackAvatar, imageActivityAvatarFragment.fallBackAvatar) && this.iconType == imageActivityAvatarFragment.iconType;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment copy(java.lang.Object url, com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar fallBackAvatar, com.paypal.oslo.api.graphql.schema.type.ActivityIconType iconType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fallBackAvatar, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment(url, fallBackAvatar, iconType);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.ActivityIconType getIconType() {
        return this.iconType;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar getFallBackAvatar() {
        return this.fallBackAvatar;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getUrl() {
        return this.url;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment imageActivityAvatarFragment, java.lang.Object obj, com.paypal.oslo.feature.activity.graphql.fragment.ImageActivityAvatarFragment.FallBackAvatar fallBackAvatar, com.paypal.oslo.api.graphql.schema.type.ActivityIconType activityIconType, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = imageActivityAvatarFragment.url;
        }
        if ((i & 2) != 0) {
            fallBackAvatar = imageActivityAvatarFragment.fallBackAvatar;
        }
        if ((i & 4) != 0) {
            activityIconType = imageActivityAvatarFragment.iconType;
        }
        return imageActivityAvatarFragment.copy(obj, fallBackAvatar, activityIconType);
    }
}
