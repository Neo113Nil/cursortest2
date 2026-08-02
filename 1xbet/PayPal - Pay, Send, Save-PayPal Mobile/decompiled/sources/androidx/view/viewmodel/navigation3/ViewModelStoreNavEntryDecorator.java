package androidx.view.viewmodel.navigation3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/lifecycle/viewmodel/navigation3/ViewModelStoreNavEntryDecorator;", "", "T", "Landroidx/navigation3/runtime/NavEntryDecorator;", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Lkotlin/Function0;", "", "removeViewModelStoreOnPop", "<init>", "(Landroidx/lifecycle/ViewModelStore;Lkotlin/jvm/functions/Function0;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ViewModelStoreNavEntryDecorator<T> extends androidx.navigation3.runtime.NavEntryDecorator<T> {
    public static final int $stable = 0;

    public ViewModelStoreNavEntryDecorator(final androidx.view.ViewModelStore viewModelStore, final kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        super(new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.viewmodel.navigation3.ViewModelStoreNavEntryDecorator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecorator.$r8$lambda$sPB8gBFMkhyukbwD7m86iDXWpnA(kotlin.jvm.functions.Function0.this, viewModelStore, obj);
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1481256515, true, new kotlin.jvm.functions.Function3() { // from class: androidx.lifecycle.viewmodel.navigation3.ViewModelStoreNavEntryDecorator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecorator.$r8$lambda$AMaWoWRX9_BOzRHEr1hLxyIehRY(androidx.view.ViewModelStore.this, (androidx.navigation3.runtime.NavEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }));
    }

    /* renamed from: $r8$lambda$13u-eMW1iH632z1iKFQx72NlgA0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9175$r8$lambda$13ueMW1iH632z1iKFQx72NlgA0(androidx.navigation3.runtime.NavEntry navEntry, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1108866301, i, -1, "androidx.lifecycle.viewmodel.navigation3.ViewModelStoreNavEntryDecorator.<init>.<anonymous>.<anonymous> (ViewModelStoreNavEntryDecorator.kt:133)");
            }
            navEntry.Content(composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AMaWoWRX9_BOzRHEr1hLxyIehRY(androidx.view.ViewModelStore viewModelStore, final androidx.navigation3.runtime.NavEntry navEntry, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(navEntry) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1481256515, i, -1, "androidx.lifecycle.viewmodel.navigation3.ViewModelStoreNavEntryDecorator.<init>.<anonymous> (ViewModelStoreNavEntryDecorator.kt:99)");
            }
            androidx.view.viewmodel.navigation3.EntryViewModel highSpeedVideoFpsRanges = androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecoratorKt__ViewModelStoreNavEntryDecoratorKt.getHighSpeedVideoFpsRanges(viewModelStore);
            java.lang.Object contentKey = navEntry.getContentKey();
            java.util.Map<java.lang.Object, androidx.view.ViewModelStore> map = highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            androidx.view.ViewModelStore viewModelStore2 = map.get(contentKey);
            if (viewModelStore2 == null) {
                viewModelStore2 = new androidx.view.ViewModelStore();
                map.put(contentKey, viewModelStore2);
            }
            androidx.view.ViewModelStore viewModelStore3 = viewModelStore2;
            androidx.view.SavedStateRegistryOwner savedStateRegistryOwner = (androidx.view.SavedStateRegistryOwner) composer.consume(androidx.view.compose.LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner());
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecorator$2$childViewModelStoreOwner$1$1(savedStateRegistryOwner, viewModelStore3);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.provides((androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecorator$2$childViewModelStoreOwner$1$1) rememberedValue), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1108866301, true, new kotlin.jvm.functions.Function2() { // from class: androidx.lifecycle.viewmodel.navigation3.ViewModelStoreNavEntryDecorator$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecorator.m9175$r8$lambda$13ueMW1iH632z1iKFQx72NlgA0(androidx.navigation3.runtime.NavEntry.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sPB8gBFMkhyukbwD7m86iDXWpnA(kotlin.jvm.functions.Function0 function0, androidx.view.ViewModelStore viewModelStore, java.lang.Object obj) {
        androidx.view.ViewModelStore remove;
        if (((java.lang.Boolean) function0.invoke()).booleanValue() && (remove = androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecoratorKt__ViewModelStoreNavEntryDecoratorKt.getHighSpeedVideoFpsRanges(viewModelStore).getHighResolutionOutputSizeshNQ4ISI.remove(obj)) != null) {
            remove.clear();
        }
        return kotlin.Unit.INSTANCE;
    }
}
