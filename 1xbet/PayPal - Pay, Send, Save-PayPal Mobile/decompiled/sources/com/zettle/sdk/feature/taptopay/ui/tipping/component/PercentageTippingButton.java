package com.zettle.sdk.feature.taptopay.ui.tipping.component;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/PercentageTippingButton;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getGratuityAmount", "()J", "", "setCustomAmount", "()V", "Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/TippingOption;", "tip", "Ljava/util/Currency;", "currency", "setTipAmount", "(Lcom/zettle/sdk/feature/taptopay/ui/tipping/component/TippingOption;Ljava/util/Currency;)V", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoSizes", "Landroid/widget/TextView;", "getHighSpeedVideoFpsRangesFor", "Landroid/widget/TextView;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PercentageTippingButton extends android.widget.FrameLayout {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.widget.TextView getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.widget.TextView getHighResolutionOutputSizeshNQ4ISI;

    public /* synthetic */ PercentageTippingButton(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PercentageTippingButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.widget.FrameLayout.inflate(context, com.zettle.sdk.feature.taptopay.ui.R.layout.view_taptopay_tipping_card, this);
        android.view.View findViewById = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.getHighResolutionOutputSizeshNQ4ISI = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.subtitle);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.getHighSpeedVideoFpsRanges = (android.widget.TextView) findViewById2;
    }

    public final void setTipAmount(com.zettle.sdk.feature.taptopay.ui.tipping.component.TippingOption tip, java.util.Currency currency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tip, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        android.widget.TextView textView = this.getHighResolutionOutputSizeshNQ4ISI;
        float percentage = tip.getPercentage();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(percentage);
        sb.append("%");
        textView.setText(sb.toString());
        this.getHighSpeedVideoFpsRanges.setVisibility(0);
        long percentage2 = (long) ((tip.getPercentage() * tip.getAmount()) / 100.0f);
        com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currency2 = new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder().currency(currency);
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String spannableString = currency2.locale(locale).build().format(tip.getAmount() + percentage2).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(spannableString, "");
        this.getHighSpeedVideoSizes = percentage2;
        this.getHighSpeedVideoFpsRanges.setText(spannableString);
    }

    /* renamed from: getGratuityAmount, reason: from getter */
    public final long getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final void setCustomAmount() {
        this.getHighSpeedVideoFpsRanges.setText(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_tipping_custom_amount);
        this.getHighSpeedVideoFpsRanges.setTextAppearance(com.zettle.sdk.feature.taptopay.ui.R.style.TextAppearance_Otto_LargeBold);
        this.getHighResolutionOutputSizeshNQ4ISI.setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PercentageTippingButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PercentageTippingButton(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
