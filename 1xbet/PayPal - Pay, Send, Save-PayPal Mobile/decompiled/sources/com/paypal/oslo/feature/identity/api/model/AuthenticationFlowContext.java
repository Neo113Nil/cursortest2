package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;", "", "", "source", "id", "", "additionalParameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/identity/api/model/AuthenticationFlowContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource", "getId", "Ljava/util/Map;", "getAdditionalParameters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AuthenticationFlowContext {
    private final java.util.Map<java.lang.String, java.lang.String> additionalParameters;
    private final java.lang.String id;
    private final java.lang.String source;

    public AuthenticationFlowContext(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.source = str;
        this.id = str2;
        this.additionalParameters = map;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public /* synthetic */ AuthenticationFlowContext(java.lang.String str, java.lang.String str2, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getAdditionalParameters() {
        return this.additionalParameters;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.source;
        java.lang.String str2 = this.id;
        java.util.Map<java.lang.String, java.lang.String> map = this.additionalParameters;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationFlowContext(source=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", additionalParameters=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.source.hashCode() * 31) + this.id.hashCode()) * 31) + this.additionalParameters.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext)) {
            return false;
        }
        com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext = (com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.source, authenticationFlowContext.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, authenticationFlowContext.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalParameters, authenticationFlowContext.additionalParameters);
    }

    public final com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext copy(java.lang.String source, java.lang.String id, java.util.Map<java.lang.String, java.lang.String> additionalParameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalParameters, "");
        return new com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext(source, id, additionalParameters);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component3() {
        return this.additionalParameters;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext copy$default(com.paypal.oslo.feature.identity.api.model.AuthenticationFlowContext authenticationFlowContext, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authenticationFlowContext.source;
        }
        if ((i & 2) != 0) {
            str2 = authenticationFlowContext.id;
        }
        if ((i & 4) != 0) {
            map = authenticationFlowContext.additionalParameters;
        }
        return authenticationFlowContext.copy(str, str2, map);
    }
}
