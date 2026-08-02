package com.paypal.oslo.feature.home.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\b\u001c\u001d\u001e\u001f !\"#B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "personalizationTrackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$NbaContent;", "nbaContent", "<init>", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$NbaContent;)V", "component1", "()Ljava/lang/Object;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$NbaContent;", "copy", "(Ljava/lang/Object;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$NbaContent;)Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getPersonalizationTrackingId", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$NbaContent;", "getNbaContent", "NbaContent", "Cta", "DescriptorAvatar", "OnURLIcon", "OnEmojiIcon", "VisualAsset", "OnURLIcon1", "OnEmojiIcon1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NBAContentComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent nbaContent;
    private final java.lang.Object personalizationTrackingId;

    public NBAContentComponentFragment(java.lang.Object obj, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent nbaContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nbaContent, "");
        this.personalizationTrackingId = obj;
        this.nbaContent = nbaContent;
    }

    public final java.lang.Object getPersonalizationTrackingId() {
        return this.personalizationTrackingId;
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent getNbaContent() {
        return this.nbaContent;
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJp\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b-\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b.\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b/\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b0\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$NbaContent;", "", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$Cta;", "cta", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$DescriptorAvatar;", "descriptorAvatars", "id", "subDescription", "subtitle", "title", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$VisualAsset;", "visualAsset", "<init>", "(Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$Cta;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$VisualAsset;)V", "component1", "()Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$Cta;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$VisualAsset;", "copy", "(Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$Cta;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$VisualAsset;)Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$NbaContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$Cta;", "getCta", "Ljava/lang/String;", "getDescription", "Ljava/util/List;", "getDescriptorAvatars", "getId", "getSubDescription", "getSubtitle", "getTitle", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$VisualAsset;", "getVisualAsset"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NbaContent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta;
        private final java.lang.String description;
        private final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar> descriptorAvatars;
        private final java.lang.String id;
        private final java.lang.String subDescription;
        private final java.lang.String subtitle;
        private final java.lang.String title;
        private final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset visualAsset;

        public NbaContent(com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta, java.lang.String str, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar> list, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset visualAsset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualAsset, "");
            this.cta = cta;
            this.description = str;
            this.descriptorAvatars = list;
            this.id = str2;
            this.subDescription = str3;
            this.subtitle = str4;
            this.title = str5;
            this.visualAsset = visualAsset;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta getCta() {
            return this.cta;
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar> getDescriptorAvatars() {
            return this.descriptorAvatars;
        }

        public final java.lang.String getId() {
            return this.id;
        }

        public final java.lang.String getSubDescription() {
            return this.subDescription;
        }

        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        public final java.lang.String getTitle() {
            return this.title;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset getVisualAsset() {
            return this.visualAsset;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta = this.cta;
            java.lang.String str = this.description;
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar> list = this.descriptorAvatars;
            java.lang.String str2 = this.id;
            java.lang.String str3 = this.subDescription;
            java.lang.String str4 = this.subtitle;
            java.lang.String str5 = this.title;
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset visualAsset = this.visualAsset;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NbaContent(cta=");
            sb.append(cta);
            sb.append(", description=");
            sb.append(str);
            sb.append(", descriptorAvatars=");
            sb.append(list);
            sb.append(", id=");
            sb.append(str2);
            sb.append(", subDescription=");
            sb.append(str3);
            sb.append(", subtitle=");
            sb.append(str4);
            sb.append(", title=");
            sb.append(str5);
            sb.append(", visualAsset=");
            sb.append(visualAsset);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta = this.cta;
            int hashCode = cta == null ? 0 : cta.hashCode();
            java.lang.String str = this.description;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.util.List<com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar> list = this.descriptorAvatars;
            int hashCode3 = list == null ? 0 : list.hashCode();
            int hashCode4 = this.id.hashCode();
            java.lang.String str2 = this.subDescription;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.subtitle;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.title.hashCode()) * 31) + this.visualAsset.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent nbaContent = (com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cta, nbaContent.cta) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, nbaContent.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptorAvatars, nbaContent.descriptorAvatars) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, nbaContent.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.subDescription, nbaContent.subDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, nbaContent.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, nbaContent.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.visualAsset, nbaContent.visualAsset);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent copy(com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta, java.lang.String description, java.util.List<com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar> descriptorAvatars, java.lang.String id, java.lang.String subDescription, java.lang.String subtitle, java.lang.String title, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset visualAsset) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visualAsset, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent(cta, description, descriptorAvatars, id, subDescription, subtitle, title, visualAsset);
        }

        /* renamed from: component8, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset getVisualAsset() {
            return this.visualAsset;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getTitle() {
            return this.title;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSubDescription() {
            return this.subDescription;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getId() {
            return this.id;
        }

        public final java.util.List<com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar> component3() {
            return this.descriptorAvatars;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta getCta() {
            return this.cta;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJJ\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$Cta;", "", "", "alt", "text", "url", "Lcom/paypal/oslo/api/graphql/schema/type/CTAType;", "type", "nativeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CTAType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/CTAType;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lcom/paypal/oslo/api/graphql/schema/type/CTAType;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$Cta;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAlt", "getText", "Ljava/lang/Object;", "getUrl", "Lcom/paypal/oslo/api/graphql/schema/type/CTAType;", "getType", "getNativeId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cta {
        public static final int $stable = 8;
        private final java.lang.String alt;
        private final java.lang.String nativeId;
        private final java.lang.String text;
        private final com.paypal.oslo.api.graphql.schema.type.CTAType type;
        private final java.lang.Object url;

        public Cta(java.lang.String str, java.lang.String str2, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CTAType cTAType, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cTAType, "");
            this.alt = str;
            this.text = str2;
            this.url = obj;
            this.type = cTAType;
            this.nativeId = str3;
        }

        public final java.lang.String getAlt() {
            return this.alt;
        }

        public final java.lang.String getText() {
            return this.text;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final com.paypal.oslo.api.graphql.schema.type.CTAType getType() {
            return this.type;
        }

        public final java.lang.String getNativeId() {
            return this.nativeId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.alt;
            java.lang.String str2 = this.text;
            java.lang.Object obj = this.url;
            com.paypal.oslo.api.graphql.schema.type.CTAType cTAType = this.type;
            java.lang.String str3 = this.nativeId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cta(alt=");
            sb.append(str);
            sb.append(", text=");
            sb.append(str2);
            sb.append(", url=");
            sb.append(obj);
            sb.append(", type=");
            sb.append(cTAType);
            sb.append(", nativeId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.alt;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.text;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.Object obj = this.url;
            int hashCode3 = obj == null ? 0 : obj.hashCode();
            int hashCode4 = this.type.hashCode();
            java.lang.String str3 = this.nativeId;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta = (com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.alt, cta.alt) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, cta.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, cta.url) && this.type == cta.type && kotlin.jvm.internal.Intrinsics.areEqual(this.nativeId, cta.nativeId);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta copy(java.lang.String alt, java.lang.String text, java.lang.Object url, com.paypal.oslo.api.graphql.schema.type.CTAType type, java.lang.String nativeId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta(alt, text, url, type, nativeId);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getNativeId() {
            return this.nativeId;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.api.graphql.schema.type.CTAType getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getText() {
            return this.text;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAlt() {
            return this.alt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta copy$default(com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.Cta cta, java.lang.String str, java.lang.String str2, java.lang.Object obj, com.paypal.oslo.api.graphql.schema.type.CTAType cTAType, java.lang.String str3, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = cta.alt;
            }
            if ((i & 2) != 0) {
                str2 = cta.text;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                obj = cta.url;
            }
            java.lang.Object obj3 = obj;
            if ((i & 8) != 0) {
                cTAType = cta.type;
            }
            com.paypal.oslo.api.graphql.schema.type.CTAType cTAType2 = cTAType;
            if ((i & 16) != 0) {
                str3 = cta.nativeId;
            }
            return cta.copy(str, str4, obj3, cTAType2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$DescriptorAvatar;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon;", "onURLIcon", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon;", "onEmojiIcon", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon;)Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$DescriptorAvatar;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon;", "getOnURLIcon", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon;", "getOnEmojiIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DescriptorAvatar {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon onEmojiIcon;
        private final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon onURLIcon;

        public DescriptorAvatar(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon onURLIcon, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon onEmojiIcon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onURLIcon = onURLIcon;
            this.onEmojiIcon = onEmojiIcon;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon getOnURLIcon() {
            return this.onURLIcon;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon getOnEmojiIcon() {
            return this.onEmojiIcon;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon onURLIcon = this.onURLIcon;
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon onEmojiIcon = this.onEmojiIcon;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DescriptorAvatar(__typename=");
            sb.append(str);
            sb.append(", onURLIcon=");
            sb.append(onURLIcon);
            sb.append(", onEmojiIcon=");
            sb.append(onEmojiIcon);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon onURLIcon = this.onURLIcon;
            int hashCode2 = onURLIcon == null ? 0 : onURLIcon.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon onEmojiIcon = this.onEmojiIcon;
            return (((hashCode * 31) + hashCode2) * 31) + (onEmojiIcon != null ? onEmojiIcon.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar descriptorAvatar = (com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, descriptorAvatar.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onURLIcon, descriptorAvatar.onURLIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEmojiIcon, descriptorAvatar.onEmojiIcon);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon onURLIcon, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon onEmojiIcon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar(__typename, onURLIcon, onEmojiIcon);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon getOnEmojiIcon() {
            return this.onEmojiIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon getOnURLIcon() {
            return this.onURLIcon;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar copy$default(com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.DescriptorAvatar descriptorAvatar, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon onURLIcon, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon onEmojiIcon, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = descriptorAvatar.__typename;
            }
            if ((i & 2) != 0) {
                onURLIcon = descriptorAvatar.onURLIcon;
            }
            if ((i & 4) != 0) {
                onEmojiIcon = descriptorAvatar.onEmojiIcon;
            }
            return descriptorAvatar.copy(str, onURLIcon, onEmojiIcon);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon;", "", "", "alt", "url", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAlt", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnURLIcon {
        public static final int $stable = 8;
        private final java.lang.String alt;
        private final java.lang.Object url;

        public OnURLIcon(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.alt = str;
            this.url = obj;
        }

        public final java.lang.String getAlt() {
            return this.alt;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.alt;
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnURLIcon(alt=");
            sb.append(str);
            sb.append(", url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.alt;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon onURLIcon = (com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.alt, onURLIcon.alt) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, onURLIcon.url);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon copy(java.lang.String alt, java.lang.Object url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon(alt, url);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAlt() {
            return this.alt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon copy$default(com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon onURLIcon, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onURLIcon.alt;
            }
            if ((i & 2) != 0) {
                obj = onURLIcon.url;
            }
            return onURLIcon.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon;", "", "", "emoji", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmoji", "getLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEmojiIcon {
        public static final int $stable = 0;
        private final java.lang.String emoji;
        private final java.lang.String label;

        public OnEmojiIcon(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.emoji = str;
            this.label = str2;
        }

        public final java.lang.String getEmoji() {
            return this.emoji;
        }

        public final java.lang.String getLabel() {
            return this.label;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.emoji;
            java.lang.String str2 = this.label;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEmojiIcon(emoji=");
            sb.append(str);
            sb.append(", label=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.emoji.hashCode();
            java.lang.String str = this.label;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon onEmojiIcon = (com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.emoji, onEmojiIcon.emoji) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, onEmojiIcon.label);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon copy(java.lang.String emoji, java.lang.String label) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emoji, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon(emoji, label);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLabel() {
            return this.label;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmoji() {
            return this.emoji;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon copy$default(com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon onEmojiIcon, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onEmojiIcon.emoji;
            }
            if ((i & 2) != 0) {
                str2 = onEmojiIcon.label;
            }
            return onEmojiIcon.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$VisualAsset;", "", "", "__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon1;", "onURLIcon", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon1;", "onEmojiIcon", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon1;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon1;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon1;", "component3", "()Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon1;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon1;Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon1;)Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$VisualAsset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon1;", "getOnURLIcon", "Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon1;", "getOnEmojiIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VisualAsset {
        public static final int $stable = 8;
        private final java.lang.String __typename;
        private final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 onEmojiIcon;
        private final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 onURLIcon;

        public VisualAsset(java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 onURLIcon1, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 onEmojiIcon1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.__typename = str;
            this.onURLIcon = onURLIcon1;
            this.onEmojiIcon = onEmojiIcon1;
        }

        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 getOnURLIcon() {
            return this.onURLIcon;
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 getOnEmojiIcon() {
            return this.onEmojiIcon;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.__typename;
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 onURLIcon1 = this.onURLIcon;
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 onEmojiIcon1 = this.onEmojiIcon;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VisualAsset(__typename=");
            sb.append(str);
            sb.append(", onURLIcon=");
            sb.append(onURLIcon1);
            sb.append(", onEmojiIcon=");
            sb.append(onEmojiIcon1);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.__typename.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 onURLIcon1 = this.onURLIcon;
            int hashCode2 = onURLIcon1 == null ? 0 : onURLIcon1.hashCode();
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 onEmojiIcon1 = this.onEmojiIcon;
            return (((hashCode * 31) + hashCode2) * 31) + (onEmojiIcon1 != null ? onEmojiIcon1.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset visualAsset = (com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, visualAsset.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onURLIcon, visualAsset.onURLIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.onEmojiIcon, visualAsset.onEmojiIcon);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset copy(java.lang.String __typename, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 onURLIcon, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 onEmojiIcon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset(__typename, onURLIcon, onEmojiIcon);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 getOnEmojiIcon() {
            return this.onEmojiIcon;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 getOnURLIcon() {
            return this.onURLIcon;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String get__typename() {
            return this.__typename;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset copy$default(com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.VisualAsset visualAsset, java.lang.String str, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 onURLIcon1, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 onEmojiIcon1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = visualAsset.__typename;
            }
            if ((i & 2) != 0) {
                onURLIcon1 = visualAsset.onURLIcon;
            }
            if ((i & 4) != 0) {
                onEmojiIcon1 = visualAsset.onEmojiIcon;
            }
            return visualAsset.copy(str, onURLIcon1, onEmojiIcon1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon1;", "", "", "alt", "url", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnURLIcon1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAlt", "Ljava/lang/Object;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnURLIcon1 {
        public static final int $stable = 8;
        private final java.lang.String alt;
        private final java.lang.Object url;

        public OnURLIcon1(java.lang.String str, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            this.alt = str;
            this.url = obj;
        }

        public final java.lang.String getAlt() {
            return this.alt;
        }

        public final java.lang.Object getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.alt;
            java.lang.Object obj = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnURLIcon1(alt=");
            sb.append(str);
            sb.append(", url=");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.alt;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 onURLIcon1 = (com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.alt, onURLIcon1.alt) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, onURLIcon1.url);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 copy(java.lang.String alt, java.lang.Object url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1(alt, url);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Object getUrl() {
            return this.url;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAlt() {
            return this.alt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 copy$default(com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnURLIcon1 onURLIcon1, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = onURLIcon1.alt;
            }
            if ((i & 2) != 0) {
                obj = onURLIcon1.url;
            }
            return onURLIcon1.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon1;", "", "", "emoji", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/home/graphql/fragment/NBAContentComponentFragment$OnEmojiIcon1;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmoji", "getLabel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnEmojiIcon1 {
        public static final int $stable = 0;
        private final java.lang.String emoji;
        private final java.lang.String label;

        public OnEmojiIcon1(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.emoji = str;
            this.label = str2;
        }

        public final java.lang.String getEmoji() {
            return this.emoji;
        }

        public final java.lang.String getLabel() {
            return this.label;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.emoji;
            java.lang.String str2 = this.label;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnEmojiIcon1(emoji=");
            sb.append(str);
            sb.append(", label=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.emoji.hashCode();
            java.lang.String str = this.label;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1)) {
                return false;
            }
            com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 onEmojiIcon1 = (com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.emoji, onEmojiIcon1.emoji) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, onEmojiIcon1.label);
        }

        public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 copy(java.lang.String emoji, java.lang.String label) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emoji, "");
            return new com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1(emoji, label);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getLabel() {
            return this.label;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmoji() {
            return this.emoji;
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 copy$default(com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.OnEmojiIcon1 onEmojiIcon1, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onEmojiIcon1.emoji;
            }
            if ((i & 2) != 0) {
                str2 = onEmojiIcon1.label;
            }
            return onEmojiIcon1.copy(str, str2);
        }
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.personalizationTrackingId;
        com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent nbaContent = this.nbaContent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NBAContentComponentFragment(personalizationTrackingId=");
        sb.append(obj);
        sb.append(", nbaContent=");
        sb.append(nbaContent);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Object obj = this.personalizationTrackingId;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.nbaContent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment nBAContentComponentFragment = (com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.personalizationTrackingId, nBAContentComponentFragment.personalizationTrackingId) && kotlin.jvm.internal.Intrinsics.areEqual(this.nbaContent, nBAContentComponentFragment.nbaContent);
    }

    public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment copy(java.lang.Object personalizationTrackingId, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent nbaContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nbaContent, "");
        return new com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment(personalizationTrackingId, nbaContent);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent getNbaContent() {
        return this.nbaContent;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getPersonalizationTrackingId() {
        return this.personalizationTrackingId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment copy$default(com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment nBAContentComponentFragment, java.lang.Object obj, com.paypal.oslo.feature.home.graphql.fragment.NBAContentComponentFragment.NbaContent nbaContent, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = nBAContentComponentFragment.personalizationTrackingId;
        }
        if ((i & 2) != 0) {
            nbaContent = nBAContentComponentFragment.nbaContent;
        }
        return nBAContentComponentFragment.copy(obj, nbaContent);
    }
}
