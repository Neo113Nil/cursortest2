package com.paypal.android.threeds.ui.customization;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/android/threeds/ui/customization/LabelCustomization;", "Lcom/paypal/android/threeds/ui/customization/Customization;", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "headingTextColor", "Ljava/lang/String;", "getHeadingTextColor", "()Ljava/lang/String;", "setHeadingTextColor", "(Ljava/lang/String;)V", "headingTextFontName", "getHeadingTextFontName", "setHeadingTextFontName", "", "headingTextFontSize", com.visa.cbp.getEncExpo.warmup, "getHeadingTextFontSize", "()I", "setHeadingTextFontSize", "(I)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LabelCustomization extends com.paypal.android.threeds.ui.customization.Customization {
    public static final int $stable = 8;
    private java.lang.String headingTextColor = "#FF000000";
    private java.lang.String headingTextFontName = "";
    private int headingTextFontSize = 20;

    public final java.lang.String getHeadingTextColor() {
        return this.headingTextColor;
    }

    public final void setHeadingTextColor(java.lang.String str) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.headingTextColor = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.requireValidColor(str);
    }

    public final java.lang.String getHeadingTextFontName() {
        return this.headingTextFontName;
    }

    public final void setHeadingTextFontName(java.lang.String str) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.headingTextFontName = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.requireValidString(str);
    }

    public final int getHeadingTextFontSize() {
        return this.headingTextFontSize;
    }

    public final void setHeadingTextFontSize(int i) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        this.headingTextFontSize = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.requireValidSizeOrDimension(i);
    }
}
