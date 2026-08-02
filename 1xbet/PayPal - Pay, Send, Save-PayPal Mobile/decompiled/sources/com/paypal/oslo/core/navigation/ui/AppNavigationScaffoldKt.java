package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a}\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\r0\u000b2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001ay\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\r0\u000b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010!¨\u0006\""}, d2 = {"AppNavigationScaffold", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "topBarConfig", "Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;", "bottomNavigationConfig", "Lcom/paypal/oslo/core/navigation/ui/BottomNavigationConfig;", "nav3ViewTracker", "Lcom/paypal/oslo/core/telemetry/compose/Nav3ViewTracker;", "entryProvider", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/NavKey;", "Landroidx/navigation3/runtime/NavEntry;", "defaultL0Destination", "modifier", "Landroidx/compose/ui/Modifier;", "overlayProviders", "", "Lcom/paypal/oslo/core/navigation/ui/NavigationOverlayProvider;", "navResultManager", "Lcom/paypal/oslo/core/navigation/result/NavResultManager;", "isL0EntryEnabled", "", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/core/navigation/ui/TopBarConfig;Lcom/paypal/oslo/core/navigation/ui/BottomNavigationConfig;Lcom/paypal/oslo/core/telemetry/compose/Nav3ViewTracker;Lkotlin/jvm/functions/Function1;Landroidx/navigation3/runtime/NavKey;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/paypal/oslo/core/navigation/result/NavResultManager;ZLandroidx/compose/runtime/Composer;II)V", "AppBottomNavigationBar", "config", "currentDestination", "", "currentL1Parent", "", "onNavigate", "onReselect", "(Lcom/paypal/oslo/core/navigation/ui/BottomNavigationConfig;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "navigation_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AppNavigationScaffoldKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppNavigationScaffold(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, final com.paypal.oslo.core.navigation.ui.BottomNavigationConfig bottomNavigationConfig, final com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker, final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> function1, final androidx.navigation3.runtime.NavKey navKey, androidx.compose.ui.Modifier modifier, java.util.Set<? extends com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider> set, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        java.util.Set<? extends com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider> set2;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2;
        final boolean z2;
        final java.util.Set<? extends com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider> set3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager3;
        androidx.compose.ui.Modifier modifier3;
        java.util.Set<? extends com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider> set4;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager4;
        boolean z3;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomNavigationConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nav3ViewTracker, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1695909177);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(topBarConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(bottomNavigationConfig) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(nav3ViewTracker) : startRestartGroup.changedInstance(nav3ViewTracker) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(navKey) ? 131072 : 65536;
        }
        int i7 = i2 & 64;
        if (i7 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else if ((12582912 & i) == 0) {
                set2 = set;
                i3 |= startRestartGroup.changedInstance(set2) ? 8388608 : 4194304;
                if ((i & 100663296) == 0) {
                    if ((i2 & 256) == 0 && startRestartGroup.changedInstance(navResultManager)) {
                        i6 = 67108864;
                        i3 |= i6;
                    }
                    i6 = 33554432;
                    i3 |= i6;
                }
                i5 = i2 & 512;
                if (i5 != 0) {
                    i3 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i3 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                        }
                        companion = modifier;
                        navResultManager3 = navResultManager;
                    } else {
                        companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        java.util.Set<? extends com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider> emptySet = i4 != 0 ? kotlin.collections.SetsKt.emptySet() : set2;
                        if ((i2 & 256) != 0) {
                            navResultManager3 = appNavigator.getNavResultManager();
                            i3 &= -234881025;
                        } else {
                            navResultManager3 = navResultManager;
                        }
                        if (i5 != 0) {
                            modifier3 = companion;
                            set4 = emptySet;
                            navResultManager4 = navResultManager3;
                            z3 = true;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1695909177, i3, -1, "com.paypal.oslo.core.navigation.ui.AppNavigationScaffold (AppNavigationScaffold.kt:98)");
                            }
                            com.paypal.oslo.core.navigation.result.NavResultManager navResultManager5 = navResultManager4;
                            composer2 = startRestartGroup;
                            final java.util.Set<? extends com.paypal.oslo.core.navigation.ui.NavigationOverlayProvider> set5 = set4;
                            final boolean z4 = z3;
                            final androidx.compose.ui.Modifier modifier4 = modifier3;
                            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator().provides(appNavigator), com.paypal.oslo.core.navigation.result.NavResultEffectKt.getLocalNavResultManager().provides(navResultManager4), com.paypal.oslo.core.telemetry.compose.LocalNav3ViewTrackerKt.getLocalNav3ViewTracker().provides(nav3ViewTracker)}, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1961377671, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.$r8$lambda$ddLWgOCh6BSsiZtUe5s1AlxpNRU(com.paypal.oslo.core.navigation.AppNavigator.this, function1, navKey, nav3ViewTracker, topBarConfig, bottomNavigationConfig, set5, z4, modifier4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            }, composer2, 54), composer2, androidx.compose.runtime.ProvidedValue.$stable | 48);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            navResultManager2 = navResultManager5;
                            modifier2 = modifier3;
                            set3 = set4;
                            z2 = z3;
                        } else {
                            set2 = emptySet;
                        }
                    }
                    z3 = z;
                    modifier3 = companion;
                    set4 = set2;
                    navResultManager4 = navResultManager3;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    com.paypal.oslo.core.navigation.result.NavResultManager navResultManager52 = navResultManager4;
                    composer2 = startRestartGroup;
                    final java.util.Set set52 = set4;
                    final boolean z42 = z3;
                    final androidx.compose.ui.Modifier modifier42 = modifier3;
                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) new androidx.compose.runtime.ProvidedValue[]{com.paypal.oslo.core.navigation.ui.LocalAppNavigatorKt.getLocalAppNavigator().provides(appNavigator), com.paypal.oslo.core.navigation.result.NavResultEffectKt.getLocalNavResultManager().provides(navResultManager4), com.paypal.oslo.core.telemetry.compose.LocalNav3ViewTrackerKt.getLocalNav3ViewTracker().provides(nav3ViewTracker)}, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1961377671, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.$r8$lambda$ddLWgOCh6BSsiZtUe5s1AlxpNRU(com.paypal.oslo.core.navigation.AppNavigator.this, function1, navKey, nav3ViewTracker, topBarConfig, bottomNavigationConfig, set52, z42, modifier42, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, composer2, 54), composer2, androidx.compose.runtime.ProvidedValue.$stable | 48);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    navResultManager2 = navResultManager52;
                    modifier2 = modifier3;
                    set3 = set4;
                    z2 = z3;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    navResultManager2 = navResultManager;
                    z2 = z;
                    set3 = set2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.$r8$lambda$CtugYGGxVmp1xBvWkGV9tQLPNxU(com.paypal.oslo.core.navigation.AppNavigator.this, topBarConfig, bottomNavigationConfig, nav3ViewTracker, function1, navKey, modifier2, set3, navResultManager2, z2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            set2 = set;
            if ((i & 100663296) == 0) {
            }
            i5 = i2 & 512;
            if (i5 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        set2 = set;
        if ((i & 100663296) == 0) {
        }
        i5 = i2 & 512;
        if (i5 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppBottomNavigationBar(final com.paypal.oslo.core.navigation.ui.BottomNavigationConfig bottomNavigationConfig, final java.lang.Object obj, final java.lang.String str, final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, androidx.navigation3.runtime.NavEntry<androidx.navigation3.runtime.NavKey>> function1, final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function13, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function14;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function15;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomNavigationConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1726892778);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(bottomNavigationConfig) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i3 = i2 & 64;
            if (i3 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i) == 0) {
                function14 = function13;
                i4 |= startRestartGroup.changedInstance(function14) ? 1048576 : 524288;
                if (!startRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function15 = function14;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.lang.Object obj2 = null;
                    kotlin.jvm.functions.Function1<? super androidx.navigation3.runtime.NavKey, kotlin.Unit> function16 = i3 != 0 ? null : function14;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1726892778, i4, -1, "com.paypal.oslo.core.navigation.ui.AppBottomNavigationBar (AppNavigationScaffold.kt:212)");
                    }
                    for (java.lang.Object obj3 : bottomNavigationConfig.getItems()) {
                        com.paypal.oslo.core.navigation.ui.BottomNavigationItem bottomNavigationItem = (com.paypal.oslo.core.navigation.ui.BottomNavigationItem) obj3;
                        java.lang.String l1Parent = com.paypal.oslo.core.navigation.NavEntryExtensionsKt.getL1Parent(function1.invoke(bottomNavigationItem.getDestination()));
                        if (l1Parent != null && str != null) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(l1Parent, str)) {
                                obj2 = obj3;
                                break;
                            }
                        } else {
                            if (obj != null) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(bottomNavigationItem.getDestination(), obj) && !kotlin.jvm.internal.Intrinsics.areEqual(bottomNavigationItem.getDestination().toString(), obj.toString())) {
                                }
                                obj2 = obj3;
                                break;
                            }
                            continue;
                        }
                    }
                    int i6 = i4 >> 6;
                    com.paypal.oslo.core.navigation.ui.BottomNavigationKt.BottomNavigation(bottomNavigationConfig, (com.paypal.oslo.core.navigation.ui.BottomNavigationItem) obj2, function12, modifier4, function16, startRestartGroup, (57344 & i6) | (i6 & 7168) | (i4 & 14) | (i6 & 896), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    function15 = function16;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                            return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.$r8$lambda$RscMKoRBPuy5IEgqQ8AqAMDbD84(com.paypal.oslo.core.navigation.ui.BottomNavigationConfig.this, obj, str, function1, function12, modifier3, function15, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function14 = function13;
            if (!startRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 64;
        if (i3 == 0) {
        }
        function14 = function13;
        if (!startRestartGroup.shouldExecute((599187 & i4) != 599186, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6YY8NH1PYTHO5AuzTE8cKNVfU1w(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.m11625$r8$lambda$oeiptcVtvzzmBDtAbABl9WUgQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$961LMwJDk5PbAmqQ5E2RD2uWIoQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.$r8$lambda$gCFEWRzVP3Cbv9jCn2mEmBGdTzE((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CtugYGGxVmp1xBvWkGV9tQLPNxU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, com.paypal.oslo.core.navigation.ui.BottomNavigationConfig bottomNavigationConfig, com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker, kotlin.jvm.functions.Function1 function1, androidx.navigation3.runtime.NavKey navKey, androidx.compose.ui.Modifier modifier, java.util.Set set, com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AppNavigationScaffold(appNavigator, topBarConfig, bottomNavigationConfig, nav3ViewTracker, function1, navKey, modifier, set, navResultManager, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HZ38bU9iofKslTQ7zvjjj2g9mnQ(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.core.navigation.SoftInputMode softInputMode) {
        mutableState.setValue(softInputMode);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OsMVIsSpoHlqNk1-gcwtzb2uT5s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11624$r8$lambda$OsMVIsSpoHlqNk1gcwtzb2uT5s(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.$r8$lambda$T59leKxTnlfzNWHyiQHsu7eJNAM((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RscMKoRBPuy5IEgqQ8AqAMDbD84(com.paypal.oslo.core.navigation.ui.BottomNavigationConfig bottomNavigationConfig, java.lang.Object obj, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function13, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AppBottomNavigationBar(bottomNavigationConfig, obj, str, function1, function12, modifier, function13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T59leKxTnlfzNWHyiQHsu7eJNAM(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ddLWgOCh6BSsiZtUe5s1AlxpNRU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final kotlin.jvm.functions.Function1 function1, final androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker, com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, com.paypal.oslo.core.navigation.ui.BottomNavigationConfig bottomNavigationConfig, java.util.Set set, boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1961377671, i, -1, "com.paypal.oslo.core.navigation.ui.AppNavigationScaffold.<anonymous> (AppNavigationScaffold.kt:107)");
            }
            java.util.List<androidx.navigation3.runtime.NavKey> backStack = appNavigator.getBackStack();
            boolean changed = composer.changed(appNavigator);
            boolean changed2 = composer.changed(function1);
            boolean changedInstance = composer.changedInstance(navKey);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.$r8$lambda$iXowcupgntlmKhGXH9y_NYS0eOU(com.paypal.oslo.core.navigation.AppNavigator.this, function1, navKey);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            com.paypal.oslo.core.telemetry.compose.Nav3ViewTrackingEffectKt.Nav3ViewTrackingEffect(backStack, nav3ViewTracker, composer, com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker.$stable << 3);
            final androidx.compose.runtime.MutableState<com.paypal.oslo.core.navigation.SoftInputMode> rememberSoftInputModeOverride = com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt.rememberSoftInputModeOverride(composer, 0);
            com.paypal.oslo.core.navigation.scene.ApplySoftInputModeKt.ApplySoftInputMode(backStack, function1, rememberSoftInputModeOverride, composer, 0);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.core.navigation.scene.strategy.BottomSheetSceneStrategy();
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.scene.strategy.BottomSheetSceneStrategy bottomSheetSceneStrategy = (com.paypal.oslo.core.navigation.scene.strategy.BottomSheetSceneStrategy) rememberedValue2;
            java.lang.Object rememberL3SceneStrategy = com.paypal.oslo.core.navigation.scene.strategy.L3SceneStrategyKt.rememberL3SceneStrategy(composer, 0);
            java.lang.Object rememberL2SceneStrategy = com.paypal.oslo.core.navigation.scene.strategy.L2SceneStrategyKt.rememberL2SceneStrategy(composer, 0);
            boolean changed3 = composer.changed(appNavigator);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.m11626$r8$lambda$vHJ6RQ6x0XPVHSWM1ZQEhAmCgs(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.NavKey) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            boolean changed4 = composer.changed(appNavigator);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.$r8$lambda$961LMwJDk5PbAmqQ5E2RD2uWIoQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
            boolean changed5 = composer.changed(rememberSoftInputModeOverride);
            java.lang.Object rememberedValue5 = composer.rememberedValue();
            if (changed5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.$r8$lambda$HZ38bU9iofKslTQ7zvjjj2g9mnQ(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.core.navigation.SoftInputMode) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            java.lang.Object rememberL0L1SceneStrategy = com.paypal.oslo.core.navigation.scene.strategy.L0L1SceneStrategyKt.rememberL0L1SceneStrategy(topBarConfig, bottomNavigationConfig, function1, function12, function0, set, z, (kotlin.jvm.functions.Function1) rememberedValue5, composer, 0, 0);
            boolean changed6 = composer.changed(appNavigator);
            java.lang.Object rememberedValue6 = composer.rememberedValue();
            if (changed6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.$r8$lambda$6YY8NH1PYTHO5AuzTE8cKNVfU1w(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            java.lang.Object rememberL0SceneStrategy = com.paypal.oslo.core.navigation.scene.strategy.L0SceneStrategyKt.rememberL0SceneStrategy(topBarConfig, (kotlin.jvm.functions.Function0) rememberedValue6, composer, 0);
            boolean changed7 = composer.changed(rememberL3SceneStrategy);
            boolean changed8 = composer.changed(rememberL2SceneStrategy);
            boolean changed9 = composer.changed(rememberL0L1SceneStrategy);
            boolean changed10 = composer.changed(rememberL0SceneStrategy);
            java.lang.Object rememberedValue7 = composer.rememberedValue();
            if (((changed7 | changed8 | changed9) || changed10) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i2 = 1;
                i3 = 2;
                i4 = 3;
                rememberedValue7 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.navigation3.scene.SceneStrategy[]{bottomSheetSceneStrategy, rememberL3SceneStrategy, rememberL2SceneStrategy, rememberL0L1SceneStrategy, rememberL0SceneStrategy});
                composer.updateRememberedValue(rememberedValue7);
            } else {
                i3 = 2;
                i2 = 1;
                i4 = 3;
            }
            java.util.List list = (java.util.List) rememberedValue7;
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, i2, null);
            androidx.navigation3.runtime.NavEntryDecorator[] navEntryDecoratorArr = new androidx.navigation3.runtime.NavEntryDecorator[i3];
            navEntryDecoratorArr[0] = androidx.navigation3.runtime.SaveableStateHolderNavEntryDecoratorKt.rememberSaveableStateHolderNavEntryDecorator(null, composer, 0, i2);
            navEntryDecoratorArr[i2] = androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecoratorKt.rememberViewModelStoreNavEntryDecorator(null, null, composer, 0, i4);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) navEntryDecoratorArr);
            kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<androidx.navigation3.runtime.NavKey>>, androidx.compose.animation.ContentTransform> rememberForwardTransitionSpec = com.paypal.oslo.core.navigation.ui.AppNavigationTransitionsKt.rememberForwardTransitionSpec(appNavigator, function1, composer, 0);
            kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<androidx.navigation3.runtime.NavKey>>, androidx.compose.animation.ContentTransform> rememberPopTransitionSpec = com.paypal.oslo.core.navigation.ui.AppNavigationTransitionsKt.rememberPopTransitionSpec(appNavigator, function1, composer, 0);
            kotlin.jvm.functions.Function2<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation3.scene.Scene<androidx.navigation3.runtime.NavKey>>, java.lang.Integer, androidx.compose.animation.ContentTransform> rememberPredictivePopTransitionSpec = com.paypal.oslo.core.navigation.ui.AppNavigationTransitionsKt.rememberPredictivePopTransitionSpec(appNavigator, function1, composer, 0);
            boolean changed11 = composer.changed(appNavigator);
            java.lang.Object rememberedValue8 = composer.rememberedValue();
            if (changed11 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.m11624$r8$lambda$OsMVIsSpoHlqNk1gcwtzb2uT5s(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            androidx.navigation3.ui.NavDisplayKt.NavDisplay(backStack, fillMaxSize$default, null, (kotlin.jvm.functions.Function0) rememberedValue8, listOf, list, null, null, null, rememberForwardTransitionSpec, rememberPopTransitionSpec, rememberPredictivePopTransitionSpec, function1, composer, 0, 0, 452);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$el0N_QENgABEeOotezO6z1omneM(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.bringToTopOrPush(navKey);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gCFEWRzVP3Cbv9jCn2mEmBGdTzE(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.moveL0BeforeL1$navigation_release();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iXowcupgntlmKhGXH9y_NYS0eOU(com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1 function1, androidx.navigation3.runtime.NavKey navKey) {
        appNavigator.configureL0L1Behavior(function1, navKey);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oeiptcVtv-zzmBDtAb-ABl9WUgQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11625$r8$lambda$oeiptcVtvzzmBDtAbABl9WUgQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vHJ6RQ6x0XPVHSWM1Z-QEhAmCgs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11626$r8$lambda$vHJ6RQ6x0XPVHSWM1ZQEhAmCgs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, final androidx.navigation3.runtime.NavKey navKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.$r8$lambda$el0N_QENgABEeOotezO6z1omneM(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
