package com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002$%BK\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0011R\u001a\u0010 \u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\u0082\u0001\u0002&'"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/WebViewErrorConfig;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "", "p7", "<init>", "(IIIIILjava/lang/Integer;IZ)V", "titleResId", com.visa.cbp.getEncExpo.warmup, "getTitleResId", "()I", "descriptionResId", "getDescriptionResId", "fallbackDescriptionResId", "getFallbackDescriptionResId", "primaryButtonTextResId", "getPrimaryButtonTextResId", "fallbackPrimaryButtonTextResId", "getFallbackPrimaryButtonTextResId", "secondaryButtonTextResId", "Ljava/lang/Integer;", "getSecondaryButtonTextResId", "()Ljava/lang/Integer;", "iconResId", "getIconResId", "showCTA", "Z", "getShowCTA", "()Z", "NonRecoverableErrorConfigNoCTA", "NonRecoverableErrorConfig", "Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/WebViewErrorConfig$NonRecoverableErrorConfig;", "Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/WebViewErrorConfig$NonRecoverableErrorConfigNoCTA;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class WebViewErrorConfig {
    public static final int $stable = 0;
    private final int descriptionResId;
    private final int fallbackDescriptionResId;
    private final int fallbackPrimaryButtonTextResId;
    private final int iconResId;
    private final int primaryButtonTextResId;
    private final java.lang.Integer secondaryButtonTextResId;
    private final boolean showCTA;
    private final int titleResId;

    private WebViewErrorConfig(int i, int i2, int i3, int i4, int i5, java.lang.Integer num, int i6, boolean z) {
        this.titleResId = i;
        this.descriptionResId = i2;
        this.fallbackDescriptionResId = i3;
        this.primaryButtonTextResId = i4;
        this.fallbackPrimaryButtonTextResId = i5;
        this.secondaryButtonTextResId = num;
        this.iconResId = i6;
        this.showCTA = z;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    public final int getFallbackDescriptionResId() {
        return this.fallbackDescriptionResId;
    }

    public final int getPrimaryButtonTextResId() {
        return this.primaryButtonTextResId;
    }

    public final int getFallbackPrimaryButtonTextResId() {
        return this.fallbackPrimaryButtonTextResId;
    }

    public final java.lang.Integer getSecondaryButtonTextResId() {
        return this.secondaryButtonTextResId;
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final boolean getShowCTA() {
        return this.showCTA;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/WebViewErrorConfig$NonRecoverableErrorConfigNoCTA;", "Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/WebViewErrorConfig;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NonRecoverableErrorConfigNoCTA extends com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.WebViewErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.WebViewErrorConfig.NonRecoverableErrorConfigNoCTA INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.WebViewErrorConfig.NonRecoverableErrorConfigNoCTA();

        private NonRecoverableErrorConfigNoCTA() {
            super(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_non_recoverable_error_title, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_non_recoverable_error_subtitle, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_non_recoverable_error_subtitle_fallback, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_non_recoverable_error_ok_button, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_non_recoverable_error_ok_button_fallback, null, com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_switch_card, false, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/WebViewErrorConfig$NonRecoverableErrorConfig;", "Lcom/paypal/oslo/feature/inappcheckout/features/error/nonRecoverable/presentation/model/WebViewErrorConfig;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NonRecoverableErrorConfig extends com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.WebViewErrorConfig {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.WebViewErrorConfig.NonRecoverableErrorConfig INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.error.nonRecoverable.presentation.model.WebViewErrorConfig.NonRecoverableErrorConfig();

        private NonRecoverableErrorConfig() {
            super(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_non_recoverable_error_title, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_non_recoverable_error_subtitle, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_non_recoverable_error_subtitle_fallback, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_non_recoverable_error_ok_button, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_non_recoverable_error_ok_button_fallback, null, com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_switch_card, true, null);
        }
    }

    public /* synthetic */ WebViewErrorConfig(int i, int i2, int i3, int i4, int i5, java.lang.Integer num, int i6, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, num, i6, z);
    }
}
