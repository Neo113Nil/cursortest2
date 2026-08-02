package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/payair/model/HceData;", "", "Lcom/payair/model/DynamicParameters;", "dynParams", "Lcom/payair/model/StaticParameters;", "staticParams", "<init>", "(Lcom/payair/model/DynamicParameters;Lcom/payair/model/StaticParameters;)V", "component1", "()Lcom/payair/model/DynamicParameters;", "component2", "()Lcom/payair/model/StaticParameters;", "copy", "(Lcom/payair/model/DynamicParameters;Lcom/payair/model/StaticParameters;)Lcom/payair/model/HceData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/payair/model/DynamicParameters;", "getDynParams", "Lcom/payair/model/StaticParameters;", "getStaticParams"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HceData {
    public com.payair.model.DynamicParameters dynParams;
    public com.payair.model.StaticParameters staticParams;

    /* JADX WARN: Multi-variable type inference failed */
    public HceData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final com.payair.model.DynamicParameters getDynParams() {
        return this.dynParams;
    }

    public final com.payair.model.StaticParameters getStaticParams() {
        return this.staticParams;
    }

    public HceData(com.payair.model.DynamicParameters dynamicParameters, com.payair.model.StaticParameters staticParameters) {
        this.dynParams = dynamicParameters;
        this.staticParams = staticParameters;
    }

    public /* synthetic */ HceData(com.payair.model.DynamicParameters dynamicParameters, com.payair.model.StaticParameters staticParameters, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : dynamicParameters, (i & 2) != 0 ? null : staticParameters);
    }

    public final java.lang.String toString() {
        com.payair.model.DynamicParameters dynamicParameters = this.dynParams;
        com.payair.model.StaticParameters staticParameters = this.staticParams;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HceData(dynParams=");
        sb.append(dynamicParameters);
        sb.append(", staticParams=");
        sb.append(staticParameters);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.payair.model.DynamicParameters dynamicParameters = this.dynParams;
        int hashCode = dynamicParameters == null ? 0 : dynamicParameters.hashCode();
        com.payair.model.StaticParameters staticParameters = this.staticParams;
        return (hashCode * 31) + (staticParameters != null ? staticParameters.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.HceData)) {
            return false;
        }
        com.payair.model.HceData hceData = (com.payair.model.HceData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dynParams, hceData.dynParams) && kotlin.jvm.internal.Intrinsics.areEqual(this.staticParams, hceData.staticParams);
    }

    public final com.payair.model.HceData copy(com.payair.model.DynamicParameters dynParams, com.payair.model.StaticParameters staticParams) {
        return new com.payair.model.HceData(dynParams, staticParams);
    }

    /* renamed from: component2, reason: from getter */
    public final com.payair.model.StaticParameters getStaticParams() {
        return this.staticParams;
    }

    /* renamed from: component1, reason: from getter */
    public final com.payair.model.DynamicParameters getDynParams() {
        return this.dynParams;
    }

    public static /* synthetic */ com.payair.model.HceData copy$default(com.payair.model.HceData hceData, com.payair.model.DynamicParameters dynamicParameters, com.payair.model.StaticParameters staticParameters, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dynamicParameters = hceData.dynParams;
        }
        if ((i & 2) != 0) {
            staticParameters = hceData.staticParams;
        }
        return hceData.copy(dynamicParameters, staticParameters);
    }
}
