package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010\u0082\u0001\u0002\u0015\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonStyle;", "", "Lcom/paypal/pds/core/Color;", "p0", "", "p1", "p2", "<init>", "(Lcom/paypal/pds/core/Color;II)V", "textColor", "Lcom/paypal/pds/core/Color;", "getTextColor", "()Lcom/paypal/pds/core/Color;", "trackColor", com.visa.cbp.getEncExpo.warmup, "getTrackColor", "()I", "trackProgressColor", "getTrackProgressColor", "Primary", "Outline", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonStyle$Outline;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonStyle$Primary;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ButtonStyle {
    public static final int $stable = 0;
    private final com.paypal.pds.core.Color textColor;
    private final int trackColor;
    private final int trackProgressColor;

    private ButtonStyle(com.paypal.pds.core.Color color, int i, int i2) {
        this.textColor = color;
        this.trackColor = i;
        this.trackProgressColor = i2;
    }

    public final com.paypal.pds.core.Color getTextColor() {
        return this.textColor;
    }

    public final int getTrackColor() {
        return this.trackColor;
    }

    public final int getTrackProgressColor() {
        return this.trackProgressColor;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonStyle$Primary;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Primary extends com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle.Primary INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle.Primary();

        private Primary() {
            super(com.paypal.pds.core.Color.ContentBrandSecondary.INSTANCE, android.R.color.transparent, android.R.color.white, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonStyle$Outline;", "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonStyle;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Outline extends com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle.Outline INSTANCE = new com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle.Outline();

        private Outline() {
            super(com.paypal.pds.core.Color.ContentLink.INSTANCE, android.R.color.transparent, com.paypal.oslo.feature.inappcheckout.R.color.feature_inappcheckout_primary_blue, null);
        }
    }

    public /* synthetic */ ButtonStyle(com.paypal.pds.core.Color color, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(color, i, i2);
    }
}
