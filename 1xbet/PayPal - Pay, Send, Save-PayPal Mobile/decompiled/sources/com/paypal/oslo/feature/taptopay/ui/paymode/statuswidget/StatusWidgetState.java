package com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState;", "", "<init>", "()V", "Resting", "Success", "Error", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState$Error;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState$Resting;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class StatusWidgetState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState$Resting;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Resting extends com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Resting INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Resting();

        private Resting() {
            super(null);
        }
    }

    private StatusWidgetState() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState$Success;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Success extends com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Success INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Success();

        private Success() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState$Error;", "Lcom/paypal/oslo/feature/taptopay/ui/paymode/statuswidget/StatusWidgetState;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Error extends com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Error INSTANCE = new com.paypal.oslo.feature.taptopay.ui.paymode.statuswidget.StatusWidgetState.Error();

        private Error() {
            super(null);
        }
    }

    public /* synthetic */ StatusWidgetState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
