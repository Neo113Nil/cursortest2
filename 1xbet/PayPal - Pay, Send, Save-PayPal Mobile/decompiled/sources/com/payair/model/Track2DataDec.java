package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/payair/model/Track2DataDec;", "", "", "svcCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/payair/model/Track2DataDec;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSvcCode"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Track2DataDec {
    public java.lang.String svcCode;

    /* JADX WARN: Multi-variable type inference failed */
    public Track2DataDec() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final java.lang.String getSvcCode() {
        return this.svcCode;
    }

    public Track2DataDec(java.lang.String str) {
        this.svcCode = str;
    }

    public /* synthetic */ Track2DataDec(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.svcCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Track2DataDec(svcCode=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.svcCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.payair.model.Track2DataDec) && kotlin.jvm.internal.Intrinsics.areEqual(this.svcCode, ((com.payair.model.Track2DataDec) other).svcCode);
    }

    public final com.payair.model.Track2DataDec copy(java.lang.String svcCode) {
        return new com.payair.model.Track2DataDec(svcCode);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSvcCode() {
        return this.svcCode;
    }

    public static /* synthetic */ com.payair.model.Track2DataDec copy$default(com.payair.model.Track2DataDec track2DataDec, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = track2DataDec.svcCode;
        }
        return track2DataDec.copy(str);
    }
}
