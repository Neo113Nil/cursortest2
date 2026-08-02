package com.paypal.oslo.app.navigation;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/navigation/BottomNavUiConfig;", "", "", "Lcom/paypal/oslo/app/navigation/BottomNavUiItem;", "items", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/app/navigation/BottomNavUiConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getItems"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BottomNavUiConfig {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.app.navigation.BottomNavUiItem> items;

    public BottomNavUiConfig(java.util.List<com.paypal.oslo.app.navigation.BottomNavUiItem> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
    }

    public final java.util.List<com.paypal.oslo.app.navigation.BottomNavUiItem> getItems() {
        return this.items;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.app.navigation.BottomNavUiItem> list = this.items;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BottomNavUiConfig(items=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.items.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.app.navigation.BottomNavUiConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.items, ((com.paypal.oslo.app.navigation.BottomNavUiConfig) other).items);
    }

    public final com.paypal.oslo.app.navigation.BottomNavUiConfig copy(java.util.List<com.paypal.oslo.app.navigation.BottomNavUiItem> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        return new com.paypal.oslo.app.navigation.BottomNavUiConfig(items);
    }

    public final java.util.List<com.paypal.oslo.app.navigation.BottomNavUiItem> component1() {
        return this.items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.app.navigation.BottomNavUiConfig copy$default(com.paypal.oslo.app.navigation.BottomNavUiConfig bottomNavUiConfig, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = bottomNavUiConfig.items;
        }
        return bottomNavUiConfig.copy(list);
    }
}
