package com.ingo.sdk.android.core.ux.composable;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$IngoCoreComposablesKt {
    public static final com.ingo.sdk.android.core.ux.composable.ComposableSingletons$IngoCoreComposablesKt INSTANCE = new com.ingo.sdk.android.core.ux.composable.ComposableSingletons$IngoCoreComposablesKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(283908687, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.core.ux.composable.ComposableSingletons$IngoCoreComposablesKt$lambda$283908687$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoIcon(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.ingo.sdk.android.core.ux.R.drawable.ic_baseline_close_24, composer2, 0), null, 0, android.graphics.Color.parseColor(com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.currentTheme(composer2, 0).getPrimaryColor()), null, false, null, composer2, 8, 118);
            } else {
                composer2.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1029955279, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.core.ux.composable.ComposableSingletons$IngoCoreComposablesKt$lambda$-1029955279$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoIcon(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.ingo.sdk.android.core.ux.R.drawable.ic_baseline_more_vert_24, composer2, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.core.ux.R.string.more_menu_content_description, composer2, 0), 0, android.graphics.Color.parseColor(com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.currentTheme(composer2, 0).getPrimaryColor()), null, false, null, composer2, 8, 116);
            } else {
                composer2.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    });

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$283908687$androidCoreUx_release() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getLambda$-1029955279$androidCoreUx_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m10603getLambda$1029955279$androidCoreUx_release() {
        return Camera2StreamConfigurationMap;
    }
}
