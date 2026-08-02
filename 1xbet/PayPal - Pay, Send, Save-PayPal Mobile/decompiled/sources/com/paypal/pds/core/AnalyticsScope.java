package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/pds/core/AnalyticsScope;", "Lcom/paypal/pds/analytics/ModifierHolder;", "Landroidx/compose/ui/Modifier;", "modifier", "<init>", "(Landroidx/compose/ui/Modifier;)V", "component1", "()Landroidx/compose/ui/Modifier;", "copy", "(Landroidx/compose/ui/Modifier;)Lcom/paypal/pds/core/AnalyticsScope;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/Modifier;", "getModifier", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AnalyticsScope implements com.paypal.pds.analytics.ModifierHolder {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.pds.core.AnalyticsScope.Companion INSTANCE = new com.paypal.pds.core.AnalyticsScope.Companion(null);
    private static final com.paypal.pds.core.AnalyticsScope Empty = new com.paypal.pds.core.AnalyticsScope(androidx.compose.ui.Modifier.INSTANCE);
    private final androidx.compose.ui.Modifier modifier;

    public AnalyticsScope(androidx.compose.ui.Modifier modifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        this.modifier = modifier;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/pds/core/AnalyticsScope$Companion;", "", "<init>", "()V", "Lcom/paypal/pds/core/AnalyticsScope;", "Empty", "Lcom/paypal/pds/core/AnalyticsScope;", "getEmpty", "()Lcom/paypal/pds/core/AnalyticsScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.pds.core.AnalyticsScope getEmpty() {
            return com.paypal.pds.core.AnalyticsScope.Empty;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.paypal.pds.analytics.ModifierHolder
    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public final java.lang.String toString() {
        androidx.compose.ui.Modifier modifier = this.modifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnalyticsScope(modifier=");
        sb.append(modifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.modifier.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.pds.core.AnalyticsScope) && kotlin.jvm.internal.Intrinsics.areEqual(this.modifier, ((com.paypal.pds.core.AnalyticsScope) other).modifier);
    }

    public final com.paypal.pds.core.AnalyticsScope copy(androidx.compose.ui.Modifier modifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        return new com.paypal.pds.core.AnalyticsScope(modifier);
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.ui.Modifier getModifier() {
        return this.modifier;
    }

    public static /* synthetic */ com.paypal.pds.core.AnalyticsScope copy$default(com.paypal.pds.core.AnalyticsScope analyticsScope, androidx.compose.ui.Modifier modifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            modifier = analyticsScope.modifier;
        }
        return analyticsScope.copy(modifier);
    }
}
