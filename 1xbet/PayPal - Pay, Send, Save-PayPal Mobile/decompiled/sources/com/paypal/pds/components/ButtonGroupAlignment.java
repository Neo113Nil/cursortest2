package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/pds/components/ButtonGroupAlignment;", "", "<init>", "()V", "Horizontal", "Vertical", "Hug", "Lcom/paypal/pds/components/ButtonGroupAlignment$Horizontal;", "Lcom/paypal/pds/components/ButtonGroupAlignment$Hug;", "Lcom/paypal/pds/components/ButtonGroupAlignment$Vertical;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class ButtonGroupAlignment {
    public static final int $stable = 0;

    private ButtonGroupAlignment() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ButtonGroupAlignment$Horizontal;", "Lcom/paypal/pds/components/ButtonGroupAlignment;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Horizontal extends com.paypal.pds.components.ButtonGroupAlignment {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ButtonGroupAlignment.Horizontal INSTANCE = new com.paypal.pds.components.ButtonGroupAlignment.Horizontal();

        private Horizontal() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ButtonGroupAlignment$Vertical;", "Lcom/paypal/pds/components/ButtonGroupAlignment;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Vertical extends com.paypal.pds.components.ButtonGroupAlignment {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ButtonGroupAlignment.Vertical INSTANCE = new com.paypal.pds.components.ButtonGroupAlignment.Vertical();

        private Vertical() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/pds/components/ButtonGroupAlignment$Hug;", "Lcom/paypal/pds/components/ButtonGroupAlignment;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Hug extends com.paypal.pds.components.ButtonGroupAlignment {
        public static final int $stable = 0;
        public static final com.paypal.pds.components.ButtonGroupAlignment.Hug INSTANCE = new com.paypal.pds.components.ButtonGroupAlignment.Hug();

        private Hug() {
            super(null);
        }
    }

    public /* synthetic */ ButtonGroupAlignment(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
