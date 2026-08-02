package com.paypal.oslo.feature.mosaic.ui.legacy.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b0\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/legacy/mvi/MosaicLegacyFlowUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "<init>", "()V", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class MosaicLegacyFlowUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private MosaicLegacyFlowUiEffect() {
        this.name = "MosaicLegacyFlowUiEffect";
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    public /* synthetic */ MosaicLegacyFlowUiEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
