package com.paypal.oslo.feature.qrc.ui.enrollment;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "EligibilitySuccess", "EligibilityFailed", "EnrollmentSuccess", "EnrollmentFailed", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent$EligibilityFailed;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent$EligibilitySuccess;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent$EnrollmentFailed;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent$EnrollmentSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class EnrollmentEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private EnrollmentEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent$EligibilitySuccess;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibilitySuccess extends com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilitySuccess INSTANCE = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilitySuccess();

        public final int hashCode() {
            return 1528344059;
        }

        private EligibilitySuccess() {
            super("EnrollmentEvent.EligibilitySuccess", null);
        }

        public final java.lang.String toString() {
            return "EligibilitySuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilitySuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent$EligibilityFailed;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibilityFailed extends com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilityFailed INSTANCE = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilityFailed();

        public final int hashCode() {
            return -2003728571;
        }

        private EligibilityFailed() {
            super("EnrollmentEvent.EligibilityFailed", null);
        }

        public final java.lang.String toString() {
            return "EligibilityFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EligibilityFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent$EnrollmentSuccess;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnrollmentSuccess extends com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentSuccess INSTANCE = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentSuccess();

        public final int hashCode() {
            return -1663366790;
        }

        private EnrollmentSuccess() {
            super("EnrollmentEvent.EnrollmentSuccess", null);
        }

        public final java.lang.String toString() {
            return "EnrollmentSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent$EnrollmentFailed;", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EnrollmentFailed extends com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentFailed INSTANCE = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentFailed();

        public final int hashCode() {
            return 1634090982;
        }

        private EnrollmentFailed() {
            super("EnrollmentEvent.EnrollmentFailed", null);
        }

        public final java.lang.String toString() {
            return "EnrollmentFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentEvent.EnrollmentFailed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ EnrollmentEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
