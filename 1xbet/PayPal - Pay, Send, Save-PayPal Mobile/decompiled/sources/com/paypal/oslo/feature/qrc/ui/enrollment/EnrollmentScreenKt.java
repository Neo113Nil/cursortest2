package com.paypal.oslo.feature.qrc.ui.enrollment;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002"}, d2 = {"EnrollmentScreen", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navArgs", "Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/qrc/domain/model/session/QrcSessionNavArgs;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentViewModel;Landroidx/compose/runtime/Composer;II)V", "EnrollmentScreenContent", "isPayPalWorld", "", "progress", "", "(ZFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EnrollmentScreenCheckingEligibilityPreview", "(Landroidx/compose/runtime/Composer;I)V", "EnrollmentScreenEnrollingPreview", "EnrollmentScreenSuccessPreview", "qrc_prodRelease", "uiState", "Lcom/paypal/oslo/feature/qrc/ui/enrollment/EnrollmentUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EnrollmentScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EnrollmentScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel enrollmentViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel enrollmentViewModel2;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel enrollmentViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        boolean changedInstance;
        boolean changedInstance2;
        com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt$EnrollmentScreen$1$1 rememberedValue;
        boolean changedInstance3;
        boolean z;
        com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt$EnrollmentScreen$2$1 rememberedValue2;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qrcSessionNavArgs, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1956138402);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(qrcSessionNavArgs) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    enrollmentViewModel2 = enrollmentViewModel;
                    if (startRestartGroup.changedInstance(enrollmentViewModel2)) {
                        i5 = 2048;
                        i3 |= i5;
                    }
                } else {
                    enrollmentViewModel2 = enrollmentViewModel;
                }
                i5 = 1024;
                i3 |= i5;
            } else {
                enrollmentViewModel2 = enrollmentViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                } else {
                    modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        i4 = i3 & (-7169);
                        enrollmentViewModel3 = (com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1956138402, i4, -1, "com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreen (EnrollmentScreen.kt:59)");
                        }
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(enrollmentViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance = startRestartGroup.changedInstance(enrollmentViewModel3);
                        changedInstance2 = startRestartGroup.changedInstance(qrcSessionNavArgs);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt$EnrollmentScreen$1$1(enrollmentViewModel3, qrcSessionNavArgs, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                        changedInstance3 = startRestartGroup.changedInstance(enrollmentViewModel3);
                        z = (i4 & 14) == 4;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!(changedInstance3 | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt$EnrollmentScreen$2$1(enrollmentViewModel3, appNavigator, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(enrollmentViewModel3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i4 >> 9) & 14);
                        EnrollmentScreenContent(qrcSessionNavArgs.isPayPalWorldQR(), ((com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState) collectAsStateWithLifecycle.getValue()).getProgress(), modifier3, startRestartGroup, i4 & 896, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                }
                i4 = i3;
                enrollmentViewModel3 = enrollmentViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(enrollmentViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(enrollmentViewModel3);
                changedInstance2 = startRestartGroup.changedInstance(qrcSessionNavArgs);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | changedInstance2)) {
                }
                rememberedValue = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt$EnrollmentScreen$1$1(enrollmentViewModel3, qrcSessionNavArgs, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                changedInstance3 = startRestartGroup.changedInstance(enrollmentViewModel3);
                if ((i4 & 14) == 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(changedInstance3 | z)) {
                }
                rememberedValue2 = new com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt$EnrollmentScreen$2$1(enrollmentViewModel3, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(enrollmentViewModel3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (i4 >> 9) & 14);
                EnrollmentScreenContent(qrcSessionNavArgs.isPayPalWorldQR(), ((com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentUiState) collectAsStateWithLifecycle2.getValue()).getProgress(), modifier3, startRestartGroup, i4 & 896, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                enrollmentViewModel3 = enrollmentViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt.$r8$lambda$8bNmWcRyTIyZR57VRBET61fBvNo(com.paypal.oslo.core.navigation.AppNavigator.this, qrcSessionNavArgs, modifier4, enrollmentViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EnrollmentScreenContent(final boolean z, final float f, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1177941887);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1177941887, i3, -1, "com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenContent (EnrollmentScreen.kt:99)");
                }
                if (z) {
                    i4 = com.paypal.oslo.feature.qrc.R.string.feature_qrc_enrollment_title_paypal_world;
                } else {
                    i4 = com.paypal.oslo.feature.qrc.R.string.feature_qrc_enrollment_title_in_store;
                }
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(i4, startRestartGroup, 0);
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 0, 6, 1004);
                com.paypal.pds.components.ProgressBarKt.ProgressBar(1.0f, f, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 0.0f, 0.0f, 13, null), com.paypal.pds.components.ProgressBarStyle.Neutral.INSTANCE, 0, 0, 0L, null, startRestartGroup, (i3 & 112) | 3078, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt.m17779$r8$lambda$VHy0QCyPGEoY0Gal_WIuu5v7tA(z, f, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$6o-gRSwGE8fmPy5MjyWDzv0-sZo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17778$r8$lambda$6ogRSwGE8fmPy5MjyWDzv0sZo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1509481755);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1509481755, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenEnrollingPreview (EnrollmentScreen.kt:141)");
            }
            EnrollmentScreenContent(false, 0.5f, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt.m17778$r8$lambda$6ogRSwGE8fmPy5MjyWDzv0sZo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8bNmWcRyTIyZR57VRBET61fBvNo(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.qrc.domain.model.session.QrcSessionNavArgs qrcSessionNavArgs, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentViewModel enrollmentViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EnrollmentScreen(appNavigator, qrcSessionNavArgs, modifier, enrollmentViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A7E2Q2oqW5dwJzHZghiRrFddB08(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(889279164);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(889279164, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenCheckingEligibilityPreview (EnrollmentScreen.kt:135)");
            }
            EnrollmentScreenContent(false, 0.0f, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt.$r8$lambda$A7E2Q2oqW5dwJzHZghiRrFddB08(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VHy0QCyPGEoY0G-al_WIuu5v7tA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17779$r8$lambda$VHy0QCyPGEoY0Gal_WIuu5v7tA(boolean z, float f, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EnrollmentScreenContent(z, f, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Yr2u78LT8yrVWyvdbSxNQqwsLmM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1792666516);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1792666516, updateChangedFlags, -1, "com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenSuccessPreview (EnrollmentScreen.kt:147)");
            }
            EnrollmentScreenContent(true, 1.0f, null, startRestartGroup, 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.qrc.ui.enrollment.EnrollmentScreenKt.$r8$lambda$Yr2u78LT8yrVWyvdbSxNQqwsLmM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
