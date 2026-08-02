package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/navigation/ui/NavigationBarConfig;", "", "", "title", "Lcom/paypal/oslo/core/navigation/ui/NavigationBarButton;", "backButton", "closeButton", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/ui/NavigationBarButton;Lcom/paypal/oslo/core/navigation/ui/NavigationBarButton;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/navigation/ui/NavigationBarButton;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/ui/NavigationBarButton;Lcom/paypal/oslo/core/navigation/ui/NavigationBarButton;)Lcom/paypal/oslo/core/navigation/ui/NavigationBarConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "Lcom/paypal/oslo/core/navigation/ui/NavigationBarButton;", "getBackButton", "getCloseButton"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class NavigationBarConfig {
    public static final int $stable = 0;
    private final com.paypal.oslo.core.navigation.ui.NavigationBarButton backButton;
    private final com.paypal.oslo.core.navigation.ui.NavigationBarButton closeButton;
    private final java.lang.String title;

    public NavigationBarConfig(java.lang.String str, com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton, com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton2) {
        this.title = str;
        this.backButton = navigationBarButton;
        this.closeButton = navigationBarButton2;
    }

    public /* synthetic */ NavigationBarConfig(java.lang.String str, com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton, com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : navigationBarButton, (i & 4) != 0 ? null : navigationBarButton2);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.core.navigation.ui.NavigationBarButton getBackButton() {
        return this.backButton;
    }

    public final com.paypal.oslo.core.navigation.ui.NavigationBarButton getCloseButton() {
        return this.closeButton;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton = this.backButton;
        com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton2 = this.closeButton;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationBarConfig(title=");
        sb.append(str);
        sb.append(", backButton=");
        sb.append(navigationBarButton);
        sb.append(", closeButton=");
        sb.append(navigationBarButton2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.title;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton = this.backButton;
        int hashCode2 = navigationBarButton == null ? 0 : navigationBarButton.hashCode();
        com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton2 = this.closeButton;
        return (((hashCode * 31) + hashCode2) * 31) + (navigationBarButton2 != null ? navigationBarButton2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.navigation.ui.NavigationBarConfig)) {
            return false;
        }
        com.paypal.oslo.core.navigation.ui.NavigationBarConfig navigationBarConfig = (com.paypal.oslo.core.navigation.ui.NavigationBarConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, navigationBarConfig.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.backButton, navigationBarConfig.backButton) && kotlin.jvm.internal.Intrinsics.areEqual(this.closeButton, navigationBarConfig.closeButton);
    }

    public final com.paypal.oslo.core.navigation.ui.NavigationBarConfig copy(java.lang.String title, com.paypal.oslo.core.navigation.ui.NavigationBarButton backButton, com.paypal.oslo.core.navigation.ui.NavigationBarButton closeButton) {
        return new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(title, backButton, closeButton);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.navigation.ui.NavigationBarButton getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.navigation.ui.NavigationBarButton getBackButton() {
        return this.backButton;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.core.navigation.ui.NavigationBarConfig copy$default(com.paypal.oslo.core.navigation.ui.NavigationBarConfig navigationBarConfig, java.lang.String str, com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton, com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = navigationBarConfig.title;
        }
        if ((i & 2) != 0) {
            navigationBarButton = navigationBarConfig.backButton;
        }
        if ((i & 4) != 0) {
            navigationBarButton2 = navigationBarConfig.closeButton;
        }
        return navigationBarConfig.copy(str, navigationBarButton, navigationBarButton2);
    }

    public NavigationBarConfig() {
        this(null, null, null, 7, null);
    }
}
