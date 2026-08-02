package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0097\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0019\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a\"\u0010\u0010\u001b\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006\u001c"}, d2 = {"DatePickerDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "colors", "Landroidx/compose/material3/DatePickerColors;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DatePickerDialog-GmEhDVc", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DialogButtonsPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "DialogButtonsMainAxisSpacing", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "DialogButtonsCrossAxisSpacing", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DatePickerDialog_androidKt {
    private static final androidx.compose.foundation.layout.PaddingValues getHighResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(6.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f), 3, null);
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f);
    private static final float getHighSpeedVideoSizes = androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f);

    /* JADX WARN: Removed duplicated region for block: B:101:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f5  */
    /* renamed from: DatePickerDialog-GmEhDVc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3175DatePickerDialogGmEhDVc(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.ui.graphics.Shape shape, float f, androidx.compose.material3.DatePickerColors datePickerColors, androidx.compose.ui.window.DialogProperties dialogProperties, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.ui.graphics.Shape shape2;
        int i5;
        float f2;
        androidx.compose.material3.DatePickerColors datePickerColors2;
        int i6;
        final androidx.compose.ui.Modifier modifier2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        androidx.compose.ui.window.DialogProperties dialogProperties2;
        final androidx.compose.ui.graphics.Shape shape3;
        final float f3;
        final androidx.compose.material3.DatePickerColors datePickerColors3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        androidx.compose.ui.graphics.Shape shape4;
        androidx.compose.material3.DatePickerColors datePickerColors4;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        androidx.compose.ui.graphics.Shape shape5;
        androidx.compose.material3.DatePickerColors datePickerColors5;
        float f4;
        int i7;
        int i8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(219718641);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            datePickerColors2 = datePickerColors;
                            if (startRestartGroup.changed(datePickerColors2)) {
                                i7 = 1048576;
                                i3 |= i7;
                            }
                        } else {
                            datePickerColors2 = datePickerColors;
                        }
                        i7 = 524288;
                        i3 |= i7;
                    } else {
                        datePickerColors2 = datePickerColors;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(dialogProperties) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 67108864 : 33554432;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                function24 = i4 != 0 ? null : function22;
                                if ((i2 & 16) != 0) {
                                    shape4 = androidx.compose.material3.DatePickerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    shape4 = shape2;
                                }
                                float m3174getTonalElevationD9Ej5fM = i5 != 0 ? androidx.compose.material3.DatePickerDefaults.INSTANCE.m3174getTonalElevationD9Ej5fM() : f2;
                                if ((i2 & 64) != 0) {
                                    datePickerColors4 = androidx.compose.material3.DatePickerDefaults.INSTANCE.colors(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    datePickerColors4 = datePickerColors2;
                                }
                                if (i6 != 0) {
                                    function25 = function24;
                                    dialogProperties2 = new androidx.compose.ui.window.DialogProperties(false, false, false, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                                    shape5 = shape4;
                                    datePickerColors5 = datePickerColors4;
                                    f4 = m3174getTonalElevationD9Ej5fM;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(219718641, i3, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:74)");
                                    }
                                    final androidx.compose.ui.graphics.Shape shape6 = shape5;
                                    final androidx.compose.material3.DatePickerColors datePickerColors6 = datePickerColors5;
                                    final float f5 = f4;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26 = function25;
                                    androidx.compose.material3.AlertDialogKt.BasicAlertDialog(function0, androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(companion, null, false, 3, null), dialogProperties2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1108953335, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                            androidx.compose.runtime.Composer composer3 = composer2;
                                            int intValue = num.intValue();
                                            if (!composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                                composer3.skipToGroupEnd();
                                            } else {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(1108953335, intValue, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:80)");
                                                }
                                                androidx.compose.ui.Modifier m1728heightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m1737requiredWidth3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.m4608getContainerWidthD9Ej5fM()), 0.0f, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.m4607getContainerHeightD9Ej5fM(), 1, null);
                                                androidx.compose.ui.graphics.Shape shape7 = androidx.compose.ui.graphics.Shape.this;
                                                long containerColor = datePickerColors6.getContainerColor();
                                                float f6 = f5;
                                                final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = function3;
                                                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function27 = function26;
                                                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function28 = function2;
                                                androidx.compose.material3.SurfaceKt.m3828SurfaceT9BRK9s(m1728heightInVpY3zN4$default, shape7, containerColor, 0L, f6, 0.0f, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1782015378, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                                                        androidx.compose.foundation.layout.PaddingValues paddingValues;
                                                        androidx.compose.runtime.Composer composer5 = composer4;
                                                        int intValue2 = num2.intValue();
                                                        if (!composer5.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                                            composer5.skipToGroupEnd();
                                                        } else {
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventStart(1782015378, intValue2, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:88)");
                                                            }
                                                            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
                                                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = function32;
                                                            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function29 = function27;
                                                            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function210 = function28;
                                                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(spaceBetween, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer5, 6);
                                                            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, companion2);
                                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                            if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                                                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                                                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                                            androidx.compose.ui.Modifier weight = columnScopeInstance.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false);
                                                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                                            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, weight);
                                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                            if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor2);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                                                m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                                                m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                            }
                                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                            function33.invoke(columnScopeInstance, composer5, 6);
                                                            composer5.endNode();
                                                            androidx.compose.ui.Modifier align = columnScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getEnd());
                                                            paddingValues = androidx.compose.material3.DatePickerDialog_androidKt.getHighResolutionOutputSizeshNQ4ISI;
                                                            androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(align, paddingValues);
                                                            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                                            int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, padding);
                                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                            if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor3);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                                                m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                                                m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                            }
                                                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                            androidx.compose.material3.internal.ProvideContentColorTextStyleKt.m4302ProvideContentColorTextStyle3JVO9M(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.DialogTokens.INSTANCE.getActionLabelTextColor(), composer5, 6), androidx.compose.material3.TypographyKt.getValue(androidx.compose.material3.tokens.DialogTokens.INSTANCE.getActionLabelTextFont(), composer5, 6), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1103927529, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1
                                                                @Override // kotlin.jvm.functions.Function2
                                                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num3) {
                                                                    float f7;
                                                                    float f8;
                                                                    androidx.compose.runtime.Composer composer7 = composer6;
                                                                    int intValue3 = num3.intValue();
                                                                    if (composer7.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                            androidx.compose.runtime.ComposerKt.traceEventStart(-1103927529, intValue3, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:101)");
                                                                        }
                                                                        f7 = androidx.compose.material3.DatePickerDialog_androidKt.getHighSpeedVideoFpsRangesFor;
                                                                        f8 = androidx.compose.material3.DatePickerDialog_androidKt.getHighSpeedVideoSizes;
                                                                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function211 = function29;
                                                                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function212 = function210;
                                                                        androidx.compose.material3.AlertDialogKt.m2873AlertDialogFlowRowixp7dh8(f7, f8, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1980163584, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1.1
                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer8, java.lang.Integer num4) {
                                                                                androidx.compose.runtime.Composer composer9 = composer8;
                                                                                int intValue4 = num4.intValue();
                                                                                if (!composer9.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                                                                                    composer9.skipToGroupEnd();
                                                                                } else {
                                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-1980163584, intValue4, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:105)");
                                                                                    }
                                                                                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function213 = function211;
                                                                                    if (function213 == null) {
                                                                                        composer9.startReplaceGroup(322524505);
                                                                                    } else {
                                                                                        composer9.startReplaceGroup(-266690648);
                                                                                        function213.invoke(composer9, 0);
                                                                                    }
                                                                                    composer9.endReplaceGroup();
                                                                                    function212.invoke(composer9, 0);
                                                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                                    }
                                                                                }
                                                                                return kotlin.Unit.INSTANCE;
                                                                            }
                                                                        }, composer7, 54), composer7, 438);
                                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                        }
                                                                    } else {
                                                                        composer7.skipToGroupEnd();
                                                                    }
                                                                    return kotlin.Unit.INSTANCE;
                                                                }
                                                            }, composer5, 54), composer5, 384);
                                                            composer5.endNode();
                                                            composer5.endNode();
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                        return kotlin.Unit.INSTANCE;
                                                    }
                                                }, composer3, 54), composer3, 12582918, 104);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                            return kotlin.Unit.INSTANCE;
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072 | ((i3 >> 15) & 896), 0);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = companion;
                                    function23 = function25;
                                    shape3 = shape5;
                                    f3 = f4;
                                    datePickerColors3 = datePickerColors5;
                                } else {
                                    datePickerColors2 = datePickerColors4;
                                    f2 = m3174getTonalElevationD9Ej5fM;
                                    shape2 = shape4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                companion = modifier;
                                function24 = function22;
                            }
                            dialogProperties2 = dialogProperties;
                            function25 = function24;
                            shape5 = shape2;
                            f4 = f2;
                            datePickerColors5 = datePickerColors2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            final androidx.compose.ui.graphics.Shape shape62 = shape5;
                            final androidx.compose.material3.DatePickerColors datePickerColors62 = datePickerColors5;
                            final float f52 = f4;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function262 = function25;
                            androidx.compose.material3.AlertDialogKt.BasicAlertDialog(function0, androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(companion, null, false, 3, null), dialogProperties2, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1108953335, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    androidx.compose.runtime.Composer composer3 = composer2;
                                    int intValue = num.intValue();
                                    if (!composer3.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                                        composer3.skipToGroupEnd();
                                    } else {
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(1108953335, intValue, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:80)");
                                        }
                                        androidx.compose.ui.Modifier m1728heightInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m1728heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m1737requiredWidth3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.m4608getContainerWidthD9Ej5fM()), 0.0f, androidx.compose.material3.tokens.DatePickerModalTokens.INSTANCE.m4607getContainerHeightD9Ej5fM(), 1, null);
                                        androidx.compose.ui.graphics.Shape shape7 = androidx.compose.ui.graphics.Shape.this;
                                        long containerColor = datePickerColors62.getContainerColor();
                                        float f6 = f52;
                                        final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32 = function3;
                                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27 = function262;
                                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28 = function2;
                                        androidx.compose.material3.SurfaceKt.m3828SurfaceT9BRK9s(m1728heightInVpY3zN4$default, shape7, containerColor, 0L, f6, 0.0f, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1782015378, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                                                androidx.compose.foundation.layout.PaddingValues paddingValues;
                                                androidx.compose.runtime.Composer composer5 = composer4;
                                                int intValue2 = num2.intValue();
                                                if (!composer5.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                                    composer5.skipToGroupEnd();
                                                } else {
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(1782015378, intValue2, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous> (DatePickerDialog.android.kt:88)");
                                                    }
                                                    androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
                                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = function32;
                                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29 = function27;
                                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210 = function28;
                                                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(spaceBetween, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer5, 6);
                                                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, companion2);
                                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                    if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                                        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                                        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                                    androidx.compose.ui.Modifier weight = columnScopeInstance.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, false);
                                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                                    int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, weight);
                                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                    if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor2);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                                        m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                                        m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                    function33.invoke(columnScopeInstance, composer5, 6);
                                                    composer5.endNode();
                                                    androidx.compose.ui.Modifier align = columnScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getEnd());
                                                    paddingValues = androidx.compose.material3.DatePickerDialog_androidKt.getHighResolutionOutputSizeshNQ4ISI;
                                                    androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(align, paddingValues);
                                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                                    int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer5, padding);
                                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                                    if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor3);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer5);
                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                                        m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                                        m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                    }
                                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                                    androidx.compose.material3.internal.ProvideContentColorTextStyleKt.m4302ProvideContentColorTextStyle3JVO9M(androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.DialogTokens.INSTANCE.getActionLabelTextColor(), composer5, 6), androidx.compose.material3.TypographyKt.getValue(androidx.compose.material3.tokens.DialogTokens.INSTANCE.getActionLabelTextFont(), composer5, 6), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1103927529, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer6, java.lang.Integer num3) {
                                                            float f7;
                                                            float f8;
                                                            androidx.compose.runtime.Composer composer7 = composer6;
                                                            int intValue3 = num3.intValue();
                                                            if (composer7.shouldExecute((intValue3 & 3) != 2, intValue3 & 1)) {
                                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1103927529, intValue3, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:101)");
                                                                }
                                                                f7 = androidx.compose.material3.DatePickerDialog_androidKt.getHighSpeedVideoFpsRangesFor;
                                                                f8 = androidx.compose.material3.DatePickerDialog_androidKt.getHighSpeedVideoSizes;
                                                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211 = function29;
                                                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212 = function210;
                                                                androidx.compose.material3.AlertDialogKt.m2873AlertDialogFlowRowixp7dh8(f7, f8, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1980163584, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1.1
                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer8, java.lang.Integer num4) {
                                                                        androidx.compose.runtime.Composer composer9 = composer8;
                                                                        int intValue4 = num4.intValue();
                                                                        if (!composer9.shouldExecute((intValue4 & 3) != 2, intValue4 & 1)) {
                                                                            composer9.skipToGroupEnd();
                                                                        } else {
                                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                                androidx.compose.runtime.ComposerKt.traceEventStart(-1980163584, intValue4, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:105)");
                                                                            }
                                                                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function213 = function211;
                                                                            if (function213 == null) {
                                                                                composer9.startReplaceGroup(322524505);
                                                                            } else {
                                                                                composer9.startReplaceGroup(-266690648);
                                                                                function213.invoke(composer9, 0);
                                                                            }
                                                                            composer9.endReplaceGroup();
                                                                            function212.invoke(composer9, 0);
                                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                            }
                                                                        }
                                                                        return kotlin.Unit.INSTANCE;
                                                                    }
                                                                }, composer7, 54), composer7, 438);
                                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                }
                                                            } else {
                                                                composer7.skipToGroupEnd();
                                                            }
                                                            return kotlin.Unit.INSTANCE;
                                                        }
                                                    }, composer5, 54), composer5, 384);
                                                    composer5.endNode();
                                                    composer5.endNode();
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                }
                                                return kotlin.Unit.INSTANCE;
                                            }
                                        }, composer3, 54), composer3, 12582918, 104);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072 | ((i3 >> 15) & 896), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = companion;
                            function23 = function25;
                            shape3 = shape5;
                            f3 = f4;
                            datePickerColors3 = datePickerColors5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            function23 = function22;
                            dialogProperties2 = dialogProperties;
                            shape3 = shape2;
                            f3 = f2;
                            datePickerColors3 = datePickerColors2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.window.DialogProperties dialogProperties3 = dialogProperties2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.DatePickerDialog_androidKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return androidx.compose.material3.DatePickerDialog_androidKt.$r8$lambda$0cEIfifCaNTM4zNr33W7X6JHi1U(kotlin.jvm.functions.Function0.this, function2, modifier2, function23, shape3, f3, datePickerColors3, dialogProperties3, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f2 = f;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0cEIfifCaNTM4zNr33W7X6JHi1U(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function22, androidx.compose.ui.graphics.Shape shape, float f, androidx.compose.material3.DatePickerColors datePickerColors, androidx.compose.ui.window.DialogProperties dialogProperties, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m3175DatePickerDialogGmEhDVc(function0, function2, modifier, function22, shape, f, datePickerColors, dialogProperties, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
