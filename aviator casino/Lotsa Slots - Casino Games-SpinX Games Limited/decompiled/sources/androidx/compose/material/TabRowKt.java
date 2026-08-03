package androidx.compose.material;

/* compiled from: TabRow.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a¬\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000123\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a¢\u0001\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r23\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "divider", "Lkotlin/Function0;", "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = androidx.compose.ui.unit.Dp.m4478constructorimpl(90);
    private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> ScrollableTabRowScrollSpec = androidx.compose.animation.core.AnimationSpecKt.tween$default(androidx.recyclerview.widget.ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0080  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1547TabRowpAZo6Ak(final int i, androidx.compose.ui.Modifier modifier, long j, long j2, kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> tabs, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        int i6;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        androidx.compose.ui.Modifier.Companion companion;
        long j5;
        long j6;
        final androidx.compose.runtime.internal.ComposableLambda composableLambda;
        final int i7;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m1346getLambda1$material_release;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        final androidx.compose.ui.Modifier modifier2;
        final long j7;
        final long j8;
        final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        int i8;
        int i9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabs, "tabs");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-249175289);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)131@6500L6,132@6549L32,145@7022L1504:TabRow.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = 256;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = 128;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                function32 = function3;
                i4 |= startRestartGroup.changed(function32) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i2) == 0) {
                    function22 = function2;
                    i4 |= startRestartGroup.changed(function22) ? 131072 : 65536;
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((3670016 & i2) == 0) {
                        i4 |= startRestartGroup.changed(tabs) ? 1048576 : 524288;
                    }
                    if ((2995931 & i4) == 599186 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i10 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i3 & 4) == 0) {
                                j5 = androidx.compose.material.ColorsKt.getPrimarySurface(androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                i4 &= -897;
                            } else {
                                j5 = j3;
                            }
                            if ((i3 & 8) == 0) {
                                j6 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            } else {
                                j6 = j4;
                            }
                            composableLambda = i5 == 0 ? androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -553782708, true, new kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.material.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.util.List<? extends androidx.compose.material.TabPosition> list, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke((java.util.List<androidx.compose.material.TabPosition>) list, composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(java.util.List<androidx.compose.material.TabPosition> tabPositions, androidx.compose.runtime.Composer composer2, int i11) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C135@6733L100:TabRow.kt#jmzs0o");
                                    androidx.compose.material.TabRowDefaults.INSTANCE.m1540Indicator9IZ8Weo(androidx.compose.material.TabRowDefaults.INSTANCE.tabIndicatorOffset(androidx.compose.ui.Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                }
                            }) : function32;
                            if (i6 == 0) {
                                i7 = i4;
                                m1346getLambda1$material_release = androidx.compose.material.ComposableSingletons$TabRowKt.INSTANCE.m1346getLambda1$material_release();
                                startRestartGroup.endDefaults();
                                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(companion), null, j5, j6, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                        invoke(composer2, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.runtime.Composer composer2, int i11) {
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C150@7205L1315,150@7163L1357:TabRow.kt#jmzs0o");
                                        if ((i11 & 11) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = tabs;
                                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = m1346getLambda1$material_release;
                                        final kotlin.jvm.functions.Function3<java.util.List<androidx.compose.material.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function34 = composableLambda;
                                        final int i12 = i7;
                                        composer2.startReplaceableGroup(1618982084);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                        boolean changed = composer2.changed(function24) | composer2.changed(function25) | composer2.changed(function34);
                                        java.lang.Object rememberedValue = composer2.rememberedValue();
                                        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                                                    return m1549invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                }

                                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                public final androidx.compose.ui.layout.MeasureResult m1549invoke0kLqBqw(final androidx.compose.ui.layout.SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                                    java.lang.Object next;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                                    final int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j9);
                                                    java.util.List<androidx.compose.ui.layout.Measurable> subcompose = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Tabs, function24);
                                                    int size = subcompose.size();
                                                    final int i13 = m4424getMaxWidthimpl / size;
                                                    java.util.List<androidx.compose.ui.layout.Measurable> list = subcompose;
                                                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                                    java.util.Iterator<T> it = list.iterator();
                                                    while (it.hasNext()) {
                                                        arrayList.add(((androidx.compose.ui.layout.Measurable) it.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j9, i13, i13, 0, 0, 12, null)));
                                                    }
                                                    final java.util.ArrayList arrayList2 = arrayList;
                                                    java.util.Iterator it2 = arrayList2.iterator();
                                                    if (it2.hasNext()) {
                                                        next = it2.next();
                                                        if (it2.hasNext()) {
                                                            int height = ((androidx.compose.ui.layout.Placeable) next).getHeight();
                                                            do {
                                                                java.lang.Object next2 = it2.next();
                                                                int height2 = ((androidx.compose.ui.layout.Placeable) next2).getHeight();
                                                                if (height < height2) {
                                                                    next = next2;
                                                                    height = height2;
                                                                }
                                                            } while (it2.hasNext());
                                                        }
                                                    } else {
                                                        next = null;
                                                    }
                                                    androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) next;
                                                    int height3 = placeable != null ? placeable.getHeight() : 0;
                                                    java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
                                                    for (int i14 = 0; i14 < size; i14++) {
                                                        arrayList3.add(new androidx.compose.material.TabPosition(androidx.compose.ui.unit.Dp.m4478constructorimpl(SubcomposeLayout.mo312toDpu2uoSUM(i13) * i14), SubcomposeLayout.mo312toDpu2uoSUM(i13), null));
                                                    }
                                                    final java.util.ArrayList arrayList4 = arrayList3;
                                                    final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function26 = function25;
                                                    final kotlin.jvm.functions.Function3<java.util.List<androidx.compose.material.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function34;
                                                    final int i15 = i12;
                                                    final int i16 = height3;
                                                    return androidx.compose.ui.layout.MeasureScope.CC.layout$default(SubcomposeLayout, m4424getMaxWidthimpl, height3, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                            invoke2(placementScope);
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                            java.util.List<androidx.compose.ui.layout.Placeable> list2 = arrayList2;
                                                            int i17 = i13;
                                                            int i18 = 0;
                                                            for (java.lang.Object obj : list2) {
                                                                int i19 = i18 + 1;
                                                                if (i18 < 0) {
                                                                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                                                                }
                                                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, (androidx.compose.ui.layout.Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                                                i18 = i19;
                                                            }
                                                            java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Divider, function26);
                                                            long j10 = j9;
                                                            int i20 = i16;
                                                            java.util.Iterator<T> it3 = subcompose2.iterator();
                                                            while (it3.hasNext()) {
                                                                androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) it3.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                                                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo0, 0, i20 - mo3402measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                                i20 = i20;
                                                                j10 = j10;
                                                            }
                                                            androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                            androidx.compose.material.TabSlots tabSlots = androidx.compose.material.TabSlots.Indicator;
                                                            final kotlin.jvm.functions.Function3<java.util.List<androidx.compose.material.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function36 = function35;
                                                            final java.util.List<androidx.compose.material.TabPosition> list3 = arrayList4;
                                                            final int i21 = i15;
                                                            java.util.List<androidx.compose.ui.layout.Measurable> subcompose3 = subcomposeMeasureScope.subcompose(tabSlots, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                                                    invoke(composer3, num.intValue());
                                                                    return kotlin.Unit.INSTANCE;
                                                                }

                                                                public final void invoke(androidx.compose.runtime.Composer composer3, int i22) {
                                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C176@8330L23:TabRow.kt#jmzs0o");
                                                                    if ((i22 & 11) == 2 && composer3.getSkipping()) {
                                                                        composer3.skipToGroupEnd();
                                                                    } else {
                                                                        function36.invoke(list3, composer3, java.lang.Integer.valueOf(((i21 >> 9) & 112) | 8));
                                                                    }
                                                                }
                                                            }));
                                                            int i22 = m4424getMaxWidthimpl;
                                                            int i23 = i16;
                                                            java.util.Iterator<T> it4 = subcompose3.iterator();
                                                            while (it4.hasNext()) {
                                                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, ((androidx.compose.ui.layout.Measurable) it4.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                            }
                                                        }
                                                    }, 4, null);
                                                }
                                            };
                                            composer2.updateRememberedValue(rememberedValue);
                                        }
                                        composer2.endReplaceableGroup();
                                        androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (kotlin.jvm.functions.Function2) rememberedValue, composer2, 6, 0);
                                    }
                                }), startRestartGroup, (i7 & 896) | 1572864 | (i7 & 7168), 50);
                                kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34 = composableLambda;
                                function23 = m1346getLambda1$material_release;
                                modifier2 = companion;
                                j7 = j5;
                                j8 = j6;
                                function33 = function34;
                            } else {
                                i7 = i4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            companion = modifier;
                            i7 = i4;
                            j5 = j3;
                            j6 = j4;
                            composableLambda = function32;
                        }
                        m1346getLambda1$material_release = function22;
                        startRestartGroup.endDefaults();
                        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(companion), null, j5, j6, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1961746365, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke(composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i11) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C150@7205L1315,150@7163L1357:TabRow.kt#jmzs0o");
                                if ((i11 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = tabs;
                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25 = m1346getLambda1$material_release;
                                final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function342 = composableLambda;
                                final int i12 = i7;
                                composer2.startReplaceableGroup(1618982084);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                boolean changed = composer2.changed(function24) | composer2.changed(function25) | composer2.changed(function342);
                                java.lang.Object rememberedValue = composer2.rememberedValue();
                                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                                            return m1549invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                        }

                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final androidx.compose.ui.layout.MeasureResult m1549invoke0kLqBqw(final androidx.compose.ui.layout.SubcomposeMeasureScope SubcomposeLayout, final long j9) {
                                            java.lang.Object next;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                            final int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j9);
                                            java.util.List<androidx.compose.ui.layout.Measurable> subcompose = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Tabs, function24);
                                            int size = subcompose.size();
                                            final int i13 = m4424getMaxWidthimpl / size;
                                            java.util.List<androidx.compose.ui.layout.Measurable> list = subcompose;
                                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                            java.util.Iterator<T> it = list.iterator();
                                            while (it.hasNext()) {
                                                arrayList.add(((androidx.compose.ui.layout.Measurable) it.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j9, i13, i13, 0, 0, 12, null)));
                                            }
                                            final java.util.List<? extends androidx.compose.ui.layout.Placeable> arrayList2 = arrayList;
                                            java.util.Iterator it2 = arrayList2.iterator();
                                            if (it2.hasNext()) {
                                                next = it2.next();
                                                if (it2.hasNext()) {
                                                    int height = ((androidx.compose.ui.layout.Placeable) next).getHeight();
                                                    do {
                                                        java.lang.Object next2 = it2.next();
                                                        int height2 = ((androidx.compose.ui.layout.Placeable) next2).getHeight();
                                                        if (height < height2) {
                                                            next = next2;
                                                            height = height2;
                                                        }
                                                    } while (it2.hasNext());
                                                }
                                            } else {
                                                next = null;
                                            }
                                            androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) next;
                                            int height3 = placeable != null ? placeable.getHeight() : 0;
                                            java.util.ArrayList arrayList3 = new java.util.ArrayList(size);
                                            for (int i14 = 0; i14 < size; i14++) {
                                                arrayList3.add(new androidx.compose.material.TabPosition(androidx.compose.ui.unit.Dp.m4478constructorimpl(SubcomposeLayout.mo312toDpu2uoSUM(i13) * i14), SubcomposeLayout.mo312toDpu2uoSUM(i13), null));
                                            }
                                            final java.util.List<androidx.compose.material.TabPosition> arrayList4 = arrayList3;
                                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26 = function25;
                                            final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35 = function342;
                                            final int i15 = i12;
                                            final int i16 = height3;
                                            return androidx.compose.ui.layout.MeasureScope.CC.layout$default(SubcomposeLayout, m4424getMaxWidthimpl, height3, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                    invoke2(placementScope);
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                    java.util.List<androidx.compose.ui.layout.Placeable> list2 = arrayList2;
                                                    int i17 = i13;
                                                    int i18 = 0;
                                                    for (java.lang.Object obj : list2) {
                                                        int i19 = i18 + 1;
                                                        if (i18 < 0) {
                                                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                                                        }
                                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, (androidx.compose.ui.layout.Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                                        i18 = i19;
                                                    }
                                                    java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Divider, function26);
                                                    long j10 = j9;
                                                    int i20 = i16;
                                                    java.util.Iterator<T> it3 = subcompose2.iterator();
                                                    while (it3.hasNext()) {
                                                        androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) it3.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j10, 0, 0, 0, 0, 11, null));
                                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo0, 0, i20 - mo3402measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                        i20 = i20;
                                                        j10 = j10;
                                                    }
                                                    androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                    androidx.compose.material.TabSlots tabSlots = androidx.compose.material.TabSlots.Indicator;
                                                    final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function35;
                                                    final java.util.List<androidx.compose.material.TabPosition> list3 = arrayList4;
                                                    final int i21 = i15;
                                                    java.util.List<androidx.compose.ui.layout.Measurable> subcompose3 = subcomposeMeasureScope.subcompose(tabSlots, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1341594997, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                                            invoke(composer3, num.intValue());
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        public final void invoke(androidx.compose.runtime.Composer composer3, int i22) {
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C176@8330L23:TabRow.kt#jmzs0o");
                                                            if ((i22 & 11) == 2 && composer3.getSkipping()) {
                                                                composer3.skipToGroupEnd();
                                                            } else {
                                                                function36.invoke(list3, composer3, java.lang.Integer.valueOf(((i21 >> 9) & 112) | 8));
                                                            }
                                                        }
                                                    }));
                                                    int i22 = m4424getMaxWidthimpl;
                                                    int i23 = i16;
                                                    java.util.Iterator<T> it4 = subcompose3.iterator();
                                                    while (it4.hasNext()) {
                                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, ((androidx.compose.ui.layout.Measurable) it4.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(fillMaxWidth$default, (kotlin.jvm.functions.Function2) rememberedValue, composer2, 6, 0);
                            }
                        }), startRestartGroup, (i7 & 896) | 1572864 | (i7 & 7168), 50);
                        kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function342 = composableLambda;
                        function23 = m1346getLambda1$material_release;
                        modifier2 = companion;
                        j7 = j5;
                        j8 = j6;
                        function33 = function342;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        j7 = j3;
                        j8 = j4;
                        function33 = function32;
                        function23 = function22;
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            invoke(composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i11) {
                            androidx.compose.material.TabRowKt.m1547TabRowpAZo6Ak(i, modifier2, j7, j8, function33, function23, tabs, composer2, i2 | 1, i3);
                        }
                    });
                    return;
                }
                function22 = function2;
                if ((i3 & 64) == 0) {
                }
                if ((2995931 & i4) == 599186) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if ((i3 & 4) == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function22 = function2;
            if ((i3 & 64) == 0) {
            }
            if ((2995931 & i4) == 599186) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if ((i3 & 4) == 0) {
            }
            if ((i3 & 8) == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
        }
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function22 = function2;
        if ((i3 & 64) == 0) {
        }
        if ((2995931 & i4) == 599186) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00aa  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1546ScrollableTabRowsKfQg0A(final int i, androidx.compose.ui.Modifier modifier, long j, long j2, float f, kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> tabs, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        int i5;
        float f2;
        int i6;
        kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32;
        int i7;
        androidx.compose.ui.Modifier.Companion companion;
        long j4;
        float m1543getScrollableTabRowPaddingD9Ej5fM;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        int i8;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> m1347getLambda2$material_release;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        final androidx.compose.ui.Modifier modifier2;
        final float f3;
        final long j5;
        final long j6;
        final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabs, "tabs");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1473476840);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)225@11134L6,226@11183L32,240@11718L3006:TabRow.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 896) == 0) {
                if ((i3 & 4) == 0 && startRestartGroup.changed(j)) {
                    i11 = 256;
                    i4 |= i11;
                }
                i11 = 128;
                i4 |= i11;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    if (startRestartGroup.changed(j3)) {
                        i10 = 2048;
                        i4 |= i10;
                    }
                } else {
                    j3 = j2;
                }
                i10 = 1024;
                i4 |= i10;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((57344 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i2) == 0) {
                    function32 = function3;
                    i4 |= startRestartGroup.changed(function32) ? 131072 : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 3670016) == 0) {
                        i4 |= startRestartGroup.changed(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        i9 = (29360128 & i2) == 0 ? startRestartGroup.changed(tabs) ? 8388608 : 4194304 : 12582912;
                        if ((23967451 & i4) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    j4 = androidx.compose.material.ColorsKt.getPrimarySurface(androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, 6));
                                } else {
                                    j4 = j;
                                }
                                if ((i3 & 8) != 0) {
                                    j3 = androidx.compose.material.ColorsKt.m1333contentColorForek8zF_U(j4, startRestartGroup, (i4 >> 6) & 14);
                                    i4 &= -7169;
                                }
                                m1543getScrollableTabRowPaddingD9Ej5fM = i5 != 0 ? androidx.compose.material.TabRowDefaults.INSTANCE.m1543getScrollableTabRowPaddingD9Ej5fM() : f2;
                                composableLambda = i6 != 0 ? androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -655609869, true, new kotlin.jvm.functions.Function3<java.util.List<? extends androidx.compose.material.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.util.List<? extends androidx.compose.material.TabPosition> list, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                        invoke((java.util.List<androidx.compose.material.TabPosition>) list, composer2, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(java.util.List<androidx.compose.material.TabPosition> tabPositions, androidx.compose.runtime.Composer composer2, int i13) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C230@11429L100:TabRow.kt#jmzs0o");
                                        androidx.compose.material.TabRowDefaults.INSTANCE.m1540Indicator9IZ8Weo(androidx.compose.material.TabRowDefaults.INSTANCE.tabIndicatorOffset(androidx.compose.ui.Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                    }
                                }) : function32;
                                if (i7 != 0) {
                                    i8 = i4;
                                    m1347getLambda2$material_release = androidx.compose.material.ComposableSingletons$TabRowKt.INSTANCE.m1347getLambda2$material_release();
                                    startRestartGroup.endDefaults();
                                    final float f4 = m1543getScrollableTabRowPaddingD9Ej5fM;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23 = m1347getLambda2$material_release;
                                    final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34 = composableLambda;
                                    final int i13 = i8;
                                    androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(companion, null, j4, j3, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                            invoke(composer2, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.runtime.Composer composer2, int i14) {
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C245@11859L21,246@11910L24,247@11967L185,253@12161L2557:TabRow.kt#jmzs0o");
                                            if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                                                androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1);
                                                composer2.startReplaceableGroup(773894976);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                                composer2.startReplaceableGroup(-492369756);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                                                java.lang.Object rememberedValue = composer2.rememberedValue();
                                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    java.lang.Object compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer2));
                                                    composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                                                }
                                                composer2.endReplaceableGroup();
                                                kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                                composer2.endReplaceableGroup();
                                                composer2.startReplaceableGroup(511388516);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
                                                boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                                                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                                                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue2 = new androidx.compose.material.ScrollableTabData(rememberScrollState, coroutineScope);
                                                    composer2.updateRememberedValue(rememberedValue2);
                                                }
                                                composer2.endReplaceableGroup();
                                                final androidx.compose.material.ScrollableTabData scrollableTabData = (androidx.compose.material.ScrollableTabData) rememberedValue2;
                                                androidx.compose.ui.Modifier clipToBounds = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.ScrollKt.horizontalScroll$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                                                final float f5 = f4;
                                                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function24 = tabs;
                                                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function25 = function23;
                                                final int i15 = i;
                                                final kotlin.jvm.functions.Function3<java.util.List<androidx.compose.material.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function35 = function34;
                                                final int i16 = i13;
                                                androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                                                        return m1548invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                    }

                                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                    public final androidx.compose.ui.layout.MeasureResult m1548invoke0kLqBqw(final androidx.compose.ui.layout.SubcomposeMeasureScope SubcomposeLayout, final long j7) {
                                                        float f6;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                                        f6 = androidx.compose.material.TabRowKt.ScrollableTabRowMinimumTabWidth;
                                                        int i17 = SubcomposeLayout.mo309roundToPx0680j_4(f6);
                                                        final int i18 = SubcomposeLayout.mo309roundToPx0680j_4(f5);
                                                        long m4415copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j7, i17, 0, 0, 0, 14, null);
                                                        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Tabs, function24);
                                                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                                        java.util.Iterator<T> it = subcompose.iterator();
                                                        while (it.hasNext()) {
                                                            arrayList.add(((androidx.compose.ui.layout.Measurable) it.next()).mo3402measureBRTryo0(m4415copyZbe2FdA$default));
                                                        }
                                                        final java.util.ArrayList<androidx.compose.ui.layout.Placeable> arrayList2 = arrayList;
                                                        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
                                                        intRef.element = i18 * 2;
                                                        final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                                                        for (androidx.compose.ui.layout.Placeable placeable : arrayList2) {
                                                            intRef.element += placeable.getWidth();
                                                            intRef2.element = java.lang.Math.max(intRef2.element, placeable.getHeight());
                                                        }
                                                        int i19 = intRef.element;
                                                        int i20 = intRef2.element;
                                                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function26 = function25;
                                                        final androidx.compose.material.ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                        final int i21 = i15;
                                                        final kotlin.jvm.functions.Function3<java.util.List<androidx.compose.material.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function36 = function35;
                                                        final int i22 = i16;
                                                        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(SubcomposeLayout, i19, i20, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return kotlin.Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                                final java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                                                int i23 = i18;
                                                                java.util.List<androidx.compose.ui.layout.Placeable> list = arrayList2;
                                                                androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                                int i24 = i23;
                                                                for (androidx.compose.ui.layout.Placeable placeable2 : list) {
                                                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, placeable2, i24, 0, 0.0f, 4, null);
                                                                    arrayList3.add(new androidx.compose.material.TabPosition(subcomposeMeasureScope.mo312toDpu2uoSUM(i24), subcomposeMeasureScope.mo312toDpu2uoSUM(placeable2.getWidth()), null));
                                                                    i24 += placeable2.getWidth();
                                                                }
                                                                java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Divider, function26);
                                                                long j8 = j7;
                                                                kotlin.jvm.internal.Ref.IntRef intRef3 = intRef;
                                                                kotlin.jvm.internal.Ref.IntRef intRef4 = intRef2;
                                                                java.util.Iterator<T> it2 = subcompose2.iterator();
                                                                while (it2.hasNext()) {
                                                                    androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) it2.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j8, intRef3.element, intRef3.element, 0, 0, 8, null));
                                                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo0, 0, intRef4.element - mo3402measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                                    intRef3 = intRef3;
                                                                    intRef4 = intRef4;
                                                                    j8 = j8;
                                                                }
                                                                androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                                androidx.compose.material.TabSlots tabSlots = androidx.compose.material.TabSlots.Indicator;
                                                                final kotlin.jvm.functions.Function3<java.util.List<androidx.compose.material.TabPosition>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function37 = function36;
                                                                final int i25 = i22;
                                                                java.util.List<androidx.compose.ui.layout.Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(230769237, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                                                        invoke(composer3, num.intValue());
                                                                        return kotlin.Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(androidx.compose.runtime.Composer composer3, int i26) {
                                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C301@14269L23:TabRow.kt#jmzs0o");
                                                                        if ((i26 & 11) == 2 && composer3.getSkipping()) {
                                                                            composer3.skipToGroupEnd();
                                                                        } else {
                                                                            function37.invoke(arrayList3, composer3, java.lang.Integer.valueOf(((i25 >> 12) & 112) | 8));
                                                                        }
                                                                    }
                                                                }));
                                                                kotlin.jvm.internal.Ref.IntRef intRef5 = intRef;
                                                                kotlin.jvm.internal.Ref.IntRef intRef6 = intRef2;
                                                                java.util.Iterator<T> it3 = subcompose3.iterator();
                                                                while (it3.hasNext()) {
                                                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, ((androidx.compose.ui.layout.Measurable) it3.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                                }
                                                                scrollableTabData2.onLaidOut(SubcomposeLayout, i18, arrayList3, i21);
                                                            }
                                                        }, 4, null);
                                                    }
                                                }, composer2, 0, 0);
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                                    kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35 = composableLambda;
                                    function22 = m1347getLambda2$material_release;
                                    modifier2 = companion;
                                    long j7 = j3;
                                    f3 = m1543getScrollableTabRowPaddingD9Ej5fM;
                                    j5 = j4;
                                    j6 = j7;
                                    function33 = function35;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                companion = modifier;
                                j4 = j;
                                m1543getScrollableTabRowPaddingD9Ej5fM = f2;
                                composableLambda = function32;
                            }
                            i8 = i4;
                            m1347getLambda2$material_release = function2;
                            startRestartGroup.endDefaults();
                            final float f42 = m1543getScrollableTabRowPaddingD9Ej5fM;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function232 = m1347getLambda2$material_release;
                            final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function342 = composableLambda;
                            final int i132 = i8;
                            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(companion, null, j4, j3, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i14) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C245@11859L21,246@11910L24,247@11967L185,253@12161L2557:TabRow.kt#jmzs0o");
                                    if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                                        androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1);
                                        composer2.startReplaceableGroup(773894976);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                        composer2.startReplaceableGroup(-492369756);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                                        java.lang.Object rememberedValue = composer2.rememberedValue();
                                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            java.lang.Object compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer2));
                                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                                        }
                                        composer2.endReplaceableGroup();
                                        kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                        composer2.endReplaceableGroup();
                                        composer2.startReplaceableGroup(511388516);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
                                        boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                                        java.lang.Object rememberedValue2 = composer2.rememberedValue();
                                        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue2 = new androidx.compose.material.ScrollableTabData(rememberScrollState, coroutineScope);
                                            composer2.updateRememberedValue(rememberedValue2);
                                        }
                                        composer2.endReplaceableGroup();
                                        final androidx.compose.material.ScrollableTabData scrollableTabData = (androidx.compose.material.ScrollableTabData) rememberedValue2;
                                        androidx.compose.ui.Modifier clipToBounds = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.ScrollKt.horizontalScroll$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                                        final float f5 = f42;
                                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = tabs;
                                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25 = function232;
                                        final int i15 = i;
                                        final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function352 = function342;
                                        final int i16 = i132;
                                        androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                                                return m1548invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                            }

                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final androidx.compose.ui.layout.MeasureResult m1548invoke0kLqBqw(final androidx.compose.ui.layout.SubcomposeMeasureScope SubcomposeLayout, final long j72) {
                                                float f6;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                                f6 = androidx.compose.material.TabRowKt.ScrollableTabRowMinimumTabWidth;
                                                int i17 = SubcomposeLayout.mo309roundToPx0680j_4(f6);
                                                final int i18 = SubcomposeLayout.mo309roundToPx0680j_4(f5);
                                                long m4415copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j72, i17, 0, 0, 0, 14, null);
                                                java.util.List<androidx.compose.ui.layout.Measurable> subcompose = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Tabs, function24);
                                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                                java.util.Iterator<T> it = subcompose.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(((androidx.compose.ui.layout.Measurable) it.next()).mo3402measureBRTryo0(m4415copyZbe2FdA$default));
                                                }
                                                final java.util.List<? extends androidx.compose.ui.layout.Placeable> arrayList2 = arrayList;
                                                final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
                                                intRef.element = i18 * 2;
                                                final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                                                for (androidx.compose.ui.layout.Placeable placeable : arrayList2) {
                                                    intRef.element += placeable.getWidth();
                                                    intRef2.element = java.lang.Math.max(intRef2.element, placeable.getHeight());
                                                }
                                                int i19 = intRef.element;
                                                int i20 = intRef2.element;
                                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26 = function25;
                                                final androidx.compose.material.ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                final int i21 = i15;
                                                final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function352;
                                                final int i22 = i16;
                                                return androidx.compose.ui.layout.MeasureScope.CC.layout$default(SubcomposeLayout, i19, i20, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                        invoke2(placementScope);
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                        final java.util.List<androidx.compose.material.TabPosition> arrayList3 = new java.util.ArrayList();
                                                        int i23 = i18;
                                                        java.util.List<androidx.compose.ui.layout.Placeable> list = arrayList2;
                                                        androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                        int i24 = i23;
                                                        for (androidx.compose.ui.layout.Placeable placeable2 : list) {
                                                            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, placeable2, i24, 0, 0.0f, 4, null);
                                                            arrayList3.add(new androidx.compose.material.TabPosition(subcomposeMeasureScope.mo312toDpu2uoSUM(i24), subcomposeMeasureScope.mo312toDpu2uoSUM(placeable2.getWidth()), null));
                                                            i24 += placeable2.getWidth();
                                                        }
                                                        java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Divider, function26);
                                                        long j8 = j72;
                                                        kotlin.jvm.internal.Ref.IntRef intRef3 = intRef;
                                                        kotlin.jvm.internal.Ref.IntRef intRef4 = intRef2;
                                                        java.util.Iterator<T> it2 = subcompose2.iterator();
                                                        while (it2.hasNext()) {
                                                            androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) it2.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j8, intRef3.element, intRef3.element, 0, 0, 8, null));
                                                            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo0, 0, intRef4.element - mo3402measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                            intRef3 = intRef3;
                                                            intRef4 = intRef4;
                                                            j8 = j8;
                                                        }
                                                        androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                        androidx.compose.material.TabSlots tabSlots = androidx.compose.material.TabSlots.Indicator;
                                                        final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37 = function36;
                                                        final int i25 = i22;
                                                        java.util.List<androidx.compose.ui.layout.Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(230769237, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                                                invoke(composer3, num.intValue());
                                                                return kotlin.Unit.INSTANCE;
                                                            }

                                                            public final void invoke(androidx.compose.runtime.Composer composer3, int i26) {
                                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C301@14269L23:TabRow.kt#jmzs0o");
                                                                if ((i26 & 11) == 2 && composer3.getSkipping()) {
                                                                    composer3.skipToGroupEnd();
                                                                } else {
                                                                    function37.invoke(arrayList3, composer3, java.lang.Integer.valueOf(((i25 >> 12) & 112) | 8));
                                                                }
                                                            }
                                                        }));
                                                        kotlin.jvm.internal.Ref.IntRef intRef5 = intRef;
                                                        kotlin.jvm.internal.Ref.IntRef intRef6 = intRef2;
                                                        java.util.Iterator<T> it3 = subcompose3.iterator();
                                                        while (it3.hasNext()) {
                                                            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, ((androidx.compose.ui.layout.Measurable) it3.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                        }
                                                        scrollableTabData2.onLaidOut(SubcomposeLayout, i18, arrayList3, i21);
                                                    }
                                                }, 4, null);
                                            }
                                        }, composer2, 0, 0);
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                            kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function352 = composableLambda;
                            function22 = m1347getLambda2$material_release;
                            modifier2 = companion;
                            long j72 = j3;
                            f3 = m1543getScrollableTabRowPaddingD9Ej5fM;
                            j5 = j4;
                            j6 = j72;
                            function33 = function352;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            j5 = j;
                            function22 = function2;
                            j6 = j3;
                            f3 = f2;
                            function33 = function32;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                invoke(composer2, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i14) {
                                androidx.compose.material.TabRowKt.m1546ScrollableTabRowsKfQg0A(i, modifier2, j5, j6, f3, function33, function22, tabs, composer2, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    i4 |= i9;
                    if ((23967451 & i4) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    i8 = i4;
                    m1347getLambda2$material_release = function2;
                    startRestartGroup.endDefaults();
                    final float f422 = m1543getScrollableTabRowPaddingD9Ej5fM;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2322 = m1347getLambda2$material_release;
                    final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3422 = composableLambda;
                    final int i1322 = i8;
                    androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(companion, null, j4, j3, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            invoke(composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i14) {
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C245@11859L21,246@11910L24,247@11967L185,253@12161L2557:TabRow.kt#jmzs0o");
                            if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                                androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1);
                                composer2.startReplaceableGroup(773894976);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                composer2.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                                java.lang.Object rememberedValue = composer2.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    java.lang.Object compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer2));
                                    composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                composer2.endReplaceableGroup();
                                kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                composer2.endReplaceableGroup();
                                composer2.startReplaceableGroup(511388516);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
                                boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                                java.lang.Object rememberedValue2 = composer2.rememberedValue();
                                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new androidx.compose.material.ScrollableTabData(rememberScrollState, coroutineScope);
                                    composer2.updateRememberedValue(rememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                final androidx.compose.material.ScrollableTabData scrollableTabData = (androidx.compose.material.ScrollableTabData) rememberedValue2;
                                androidx.compose.ui.Modifier clipToBounds = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.ScrollKt.horizontalScroll$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                                final float f5 = f422;
                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = tabs;
                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25 = function2322;
                                final int i15 = i;
                                final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3522 = function3422;
                                final int i16 = i1322;
                                androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                                        return m1548invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final androidx.compose.ui.layout.MeasureResult m1548invoke0kLqBqw(final androidx.compose.ui.layout.SubcomposeMeasureScope SubcomposeLayout, final long j722) {
                                        float f6;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        f6 = androidx.compose.material.TabRowKt.ScrollableTabRowMinimumTabWidth;
                                        int i17 = SubcomposeLayout.mo309roundToPx0680j_4(f6);
                                        final int i18 = SubcomposeLayout.mo309roundToPx0680j_4(f5);
                                        long m4415copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j722, i17, 0, 0, 0, 14, null);
                                        java.util.List<androidx.compose.ui.layout.Measurable> subcompose = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Tabs, function24);
                                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                        java.util.Iterator<T> it = subcompose.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(((androidx.compose.ui.layout.Measurable) it.next()).mo3402measureBRTryo0(m4415copyZbe2FdA$default));
                                        }
                                        final java.util.List<? extends androidx.compose.ui.layout.Placeable> arrayList2 = arrayList;
                                        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
                                        intRef.element = i18 * 2;
                                        final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                                        for (androidx.compose.ui.layout.Placeable placeable : arrayList2) {
                                            intRef.element += placeable.getWidth();
                                            intRef2.element = java.lang.Math.max(intRef2.element, placeable.getHeight());
                                        }
                                        int i19 = intRef.element;
                                        int i20 = intRef2.element;
                                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26 = function25;
                                        final androidx.compose.material.ScrollableTabData scrollableTabData2 = scrollableTabData;
                                        final int i21 = i15;
                                        final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function3522;
                                        final int i22 = i16;
                                        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(SubcomposeLayout, i19, i20, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                invoke2(placementScope);
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                final java.util.List<androidx.compose.material.TabPosition> arrayList3 = new java.util.ArrayList();
                                                int i23 = i18;
                                                java.util.List<androidx.compose.ui.layout.Placeable> list = arrayList2;
                                                androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                int i24 = i23;
                                                for (androidx.compose.ui.layout.Placeable placeable2 : list) {
                                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, placeable2, i24, 0, 0.0f, 4, null);
                                                    arrayList3.add(new androidx.compose.material.TabPosition(subcomposeMeasureScope.mo312toDpu2uoSUM(i24), subcomposeMeasureScope.mo312toDpu2uoSUM(placeable2.getWidth()), null));
                                                    i24 += placeable2.getWidth();
                                                }
                                                java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Divider, function26);
                                                long j8 = j722;
                                                kotlin.jvm.internal.Ref.IntRef intRef3 = intRef;
                                                kotlin.jvm.internal.Ref.IntRef intRef4 = intRef2;
                                                java.util.Iterator<T> it2 = subcompose2.iterator();
                                                while (it2.hasNext()) {
                                                    androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) it2.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j8, intRef3.element, intRef3.element, 0, 0, 8, null));
                                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo0, 0, intRef4.element - mo3402measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    intRef3 = intRef3;
                                                    intRef4 = intRef4;
                                                    j8 = j8;
                                                }
                                                androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                androidx.compose.material.TabSlots tabSlots = androidx.compose.material.TabSlots.Indicator;
                                                final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37 = function36;
                                                final int i25 = i22;
                                                java.util.List<androidx.compose.ui.layout.Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(230769237, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                                        invoke(composer3, num.intValue());
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    public final void invoke(androidx.compose.runtime.Composer composer3, int i26) {
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C301@14269L23:TabRow.kt#jmzs0o");
                                                        if ((i26 & 11) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                        } else {
                                                            function37.invoke(arrayList3, composer3, java.lang.Integer.valueOf(((i25 >> 12) & 112) | 8));
                                                        }
                                                    }
                                                }));
                                                kotlin.jvm.internal.Ref.IntRef intRef5 = intRef;
                                                kotlin.jvm.internal.Ref.IntRef intRef6 = intRef2;
                                                java.util.Iterator<T> it3 = subcompose3.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, ((androidx.compose.ui.layout.Measurable) it3.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                }
                                                scrollableTabData2.onLaidOut(SubcomposeLayout, i18, arrayList3, i21);
                                            }
                                        }, 4, null);
                                    }
                                }, composer2, 0, 0);
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                    kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3522 = composableLambda;
                    function22 = m1347getLambda2$material_release;
                    modifier2 = companion;
                    long j722 = j3;
                    f3 = m1543getScrollableTabRowPaddingD9Ej5fM;
                    j5 = j4;
                    j6 = j722;
                    function33 = function3522;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function32 = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                i4 |= i9;
                if ((23967451 & i4) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i12 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                i8 = i4;
                m1347getLambda2$material_release = function2;
                startRestartGroup.endDefaults();
                final float f4222 = m1543getScrollableTabRowPaddingD9Ej5fM;
                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23222 = m1347getLambda2$material_release;
                final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34222 = composableLambda;
                final int i13222 = i8;
                androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(companion, null, j4, j3, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i14) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C245@11859L21,246@11910L24,247@11967L185,253@12161L2557:TabRow.kt#jmzs0o");
                        if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                            androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1);
                            composer2.startReplaceableGroup(773894976);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                            composer2.startReplaceableGroup(-492369756);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                            java.lang.Object rememberedValue = composer2.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                java.lang.Object compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer2));
                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                rememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            composer2.endReplaceableGroup();
                            kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                            composer2.endReplaceableGroup();
                            composer2.startReplaceableGroup(511388516);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
                            boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                            java.lang.Object rememberedValue2 = composer2.rememberedValue();
                            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new androidx.compose.material.ScrollableTabData(rememberScrollState, coroutineScope);
                                composer2.updateRememberedValue(rememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            final androidx.compose.material.ScrollableTabData scrollableTabData = (androidx.compose.material.ScrollableTabData) rememberedValue2;
                            androidx.compose.ui.Modifier clipToBounds = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.ScrollKt.horizontalScroll$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                            final float f5 = f4222;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = tabs;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25 = function23222;
                            final int i15 = i;
                            final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35222 = function34222;
                            final int i16 = i13222;
                            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                                    return m1548invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                }

                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final androidx.compose.ui.layout.MeasureResult m1548invoke0kLqBqw(final androidx.compose.ui.layout.SubcomposeMeasureScope SubcomposeLayout, final long j7222) {
                                    float f6;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                    f6 = androidx.compose.material.TabRowKt.ScrollableTabRowMinimumTabWidth;
                                    int i17 = SubcomposeLayout.mo309roundToPx0680j_4(f6);
                                    final int i18 = SubcomposeLayout.mo309roundToPx0680j_4(f5);
                                    long m4415copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j7222, i17, 0, 0, 0, 14, null);
                                    java.util.List<androidx.compose.ui.layout.Measurable> subcompose = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Tabs, function24);
                                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                    java.util.Iterator<T> it = subcompose.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((androidx.compose.ui.layout.Measurable) it.next()).mo3402measureBRTryo0(m4415copyZbe2FdA$default));
                                    }
                                    final java.util.List<? extends androidx.compose.ui.layout.Placeable> arrayList2 = arrayList;
                                    final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
                                    intRef.element = i18 * 2;
                                    final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                                    for (androidx.compose.ui.layout.Placeable placeable : arrayList2) {
                                        intRef.element += placeable.getWidth();
                                        intRef2.element = java.lang.Math.max(intRef2.element, placeable.getHeight());
                                    }
                                    int i19 = intRef.element;
                                    int i20 = intRef2.element;
                                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26 = function25;
                                    final androidx.compose.material.ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i21 = i15;
                                    final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function35222;
                                    final int i22 = i16;
                                    return androidx.compose.ui.layout.MeasureScope.CC.layout$default(SubcomposeLayout, i19, i20, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                            final java.util.List<androidx.compose.material.TabPosition> arrayList3 = new java.util.ArrayList();
                                            int i23 = i18;
                                            java.util.List<androidx.compose.ui.layout.Placeable> list = arrayList2;
                                            androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                            int i24 = i23;
                                            for (androidx.compose.ui.layout.Placeable placeable2 : list) {
                                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, placeable2, i24, 0, 0.0f, 4, null);
                                                arrayList3.add(new androidx.compose.material.TabPosition(subcomposeMeasureScope.mo312toDpu2uoSUM(i24), subcomposeMeasureScope.mo312toDpu2uoSUM(placeable2.getWidth()), null));
                                                i24 += placeable2.getWidth();
                                            }
                                            java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Divider, function26);
                                            long j8 = j7222;
                                            kotlin.jvm.internal.Ref.IntRef intRef3 = intRef;
                                            kotlin.jvm.internal.Ref.IntRef intRef4 = intRef2;
                                            java.util.Iterator<T> it2 = subcompose2.iterator();
                                            while (it2.hasNext()) {
                                                androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) it2.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j8, intRef3.element, intRef3.element, 0, 0, 8, null));
                                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo0, 0, intRef4.element - mo3402measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                intRef3 = intRef3;
                                                intRef4 = intRef4;
                                                j8 = j8;
                                            }
                                            androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                            androidx.compose.material.TabSlots tabSlots = androidx.compose.material.TabSlots.Indicator;
                                            final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37 = function36;
                                            final int i25 = i22;
                                            java.util.List<androidx.compose.ui.layout.Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(230769237, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void invoke(androidx.compose.runtime.Composer composer3, int i26) {
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C301@14269L23:TabRow.kt#jmzs0o");
                                                    if ((i26 & 11) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                    } else {
                                                        function37.invoke(arrayList3, composer3, java.lang.Integer.valueOf(((i25 >> 12) & 112) | 8));
                                                    }
                                                }
                                            }));
                                            kotlin.jvm.internal.Ref.IntRef intRef5 = intRef;
                                            kotlin.jvm.internal.Ref.IntRef intRef6 = intRef2;
                                            java.util.Iterator<T> it3 = subcompose3.iterator();
                                            while (it3.hasNext()) {
                                                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, ((androidx.compose.ui.layout.Measurable) it3.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(SubcomposeLayout, i18, arrayList3, i21);
                                        }
                                    }, 4, null);
                                }
                            }, composer2, 0, 0);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
                kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35222 = composableLambda;
                function22 = m1347getLambda2$material_release;
                modifier2 = companion;
                long j7222 = j3;
                f3 = m1543getScrollableTabRowPaddingD9Ej5fM;
                j5 = j4;
                j6 = j7222;
                function33 = function35222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function32 = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            i4 |= i9;
            if ((23967451 & i4) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i12 != 0) {
            }
            if ((i3 & 4) != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            i8 = i4;
            m1347getLambda2$material_release = function2;
            startRestartGroup.endDefaults();
            final float f42222 = m1543getScrollableTabRowPaddingD9Ej5fM;
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function232222 = m1347getLambda2$material_release;
            final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function342222 = composableLambda;
            final int i132222 = i8;
            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(companion, null, j4, j3, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i14) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C245@11859L21,246@11910L24,247@11967L185,253@12161L2557:TabRow.kt#jmzs0o");
                    if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                        androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1);
                        composer2.startReplaceableGroup(773894976);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                        composer2.startReplaceableGroup(-492369756);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                        java.lang.Object rememberedValue = composer2.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            java.lang.Object compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer2));
                            composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            rememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        composer2.endReplaceableGroup();
                        kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(511388516);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
                        boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                        java.lang.Object rememberedValue2 = composer2.rememberedValue();
                        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new androidx.compose.material.ScrollableTabData(rememberScrollState, coroutineScope);
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        final androidx.compose.material.ScrollableTabData scrollableTabData = (androidx.compose.material.ScrollableTabData) rememberedValue2;
                        androidx.compose.ui.Modifier clipToBounds = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.ScrollKt.horizontalScroll$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                        final float f5 = f42222;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = tabs;
                        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25 = function232222;
                        final int i15 = i;
                        final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function352222 = function342222;
                        final int i16 = i132222;
                        androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                                return m1548invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final androidx.compose.ui.layout.MeasureResult m1548invoke0kLqBqw(final androidx.compose.ui.layout.SubcomposeMeasureScope SubcomposeLayout, final long j72222) {
                                float f6;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                f6 = androidx.compose.material.TabRowKt.ScrollableTabRowMinimumTabWidth;
                                int i17 = SubcomposeLayout.mo309roundToPx0680j_4(f6);
                                final int i18 = SubcomposeLayout.mo309roundToPx0680j_4(f5);
                                long m4415copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j72222, i17, 0, 0, 0, 14, null);
                                java.util.List<androidx.compose.ui.layout.Measurable> subcompose = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Tabs, function24);
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                                java.util.Iterator<T> it = subcompose.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((androidx.compose.ui.layout.Measurable) it.next()).mo3402measureBRTryo0(m4415copyZbe2FdA$default));
                                }
                                final java.util.List<? extends androidx.compose.ui.layout.Placeable> arrayList2 = arrayList;
                                final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
                                intRef.element = i18 * 2;
                                final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                                for (androidx.compose.ui.layout.Placeable placeable : arrayList2) {
                                    intRef.element += placeable.getWidth();
                                    intRef2.element = java.lang.Math.max(intRef2.element, placeable.getHeight());
                                }
                                int i19 = intRef.element;
                                int i20 = intRef2.element;
                                final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26 = function25;
                                final androidx.compose.material.ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i21 = i15;
                                final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function352222;
                                final int i22 = i16;
                                return androidx.compose.ui.layout.MeasureScope.CC.layout$default(SubcomposeLayout, i19, i20, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                        final java.util.List<androidx.compose.material.TabPosition> arrayList3 = new java.util.ArrayList();
                                        int i23 = i18;
                                        java.util.List<androidx.compose.ui.layout.Placeable> list = arrayList2;
                                        androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        int i24 = i23;
                                        for (androidx.compose.ui.layout.Placeable placeable2 : list) {
                                            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, placeable2, i24, 0, 0.0f, 4, null);
                                            arrayList3.add(new androidx.compose.material.TabPosition(subcomposeMeasureScope.mo312toDpu2uoSUM(i24), subcomposeMeasureScope.mo312toDpu2uoSUM(placeable2.getWidth()), null));
                                            i24 += placeable2.getWidth();
                                        }
                                        java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Divider, function26);
                                        long j8 = j72222;
                                        kotlin.jvm.internal.Ref.IntRef intRef3 = intRef;
                                        kotlin.jvm.internal.Ref.IntRef intRef4 = intRef2;
                                        java.util.Iterator<T> it2 = subcompose2.iterator();
                                        while (it2.hasNext()) {
                                            androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) it2.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j8, intRef3.element, intRef3.element, 0, 0, 8, null));
                                            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo0, 0, intRef4.element - mo3402measureBRTryo0.getHeight(), 0.0f, 4, null);
                                            intRef3 = intRef3;
                                            intRef4 = intRef4;
                                            j8 = j8;
                                        }
                                        androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                        androidx.compose.material.TabSlots tabSlots = androidx.compose.material.TabSlots.Indicator;
                                        final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37 = function36;
                                        final int i25 = i22;
                                        java.util.List<androidx.compose.ui.layout.Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(230769237, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                                invoke(composer3, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.runtime.Composer composer3, int i26) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C301@14269L23:TabRow.kt#jmzs0o");
                                                if ((i26 & 11) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                } else {
                                                    function37.invoke(arrayList3, composer3, java.lang.Integer.valueOf(((i25 >> 12) & 112) | 8));
                                                }
                                            }
                                        }));
                                        kotlin.jvm.internal.Ref.IntRef intRef5 = intRef;
                                        kotlin.jvm.internal.Ref.IntRef intRef6 = intRef2;
                                        java.util.Iterator<T> it3 = subcompose3.iterator();
                                        while (it3.hasNext()) {
                                            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, ((androidx.compose.ui.layout.Measurable) it3.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.onLaidOut(SubcomposeLayout, i18, arrayList3, i21);
                                    }
                                }, 4, null);
                            }
                        }, composer2, 0, 0);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
            kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function352222 = composableLambda;
            function22 = m1347getLambda2$material_release;
            modifier2 = companion;
            long j72222 = j3;
            f3 = m1543getScrollableTabRowPaddingD9Ej5fM;
            j5 = j4;
            j6 = j72222;
            function33 = function352222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 896) == 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function32 = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        i4 |= i9;
        if ((23967451 & i4) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i12 != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        i8 = i4;
        m1347getLambda2$material_release = function2;
        startRestartGroup.endDefaults();
        final float f422222 = m1543getScrollableTabRowPaddingD9Ej5fM;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2322222 = m1347getLambda2$material_release;
        final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3422222 = composableLambda;
        final int i1322222 = i8;
        androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(companion, null, j4, j3, null, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1455860572, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i14) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C245@11859L21,246@11910L24,247@11967L185,253@12161L2557:TabRow.kt#jmzs0o");
                if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                    androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1);
                    composer2.startReplaceableGroup(773894976);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    composer2.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                    java.lang.Object rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        java.lang.Object compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer2));
                        composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    composer2.endReplaceableGroup();
                    kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    composer2.endReplaceableGroup();
                    composer2.startReplaceableGroup(511388516);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(remember)P(1,2):Composables.kt#9igjgp");
                    boolean changed = composer2.changed(rememberScrollState) | composer2.changed(coroutineScope);
                    java.lang.Object rememberedValue2 = composer2.rememberedValue();
                    if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new androidx.compose.material.ScrollableTabData(rememberScrollState, coroutineScope);
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    final androidx.compose.material.ScrollableTabData scrollableTabData = (androidx.compose.material.ScrollableTabData) rememberedValue2;
                    androidx.compose.ui.Modifier clipToBounds = androidx.compose.ui.draw.ClipKt.clipToBounds(androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.ScrollKt.horizontalScroll$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false, 2, null), rememberScrollState, false, null, false, 14, null)));
                    final float f5 = f422222;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = tabs;
                    final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25 = function2322222;
                    final int i15 = i;
                    final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3522222 = function3422222;
                    final int i16 = i1322222;
                    androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(clipToBounds, new kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope, androidx.compose.ui.unit.Constraints constraints) {
                            return m1548invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                        }

                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                        public final androidx.compose.ui.layout.MeasureResult m1548invoke0kLqBqw(final androidx.compose.ui.layout.SubcomposeMeasureScope SubcomposeLayout, final long j722222) {
                            float f6;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                            f6 = androidx.compose.material.TabRowKt.ScrollableTabRowMinimumTabWidth;
                            int i17 = SubcomposeLayout.mo309roundToPx0680j_4(f6);
                            final int i18 = SubcomposeLayout.mo309roundToPx0680j_4(f5);
                            long m4415copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j722222, i17, 0, 0, 0, 14, null);
                            java.util.List<androidx.compose.ui.layout.Measurable> subcompose = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Tabs, function24);
                            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(subcompose, 10));
                            java.util.Iterator<T> it = subcompose.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((androidx.compose.ui.layout.Measurable) it.next()).mo3402measureBRTryo0(m4415copyZbe2FdA$default));
                            }
                            final java.util.List<? extends androidx.compose.ui.layout.Placeable> arrayList2 = arrayList;
                            final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
                            intRef.element = i18 * 2;
                            final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
                            for (androidx.compose.ui.layout.Placeable placeable : arrayList2) {
                                intRef.element += placeable.getWidth();
                                intRef2.element = java.lang.Math.max(intRef2.element, placeable.getHeight());
                            }
                            int i19 = intRef.element;
                            int i20 = intRef2.element;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26 = function25;
                            final androidx.compose.material.ScrollableTabData scrollableTabData2 = scrollableTabData;
                            final int i21 = i15;
                            final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36 = function3522222;
                            final int i22 = i16;
                            return androidx.compose.ui.layout.MeasureScope.CC.layout$default(SubcomposeLayout, i19, i20, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                    final java.util.List<androidx.compose.material.TabPosition> arrayList3 = new java.util.ArrayList();
                                    int i23 = i18;
                                    java.util.List<androidx.compose.ui.layout.Placeable> list = arrayList2;
                                    androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                    int i24 = i23;
                                    for (androidx.compose.ui.layout.Placeable placeable2 : list) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, placeable2, i24, 0, 0.0f, 4, null);
                                        arrayList3.add(new androidx.compose.material.TabPosition(subcomposeMeasureScope.mo312toDpu2uoSUM(i24), subcomposeMeasureScope.mo312toDpu2uoSUM(placeable2.getWidth()), null));
                                        i24 += placeable2.getWidth();
                                    }
                                    java.util.List<androidx.compose.ui.layout.Measurable> subcompose2 = SubcomposeLayout.subcompose(androidx.compose.material.TabSlots.Divider, function26);
                                    long j8 = j722222;
                                    kotlin.jvm.internal.Ref.IntRef intRef3 = intRef;
                                    kotlin.jvm.internal.Ref.IntRef intRef4 = intRef2;
                                    java.util.Iterator<T> it2 = subcompose2.iterator();
                                    while (it2.hasNext()) {
                                        androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = ((androidx.compose.ui.layout.Measurable) it2.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j8, intRef3.element, intRef3.element, 0, 0, 8, null));
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, mo3402measureBRTryo0, 0, intRef4.element - mo3402measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        intRef3 = intRef3;
                                        intRef4 = intRef4;
                                        j8 = j8;
                                    }
                                    androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                    androidx.compose.material.TabSlots tabSlots = androidx.compose.material.TabSlots.Indicator;
                                    final kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function37 = function36;
                                    final int i25 = i22;
                                    java.util.List<androidx.compose.ui.layout.Measurable> subcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(230769237, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.2.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                            invoke(composer3, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.runtime.Composer composer3, int i26) {
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C301@14269L23:TabRow.kt#jmzs0o");
                                            if ((i26 & 11) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                            } else {
                                                function37.invoke(arrayList3, composer3, java.lang.Integer.valueOf(((i25 >> 12) & 112) | 8));
                                            }
                                        }
                                    }));
                                    kotlin.jvm.internal.Ref.IntRef intRef5 = intRef;
                                    kotlin.jvm.internal.Ref.IntRef intRef6 = intRef2;
                                    java.util.Iterator<T> it3 = subcompose3.iterator();
                                    while (it3.hasNext()) {
                                        androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, ((androidx.compose.ui.layout.Measurable) it3.next()).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.INSTANCE.m4432fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                    }
                                    scrollableTabData2.onLaidOut(SubcomposeLayout, i18, arrayList3, i21);
                                }
                            }, 4, null);
                        }
                    }, composer2, 0, 0);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, ((i8 >> 3) & 14) | 1572864 | (i8 & 896) | (i8 & 7168), 50);
        kotlin.jvm.functions.Function3<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3522222 = composableLambda;
        function22 = m1347getLambda2$material_release;
        modifier2 = companion;
        long j722222 = j3;
        f3 = m1543getScrollableTabRowPaddingD9Ej5fM;
        j5 = j4;
        j6 = j722222;
        function33 = function3522222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
