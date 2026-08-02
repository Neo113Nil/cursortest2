package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/components/ActivityTransactionAmountColor;", "", "Lcom/paypal/pds/core/Color;", "p0", "<init>", "(Lcom/paypal/pds/core/Color;)V", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lcom/paypal/pds/core/Color;", "getColor", "()Lcom/paypal/pds/core/Color;", "Default", "Green", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/components/ActivityTransactionAmountColor$Default;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/components/ActivityTransactionAmountColor$Green;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ActivityTransactionAmountColor {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color color;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/components/ActivityTransactionAmountColor$Default;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/components/ActivityTransactionAmountColor;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Default extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default();

        public final int hashCode() {
            return -206549390;
        }

        private Default() {
            super(com.paypal.pds.core.Color.ContentBase.INSTANCE, null);
        }

        public final java.lang.String toString() {
            return "Default";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Default)) {
                return false;
            }
            return true;
        }
    }

    private ActivityTransactionAmountColor(com.paypal.pds.core.Color color) {
        this.color = color;
    }

    public final com.paypal.pds.core.Color getColor() {
        return this.color;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/components/ActivityTransactionAmountColor$Green;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/components/ActivityTransactionAmountColor;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Green extends com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Green INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Green();

        public final int hashCode() {
            return 1710202740;
        }

        private Green() {
            super(com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, null);
        }

        public final java.lang.String toString() {
            return "Green";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityTransactionAmountColor.Green)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ActivityTransactionAmountColor(com.paypal.pds.core.Color color, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color);
    }
}
