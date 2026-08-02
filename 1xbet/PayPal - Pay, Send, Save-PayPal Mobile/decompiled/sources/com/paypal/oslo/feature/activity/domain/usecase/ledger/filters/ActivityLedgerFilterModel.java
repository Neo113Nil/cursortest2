package com.paypal.oslo.feature.activity.domain.usecase.ledger.filters;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010JP\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\rJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b+\u0010\rR\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b\t\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityLedgerFilterModel;", "Landroid/os/Parcelable;", "", "id", "title", "", "canClose", "startDate", "endDate", "isBusinessUser", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityLedgerFilterModel;", "", "describeContents", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getCanClose", "getStartDate", "getEndDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityLedgerFilterModel implements android.os.Parcelable {
    public static final int $stable = 0;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel> CREATOR = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel.Creator();
    private final boolean canClose;
    private final java.lang.String endDate;
    private final java.lang.String id;
    private final boolean isBusinessUser;
    private final java.lang.String startDate;
    private final java.lang.String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ActivityLedgerFilterModel(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.title = str2;
        this.canClose = z;
        this.startDate = str3;
        this.endDate = str4;
        this.isBusinessUser = z2;
    }

    public /* synthetic */ ActivityLedgerFilterModel(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? false : z2);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final boolean getCanClose() {
        return this.canClose;
    }

    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public final java.lang.String getEndDate() {
        return this.endDate;
    }

    public final boolean isBusinessUser() {
        return this.isBusinessUser;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeInt(this.canClose ? 1 : 0);
        dest.writeString(this.startDate);
        dest.writeString(this.endDate);
        dest.writeInt(this.isBusinessUser ? 1 : 0);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.title;
        boolean z = this.canClose;
        java.lang.String str3 = this.startDate;
        java.lang.String str4 = this.endDate;
        boolean z2 = this.isBusinessUser;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityLedgerFilterModel(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", canClose=");
        sb.append(z);
        sb.append(", startDate=");
        sb.append(str3);
        sb.append(", endDate=");
        sb.append(str4);
        sb.append(", isBusinessUser=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.title.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.canClose);
        java.lang.String str = this.startDate;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.endDate;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isBusinessUser);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel activityLedgerFilterModel = (com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, activityLedgerFilterModel.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, activityLedgerFilterModel.title) && this.canClose == activityLedgerFilterModel.canClose && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, activityLedgerFilterModel.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.endDate, activityLedgerFilterModel.endDate) && this.isBusinessUser == activityLedgerFilterModel.isBusinessUser;
    }

    public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel copy(java.lang.String id, java.lang.String title, boolean canClose, java.lang.String startDate, java.lang.String endDate, boolean isBusinessUser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel(id, title, canClose, startDate, endDate, isBusinessUser);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsBusinessUser() {
        return this.isBusinessUser;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getEndDate() {
        return this.endDate;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel[] newArray(int i) {
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCanClose() {
        return this.canClose;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel activityLedgerFilterModel, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityLedgerFilterModel.id;
        }
        if ((i & 2) != 0) {
            str2 = activityLedgerFilterModel.title;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            z = activityLedgerFilterModel.canClose;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str3 = activityLedgerFilterModel.startDate;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = activityLedgerFilterModel.endDate;
        }
        java.lang.String str7 = str4;
        if ((i & 32) != 0) {
            z2 = activityLedgerFilterModel.isBusinessUser;
        }
        return activityLedgerFilterModel.copy(str, str5, z3, str6, str7, z2);
    }
}
