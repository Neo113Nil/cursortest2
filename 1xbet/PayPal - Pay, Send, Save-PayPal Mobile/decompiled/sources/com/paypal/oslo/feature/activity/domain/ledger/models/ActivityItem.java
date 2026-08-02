package com.paypal.oslo.feature.activity.domain.ledger.models;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048'X§\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\t8'X¦\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0006\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "", "<init>", "()V", "", "getUniqueID", "()J", "getUniqueID$annotations", "uniqueID", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityBaseSection;", "getData", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityBaseSection;", "getData$annotations", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "UpcomingItemsSection", "SectionHeader", "DateHeader", "DayOfWeekHeader", "Transaction", "TransactionWithActionCard", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$DateHeader;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$DayOfWeekHeader;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$SectionHeader;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$Transaction;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$TransactionWithActionCard;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$UpcomingItemsSection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ActivityItem {
    public static final int $stable = 0;

    public static /* synthetic */ void getData$annotations() {
    }

    @kotlinx.serialization.Transient
    public static /* synthetic */ void getUniqueID$annotations() {
    }

    public abstract com.paypal.oslo.feature.activity.domain.ledger.models.ActivityBaseSection getData();

    public abstract long getUniqueID();

    private ActivityItem() {
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$UpcomingItemsSection;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityLedgerUpcomingSectionItems;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "uniqueID", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityLedgerUpcomingSectionItems;J)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityLedgerUpcomingSectionItems;", "component2", "()J", "copy", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityLedgerUpcomingSectionItems;J)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$UpcomingItemsSection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityLedgerUpcomingSectionItems;", "getData", "J", "getUniqueID", "getUniqueID$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpcomingItemsSection extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityLedgerUpcomingSectionItems data;
        private final long uniqueID;

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getUniqueID$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpcomingItemsSection(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityLedgerUpcomingSectionItems activityLedgerUpcomingSectionItems, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerUpcomingSectionItems, "");
            this.data = activityLedgerUpcomingSectionItems;
            this.uniqueID = j;
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityLedgerUpcomingSectionItems getData() {
            return this.data;
        }

        public /* synthetic */ UpcomingItemsSection(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityLedgerUpcomingSectionItems activityLedgerUpcomingSectionItems, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(activityLedgerUpcomingSectionItems, (i & 2) != 0 ? com.paypal.oslo.feature.activity.domain.base.utils.ActivityItemUniqueIDTimestampProvider.INSTANCE.generateTimestamp$activity_prodRelease() : j);
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final long getUniqueID() {
            return this.uniqueID;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityLedgerUpcomingSectionItems activityLedgerUpcomingSectionItems = this.data;
            long j = this.uniqueID;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpcomingItemsSection(data=");
            sb.append(activityLedgerUpcomingSectionItems);
            sb.append(", uniqueID=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + java.lang.Long.hashCode(this.uniqueID);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.UpcomingItemsSection)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.UpcomingItemsSection upcomingItemsSection = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.UpcomingItemsSection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, upcomingItemsSection.data) && this.uniqueID == upcomingItemsSection.uniqueID;
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.UpcomingItemsSection copy(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityLedgerUpcomingSectionItems data, long uniqueID) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.UpcomingItemsSection(data, uniqueID);
        }

        /* renamed from: component2, reason: from getter */
        public final long getUniqueID() {
            return this.uniqueID;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityLedgerUpcomingSectionItems getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.UpcomingItemsSection copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.UpcomingItemsSection upcomingItemsSection, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityLedgerUpcomingSectionItems activityLedgerUpcomingSectionItems, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityLedgerUpcomingSectionItems = upcomingItemsSection.data;
            }
            if ((i & 2) != 0) {
                j = upcomingItemsSection.uniqueID;
            }
            return upcomingItemsSection.copy(activityLedgerUpcomingSectionItems, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$SectionHeader;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "uniqueID", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;J)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;", "component2", "()J", "copy", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;J)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$SectionHeader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;", "getData", "J", "getUniqueID", "getUniqueID$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SectionHeader extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel data;
        private final long uniqueID;

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getUniqueID$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SectionHeader(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel activityDateHeaderModel, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDateHeaderModel, "");
            this.data = activityDateHeaderModel;
            this.uniqueID = j;
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel getData() {
            return this.data;
        }

        public /* synthetic */ SectionHeader(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel activityDateHeaderModel, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(activityDateHeaderModel, (i & 2) != 0 ? com.paypal.oslo.feature.activity.domain.base.utils.ActivityItemUniqueIDTimestampProvider.INSTANCE.generateTimestamp$activity_prodRelease() : j);
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final long getUniqueID() {
            return this.uniqueID;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel activityDateHeaderModel = this.data;
            long j = this.uniqueID;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionHeader(data=");
            sb.append(activityDateHeaderModel);
            sb.append(", uniqueID=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + java.lang.Long.hashCode(this.uniqueID);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.SectionHeader)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.SectionHeader sectionHeader = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.SectionHeader) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, sectionHeader.data) && this.uniqueID == sectionHeader.uniqueID;
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.SectionHeader copy(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel data, long uniqueID) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.SectionHeader(data, uniqueID);
        }

        /* renamed from: component2, reason: from getter */
        public final long getUniqueID() {
            return this.uniqueID;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.SectionHeader copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.SectionHeader sectionHeader, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel activityDateHeaderModel, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDateHeaderModel = sectionHeader.data;
            }
            if ((i & 2) != 0) {
                j = sectionHeader.uniqueID;
            }
            return sectionHeader.copy(activityDateHeaderModel, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$DateHeader;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "uniqueID", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;J)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;", "component2", "()J", "copy", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;J)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$DateHeader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDateHeaderModel;", "getData", "J", "getUniqueID", "getUniqueID$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateHeader extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel data;
        private final long uniqueID;

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getUniqueID$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DateHeader(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel activityDateHeaderModel, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDateHeaderModel, "");
            this.data = activityDateHeaderModel;
            this.uniqueID = j;
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel getData() {
            return this.data;
        }

        public /* synthetic */ DateHeader(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel activityDateHeaderModel, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(activityDateHeaderModel, (i & 2) != 0 ? com.paypal.oslo.feature.activity.domain.base.utils.ActivityItemUniqueIDTimestampProvider.INSTANCE.generateTimestamp$activity_prodRelease() : j);
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final long getUniqueID() {
            return this.uniqueID;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel activityDateHeaderModel = this.data;
            long j = this.uniqueID;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DateHeader(data=");
            sb.append(activityDateHeaderModel);
            sb.append(", uniqueID=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + java.lang.Long.hashCode(this.uniqueID);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader dateHeader = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, dateHeader.data) && this.uniqueID == dateHeader.uniqueID;
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader copy(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel data, long uniqueID) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader(data, uniqueID);
        }

        /* renamed from: component2, reason: from getter */
        public final long getUniqueID() {
            return this.uniqueID;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader dateHeader, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel activityDateHeaderModel, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDateHeaderModel = dateHeader.data;
            }
            if ((i & 2) != 0) {
                j = dateHeader.uniqueID;
            }
            return dateHeader.copy(activityDateHeaderModel, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$DayOfWeekHeader;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDayOfWeekHeaderModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "uniqueID", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDayOfWeekHeaderModel;J)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDayOfWeekHeaderModel;", "component2", "()J", "copy", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDayOfWeekHeaderModel;J)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$DayOfWeekHeader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityDayOfWeekHeaderModel;", "getData", "J", "getUniqueID", "getUniqueID$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DayOfWeekHeader extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel data;
        private final long uniqueID;

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getUniqueID$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DayOfWeekHeader(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel activityDayOfWeekHeaderModel, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDayOfWeekHeaderModel, "");
            this.data = activityDayOfWeekHeaderModel;
            this.uniqueID = j;
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel getData() {
            return this.data;
        }

        public /* synthetic */ DayOfWeekHeader(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel activityDayOfWeekHeaderModel, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(activityDayOfWeekHeaderModel, (i & 2) != 0 ? com.paypal.oslo.feature.activity.domain.base.utils.ActivityItemUniqueIDTimestampProvider.INSTANCE.generateTimestamp$activity_prodRelease() : j);
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final long getUniqueID() {
            return this.uniqueID;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel activityDayOfWeekHeaderModel = this.data;
            long j = this.uniqueID;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DayOfWeekHeader(data=");
            sb.append(activityDayOfWeekHeaderModel);
            sb.append(", uniqueID=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + java.lang.Long.hashCode(this.uniqueID);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DayOfWeekHeader)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DayOfWeekHeader dayOfWeekHeader = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DayOfWeekHeader) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, dayOfWeekHeader.data) && this.uniqueID == dayOfWeekHeader.uniqueID;
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DayOfWeekHeader copy(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel data, long uniqueID) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DayOfWeekHeader(data, uniqueID);
        }

        /* renamed from: component2, reason: from getter */
        public final long getUniqueID() {
            return this.uniqueID;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DayOfWeekHeader copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DayOfWeekHeader dayOfWeekHeader, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDayOfWeekHeaderModel activityDayOfWeekHeaderModel, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityDayOfWeekHeaderModel = dayOfWeekHeader.data;
            }
            if ((i & 2) != 0) {
                j = dayOfWeekHeader.uniqueID;
            }
            return dayOfWeekHeader.copy(activityDayOfWeekHeaderModel, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR \u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$Transaction;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "uniqueID", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;J)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "component2", "()J", "copy", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;J)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$Transaction;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "getData", "J", "getUniqueID", "getUniqueID$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Transaction extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel data;
        private final long uniqueID;

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getUniqueID$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transaction(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
            this.data = activityTransactionModel;
            this.uniqueID = j;
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel getData() {
            return this.data;
        }

        public /* synthetic */ Transaction(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(activityTransactionModel, (i & 2) != 0 ? com.paypal.oslo.feature.activity.domain.base.utils.ActivityItemUniqueIDTimestampProvider.INSTANCE.generateTimestamp$activity_prodRelease() : j);
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final long getUniqueID() {
            return this.uniqueID;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel = this.data;
            long j = this.uniqueID;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Transaction(data=");
            sb.append(activityTransactionModel);
            sb.append(", uniqueID=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + java.lang.Long.hashCode(this.uniqueID);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction transaction = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, transaction.data) && this.uniqueID == transaction.uniqueID;
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction copy(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel data, long uniqueID) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction(data, uniqueID);
        }

        /* renamed from: component2, reason: from getter */
        public final long getUniqueID() {
            return this.uniqueID;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction transaction, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityTransactionModel = transaction.data;
            }
            if ((i & 2) != 0) {
                j = transaction.uniqueID;
            }
            return transaction.copy(activityTransactionModel, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR \u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$TransactionWithActionCard;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActionCardModel;", "actionCard", "", "uniqueID", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActionCardModel;J)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "component2", "()Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActionCardModel;", "component3", "()J", "copy", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActionCardModel;J)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$TransactionWithActionCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "getData", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActionCardModel;", "getActionCard", "J", "getUniqueID", "getUniqueID$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionWithActionCard extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel actionCard;
        private final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel data;
        private final long uniqueID;

        @kotlinx.serialization.Transient
        public static /* synthetic */ void getUniqueID$annotations() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionWithActionCard(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel actionCardModel, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionCardModel, "");
            this.data = activityTransactionModel;
            this.actionCard = actionCardModel;
            this.uniqueID = j;
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel getData() {
            return this.data;
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel getActionCard() {
            return this.actionCard;
        }

        public /* synthetic */ TransactionWithActionCard(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel actionCardModel, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(activityTransactionModel, actionCardModel, (i & 4) != 0 ? com.paypal.oslo.feature.activity.domain.base.utils.ActivityItemUniqueIDTimestampProvider.INSTANCE.generateTimestamp$activity_prodRelease() : j);
        }

        @Override // com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem
        public final long getUniqueID() {
            return this.uniqueID;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel = this.data;
            com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel actionCardModel = this.actionCard;
            long j = this.uniqueID;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionWithActionCard(data=");
            sb.append(activityTransactionModel);
            sb.append(", actionCard=");
            sb.append(actionCardModel);
            sb.append(", uniqueID=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.data.hashCode() * 31) + this.actionCard.hashCode()) * 31) + java.lang.Long.hashCode(this.uniqueID);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard)) {
                return false;
            }
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard transactionWithActionCard = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, transactionWithActionCard.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.actionCard, transactionWithActionCard.actionCard) && this.uniqueID == transactionWithActionCard.uniqueID;
        }

        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard copy(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel data, com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel actionCard, long uniqueID) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionCard, "");
            return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard(data, actionCard, uniqueID);
        }

        /* renamed from: component3, reason: from getter */
        public final long getUniqueID() {
            return this.uniqueID;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel getActionCard() {
            return this.actionCard;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard copy$default(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard transactionWithActionCard, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel actionCardModel, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                activityTransactionModel = transactionWithActionCard.data;
            }
            if ((i & 2) != 0) {
                actionCardModel = transactionWithActionCard.actionCard;
            }
            if ((i & 4) != 0) {
                j = transactionWithActionCard.uniqueID;
            }
            return transactionWithActionCard.copy(activityTransactionModel, actionCardModel, j);
        }
    }

    public /* synthetic */ ActivityItem(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
