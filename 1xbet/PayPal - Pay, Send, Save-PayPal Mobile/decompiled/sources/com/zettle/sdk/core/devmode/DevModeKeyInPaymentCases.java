package com.zettle.sdk.core.devmode;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/zettle/sdk/core/devmode/DevModeKeyInPaymentCases;", "", "Lcom/zettle/sdk/core/devmode/DevModeCase;", "", "p0", "<init>", "(Ljava/lang/String;II)V", "nameResId", com.visa.cbp.getEncExpo.warmup, "getNameResId", "()I", "Success", "Unsuccessful", "NetworkError"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public enum DevModeKeyInPaymentCases implements com.zettle.sdk.core.devmode.DevModeCase {
    Success(com.zettle.sdk.R.string.dev_mode_key_in_payment_success),
    Unsuccessful(com.zettle.sdk.R.string.dev_mode_key_in_payment_failed),
    NetworkError(com.zettle.sdk.R.string.dev_mode_key_in_payment_network_error);

    private final int nameResId;

    DevModeKeyInPaymentCases(int i) {
        this.nameResId = i;
    }

    @Override // com.zettle.sdk.core.devmode.DevModeCase
    public final int getNameResId() {
        return this.nameResId;
    }
}
