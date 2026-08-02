package com.paypal.pds.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$TextInputKt {
    public static final com.paypal.pds.components.ComposableSingletons$TextInputKt INSTANCE = new com.paypal.pds.components.ComposableSingletons$TextInputKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1329870588, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ComposableSingletons$TextInputKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.pds.components.ComposableSingletons$TextInputKt.$r8$lambda$0RqJCQ5KLY7YUsJ8WfMDrED5ios((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(801504987, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ComposableSingletons$TextInputKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.pds.components.ComposableSingletons$TextInputKt.m21844$r8$lambda$2LfQobeoOjXQUqcz6RJG21iHek((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$0RqJCQ5KLY7YUsJ8WfMDrED5ios(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1329870588, i, -1, "com.paypal.pds.components.ComposableSingletons$TextInputKt.lambda$1329870588.<anonymous> (TextInput.kt:809)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Home.INSTANCE, null, null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27702, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2LfQobeoOjXQUqcz6RJG2-1iHek, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21844$r8$lambda$2LfQobeoOjXQUqcz6RJG21iHek(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(801504987, i, -1, "com.paypal.pds.components.ComposableSingletons$TextInputKt.lambda$801504987.<anonymous> (TextInput.kt:817)");
            }
            final android.content.Context context = (android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            com.paypal.pds.core.Icon.MagnifyingGlass magnifyingGlass = com.paypal.pds.core.Icon.MagnifyingGlass.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.core.Icon.MagnifyingGlass magnifyingGlass2 = magnifyingGlass;
            boolean changedInstance = composer.changedInstance(context);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ComposableSingletons$TextInputKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.pds.components.ComposableSingletons$TextInputKt.$r8$lambda$gIzbHAyyK8D1eCwoQ5jhzxZNnqY(context);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(magnifyingGlass2, (kotlin.jvm.functions.Function0) rememberedValue, null, tertiary, large, null, null, false, false, composer, 27654, 484);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gIzbHAyyK8D1eCwoQ5jhzxZNnqY(android.content.Context context) {
        android.widget.Toast.makeText(context, "Icon button clicked", 0).show();
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$801504987$pds_release() {
        return getHighSpeedVideoFpsRanges;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1329870588$pds_release() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
