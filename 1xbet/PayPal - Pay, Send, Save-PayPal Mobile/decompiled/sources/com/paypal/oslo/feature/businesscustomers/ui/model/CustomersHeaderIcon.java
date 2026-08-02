package com.paypal.oslo.feature.businesscustomers.ui.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomersHeaderIcon;", "", "Lcom/paypal/pds/core/Icon;", "icon", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lcom/paypal/pds/core/Icon;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lcom/paypal/pds/core/Icon;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/businesscustomers/ui/model/CustomersHeaderIcon;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getIcon", "Lkotlin/jvm/functions/Function0;", "getOnClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CustomersHeaderIcon {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Icon icon;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick;

    public CustomersHeaderIcon(com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.icon = icon;
        this.onClick = function0;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public /* synthetic */ CustomersHeaderIcon(com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, (i & 2) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.model.CustomersHeaderIcon$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function0);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
        return this.onClick;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Icon icon = this.icon;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomersHeaderIcon(icon=");
        sb.append(icon);
        sb.append(", onClick=");
        sb.append(function0);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.icon.hashCode() * 31) + this.onClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.ui.model.CustomersHeaderIcon)) {
            return false;
        }
        com.paypal.oslo.feature.businesscustomers.ui.model.CustomersHeaderIcon customersHeaderIcon = (com.paypal.oslo.feature.businesscustomers.ui.model.CustomersHeaderIcon) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, customersHeaderIcon.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.onClick, customersHeaderIcon.onClick);
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.model.CustomersHeaderIcon copy(com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "");
        return new com.paypal.oslo.feature.businesscustomers.ui.model.CustomersHeaderIcon(icon, onClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onClick;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.model.CustomersHeaderIcon copy$default(com.paypal.oslo.feature.businesscustomers.ui.model.CustomersHeaderIcon customersHeaderIcon, com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            icon = customersHeaderIcon.icon;
        }
        if ((i & 2) != 0) {
            function0 = customersHeaderIcon.onClick;
        }
        return customersHeaderIcon.copy(icon, function0);
    }
}
