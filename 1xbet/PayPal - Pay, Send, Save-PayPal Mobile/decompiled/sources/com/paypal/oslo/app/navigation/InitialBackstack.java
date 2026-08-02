package com.paypal.oslo.app.navigation;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/app/navigation/InitialBackstack;", "", "", "Landroidx/navigation3/runtime/NavKey;", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "deeplinkDestination", "<init>", "(Ljava/util/List;Landroidx/navigation3/runtime/NavKey;)V", "component1", "()Ljava/util/List;", "component2", "()Landroidx/navigation3/runtime/NavKey;", "copy", "(Ljava/util/List;Landroidx/navigation3/runtime/NavKey;)Lcom/paypal/oslo/app/navigation/InitialBackstack;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getStack", "Landroidx/navigation3/runtime/NavKey;", "getDeeplinkDestination", "isDeepLink", "Z", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InitialBackstack {
    public static final int $stable = 8;
    private final androidx.navigation3.runtime.NavKey deeplinkDestination;
    private final boolean isDeepLink;
    private final java.util.List<androidx.navigation3.runtime.NavKey> stack;

    /* JADX WARN: Multi-variable type inference failed */
    public InitialBackstack(java.util.List<? extends androidx.navigation3.runtime.NavKey> list, androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.stack = list;
        this.deeplinkDestination = navKey;
        this.isDeepLink = navKey != null;
    }

    public /* synthetic */ InitialBackstack(java.util.List list, androidx.navigation3.runtime.NavKey navKey, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : navKey);
    }

    public final java.util.List<androidx.navigation3.runtime.NavKey> getStack() {
        return this.stack;
    }

    public final androidx.navigation3.runtime.NavKey getDeeplinkDestination() {
        return this.deeplinkDestination;
    }

    /* renamed from: isDeepLink, reason: from getter */
    public final boolean getIsDeepLink() {
        return this.isDeepLink;
    }

    public final java.lang.String toString() {
        java.util.List<androidx.navigation3.runtime.NavKey> list = this.stack;
        androidx.navigation3.runtime.NavKey navKey = this.deeplinkDestination;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitialBackstack(stack=");
        sb.append(list);
        sb.append(", deeplinkDestination=");
        sb.append(navKey);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.stack.hashCode();
        androidx.navigation3.runtime.NavKey navKey = this.deeplinkDestination;
        return (hashCode * 31) + (navKey == null ? 0 : navKey.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.app.navigation.InitialBackstack)) {
            return false;
        }
        com.paypal.oslo.app.navigation.InitialBackstack initialBackstack = (com.paypal.oslo.app.navigation.InitialBackstack) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.stack, initialBackstack.stack) && kotlin.jvm.internal.Intrinsics.areEqual(this.deeplinkDestination, initialBackstack.deeplinkDestination);
    }

    public final com.paypal.oslo.app.navigation.InitialBackstack copy(java.util.List<? extends androidx.navigation3.runtime.NavKey> stack, androidx.navigation3.runtime.NavKey deeplinkDestination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stack, "");
        return new com.paypal.oslo.app.navigation.InitialBackstack(stack, deeplinkDestination);
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.navigation3.runtime.NavKey getDeeplinkDestination() {
        return this.deeplinkDestination;
    }

    public final java.util.List<androidx.navigation3.runtime.NavKey> component1() {
        return this.stack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.app.navigation.InitialBackstack copy$default(com.paypal.oslo.app.navigation.InitialBackstack initialBackstack, java.util.List list, androidx.navigation3.runtime.NavKey navKey, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = initialBackstack.stack;
        }
        if ((i & 2) != 0) {
            navKey = initialBackstack.deeplinkDestination;
        }
        return initialBackstack.copy(list, navKey);
    }
}
