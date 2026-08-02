package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/apollographql/apollo/api/BLabel;", "Lcom/apollographql/apollo/api/BTerm;", "", "label", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/apollographql/apollo/api/BLabel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLabel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BLabel extends com.apollographql.apollo.api.BTerm {
    private final java.lang.String label;

    public BLabel(java.lang.String str) {
        super(null);
        this.label = str;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BLabel(label=");
        sb.append(this.label);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.label;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.apollographql.apollo.api.BLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, ((com.apollographql.apollo.api.BLabel) other).label);
    }

    public final com.apollographql.apollo.api.BLabel copy(java.lang.String label) {
        return new com.apollographql.apollo.api.BLabel(label);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.apollographql.apollo.api.BLabel copy$default(com.apollographql.apollo.api.BLabel bLabel, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bLabel.label;
        }
        return bLabel.copy(str);
    }
}
