package com.paypal.oslo.feature.xoom.ui.accountlinking;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiModel;", "", "", "initialUrl", "", "headers", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/xoom/ui/accountlinking/AccountLinkingUiModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInitialUrl", "Ljava/util/Map;", "getHeaders"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AccountLinkingUiModel {
    public static final int $stable = 8;
    private final java.util.Map<java.lang.String, java.lang.String> headers;
    private final java.lang.String initialUrl;

    public AccountLinkingUiModel(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.initialUrl = str;
        this.headers = map;
    }

    public final java.lang.String getInitialUrl() {
        return this.initialUrl;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        return this.headers;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.initialUrl;
        java.util.Map<java.lang.String, java.lang.String> map = this.headers;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountLinkingUiModel(initialUrl=");
        sb.append(str);
        sb.append(", headers=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.initialUrl.hashCode() * 31) + this.headers.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel accountLinkingUiModel = (com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.initialUrl, accountLinkingUiModel.initialUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.headers, accountLinkingUiModel.headers);
    }

    public final com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel copy(java.lang.String initialUrl, java.util.Map<java.lang.String, java.lang.String> headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initialUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        return new com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel(initialUrl, headers);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component2() {
        return this.headers;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInitialUrl() {
        return this.initialUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel copy$default(com.paypal.oslo.feature.xoom.ui.accountlinking.AccountLinkingUiModel accountLinkingUiModel, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = accountLinkingUiModel.initialUrl;
        }
        if ((i & 2) != 0) {
            map = accountLinkingUiModel.headers;
        }
        return accountLinkingUiModel.copy(str, map);
    }
}
