package com.adobe.marketing.mobile.edge;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/edge/Datastream;", "", "", com.visa.cbp.DeviceInfo.valueOf, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/adobe/marketing/mobile/edge/Datastream;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toMap", "()Ljava/util/Map;", "toString", "Ljava/lang/String;", "getOriginal"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Datastream {
    private final java.lang.String original;

    public Datastream(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.original = str;
    }

    public final java.lang.String getOriginal() {
        return this.original;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> toMap() {
        return kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.visa.cbp.DeviceInfo.valueOf, this.original));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Datastream(original=");
        sb.append(this.original);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.original.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.adobe.marketing.mobile.edge.Datastream) && kotlin.jvm.internal.Intrinsics.areEqual(this.original, ((com.adobe.marketing.mobile.edge.Datastream) other).original);
    }

    public final com.adobe.marketing.mobile.edge.Datastream copy(java.lang.String original) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(original, "");
        return new com.adobe.marketing.mobile.edge.Datastream(original);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getOriginal() {
        return this.original;
    }

    public static /* synthetic */ com.adobe.marketing.mobile.edge.Datastream copy$default(com.adobe.marketing.mobile.edge.Datastream datastream, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = datastream.original;
        }
        return datastream.copy(str);
    }
}
