package com.paypal.oslo.app.emw.domain.models;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/app/emw/domain/models/WebAuthContext;", "", "", "source", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/app/emw/domain/models/WebAuthContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class WebAuthContext {
    public static final int $stable = 0;
    private final java.lang.String source;

    public WebAuthContext(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.source = str;
    }

    public /* synthetic */ WebAuthContext(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "emw" : str);
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.source;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WebAuthContext(source=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.app.emw.domain.models.WebAuthContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, ((com.paypal.oslo.app.emw.domain.models.WebAuthContext) other).source);
    }

    public final com.paypal.oslo.app.emw.domain.models.WebAuthContext copy(java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new com.paypal.oslo.app.emw.domain.models.WebAuthContext(source);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    public static /* synthetic */ com.paypal.oslo.app.emw.domain.models.WebAuthContext copy$default(com.paypal.oslo.app.emw.domain.models.WebAuthContext webAuthContext, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = webAuthContext.source;
        }
        return webAuthContext.copy(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebAuthContext() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
