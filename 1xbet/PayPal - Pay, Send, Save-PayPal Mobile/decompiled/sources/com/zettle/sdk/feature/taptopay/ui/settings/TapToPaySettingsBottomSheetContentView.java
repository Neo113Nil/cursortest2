package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsBottomSheetContentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsBottomSheetContentView$Listener;", "block", "", "setListener", "(Landroidx/lifecycle/LifecycleOwner;Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsBottomSheetContentView$Listener;)V", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsBottomSheetContentView$Listener;", "Landroid/widget/TextView;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/widget/TextView;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Listener"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TapToPaySettingsBottomSheetContentView extends android.widget.FrameLayout {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private android.widget.TextView getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.widget.TextView Camera2StreamConfigurationMap;
    private android.widget.TextView getHighSpeedVideoFpsRangesFor;
    private com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.Listener getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsBottomSheetContentView$Listener;", "", "", "onGeneralTermsClick", "()V", "onPaymentsTermsClick", "onPrivacyTermsClick", "onReadMorePaymentAndPricingClick"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Listener {
        void onGeneralTermsClick();

        void onPaymentsTermsClick();

        void onPrivacyTermsClick();

        void onReadMorePaymentAndPricingClick();
    }

    public /* synthetic */ TapToPaySettingsBottomSheetContentView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapToPaySettingsBottomSheetContentView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.widget.FrameLayout.inflate(context, com.zettle.sdk.feature.taptopay.ui.R.layout.tap_to_pay_bottom_sheet_content, this);
        android.view.View findViewById = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.tap_to_pay_settings_bottom_sheet_content_description_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.getHighResolutionOutputSizeshNQ4ISI = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.tap_to_pay_settings_bottomsheet_paragraph1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.Camera2StreamConfigurationMap = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.tap_to_pay_settings_bottomsheet_paragraph3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.getHighSpeedVideoFpsRangesFor = (android.widget.TextView) findViewById3;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.tap_to_pay_settings_bottomsheet_payment_pricing);
        java.lang.String string = getContext().getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_settings_bottomsheet_payment_pricing);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        android.text.SpannableStringBuilder valueOf = android.text.SpannableStringBuilder.valueOf(string);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        android.text.SpannableStringBuilder spannableStringBuilder = valueOf;
        spannableStringBuilder.setSpan(new android.text.style.ClickableSpan() { // from class: com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView$decorReadMoreMethodAndPricingWithHyperLink$1
            @Override // android.text.style.ClickableSpan
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.Listener listener;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
                listener = com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.this.getHighSpeedVideoSizes;
                if (listener != null) {
                    listener.onReadMorePaymentAndPricingClick();
                }
            }
        }, 0, string.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.tap_to_pay_settings_bottomsheet_general_terms);
        java.lang.String string2 = getContext().getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_settings_general_terms);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
        android.text.SpannableStringBuilder valueOf2 = android.text.SpannableStringBuilder.valueOf(string2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf2, "");
        android.text.SpannableStringBuilder spannableStringBuilder2 = valueOf2;
        spannableStringBuilder2.setSpan(new android.text.style.ClickableSpan() { // from class: com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView$decorGeneralTermsWithHyperLink$1
            @Override // android.text.style.ClickableSpan
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.Listener listener;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
                listener = com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.this.getHighSpeedVideoSizes;
                if (listener != null) {
                    listener.onGeneralTermsClick();
                }
            }
        }, 0, string2.length(), 33);
        textView2.setText(spannableStringBuilder2);
        textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.tap_to_pay_settings_bottomsheet_payment_terms);
        java.lang.String string3 = getContext().getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_settings_payments_terms);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
        android.text.SpannableStringBuilder valueOf3 = android.text.SpannableStringBuilder.valueOf(string3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf3, "");
        android.text.SpannableStringBuilder spannableStringBuilder3 = valueOf3;
        spannableStringBuilder3.setSpan(new android.text.style.ClickableSpan() { // from class: com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView$decorPaymentTermsWithHyperLink$1
            @Override // android.text.style.ClickableSpan
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.Listener listener;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
                listener = com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.this.getHighSpeedVideoSizes;
                if (listener != null) {
                    listener.onPaymentsTermsClick();
                }
            }
        }, 0, string3.length(), 33);
        textView3.setText(spannableStringBuilder3);
        textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.tap_to_pay_settings_bottomsheet_privacy_policy);
        java.lang.String string4 = getContext().getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_settings_privacy_terms);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
        android.text.SpannableStringBuilder valueOf4 = android.text.SpannableStringBuilder.valueOf(string4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf4, "");
        android.text.SpannableStringBuilder spannableStringBuilder4 = valueOf4;
        spannableStringBuilder4.setSpan(new android.text.style.ClickableSpan() { // from class: com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView$decorPrivacyPolicyWithHyperLink$1
            @Override // android.text.style.ClickableSpan
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.Listener listener;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
                listener = com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.this.getHighSpeedVideoSizes;
                if (listener != null) {
                    listener.onPrivacyTermsClick();
                }
            }
        }, 0, string4.length(), 33);
        textView4.setText(spannableStringBuilder4);
        textView4.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public final void setListener(androidx.view.LifecycleOwner owner, final com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.Listener block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        owner.getLifecycle().addObserver(new androidx.view.DefaultLifecycleObserver() { // from class: com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView$setListener$$inlined$doOnDestroy$1
            @Override // androidx.view.DefaultLifecycleObserver
            public final void onDestroy(androidx.view.LifecycleOwner owner2) {
                com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.Listener listener;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner2, "");
                listener = com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.this.getHighSpeedVideoSizes;
                if (listener == block) {
                    com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsBottomSheetContentView.this.getHighSpeedVideoSizes = null;
                }
            }
        });
        this.getHighSpeedVideoSizes = block;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TapToPaySettingsBottomSheetContentView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TapToPaySettingsBottomSheetContentView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
