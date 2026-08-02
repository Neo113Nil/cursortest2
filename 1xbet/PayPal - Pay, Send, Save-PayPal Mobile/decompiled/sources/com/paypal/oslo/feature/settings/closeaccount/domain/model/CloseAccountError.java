package com.paypal.oslo.feature.settings.closeaccount.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "", "", "message", "", "path", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/ErrorExtensions;", com.adobe.marketing.mobile.internal.eventhub.EventHubConstants.EventDataKeys.EXTENSIONS, "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/ErrorExtensions;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/ErrorExtensions;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/ErrorExtensions;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountError;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getPath", "Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/ErrorExtensions;", "getExtensions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CloseAccountError {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorExtensions extensions;
    private final java.lang.String message;
    private final java.util.List<java.lang.String> path;

    public CloseAccountError(java.lang.String str, java.util.List<java.lang.String> list, com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorExtensions errorExtensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.message = str;
        this.path = list;
        this.extensions = errorExtensions;
    }

    public /* synthetic */ CloseAccountError(java.lang.String str, java.util.List list, com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorExtensions errorExtensions, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : errorExtensions);
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.util.List<java.lang.String> getPath() {
        return this.path;
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorExtensions getExtensions() {
        return this.extensions;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.message;
        java.util.List<java.lang.String> list = this.path;
        com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorExtensions errorExtensions = this.extensions;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAccountError(message=");
        sb.append(str);
        sb.append(", path=");
        sb.append(list);
        sb.append(", extensions=");
        sb.append(errorExtensions);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode();
        int hashCode2 = this.path.hashCode();
        com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorExtensions errorExtensions = this.extensions;
        return (((hashCode * 31) + hashCode2) * 31) + (errorExtensions == null ? 0 : errorExtensions.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError)) {
            return false;
        }
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError closeAccountError = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.message, closeAccountError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.path, closeAccountError.path) && kotlin.jvm.internal.Intrinsics.areEqual(this.extensions, closeAccountError.extensions);
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError copy(java.lang.String message, java.util.List<java.lang.String> path, com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorExtensions extensions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError(message, path, extensions);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorExtensions getExtensions() {
        return this.extensions;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.path;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError copy$default(com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountError closeAccountError, java.lang.String str, java.util.List list, com.paypal.oslo.feature.settings.closeaccount.domain.model.ErrorExtensions errorExtensions, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = closeAccountError.message;
        }
        if ((i & 2) != 0) {
            list = closeAccountError.path;
        }
        if ((i & 4) != 0) {
            errorExtensions = closeAccountError.extensions;
        }
        return closeAccountError.copy(str, list, errorExtensions);
    }
}
