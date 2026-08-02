package com.zettle.sdk.feature.taptopay.ui.refunds;

@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ComposableSingletons$TapToPayRefundsFragmentKt {
    public static final com.zettle.sdk.feature.taptopay.ui.refunds.ComposableSingletons$TapToPayRefundsFragmentKt INSTANCE = new com.zettle.sdk.feature.taptopay.ui.refunds.ComposableSingletons$TapToPayRefundsFragmentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f59lambda1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(689541624, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.ComposableSingletons$TapToPayRefundsFragmentKt$lambda-1$1
        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(689541624, i, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.ComposableSingletons$TapToPayRefundsFragmentKt.lambda-1.<anonymous> (TapToPayRefundsFragment.kt:130)");
            }
            androidx.compose.material.TextKt.m2830Text4IGK_g(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_refunds_toolbar_title, composer, 0), (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, composer, 0, 0, 131070);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            getHighResolutionOutputSizeshNQ4ISI(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f60lambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(819628954, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.ComposableSingletons$TapToPayRefundsFragmentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            getHighSpeedVideoFpsRanges(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(819628954, i, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.ComposableSingletons$TapToPayRefundsFragmentKt.lambda-2.<anonymous> (TapToPayRefundsFragment.kt:134)");
                }
                androidx.compose.material.IconKt.m2649Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_simpleandarrows_arrow_left_m, composer, 0), "", (androidx.compose.ui.Modifier) null, com.izettle.ui.compose.OttoTheme.INSTANCE.getColors(composer, com.izettle.ui.compose.OttoTheme.$stable).getIconColors().getDefault-0d7_KjU(), composer, 56, 4);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-2$ui_publicRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m23180getLambda2$ui_publicRelease() {
        return f60lambda2;
    }

    /* renamed from: getLambda-1$ui_publicRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m23179getLambda1$ui_publicRelease() {
        return f59lambda1;
    }
}
