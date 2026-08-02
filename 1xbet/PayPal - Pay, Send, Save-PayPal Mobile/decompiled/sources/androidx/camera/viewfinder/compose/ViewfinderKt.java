package androidx.camera.viewfinder.compose;

@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u001ab\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001aP\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011H\u0003¢\u0006\u0002\u0010\u001a\u001a\f\u0010\u001b\u001a\u00020\u001c*\u00020\u000bH\u0002\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020\rH\u0002¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u008e\u0002"}, d2 = {"Viewfinder", "", "surfaceRequest", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "modifier", "Landroidx/compose/ui/Modifier;", "transformationInfo", "Landroidx/camera/viewfinder/core/TransformationInfo;", "coordinateTransformer", "Landroidx/camera/viewfinder/compose/MutableCoordinateTransformer;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "onInit", "Lkotlin/Function1;", "Landroidx/camera/viewfinder/compose/ViewfinderInitScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;Landroidx/compose/ui/Modifier;Landroidx/camera/viewfinder/core/TransformationInfo;Landroidx/camera/viewfinder/compose/MutableCoordinateTransformer;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "TransformedSurface", "surfaceWidth", "", "surfaceHeight", "implementationMode", "Landroidx/camera/viewfinder/core/ImplementationMode;", "Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceScope;", "(IILandroidx/camera/viewfinder/core/TransformationInfo;Landroidx/camera/viewfinder/core/ImplementationMode;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "toInternalAlignment", "Landroidx/camera/viewfinder/core/impl/Alignment;", "toInternalContentScale", "Landroidx/camera/viewfinder/core/impl/ContentScale;", "viewfinder-compose", "canTransformSurface", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewfinderKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Viewfinder(final androidx.camera.viewfinder.core.ViewfinderSurfaceRequest viewfinderSurfaceRequest, androidx.compose.ui.Modifier modifier, androidx.camera.viewfinder.core.TransformationInfo transformationInfo, androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, final kotlin.jvm.functions.Function1<? super androidx.camera.viewfinder.compose.ViewfinderInitScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.camera.viewfinder.core.TransformationInfo transformationInfo2;
        int i4;
        int i5;
        androidx.compose.ui.Alignment alignment2;
        int i6;
        androidx.compose.ui.layout.ContentScale contentScale2;
        androidx.compose.ui.layout.ContentScale crop;
        androidx.compose.ui.Alignment alignment3;
        androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer2;
        androidx.compose.ui.Modifier modifier3;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m5299constructorimpl;
        boolean changed;
        java.lang.Object rememberedValue;
        java.lang.Object implementationMode;
        boolean changed2;
        java.lang.Object rememberedValue2;
        boolean changed3;
        boolean changed4;
        boolean changed5;
        boolean changedInstance;
        boolean changed6;
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.Object rememberedValue3;
        boolean changedInstance2;
        boolean z4;
        boolean changed7;
        java.lang.Object rememberedValue4;
        final androidx.compose.ui.Modifier modifier4;
        final androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer3;
        final androidx.compose.ui.Alignment alignment4;
        final androidx.compose.ui.layout.ContentScale contentScale3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer4 = mutableCoordinateTransformer;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2052669900);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(viewfinderSurfaceRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    transformationInfo2 = transformationInfo;
                    if (startRestartGroup.changedInstance(transformationInfo2)) {
                        i7 = 256;
                        i3 |= i7;
                    }
                } else {
                    transformationInfo2 = transformationInfo;
                }
                i7 = 128;
                i3 |= i7;
            } else {
                transformationInfo2 = transformationInfo;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? startRestartGroup.changed(mutableCoordinateTransformer4) : startRestartGroup.changedInstance(mutableCoordinateTransformer4) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                alignment2 = alignment;
                i3 |= startRestartGroup.changed(alignment2) ? 16384 : 8192;
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    contentScale2 = contentScale;
                } else {
                    contentScale2 = contentScale;
                    if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(contentScale2) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                }
                if ((i3 & 599187) != 599186 && startRestartGroup.getSkipping()) {
                    startRestartGroup.skipToGroupEnd();
                    mutableCoordinateTransformer3 = mutableCoordinateTransformer4;
                    modifier4 = modifier2;
                    contentScale3 = contentScale2;
                    alignment4 = alignment2;
                } else {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            transformationInfo2 = androidx.camera.viewfinder.core.TransformationInfo.DEFAULT;
                        }
                        if (i4 != 0) {
                            mutableCoordinateTransformer4 = null;
                        }
                        if (i5 != 0) {
                            alignment2 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                        }
                        if (i6 != 0) {
                            crop = androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop();
                            alignment3 = alignment2;
                            mutableCoordinateTransformer2 = mutableCoordinateTransformer4;
                            modifier3 = modifier2;
                            int i9 = i3;
                            final androidx.camera.viewfinder.core.TransformationInfo transformationInfo3 = transformationInfo2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(2052669900, i9, -1, "androidx.camera.viewfinder.compose.Viewfinder (Viewfinder.kt:107)");
                            }
                            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.draw.ClipKt.clipToBounds(modifier3), 0.0f, 1, null);
                            startRestartGroup.startReplaceableGroup(733328855);
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default);
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            startRestartGroup.startMovableGroup(-782850610, viewfinderSurfaceRequest);
                            final int layoutDirection = ((android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).getLayoutDirection();
                            final int width = viewfinderSurfaceRequest.getWidth();
                            final int height = viewfinderSurfaceRequest.getHeight();
                            androidx.camera.viewfinder.core.ImplementationMode implementationMode2 = viewfinderSurfaceRequest.getImplementationMode();
                            changed = startRestartGroup.changed(implementationMode2 != null ? -1 : implementationMode2.ordinal());
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                implementationMode = viewfinderSurfaceRequest.getImplementationMode();
                                if (implementationMode == null) {
                                    implementationMode = androidx.camera.viewfinder.core.ViewfinderDefaults.getImplementationMode();
                                }
                                rememberedValue = implementationMode;
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.camera.viewfinder.core.ImplementationMode implementationMode3 = (androidx.camera.viewfinder.core.ImplementationMode) rememberedValue;
                            changed2 = startRestartGroup.changed(implementationMode3.ordinal());
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(implementationMode3 != androidx.camera.viewfinder.core.ImplementationMode.EMBEDDED), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                            changed3 = startRestartGroup.changed(width);
                            changed4 = startRestartGroup.changed(height);
                            changed5 = startRestartGroup.changed(mutableState);
                            changedInstance = startRestartGroup.changedInstance(transformationInfo3);
                            changed6 = startRestartGroup.changed(layoutDirection);
                            androidx.compose.ui.Modifier modifier5 = modifier3;
                            z = (i9 & 458752) != 131072;
                            z2 = (57344 & i9) != 16384;
                            z3 = (i9 & 7168) != 2048 || ((i9 & 4096) != 0 && startRestartGroup.changedInstance(mutableCoordinateTransformer2));
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!(z | changed3 | changed4 | changed5 | changedInstance | changed6 | z2 | z3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                final androidx.compose.ui.layout.ContentScale contentScale4 = crop;
                                final androidx.compose.ui.Alignment alignment5 = alignment3;
                                final androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer5 = mutableCoordinateTransformer2;
                                rememberedValue3 = new kotlin.jvm.functions.Function3() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                        return androidx.camera.viewfinder.compose.ViewfinderKt.$r8$lambda$6PIWW6GKCEkk9rjwBkjsIrXNDMo(width, height, transformationInfo3, layoutDirection, contentScale4, alignment5, mutableCoordinateTransformer5, mutableState, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.ui.Modifier layout = androidx.compose.ui.layout.LayoutModifierKt.layout(companion, (kotlin.jvm.functions.Function3) rememberedValue3);
                            changedInstance2 = startRestartGroup.changedInstance(viewfinderSurfaceRequest);
                            z4 = (3670016 & i9) != 1048576;
                            changed7 = startRestartGroup.changed(mutableState);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!(changedInstance2 | z4 | changed7) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.camera.viewfinder.compose.ViewfinderKt.m1041$r8$lambda$qFLSBEH4y1ZYbx6KPrXEvJ8Y2I(androidx.camera.viewfinder.core.ViewfinderSurfaceRequest.this, function1, mutableState, (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceScope) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            getHighSpeedVideoFpsRanges(width, height, transformationInfo3, implementationMode3, layout, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, i9 & 896, 0);
                            startRestartGroup.endMovableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            transformationInfo2 = transformationInfo3;
                            mutableCoordinateTransformer3 = mutableCoordinateTransformer2;
                            alignment4 = alignment3;
                            contentScale3 = crop;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    }
                    mutableCoordinateTransformer2 = mutableCoordinateTransformer4;
                    modifier3 = modifier2;
                    crop = contentScale2;
                    alignment3 = alignment2;
                    int i92 = i3;
                    final androidx.camera.viewfinder.core.TransformationInfo transformationInfo32 = transformationInfo2;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.draw.ClipKt.clipToBounds(modifier3), 0.0f, 1, null);
                    startRestartGroup.startReplaceableGroup(733328855);
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default2);
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rememberBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5299constructorimpl.getInserting()) {
                    }
                    m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    startRestartGroup.startMovableGroup(-782850610, viewfinderSurfaceRequest);
                    final int layoutDirection2 = ((android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).getLayoutDirection();
                    final int width2 = viewfinderSurfaceRequest.getWidth();
                    final int height2 = viewfinderSurfaceRequest.getHeight();
                    androidx.camera.viewfinder.core.ImplementationMode implementationMode22 = viewfinderSurfaceRequest.getImplementationMode();
                    changed = startRestartGroup.changed(implementationMode22 != null ? -1 : implementationMode22.ordinal());
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    implementationMode = viewfinderSurfaceRequest.getImplementationMode();
                    if (implementationMode == null) {
                    }
                    rememberedValue = implementationMode;
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.camera.viewfinder.core.ImplementationMode implementationMode32 = (androidx.camera.viewfinder.core.ImplementationMode) rememberedValue;
                    changed2 = startRestartGroup.changed(implementationMode32.ordinal());
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(implementationMode32 != androidx.camera.viewfinder.core.ImplementationMode.EMBEDDED), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    changed3 = startRestartGroup.changed(width2);
                    changed4 = startRestartGroup.changed(height2);
                    changed5 = startRestartGroup.changed(mutableState2);
                    changedInstance = startRestartGroup.changedInstance(transformationInfo32);
                    changed6 = startRestartGroup.changed(layoutDirection2);
                    androidx.compose.ui.Modifier modifier52 = modifier3;
                    if ((i92 & 458752) != 131072) {
                    }
                    if ((57344 & i92) != 16384) {
                    }
                    if ((i92 & 7168) != 2048) {
                    }
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!(z | changed3 | changed4 | changed5 | changedInstance | changed6 | z2 | z3)) {
                    }
                    final androidx.compose.ui.layout.ContentScale contentScale42 = crop;
                    final androidx.compose.ui.Alignment alignment52 = alignment3;
                    final androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer52 = mutableCoordinateTransformer2;
                    rememberedValue3 = new kotlin.jvm.functions.Function3() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return androidx.camera.viewfinder.compose.ViewfinderKt.$r8$lambda$6PIWW6GKCEkk9rjwBkjsIrXNDMo(width2, height2, transformationInfo32, layoutDirection2, contentScale42, alignment52, mutableCoordinateTransformer52, mutableState2, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    androidx.compose.ui.Modifier layout2 = androidx.compose.ui.layout.LayoutModifierKt.layout(companion2, (kotlin.jvm.functions.Function3) rememberedValue3);
                    changedInstance2 = startRestartGroup.changedInstance(viewfinderSurfaceRequest);
                    if ((3670016 & i92) != 1048576) {
                    }
                    changed7 = startRestartGroup.changed(mutableState2);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!(changedInstance2 | z4 | changed7)) {
                    }
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.camera.viewfinder.compose.ViewfinderKt.m1041$r8$lambda$qFLSBEH4y1ZYbx6KPrXEvJ8Y2I(androidx.camera.viewfinder.core.ViewfinderSurfaceRequest.this, function1, mutableState2, (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    getHighSpeedVideoFpsRanges(width2, height2, transformationInfo32, implementationMode32, layout2, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, i92 & 896, 0);
                    startRestartGroup.endMovableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    transformationInfo2 = transformationInfo32;
                    mutableCoordinateTransformer3 = mutableCoordinateTransformer2;
                    alignment4 = alignment3;
                    contentScale3 = crop;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.camera.viewfinder.core.TransformationInfo transformationInfo4 = transformationInfo2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.camera.viewfinder.compose.ViewfinderKt.$r8$lambda$zMIqDRCfZMl_2KnbQUQEjMM9YMg(androidx.camera.viewfinder.core.ViewfinderSurfaceRequest.this, modifier4, transformationInfo4, mutableCoordinateTransformer3, alignment4, contentScale3, function1, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            alignment2 = alignment;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i3 & 599187) != 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            mutableCoordinateTransformer2 = mutableCoordinateTransformer4;
            modifier3 = modifier2;
            crop = contentScale2;
            alignment3 = alignment2;
            int i922 = i3;
            final androidx.camera.viewfinder.core.TransformationInfo transformationInfo322 = transformationInfo2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.ui.Modifier fillMaxSize$default22 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.draw.ClipKt.clipToBounds(modifier3), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default22);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rememberBoxMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5299constructorimpl.getInserting()) {
            }
            m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            startRestartGroup.startMovableGroup(-782850610, viewfinderSurfaceRequest);
            final int layoutDirection22 = ((android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).getLayoutDirection();
            final int width22 = viewfinderSurfaceRequest.getWidth();
            final int height22 = viewfinderSurfaceRequest.getHeight();
            androidx.camera.viewfinder.core.ImplementationMode implementationMode222 = viewfinderSurfaceRequest.getImplementationMode();
            changed = startRestartGroup.changed(implementationMode222 != null ? -1 : implementationMode222.ordinal());
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            implementationMode = viewfinderSurfaceRequest.getImplementationMode();
            if (implementationMode == null) {
            }
            rememberedValue = implementationMode;
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.camera.viewfinder.core.ImplementationMode implementationMode322 = (androidx.camera.viewfinder.core.ImplementationMode) rememberedValue;
            changed2 = startRestartGroup.changed(implementationMode322.ordinal());
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(implementationMode322 != androidx.camera.viewfinder.core.ImplementationMode.EMBEDDED), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            final androidx.compose.runtime.MutableState mutableState22 = (androidx.compose.runtime.MutableState) rememberedValue2;
            androidx.compose.ui.Modifier.Companion companion22 = androidx.compose.ui.Modifier.INSTANCE;
            changed3 = startRestartGroup.changed(width22);
            changed4 = startRestartGroup.changed(height22);
            changed5 = startRestartGroup.changed(mutableState22);
            changedInstance = startRestartGroup.changedInstance(transformationInfo322);
            changed6 = startRestartGroup.changed(layoutDirection22);
            androidx.compose.ui.Modifier modifier522 = modifier3;
            if ((i922 & 458752) != 131072) {
            }
            if ((57344 & i922) != 16384) {
            }
            if ((i922 & 7168) != 2048) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!(z | changed3 | changed4 | changed5 | changedInstance | changed6 | z2 | z3)) {
            }
            final androidx.compose.ui.layout.ContentScale contentScale422 = crop;
            final androidx.compose.ui.Alignment alignment522 = alignment3;
            final androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer522 = mutableCoordinateTransformer2;
            rememberedValue3 = new kotlin.jvm.functions.Function3() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.camera.viewfinder.compose.ViewfinderKt.$r8$lambda$6PIWW6GKCEkk9rjwBkjsIrXNDMo(width22, height22, transformationInfo322, layoutDirection22, contentScale422, alignment522, mutableCoordinateTransformer522, mutableState22, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            androidx.compose.ui.Modifier layout22 = androidx.compose.ui.layout.LayoutModifierKt.layout(companion22, (kotlin.jvm.functions.Function3) rememberedValue3);
            changedInstance2 = startRestartGroup.changedInstance(viewfinderSurfaceRequest);
            if ((3670016 & i922) != 1048576) {
            }
            changed7 = startRestartGroup.changed(mutableState22);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!(changedInstance2 | z4 | changed7)) {
            }
            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.camera.viewfinder.compose.ViewfinderKt.m1041$r8$lambda$qFLSBEH4y1ZYbx6KPrXEvJ8Y2I(androidx.camera.viewfinder.core.ViewfinderSurfaceRequest.this, function1, mutableState22, (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            getHighSpeedVideoFpsRanges(width22, height22, transformationInfo322, implementationMode322, layout22, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, i922 & 896, 0);
            startRestartGroup.endMovableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier522;
            transformationInfo2 = transformationInfo322;
            mutableCoordinateTransformer3 = mutableCoordinateTransformer2;
            alignment4 = alignment3;
            contentScale3 = crop;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i3 & 599187) != 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        mutableCoordinateTransformer2 = mutableCoordinateTransformer4;
        modifier3 = modifier2;
        crop = contentScale2;
        alignment3 = alignment2;
        int i9222 = i3;
        final androidx.camera.viewfinder.core.TransformationInfo transformationInfo3222 = transformationInfo2;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.ui.Modifier fillMaxSize$default222 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.draw.ClipKt.clipToBounds(modifier3), 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default222);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rememberBoxMeasurePolicy222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5299constructorimpl.getInserting()) {
        }
        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        modifierMaterializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        startRestartGroup.startMovableGroup(-782850610, viewfinderSurfaceRequest);
        final int layoutDirection222 = ((android.content.res.Configuration) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration())).getLayoutDirection();
        final int width222 = viewfinderSurfaceRequest.getWidth();
        final int height222 = viewfinderSurfaceRequest.getHeight();
        androidx.camera.viewfinder.core.ImplementationMode implementationMode2222 = viewfinderSurfaceRequest.getImplementationMode();
        changed = startRestartGroup.changed(implementationMode2222 != null ? -1 : implementationMode2222.ordinal());
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        implementationMode = viewfinderSurfaceRequest.getImplementationMode();
        if (implementationMode == null) {
        }
        rememberedValue = implementationMode;
        startRestartGroup.updateRememberedValue(rememberedValue);
        androidx.camera.viewfinder.core.ImplementationMode implementationMode3222 = (androidx.camera.viewfinder.core.ImplementationMode) rememberedValue;
        changed2 = startRestartGroup.changed(implementationMode3222.ordinal());
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(implementationMode3222 != androidx.camera.viewfinder.core.ImplementationMode.EMBEDDED), null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        final androidx.compose.runtime.MutableState mutableState222 = (androidx.compose.runtime.MutableState) rememberedValue2;
        androidx.compose.ui.Modifier.Companion companion222 = androidx.compose.ui.Modifier.INSTANCE;
        changed3 = startRestartGroup.changed(width222);
        changed4 = startRestartGroup.changed(height222);
        changed5 = startRestartGroup.changed(mutableState222);
        changedInstance = startRestartGroup.changedInstance(transformationInfo3222);
        changed6 = startRestartGroup.changed(layoutDirection222);
        androidx.compose.ui.Modifier modifier5222 = modifier3;
        if ((i9222 & 458752) != 131072) {
        }
        if ((57344 & i9222) != 16384) {
        }
        if ((i9222 & 7168) != 2048) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!(z | changed3 | changed4 | changed5 | changedInstance | changed6 | z2 | z3)) {
        }
        final androidx.compose.ui.layout.ContentScale contentScale4222 = crop;
        final androidx.compose.ui.Alignment alignment5222 = alignment3;
        final androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer5222 = mutableCoordinateTransformer2;
        rememberedValue3 = new kotlin.jvm.functions.Function3() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.camera.viewfinder.compose.ViewfinderKt.$r8$lambda$6PIWW6GKCEkk9rjwBkjsIrXNDMo(width222, height222, transformationInfo3222, layoutDirection222, contentScale4222, alignment5222, mutableCoordinateTransformer5222, mutableState222, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        androidx.compose.ui.Modifier layout222 = androidx.compose.ui.layout.LayoutModifierKt.layout(companion222, (kotlin.jvm.functions.Function3) rememberedValue3);
        changedInstance2 = startRestartGroup.changedInstance(viewfinderSurfaceRequest);
        if ((3670016 & i9222) != 1048576) {
        }
        changed7 = startRestartGroup.changed(mutableState222);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!(changedInstance2 | z4 | changed7)) {
        }
        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.viewfinder.compose.ViewfinderKt.m1041$r8$lambda$qFLSBEH4y1ZYbx6KPrXEvJ8Y2I(androidx.camera.viewfinder.core.ViewfinderSurfaceRequest.this, function1, mutableState222, (androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceScope) obj);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        getHighSpeedVideoFpsRanges(width222, height222, transformationInfo3222, implementationMode3222, layout222, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, i9222 & 896, 0);
        startRestartGroup.endMovableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier5222;
        transformationInfo2 = transformationInfo3222;
        mutableCoordinateTransformer3 = mutableCoordinateTransformer2;
        alignment4 = alignment3;
        contentScale3 = crop;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final int i, final int i2, final androidx.camera.viewfinder.core.TransformationInfo transformationInfo, final androidx.camera.viewfinder.core.ImplementationMode implementationMode, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1937073252);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(transformationInfo) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changed(implementationMode.ordinal()) ? 2048 : 1024;
        }
        int i7 = i4 & 16;
        if (i7 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if ((196608 & i3) == 0) {
                i5 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
            }
            if ((74899 & i5) == 74898 || !startRestartGroup.getSkipping()) {
                androidx.compose.ui.Modifier modifier4 = i7 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1937073252, i5, -1, "androidx.camera.viewfinder.compose.TransformedSurface (Viewfinder.kt:211)");
                }
                i6 = androidx.camera.viewfinder.compose.ViewfinderKt.WhenMappings.$EnumSwitchMapping$0[implementationMode.ordinal()];
                if (i6 != 1) {
                    startRestartGroup.startReplaceGroup(-168337169);
                    androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceKt.m1048ViewfinderExternalSurfaceJQLjw8(modifier4, false, 0L, false, function1, startRestartGroup, ((i5 >> 12) & 14) | ((i5 >> 3) & 57344), 14);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (i6 != 2) {
                        startRestartGroup.startReplaceGroup(-1806546617);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-168184029);
                    startRestartGroup.startMovableGroup(-1806539482, startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalConfiguration()));
                    int surfaceRotationToRotationDegrees = androidx.camera.viewfinder.core.impl.Transformations.surfaceRotationToRotationDegrees(((android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView())).getDisplay().getRotation());
                    startRestartGroup.endMovableGroup();
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.ui.graphics.Matrix.m6221boximpl(androidx.compose.ui.graphics.Matrix.m6223constructorimpl$default(null, 1, null));
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    float[] m6246unboximpl = ((androidx.compose.ui.graphics.Matrix) rememberedValue).m6246unboximpl();
                    androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m5865setFromtUYjHk(m6246unboximpl, androidx.camera.viewfinder.core.impl.Transformations.getTextureViewCorrectionMatrix(surfaceRotationToRotationDegrees, i, i2));
                    androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceKt.m1046ViewfinderEmbeddedExternalSurfacesv6N_fY(modifier4, false, 0L, m6246unboximpl, function1, startRestartGroup, ((i5 >> 12) & 14) | ((i5 >> 3) & 57344), 6);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.camera.viewfinder.compose.ViewfinderKt.$r8$lambda$WPquLPgP_fJVfoHroCishtFz3F8(i, i2, transformationInfo, implementationMode, modifier3, function1, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((196608 & i3) == 0) {
        }
        if ((74899 & i5) == 74898) {
        }
        if (i7 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        i6 = androidx.camera.viewfinder.compose.ViewfinderKt.WhenMappings.$EnumSwitchMapping$0[implementationMode.ordinal()];
        if (i6 != 1) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$6PIWW6GKCEkk9rjwBkjsIrXNDMo(final int i, final int i2, final androidx.camera.viewfinder.core.TransformationInfo transformationInfo, final int i3, final androidx.compose.ui.layout.ContentScale contentScale, final androidx.compose.ui.Alignment alignment, final androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer, final androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, final androidx.compose.ui.unit.Constraints constraints) {
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m8564fixedJhjzzOo(i, i2));
        final int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(0, (mo7353measureBRTryo0.getWidth() - androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor())) / 2);
        final int coerceAtLeast2 = kotlin.ranges.RangesKt.coerceAtLeast(0, (mo7353measureBRTryo0.getHeight() - androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor())) / 2);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.viewfinder.compose.ViewfinderKt.$r8$lambda$Z7L4kWC3BmDXxjNjp6iFMVFKhrk(androidx.compose.ui.layout.Placeable.this, coerceAtLeast, coerceAtLeast2, constraints, i, i2, transformationInfo, i3, contentScale, alignment, mutableCoordinateTransformer, mutableState, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WPquLPgP_fJVfoHroCishtFz3F8(int i, int i2, androidx.camera.viewfinder.core.TransformationInfo transformationInfo, androidx.camera.viewfinder.core.ImplementationMode implementationMode, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        getHighSpeedVideoFpsRanges(i, i2, transformationInfo, implementationMode, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z7L4kWC3BmDXxjNjp6iFMVFKhrk(androidx.compose.ui.layout.Placeable placeable, int i, int i2, final androidx.compose.ui.unit.Constraints constraints, final int i3, final int i4, final androidx.camera.viewfinder.core.TransformationInfo transformationInfo, final int i5, final androidx.compose.ui.layout.ContentScale contentScale, final androidx.compose.ui.Alignment alignment, final androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer, final androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        androidx.compose.ui.layout.Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, i, i2, 0.0f, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.viewfinder.compose.ViewfinderKt.$r8$lambda$v1O39dgBOPysecv_6tKsfiTWzqk(androidx.compose.ui.unit.Constraints.this, i3, i4, transformationInfo, i5, contentScale, alignment, mutableCoordinateTransformer, mutableState, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
            }
        }, 4, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qFLSBEH4y1ZYbx6KPrXE-vJ8Y2I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1041$r8$lambda$qFLSBEH4y1ZYbx6KPrXEvJ8Y2I(androidx.camera.viewfinder.core.ViewfinderSurfaceRequest viewfinderSurfaceRequest, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceScope viewfinderExternalSurfaceScope) {
        androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl viewfinderInitScopeImpl = new androidx.camera.viewfinder.compose.ViewfinderInitScopeImpl(viewfinderSurfaceRequest);
        function1.invoke(viewfinderInitScopeImpl);
        viewfinderExternalSurfaceScope.onSurface(new androidx.camera.viewfinder.compose.ViewfinderKt$Viewfinder$1$2$1$1(viewfinderInitScopeImpl, mutableState, null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$v1O39dgBOPysecv_6tKsfiTWzqk(androidx.compose.ui.unit.Constraints constraints, int i, int i2, androidx.camera.viewfinder.core.TransformationInfo transformationInfo, int i3, final androidx.compose.ui.layout.ContentScale contentScale, final androidx.compose.ui.Alignment alignment, androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            return kotlin.Unit.INSTANCE;
        }
        android.graphics.Matrix surfaceToViewfinderMatrix = androidx.camera.viewfinder.core.impl.Transformations.getSurfaceToViewfinderMatrix(new android.util.Size(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor()), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor())), new android.util.Size(i, i2), transformationInfo, i3, new androidx.camera.viewfinder.core.impl.ContentScale() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$toInternalContentScale$1
            @Override // androidx.camera.viewfinder.core.impl.ContentScale
            /* renamed from: computeScaleFactor-ho9e9VQ, reason: not valid java name */
            public final long mo1043computeScaleFactorho9e9VQ(android.util.SizeF srcSize, android.util.SizeF dstSize) {
                long mo7350computeScaleFactorH7hwNQA = androidx.compose.ui.layout.ContentScale.this.mo7350computeScaleFactorH7hwNQA(androidx.compose.ui.geometry.SizeKt.Size(srcSize.getWidth(), srcSize.getHeight()), androidx.compose.ui.geometry.SizeKt.Size(dstSize.getWidth(), dstSize.getHeight()));
                return androidx.camera.viewfinder.core.impl.TransformationsKt.ScaleFactorF(androidx.compose.ui.layout.ScaleFactor.m7458getScaleXimpl(mo7350computeScaleFactorH7hwNQA), androidx.compose.ui.layout.ScaleFactor.m7459getScaleYimpl(mo7350computeScaleFactorH7hwNQA));
            }
        }, new androidx.camera.viewfinder.core.impl.Alignment() { // from class: androidx.camera.viewfinder.compose.ViewfinderKt$toInternalAlignment$1
            @Override // androidx.camera.viewfinder.core.impl.Alignment
            /* renamed from: align-41g9ag8, reason: not valid java name */
            public final long mo1042align41g9ag8(android.util.SizeF size, android.util.SizeF space, int layoutDirection) {
                androidx.compose.ui.unit.LayoutDirection layoutDirection2;
                long IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(java.lang.Math.round(size.getWidth()), java.lang.Math.round(size.getHeight()));
                long IntSize2 = androidx.compose.ui.unit.IntSizeKt.IntSize(java.lang.Math.round(space.getWidth()), java.lang.Math.round(space.getHeight()));
                if (layoutDirection == 0) {
                    layoutDirection2 = androidx.compose.ui.unit.LayoutDirection.Ltr;
                } else if (layoutDirection == 1) {
                    layoutDirection2 = androidx.compose.ui.unit.LayoutDirection.Rtl;
                } else {
                    throw new java.lang.IllegalArgumentException("Invalid layout direction: ".concat(java.lang.String.valueOf(layoutDirection)));
                }
                long mo5504alignKFBX0sM = androidx.compose.ui.Alignment.this.mo5504alignKFBX0sM(IntSize, IntSize2, layoutDirection2);
                return androidx.camera.viewfinder.core.impl.TransformationsKt.OffsetF(androidx.compose.ui.unit.IntOffset.m8729getXimpl(mo5504alignKFBX0sM), androidx.compose.ui.unit.IntOffset.m8730getYimpl(mo5504alignKFBX0sM));
            }
        });
        if (mutableCoordinateTransformer != null) {
            float[] m6223constructorimpl$default = androidx.compose.ui.graphics.Matrix.m6223constructorimpl$default(null, 1, null);
            androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m5865setFromtUYjHk(m6223constructorimpl$default, surfaceToViewfinderMatrix);
            androidx.compose.ui.graphics.Matrix.m6228invertimpl(m6223constructorimpl$default);
            mutableCoordinateTransformer.mo1040setTransformMatrix58bKbWc(m6223constructorimpl$default);
        }
        float f = i;
        float f2 = i2;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f, f2);
        surfaceToViewfinderMatrix.mapRect(rectF);
        graphicsLayerScope.mo6180setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(0.0f, 0.0f));
        graphicsLayerScope.setScaleX(rectF.width() / f);
        graphicsLayerScope.setScaleY(rectF.height() / f2);
        graphicsLayerScope.setTranslationX(rectF.left);
        graphicsLayerScope.setTranslationY(rectF.top);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zMIqDRCfZMl_2KnbQUQEjMM9YMg(androidx.camera.viewfinder.core.ViewfinderSurfaceRequest viewfinderSurfaceRequest, androidx.compose.ui.Modifier modifier, androidx.camera.viewfinder.core.TransformationInfo transformationInfo, androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Viewfinder(viewfinderSurfaceRequest, modifier, transformationInfo, mutableCoordinateTransformer, alignment, contentScale, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.viewfinder.core.ImplementationMode.values().length];
            try {
                iArr[androidx.camera.viewfinder.core.ImplementationMode.EXTERNAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.viewfinder.core.ImplementationMode.EMBEDDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
