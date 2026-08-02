package com.paypal.oslo.feature.bnplacquisition.paymode;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/paymode/PayModeContentProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/feature/bnplacquisition/api/paymode/PayLaterPayModePromoType;", "type", "", "getTitle", "(Lcom/paypal/oslo/feature/bnplacquisition/api/paymode/PayLaterPayModePromoType;)Ljava/lang/String;", "getDescription", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayModeContentProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayModeContentProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
    }

    public final java.lang.String getTitle(com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        int i = com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.value(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_pay_mode_pl2go_apply_promo_title, new java.lang.Object[0]), this.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.value(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_pay_mode_pl2go_activate_promo_title, new java.lang.Object[0]), this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.String getDescription(com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        int i = com.paypal.oslo.feature.bnplacquisition.paymode.PayModeContentProvider.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.core.commonui.utils.RefTextKt.value(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_pay_mode_pl2go_apply_promo_description, new java.lang.Object[0]), this.getHighResolutionOutputSizeshNQ4ISI);
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.core.commonui.utils.RefTextKt.value(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplacquisition.R.string.feature_bnpl_acquisition_pay_mode_pl2go_activate_promo_description, new java.lang.Object[0]), this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType.values().length];
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType.APPLY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPayModePromoType.ACTIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
