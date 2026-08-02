package com.paypal.android.threeds.ui.customization;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR*\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012"}, d2 = {"Lcom/paypal/android/threeds/ui/customization/TextBoxCustomization;", "Lcom/paypal/android/threeds/ui/customization/Customization;", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "borderWidth", com.visa.cbp.getEncExpo.warmup, "getBorderWidth", "()I", "setBorderWidth", "(I)V", "", "borderColor", "Ljava/lang/String;", "getBorderColor", "()Ljava/lang/String;", "setBorderColor", "(Ljava/lang/String;)V", "cornerRadius", "getCornerRadius", "setCornerRadius", "hintTextColor", "getHintTextColor", "setHintTextColor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TextBoxCustomization extends com.paypal.android.threeds.ui.customization.Customization {
    public static final int $stable = 8;
    private int borderWidth = 2;
    private java.lang.String borderColor = "#FFBDBDBD";
    private int cornerRadius = 5;
    private java.lang.String hintTextColor = "#FF757575";

    public final int getBorderWidth() {
        return this.borderWidth;
    }

    public final void setBorderWidth(int i) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        this.borderWidth = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.requireValidSizeOrDimension(i);
    }

    public final java.lang.String getBorderColor() {
        return this.borderColor;
    }

    public final void setBorderColor(java.lang.String str) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.borderColor = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.requireValidColor(str);
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final void setCornerRadius(int i) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        this.cornerRadius = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.requireValidSizeOrDimension(i);
    }

    public final java.lang.String getHintTextColor() {
        return this.hintTextColor;
    }

    public final void setHintTextColor(java.lang.String str) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.hintTextColor = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.requireValidColor(str);
    }
}
