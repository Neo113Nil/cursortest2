package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0012R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0014"}, d2 = {"Lcom/paypal/pds/components/ToggleConfig;", "", "", "isToggled", "Lcom/paypal/pds/core/Icon;", "toggledIcon", "", "toggledContentDescription", "Lkotlin/Function1;", "", "onToggled", "<init>", "(ZLcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "component1", "()Z", "component2", "()Lcom/paypal/pds/core/Icon;", "component3", "()Ljava/lang/String;", "component4", "()Lkotlin/jvm/functions/Function1;", "copy", "(ZLcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/paypal/pds/components/ToggleConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Lcom/paypal/pds/core/Icon;", "getToggledIcon", "Ljava/lang/String;", "getToggledContentDescription", "Lkotlin/jvm/functions/Function1;", "getOnToggled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ToggleConfig {
    public static final int $stable = 0;
    private final boolean isToggled;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> onToggled;
    private final java.lang.String toggledContentDescription;
    private final com.paypal.pds.core.Icon toggledIcon;

    /* JADX WARN: Multi-variable type inference failed */
    public ToggleConfig(boolean z, com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        this.isToggled = z;
        this.toggledIcon = icon;
        this.toggledContentDescription = str;
        this.onToggled = function1;
    }

    public final boolean isToggled() {
        return this.isToggled;
    }

    public /* synthetic */ ToggleConfig(boolean z, com.paypal.pds.core.Icon.DefaultIcon defaultIcon, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? com.paypal.pds.core.Icon.DefaultIcon.INSTANCE : defaultIcon, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : function1);
    }

    public final com.paypal.pds.core.Icon getToggledIcon() {
        return this.toggledIcon;
    }

    public final java.lang.String getToggledContentDescription() {
        return this.toggledContentDescription;
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getOnToggled() {
        return this.onToggled;
    }

    public final java.lang.String toString() {
        boolean z = this.isToggled;
        com.paypal.pds.core.Icon icon = this.toggledIcon;
        java.lang.String str = this.toggledContentDescription;
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1 = this.onToggled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ToggleConfig(isToggled=");
        sb.append(z);
        sb.append(", toggledIcon=");
        sb.append(icon);
        sb.append(", toggledContentDescription=");
        sb.append(str);
        sb.append(", onToggled=");
        sb.append(function1);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isToggled);
        int hashCode2 = this.toggledIcon.hashCode();
        java.lang.String str = this.toggledContentDescription;
        int hashCode3 = str == null ? 0 : str.hashCode();
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1 = this.onToggled;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (function1 != null ? function1.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.components.ToggleConfig)) {
            return false;
        }
        com.paypal.pds.components.ToggleConfig toggleConfig = (com.paypal.pds.components.ToggleConfig) other;
        return this.isToggled == toggleConfig.isToggled && kotlin.jvm.internal.Intrinsics.areEqual(this.toggledIcon, toggleConfig.toggledIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.toggledContentDescription, toggleConfig.toggledContentDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.onToggled, toggleConfig.onToggled);
    }

    public final com.paypal.pds.components.ToggleConfig copy(boolean isToggled, com.paypal.pds.core.Icon toggledIcon, java.lang.String toggledContentDescription, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onToggled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toggledIcon, "");
        return new com.paypal.pds.components.ToggleConfig(isToggled, toggledIcon, toggledContentDescription, onToggled);
    }

    public final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> component4() {
        return this.onToggled;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getToggledContentDescription() {
        return this.toggledContentDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.core.Icon getToggledIcon() {
        return this.toggledIcon;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsToggled() {
        return this.isToggled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.pds.components.ToggleConfig copy$default(com.paypal.pds.components.ToggleConfig toggleConfig, boolean z, com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = toggleConfig.isToggled;
        }
        if ((i & 2) != 0) {
            icon = toggleConfig.toggledIcon;
        }
        if ((i & 4) != 0) {
            str = toggleConfig.toggledContentDescription;
        }
        if ((i & 8) != 0) {
            function1 = toggleConfig.onToggled;
        }
        return toggleConfig.copy(z, icon, str, function1);
    }
}
