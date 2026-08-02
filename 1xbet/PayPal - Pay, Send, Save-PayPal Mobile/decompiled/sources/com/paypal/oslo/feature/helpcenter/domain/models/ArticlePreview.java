package com.paypal.oslo.feature.helpcenter.domain.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ<\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/domain/models/ArticlePreview;", "", "", "id", "title", "excerpt", "contentCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/domain/models/ArticlePreview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "getExcerpt", "getContentCategory"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ArticlePreview {
    public static final int $stable = 0;
    private final java.lang.String contentCategory;
    private final java.lang.String excerpt;
    private final java.lang.String id;
    private final java.lang.String title;

    public ArticlePreview(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.title = str2;
        this.excerpt = str3;
        this.contentCategory = str4;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getExcerpt() {
        return this.excerpt;
    }

    public final java.lang.String getContentCategory() {
        return this.contentCategory;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.excerpt;
        java.lang.String str4 = this.contentCategory;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ArticlePreview(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", excerpt=");
        sb.append(str3);
        sb.append(", contentCategory=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.title.hashCode();
        java.lang.String str = this.excerpt;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.contentCategory;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.helpcenter.domain.models.ArticlePreview)) {
            return false;
        }
        com.paypal.oslo.feature.helpcenter.domain.models.ArticlePreview articlePreview = (com.paypal.oslo.feature.helpcenter.domain.models.ArticlePreview) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, articlePreview.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, articlePreview.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.excerpt, articlePreview.excerpt) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentCategory, articlePreview.contentCategory);
    }

    public final com.paypal.oslo.feature.helpcenter.domain.models.ArticlePreview copy(java.lang.String id, java.lang.String title, java.lang.String excerpt, java.lang.String contentCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.helpcenter.domain.models.ArticlePreview(id, title, excerpt, contentCategory);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getContentCategory() {
        return this.contentCategory;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExcerpt() {
        return this.excerpt;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.domain.models.ArticlePreview copy$default(com.paypal.oslo.feature.helpcenter.domain.models.ArticlePreview articlePreview, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = articlePreview.id;
        }
        if ((i & 2) != 0) {
            str2 = articlePreview.title;
        }
        if ((i & 4) != 0) {
            str3 = articlePreview.excerpt;
        }
        if ((i & 8) != 0) {
            str4 = articlePreview.contentCategory;
        }
        return articlePreview.copy(str, str2, str3, str4);
    }
}
