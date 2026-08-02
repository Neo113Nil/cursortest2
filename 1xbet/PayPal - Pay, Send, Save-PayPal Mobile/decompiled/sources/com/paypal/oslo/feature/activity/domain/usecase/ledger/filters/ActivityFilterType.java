package com.paypal.oslo.feature.activity.domain.usecase.ledger.filters;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B!\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\n\u001a\u001b\u001c\u001d\u001e\u001f !\"#"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "Landroid/os/Parcelable;", "", "p0", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityLedgerFilterModel;", "p1", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityLedgerFilterModel;)V", "filterKey", "Ljava/lang/String;", "getFilterKey", "()Ljava/lang/String;", "filterModel", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityLedgerFilterModel;", "getFilterModel", "()Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityLedgerFilterModel;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PACKAGES, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PURCHASES, "SentAndReceived", "ThisMonth", "ThreeMonth", "PastMonth", "PaymentsReceived", "PaymentsSent", "CustomDateRange", "Default", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$CustomDateRange;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$Default;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$Packages;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$PastMonth;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$PaymentsReceived;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$PaymentsSent;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$Purchases;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$SentAndReceived;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$ThisMonth;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$ThreeMonth;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivityFilterType implements android.os.Parcelable {
    public static final int $stable = 0;
    private final java.lang.String filterKey;
    private final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel filterModel;

    private ActivityFilterType(java.lang.String str, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel activityLedgerFilterModel) {
        this.filterKey = str;
        this.filterModel = activityLedgerFilterModel;
    }

    public /* synthetic */ ActivityFilterType(java.lang.String str, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel activityLedgerFilterModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : activityLedgerFilterModel, null);
    }

    public java.lang.String getFilterKey() {
        return this.filterKey;
    }

    public com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel getFilterModel() {
        return this.filterModel;
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$Packages;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "", "filterKey", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$Packages;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFilterKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Packages extends com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages> CREATOR = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages.Creator();
        private final java.lang.String filterKey;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Packages(java.lang.String str) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filterKey = str;
        }

        public /* synthetic */ Packages(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_PACKAGES : str);
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.filterKey);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filterKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Packages(filterKey=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterKey, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages) other).filterKey);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages[] newArray(int i) {
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages(parcel.readString());
            }
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages copy(java.lang.String filterKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterKey, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages(filterKey);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages packages, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = packages.filterKey;
            }
            return packages.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Packages() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$Purchases;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "", "filterKey", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$Purchases;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFilterKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Purchases extends com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases> CREATOR = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases.Creator();
        private final java.lang.String filterKey;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Purchases(java.lang.String str) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filterKey = str;
        }

        public /* synthetic */ Purchases(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_PURCHASES : str);
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.filterKey);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filterKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Purchases(filterKey=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterKey, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases) other).filterKey);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases[] newArray(int i) {
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases(parcel.readString());
            }
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases copy(java.lang.String filterKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterKey, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases(filterKey);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Purchases purchases, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = purchases.filterKey;
            }
            return purchases.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Purchases() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$SentAndReceived;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "", "filterKey", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$SentAndReceived;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFilterKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SentAndReceived extends com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived> CREATOR = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived.Creator();
        private final java.lang.String filterKey;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SentAndReceived(java.lang.String str) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filterKey = str;
        }

        public /* synthetic */ SentAndReceived(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_SENT_AND_RECEIVED : str);
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.filterKey);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filterKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SentAndReceived(filterKey=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterKey, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived) other).filterKey);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived[] newArray(int i) {
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived(parcel.readString());
            }
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived copy(java.lang.String filterKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterKey, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived(filterKey);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.SentAndReceived sentAndReceived, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sentAndReceived.filterKey;
            }
            return sentAndReceived.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SentAndReceived() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$ThisMonth;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "", "filterKey", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$ThisMonth;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFilterKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThisMonth extends com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth> CREATOR = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth.Creator();
        private final java.lang.String filterKey;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ThisMonth(java.lang.String str) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filterKey = str;
        }

        public /* synthetic */ ThisMonth(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_THIS_MONTH : str);
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.filterKey);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filterKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThisMonth(filterKey=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterKey, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth) other).filterKey);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth[] newArray(int i) {
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth(parcel.readString());
            }
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth copy(java.lang.String filterKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterKey, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth(filterKey);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThisMonth thisMonth, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = thisMonth.filterKey;
            }
            return thisMonth.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ThisMonth() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$ThreeMonth;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "", "filterKey", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$ThreeMonth;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFilterKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ThreeMonth extends com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth> CREATOR = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth.Creator();
        private final java.lang.String filterKey;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ThreeMonth(java.lang.String str) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filterKey = str;
        }

        public /* synthetic */ ThreeMonth(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_THREE_MONTHS : str);
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.filterKey);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filterKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreeMonth(filterKey=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterKey, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth) other).filterKey);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth[] newArray(int i) {
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth(parcel.readString());
            }
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth copy(java.lang.String filterKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterKey, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth(filterKey);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.ThreeMonth threeMonth, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = threeMonth.filterKey;
            }
            return threeMonth.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ThreeMonth() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$PastMonth;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "", "filterKey", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$PastMonth;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFilterKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PastMonth extends com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth> CREATOR = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth.Creator();
        private final java.lang.String filterKey;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PastMonth(java.lang.String str) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filterKey = str;
        }

        public /* synthetic */ PastMonth(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_PAST_MONTH : str);
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.filterKey);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filterKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PastMonth(filterKey=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterKey, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth) other).filterKey);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth[] newArray(int i) {
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth(parcel.readString());
            }
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth copy(java.lang.String filterKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterKey, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth(filterKey);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PastMonth pastMonth, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pastMonth.filterKey;
            }
            return pastMonth.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PastMonth() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$PaymentsReceived;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "", "filterKey", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$PaymentsReceived;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFilterKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentsReceived extends com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived> CREATOR = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived.Creator();
        private final java.lang.String filterKey;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PaymentsReceived(java.lang.String str) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filterKey = str;
        }

        public /* synthetic */ PaymentsReceived(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "CREDIT" : str);
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.filterKey);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filterKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentsReceived(filterKey=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterKey, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived) other).filterKey);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived[] newArray(int i) {
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived(parcel.readString());
            }
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived copy(java.lang.String filterKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterKey, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived(filterKey);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsReceived paymentsReceived, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentsReceived.filterKey;
            }
            return paymentsReceived.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PaymentsReceived() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$PaymentsSent;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "", "filterKey", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$PaymentsSent;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFilterKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentsSent extends com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent> CREATOR = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent.Creator();
        private final java.lang.String filterKey;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PaymentsSent(java.lang.String str) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filterKey = str;
        }

        public /* synthetic */ PaymentsSent(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "DEBIT" : str);
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.filterKey);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filterKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentsSent(filterKey=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterKey, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent) other).filterKey);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent[] newArray(int i) {
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent(parcel.readString());
            }
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent copy(java.lang.String filterKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterKey, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent(filterKey);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.PaymentsSent paymentsSent, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentsSent.filterKey;
            }
            return paymentsSent.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PaymentsSent() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$CustomDateRange;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "", "filterKey", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityLedgerFilterModel;", "filterModel", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityLedgerFilterModel;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityLedgerFilterModel;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityLedgerFilterModel;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$CustomDateRange;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFilterKey", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityLedgerFilterModel;", "getFilterModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomDateRange extends com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange> CREATOR = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange.Creator();
        private final java.lang.String filterKey;
        private final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel filterModel;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CustomDateRange(java.lang.String str, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel activityLedgerFilterModel) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filterKey = str;
            this.filterModel = activityLedgerFilterModel;
        }

        public /* synthetic */ CustomDateRange(java.lang.String str, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel activityLedgerFilterModel, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_CUSTOM_DATE_RANGE : str, activityLedgerFilterModel);
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel getFilterModel() {
            return this.filterModel;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.filterKey);
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel activityLedgerFilterModel = this.filterModel;
            if (activityLedgerFilterModel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                activityLedgerFilterModel.writeToParcel(dest, flags);
            }
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filterKey;
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel activityLedgerFilterModel = this.filterModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomDateRange(filterKey=");
            sb.append(str);
            sb.append(", filterModel=");
            sb.append(activityLedgerFilterModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.filterKey.hashCode();
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel activityLedgerFilterModel = this.filterModel;
            return (hashCode * 31) + (activityLedgerFilterModel == null ? 0 : activityLedgerFilterModel.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange customDateRange = (com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.filterKey, customDateRange.filterKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterModel, customDateRange.filterModel);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange[] newArray(int i) {
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange(parcel.readString(), parcel.readInt() == 0 ? null : com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel.CREATOR.createFromParcel(parcel));
            }
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange copy(java.lang.String filterKey, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel filterModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterKey, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange(filterKey, filterModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel getFilterModel() {
            return this.filterModel;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.CustomDateRange customDateRange, java.lang.String str, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel activityLedgerFilterModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = customDateRange.filterKey;
            }
            if ((i & 2) != 0) {
                activityLedgerFilterModel = customDateRange.filterModel;
            }
            return customDateRange.copy(str, activityLedgerFilterModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$Default;", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "", "filterKey", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType$Default;", "", "describeContents", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFilterKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Default extends com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType {
        public static final int $stable = 0;
        public static final android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default> CREATOR = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default.Creator();
        private final java.lang.String filterKey;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Default(java.lang.String str) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.filterKey = str;
        }

        public /* synthetic */ Default(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT : str);
        }

        @Override // com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.filterKey);
        }

        public final java.lang.String toString() {
            java.lang.String str = this.filterKey;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Default(filterKey=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.filterKey.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterKey, ((com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default) other).filterKey);
        }

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class Creator implements android.os.Parcelable.Creator<com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default[] newArray(int i) {
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(parcel.readString());
            }
        }

        public final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default copy(java.lang.String filterKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterKey, "");
            return new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(filterKey);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFilterKey() {
            return this.filterKey;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default copy$default(com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default r0, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = r0.filterKey;
            }
            return r0.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Default() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ ActivityFilterType(java.lang.String str, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityLedgerFilterModel activityLedgerFilterModel, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, activityLedgerFilterModel);
    }
}
