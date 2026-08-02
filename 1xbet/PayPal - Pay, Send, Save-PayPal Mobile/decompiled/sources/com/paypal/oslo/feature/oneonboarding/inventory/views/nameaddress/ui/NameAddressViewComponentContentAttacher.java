package com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/ui/NameAddressViewComponentContentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/ui/NameAddressViewComponentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressViewComponentViewModel;", "addressViewModel", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/NameViewDisplayComponentViewModel;", "nameViewModel", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressViewComponentViewModel;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/NameViewDisplayComponentViewModel;)V", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "config", "Lkotlin/Function0;", "", "onEditClick", "", "errorMessage", "onInfoClick", "Landroidx/compose/ui/Modifier;", "modifier", "Attach", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressViewComponentViewModel;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/NameViewDisplayComponentViewModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameAddressViewComponentContentAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentAttacher {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel getHighSpeedVideoFpsRangesFor;

    public NameAddressViewComponentContentAttacher(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressViewComponentViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameViewDisplayComponentViewModel, "");
        this.getHighSpeedVideoFpsRangesFor = addressViewComponentViewModel;
        this.getHighSpeedVideoSizes = nameViewDisplayComponentViewModel;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentAttacher
    public final void Attach(final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameAddressViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(827320724);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(nameAddressViewComponentConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(827320724, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentAttacher.Attach (NameAddressViewComponentAttacher.kt:61)");
            }
            int i3 = i2 << 3;
            com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt.NameAddressViewComponentContent(nameAddressViewComponentConfig, function0, modifier, str, function02, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, startRestartGroup, ((i2 >> 6) & 896) | (i2 & 126) | (i3 & 7168) | (i3 & 57344), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentAttacher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentAttacher.$r8$lambda$K22Aujm2Az0wrXca0PnRtfMkRO0(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentAttacher.this, nameAddressViewComponentConfig, function0, str, function02, modifier, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K22Aujm2Az0wrXca0PnRtfMkRO0(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentAttacher nameAddressViewComponentContentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, kotlin.jvm.functions.Function0 function0, java.lang.String str, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, androidx.compose.runtime.Composer composer, int i2) {
        nameAddressViewComponentContentAttacher.Attach(nameAddressViewComponentConfig, function0, str, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
