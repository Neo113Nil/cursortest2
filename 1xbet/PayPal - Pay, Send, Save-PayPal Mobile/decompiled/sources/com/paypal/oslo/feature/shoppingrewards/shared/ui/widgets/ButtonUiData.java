package com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonUiData;", "", "", "label", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonToggleState;", "state", "<init>", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonToggleState;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/pds/core/Icon;", "component3", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonToggleState;", "copy", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonToggleState;)Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonUiData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel", "Lcom/paypal/pds/core/Icon;", "getIcon", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonToggleState;", "getState"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ButtonUiData {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String label;
    private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState state;

    public ButtonUiData(java.lang.String str, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState buttonToggleState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonToggleState, "");
        this.label = str;
        this.icon = icon;
        this.state = buttonToggleState;
    }

    public /* synthetic */ ButtonUiData(java.lang.String str, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState buttonToggleState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : icon, buttonToggleState);
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState getState() {
        return this.state;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.label;
        com.paypal.pds.core.Icon icon = this.icon;
        com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState buttonToggleState = this.state;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ButtonUiData(label=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(", state=");
        sb.append(buttonToggleState);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.label.hashCode();
        com.paypal.pds.core.Icon icon = this.icon;
        return (((hashCode * 31) + (icon == null ? 0 : icon.hashCode())) * 31) + this.state.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData buttonUiData = (com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, buttonUiData.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, buttonUiData.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, buttonUiData.state);
    }

    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData copy(java.lang.String label, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        return new com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData(label, icon, state);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData copy$default(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData buttonUiData, java.lang.String str, com.paypal.pds.core.Icon icon, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonToggleState buttonToggleState, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = buttonUiData.label;
        }
        if ((i & 2) != 0) {
            icon = buttonUiData.icon;
        }
        if ((i & 4) != 0) {
            buttonToggleState = buttonUiData.state;
        }
        return buttonUiData.copy(str, icon, buttonToggleState);
    }
}
