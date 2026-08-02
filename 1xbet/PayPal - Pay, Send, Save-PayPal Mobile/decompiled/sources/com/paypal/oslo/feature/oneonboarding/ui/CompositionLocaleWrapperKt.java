package com.paypal.oslo.feature.oneonboarding.ui;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/util/Locale;", "locale", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "CompositionLocaleWrapper", "(Ljava/util/Locale;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CompositionLocaleWrapperKt {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompositionLocaleWrapper(final java.util.Locale locale, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(908004877);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(locale) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(908004877, i2, -1, "com.paypal.oslo.feature.oneonboarding.ui.CompositionLocaleWrapper (CompositionLocaleWrapper.kt:34)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            android.content.res.Configuration configuration = (android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration());
            boolean changed = startRestartGroup.changed(configuration);
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (!(z | changed)) {
                obj = rememberedValue;
            }
            android.content.res.Configuration configuration2 = new android.content.res.Configuration(configuration);
            configuration2.setLocale(locale);
            startRestartGroup.updateRememberedValue(configuration2);
            obj = configuration2;
            android.content.res.Configuration configuration3 = (android.content.res.Configuration) obj;
            boolean changed2 = startRestartGroup.changed(context);
            boolean changed3 = startRestartGroup.changed(configuration3);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changed2 | changed3)) {
                obj2 = rememberedValue2;
            }
            android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, 0);
            contextThemeWrapper.applyOverrideConfiguration(configuration3);
            startRestartGroup.updateRememberedValue(contextThemeWrapper);
            obj2 = contextThemeWrapper;
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext().provides((android.view.ContextThemeWrapper) obj2), androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration().provides(configuration3)}, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1747046067, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.CompositionLocaleWrapperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.oneonboarding.ui.CompositionLocaleWrapperKt.$r8$lambda$nZlfuXQL9rZFDFPJiukrPzx7_kU(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.ui.CompositionLocaleWrapperKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.oneonboarding.ui.CompositionLocaleWrapperKt.$r8$lambda$auIOwwi3uDRaeAgnGyCktkJotck(locale, function2, i, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$auIOwwi3uDRaeAgnGyCktkJotck(java.util.Locale locale, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        CompositionLocaleWrapper(locale, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nZlfuXQL9rZFDFPJiukrPzx7_kU(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1747046067, i, -1, "com.paypal.oslo.feature.oneonboarding.ui.CompositionLocaleWrapper.<anonymous> (CompositionLocaleWrapper.kt:56)");
            }
            function2.invoke(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
