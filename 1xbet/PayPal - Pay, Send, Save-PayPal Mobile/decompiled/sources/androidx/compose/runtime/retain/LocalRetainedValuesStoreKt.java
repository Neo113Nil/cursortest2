package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\"\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/runtime/retain/RetainedValuesStore;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "LocalRetainedValuesStoreProvider", "(Landroidx/compose/runtime/retain/RetainedValuesStore;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalRetainedValuesStore", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalRetainedValuesStore", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocalRetainedValuesStoreKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.runtime.retain.RetainedValuesStore> LocalRetainedValuesStore = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.retain.LocalRetainedValuesStoreKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.runtime.retain.RetainedValuesStore retainedValuesStore;
            retainedValuesStore = androidx.compose.runtime.retain.ForgetfulRetainedValuesStore.INSTANCE;
            return retainedValuesStore;
        }
    });

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.runtime.retain.RetainedValuesStore> getLocalRetainedValuesStore() {
        return LocalRetainedValuesStore;
    }

    public static final void LocalRetainedValuesStoreProvider(final androidx.compose.runtime.retain.RetainedValuesStore retainedValuesStore, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-358532755);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(retainedValuesStore) : startRestartGroup.changedInstance(retainedValuesStore) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        boolean z = true;
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-358532755, i2, -1, "androidx.compose.runtime.retain.LocalRetainedValuesStoreProvider (LocalRetainedValuesStore.kt:77)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(LocalRetainedValuesStore.provides(retainedValuesStore), function2, startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | (i2 & 112));
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !startRestartGroup.changed(retainedValuesStore))) {
                z = false;
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.runtime.retain.RetainContentPresenceIndicator(retainedValuesStore, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ((androidx.compose.runtime.retain.RetainContentPresenceIndicator) rememberedValue).getHighResolutionOutputSizeshNQ4ISI(startRestartGroup);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.retain.LocalRetainedValuesStoreKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.runtime.retain.LocalRetainedValuesStoreKt.$r8$lambda$NkgDTK1IMu8AyaxNpeBLscSHNuo(androidx.compose.runtime.retain.RetainedValuesStore.this, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NkgDTK1IMu8AyaxNpeBLscSHNuo(androidx.compose.runtime.retain.RetainedValuesStore retainedValuesStore, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        LocalRetainedValuesStoreProvider(retainedValuesStore, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
