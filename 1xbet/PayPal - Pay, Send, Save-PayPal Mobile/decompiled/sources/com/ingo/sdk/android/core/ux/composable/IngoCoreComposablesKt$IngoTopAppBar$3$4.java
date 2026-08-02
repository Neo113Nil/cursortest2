package com.ingo.sdk.android.core.ux.composable;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
final class IngoCoreComposablesKt$IngoTopAppBar$3$4 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.List<kotlin.Triple<java.lang.String, java.lang.Integer, kotlin.jvm.functions.Function0<kotlin.Unit>>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ int getHighSpeedVideoSizesFor;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        boolean booleanValue;
        androidx.compose.runtime.Composer composer2 = composer;
        if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
            com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoIcon(androidx.compose.ui.res.PainterResources_androidKt.painterResource(this.getHighSpeedVideoFpsRanges, composer2, 0), this.getHighSpeedVideoSizes, 0, this.getHighSpeedVideoSizesFor, null, false, null, composer2, 8, 116);
            if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRangesFor.getValue()).booleanValue();
                composer2.startReplaceGroup(5004770);
                final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getHighSpeedVideoFpsRangesFor;
                java.lang.Object rememberedValue = composer2.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$IngoTopAppBar$3$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$IngoTopAppBar$3$4.getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                composer2.endReplaceGroup();
                float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
                float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
                androidx.compose.material3.AndroidMenu_androidKt.m2885DropdownMenuIlH_yew(booleanValue, function0, null, androidx.compose.ui.unit.DpOffset.m8657constructorimpl((java.lang.Float.floatToRawIntBits(m8601constructorimpl) << 32) | (java.lang.Float.floatToRawIntBits(m8601constructorimpl2) & 4294967295L)), null, null, null, 0L, 0.0f, 0.0f, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-257254801, true, new com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$IngoTopAppBar$3$4.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor), composer2, 54), composer2, 3120, 48, 2036);
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$IngoTopAppBar$3$4$2, reason: invalid class name */
    static final class AnonymousClass2 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
        final /* synthetic */ java.util.List<kotlin.Triple<java.lang.String, java.lang.Integer, kotlin.jvm.functions.Function0<kotlin.Unit>>> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(columnScope, "");
            if ((intValue & 81) != 16 || !composer2.getSkipping()) {
                composer2.startReplaceGroup(1886240410);
                if (!kotlin.text.StringsKt.isBlank(this.getHighSpeedVideoSizes)) {
                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)), this.getHighSpeedVideoSizes, com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getBodySmall(), 0, null, 0, 0L, 0, composer2, 6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                }
                composer2.endReplaceGroup();
                java.util.List<kotlin.Triple<java.lang.String, java.lang.Integer, kotlin.jvm.functions.Function0<kotlin.Unit>>> list = this.getHighResolutionOutputSizeshNQ4ISI;
                final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getHighSpeedVideoFpsRanges;
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    final kotlin.Triple triple = (kotlin.Triple) it.next();
                    composer2.startReplaceGroup(-1633490746);
                    boolean changed = composer2.changed(triple);
                    java.lang.Object rememberedValue = composer2.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$IngoTopAppBar$3$4$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$IngoTopAppBar$3$4.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI(kotlin.Triple.this, mutableState);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    composer2.endReplaceGroup();
                    androidx.compose.material3.AndroidMenu_androidKt.DropdownMenuItem(androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1158935678, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt$IngoTopAppBar$3$4$2$1$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                            androidx.compose.runtime.Composer composer4 = composer3;
                            if ((num2.intValue() & 11) != 2 || !composer4.getSkipping()) {
                                kotlin.Triple<java.lang.String, java.lang.Integer, kotlin.jvm.functions.Function0<kotlin.Unit>> triple2 = triple;
                                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer4, 0);
                                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer4, companion);
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer4);
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                    m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                    m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, triple2.getFirst(), null, 0, null, 0, 0L, 0, composer4, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                                java.lang.Integer second = triple2.getSecond();
                                composer4.startReplaceGroup(-67656460);
                                if (second != null) {
                                    int intValue2 = second.intValue();
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1747widthInVpY3zN4$default(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 0.0f, 2, null), composer4, 0);
                                    androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(intValue2, composer4, 0), "", androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f)), (androidx.compose.ui.Alignment) null, (androidx.compose.ui.layout.ContentScale) null, 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, composer4, 440, 120);
                                }
                                composer4.endReplaceGroup();
                                composer4.endNode();
                            } else {
                                composer4.skipToGroupEnd();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }, composer2, 54), com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.rememberDebouncedCallback(0L, (kotlin.jvm.functions.Function0) rememberedValue, composer2, 0, 1), null, null, null, false, null, null, null, composer2, 6, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT);
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.Triple triple, androidx.compose.runtime.MutableState mutableState) {
            mutableState.setValue(java.lang.Boolean.valueOf(false));
            ((kotlin.jvm.functions.Function0) triple.getThird()).invoke();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(java.lang.String str, java.util.List<? extends kotlin.Triple<java.lang.String, java.lang.Integer, ? extends kotlin.jvm.functions.Function0<kotlin.Unit>>> list, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
            this.getHighSpeedVideoSizes = str;
            this.getHighResolutionOutputSizeshNQ4ISI = list;
            this.getHighSpeedVideoFpsRanges = mutableState;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(false));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    IngoCoreComposablesKt$IngoTopAppBar$3$4(int i, java.lang.String str, int i2, java.util.List<? extends kotlin.Triple<java.lang.String, java.lang.Integer, ? extends kotlin.jvm.functions.Function0<kotlin.Unit>>> list, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, java.lang.String str2) {
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoSizesFor = i2;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.Camera2StreamConfigurationMap = str2;
    }
}
