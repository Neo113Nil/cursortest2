package com.zettle.sdk.core.devmode;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/zettle/sdk/core/devmode/DevModeKeyInActivationCases;", "", "Lcom/zettle/sdk/core/devmode/DevModeCase;", "", "p0", "<init>", "(Ljava/lang/String;II)V", "nameResId", com.visa.cbp.getEncExpo.warmup, "getNameResId", "()I", "SuccessFlow", "ErrorFlow"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public enum DevModeKeyInActivationCases implements com.zettle.sdk.core.devmode.DevModeCase {
    SuccessFlow(com.zettle.sdk.R.string.dev_mode_key_in_activation_success_flow),
    ErrorFlow(com.zettle.sdk.R.string.dev_mode_key_in_activation_error_flow);

    private final int nameResId;

    DevModeKeyInActivationCases(int i) {
        this.nameResId = i;
    }

    @Override // com.zettle.sdk.core.devmode.DevModeCase
    public final int getNameResId() {
        return this.nameResId;
    }
}
