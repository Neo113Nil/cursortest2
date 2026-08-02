package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/AlertConfig;", "", "", "alertMessage", "Lcom/paypal/pds/components/ContextualAlertStyle;", "alertStyle", "<init>", "(Ljava/lang/String;Lcom/paypal/pds/components/ContextualAlertStyle;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/pds/components/ContextualAlertStyle;", "copy", "(Ljava/lang/String;Lcom/paypal/pds/components/ContextualAlertStyle;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/AlertConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAlertMessage", "Lcom/paypal/pds/components/ContextualAlertStyle;", "getAlertStyle"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AlertConfig {
    public static final int $stable = com.paypal.pds.components.ContextualAlertStyle.$stable;
    private final java.lang.String alertMessage;
    private final com.paypal.pds.components.ContextualAlertStyle alertStyle;

    public AlertConfig(java.lang.String str, com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualAlertStyle, "");
        this.alertMessage = str;
        this.alertStyle = contextualAlertStyle;
    }

    public final java.lang.String getAlertMessage() {
        return this.alertMessage;
    }

    public /* synthetic */ AlertConfig(java.lang.String str, com.paypal.pds.components.ContextualAlertStyle.Negative negative, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE : negative);
    }

    public final com.paypal.pds.components.ContextualAlertStyle getAlertStyle() {
        return this.alertStyle;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.alertMessage;
        com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle = this.alertStyle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AlertConfig(alertMessage=");
        sb.append(str);
        sb.append(", alertStyle=");
        sb.append(contextualAlertStyle);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.alertMessage;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.alertStyle.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.alertMessage, alertConfig.alertMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.alertStyle, alertConfig.alertStyle);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig copy(java.lang.String alertMessage, com.paypal.pds.components.ContextualAlertStyle alertStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alertStyle, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig(alertMessage, alertStyle);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.components.ContextualAlertStyle getAlertStyle() {
        return this.alertStyle;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAlertMessage() {
        return this.alertMessage;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.AlertConfig alertConfig, java.lang.String str, com.paypal.pds.components.ContextualAlertStyle contextualAlertStyle, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = alertConfig.alertMessage;
        }
        if ((i & 2) != 0) {
            contextualAlertStyle = alertConfig.alertStyle;
        }
        return alertConfig.copy(str, contextualAlertStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlertConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
