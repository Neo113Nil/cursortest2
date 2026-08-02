package com.paypal.oslo.feature.helpcenter.ui.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage;", "Landroid/os/Parcelable;", "<init>", "()V", "ArticleDetail", "ArticleList", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage$ArticleDetail;", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage$ArticleList;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class StackPage implements android.os.Parcelable {
    public static final int $stable = 0;

    private StackPage() {
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage$ArticleDetail;", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage;", "", "articleId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage$ArticleDetail;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getArticleId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ArticleDetail extends com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail> CREATOR = new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail.Creator();
        private final java.lang.String articleId;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleDetail(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.articleId = str;
        }

        public final java.lang.String getArticleId() {
            return this.articleId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.articleId);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.articleId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ArticleDetail(articleId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.articleId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail) && kotlin.jvm.internal.Intrinsics.areEqual(this.articleId, ((com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail) other).articleId);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail[] newArray(int i) {
                return new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail(parcel.readString());
            }
        }

        public final com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail copy(java.lang.String articleId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(articleId, "");
            return new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail(articleId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getArticleId() {
            return this.articleId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail copy$default(com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail articleDetail, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = articleDetail.articleId;
            }
            return articleDetail.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage$ArticleList;", "Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage;", "", "productRefId", "pageRefId", "fieldRefId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/ui/navigation/StackPage$ArticleList;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getProductRefId", "getPageRefId", "getFieldRefId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ArticleList extends com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList> CREATOR = new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList.Creator();
        private final java.lang.String fieldRefId;
        private final java.lang.String pageRefId;
        private final java.lang.String productRefId;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArticleList(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.productRefId = str;
            this.pageRefId = str2;
            this.fieldRefId = str3;
        }

        public final java.lang.String getProductRefId() {
            return this.productRefId;
        }

        public final java.lang.String getPageRefId() {
            return this.pageRefId;
        }

        public final java.lang.String getFieldRefId() {
            return this.fieldRefId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.productRefId);
            dest.writeString(this.pageRefId);
            dest.writeString(this.fieldRefId);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.productRefId;
            java.lang.String str2 = this.pageRefId;
            java.lang.String str3 = this.fieldRefId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ArticleList(productRefId=");
            sb.append(str);
            sb.append(", pageRefId=");
            sb.append(str2);
            sb.append(", fieldRefId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.productRefId.hashCode() * 31) + this.pageRefId.hashCode()) * 31) + this.fieldRefId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList articleList = (com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.productRefId, articleList.productRefId) && kotlin.jvm.internal.Intrinsics.areEqual(this.pageRefId, articleList.pageRefId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fieldRefId, articleList.fieldRefId);
        }

        public final com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList copy(java.lang.String productRefId, java.lang.String pageRefId, java.lang.String fieldRefId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productRefId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageRefId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldRefId, "");
            return new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList(productRefId, pageRefId, fieldRefId);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList[] newArray(int i) {
                return new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList(parcel.readString(), parcel.readString(), parcel.readString());
            }
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFieldRefId() {
            return this.fieldRefId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPageRefId() {
            return this.pageRefId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getProductRefId() {
            return this.productRefId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList copy$default(com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList articleList, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = articleList.productRefId;
            }
            if ((i & 2) != 0) {
                str2 = articleList.pageRefId;
            }
            if ((i & 4) != 0) {
                str3 = articleList.fieldRefId;
            }
            return articleList.copy(str, str2, str3);
        }
    }

    public /* synthetic */ StackPage(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
