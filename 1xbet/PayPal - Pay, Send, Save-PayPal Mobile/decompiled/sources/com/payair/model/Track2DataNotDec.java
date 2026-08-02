package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/payair/model/Track2DataNotDec;", "", "", "svcCode", "pinVerField", "track2DiscData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/Track2DataNotDec;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPinVerField", "getSvcCode", "getTrack2DiscData"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Track2DataNotDec {
    public java.lang.String pinVerField;
    public java.lang.String svcCode;
    public java.lang.String track2DiscData;

    public Track2DataNotDec() {
        this(null, null, null, 7, null);
    }

    public final java.lang.String getPinVerField() {
        return this.pinVerField;
    }

    public final java.lang.String getSvcCode() {
        return this.svcCode;
    }

    public final java.lang.String getTrack2DiscData() {
        return this.track2DiscData;
    }

    public Track2DataNotDec(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.svcCode = str;
        this.pinVerField = str2;
        this.track2DiscData = str3;
    }

    public /* synthetic */ Track2DataNotDec(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.svcCode;
        java.lang.String str2 = this.pinVerField;
        java.lang.String str3 = this.track2DiscData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Track2DataNotDec(svcCode=");
        sb.append(str);
        sb.append(", pinVerField=");
        sb.append(str2);
        sb.append(", track2DiscData=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.svcCode;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.pinVerField;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.track2DiscData;
        return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.Track2DataNotDec)) {
            return false;
        }
        com.payair.model.Track2DataNotDec track2DataNotDec = (com.payair.model.Track2DataNotDec) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.svcCode, track2DataNotDec.svcCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.pinVerField, track2DataNotDec.pinVerField) && kotlin.jvm.internal.Intrinsics.areEqual(this.track2DiscData, track2DataNotDec.track2DiscData);
    }

    public final com.payair.model.Track2DataNotDec copy(java.lang.String svcCode, java.lang.String pinVerField, java.lang.String track2DiscData) {
        return new com.payair.model.Track2DataNotDec(svcCode, pinVerField, track2DiscData);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTrack2DiscData() {
        return this.track2DiscData;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPinVerField() {
        return this.pinVerField;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSvcCode() {
        return this.svcCode;
    }

    public static /* synthetic */ com.payair.model.Track2DataNotDec copy$default(com.payair.model.Track2DataNotDec track2DataNotDec, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = track2DataNotDec.svcCode;
        }
        if ((i & 2) != 0) {
            str2 = track2DataNotDec.pinVerField;
        }
        if ((i & 4) != 0) {
            str3 = track2DataNotDec.track2DiscData;
        }
        return track2DataNotDec.copy(str, str2, str3);
    }
}
