package com.paypal.oslo.feature.activity.domain.common.deeplink;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\bJ\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/deeplink/ActivityLedgerDeepLinkDto;", "Landroid/os/Parcelable;", "", "startDate", "endDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/common/deeplink/ActivityLedgerDeepLinkDto;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStartDate", "getEndDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityLedgerDeepLinkDto implements android.os.Parcelable {
    public static final int $stable = 0;
    public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto> CREATOR = new com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto.Creator();
    private final java.lang.String endDate;
    private final java.lang.String startDate;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ActivityLedgerDeepLinkDto(java.lang.String str, java.lang.String str2) {
        this.startDate = str;
        this.endDate = str2;
    }

    public /* synthetic */ ActivityLedgerDeepLinkDto(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public final java.lang.String getEndDate() {
        return this.endDate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.startDate);
        dest.writeString(this.endDate);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.startDate;
        java.lang.String str2 = this.endDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityLedgerDeepLinkDto(startDate=");
        sb.append(str);
        sb.append(", endDate=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.startDate;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.endDate;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto activityLedgerDeepLinkDto = (com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, activityLedgerDeepLinkDto.startDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.endDate, activityLedgerDeepLinkDto.endDate);
    }

    public final com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto copy(java.lang.String startDate, java.lang.String endDate) {
        return new com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto(startDate, endDate);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto[] newArray(int i) {
            return new com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto(parcel.readString(), parcel.readString());
        }
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEndDate() {
        return this.endDate;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto copy$default(com.paypal.oslo.feature.activity.domain.common.deeplink.ActivityLedgerDeepLinkDto activityLedgerDeepLinkDto, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityLedgerDeepLinkDto.startDate;
        }
        if ((i & 2) != 0) {
            str2 = activityLedgerDeepLinkDto.endDate;
        }
        return activityLedgerDeepLinkDto.copy(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityLedgerDeepLinkDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
