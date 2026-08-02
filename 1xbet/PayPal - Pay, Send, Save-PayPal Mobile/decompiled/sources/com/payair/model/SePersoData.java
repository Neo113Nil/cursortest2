package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/payair/model/SePersoData;", "", "", "Lcom/payair/model/PersoApplicationData;", "persoApplicationData", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/payair/model/SePersoData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPersoApplicationData"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SePersoData {
    public java.util.List<com.payair.model.PersoApplicationData> persoApplicationData;

    /* JADX WARN: Multi-variable type inference failed */
    public SePersoData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.util.List<com.payair.model.PersoApplicationData> getPersoApplicationData() {
        return this.persoApplicationData;
    }

    public SePersoData(java.util.List<com.payair.model.PersoApplicationData> list) {
        this.persoApplicationData = list;
    }

    public /* synthetic */ SePersoData(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public final java.lang.String toString() {
        java.util.List<com.payair.model.PersoApplicationData> list = this.persoApplicationData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SePersoData(persoApplicationData=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.payair.model.PersoApplicationData> list = this.persoApplicationData;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.payair.model.SePersoData) && kotlin.jvm.internal.Intrinsics.areEqual(this.persoApplicationData, ((com.payair.model.SePersoData) other).persoApplicationData);
    }

    public final com.payair.model.SePersoData copy(java.util.List<com.payair.model.PersoApplicationData> persoApplicationData) {
        return new com.payair.model.SePersoData(persoApplicationData);
    }

    public final java.util.List<com.payair.model.PersoApplicationData> component1() {
        return this.persoApplicationData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.payair.model.SePersoData copy$default(com.payair.model.SePersoData sePersoData, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = sePersoData.persoApplicationData;
        }
        return sePersoData.copy(list);
    }
}
