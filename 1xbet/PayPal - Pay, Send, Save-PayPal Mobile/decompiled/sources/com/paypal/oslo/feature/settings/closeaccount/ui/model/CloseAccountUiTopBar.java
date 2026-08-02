package com.paypal.oslo.feature.settings.closeaccount.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiTopBar;", "", "", "showBackButton", "", "title", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/CloseAccountUiTopBar;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getShowBackButton", "setShowBackButton", "(Z)V", "Ljava/lang/String;", "getTitle", "setTitle", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CloseAccountUiTopBar {
    public static final int $stable = 8;
    private boolean showBackButton;
    private java.lang.String title;

    public CloseAccountUiTopBar(boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.showBackButton = z;
        this.title = str;
    }

    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public final void setShowBackButton(boolean z) {
        this.showBackButton = z;
    }

    public /* synthetic */ CloseAccountUiTopBar(boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final void setTitle(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    public final java.lang.String toString() {
        boolean z = this.showBackButton;
        java.lang.String str = this.title;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAccountUiTopBar(showBackButton=");
        sb.append(z);
        sb.append(", title=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.showBackButton) * 31) + this.title.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar)) {
            return false;
        }
        com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar closeAccountUiTopBar = (com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar) other;
        return this.showBackButton == closeAccountUiTopBar.showBackButton && kotlin.jvm.internal.Intrinsics.areEqual(this.title, closeAccountUiTopBar.title);
    }

    public final com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar copy(boolean showBackButton, java.lang.String title) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar(showBackButton, title);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowBackButton() {
        return this.showBackButton;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.model.CloseAccountUiTopBar closeAccountUiTopBar, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = closeAccountUiTopBar.showBackButton;
        }
        if ((i & 2) != 0) {
            str = closeAccountUiTopBar.title;
        }
        return closeAccountUiTopBar.copy(z, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CloseAccountUiTopBar() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
