package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aZ\u0010\u0017\u001a\u00020\u0012*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0002\b\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"J\u0010\u001f\u001a$\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001e8\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectedTextType;", "selectedTextType", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "rememberPlatformSelectionBehaviors", "(Landroidx/compose/foundation/text/selection/SelectedTextType;Landroidx/compose/ui/text/intl/LocaleList;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "Landroid/content/Context;", "context", "", "editable", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "platformSelectionBehaviors", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "child", "addPlatformTextContextMenuItems-71BSaZU", "(Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;Landroid/content/Context;ZLjava/lang/CharSequence;Landroidx/compose/ui/text/TextRange;Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;Lkotlin/jvm/functions/Function1;)V", "addPlatformTextContextMenuItems", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlin/coroutines/CoroutineContext;", "LocalTextClassifierCoroutineContext", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTextClassifierCoroutineContext", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlin/Function4;", "PlatformSelectionBehaviorsFactory", "Lkotlin/jvm/functions/Function4;", "getPlatformSelectionBehaviorsFactory", "()Lkotlin/jvm/functions/Function4;", "setPlatformSelectionBehaviorsFactory", "(Lkotlin/jvm/functions/Function4;)V", "getPlatformSelectionBehaviorsFactory$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlatformSelectionBehaviors_androidKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<kotlin.coroutines.CoroutineContext> LocalTextClassifierCoroutineContext = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlin.coroutines.CoroutineContext io2;
            io2 = kotlinx.coroutines.Dispatchers.getIO();
            return io2;
        }
    });
    private static kotlin.jvm.functions.Function4<? super kotlin.coroutines.CoroutineContext, ? super android.content.Context, ? super androidx.compose.foundation.text.selection.SelectedTextType, ? super androidx.compose.ui.text.intl.LocaleList, ? extends androidx.compose.foundation.text.selection.PlatformSelectionBehaviors> PlatformSelectionBehaviorsFactory = new kotlin.jvm.functions.Function4() { // from class: androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function4
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
            return androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt.m2385$r8$lambda$ZdY3t43YaPZPZYF9yvedXwG2w((kotlin.coroutines.CoroutineContext) obj, (android.content.Context) obj2, (androidx.compose.foundation.text.selection.SelectedTextType) obj3, (androidx.compose.ui.text.intl.LocaleList) obj4);
        }
    };

    public static /* synthetic */ void getPlatformSelectionBehaviorsFactory$annotations() {
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<kotlin.coroutines.CoroutineContext> getLocalTextClassifierCoroutineContext() {
        return LocalTextClassifierCoroutineContext;
    }

    public static final kotlin.jvm.functions.Function4<kotlin.coroutines.CoroutineContext, android.content.Context, androidx.compose.foundation.text.selection.SelectedTextType, androidx.compose.ui.text.intl.LocaleList, androidx.compose.foundation.text.selection.PlatformSelectionBehaviors> getPlatformSelectionBehaviorsFactory() {
        return PlatformSelectionBehaviorsFactory;
    }

    public static final void setPlatformSelectionBehaviorsFactory(kotlin.jvm.functions.Function4<? super kotlin.coroutines.CoroutineContext, ? super android.content.Context, ? super androidx.compose.foundation.text.selection.SelectedTextType, ? super androidx.compose.ui.text.intl.LocaleList, ? extends androidx.compose.foundation.text.selection.PlatformSelectionBehaviors> function4) {
        PlatformSelectionBehaviorsFactory = function4;
    }

    public static final androidx.compose.foundation.text.selection.PlatformSelectionBehaviors rememberPlatformSelectionBehaviors(androidx.compose.foundation.text.selection.SelectedTextType selectedTextType, androidx.compose.ui.text.intl.LocaleList localeList, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(430530635);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(430530635, i, -1, "androidx.compose.foundation.text.selection.rememberPlatformSelectionBehaviors (PlatformSelectionBehaviors.android.kt:95)");
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
        kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) composer.consume(LocalTextClassifierCoroutineContext);
        boolean changed = composer.changed(coroutineContext);
        boolean changed2 = composer.changed(context);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(selectedTextType.ordinal())) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(localeList)) && (i & 48) != 32) {
            z = false;
        }
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviors rememberedValue = composer.rememberedValue();
        if ((changed | changed2 | z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = PlatformSelectionBehaviorsFactory.invoke(coroutineContext, context, selectedTextType, localeList);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors = (androidx.compose.foundation.text.selection.PlatformSelectionBehaviors) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return platformSelectionBehaviors;
    }

    /* renamed from: addPlatformTextContextMenuItems-71BSaZU, reason: not valid java name */
    public static final void m2387addPlatformTextContextMenuItems71BSaZU(androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope, android.content.Context context, boolean z, java.lang.CharSequence charSequence, androidx.compose.ui.text.TextRange textRange, androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, kotlin.Unit> function1) {
        if (android.os.Build.VERSION.SDK_INT < 28 || charSequence == null || textRange == null || platformSelectionBehaviors == null || !(platformSelectionBehaviors instanceof androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl)) {
            function1.invoke(textContextMenuBuilderScope);
            if (charSequence == null || textRange == null) {
                return;
            }
            androidx.compose.foundation.text.contextmenu.ProcessText_androidKt.m2146addProcessedTextContextMenuItemsUAq72N0(textContextMenuBuilderScope, context, z, charSequence, textRange.getGetHighResolutionOutputSizeshNQ4ISI());
            return;
        }
        ((androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl) platformSelectionBehaviors).m2382addSmartSelectionTextContextMenuItemsYmzfRxQ$foundation(textContextMenuBuilderScope, charSequence, textRange.getGetHighResolutionOutputSizeshNQ4ISI(), function1);
        androidx.compose.foundation.text.contextmenu.ProcessText_androidKt.m2146addProcessedTextContextMenuItemsUAq72N0(textContextMenuBuilderScope, context, z, charSequence, textRange.getGetHighResolutionOutputSizeshNQ4ISI());
    }

    /* renamed from: $r8$lambda$ZdY3t43YaPZPZYF9y-v-edXwG2w, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl m2385$r8$lambda$ZdY3t43YaPZPZYF9yvedXwG2w(kotlin.coroutines.CoroutineContext coroutineContext, android.content.Context context, androidx.compose.foundation.text.selection.SelectedTextType selectedTextType, androidx.compose.ui.text.intl.LocaleList localeList) {
        return new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl(coroutineContext, context, selectedTextType, localeList);
    }

    /* renamed from: access$canReuse-h5sm0ck, reason: not valid java name */
    public static final /* synthetic */ boolean m2386access$canReuseh5sm0ck(androidx.compose.foundation.text.selection.TextClassificationResult textClassificationResult, java.lang.CharSequence charSequence, long j) {
        return androidx.compose.ui.text.TextRange.m8032equalsimpl0(j, textClassificationResult.getGetHighSpeedVideoFpsRanges()) && kotlin.jvm.internal.Intrinsics.areEqual(charSequence, textClassificationResult.getGetHighResolutionOutputSizeshNQ4ISI());
    }
}
