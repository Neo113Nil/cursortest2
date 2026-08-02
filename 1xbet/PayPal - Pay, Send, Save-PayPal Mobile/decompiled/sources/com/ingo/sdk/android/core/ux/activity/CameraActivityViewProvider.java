package com.ingo.sdk.android.core.ux.activity;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/ingo/sdk/android/core/ux/activity/CameraActivityViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "<init>", "()V", "Landroidx/camera/view/PreviewView;", "previewView", "Lkotlin/Function0;", "", "takePhotoClicked", "navigationClicked", "", "tintEnabled", "Landroidx/compose/runtime/MutableState;", "", "cameraError", "View", "(Landroidx/camera/view/PreviewView;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CameraActivityViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = 0;

    public CameraActivityViewProvider() {
        super(null, null, null, 7, null);
    }

    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean, int] */
    public final void View(final androidx.camera.view.PreviewView previewView, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final boolean z, final androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.Composer composer, final int i) {
        ?? r5;
        java.lang.String primaryInverseTextColor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(previewView, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1211805283);
        java.lang.String value = mutableState.getValue();
        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-608729241);
        if (value != null) {
            fillMaxSize$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(fillMaxSize$default, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme(startRestartGroup, (i >> 15) & 14).getBackgroundColor())), null, 2, null);
        }
        startRestartGroup.endReplaceGroup();
        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
            m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1447254447);
        if (value == null) {
            r5 = 1;
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.core.ux.activity.CameraActivityViewProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.ingo.sdk.android.core.ux.activity.CameraActivityViewProvider.$r8$lambda$fJV85TbbU3_SVOLptHPpAnEVRww(androidx.camera.view.PreviewView.this, (android.content.Context) obj);
                }
            }, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, startRestartGroup, 48, 4);
        } else {
            r5 = 1;
        }
        startRestartGroup.endReplaceGroup();
        androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, r5, null);
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
        int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
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
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
            m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
            m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
        if (obj != null) {
            if (com.ingo.sdk.android.core.ux.theme.ThemeKt.isNightMode((androidx.appcompat.app.AppCompatDelegate) obj, startRestartGroup, 8)) {
                startRestartGroup.startReplaceGroup(-262727987);
                primaryInverseTextColor = currentTheme(startRestartGroup, (i >> 15) & 14).getPrimaryColor();
            } else {
                startRestartGroup.startReplaceGroup(-262726163);
                primaryInverseTextColor = currentTheme(startRestartGroup, (i >> 15) & 14).getPrimaryInverseTextColor();
            }
            final int parseColor = android.graphics.Color.parseColor(primaryInverseTextColor);
            startRestartGroup.endReplaceGroup();
            int i2 = i >> 3;
            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10642IngoTopAppBarUyZgGCQ(null, function02, 0, null, 0L, false, null, false, false, parseColor, 0, null, 0, null, null, startRestartGroup, (i2 & 112) | 100859904, 0, 31965);
            if (value != null) {
                startRestartGroup.startReplaceGroup(445739369);
                androidx.compose.ui.Modifier fillMaxSize$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, r5, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                    m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                    m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), value, null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, 0, 0L, 0, startRestartGroup, 6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.core.ux.R.string.ingo_dismiss, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(5004770);
                boolean z2 = ((((i & 896) ^ 384) <= 256 || !startRestartGroup.changed(function02)) && (i & 384) != 256) ? false : r5;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.core.ux.activity.CameraActivityViewProvider$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.ingo.sdk.android.core.ux.activity.CameraActivityViewProvider.m10602$r8$lambda$L3HMqlmewxAiFmc5K_V8DPulRI(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoButton(stringResource, (kotlin.jvm.functions.Function0) rememberedValue, false, null, false, false, 0, startRestartGroup, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(446498249);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
                androidx.compose.material3.IconButtonKt.IconButton(function0, androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f), 7, null)), false, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-559454656, r5, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.core.ux.activity.CameraActivityViewProvider$View$1$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        android.graphics.Bitmap bitmap$default;
                        androidx.compose.runtime.Composer composer3 = composer2;
                        if ((num.intValue() & 11) != 2 || !composer3.getSkipping()) {
                            android.graphics.drawable.Drawable drawable = androidx.appcompat.content.res.AppCompatResources.getDrawable((android.content.Context) composer3.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), com.ingo.sdk.android.core.ux.R.drawable.ic_circle);
                            if (z && drawable != null) {
                                drawable.setTint(parseColor);
                            }
                            int roundToInt = kotlin.math.MathKt.roundToInt((float) java.lang.Math.rint(android.util.TypedValue.applyDimension(1, androidx.compose.ui.unit.Dp.m8601constructorimpl(100.0f), ((android.content.Context) composer3.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getDisplayMetrics())));
                            androidx.compose.ui.graphics.ImageBitmap asImageBitmap = (drawable == null || (bitmap$default = androidx.core.graphics.drawable.DrawableKt.toBitmap$default(drawable, roundToInt, roundToInt, null, 4, null)) == null) ? null : androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(bitmap$default);
                            if (asImageBitmap != null) {
                                androidx.compose.foundation.ImageKt.m1335Image5hnEew(asImageBitmap, "Camera Shutter", androidx.compose.foundation.BorderKt.m1297borderxT4_qwU(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f)), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f), androidx.compose.ui.graphics.ColorKt.Color(parseColor), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), null, null, 0.0f, null, 0, composer3, 56, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, startRestartGroup, 54), startRestartGroup, (i2 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.core.ux.activity.CameraActivityViewProvider$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.ingo.sdk.android.core.ux.activity.CameraActivityViewProvider.$r8$lambda$jVywOLvdnOPj3m_iv7PX7WoiNTg(com.ingo.sdk.android.core.ux.activity.CameraActivityViewProvider.this, previewView, function0, function02, z, mutableState, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
    }

    /* renamed from: $r8$lambda$L3H-MqlmewxAiFmc5K_V8DPulRI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10602$r8$lambda$L3HMqlmewxAiFmc5K_V8DPulRI(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.camera.view.PreviewView $r8$lambda$fJV85TbbU3_SVOLptHPpAnEVRww(androidx.camera.view.PreviewView previewView, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return previewView;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jVywOLvdnOPj3m_iv7PX7WoiNTg(com.ingo.sdk.android.core.ux.activity.CameraActivityViewProvider cameraActivityViewProvider, androidx.camera.view.PreviewView previewView, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z, androidx.compose.runtime.MutableState mutableState, int i, androidx.compose.runtime.Composer composer, int i2) {
        cameraActivityViewProvider.View(previewView, function0, function02, z, mutableState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
