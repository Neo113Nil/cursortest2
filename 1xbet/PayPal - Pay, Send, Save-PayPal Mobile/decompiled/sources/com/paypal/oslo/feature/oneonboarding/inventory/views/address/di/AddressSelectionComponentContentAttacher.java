package com.paypal.oslo.feature.oneonboarding.inventory.views.address.di;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006JS\u0010\u0014\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J[\u0010\u001b\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressSelectionComponentContentAttacher;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressSelectionComponentAttacher;", "", "", "formattedAddresses", "<init>", "(Ljava/util/List;)V", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionComponentConfig;", "config", "Lcom/paypal/pds/components/BottomSheetController;", "bottomSheetController", "", "selectedIndex", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "Lkotlin/Function1;", "", "onIndexChange", "Lkotlin/Function0;", "onAddNewClick", "AttachBottomSheet", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionComponentConfig;Lcom/paypal/pds/components/BottomSheetController;ILcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "onEditClick", "errorMessage", "Landroidx/compose/ui/Modifier;", "modifier", "AttachComponentContent", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionComponentConfig;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/pds/components/BottomSheetController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressSelectionComponentContentAttacher implements com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;

    public AddressSelectionComponentContentAttacher(java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    public /* synthetic */ AddressSelectionComponentContentAttacher(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher
    public final void AttachBottomSheet(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionComponentConfig, com.paypal.pds.components.BottomSheetController bottomSheetController, int i, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        composer.startReplaceGroup(-204363057);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-204363057, i2, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentContentAttacher.AttachBottomSheet (AddressSelectionComponentAttacher.kt:129)");
        }
        if (addressSelectionComponentConfig == null) {
            composer.startReplaceGroup(2084082849);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(2084082850);
            int i3 = i2 >> 3;
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionBottomSheetKt.AddressSelectionBottomSheet(bottomSheetController, this.getHighResolutionOutputSizeshNQ4ISI, i, function1, function0, intentId, composer, com.paypal.pds.components.BottomSheetController.$stable | (i3 & 14) | (i2 & 896) | (i3 & 7168) | (i3 & 57344) | ((i2 << 6) & 458752));
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher
    public final void AttachComponentContent(final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionComponentConfig, final int i, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.lang.String str, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSelectionComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1892217680);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(addressSelectionComponentConfig) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(str) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= startRestartGroup.changedInstance(this) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1892217680, i3, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentContentAttacher.AttachComponentContent (AddressSelectionComponentAttacher.kt:151)");
            }
            int i4 = i3 << 3;
            com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionComponentContentKt.AddressSelectionComponentContent(addressSelectionComponentConfig, i, this.getHighResolutionOutputSizeshNQ4ISI, function1, function0, bottomSheetController, modifier, str, startRestartGroup, (i4 & 458752) | (com.paypal.pds.components.BottomSheetController.$stable << 15) | (i3 & 126) | (i4 & 7168) | (57344 & i4) | (3670016 & i3) | ((i3 << 6) & 29360128), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentContentAttacher$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentContentAttacher.m16898$r8$lambda$1sG1DZe0cuO895I0dSgGsK0oaY(com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentContentAttacher.this, addressSelectionComponentConfig, i, function1, function0, bottomSheetController, str, modifier, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$1sG1DZe0cuO895I0dSgGsK0o-aY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16898$r8$lambda$1sG1DZe0cuO895I0dSgGsK0oaY(com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentContentAttacher addressSelectionComponentContentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionComponentConfig, int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.String str, androidx.compose.ui.Modifier modifier, int i2, androidx.compose.runtime.Composer composer, int i3) {
        addressSelectionComponentContentAttacher.AttachComponentContent(addressSelectionComponentConfig, i, function1, function0, bottomSheetController, str, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressSelectionComponentContentAttacher() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
