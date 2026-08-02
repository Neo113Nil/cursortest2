package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"HorizontalDivider", "", "modifier", "Landroidx/compose/ui/Modifier;", "thickness", "Landroidx/compose/ui/unit/Dp;", "HorizontalDivider-rAjV9yQ", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "one-onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HorizontalDividerKt {
    /* renamed from: HorizontalDivider-rAjV9yQ, reason: not valid java name */
    public static final void m17148HorizontalDividerrAjV9yQ(final androidx.compose.ui.Modifier modifier, final float f, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-40295768);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                f = androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-40295768, i3, -1, "com.paypal.oslo.feature.oneonboarding.ui.common.HorizontalDivider (HorizontalDivider.kt:37)");
            }
            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.platform.TestTagKt.testTag(modifier, "horizontal_divider_tag"), f), 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleEmphasisNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.HorizontalDividerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.ui.common.HorizontalDividerKt.m17147$r8$lambda$jwbDb2pBK9n5z8bYIFArJs4bnQ(androidx.compose.ui.Modifier.this, f, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$jwbDb2pBK9n5z8bYIFArJ-s4bnQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17147$r8$lambda$jwbDb2pBK9n5z8bYIFArJs4bnQ(androidx.compose.ui.Modifier modifier, float f, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m17148HorizontalDividerrAjV9yQ(modifier, f, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
