package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/pds/components/MenuSection;", "", "", "Lcom/paypal/pds/components/MenuItem;", "items", "", "title", "key", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/pds/components/MenuSection;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getTitle", "Ljava/lang/Object;", "getKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MenuSection {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.pds.components.MenuItem> items;
    private final java.lang.Object key;
    private final java.lang.String title;

    public MenuSection(java.util.List<com.paypal.pds.components.MenuItem> list, java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.items = list;
        this.title = str;
        this.key = obj;
    }

    public /* synthetic */ MenuSection(java.util.List list, java.lang.String str, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? null : obj);
    }

    public final java.util.List<com.paypal.pds.components.MenuItem> getItems() {
        return this.items;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.Object getKey() {
        return this.key;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.pds.components.MenuItem> list = this.items;
        java.lang.String str = this.title;
        java.lang.Object obj = this.key;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MenuSection(items=");
        sb.append(list);
        sb.append(", title=");
        sb.append(str);
        sb.append(", key=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode();
        int hashCode2 = this.title.hashCode();
        java.lang.Object obj = this.key;
        return (((hashCode * 31) + hashCode2) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.MenuSection)) {
            return false;
        }
        com.paypal.pds.components.MenuSection menuSection = (com.paypal.pds.components.MenuSection) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.items, menuSection.items) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, menuSection.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.key, menuSection.key);
    }

    public final com.paypal.pds.components.MenuSection copy(java.util.List<com.paypal.pds.components.MenuItem> items, java.lang.String title, java.lang.Object key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.pds.components.MenuSection(items, title, key);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.util.List<com.paypal.pds.components.MenuItem> component1() {
        return this.items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.pds.components.MenuSection copy$default(com.paypal.pds.components.MenuSection menuSection, java.util.List list, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            list = menuSection.items;
        }
        if ((i & 2) != 0) {
            str = menuSection.title;
        }
        if ((i & 4) != 0) {
            obj = menuSection.key;
        }
        return menuSection.copy(list, str, obj);
    }
}
