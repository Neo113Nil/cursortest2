package com.zettle.sdk.common.ui.components.illustration;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "drawableRes", com.visa.cbp.getEncExpo.warmup, "getDrawableRes", "()I", "Companion", "CASH_ADVANCE_COFFEE", com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, "KLARNA_ZETTLE_1", "KLARNA_ZETTLE_2", "KLARNA_ZETTLE_3", "MONEY_HAND", "PERMISSIONS_BLUETOOTH", "PERMISSIONS_LOCATION"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum OttoIllustrationImages {
    CASH_ADVANCE_COFFEE(com.zettle.sdk.common.ui.R.drawable.otto_illustration_android_cash_advance_coffee),
    GENERIC_ERROR(com.zettle.sdk.common.ui.R.drawable.otto_illustration_android_generic_error),
    KLARNA_ZETTLE_1(com.zettle.sdk.common.ui.R.drawable.otto_illustration_android_klarna_zettle_1),
    KLARNA_ZETTLE_2(com.zettle.sdk.common.ui.R.drawable.otto_illustration_android_klarna_zettle_2),
    KLARNA_ZETTLE_3(com.zettle.sdk.common.ui.R.drawable.otto_illustration_android_klarna_zettle_3),
    MONEY_HAND(com.zettle.sdk.common.ui.R.drawable.otto_illustration_android_money_hand),
    PERMISSIONS_BLUETOOTH(com.zettle.sdk.common.ui.R.drawable.otto_illustration_android_permissions_bluetooth),
    PERMISSIONS_LOCATION(com.zettle.sdk.common.ui.R.drawable.otto_illustration_android_permissions_location);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages.Companion INSTANCE = new com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages.Companion(null);
    private final int drawableRes;

    OttoIllustrationImages(int i) {
        this.drawableRes = i;
    }

    public final int getDrawableRes() {
        return this.drawableRes;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;", "findByValue", "(I)Lcom/zettle/sdk/common/ui/components/illustration/OttoIllustrationImages;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public final com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages findByValue(int value) {
            for (com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages ottoIllustrationImages : com.zettle.sdk.common.ui.components.illustration.OttoIllustrationImages.values()) {
                if (ottoIllustrationImages.ordinal() == value) {
                    return ottoIllustrationImages;
                }
            }
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
