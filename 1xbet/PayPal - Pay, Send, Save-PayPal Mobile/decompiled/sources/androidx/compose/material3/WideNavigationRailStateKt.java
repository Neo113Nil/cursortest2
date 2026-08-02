package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\r\u0010\b\u001a\u00020\u0003*\u00020\u0003H\u0080\u0002\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"rememberWideNavigationRailState", "Landroidx/compose/material3/WideNavigationRailState;", "initialValue", "Landroidx/compose/material3/WideNavigationRailValue;", "(Landroidx/compose/material3/WideNavigationRailValue;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/WideNavigationRailState;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "", "(Landroidx/compose/material3/WideNavigationRailValue;)Z", "not", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WideNavigationRailStateKt {
    public static final androidx.compose.material3.WideNavigationRailState rememberWideNavigationRailState(final androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue, androidx.compose.runtime.Composer composer, int i, int i2) {
        boolean z = true;
        if ((i2 & 1) != 0) {
            wideNavigationRailValue = androidx.compose.material3.WideNavigationRailValue.Collapsed;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1595273472, i, -1, "androidx.compose.material3.rememberWideNavigationRailState (WideNavigationRailState.kt:86)");
        }
        final androidx.compose.animation.core.FiniteAnimationSpec value = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<androidx.compose.material3.WideNavigationRailState, androidx.compose.material3.WideNavigationRailValue> Saver = androidx.compose.material3.WideNavigationRailStateImpl.INSTANCE.Saver(value);
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(wideNavigationRailValue.ordinal())) && (i & 6) != 4) {
            z = false;
        }
        boolean changedInstance = composer.changedInstance(value);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.WideNavigationRailStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material3.WideNavigationRailStateKt.m4231$r8$lambda$7sIRH6uknXM6mVN1jb1oT4gscI(androidx.compose.material3.WideNavigationRailValue.this, value);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.material3.WideNavigationRailState wideNavigationRailState = (androidx.compose.material3.WideNavigationRailState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) Saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return wideNavigationRailState;
    }

    public static final boolean isExpanded(androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue) {
        return wideNavigationRailValue == androidx.compose.material3.WideNavigationRailValue.Expanded;
    }

    public static final androidx.compose.material3.WideNavigationRailValue not(androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue) {
        if (wideNavigationRailValue == androidx.compose.material3.WideNavigationRailValue.Collapsed) {
            return androidx.compose.material3.WideNavigationRailValue.Expanded;
        }
        return androidx.compose.material3.WideNavigationRailValue.Collapsed;
    }

    /* renamed from: $r8$lambda$7sIRH6uknXM6mVN1jb1oT-4gscI, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.WideNavigationRailState m4231$r8$lambda$7sIRH6uknXM6mVN1jb1oT4gscI(androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec) {
        return new androidx.compose.material3.WideNavigationRailStateImpl(wideNavigationRailValue, finiteAnimationSpec);
    }
}
