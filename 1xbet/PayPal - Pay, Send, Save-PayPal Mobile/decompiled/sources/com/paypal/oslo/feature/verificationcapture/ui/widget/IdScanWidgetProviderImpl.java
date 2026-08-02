package com.paypal.oslo.feature.verificationcapture.ui.widget;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003RL\u0010\f\u001a4\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u000b\u0012\t\u0018\u00010\u0007¢\u0006\u0002\b\u0006\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\t0\u0004j\u0002`\n¢\u0006\u0002\b\u000b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/widget/IdScanWidgetProviderImpl;", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetProvider;", "<init>", "()V", "Lkotlin/Function3;", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetInterface;", "Lkotlin/ParameterName;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Landroidx/compose/ui/Modifier;", "", "Lcom/paypal/oslo/feature/verificationcapture/api/widget/IdScanWidgetComposable;", "Landroidx/compose/runtime/Composable;", androidx.view.compose.ComposeNavigator.NAME, "Lkotlin/jvm/functions/Function5;", "getComposable", "()Lkotlin/jvm/functions/Function5;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdScanWidgetProviderImpl implements com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetProvider {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function5<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface, com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> composable = com.paypal.oslo.feature.verificationcapture.ui.widget.ComposableSingletons$IdScanWidgetProviderImplKt.INSTANCE.getLambda$290272411$verification_capture_prodRelease();

    @javax.inject.Inject
    public IdScanWidgetProviderImpl() {
    }

    @Override // com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetProvider
    public final kotlin.jvm.functions.Function5<com.paypal.oslo.feature.verificationcapture.api.widget.IdScanWidgetInterface, com.paypal.oslo.core.navigation.AppNavigator, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getComposable() {
        return this.composable;
    }
}
