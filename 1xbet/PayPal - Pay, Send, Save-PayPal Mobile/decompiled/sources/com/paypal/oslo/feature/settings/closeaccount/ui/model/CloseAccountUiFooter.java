package com.paypal.oslo.feature.settings.closeaccount.ui.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b\"\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "", "", "showPrimaryButton", "showSecondaryButton", "", "primaryButtonText", "secondaryButtonText", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/FooterPrimaryAction;", "primaryButtonAction", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/FooterPrimaryAction;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/FooterPrimaryAction;", "copy", "(ZZLjava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/FooterPrimaryAction;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiFooter;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getShowPrimaryButton", "getShowSecondaryButton", "Ljava/lang/String;", "getPrimaryButtonText", "getSecondaryButtonText", "Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/FooterPrimaryAction;", "getPrimaryButtonAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CloseAccountUiFooter {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction primaryButtonAction;
    private final java.lang.String primaryButtonText;
    private final java.lang.String secondaryButtonText;
    private final boolean showPrimaryButton;
    private final boolean showSecondaryButton;

    public CloseAccountUiFooter(boolean z, boolean z2, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction footerPrimaryAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(footerPrimaryAction, "");
        this.showPrimaryButton = z;
        this.showSecondaryButton = z2;
        this.primaryButtonText = str;
        this.secondaryButtonText = str2;
        this.primaryButtonAction = footerPrimaryAction;
    }

    public /* synthetic */ CloseAccountUiFooter(boolean z, boolean z2, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction footerPrimaryAction, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? "" : str, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction.Continue : footerPrimaryAction);
    }

    public final boolean getShowPrimaryButton() {
        return this.showPrimaryButton;
    }

    public final boolean getShowSecondaryButton() {
        return this.showSecondaryButton;
    }

    public final java.lang.String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final java.lang.String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    public final com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction getPrimaryButtonAction() {
        return this.primaryButtonAction;
    }

    public final java.lang.String toString() {
        boolean z = this.showPrimaryButton;
        boolean z2 = this.showSecondaryButton;
        java.lang.String str = this.primaryButtonText;
        java.lang.String str2 = this.secondaryButtonText;
        com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction footerPrimaryAction = this.primaryButtonAction;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAccountUiFooter(showPrimaryButton=");
        sb.append(z);
        sb.append(", showSecondaryButton=");
        sb.append(z2);
        sb.append(", primaryButtonText=");
        sb.append(str);
        sb.append(", secondaryButtonText=");
        sb.append(str2);
        sb.append(", primaryButtonAction=");
        sb.append(footerPrimaryAction);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.showPrimaryButton) * 31) + java.lang.Boolean.hashCode(this.showSecondaryButton)) * 31) + this.primaryButtonText.hashCode()) * 31) + this.secondaryButtonText.hashCode()) * 31) + this.primaryButtonAction.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter)) {
            return false;
        }
        com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter = (com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter) other;
        return this.showPrimaryButton == closeAccountUiFooter.showPrimaryButton && this.showSecondaryButton == closeAccountUiFooter.showSecondaryButton && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryButtonText, closeAccountUiFooter.primaryButtonText) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryButtonText, closeAccountUiFooter.secondaryButtonText) && this.primaryButtonAction == closeAccountUiFooter.primaryButtonAction;
    }

    public final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter copy(boolean showPrimaryButton, boolean showSecondaryButton, java.lang.String primaryButtonText, java.lang.String secondaryButtonText, com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction primaryButtonAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryButtonText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryButtonText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryButtonAction, "");
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter(showPrimaryButton, showSecondaryButton, primaryButtonText, secondaryButtonText, primaryButtonAction);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction getPrimaryButtonAction() {
        return this.primaryButtonAction;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowSecondaryButton() {
        return this.showSecondaryButton;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowPrimaryButton() {
        return this.showPrimaryButton;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiFooter closeAccountUiFooter, boolean z, boolean z2, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.settings.closeaccount.ui.model.FooterPrimaryAction footerPrimaryAction, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = closeAccountUiFooter.showPrimaryButton;
        }
        if ((i & 2) != 0) {
            z2 = closeAccountUiFooter.showSecondaryButton;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            str = closeAccountUiFooter.primaryButtonText;
        }
        java.lang.String str3 = str;
        if ((i & 8) != 0) {
            str2 = closeAccountUiFooter.secondaryButtonText;
        }
        java.lang.String str4 = str2;
        if ((i & 16) != 0) {
            footerPrimaryAction = closeAccountUiFooter.primaryButtonAction;
        }
        return closeAccountUiFooter.copy(z, z3, str3, str4, footerPrimaryAction);
    }

    public CloseAccountUiFooter() {
        this(false, false, null, null, null, 31, null);
    }
}
