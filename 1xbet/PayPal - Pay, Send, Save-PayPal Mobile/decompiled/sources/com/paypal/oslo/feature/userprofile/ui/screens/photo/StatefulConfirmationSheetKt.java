package com.paypal.oslo.feature.userprofile.ui.screens.photo;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¥\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0001¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"StatefulConfirmationSheet", "", "icon", "Lcom/paypal/pds/core/Icon;", "title", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "primaryButtonText", "primaryButtonAction", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction;", "primaryButtonTestTag", "checkInProgressState", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadUiState;", "", "onSuccess", "Lkotlin/Function0;", "onError", "onClose", "modifier", "Landroidx/compose/ui/Modifier;", "secondaryButtonText", "secondaryButtonTestTag", "viewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhotoUploadViewModel;", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/ui/model/PhotoUploadAction;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhotoUploadViewModel;Landroidx/compose/runtime/Composer;III)V", "user-profile_prodRelease", "uploadState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StatefulConfirmationSheetKt {
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0173, code lost:
    
        if (r2.changedInstance(r51) == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StatefulConfirmationSheet(final com.paypal.pds.core.Icon icon, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction photoUploadAction, final java.lang.String str4, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState, java.lang.Boolean> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.ui.Modifier modifier, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final java.lang.String str7;
        final java.lang.String str8;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str9;
        int i6;
        java.lang.String str10;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel3;
        androidx.compose.ui.Modifier modifier3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        java.lang.Object obj;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final boolean z;
        int i7;
        kotlin.jvm.functions.Function0 function05;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoUploadAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1282384049);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        int i8 = 2048;
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= (i & 32768) == 0 ? startRestartGroup.changed(photoUploadAction) : startRestartGroup.changedInstance(photoUploadAction) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= startRestartGroup.changed(str4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function02) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function03) ? 536870912 : 268435456;
        }
        int i9 = i4;
        int i10 = i3 & 1024;
        if (i10 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i11 = i3 & 2048;
        if (i11 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(str5) ? 32 : 16;
        }
        int i12 = i5;
        int i13 = i3 & 4096;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i2 & 384) == 0) {
            i12 |= startRestartGroup.changed(str6) ? 256 : 128;
            if ((i2 & 3072) == 0) {
                if ((i3 & 8192) != 0) {
                }
                i8 = 1024;
                i12 |= i8;
            }
            if (!startRestartGroup.shouldExecute((i9 & 306783379) == 306783378 || (i12 & 1171) != 1170, i9 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 8192) != 0) {
                        i12 &= -7169;
                    }
                    modifier3 = modifier;
                    str9 = str5;
                    str10 = str6;
                    i6 = i12;
                    photoUploadViewModel3 = photoUploadViewModel;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                    java.lang.String str11 = i11 != 0 ? null : str5;
                    java.lang.String str12 = i13 != 0 ? "secondary_button" : str6;
                    if ((i3 & 8192) != 0) {
                        java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                        kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                        androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, startRestartGroup, 0);
                        if (componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = componentActivity.getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel4 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel.class), componentActivity, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        str9 = str11;
                        i6 = i12 & (-7169);
                        str10 = str12;
                        photoUploadViewModel3 = photoUploadViewModel4;
                    } else {
                        str9 = str11;
                        i6 = i12;
                        str10 = str12;
                        photoUploadViewModel3 = photoUploadViewModel;
                    }
                    modifier3 = companion;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1282384049, i9, i6, "com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheet (StatefulConfirmationSheet.kt:115)");
                }
                androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(photoUploadViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                boolean booleanValue = function1.invoke((com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState) collectAsStateWithLifecycle.getValue()).booleanValue();
                com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState photoUploadUiState = (com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState) collectAsStateWithLifecycle.getValue();
                boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                boolean z2 = (i9 & 29360128) == 8388608;
                boolean z3 = (234881024 & i9) == 67108864;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (((changed | z2) || z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    obj = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheetKt$StatefulConfirmationSheet$1$1(function0, function02, collectAsStateWithLifecycle, null);
                    startRestartGroup.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(photoUploadUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) obj, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(284595588);
                java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(photoUploadViewModel3);
                boolean z4 = (i9 & 57344) == 16384 || ((i9 & 32768) != 0 && startRestartGroup.changedInstance(photoUploadAction));
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | z4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheetKt.$r8$lambda$s4oqJTjEoMIEqVtn92_PD8zhuDA(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel.this, photoUploadAction);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                int i14 = i6;
                createListBuilder.add(new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton(str3, primary, (kotlin.jvm.functions.Function0) rememberedValue2, str4, booleanValue, null, 32, null));
                if (str9 != null) {
                    startRestartGroup.startReplaceGroup(-1643507753);
                    com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                    z = booleanValue;
                    boolean changed2 = startRestartGroup.changed(z);
                    boolean changedInstance2 = startRestartGroup.changedInstance(photoUploadViewModel3);
                    i7 = i9;
                    boolean z5 = (1879048192 & i7) == 536870912;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (((changed2 | changedInstance2) || z5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        function04 = function03;
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheetKt.$r8$lambda$revEmget9NejvEX_EEBNLqVrTt4(z, photoUploadViewModel3, function04);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    } else {
                        function04 = function03;
                    }
                    createListBuilder.add(new com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationButton(str9, secondary, (kotlin.jvm.functions.Function0) rememberedValue3, str10, false, null, 48, null));
                    startRestartGroup.endReplaceGroup();
                } else {
                    function04 = function03;
                    z = booleanValue;
                    i7 = i9;
                    startRestartGroup.startReplaceGroup(-1643033980);
                    startRestartGroup.endReplaceGroup();
                }
                java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
                startRestartGroup.endReplaceGroup();
                if (z) {
                    startRestartGroup.startReplaceGroup(233680753);
                    startRestartGroup.endReplaceGroup();
                    function05 = null;
                } else {
                    startRestartGroup.startReplaceGroup(233752146);
                    boolean z6 = (1879048192 & i7) == 536870912;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (z6 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheetKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheetKt.m20575$r8$lambda$giOeFFSYcAlnvUbuQ_RXZ4qp2Y(kotlin.jvm.functions.Function0.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceGroup();
                    function05 = (kotlin.jvm.functions.Function0) rememberedValue4;
                }
                photoUploadViewModel2 = photoUploadViewModel3;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.userprofile.ui.components.common.ConfirmationBottomSheetKt.ConfirmationBottomSheet(icon, str, str2, build, modifier3, function05, null, null, null, startRestartGroup, (i7 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i14 << 12) & 57344), 448);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                str7 = str9;
                str8 = str10;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier2 = modifier;
                str7 = str5;
                str8 = str6;
                photoUploadViewModel2 = photoUploadViewModel;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel5 = photoUploadViewModel2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.photo.StatefulConfirmationSheetKt.$r8$lambda$5oJVDJ2brqxOK9TEPFo3BmqiOVU(com.paypal.pds.core.Icon.this, str, str2, str3, photoUploadAction, str4, function1, function0, function02, function03, modifier2, str7, str8, photoUploadViewModel5, i, i2, i3, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        if ((i2 & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i9 & 306783379) == 306783378 || (i12 & 1171) != 1170, i9 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5oJVDJ2brqxOK9TEPFo3BmqiOVU(com.paypal.pds.core.Icon icon, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction photoUploadAction, java.lang.String str4, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.ui.Modifier modifier, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        StatefulConfirmationSheet(icon, str, str2, str3, photoUploadAction, str4, function1, function0, function02, function03, modifier, str5, str6, photoUploadViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$giOeFFSY-cAlnvUbuQ_RXZ4qp2Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20575$r8$lambda$giOeFFSYcAlnvUbuQ_RXZ4qp2Y(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$revEmget9NejvEX_EEBNLqVrTt4(boolean z, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, kotlin.jvm.functions.Function0 function0) {
        if (z) {
            photoUploadViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.CancelOperation.INSTANCE);
        }
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s4oqJTjEoMIEqVtn92_PD8zhuDA(com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel, com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction photoUploadAction) {
        photoUploadViewModel.handleAction(photoUploadAction);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState access$StatefulConfirmationSheet$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadUiState) state.getValue();
    }
}
