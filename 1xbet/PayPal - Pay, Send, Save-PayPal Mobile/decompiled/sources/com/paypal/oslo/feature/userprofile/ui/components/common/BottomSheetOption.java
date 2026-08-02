package com.paypal.oslo.feature.userprofile.ui.components.common;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/components/common/BottomSheetOption;", "", "Lcom/paypal/pds/core/Icon;", "icon", "", "text", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Ljava/lang/String;", "component3", "()Lkotlin/jvm/functions/Function0;", "copy", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lcom/paypal/oslo/feature/userprofile/ui/components/common/BottomSheetOption;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/core/Icon;", "getIcon", "Ljava/lang/String;", "getText", "Lkotlin/jvm/functions/Function0;", "getOnClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BottomSheetOption {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Icon icon;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick;
    private final java.lang.String text;

    public BottomSheetOption(com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.icon = icon;
        this.text = str;
        this.onClick = function0;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
        return this.onClick;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Icon icon = this.icon;
        java.lang.String str = this.text;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BottomSheetOption(icon=");
        sb.append(icon);
        sb.append(", text=");
        sb.append(str);
        sb.append(", onClick=");
        sb.append(function0);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.icon.hashCode() * 31) + this.text.hashCode()) * 31) + this.onClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption)) {
            return false;
        }
        com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption bottomSheetOption = (com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, bottomSheetOption.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, bottomSheetOption.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.onClick, bottomSheetOption.onClick);
    }

    public final com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption copy(com.paypal.pds.core.Icon icon, java.lang.String text, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "");
        return new com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption(icon, text, onClick);
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
        return this.onClick;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption copy$default(com.paypal.oslo.feature.userprofile.ui.components.common.BottomSheetOption bottomSheetOption, com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            icon = bottomSheetOption.icon;
        }
        if ((i & 2) != 0) {
            str = bottomSheetOption.text;
        }
        if ((i & 4) != 0) {
            function0 = bottomSheetOption.onClick;
        }
        return bottomSheetOption.copy(icon, str, function0);
    }
}
