package com.paypal.oslo.feature.businesshome.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/Activity;", "", "", "id", "Lcom/paypal/oslo/feature/businesshome/domain/model/Activity$ActivityType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesshome/domain/model/Activity$ActivityType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesshome/domain/model/Activity$ActivityType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesshome/domain/model/Activity$ActivityType;)Lcom/paypal/oslo/feature/businesshome/domain/model/Activity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/businesshome/domain/model/Activity$ActivityType;", "getType", "ActivityType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Activity {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType type;

    public Activity(java.lang.String str, com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType activityType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityType, "");
        this.id = str;
        this.type = activityType;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/Activity$ActivityType;", "", "<init>", "(Ljava/lang/String;I)V", "INVOICE", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.MONEY_REQUEST, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActivityType {
        public static final com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType INVOICE;
        public static final com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType MONEY_REQUEST;
        public static final com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType UNKNOWN;
        private static final /* synthetic */ com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

        private ActivityType(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType activityType = new com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType("INVOICE", 0);
            INVOICE = activityType;
            com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType activityType2 = new com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.MONEY_REQUEST, 1);
            MONEY_REQUEST = activityType2;
            com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType activityType3 = new com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType("UNKNOWN", 2);
            UNKNOWN = activityType3;
            com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType[] activityTypeArr = {activityType, activityType2, activityType3};
            getHighResolutionOutputSizeshNQ4ISI = activityTypeArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(activityTypeArr);
        }

        public static com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType[] values() {
            return (com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType activityType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Activity(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(activityType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.id.hashCode() * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesshome.domain.model.Activity)) {
            return false;
        }
        com.paypal.oslo.feature.businesshome.domain.model.Activity activity = (com.paypal.oslo.feature.businesshome.domain.model.Activity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, activity.id) && this.type == activity.type;
    }

    public final com.paypal.oslo.feature.businesshome.domain.model.Activity copy(java.lang.String id, com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.businesshome.domain.model.Activity(id, type);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesshome.domain.model.Activity copy$default(com.paypal.oslo.feature.businesshome.domain.model.Activity activity, java.lang.String str, com.paypal.oslo.feature.businesshome.domain.model.Activity.ActivityType activityType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activity.id;
        }
        if ((i & 2) != 0) {
            activityType = activity.type;
        }
        return activity.copy(str, activityType);
    }
}
