package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/payair/model/SeCardPerso;", "", "", "appletInstanceAID", "priorityCode", "", "Lcom/payair/model/ApduPerso;", "apduPerso", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/payair/model/SeCardPerso;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getApduPerso", "Ljava/lang/String;", "getAppletInstanceAID", "getPriorityCode"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SeCardPerso {
    public java.util.List<com.payair.model.ApduPerso> apduPerso;
    public java.lang.String appletInstanceAID;
    public java.lang.String priorityCode;

    public SeCardPerso() {
        this(null, null, null, 7, null);
    }

    public final java.util.List<com.payair.model.ApduPerso> getApduPerso() {
        return this.apduPerso;
    }

    public final java.lang.String getAppletInstanceAID() {
        return this.appletInstanceAID;
    }

    public final java.lang.String getPriorityCode() {
        return this.priorityCode;
    }

    public SeCardPerso(java.lang.String str, java.lang.String str2, java.util.List<com.payair.model.ApduPerso> list) {
        this.appletInstanceAID = str;
        this.priorityCode = str2;
        this.apduPerso = list;
    }

    public /* synthetic */ SeCardPerso(java.lang.String str, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.appletInstanceAID;
        java.lang.String str2 = this.priorityCode;
        java.util.List<com.payair.model.ApduPerso> list = this.apduPerso;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SeCardPerso(appletInstanceAID=");
        sb.append(str);
        sb.append(", priorityCode=");
        sb.append(str2);
        sb.append(", apduPerso=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.appletInstanceAID;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.priorityCode;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.util.List<com.payair.model.ApduPerso> list = this.apduPerso;
        return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.SeCardPerso)) {
            return false;
        }
        com.payair.model.SeCardPerso seCardPerso = (com.payair.model.SeCardPerso) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.appletInstanceAID, seCardPerso.appletInstanceAID) && kotlin.jvm.internal.Intrinsics.areEqual(this.priorityCode, seCardPerso.priorityCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.apduPerso, seCardPerso.apduPerso);
    }

    public final com.payair.model.SeCardPerso copy(java.lang.String appletInstanceAID, java.lang.String priorityCode, java.util.List<com.payair.model.ApduPerso> apduPerso) {
        return new com.payair.model.SeCardPerso(appletInstanceAID, priorityCode, apduPerso);
    }

    public final java.util.List<com.payair.model.ApduPerso> component3() {
        return this.apduPerso;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPriorityCode() {
        return this.priorityCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAppletInstanceAID() {
        return this.appletInstanceAID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.payair.model.SeCardPerso copy$default(com.payair.model.SeCardPerso seCardPerso, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = seCardPerso.appletInstanceAID;
        }
        if ((i & 2) != 0) {
            str2 = seCardPerso.priorityCode;
        }
        if ((i & 4) != 0) {
            list = seCardPerso.apduPerso;
        }
        return seCardPerso.copy(str, str2, list);
    }
}
