package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/android/threeds/data/model/InstalmentData;", "", "", "noOfInstalments", "Lcom/paypal/android/threeds/data/model/RecurrenceInfo;", "recurrenceInfo", "<init>", "(Ljava/lang/String;Lcom/paypal/android/threeds/data/model/RecurrenceInfo;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/android/threeds/data/model/RecurrenceInfo;", "copy", "(Ljava/lang/String;Lcom/paypal/android/threeds/data/model/RecurrenceInfo;)Lcom/paypal/android/threeds/data/model/InstalmentData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNoOfInstalments", "Lcom/paypal/android/threeds/data/model/RecurrenceInfo;", "getRecurrenceInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InstalmentData {
    public static final int $stable = 0;

    @com.google.gson.annotations.SerializedName("no_of_instalments")
    private final java.lang.String noOfInstalments;

    @com.google.gson.annotations.SerializedName("recurrence_info")
    private final com.paypal.android.threeds.data.model.RecurrenceInfo recurrenceInfo;

    public InstalmentData(java.lang.String str, com.paypal.android.threeds.data.model.RecurrenceInfo recurrenceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurrenceInfo, "");
        this.noOfInstalments = str;
        this.recurrenceInfo = recurrenceInfo;
    }

    public final java.lang.String getNoOfInstalments() {
        return this.noOfInstalments;
    }

    public final com.paypal.android.threeds.data.model.RecurrenceInfo getRecurrenceInfo() {
        return this.recurrenceInfo;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.noOfInstalments;
        com.paypal.android.threeds.data.model.RecurrenceInfo recurrenceInfo = this.recurrenceInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstalmentData(noOfInstalments=");
        sb.append(str);
        sb.append(", recurrenceInfo=");
        sb.append(recurrenceInfo);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.noOfInstalments.hashCode() * 31) + this.recurrenceInfo.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.InstalmentData)) {
            return false;
        }
        com.paypal.android.threeds.data.model.InstalmentData instalmentData = (com.paypal.android.threeds.data.model.InstalmentData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.noOfInstalments, instalmentData.noOfInstalments) && kotlin.jvm.internal.Intrinsics.areEqual(this.recurrenceInfo, instalmentData.recurrenceInfo);
    }

    public final com.paypal.android.threeds.data.model.InstalmentData copy(java.lang.String noOfInstalments, com.paypal.android.threeds.data.model.RecurrenceInfo recurrenceInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(noOfInstalments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurrenceInfo, "");
        return new com.paypal.android.threeds.data.model.InstalmentData(noOfInstalments, recurrenceInfo);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.android.threeds.data.model.RecurrenceInfo getRecurrenceInfo() {
        return this.recurrenceInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNoOfInstalments() {
        return this.noOfInstalments;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.InstalmentData copy$default(com.paypal.android.threeds.data.model.InstalmentData instalmentData, java.lang.String str, com.paypal.android.threeds.data.model.RecurrenceInfo recurrenceInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = instalmentData.noOfInstalments;
        }
        if ((i & 2) != 0) {
            recurrenceInfo = instalmentData.recurrenceInfo;
        }
        return instalmentData.copy(str, recurrenceInfo);
    }
}
