package com.paypal.oslo.feature.packagetracking.ui.detail.components;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"SeparateShipmentsDisclaimer", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SeparateShipmentsDisclaimerPreview", "(Landroidx/compose/runtime/Composer;I)V", "package-tracking_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SeparateShipmentsDisclaimerKt {
    public static final void SeparateShipmentsDisclaimer(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1798456930);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1798456930, i3, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.SeparateShipmentsDisclaimer (SeparateShipmentsDisclaimer.kt:38)");
            }
            androidx.compose.ui.Modifier modifier4 = modifier3;
            composer2 = startRestartGroup;
            com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, null, null, null, null, null, com.paypal.oslo.feature.packagetracking.ui.detail.components.ComposableSingletons$SeparateShipmentsDisclaimerKt.INSTANCE.m17543getLambda$37027012$package_tracking_prodRelease(), startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306416, 500);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.SeparateShipmentsDisclaimerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.SeparateShipmentsDisclaimerKt.$r8$lambda$rXHsWYwc0rgnN8hlidcGgEHTKsY(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5yrVLVK_v5ID2mqzNew3RIOaGwo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-270541911);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-270541911, updateChangedFlags, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.components.SeparateShipmentsDisclaimerPreview (SeparateShipmentsDisclaimer.kt:59)");
            }
            SeparateShipmentsDisclaimer(null, startRestartGroup, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.components.SeparateShipmentsDisclaimerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.components.SeparateShipmentsDisclaimerKt.$r8$lambda$5yrVLVK_v5ID2mqzNew3RIOaGwo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rXHsWYwc0rgnN8hlidcGgEHTKsY(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SeparateShipmentsDisclaimer(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
