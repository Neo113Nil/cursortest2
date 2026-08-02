package com.paypal.oslo.feature.directdeposit.ui.form.composable;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a$\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001aG\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u0015H\u0001¢\u0006\u0002\u0010\u0017\u001a§\u0001\u0010\u0018\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0001¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"SignatureStrokeWidthPx", "", "buildSignaturePath", "Landroidx/compose/ui/graphics/Path;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "", "Landroidx/compose/ui/geometry/Offset;", "hasSignature", "", "strokes", "Lcom/paypal/oslo/feature/directdeposit/ui/form/composable/StrokePath;", "currentPoints", "DirectDepositESignatureScreen", "", "viewModel", "Lcom/paypal/oslo/feature/directdeposit/ui/form/viewmodel/DirectDepositESignatureViewModel;", "bitmapCaptor", "Lcom/paypal/oslo/feature/directdeposit/ui/form/composable/SignatureBitmapCaptor;", "onBackClick", "Lkotlin/Function0;", "onDoneClick", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "(Lcom/paypal/oslo/feature/directdeposit/ui/form/viewmodel/DirectDepositESignatureViewModel;Lcom/paypal/oslo/feature/directdeposit/ui/form/composable/SignatureBitmapCaptor;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "DirectDepositESignatureContent", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "onClearClick", "onDragStart", "onDrag", "onDragEnd", "onDragCancel", "(Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/graphics/layer/GraphicsLayer;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DirectDepositESignatureScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "directdeposit_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositESignatureScreenKt {
    public static final androidx.compose.ui.graphics.Path buildSignaturePath(java.util.List<androidx.compose.ui.geometry.Offset> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (list.size() <= 1) {
            return null;
        }
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        Path.moveTo(java.lang.Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.Offset) kotlin.collections.CollectionsKt.first((java.util.List) list)).m5762unboximpl() >> 32)), java.lang.Float.intBitsToFloat((int) (((androidx.compose.ui.geometry.Offset) kotlin.collections.CollectionsKt.first((java.util.List) list)).m5762unboximpl() & 4294967295L)));
        java.util.Iterator it = kotlin.collections.CollectionsKt.drop(list, 1).iterator();
        while (it.hasNext()) {
            long m5762unboximpl = ((androidx.compose.ui.geometry.Offset) it.next()).m5762unboximpl();
            Path.lineTo(java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> 32)), java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L)));
        }
        return Path;
    }

    public static final boolean hasSignature(java.util.List<com.paypal.oslo.feature.directdeposit.ui.form.composable.StrokePath> list, java.util.List<androidx.compose.ui.geometry.Offset> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        java.util.List<com.paypal.oslo.feature.directdeposit.ui.form.composable.StrokePath> list3 = list;
        if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
            java.util.Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((com.paypal.oslo.feature.directdeposit.ui.form.composable.StrokePath) it.next()).getPoints().size() > 1) {
                    break;
                }
            }
        }
        return list2.size() > 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x020f, code lost:
    
        if (r15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x024d, code lost:
    
        if (r14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x026a, code lost:
    
        if (r10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L136;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DirectDepositESignatureScreen(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel, com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptor signatureBitmapCaptor, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel2;
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function12;
        final com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function13;
        com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptor signatureBitmapCaptor2;
        int i4;
        int i5;
        int i6;
        int i7;
        final com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function14;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i8;
        int i9;
        final com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptorImpl signatureBitmapCaptorImpl = signatureBitmapCaptor;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1509240070);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                directDepositESignatureViewModel2 = directDepositESignatureViewModel;
                if (startRestartGroup.changedInstance(directDepositESignatureViewModel2)) {
                    i9 = 4;
                    i3 = i9 | i;
                }
            } else {
                directDepositESignatureViewModel2 = directDepositESignatureViewModel;
            }
            i9 = 2;
            i3 = i9 | i;
        } else {
            directDepositESignatureViewModel2 = directDepositESignatureViewModel;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                if ((i & 64) == 0 ? startRestartGroup.changed(signatureBitmapCaptorImpl) : startRestartGroup.changedInstance(signatureBitmapCaptorImpl)) {
                    i8 = 32;
                    i3 |= i8;
                }
            }
            i8 = 16;
            i3 |= i8;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
            }
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
        }
        boolean z = true;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
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
                    i4 = 0;
                    i6 = 256;
                    com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel5 = (com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i7 = i3 & (-15);
                    directDepositESignatureViewModel4 = directDepositESignatureViewModel5;
                    i5 = 2048;
                } else {
                    i4 = 0;
                    i5 = 2048;
                    i6 = 256;
                    i7 = i3;
                    directDepositESignatureViewModel4 = directDepositESignatureViewModel;
                }
                if ((i2 & 2) != 0) {
                    signatureBitmapCaptorImpl = new com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptorImpl();
                    i7 &= -113;
                }
                if (i10 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                } else {
                    function04 = function0;
                }
                if (i11 != 0) {
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.m14708$r8$lambda$PH9OTDMx3hzk6KktYgCcQXBEuU((android.graphics.Bitmap) obj4);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    function03 = function04;
                    function14 = (kotlin.jvm.functions.Function1) rememberedValue2;
                } else {
                    function14 = function1;
                    function03 = function04;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                i7 = i3;
                i4 = 0;
                function14 = function12;
                i5 = 2048;
                function03 = function02;
                directDepositESignatureViewModel4 = directDepositESignatureViewModel2;
                i6 = 256;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1509240070, i7, -1, "com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreen (DirectDepositESignatureScreen.kt:98)");
            }
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2 = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue4;
            final androidx.compose.ui.graphics.layer.GraphicsLayer rememberGraphicsLayer = androidx.compose.ui.graphics.GraphicsLayerScopeKt.rememberGraphicsLayer(startRestartGroup, i4);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue5;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(directDepositESignatureViewModel4);
            int i12 = (i7 & 896) == i6 ? 1 : i4;
            int i13 = (i7 & 7168) == i5 ? 1 : i4;
            com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1 rememberedValue6 = startRestartGroup.rememberedValue();
            if ((i12 | (changedInstance ? 1 : 0) | i13) != 0 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1(directDepositESignatureViewModel4, function03, function14, snapshotStateList, snapshotStateList2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList3 = snapshotStateList;
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList4 = snapshotStateList2;
            boolean hasSignature = hasSignature(snapshotStateList3, snapshotStateList4);
            boolean changedInstance2 = startRestartGroup.changedInstance(directDepositESignatureViewModel4);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
                obj = rememberedValue7;
            }
            kotlin.jvm.functions.Function0 function05 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.$r8$lambda$g5itnBOeSNXFQiKwOPmxxMwK27s(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(function05);
            obj = function05;
            kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) obj;
            boolean changedInstance3 = startRestartGroup.changedInstance(coroutineScope);
            if ((((i7 & 112) ^ 48) <= 32 || !startRestartGroup.changedInstance(signatureBitmapCaptorImpl)) && (i7 & 48) != 32) {
                z = false;
            }
            boolean changedInstance4 = startRestartGroup.changedInstance(rememberGraphicsLayer);
            boolean changedInstance5 = startRestartGroup.changedInstance(directDepositESignatureViewModel4);
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (!(changedInstance4 | changedInstance3 | z | changedInstance5)) {
                obj2 = rememberedValue8;
            }
            kotlin.jvm.functions.Function0 function07 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.m14705$r8$lambda$DWYdEEUYEAo8Jc0NVm0aQGs0zQ(kotlinx.coroutines.CoroutineScope.this, signatureBitmapCaptorImpl, rememberGraphicsLayer, directDepositESignatureViewModel4);
                }
            };
            startRestartGroup.updateRememberedValue(function07);
            obj2 = function07;
            kotlin.jvm.functions.Function0 function08 = (kotlin.jvm.functions.Function0) obj2;
            boolean changedInstance6 = startRestartGroup.changedInstance(directDepositESignatureViewModel4);
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (!changedInstance6) {
                obj3 = rememberedValue9;
            }
            kotlin.jvm.functions.Function0 function09 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.$r8$lambda$fYbDRpqsThLABS4Fa63Pt6g9htI(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(function09);
            obj3 = function09;
            kotlin.jvm.functions.Function0 function010 = (kotlin.jvm.functions.Function0) obj3;
            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj4) {
                        return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.m14710$r8$lambda$cTPq6qAqekoiIYdb4EMVY1WWJk(androidx.compose.runtime.snapshots.SnapshotStateList.this, (androidx.compose.ui.geometry.Offset) obj4);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue10;
            java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj4) {
                        return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.$r8$lambda$WAwIEor3iGmu4KIb9apVoOTQKtY(androidx.compose.runtime.snapshots.SnapshotStateList.this, (androidx.compose.ui.geometry.Offset) obj4);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            kotlin.jvm.functions.Function1 function16 = (kotlin.jvm.functions.Function1) rememberedValue11;
            java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.m14707$r8$lambda$L6gH1cDN9GpJFgSZvTnoTDPKyI(androidx.compose.runtime.snapshots.SnapshotStateList.this, snapshotStateList);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            kotlin.jvm.functions.Function0 function011 = (kotlin.jvm.functions.Function0) rememberedValue12;
            java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.m14706$r8$lambda$LAqD8ug1ozXg4ubwiuiOHsgcOc(androidx.compose.runtime.snapshots.SnapshotStateList.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            DirectDepositESignatureContent(snapshotStateList3, snapshotStateList4, rememberGraphicsLayer, hasSignature, function06, function08, function010, function15, function16, function011, (kotlin.jvm.functions.Function0) rememberedValue13, startRestartGroup, (androidx.compose.ui.graphics.layer.GraphicsLayer.$stable << 6) | 918552630, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            signatureBitmapCaptor2 = signatureBitmapCaptorImpl;
            directDepositESignatureViewModel3 = directDepositESignatureViewModel4;
            function13 = function14;
        } else {
            startRestartGroup.skipToGroupEnd();
            directDepositESignatureViewModel3 = directDepositESignatureViewModel;
            function03 = function0;
            function13 = function1;
            signatureBitmapCaptor2 = signatureBitmapCaptorImpl;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptor signatureBitmapCaptor3 = signatureBitmapCaptor2;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function012 = function03;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                    return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.$r8$lambda$R2_n1PZ9XJ8Bi_2vSBM3i_PtBTY(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel.this, signatureBitmapCaptor3, function012, function13, i, i2, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DirectDepositESignatureContent(final java.util.List<com.paypal.oslo.feature.directdeposit.ui.form.composable.StrokePath> list, final java.util.List<androidx.compose.ui.geometry.Offset> list2, final androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, final kotlin.jvm.functions.Function0<kotlin.Unit> function05, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function05, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1278210402);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(graphicsLayer) : startRestartGroup.changedInstance(graphicsLayer) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function04) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function05) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) {
            z2 = false;
            if (startRestartGroup.shouldExecute(z2, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1278210402, i3, i4, "com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureContent (DirectDepositESignatureScreen.kt:165)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), "directDepositESignatureScreen");
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_form_esignature_button_text, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositESignatureScreenTopBar"), null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(912501574, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.$r8$lambda$DurFcaIsdfgjdBt_jpgdbQxE1ec(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, 196656, 92);
                androidx.compose.ui.Modifier m22099borderDzVHIIc = com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8()), com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24()), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderBase.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape24(), startRestartGroup, 384, 0);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22099borderDzVHIIc);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier clipToBounds = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null));
                boolean z3 = (i3 & 896) == 256 || ((i3 & 512) != 0 && startRestartGroup.changedInstance(graphicsLayer));
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.$r8$lambda$vaczclcm30UmnuNIqYUYAs_ZW6I(androidx.compose.ui.graphics.layer.GraphicsLayer.this, (androidx.compose.ui.graphics.drawscope.ContentDrawScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier drawWithContent = androidx.compose.ui.draw.DrawModifierKt.drawWithContent(clipToBounds, (kotlin.jvm.functions.Function1) rememberedValue);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean z4 = (i3 & 29360128) == 8388608;
                boolean z5 = (1879048192 & i3) == 536870912;
                boolean z6 = (i4 & 14) == 4;
                boolean z7 = (234881024 & i3) == 67108864;
                com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureContent$1$1$2$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z6 | z4 | z5 | z7) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureContent$1$1$2$2$1(function1, function04, function05, function12);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(drawWithContent, unit, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue2), "directDepositESignatureCanvas");
                boolean changedInstance = startRestartGroup.changedInstance(list);
                boolean changedInstance2 = startRestartGroup.changedInstance(list2);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.$r8$lambda$xOr_W9bcY3QLCF28jKr6e1zIiSY(list, list2, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.foundation.CanvasKt.Canvas(testTag2, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, 0);
                if (!z) {
                    startRestartGroup.startReplaceGroup(2043421534);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_form_esignature_sign_here_hint, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositESignatureHintLabel"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(2043816102);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                composer2 = startRestartGroup;
                com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_deposit_switch_success_cta_button, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing8()), "directDepositESignatureDoneButton"), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, z, false, composer2, ((i3 << 12) & 29360128) | ((i3 >> 15) & 14) | 1769472, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                com.paypal.pds.components.ButtonKt.Button(function03, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_form_esignature_clear_cta_button, composer2, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "directDepositESignatureClearButton"), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, ((i3 >> 18) & 14) | 1769472, 408);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.m14713$r8$lambda$uaT6JctLGYx6GD3Y8cGTVvGCNQ(list, list2, graphicsLayer, z, function0, function02, function03, function1, function12, function04, function05, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        z2 = true;
        if (startRestartGroup.shouldExecute(z2, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6vUTMnH7WnHVh6T9hdnrlag5qpw(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(835442901);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(835442901, updateChangedFlags, -1, "com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenPreview (DirectDepositESignatureScreen.kt:274)");
            }
            java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
            java.util.List emptyList2 = kotlin.collections.CollectionsKt.emptyList();
            androidx.compose.ui.graphics.layer.GraphicsLayer rememberGraphicsLayer = androidx.compose.ui.graphics.GraphicsLayerScopeKt.rememberGraphicsLayer(startRestartGroup, 0);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda6
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
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue6;
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            composer2 = startRestartGroup;
            DirectDepositESignatureContent(emptyList, emptyList2, rememberGraphicsLayer, false, function0, function02, function03, function1, function12, function04, (kotlin.jvm.functions.Function0) rememberedValue7, startRestartGroup, (androidx.compose.ui.graphics.layer.GraphicsLayer.$stable << 6) | 920349750, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.$r8$lambda$6vUTMnH7WnHVh6T9hdnrlag5qpw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$D-WYdEEUYEAo8Jc0NVm0aQGs0zQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14705$r8$lambda$DWYdEEUYEAo8Jc0NVm0aQGs0zQ(kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptor signatureBitmapCaptor, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$5$1$1(signatureBitmapCaptor, graphicsLayer, directDepositESignatureViewModel, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DurFcaIsdfgjdBt_jpgdbQxE1ec(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(912501574, i, -1, "com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureContent.<anonymous>.<anonymous>.<anonymous> (DirectDepositESignatureScreen.kt:177)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositESignatureScreenBackButton");
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_back_button_voiceover, composer, 0), composer, 0, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$L-AqD8ug1ozXg4ubwiuiOHsgcOc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14706$r8$lambda$LAqD8ug1ozXg4ubwiuiOHsgcOc(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList) {
        snapshotStateList.clear();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$L6gH1cDN9Gp-JFgSZvTnoTDPKyI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14707$r8$lambda$L6gH1cDN9GpJFgSZvTnoTDPKyI(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2) {
        if (snapshotStateList.size() > 1) {
            snapshotStateList2.add(new com.paypal.oslo.feature.directdeposit.ui.form.composable.StrokePath(snapshotStateList.toList()));
        }
        snapshotStateList.clear();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PH9OTDMx3hzk-6KktYgCcQXBEuU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14708$r8$lambda$PH9OTDMx3hzk6KktYgCcQXBEuU(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q84hPIpM0Hn8JVeiMt7IFFm40KE(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        contentDrawScope.drawContent();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R2_n1PZ9XJ8Bi_2vSBM3i_PtBTY(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel, com.paypal.oslo.feature.directdeposit.ui.form.composable.SignatureBitmapCaptor signatureBitmapCaptor, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DirectDepositESignatureScreen(directDepositESignatureViewModel, signatureBitmapCaptor, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WAwIEor3iGmu4KIb9apVoOTQKtY(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, androidx.compose.ui.geometry.Offset offset) {
        snapshotStateList.add(offset);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cTPq6qAqekoiIYdb-4EMVY1WWJk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14710$r8$lambda$cTPq6qAqekoiIYdb4EMVY1WWJk(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, androidx.compose.ui.geometry.Offset offset) {
        snapshotStateList.clear();
        snapshotStateList.add(offset);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fYbDRpqsThLABS4Fa63Pt6g9htI(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel) {
        directDepositESignatureViewModel.processIntent((com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent) com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent.ClearClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g5itnBOeSNXFQiKwOPmxxMwK27s(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel) {
        directDepositESignatureViewModel.processIntent((com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent) com.paypal.oslo.feature.directdeposit.ui.form.intent.ESignatureIntent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uaT6-JctLGYx6GD3Y8cGTVvGCNQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14713$r8$lambda$uaT6JctLGYx6GD3Y8cGTVvGCNQ(java.util.List list, java.util.List list2, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DirectDepositESignatureContent(list, list2, graphicsLayer, z, function0, function02, function03, function1, function12, function04, function05, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vaczclcm30UmnuNIqYUYAs_ZW6I(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, final androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentDrawScope, "");
        androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope2 = contentDrawScope;
        androidx.compose.ui.graphics.drawscope.DrawScope.m6529recordJVtK1S4$default(contentDrawScope2, graphicsLayer, 0L, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt.$r8$lambda$Q84hPIpM0Hn8JVeiMt7IFFm40KE(androidx.compose.ui.graphics.drawscope.ContentDrawScope.this, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
            }
        }, 1, null);
        androidx.compose.ui.graphics.layer.GraphicsLayerKt.drawLayer(contentDrawScope2, graphicsLayer);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xOr_W9bcY3QLCF28jKr6e1zIiSY(java.util.List list, java.util.List list2, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU(), 0L, drawScope.mo6531getSizeNHjbRc(), 0.0f, null, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null);
        androidx.compose.ui.graphics.drawscope.Stroke stroke = new androidx.compose.ui.graphics.drawscope.Stroke(20.0f, 0.0f, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6352getRoundLxFBmk8(), null, 18, null);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.compose.ui.graphics.Path buildSignaturePath = buildSignaturePath(((com.paypal.oslo.feature.directdeposit.ui.form.composable.StrokePath) it.next()).getPoints());
            if (buildSignaturePath != null) {
                androidx.compose.ui.graphics.drawscope.DrawScope.m6522drawPathLG529CI$default(drawScope, buildSignaturePath, androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), 0.0f, stroke, null, 0, 52, null);
            }
        }
        androidx.compose.ui.graphics.Path buildSignaturePath2 = buildSignaturePath(list2);
        if (buildSignaturePath2 != null) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6522drawPathLG529CI$default(drawScope, buildSignaturePath2, androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), 0.0f, stroke, null, 0, 52, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
