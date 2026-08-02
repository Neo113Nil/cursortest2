package com.paypal.oslo.feature.qrc.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/ContingencyFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeContingencyType;", "type", "", "Lcom/paypal/oslo/feature/qrc/graphql/fragment/ContingencyFragment$Link;", "links", "<init>", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeContingencyType;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeContingencyType;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeContingencyType;Ljava/util/List;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/ContingencyFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/qrc/graphql/type/QRCodeContingencyType;", "getType", "Ljava/util/List;", "getLinks", com.google.common.net.HttpHeaders.LINK}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ContingencyFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link> links;
    private final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType type;

    public ContingencyFragment(com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType, java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qRCodeContingencyType, "");
        this.type = qRCodeContingencyType;
        this.links = list;
    }

    public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType getType() {
        return this.type;
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link> getLinks() {
        return this.links;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/graphql/fragment/ContingencyFragment$Link;", "", "", "url", "", "openExternal", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/qrc/graphql/fragment/ContingencyFragment$Link;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Ljava/lang/Boolean;", "getOpenExternal"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Link {
        public static final int $stable = 0;
        private final java.lang.Boolean openExternal;
        private final java.lang.String url;

        public Link(java.lang.String str, java.lang.Boolean bool) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.openExternal = bool;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.Boolean getOpenExternal() {
            return this.openExternal;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.Boolean bool = this.openExternal;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Link(url=");
            sb.append(str);
            sb.append(", openExternal=");
            sb.append(bool);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            java.lang.Boolean bool = this.openExternal;
            return (hashCode * 31) + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link)) {
                return false;
            }
            com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link link = (com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, link.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.openExternal, link.openExternal);
        }

        public final com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link copy(java.lang.String url, java.lang.Boolean openExternal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link(url, openExternal);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Boolean getOpenExternal() {
            return this.openExternal;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link link, java.lang.String str, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = link.url;
            }
            if ((i & 2) != 0) {
                bool = link.openExternal;
            }
            return link.copy(str, bool);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType = this.type;
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link> list = this.links;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContingencyFragment(type=");
        sb.append(qRCodeContingencyType);
        sb.append(", links=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link> list = this.links;
        return (hashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment contingencyFragment = (com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment) other;
        return this.type == contingencyFragment.type && kotlin.jvm.internal.Intrinsics.areEqual(this.links, contingencyFragment.links);
    }

    public final com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment copy(com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType type, java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link> links) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment(type, links);
    }

    public final java.util.List<com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment.Link> component2() {
        return this.links;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment copy$default(com.paypal.oslo.feature.qrc.graphql.fragment.ContingencyFragment contingencyFragment, com.paypal.oslo.feature.qrc.graphql.type.QRCodeContingencyType qRCodeContingencyType, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            qRCodeContingencyType = contingencyFragment.type;
        }
        if ((i & 2) != 0) {
            list = contingencyFragment.links;
        }
        return contingencyFragment.copy(qRCodeContingencyType, list);
    }
}
