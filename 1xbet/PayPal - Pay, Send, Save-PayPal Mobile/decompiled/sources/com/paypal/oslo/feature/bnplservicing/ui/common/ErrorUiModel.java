package com.paypal.oslo.feature.bnplservicing.ui.common;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/common/ErrorUiModel;", "", "", "title", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider;", "errorContentProvider", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider;)Lcom/paypal/oslo/feature/bnplservicing/ui/common/ErrorUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "Lcom/paypal/oslo/feature/bnplservicing/ui/common/content/ErrorContentProvider;", "getErrorContentProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ErrorUiModel {
    public static final int $stable;
    private final com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider errorContentProvider;
    private final java.lang.String title;

    public ErrorUiModel(java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider errorContentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContentProvider, "");
        this.title = str;
        this.errorContentProvider = errorContentProvider;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public /* synthetic */ ErrorUiModel(java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.GenericErrorContent genericErrorContent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider.GenericErrorContent(null, 1, null) : genericErrorContent);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider getErrorContentProvider() {
        return this.errorContentProvider;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider errorContentProvider = this.errorContentProvider;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorUiModel(title=");
        sb.append(str);
        sb.append(", errorContentProvider=");
        sb.append(errorContentProvider);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.title;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.errorContentProvider.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel errorUiModel = (com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, errorUiModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorContentProvider, errorUiModel.errorContentProvider);
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel copy(java.lang.String title, com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider errorContentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContentProvider, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel(title, errorContentProvider);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider getErrorContentProvider() {
        return this.errorContentProvider;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.common.ErrorUiModel errorUiModel, java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.common.content.ErrorContentProvider errorContentProvider, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = errorUiModel.title;
        }
        if ((i & 2) != 0) {
            errorContentProvider = errorUiModel.errorContentProvider;
        }
        return errorUiModel.copy(str, errorContentProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorUiModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    static {
        int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        $stable = i | i;
    }
}
