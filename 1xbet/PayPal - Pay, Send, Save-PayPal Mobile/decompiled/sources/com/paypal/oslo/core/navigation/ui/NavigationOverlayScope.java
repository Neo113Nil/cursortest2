package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\u000bR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/navigation/ui/NavigationOverlayScope;", "", "", "isL1Visible", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "", "onNavigate", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "component1", "()Z", "component2", "()Lkotlin/jvm/functions/Function1;", "copy", "(ZLkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/core/navigation/ui/NavigationOverlayScope;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lkotlin/jvm/functions/Function1;", "getOnNavigate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class NavigationOverlayScope {
    public static final int $stable = 0;
    private final boolean isL1Visible;
    private final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> onNavigate;

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationOverlayScope(boolean z, kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.isL1Visible = z;
        this.onNavigate = function1;
    }

    public final boolean isL1Visible() {
        return this.isL1Visible;
    }

    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> getOnNavigate() {
        return this.onNavigate;
    }

    public final java.lang.String toString() {
        boolean z = this.isL1Visible;
        kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> function1 = this.onNavigate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationOverlayScope(isL1Visible=");
        sb.append(z);
        sb.append(", onNavigate=");
        sb.append(function1);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.isL1Visible) * 31) + this.onNavigate.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.navigation.ui.NavigationOverlayScope)) {
            return false;
        }
        com.paypal.oslo.core.navigation.ui.NavigationOverlayScope navigationOverlayScope = (com.paypal.oslo.core.navigation.ui.NavigationOverlayScope) other;
        return this.isL1Visible == navigationOverlayScope.isL1Visible && kotlin.jvm.internal.Intrinsics.areEqual(this.onNavigate, navigationOverlayScope.onNavigate);
    }

    public final com.paypal.oslo.core.navigation.ui.NavigationOverlayScope copy(boolean isL1Visible, kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> onNavigate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNavigate, "");
        return new com.paypal.oslo.core.navigation.ui.NavigationOverlayScope(isL1Visible, onNavigate);
    }

    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.NavKey, kotlin.Unit> component2() {
        return this.onNavigate;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsL1Visible() {
        return this.isL1Visible;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.navigation.ui.NavigationOverlayScope copy$default(com.paypal.oslo.core.navigation.ui.NavigationOverlayScope navigationOverlayScope, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = navigationOverlayScope.isL1Visible;
        }
        if ((i & 2) != 0) {
            function1 = navigationOverlayScope.onNavigate;
        }
        return navigationOverlayScope.copy(z, function1);
    }
}
