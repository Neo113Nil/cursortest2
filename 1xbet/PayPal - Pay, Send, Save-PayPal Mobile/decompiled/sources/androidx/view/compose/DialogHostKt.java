package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a%\u0010\u0005\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0002\u0010\n\u001a!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u008a\u0084\u0002²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012X\u008a\u0084\u0002"}, d2 = {"DialogHost", "", "dialogNavigator", "Landroidx/navigation/compose/DialogNavigator;", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/runtime/Composer;I)V", "PopulateVisibleList", "", "Landroidx/navigation/NavBackStackEntry;", "backStack", "", "(Ljava/util/List;Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)V", "rememberVisibleList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "(Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "navigation-compose_release", "dialogBackStack", "", "transitionInProgress", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DialogHostKt {
    public static final void DialogHost(final androidx.view.compose.DialogNavigator dialogNavigator, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(294589392);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(dialogNavigator) ? 4 : 2) | i : i;
        if ((i2 & 3) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(294589392, i2, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            androidx.compose.runtime.saveable.SaveableStateHolder rememberSaveableStateHolder = androidx.compose.runtime.saveable.SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            kotlin.coroutines.Continuation continuation = null;
            boolean z = true;
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(dialogNavigator.getBackStack$navigation_compose_release(), null, startRestartGroup, 0, 1);
            androidx.compose.runtime.snapshots.SnapshotStateList<androidx.view.NavBackStackEntry> rememberVisibleList = rememberVisibleList((java.util.List) collectAsState.getValue(), startRestartGroup, 0);
            PopulateVisibleList(rememberVisibleList, (java.util.List) collectAsState.getValue(), startRestartGroup, 0);
            androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(dialogNavigator.getTransitionInProgress$navigation_compose_release(), null, startRestartGroup, 0, 1);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue;
            startRestartGroup.startReplaceGroup(-367418626);
            for (final androidx.view.NavBackStackEntry navBackStackEntry : rememberVisibleList) {
                androidx.view.NavDestination destination = navBackStackEntry.getDestination();
                kotlin.jvm.internal.Intrinsics.checkNotNull(destination, "");
                androidx.navigation.compose.DialogNavigator.Destination destination2 = (androidx.navigation.compose.DialogNavigator.Destination) destination;
                boolean changedInstance = startRestartGroup.changedInstance(dialogNavigator);
                boolean changedInstance2 = startRestartGroup.changedInstance(navBackStackEntry);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.view.compose.DialogHostKt.$r8$lambda$bBiCBtIEoZGAEBPxlM4MXA6hEsk(androidx.view.compose.DialogNavigator.this, navBackStackEntry);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.ui.window.AndroidDialog_androidKt.Dialog((kotlin.jvm.functions.Function0) rememberedValue2, destination2.getDialogProperties(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1129586364, z, new androidx.view.compose.DialogHostKt$DialogHost$1$2(navBackStackEntry, dialogNavigator, rememberSaveableStateHolder, snapshotStateList, destination2), startRestartGroup, 54), startRestartGroup, 384, 0);
                collectAsState2 = collectAsState2;
                continuation = null;
                snapshotStateList = snapshotStateList;
                z = z;
            }
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2 = snapshotStateList;
            androidx.compose.runtime.State state = collectAsState2;
            kotlin.coroutines.Continuation continuation2 = continuation;
            startRestartGroup.endReplaceGroup();
            java.util.Set set = (java.util.Set) state.getValue();
            boolean changed = startRestartGroup.changed(state);
            boolean changedInstance3 = startRestartGroup.changedInstance(dialogNavigator);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((changed | changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new androidx.view.compose.DialogHostKt$DialogHost$2$1(state, dialogNavigator, snapshotStateList2, continuation2);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(set, snapshotStateList2, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.compose.DialogHostKt.$r8$lambda$QXgdZDwH5jvtu3tLOLUy9etoPZc(androidx.view.compose.DialogNavigator.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PopulateVisibleList(final java.util.List<androidx.view.NavBackStackEntry> list, final java.util.Collection<androidx.view.NavBackStackEntry> collection, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1537894851);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(collection) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1537894851, i2, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            final boolean booleanValue = ((java.lang.Boolean) startRestartGroup.consume(androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode())).booleanValue();
            for (final androidx.view.NavBackStackEntry navBackStackEntry : collection) {
                androidx.view.Lifecycle lifecycleRegistry = navBackStackEntry.getLifecycleRegistry();
                boolean changed = startRestartGroup.changed(booleanValue);
                boolean changedInstance = startRestartGroup.changedInstance(list);
                boolean changedInstance2 = startRestartGroup.changedInstance(navBackStackEntry);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.view.compose.DialogHostKt.$r8$lambda$KbYGm2WRi34J5_XqaQKVjjQZ3OI(androidx.view.NavBackStackEntry.this, booleanValue, list, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleRegistry, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.view.compose.DialogHostKt.m9196$r8$lambda$h9SeiilD6ttU7AJzd5ezTkZbU(list, collection, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.view.NavBackStackEntry> rememberVisibleList(java.util.Collection<androidx.view.NavBackStackEntry> collection, androidx.compose.runtime.Composer composer, int i) {
        java.lang.Object obj;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(467378629, i, -1, "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)");
        }
        boolean booleanValue = ((java.lang.Boolean) composer.consume(androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode())).booleanValue();
        boolean changed = composer.changed(collection);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (!changed) {
            obj = rememberedValue;
        }
        androidx.compose.runtime.snapshots.SnapshotStateList mutableStateListOf = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : collection) {
            androidx.view.NavBackStackEntry navBackStackEntry = (androidx.view.NavBackStackEntry) obj2;
            if (booleanValue || navBackStackEntry.getLifecycleRegistry().getCamera2StreamConfigurationMap().isAtLeast(androidx.lifecycle.Lifecycle.State.STARTED)) {
                arrayList.add(obj2);
            }
        }
        mutableStateListOf.addAll(arrayList);
        composer.updateRememberedValue(mutableStateListOf);
        obj = mutableStateListOf;
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.view.NavBackStackEntry> snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) obj;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return snapshotStateList;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$KbYGm2WRi34J5_XqaQKVjjQZ3OI(final androidx.view.NavBackStackEntry navBackStackEntry, final boolean z, final java.util.List list, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
                androidx.view.compose.DialogHostKt.$r8$lambda$TB1CtRFOhkYGY9PkbcAjALr3g7w(z, list, navBackStackEntry, lifecycleOwner, event);
            }
        };
        navBackStackEntry.getLifecycleRegistry().addObserver(lifecycleEventObserver);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$lambda$12$lambda$11$lambda$10$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.NavBackStackEntry.this.getLifecycleRegistry().removeObserver(lifecycleEventObserver);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QXgdZDwH5jvtu3tLOLUy9etoPZc(androidx.view.compose.DialogNavigator dialogNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        DialogHost(dialogNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$TB1CtRFOhkYGY9PkbcAjALr3g7w(boolean z, java.util.List list, androidx.view.NavBackStackEntry navBackStackEntry, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        if (z && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == androidx.lifecycle.Lifecycle.Event.ON_START && !list.contains(navBackStackEntry)) {
            list.add(navBackStackEntry);
        }
        if (event == androidx.lifecycle.Lifecycle.Event.ON_STOP) {
            list.remove(navBackStackEntry);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bBiCBtIEoZGAEBPxlM4MXA6hEsk(androidx.view.compose.DialogNavigator dialogNavigator, androidx.view.NavBackStackEntry navBackStackEntry) {
        dialogNavigator.dismiss$navigation_compose_release(navBackStackEntry);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$h9Seiil-D6ttU7AJzd5ezTk-ZbU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9196$r8$lambda$h9SeiilD6ttU7AJzd5ezTkZbU(java.util.List list, java.util.Collection collection, int i, androidx.compose.runtime.Composer composer, int i2) {
        PopulateVisibleList(list, collection, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ java.util.Set access$DialogHost$lambda$1(androidx.compose.runtime.State state) {
        return (java.util.Set) state.getValue();
    }
}
