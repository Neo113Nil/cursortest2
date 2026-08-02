package com.paypal.oslo.feature.taxanddocumentcenter.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuGroupDomain;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;", "title", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuItemDomain;", "menu", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;Ljava/util/List;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuGroupDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;", "getTitle", "Ljava/util/List;", "getMenu"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MenuGroupDomain {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain> menu;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource title;

    public MenuGroupDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textResource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.title = textResource;
        this.menu = list;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource getTitle() {
        return this.title;
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain> getMenu() {
        return this.menu;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource = this.title;
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain> list = this.menu;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MenuGroupDomain(title=");
        sb.append(textResource);
        sb.append(", menu=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.title.hashCode() * 31) + this.menu.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain menuGroupDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, menuGroupDomain.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.menu, menuGroupDomain.menu);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource title, java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain> menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain(title, menu);
    }

    public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain> component2() {
        return this.menu;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain menuGroupDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            textResource = menuGroupDomain.title;
        }
        if ((i & 2) != 0) {
            list = menuGroupDomain.menu;
        }
        return menuGroupDomain.copy(textResource, list);
    }
}
