package androidx.navigation3.scene;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006 \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00060\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"rememberBackStackAwareLifecycleNavEntryDecorator", "Landroidx/navigation3/runtime/NavEntryDecorator;", "T", "", "entries", "", "Landroidx/navigation3/runtime/NavEntry;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Landroidx/navigation3/runtime/NavEntryDecorator;", "navigation3-ui", "updatedEntries"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackStackAwareLifecycleNavEntryDecoratorKt {
    public static final <T> androidx.navigation3.runtime.NavEntryDecorator<T> rememberBackStackAwareLifecycleNavEntryDecorator(java.util.List<androidx.navigation3.runtime.NavEntry<T>> list, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1761201315, i, -1, "androidx.navigation3.scene.rememberBackStackAwareLifecycleNavEntryDecorator (BackStackAwareLifecycleNavEntryDecorator.kt:40)");
        }
        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(list, composer, i & 14);
        androidx.navigation3.runtime.NavEntryDecorator<T> navEntryDecorator = new androidx.navigation3.runtime.NavEntryDecorator<>(null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1077673004, true, new kotlin.jvm.functions.Function3() { // from class: androidx.navigation3.scene.BackStackAwareLifecycleNavEntryDecoratorKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.navigation3.scene.BackStackAwareLifecycleNavEntryDecoratorKt.$r8$lambda$G3gG5AhsJNiIeb3eOfK33EpryN0(androidx.compose.runtime.State.this, (androidx.navigation3.runtime.NavEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, composer, 54), 1, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return navEntryDecorator;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G3gG5AhsJNiIeb3eOfK33EpryN0(androidx.compose.runtime.State state, final androidx.navigation3.runtime.NavEntry navEntry, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(navEntry) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1077673004, i, -1, "androidx.navigation3.scene.rememberBackStackAwareLifecycleNavEntryDecorator.<anonymous> (BackStackAwareLifecycleNavEntryDecorator.kt:43)");
            }
            java.util.List list = (java.util.List) state.getValue();
            boolean z = (i & 14) == 4;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation3.scene.BackStackAwareLifecycleNavEntryDecoratorKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        boolean areEqual;
                        areEqual = kotlin.jvm.internal.Intrinsics.areEqual(((androidx.navigation3.runtime.NavEntry) obj).getContentKey(), androidx.navigation3.runtime.NavEntry.this.getContentKey());
                        return java.lang.Boolean.valueOf(areEqual);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(androidx.view.compose.RememberLifecycleOwnerKt.rememberLifecycleOwner(androidx.navigation3.ListUtilsKt.fastAnyOrAny(list, (kotlin.jvm.functions.Function1) rememberedValue) ? androidx.lifecycle.Lifecycle.State.RESUMED : androidx.lifecycle.Lifecycle.State.CREATED, null, composer, 0, 2)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1713684244, true, new kotlin.jvm.functions.Function2() { // from class: androidx.navigation3.scene.BackStackAwareLifecycleNavEntryDecoratorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.navigation3.scene.BackStackAwareLifecycleNavEntryDecoratorKt.$r8$lambda$vI4ZnmsdoV1XTWHdr3sldRncpkc(androidx.navigation3.runtime.NavEntry.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$vI4ZnmsdoV1XTWHdr3sldRncpkc(androidx.navigation3.runtime.NavEntry navEntry, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1713684244, i, -1, "androidx.navigation3.scene.rememberBackStackAwareLifecycleNavEntryDecorator.<anonymous>.<anonymous> (BackStackAwareLifecycleNavEntryDecorator.kt:46)");
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
}
