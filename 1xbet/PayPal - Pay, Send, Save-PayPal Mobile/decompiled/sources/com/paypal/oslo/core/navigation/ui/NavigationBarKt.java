package com.paypal.oslo.core.navigation.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a/\u0010\u0007\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0017"}, d2 = {"NavigationBar", "", "config", "Lcom/paypal/oslo/core/navigation/ui/NavigationBarConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/core/navigation/ui/NavigationBarConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RenderNavigationBarFromMetadata", "metadata", "", "", "", "onDefaultBack", "Lkotlin/Function0;", "(Ljava/util/Map;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NavigationBarBackAndCloseNoTitlePreview", "(Landroidx/compose/runtime/Composer;I)V", "NavigationBarBackAndTitlePreview", "NavigationBarAllElementsPreview", "NavigationBarTitleAndClosePreview", "NavigationBarTitleOnlyPreview", "NavigationBarDarkPreview", "NavigationBarLongTitlePreview", "navigation_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NavigationBarKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationBar(final com.paypal.oslo.core.navigation.ui.NavigationBarConfig navigationBarConfig, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationBarConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1492344014);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(navigationBarConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1492344014, i3, -1, "com.paypal.oslo.core.navigation.ui.NavigationBar (NavigationBar.kt:52)");
                }
                java.lang.String title = navigationBarConfig.getTitle();
                java.lang.String str = title != null ? title : "";
                final com.paypal.oslo.core.navigation.ui.NavigationBarButton backButton = navigationBarConfig.getBackButton();
                if (backButton != null) {
                    startRestartGroup.startReplaceGroup(1214264062);
                    rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-234598951, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda21
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.core.navigation.ui.NavigationBarKt.m11645$r8$lambda$rAn8Z0GLr40OxG3fWxWx2fksnY(com.paypal.oslo.core.navigation.ui.NavigationBarButton.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1214264061);
                    startRestartGroup.endReplaceGroup();
                    rememberComposableLambda = null;
                }
                final com.paypal.oslo.core.navigation.ui.NavigationBarButton closeButton = navigationBarConfig.getCloseButton();
                if (closeButton != null) {
                    startRestartGroup.startReplaceGroup(1214740129);
                    androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-449428104, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.core.navigation.ui.NavigationBarKt.$r8$lambda$KZZQUMhAQeKvqdqaxi549ex65D8(com.paypal.oslo.core.navigation.ui.NavigationBarButton.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54);
                    startRestartGroup.endReplaceGroup();
                    composableLambda = rememberComposableLambda2;
                } else {
                    startRestartGroup.startReplaceGroup(1214740128);
                    startRestartGroup.endReplaceGroup();
                    composableLambda = null;
                }
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(str, modifier3, null, null, false, rememberComposableLambda, composableLambda, startRestartGroup, i3 & 112, 28);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.core.navigation.ui.NavigationBarKt.m11643$r8$lambda$U5J3EUCKxHE5i63fK8N05RBhQo(com.paypal.oslo.core.navigation.ui.NavigationBarConfig.this, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void RenderNavigationBarFromMetadata(final java.util.Map<java.lang.String, ? extends java.lang.Object> map, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        java.lang.String stringResource3;
        com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1148835319);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(map) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1148835319, i2, -1, "com.paypal.oslo.core.navigation.ui.RenderNavigationBarFromMetadata (NavigationBar.kt:146)");
            }
            java.lang.Boolean bool = (java.lang.Boolean) androidx.navigation3.runtime.NavMetadataKt.get(map, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_BAR_ENABLED());
            if (bool == null || bool.booleanValue()) {
                startRestartGroup.startReplaceGroup(1641667940);
                java.lang.Integer num = (java.lang.Integer) androidx.navigation3.runtime.NavMetadataKt.get(map, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_BAR_TITLE_RES());
                if (num == null) {
                    startRestartGroup.startReplaceGroup(1641711742);
                    startRestartGroup.endReplaceGroup();
                    stringResource = null;
                } else {
                    startRestartGroup.startReplaceGroup(1641711743);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(num.intValue(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                java.lang.Boolean bool2 = (java.lang.Boolean) androidx.navigation3.runtime.NavMetadataKt.get(map, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_BAR_SHOW_BACK_BUTTON());
                boolean booleanValue = bool2 != null ? bool2.booleanValue() : true;
                java.lang.Boolean bool3 = (java.lang.Boolean) androidx.navigation3.runtime.NavMetadataKt.get(map, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_BAR_SHOW_CLOSE_BUTTON());
                boolean booleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                java.lang.Integer num2 = (java.lang.Integer) androidx.navigation3.runtime.NavMetadataKt.get(map, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_BAR_BACK_CONTENT_DESCRIPTION_RES());
                if (num2 == null) {
                    startRestartGroup.startReplaceGroup(1642129374);
                    startRestartGroup.endReplaceGroup();
                    stringResource2 = null;
                } else {
                    startRestartGroup.startReplaceGroup(1642129375);
                    stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(num2.intValue(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                if (stringResource2 == null) {
                    startRestartGroup.startReplaceGroup(-224121367);
                    stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.navigation.R.string.core_navigation_back_button_description, startRestartGroup, 0);
                } else {
                    startRestartGroup.startReplaceGroup(-224123568);
                }
                startRestartGroup.endReplaceGroup();
                kotlin.jvm.functions.Function0<kotlin.Unit> function02 = (kotlin.jvm.functions.Function0) androidx.navigation3.runtime.NavMetadataKt.get(map, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_BAR_ON_CLOSE_CLICK());
                java.lang.Integer num3 = (java.lang.Integer) androidx.navigation3.runtime.NavMetadataKt.get(map, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_BAR_CLOSE_CONTENT_DESCRIPTION_RES());
                if (num3 == null) {
                    startRestartGroup.startReplaceGroup(1642514270);
                    startRestartGroup.endReplaceGroup();
                    stringResource3 = null;
                } else {
                    startRestartGroup.startReplaceGroup(1642514271);
                    stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(num3.intValue(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                if (stringResource3 == null) {
                    startRestartGroup.startReplaceGroup(-224108950);
                    stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.core.navigation.R.string.core_navigation_close_button_description, startRestartGroup, 0);
                } else {
                    startRestartGroup.startReplaceGroup(-224111182);
                }
                startRestartGroup.endReplaceGroup();
                androidx.view.OnBackPressedDispatcherOwner current = androidx.view.compose.LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.compose.LocalOnBackPressedDispatcherOwner.$stable);
                final androidx.view.OnBackPressedDispatcher onBackPressedDispatcher = current != null ? current.getOnBackPressedDispatcher() : null;
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) androidx.navigation3.runtime.NavMetadataKt.get(map, com.paypal.oslo.core.navigation.NavigationMetadataKeys.INSTANCE.getNAVIGATION_BAR_ON_BACK_CLICK());
                if (function03 == null) {
                    startRestartGroup.startReplaceGroup(1643138115);
                    boolean changedInstance = startRestartGroup.changedInstance(onBackPressedDispatcher);
                    boolean z = (i2 & 112) == 32;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.core.navigation.ui.NavigationBarKt.$r8$lambda$13HzELtwEq4lcPK8CJsJ73PIFFU(androidx.view.OnBackPressedDispatcher.this, function0);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                } else {
                    startRestartGroup.startReplaceGroup(-224092596);
                }
                startRestartGroup.endReplaceGroup();
                com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton2 = booleanValue ? new com.paypal.oslo.core.navigation.ui.NavigationBarButton(function03, stringResource2) : null;
                if (booleanValue2) {
                    if (function02 == null) {
                        function02 = function0;
                    }
                    navigationBarButton = new com.paypal.oslo.core.navigation.ui.NavigationBarButton(function02, stringResource3);
                } else {
                    navigationBarButton = null;
                }
                NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(stringResource, navigationBarButton2, navigationBarButton), null, startRestartGroup, 0, 2);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1643933017);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.NavigationBarKt.$r8$lambda$BDv7IUC1wrnn23WrlTnm_7PAJkw(map, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NavigationBarBackAndCloseNoTitlePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1580683725);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1580683725, i, -1, "com.paypal.oslo.core.navigation.ui.NavigationBarBackAndCloseNoTitlePreview (NavigationBar.kt:204)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton = new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue, com.knotapi.knot.utilities.Constants.META_BACK_BUTTON);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig(null, navigationBarButton, new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue2, com.knotapi.knot.utilities.Constants.META_CLOSE), 1, null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.NavigationBarKt.$r8$lambda$UWxc3gpJy_DsY7w5Pcad8qIKu5A(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NavigationBarBackAndTitlePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1861980910);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1861980910, i, -1, "com.paypal.oslo.core.navigation.ui.NavigationBarBackAndTitlePreview (NavigationBar.kt:221)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig("Settings", new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue, com.knotapi.knot.utilities.Constants.META_BACK_BUTTON), null, 4, null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.NavigationBarKt.$r8$lambda$_ofKsAtmisRoZEw071NHTytV7JA(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NavigationBarAllElementsPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1605263332);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1605263332, i, -1, "com.paypal.oslo.core.navigation.ui.NavigationBarAllElementsPreview (NavigationBar.kt:235)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton = new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue, com.knotapi.knot.utilities.Constants.META_BACK_BUTTON);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig("Payment Method", navigationBarButton, new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue2, com.knotapi.knot.utilities.Constants.META_CLOSE)), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.NavigationBarKt.$r8$lambda$UXi1b6hdEM1xfN0O2w3zlvj518E(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NavigationBarTitleAndClosePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2116361789);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2116361789, i, -1, "com.paypal.oslo.core.navigation.ui.NavigationBarTitleAndClosePreview (NavigationBar.kt:253)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig("Add Card", null, new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue, com.knotapi.knot.utilities.Constants.META_CLOSE), 2, null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.NavigationBarKt.m11641$r8$lambda$MynsqdcDPhbj3WpwNKUV4RIedU(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NavigationBarTitleOnlyPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-743998136);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-743998136, i, -1, "com.paypal.oslo.core.navigation.ui.NavigationBarTitleOnlyPreview (NavigationBar.kt:267)");
            }
            NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig("Account Details", null, null, 6, null), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.NavigationBarKt.$r8$lambda$a8PaQAMwI5KKQsWmnj3b0buHKAI(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NavigationBarDarkPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-466708196);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-466708196, i, -1, "com.paypal.oslo.core.navigation.ui.NavigationBarDarkPreview (NavigationBar.kt:277)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton = new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue, com.knotapi.knot.utilities.Constants.META_BACK_BUTTON);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig("Payment Method", navigationBarButton, new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue2, com.knotapi.knot.utilities.Constants.META_CLOSE)), background, startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.NavigationBarKt.$r8$lambda$UMOBR0wWzys4lvlomRRzlfl8ohs(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NavigationBarLongTitlePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(587140704);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(587140704, i, -1, "com.paypal.oslo.core.navigation.ui.NavigationBarLongTitlePreview (NavigationBar.kt:296)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton = new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue, com.knotapi.knot.utilities.Constants.META_BACK_BUTTON);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            NavigationBar(new com.paypal.oslo.core.navigation.ui.NavigationBarConfig("Manage Your Payment Methods", navigationBarButton, new com.paypal.oslo.core.navigation.ui.NavigationBarButton((kotlin.jvm.functions.Function0) rememberedValue2, com.knotapi.knot.utilities.Constants.META_CLOSE)), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.navigation.ui.NavigationBarKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.navigation.ui.NavigationBarKt.$r8$lambda$YT446_jXk28IppIxDAfAF3XmAGI(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$13HzELtwEq4lcPK8CJsJ73PIFFU(androidx.view.OnBackPressedDispatcher onBackPressedDispatcher, kotlin.jvm.functions.Function0 function0) {
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.onBackPressed();
        } else {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BDv7IUC1wrnn23WrlTnm_7PAJkw(java.util.Map map, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderNavigationBarFromMetadata(map, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KZZQUMhAQeKvqdqaxi549ex65D8(com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-449428104, i, -1, "com.paypal.oslo.core.navigation.ui.NavigationBar.<anonymous>.<anonymous> (NavigationBar.kt:70)");
            }
            com.paypal.pds.core.Icon.XMark xMark = com.paypal.pds.core.Icon.XMark.INSTANCE;
            com.paypal.pds.core.Icon.XMark xMark2 = xMark;
            com.paypal.pds.components.IconButtonKt.IconButton(xMark2, navigationBarButton.getAction(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.core.navigation.ui.NavigationBarTestTags.CLOSE_BUTTON), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, navigationBarButton.getContentDescription(), null, false, false, composer, 28038, 448);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MynsqdcDPhbj3WpwNKUV-4RIedU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11641$r8$lambda$MynsqdcDPhbj3WpwNKUV4RIedU(int i, androidx.compose.runtime.Composer composer, int i2) {
        NavigationBarTitleAndClosePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U5J3EUCKxHE5i63fK8N0-5RBhQo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11643$r8$lambda$U5J3EUCKxHE5i63fK8N05RBhQo(com.paypal.oslo.core.navigation.ui.NavigationBarConfig navigationBarConfig, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NavigationBar(navigationBarConfig, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UMOBR0wWzys4lvlomRRzlfl8ohs(int i, androidx.compose.runtime.Composer composer, int i2) {
        NavigationBarDarkPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UWxc3gpJy_DsY7w5Pcad8qIKu5A(int i, androidx.compose.runtime.Composer composer, int i2) {
        NavigationBarBackAndCloseNoTitlePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UXi1b6hdEM1xfN0O2w3zlvj518E(int i, androidx.compose.runtime.Composer composer, int i2) {
        NavigationBarAllElementsPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YT446_jXk28IppIxDAfAF3XmAGI(int i, androidx.compose.runtime.Composer composer, int i2) {
        NavigationBarLongTitlePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_ofKsAtmisRoZEw071NHTytV7JA(int i, androidx.compose.runtime.Composer composer, int i2) {
        NavigationBarBackAndTitlePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$a8PaQAMwI5KKQsWmnj3b0buHKAI(int i, androidx.compose.runtime.Composer composer, int i2) {
        NavigationBarTitleOnlyPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rAn8Z0GLr40OxG3fWxWx2fk-snY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11645$r8$lambda$rAn8Z0GLr40OxG3fWxWx2fksnY(com.paypal.oslo.core.navigation.ui.NavigationBarButton navigationBarButton, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-234598951, i, -1, "com.paypal.oslo.core.navigation.ui.NavigationBar.<anonymous>.<anonymous> (NavigationBar.kt:58)");
            }
            com.paypal.pds.core.Icon.ArrowLeft arrowLeft = com.paypal.pds.core.Icon.ArrowLeft.INSTANCE;
            com.paypal.pds.core.Icon.ArrowLeft arrowLeft2 = arrowLeft;
            com.paypal.pds.components.IconButtonKt.IconButton(arrowLeft2, navigationBarButton.getAction(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.core.navigation.ui.NavigationBarTestTags.BACK_BUTTON), com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, navigationBarButton.getContentDescription(), null, false, false, composer, 28038, 448);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
