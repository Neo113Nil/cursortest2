package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001aJ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"TurnOffAutopayHalfSheet", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "updateAutopayModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;", "onDismiss", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "autopayUpdated", "viewModel", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayViewModel;", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/TurnOffAutopayModel;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayViewModel;Landroidx/compose/runtime/Composer;II)V", "TurnOffAutopayHalfSheetContent", "content", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/content/TurnOffAutopayContent;", "onConfirm", "Lkotlin/Function0;", "onNeverMind", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/content/TurnOffAutopayContent;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TurnOffAutopayHalfSheetLightPreview", "(Landroidx/compose/runtime/Composer;I)V", "TurnOffAutopayHalfSheetDarkPreview", "bnpl-servicing_prodRelease", "uiState", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiState;", "autopayStatusUpdated"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TurnOffAutopayHalfSheetKt {
    public static final void TurnOffAutopayHalfSheet(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel3;
        androidx.view.viewmodel.CreationExtras withCreationCallback;
        boolean z;
        int i4;
        com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel4;
        int i5;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(turnOffAutopayModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-972536023);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(turnOffAutopayModel) : startRestartGroup.changedInstance(turnOffAutopayModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                updateAutopayViewModel2 = updateAutopayViewModel;
                if (startRestartGroup.changedInstance(updateAutopayViewModel2)) {
                    i6 = 2048;
                    i3 |= i6;
                }
            } else {
                updateAutopayViewModel2 = updateAutopayViewModel;
            }
            i6 = 1024;
            i3 |= i6;
        } else {
            updateAutopayViewModel2 = updateAutopayViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 1171) != 1170, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    boolean z2 = (i7 & 112) == 32 || ((i7 & 64) != 0 && startRestartGroup.changedInstance(turnOffAutopayModel));
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt.$r8$lambda$a19t1SZqyPVyLsLpTgZOly00qRE(com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel.this, (com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.Factory) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function12);
                    } else {
                        withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function12);
                    }
                    z = false;
                    i4 = i7 & (-7169);
                    updateAutopayViewModel4 = (com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, withCreationCallback, startRestartGroup, 0, 0);
                    i5 = i4;
                }
                z = false;
                i5 = i7;
                updateAutopayViewModel4 = updateAutopayViewModel2;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i4 = i7 & (-7169);
                    updateAutopayViewModel4 = updateAutopayViewModel2;
                    z = false;
                    i5 = i4;
                }
                z = false;
                i5 = i7;
                updateAutopayViewModel4 = updateAutopayViewModel2;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-972536023, i5, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheet (TurnOffAutopayHalfSheet.kt:85)");
            }
            final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(updateAutopayViewModel4.getUiState$bnpl_servicing_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            int i8 = i5 & 14;
            boolean z3 = (i8 == 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController))) ? true : z;
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$2$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(bottomSheetController, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | i8);
            boolean changedInstance = startRestartGroup.changedInstance(updateAutopayViewModel4);
            int i9 = i5 & 896;
            boolean z4 = i9 == 256 ? true : z;
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changedInstance | z4) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1(updateAutopayViewModel4, function1, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(updateAutopayViewModel4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, (i5 >> 9) & 14);
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig("", false, null, 4, null);
            if (i9 == 256) {
                z = true;
            }
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (z || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt.m12648$r8$lambda$IJq7yUVho0lzIVYOsylphG2KkQ(kotlin.jvm.functions.Function1.this, mutableState);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel5 = updateAutopayViewModel4;
            com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel6 = updateAutopayViewModel4;
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue5, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1730817520, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt.m12650$r8$lambda$UTK3lIlpQIcqJPheGN84hQm3jk(com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel.this, updateAutopayViewModel5, function1, bottomSheetController, collectAsStateWithLifecycle, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 817889280 | i8 | (com.paypal.pds.components.TopNavConfig.$stable << 6), 314);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            updateAutopayViewModel3 = updateAutopayViewModel6;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            updateAutopayViewModel3 = updateAutopayViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt.$r8$lambda$ZkH92S3XiApVcM0s6P8Zd8i_Mp0(com.paypal.pds.components.BottomSheetController.this, turnOffAutopayModel, function1, updateAutopayViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent turnOffAutopayContent, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1024174705);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(turnOffAutopayContent) : startRestartGroup.changedInstance(turnOffAutopayContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1024174705, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetContent (TurnOffAutopayHalfSheet.kt:177)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetTestTags.CONTENT);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
            com.paypal.pds.components.AvatarSource.Image image = new com.paypal.pds.components.AvatarSource.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.bnplservicing.R.drawable.feature_bnpl_servicing_clock_countdown, startRestartGroup, 0), null, 2, null);
            com.paypal.pds.components.AvatarSource.Image image2 = image;
            com.paypal.pds.components.AvatarKt.Avatar(image2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetTestTags.ICON), com.paypal.pds.components.AvatarSize.Large.INSTANCE, com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE, null, null, startRestartGroup, (com.paypal.pds.components.AvatarSize.Large.$stable << 6) | 3120, 48);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(turnOffAutopayContent.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetTestTags.TITLE), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 48, 6, 1004);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(turnOffAutopayContent.getDescription(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetTestTags.DESCRIPTION), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 48, 6, 1004);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, com.paypal.oslo.core.commonui.utils.RefTextKt.value(turnOffAutopayContent.getConfirmButtonText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetTestTags.CONFIRM_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, false, false, startRestartGroup, ((i3 >> 3) & 14) | 196992, 472);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
            com.paypal.pds.components.ButtonKt.Button(function02, com.paypal.oslo.core.commonui.utils.RefTextKt.value(turnOffAutopayContent.getNeverMindButtonText(), composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetTestTags.NEVER_MIND_BUTTON), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, false, false, composer2, ((i3 >> 6) & 14) | 196992, 472);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt.$r8$lambda$QabhWOrIoySzEeWykXtamjvjj8I(com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent.this, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$43h0kiL8FrQYJOAXKU8qWnZsm7I(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1607347094);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1607347094, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetLightPreview (TurnOffAutopayHalfSheet.kt:252)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent turnOffAutopayContent = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider().getTurnOffAutopayContent();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Camera2StreamConfigurationMap(turnOffAutopayContent, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt.$r8$lambda$43h0kiL8FrQYJOAXKU8qWnZsm7I(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5nsVtjZuVjqXHOYizefmmLPaIK0(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EOoixbuVJ98DofS7e9NegVzZzRw(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel autopayUpdatedModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1 function1) {
        boolean z = (autopayUpdatedModel.getAutopayOnModel() == null && autopayUpdatedModel.getAutopayOffModel() == null) ? false : true;
        updateAutopayViewModel.processEvent(new com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnSuccessMessageDismissed(autopayUpdatedModel.getAutopayOnModel(), autopayUpdatedModel.getAutopayOffModel()));
        bottomSheetController.hideSheet();
        function1.invoke(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$IJq7yUVho0lzIVYOs-ylphG2KkQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12648$r8$lambda$IJq7yUVho0lzIVYOsylphG2KkQ(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState) {
        function1.invoke(java.lang.Boolean.valueOf(((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QJE8UHsZZwdpbfbIUppZ-rnAm2k, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12649$r8$lambda$QJE8UHsZZwdpbfbIUppZrnAm2k(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-480731624);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-480731624, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetDarkPreview (TurnOffAutopayHalfSheet.kt:269)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent turnOffAutopayContent = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.PlanDetailsContentProvider().getTurnOffAutopayContent();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Camera2StreamConfigurationMap(turnOffAutopayContent, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | 432);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt.m12649$r8$lambda$QJE8UHsZZwdpbfbIUppZrnAm2k(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QabhWOrIoySzEeWykXtamjvjj8I(com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent turnOffAutopayContent, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(turnOffAutopayContent, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UTK3lIlpQIcqJPheGN84h-Qm3jk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12650$r8$lambda$UTK3lIlpQIcqJPheGN84hQm3jk(com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel, final com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel, final kotlin.jvm.functions.Function1 function1, final com.paypal.pds.components.BottomSheetController bottomSheetController, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1730817520, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheet.<anonymous> (TurnOffAutopayHalfSheet.kt:123)");
            }
            com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState updateAutopayUiState = (com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState) state.getValue();
            if (updateAutopayUiState instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Loading) {
                composer.startReplaceGroup(1702436797);
                com.paypal.oslo.feature.bnplservicing.ui.common.components.LoadingContentKt.LoadingContent(false, composer, 6, 0);
                composer.endReplaceGroup();
            } else if (updateAutopayUiState instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Default) {
                composer.startReplaceGroup(1702545359);
                com.paypal.oslo.feature.bnplservicing.ui.plandetails.content.TurnOffAutopayContent content = turnOffAutopayModel.getContent();
                boolean changedInstance = composer.changedInstance(updateAutopayViewModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt.m12652$r8$lambda$g8AF1bV4jSDGyfQ66bNH1jk_m4(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean changed = composer.changed(function1);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt.$r8$lambda$5nsVtjZuVjqXHOYizefmmLPaIK0(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                Camera2StreamConfigurationMap(content, function0, (kotlin.jvm.functions.Function0) rememberedValue2, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable);
                composer.endReplaceGroup();
            } else if (updateAutopayUiState instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Success) {
                composer.startReplaceGroup(1702897457);
                final com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel model = ((com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Success) updateAutopayUiState).getModel();
                com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContent autopayContent = com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayContentHelperKt.getAutopayContent(model, composer, 0);
                boolean changedInstance2 = composer.changedInstance(model);
                boolean changedInstance3 = composer.changedInstance(updateAutopayViewModel);
                boolean changedInstance4 = composer.changedInstance(bottomSheetController);
                boolean changed2 = composer.changed(function1);
                java.lang.Object rememberedValue3 = composer.rememberedValue();
                if ((changedInstance2 | changedInstance3 | changedInstance4 | changed2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt.$r8$lambda$EOoixbuVJ98DofS7e9NegVzZzRw(com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayUpdatedModel.this, updateAutopayViewModel, bottomSheetController, function1);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.bnplservicing.ui.autopay.AutopayMessageHalfSheetKt.AutopayMessageContent(autopayContent, (kotlin.jvm.functions.Function0) rememberedValue3, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (!(updateAutopayUiState instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiState.Error)) {
                    composer.startReplaceGroup(1163295031);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1703689259);
                boolean changedInstance5 = composer.changedInstance(updateAutopayViewModel);
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt.m12651$r8$lambda$buQuJmGdp5jifG2LWT0sQcFhUE(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.feature.bnplservicing.ui.common.components.ErrorContentKt.ErrorContent((kotlin.jvm.functions.Function0) rememberedValue4, null, null, null, null, composer, 0, 30);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZkH92S3XiApVcM0s6P8Zd8i_Mp0(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TurnOffAutopayHalfSheet(bottomSheetController, turnOffAutopayModel, function1, updateAutopayViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel $r8$lambda$a19t1SZqyPVyLsLpTgZOly00qRE(com.paypal.oslo.feature.bnplservicing.ui.autopay.TurnOffAutopayModel turnOffAutopayModel, com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(turnOffAutopayModel);
    }

    /* renamed from: $r8$lambda$bu-QuJmGdp5jifG2LWT0sQcFhUE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12651$r8$lambda$buQuJmGdp5jifG2LWT0sQcFhUE(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel) {
        updateAutopayViewModel.processEvent(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnConfirmClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$g8AF1bV4jSDGyfQ66bNH1jk-_m4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12652$r8$lambda$g8AF1bV4jSDGyfQ66bNH1jk_m4(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel) {
        updateAutopayViewModel.processEvent(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayEvent.OnConfirmClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
