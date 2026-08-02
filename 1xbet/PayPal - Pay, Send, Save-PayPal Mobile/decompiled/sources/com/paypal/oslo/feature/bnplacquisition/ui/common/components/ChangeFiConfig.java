package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ChangeFiConfig;", "", "", "changeFiText", "Lkotlin/Function0;", "", "onChangeClick", "", "enabled", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Lkotlin/jvm/functions/Function0;", "component3", "()Z", "copy", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/ChangeFiConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChangeFiText", "Lkotlin/jvm/functions/Function0;", "getOnChangeClick", "Z", "getEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChangeFiConfig {
    public static final int $stable = 0;
    private final java.lang.String changeFiText;
    private final boolean enabled;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onChangeClick;

    public ChangeFiConfig(java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.changeFiText = str;
        this.onChangeClick = function0;
        this.enabled = z;
    }

    public /* synthetic */ ChangeFiConfig(java.lang.String str, kotlin.jvm.functions.Function0 function0, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function0, (i & 4) != 0 ? true : z);
    }

    public final java.lang.String getChangeFiText() {
        return this.changeFiText;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnChangeClick() {
        return this.onChangeClick;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.changeFiText;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onChangeClick;
        boolean z = this.enabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangeFiConfig(changeFiText=");
        sb.append(str);
        sb.append(", onChangeClick=");
        sb.append(function0);
        sb.append(", enabled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.changeFiText.hashCode() * 31) + this.onChangeClick.hashCode()) * 31) + java.lang.Boolean.hashCode(this.enabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig changeFiConfig = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.changeFiText, changeFiConfig.changeFiText) && kotlin.jvm.internal.Intrinsics.areEqual(this.onChangeClick, changeFiConfig.onChangeClick) && this.enabled == changeFiConfig.enabled;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig copy(java.lang.String changeFiText, kotlin.jvm.functions.Function0<kotlin.Unit> onChangeClick, boolean enabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeFiText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onChangeClick, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig(changeFiText, onChangeClick, enabled);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component2() {
        return this.onChangeClick;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getChangeFiText() {
        return this.changeFiText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.ChangeFiConfig changeFiConfig, java.lang.String str, kotlin.jvm.functions.Function0 function0, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = changeFiConfig.changeFiText;
        }
        if ((i & 2) != 0) {
            function0 = changeFiConfig.onChangeClick;
        }
        if ((i & 4) != 0) {
            z = changeFiConfig.enabled;
        }
        return changeFiConfig.copy(str, function0, z);
    }
}
