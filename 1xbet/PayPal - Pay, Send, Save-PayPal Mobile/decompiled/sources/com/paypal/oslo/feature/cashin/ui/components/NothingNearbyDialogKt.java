package com.paypal.oslo.feature.cashin.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"NothingNearbyDialog", "", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NothingNearbyDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "cash-in_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NothingNearbyDialogKt {
    public static final void NothingNearbyDialog(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-347175584);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-347175584, i3, -1, "com.paypal.oslo.feature.cashin.ui.components.NothingNearbyDialog (NothingNearbyDialog.kt:37)");
            }
            com.paypal.pds.components.DialogKt.Dialog(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_nothing_nearby_dialog_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(modifier, com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.MapScreen.INSTANCE.getEMPTY_NEARBY_STORE_LIST_MODULE()), "nothing_nearby_dialog"), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_nothing_nearby_dialog_message, startRestartGroup, 0), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-89472760, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.NothingNearbyDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.NothingNearbyDialogKt.$r8$lambda$u1ecb7KIqMFrREk1KVBZMZrv9_4(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), function0, startRestartGroup, ((i3 << 12) & 57344) | 3072, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.NothingNearbyDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.NothingNearbyDialogKt.$r8$lambda$JKvZjtvOfr3la8xS77xI2jR1tnQ(kotlin.jvm.functions.Function0.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DH23aYyXMZem1rdVJwGwlKUmkHE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-441436007);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-441436007, updateChangedFlags, -1, "com.paypal.oslo.feature.cashin.ui.components.NothingNearbyDialogPreview (NothingNearbyDialog.kt:60)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.components.NothingNearbyDialogKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            NothingNearbyDialog((kotlin.jvm.functions.Function0) rememberedValue, null, startRestartGroup, 6, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.NothingNearbyDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.NothingNearbyDialogKt.$r8$lambda$DH23aYyXMZem1rdVJwGwlKUmkHE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JKvZjtvOfr3la8xS77xI2jR1tnQ(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NothingNearbyDialog(function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$u1ecb7KIqMFrREk1KVBZMZrv9_4(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-89472760, i, -1, "com.paypal.oslo.feature.cashin.ui.components.NothingNearbyDialog.<anonymous> (NothingNearbyDialog.kt:42)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_nothing_nearby_dialog_ok, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "nothing_nearby_dialog_ok_button"), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, false, false, composer, 196992, 472);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
