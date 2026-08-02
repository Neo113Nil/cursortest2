package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/RequiresAuthorization;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/AuthorizationResult;", "", "url", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "provider", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/feature/packagetracking/domain/usecase/RequiresAuthorization;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getProvider"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RequiresAuthorization implements com.paypal.oslo.feature.packagetracking.domain.usecase.AuthorizationResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider;
    private final java.lang.String url;

    public RequiresAuthorization(java.lang.String str, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        this.url = str;
        this.provider = emailProvider;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
        return this.provider;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.url;
        com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.provider;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequiresAuthorization(url=");
        sb.append(str);
        sb.append(", provider=");
        sb.append(emailProvider);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.url.hashCode() * 31) + this.provider.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization requiresAuthorization = (com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, requiresAuthorization.url) && this.provider == requiresAuthorization.provider;
    }

    public final com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization copy(java.lang.String url, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return new com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization(url, provider);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
        return this.provider;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization copy$default(com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization requiresAuthorization, java.lang.String str, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = requiresAuthorization.url;
        }
        if ((i & 2) != 0) {
            emailProvider = requiresAuthorization.provider;
        }
        return requiresAuthorization.copy(str, emailProvider);
    }
}
