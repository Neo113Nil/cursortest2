package com.paypal.android.threeds.ui.customization;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR*\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR*\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b"}, d2 = {"Lcom/paypal/android/threeds/ui/customization/ToolbarCustomization;", "Lcom/paypal/android/threeds/ui/customization/Customization;", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "backgroundColor", "Ljava/lang/String;", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "statusBarColor", "getStatusBarColor", "setStatusBarColor", "headerText", "getHeaderText", "setHeaderText", "buttonText", "getButtonText", "setButtonText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ToolbarCustomization extends com.paypal.android.threeds.ui.customization.Customization {
    public static final int $stable = 8;
    private java.lang.String backgroundColor = "#FF0070BA";
    private java.lang.String statusBarColor = "#FF003087";
    private java.lang.String headerText = "";
    private java.lang.String buttonText = "";

    public final java.lang.String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final void setBackgroundColor(java.lang.String str) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.backgroundColor = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.requireValidColor(str);
    }

    public final java.lang.String getStatusBarColor() {
        return this.statusBarColor;
    }

    public final void setStatusBarColor(java.lang.String str) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.statusBarColor = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.requireValidColor(str);
    }

    public final java.lang.String getHeaderText() {
        return this.headerText;
    }

    public final void setHeaderText(java.lang.String str) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.headerText = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.requireValidString(str);
    }

    public final java.lang.String getButtonText() {
        return this.buttonText;
    }

    public final void setButtonText(java.lang.String str) throws com.paypal.android.threeds.exceptions.InvalidInputException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.buttonText = com.paypal.android.threeds.utils.CustomizeUtils.INSTANCE.requireValidString(str);
    }
}
