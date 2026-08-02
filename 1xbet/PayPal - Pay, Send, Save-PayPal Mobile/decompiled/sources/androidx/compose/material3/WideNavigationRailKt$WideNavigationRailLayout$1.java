package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WideNavigationRailKt$WideNavigationRailLayout$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ boolean Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.layout.Arrangement.Vertical getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> getHighSpeedVideoSizesFor;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getInputFormats;
    final /* synthetic */ androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> getOutputFormats;
    final /* synthetic */ float getOutputMinFrameDuration;
    final /* synthetic */ androidx.compose.foundation.layout.WindowInsets getOutputStallDuration;
    final /* synthetic */ androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> getOutputStallDurationlomOqCM;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        float f;
        float f2;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1489314345, intValue, -1, "androidx.compose.material3.WideNavigationRailLayout.<anonymous> (WideNavigationRail.kt:258)");
            }
            androidx.compose.ui.Modifier windowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), this.getOutputStallDuration);
            f = androidx.compose.material3.WideNavigationRailKt.getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.Modifier m1747widthInVpY3zN4$default = androidx.compose.foundation.layout.SizeKt.m1747widthInVpY3zN4$default(windowInsetsPadding, 0.0f, f, 1, null);
            f2 = androidx.compose.material3.WideNavigationRailKt.getOutputMinFrameDurationlomOqCM;
            androidx.compose.ui.Modifier selectableGroup = androidx.compose.foundation.selection.SelectableGroupKt.selectableGroup(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(m1747widthInVpY3zN4$default, 0.0f, f2, 0.0f, 0.0f, 13, null));
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1.getHighSpeedVideoFpsRangesFor((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(selectableGroup, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1.AnonymousClass2 anonymousClass2 = new androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1.AnonymousClass2(this.getInputFormats, this.Camera2StreamConfigurationMap, this.getOutputFormats, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizesFor, this.getOutputStallDurationlomOqCM, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI);
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getInputFormats;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.getHighSpeedVideoFpsRangesFor;
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, semantics$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, anonymousClass2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            if (function2 != null) {
                composer2.startReplaceGroup(1714892004);
                androidx.compose.ui.Modifier layoutId = androidx.compose.ui.layout.LayoutIdKt.layoutId(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, layoutId);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                    m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                function2.invoke(composer2, 0);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1714982338);
                composer2.endReplaceGroup();
            }
            function22.invoke(composer2, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J)\u0010\u000b\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/material3/WideNavigationRailKt$WideNavigationRailLayout$1$2;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1$2, reason: invalid class name */
    public static final class AnonymousClass2 implements androidx.compose.ui.layout.MeasurePolicy {
        final /* synthetic */ androidx.compose.runtime.MutableIntState Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.foundation.layout.Arrangement.Vertical getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.MutableIntState getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ boolean getHighSpeedVideoSizes;
        final /* synthetic */ float getHighSpeedVideoSizesFor;
        final /* synthetic */ androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> getInputFormats;
        final /* synthetic */ androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> getInputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> getOutputFormats;
        final /* synthetic */ androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> getOutputMinFrameDuration;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, boolean z, androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state, float f, androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state2, androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state3, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableIntState mutableIntState2, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state4) {
            this.getHighSpeedVideoFpsRanges = function2;
            this.getHighSpeedVideoSizes = z;
            this.getInputFormats = state;
            this.getHighSpeedVideoSizesFor = f;
            this.getInputSizeshNQ4ISI = state2;
            this.getOutputFormats = state3;
            this.Camera2StreamConfigurationMap = mutableIntState;
            this.getHighSpeedVideoFpsRangesFor = mutableIntState2;
            this.getHighResolutionOutputSizeshNQ4ISI = vertical;
            this.getOutputMinFrameDuration = state4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v16, types: [T, androidx.compose.ui.layout.Placeable] */
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /* renamed from: measure-3p2s80s */
        public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
            int m8556getMinWidthimpl;
            int i;
            int i2;
            int i3;
            kotlin.jvm.internal.Ref.ObjectRef objectRef;
            int i4;
            int i5;
            kotlin.jvm.internal.Ref.ObjectRef objectRef2;
            int i6;
            int intValue;
            float m8615unboximpl;
            int intValue2;
            int coerceIn;
            int i7;
            int i8;
            float m8615unboximpl2;
            float m8615unboximpl3;
            float f;
            float f2;
            float m8615unboximpl4;
            java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = list;
            int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
            int size = list.size();
            int m8556getMinWidthimpl2 = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
            if (androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j) == 0) {
                f2 = androidx.compose.material3.WideNavigationRailKt.Camera2StreamConfigurationMap;
                m8556getMinWidthimpl2 = kotlin.ranges.RangesKt.coerceAtMost(measureScope.mo1412roundToPx0680j_4(f2), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j));
                m8615unboximpl4 = ((androidx.compose.ui.unit.Dp) this.getInputFormats.getValue()).m8615unboximpl();
                m8556getMinWidthimpl = kotlin.ranges.RangesKt.coerceAtMost(measureScope.mo1412roundToPx0680j_4(m8615unboximpl4), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j));
            } else {
                m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
            }
            if (size <= 0) {
                return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8556getMinWidthimpl, m8553getMaxHeightimpl, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, 4, null);
            }
            long m8545copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m8545copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
            kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
            if (this.getHighSpeedVideoFpsRanges != null) {
                int size2 = list2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    androidx.compose.ui.layout.Measurable measurable = list2.get(i9);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(androidx.compose.ui.layout.LayoutIdKt.getLayoutId(measurable), com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER)) {
                        objectRef3.element = measurable.mo7353measureBRTryo0(m8545copyZbe2FdA$default);
                        if (size > 1) {
                            list2 = list2.subList(1, size);
                        }
                        size--;
                        i = ((androidx.compose.ui.layout.Placeable) objectRef3.element).getHeight();
                    }
                }
                androidx.compose.ui.util.ListUtilsKt.throwNoSuchElementException("Collection contains no element matching the predicate.");
                throw new kotlin.KotlinNothingValueException();
            }
            i = 0;
            final java.util.ArrayList arrayList = size > 0 ? new java.util.ArrayList() : null;
            int m8554getMaxWidthimpl = this.getHighSpeedVideoSizes ? androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(m8545copyZbe2FdA$default) : m8556getMinWidthimpl;
            if (arrayList != null) {
                float f3 = this.getHighSpeedVideoSizesFor;
                boolean z = this.getHighSpeedVideoSizes;
                androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state = this.getInputSizeshNQ4ISI;
                int i10 = i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list2.size());
                int size3 = list2.size();
                i2 = m8556getMinWidthimpl2;
                i3 = m8556getMinWidthimpl;
                i4 = m8553getMaxHeightimpl;
                int i11 = 0;
                i5 = 0;
                int i12 = i10;
                while (i11 < size3) {
                    androidx.compose.ui.layout.Measurable measurable2 = list2.get(i11);
                    java.util.List<? extends androidx.compose.ui.layout.Measurable> list3 = list2;
                    java.util.ArrayList arrayList3 = arrayList2;
                    int i13 = size3;
                    androidx.compose.ui.layout.Measurable measurable3 = measurable2;
                    long m8574offsetNN6EwU$default = androidx.compose.ui.unit.ConstraintsKt.m8574offsetNN6EwU$default(m8545copyZbe2FdA$default, 0, -i12, 1, null);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = objectRef3;
                    androidx.compose.ui.unit.Constraints.Companion companion = androidx.compose.ui.unit.Constraints.INSTANCE;
                    java.util.ArrayList arrayList4 = arrayList2;
                    int i14 = measureScope.mo1412roundToPx0680j_4(f3);
                    float f4 = f3;
                    m8615unboximpl3 = ((androidx.compose.ui.unit.Dp) state.getValue()).m8615unboximpl();
                    androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state2 = state;
                    long j2 = m8545copyZbe2FdA$default;
                    androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable3.mo7353measureBRTryo0(androidx.compose.ui.unit.ConstraintsKt.m8569constrainN9IONVI(m8574offsetNN6EwU$default, companion.m8563fitPrioritizingWidthZbe2FdA(i14, m8554getMaxWidthimpl, measureScope.mo1412roundToPx0680j_4(m8615unboximpl3), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(m8545copyZbe2FdA$default))));
                    int measuredWidth = mo7353measureBRTryo0.getMeasuredWidth();
                    if (z && i5 < measuredWidth) {
                        f = androidx.compose.material3.WideNavigationRailKt.getHighSpeedVideoFpsRanges;
                        i5 = measureScope.mo1412roundToPx0680j_4(f) + measuredWidth;
                    }
                    int height = mo7353measureBRTryo0.getHeight();
                    arrayList3.add(java.lang.Boolean.valueOf(arrayList.add(mo7353measureBRTryo0)));
                    i11++;
                    i12 = height;
                    objectRef3 = objectRef4;
                    arrayList2 = arrayList4;
                    f3 = f4;
                    state = state2;
                    m8545copyZbe2FdA$default = j2;
                    size3 = i13;
                    list2 = list3;
                }
                objectRef = objectRef3;
            } else {
                i2 = m8556getMinWidthimpl2;
                i3 = m8556getMinWidthimpl;
                objectRef = objectRef3;
                i4 = m8553getMaxHeightimpl;
                i5 = 0;
            }
            if (this.getHighSpeedVideoSizes) {
                objectRef2 = objectRef;
                androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) objectRef2.element;
                int max = java.lang.Math.max(i5, placeable != null ? placeable.getWidth() : 0);
                i6 = i3;
                if (max > i6 && max > (i8 = i2)) {
                    int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(java.lang.Math.max(max, i8), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j));
                    m8615unboximpl2 = ((androidx.compose.ui.unit.Dp) this.getOutputFormats.getValue()).m8615unboximpl();
                    coerceIn = kotlin.ranges.RangesKt.coerceAtMost(measureScope.mo1412roundToPx0680j_4(m8615unboximpl2), coerceAtMost);
                    this.Camera2StreamConfigurationMap.setIntValue(coerceIn);
                    i7 = coerceIn;
                }
                i7 = i6;
            } else {
                objectRef2 = objectRef;
                i6 = i3;
                intValue = this.Camera2StreamConfigurationMap.getIntValue();
                if (intValue > 0) {
                    m8615unboximpl = ((androidx.compose.ui.unit.Dp) this.getOutputFormats.getValue()).m8615unboximpl();
                    int i15 = measureScope.mo1412roundToPx0680j_4(m8615unboximpl);
                    intValue2 = this.getHighSpeedVideoFpsRangesFor.getIntValue();
                    coerceIn = kotlin.ranges.RangesKt.coerceIn(i15, i6, kotlin.ranges.RangesKt.coerceAtLeast(intValue2, i6));
                    i7 = coerceIn;
                }
                i7 = i6;
            }
            this.getHighSpeedVideoFpsRangesFor.setIntValue(i7);
            final androidx.compose.foundation.layout.Arrangement.Vertical vertical = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state3 = this.getOutputMinFrameDuration;
            final int i16 = i4;
            final kotlin.jvm.internal.Ref.ObjectRef objectRef5 = objectRef2;
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, i7, i4, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1$2$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.WideNavigationRailKt$WideNavigationRailLayout$1.AnonymousClass2.$r8$lambda$6hkddh4HdTQbBfRWgazqEvLoXig(i16, measureScope, objectRef5, arrayList, vertical, state3, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
                }
            }, 4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ kotlin.Unit $r8$lambda$6hkddh4HdTQbBfRWgazqEvLoXig(int i, androidx.compose.ui.layout.MeasureScope measureScope, kotlin.jvm.internal.Ref.ObjectRef objectRef, java.util.List list, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.runtime.State state, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
            float f;
            int i2;
            float m8615unboximpl;
            float f2;
            f = androidx.compose.material3.WideNavigationRailKt.getOutputMinFrameDurationlomOqCM;
            int i3 = i - measureScope.mo1412roundToPx0680j_4(f);
            if (objectRef.element == 0 || ((androidx.compose.ui.layout.Placeable) objectRef.element).getHeight() <= 0) {
                i2 = 0;
            } else {
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) objectRef.element, 0, 0, 0.0f, 4, null);
                int height = ((androidx.compose.ui.layout.Placeable) objectRef.element).getHeight();
                f2 = androidx.compose.material3.WideNavigationRailKt.getOutputStallDuration;
                i2 = height + measureScope.mo1412roundToPx0680j_4(f2);
            }
            if (list != null) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(vertical, androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter())) {
                    i3 -= i2;
                }
                int[] iArr = new int[list.size()];
                java.util.List list2 = list;
                int size = list2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    iArr[i4] = ((androidx.compose.ui.layout.Placeable) list.get(i4)).getHeight();
                    if (i4 < list.size() - 1) {
                        int i5 = iArr[i4];
                        m8615unboximpl = ((androidx.compose.ui.unit.Dp) state.getValue()).m8615unboximpl();
                        iArr[i4] = i5 + measureScope.mo1412roundToPx0680j_4(m8615unboximpl);
                    }
                }
                int[] iArr2 = new int[list.size()];
                vertical.arrange(measureScope, i3, iArr, iArr2);
                if (kotlin.jvm.internal.Intrinsics.areEqual(vertical, androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter())) {
                    i2 = 0;
                }
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, (androidx.compose.ui.layout.Placeable) list.get(i6), 0, iArr2[i6] + i2, 0.0f, 4, null);
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    WideNavigationRailKt$WideNavigationRailLayout$1(androidx.compose.foundation.layout.WindowInsets windowInsets, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, boolean z, androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state, float f, androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state2, androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state3, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableIntState mutableIntState2, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.runtime.State<androidx.compose.ui.unit.Dp> state4, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22) {
        this.getOutputStallDuration = windowInsets;
        this.getInputFormats = function2;
        this.Camera2StreamConfigurationMap = z;
        this.getOutputFormats = state;
        this.getOutputMinFrameDuration = f;
        this.getHighSpeedVideoSizesFor = state2;
        this.getOutputStallDurationlomOqCM = state3;
        this.getHighSpeedVideoSizes = mutableIntState;
        this.getHighSpeedVideoFpsRanges = mutableIntState2;
        this.getHighResolutionOutputSizeshNQ4ISI = vertical;
        this.getInputSizeshNQ4ISI = state4;
        this.getHighSpeedVideoFpsRangesFor = function22;
    }
}
