package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabRowDefaults$tabIndicatorOffset$2 implements kotlin.jvm.functions.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, java.lang.Integer, androidx.compose.ui.Modifier> {
    final /* synthetic */ androidx.compose.material3.TabPosition getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ androidx.compose.ui.Modifier invoke(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        composer2.startReplaceGroup(-1541271084);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1541271084, intValue, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1108)");
        }
        androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> m1173animateDpAsStateAjpBEmI = androidx.compose.animation.core.AnimateAsStateKt.m1173animateDpAsStateAjpBEmI(this.getHighResolutionOutputSizeshNQ4ISI.getWidth(), androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial, composer2, 6), null, null, composer2, 0, 12);
        final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> m1173animateDpAsStateAjpBEmI2 = androidx.compose.animation.core.AnimateAsStateKt.m1173animateDpAsStateAjpBEmI(this.getHighResolutionOutputSizeshNQ4ISI.getLeft(), androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial, composer2, 6), null, null, composer2, 0, 12);
        androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getBottomStart(), false, 2, null);
        boolean changed = composer2.changed(m1173animateDpAsStateAjpBEmI2);
        java.lang.Object rememberedValue = composer2.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    androidx.compose.ui.unit.IntOffset m8720boximpl;
                    androidx.compose.runtime.State state = androidx.compose.runtime.State.this;
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) obj;
                    m8720boximpl = androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.m8723constructorimpl(density.mo1412roundToPx0680j_4(((androidx.compose.ui.unit.Dp) state.getValue()).m8615unboximpl()) << 32));
                    return m8720boximpl;
                }
            };
            composer2.updateRememberedValue(rememberedValue);
        }
        androidx.compose.ui.Modifier m1745width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.foundation.layout.OffsetKt.offset(wrapContentSize$default, (kotlin.jvm.functions.Function1) rememberedValue), m1173animateDpAsStateAjpBEmI.getValue().m8615unboximpl());
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer2.endReplaceGroup();
        return m1745width3ABfNKs;
    }

    TabRowDefaults$tabIndicatorOffset$2(androidx.compose.material3.TabPosition tabPosition) {
        this.getHighResolutionOutputSizeshNQ4ISI = tabPosition;
    }
}
