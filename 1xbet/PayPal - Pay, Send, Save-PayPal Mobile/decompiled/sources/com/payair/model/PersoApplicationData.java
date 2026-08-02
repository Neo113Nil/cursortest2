package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/payair/model/PersoApplicationData;", "", "", "dataTag", "dataName", "dataValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/PersoApplicationData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDataName", "getDataTag", "getDataValue"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PersoApplicationData {
    public java.lang.String dataName;
    public java.lang.String dataTag;
    public java.lang.String dataValue;

    public PersoApplicationData() {
        this(null, null, null, 7, null);
    }

    public final java.lang.String getDataName() {
        return this.dataName;
    }

    public final java.lang.String getDataTag() {
        return this.dataTag;
    }

    public final java.lang.String getDataValue() {
        return this.dataValue;
    }

    public PersoApplicationData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.dataTag = str;
        this.dataName = str2;
        this.dataValue = str3;
    }

    public /* synthetic */ PersoApplicationData(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.dataTag;
        java.lang.String str2 = this.dataName;
        java.lang.String str3 = this.dataValue;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersoApplicationData(dataTag=");
        sb.append(str);
        sb.append(", dataName=");
        sb.append(str2);
        sb.append(", dataValue=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.dataTag;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.dataName;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.dataValue;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.PersoApplicationData)) {
            return false;
        }
        com.payair.model.PersoApplicationData persoApplicationData = (com.payair.model.PersoApplicationData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.dataTag, persoApplicationData.dataTag) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataName, persoApplicationData.dataName) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataValue, persoApplicationData.dataValue);
    }

    public final com.payair.model.PersoApplicationData copy(java.lang.String dataTag, java.lang.String dataName, java.lang.String dataValue) {
        return new com.payair.model.PersoApplicationData(dataTag, dataName, dataValue);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDataValue() {
        return this.dataValue;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDataName() {
        return this.dataName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDataTag() {
        return this.dataTag;
    }

    public static /* synthetic */ com.payair.model.PersoApplicationData copy$default(com.payair.model.PersoApplicationData persoApplicationData, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = persoApplicationData.dataTag;
        }
        if ((i & 2) != 0) {
            str2 = persoApplicationData.dataName;
        }
        if ((i & 4) != 0) {
            str3 = persoApplicationData.dataValue;
        }
        return persoApplicationData.copy(str, str2, str3);
    }
}
