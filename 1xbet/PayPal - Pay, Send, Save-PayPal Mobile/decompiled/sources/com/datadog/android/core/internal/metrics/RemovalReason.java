package com.datadog.android.core.internal.metrics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010"}, d2 = {"Lcom/datadog/android/core/internal/metrics/RemovalReason;", "", "<init>", "()V", "", "includeInMetrics$dd_sdk_android_core_release", "()Z", "Flushed", "IntakeCode", "Invalid", "Obsolete", "Purged", "Lcom/datadog/android/core/internal/metrics/RemovalReason$Flushed;", "Lcom/datadog/android/core/internal/metrics/RemovalReason$IntakeCode;", "Lcom/datadog/android/core/internal/metrics/RemovalReason$Invalid;", "Lcom/datadog/android/core/internal/metrics/RemovalReason$Obsolete;", "Lcom/datadog/android/core/internal/metrics/RemovalReason$Purged;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RemovalReason {
    private RemovalReason() {
    }

    public final boolean includeInMetrics$dd_sdk_android_core_release() {
        return !(this instanceof com.datadog.android.core.internal.metrics.RemovalReason.Flushed);
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/datadog/android/core/internal/metrics/RemovalReason$IntakeCode;", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "", "responseCode", "<init>", "(I)V", "copy", "(I)Lcom/datadog/android/core/internal/metrics/RemovalReason$IntakeCode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class IntakeCode extends com.datadog.android.core.internal.metrics.RemovalReason {

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final int getHighSpeedVideoFpsRanges;

        public IntakeCode(int i) {
            super(null);
            this.getHighSpeedVideoFpsRanges = i;
        }

        public final java.lang.String toString() {
            return "intake-code-".concat(java.lang.String.valueOf(this.getHighSpeedVideoFpsRanges));
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.getHighSpeedVideoFpsRanges);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.datadog.android.core.internal.metrics.RemovalReason.IntakeCode) && this.getHighSpeedVideoFpsRanges == ((com.datadog.android.core.internal.metrics.RemovalReason.IntakeCode) other).getHighSpeedVideoFpsRanges;
        }

        public final com.datadog.android.core.internal.metrics.RemovalReason.IntakeCode copy(int responseCode) {
            return new com.datadog.android.core.internal.metrics.RemovalReason.IntakeCode(responseCode);
        }

        public static /* synthetic */ com.datadog.android.core.internal.metrics.RemovalReason.IntakeCode copy$default(com.datadog.android.core.internal.metrics.RemovalReason.IntakeCode intakeCode, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = intakeCode.getHighSpeedVideoFpsRanges;
            }
            return intakeCode.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/core/internal/metrics/RemovalReason$Invalid;", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Invalid extends com.datadog.android.core.internal.metrics.RemovalReason {
        public static final com.datadog.android.core.internal.metrics.RemovalReason.Invalid INSTANCE = new com.datadog.android.core.internal.metrics.RemovalReason.Invalid();

        private Invalid() {
            super(null);
        }

        public final java.lang.String toString() {
            return "invalid";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/core/internal/metrics/RemovalReason$Purged;", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Purged extends com.datadog.android.core.internal.metrics.RemovalReason {
        public static final com.datadog.android.core.internal.metrics.RemovalReason.Purged INSTANCE = new com.datadog.android.core.internal.metrics.RemovalReason.Purged();

        private Purged() {
            super(null);
        }

        public final java.lang.String toString() {
            return "purged";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/core/internal/metrics/RemovalReason$Obsolete;", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Obsolete extends com.datadog.android.core.internal.metrics.RemovalReason {
        public static final com.datadog.android.core.internal.metrics.RemovalReason.Obsolete INSTANCE = new com.datadog.android.core.internal.metrics.RemovalReason.Obsolete();

        private Obsolete() {
            super(null);
        }

        public final java.lang.String toString() {
            return "obsolete";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/core/internal/metrics/RemovalReason$Flushed;", "Lcom/datadog/android/core/internal/metrics/RemovalReason;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Flushed extends com.datadog.android.core.internal.metrics.RemovalReason {
        public static final com.datadog.android.core.internal.metrics.RemovalReason.Flushed INSTANCE = new com.datadog.android.core.internal.metrics.RemovalReason.Flushed();

        private Flushed() {
            super(null);
        }

        public final java.lang.String toString() {
            return "flushed";
        }
    }

    public /* synthetic */ RemovalReason(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
