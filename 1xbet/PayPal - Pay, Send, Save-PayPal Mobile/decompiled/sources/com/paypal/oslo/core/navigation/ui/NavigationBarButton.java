package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/navigation/ui/NavigationBarButton;", "", "Lkotlin/Function0;", "", "action", "", "contentDescription", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "component1", "()Lkotlin/jvm/functions/Function0;", "component2", "()Ljava/lang/String;", "copy", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lcom/paypal/oslo/core/navigation/ui/NavigationBarButton;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lkotlin/jvm/functions/Function0;", "getAction", "Ljava/lang/String;", "getContentDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class NavigationBarButton {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> action;
    private final java.lang.String contentDescription;

    public NavigationBarButton(kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.action = function0;
        this.contentDescription = str;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getAction() {
        return this.action;
    }

    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.action;
        java.lang.String str = this.contentDescription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationBarButton(action=");
        sb.append(function0);
        sb.append(", contentDescription=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.action.hashCode() * 31) + this.contentDescription.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.navigation.ui.NavigationBarButton)) {
            return false;
        }
        com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton = (com.paypal.oslo.core.navigation.ui.NavigationBarButton) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.action, navigationBarButton.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentDescription, navigationBarButton.contentDescription);
    }

    public final com.paypal.oslo.core.navigation.ui.NavigationBarButton copy(kotlin.jvm.functions.Function0<kotlin.Unit> action, java.lang.String contentDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentDescription, "");
        return new com.paypal.oslo.core.navigation.ui.NavigationBarButton(action, contentDescription);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component1() {
        return this.action;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.navigation.ui.NavigationBarButton copy$default(com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton, kotlin.jvm.functions.Function0 function0, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = navigationBarButton.action;
        }
        if ((i & 2) != 0) {
            str = navigationBarButton.contentDescription;
        }
        return navigationBarButton.copy(function0, str);
    }
}
