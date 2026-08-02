package com.paypal.oslo.feature.checkcapture.fraudforce;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/fraudforce/FraudForceWrapperImpl;", "Lcom/paypal/oslo/feature/checkcapture/fraudforce/FraudForceWrapper;", "<init>", "()V", "Landroid/content/Context;", "context", "", "initialize", "(Landroid/content/Context;)V", "", "getBlackbox", "(Landroid/content/Context;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FraudForceWrapperImpl implements com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper
    public final void initialize(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.iovation.mobile.android.FraudForceManager.INSTANCE.initialize(new com.iovation.mobile.android.FraudForceConfiguration.Builder().build(), context);
    }

    @Override // com.paypal.oslo.feature.checkcapture.fraudforce.FraudForceWrapper
    public final java.lang.String getBlackbox(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return com.iovation.mobile.android.FraudForceManager.INSTANCE.getBlackbox(context);
    }
}
