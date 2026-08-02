package com.paypal.oslo.feature.taptopay.navigation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/navigation/PayModeLauncherImpl;", "Lcom/paypal/oslo/feature/taptopay/navigation/PayModeLauncher;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "source", "cardId", "", "launch", "(Ljava/lang/String;Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayModeLauncherImpl implements com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher {
    public static final int $stable = 8;

    @dagger.hilt.android.qualifiers.ApplicationContext
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public PayModeLauncherImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @Override // com.paypal.oslo.feature.taptopay.navigation.PayModeLauncher
    public final void launch(java.lang.String source, java.lang.String cardId) {
        android.content.Intent intent = new android.content.Intent(this.getHighSpeedVideoFpsRangesFor, (java.lang.Class<?>) com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.class);
        intent.addFlags(268435456);
        if (source != null) {
            intent.putExtra(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.EXTRA_SOURCE, source);
        }
        if (cardId != null) {
            intent.putExtra(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.EXTRA_CARD_ID, cardId);
        }
        this.getHighSpeedVideoFpsRangesFor.startActivity(intent);
    }
}
