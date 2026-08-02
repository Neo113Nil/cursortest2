package com.adobe.marketing.mobile.edge;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/edge/SDKConfig;", "", "Lcom/adobe/marketing/mobile/edge/Datastream;", "datastream", "<init>", "(Lcom/adobe/marketing/mobile/edge/Datastream;)V", "component1", "()Lcom/adobe/marketing/mobile/edge/Datastream;", "copy", "(Lcom/adobe/marketing/mobile/edge/Datastream;)Lcom/adobe/marketing/mobile/edge/SDKConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "", "toMap", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "Lcom/adobe/marketing/mobile/edge/Datastream;", "getDatastream"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SDKConfig {
    private final com.adobe.marketing.mobile.edge.Datastream datastream;

    public SDKConfig(com.adobe.marketing.mobile.edge.Datastream datastream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datastream, "");
        this.datastream = datastream;
    }

    public final com.adobe.marketing.mobile.edge.Datastream getDatastream() {
        return this.datastream;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> toMap() {
        return kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("datastream", this.datastream.toMap()));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SDKConfig(datastream=");
        sb.append(this.datastream);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.datastream.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.adobe.marketing.mobile.edge.SDKConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.datastream, ((com.adobe.marketing.mobile.edge.SDKConfig) other).datastream);
    }

    public final com.adobe.marketing.mobile.edge.SDKConfig copy(com.adobe.marketing.mobile.edge.Datastream datastream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datastream, "");
        return new com.adobe.marketing.mobile.edge.SDKConfig(datastream);
    }

    /* renamed from: component1, reason: from getter */
    public final com.adobe.marketing.mobile.edge.Datastream getDatastream() {
        return this.datastream;
    }

    public static /* synthetic */ com.adobe.marketing.mobile.edge.SDKConfig copy$default(com.adobe.marketing.mobile.edge.SDKConfig sDKConfig, com.adobe.marketing.mobile.edge.Datastream datastream, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            datastream = sDKConfig.datastream;
        }
        return sDKConfig.copy(datastream);
    }
}
