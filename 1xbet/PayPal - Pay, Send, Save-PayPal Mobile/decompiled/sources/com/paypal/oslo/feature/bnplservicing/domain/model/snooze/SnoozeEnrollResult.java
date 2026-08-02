package com.paypal.oslo.feature.bnplservicing.domain.model.snooze;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult$EnrollmentStatus;", "status", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult$EnrollmentStatus;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult$EnrollmentStatus;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult$EnrollmentStatus;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult$EnrollmentStatus;", "getStatus", "EnrollmentStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SnoozeEnrollResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult$EnrollmentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "PENDING_ENROLLMENT", "ENROLLED", "NO_LONGER_ELIGIBLE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EnrollmentStatus {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus.Companion INSTANCE;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus ENROLLED;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus NO_LONGER_ELIGIBLE;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus PENDING_ENROLLMENT;
        public static final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus UNKNOWN;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus[] getHighSpeedVideoSizes;

        private EnrollmentStatus(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus enrollmentStatus = new com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus("PENDING_ENROLLMENT", 0);
            PENDING_ENROLLMENT = enrollmentStatus;
            com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus enrollmentStatus2 = new com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus("ENROLLED", 1);
            ENROLLED = enrollmentStatus2;
            com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus enrollmentStatus3 = new com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus("NO_LONGER_ELIGIBLE", 2);
            NO_LONGER_ELIGIBLE = enrollmentStatus3;
            com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus enrollmentStatus4 = new com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus("UNKNOWN", 3);
            UNKNOWN = enrollmentStatus4;
            com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus[] enrollmentStatusArr = {enrollmentStatus, enrollmentStatus2, enrollmentStatus3, enrollmentStatus4};
            getHighSpeedVideoSizes = enrollmentStatusArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(enrollmentStatusArr);
            INSTANCE = new com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus.Companion(null);
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult$EnrollmentStatus$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult$EnrollmentStatus;", "from", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/snooze/SnoozeEnrollResult$EnrollmentStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus from(java.lang.String value) {
                java.lang.Object obj;
                java.util.Iterator<E> it = com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus) obj).name(), value)) {
                        break;
                    }
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus enrollmentStatus = (com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus) obj;
                return enrollmentStatus == null ? com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus.UNKNOWN : enrollmentStatus;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus[] values() {
            return (com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus[]) getHighSpeedVideoSizes.clone();
        }

        public static com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    public SnoozeEnrollResult(com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus enrollmentStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentStatus, "");
        this.status = enrollmentStatus;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus enrollmentStatus = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SnoozeEnrollResult(status=");
        sb.append(enrollmentStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult) && this.status == ((com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult) other).status;
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult copy(com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult(status);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult snoozeEnrollResult, com.paypal.oslo.feature.bnplservicing.domain.model.snooze.SnoozeEnrollResult.EnrollmentStatus enrollmentStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            enrollmentStatus = snoozeEnrollResult.status;
        }
        return snoozeEnrollResult.copy(enrollmentStatus);
    }
}
