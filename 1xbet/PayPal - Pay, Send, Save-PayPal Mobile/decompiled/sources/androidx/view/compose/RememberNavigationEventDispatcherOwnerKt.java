package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"rememberNavigationEventDispatcherOwner", "Landroidx/navigationevent/NavigationEventDispatcherOwner;", "enabled", "", "parent", "(ZLandroidx/navigationevent/NavigationEventDispatcherOwner;Landroidx/compose/runtime/Composer;II)Landroidx/navigationevent/NavigationEventDispatcherOwner;", "navigationevent-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RememberNavigationEventDispatcherOwnerKt {
    public static final androidx.view.NavigationEventDispatcherOwner rememberNavigationEventDispatcherOwner(boolean z, androidx.view.NavigationEventDispatcherOwner navigationEventDispatcherOwner, androidx.compose.runtime.Composer composer, int i, int i2) {
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0 && (navigationEventDispatcherOwner = androidx.view.compose.LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new java.lang.IllegalStateException("No NavigationEventDispatcherOwner provided in LocalNavigationEventDispatcherOwner. If you intended to create a root dispatcher, explicitly pass null as the parent.".toString());
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-336636597, i, -1, "androidx.navigationevent.compose.rememberNavigationEventDispatcherOwner (RememberNavigationEventDispatcherOwner.kt:65)");
        }
        boolean changed = composer.changed(navigationEventDispatcherOwner);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            if (navigationEventDispatcherOwner != null) {
                rememberedValue = new androidx.view.NavigationEventDispatcher(navigationEventDispatcherOwner.getGetHighSpeedVideoFpsRanges());
            } else {
                rememberedValue = new androidx.view.NavigationEventDispatcher();
            }
            composer.updateRememberedValue(rememberedValue);
        }
        final androidx.view.NavigationEventDispatcher navigationEventDispatcher = (androidx.view.NavigationEventDispatcher) rememberedValue;
        boolean changedInstance = composer.changedInstance(navigationEventDispatcher);
        int i3 = i & 14;
        if (((i3 ^ 6) <= 4 || !composer.changed(z)) && (i & 6) != 4) {
            z2 = false;
        }
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changedInstance | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.view.compose.RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$2$1(navigationEventDispatcher, z, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer, i3);
        boolean changedInstance2 = composer.changedInstance(navigationEventDispatcher);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigationevent.compose.RememberNavigationEventDispatcherOwnerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.view.compose.RememberNavigationEventDispatcherOwnerKt.m9249$r8$lambda$dhB_CXDYwbRXmb9AztBpirCp6w(androidx.view.NavigationEventDispatcher.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.runtime.EffectsKt.DisposableEffect(navigationEventDispatcher, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, composer, 0);
        boolean changed2 = composer.changed(navigationEventDispatcher);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new androidx.view.compose.ComposeNavigationEventDispatcherOwner(navigationEventDispatcher);
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.view.compose.ComposeNavigationEventDispatcherOwner composeNavigationEventDispatcherOwner = (androidx.view.compose.ComposeNavigationEventDispatcherOwner) rememberedValue4;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return composeNavigationEventDispatcherOwner;
    }

    /* renamed from: $r8$lambda$dhB_CXDYwbRXmb9Az-tBpirCp6w, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m9249$r8$lambda$dhB_CXDYwbRXmb9AztBpirCp6w(final androidx.view.NavigationEventDispatcher navigationEventDispatcher, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.navigationevent.compose.RememberNavigationEventDispatcherOwnerKt$rememberNavigationEventDispatcherOwner$lambda$5$lambda$4$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.NavigationEventDispatcher.this.dispose();
            }
        };
    }
}
