package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u0005X\u008a\u008e\u0002"}, d2 = {"Pagination", "", "modifier", "Landroidx/compose/ui/Modifier;", "dotCount", "", "activeIndex", "(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;II)V", "InactiveDotScale", "", "PaginationPreview", "(Landroidx/compose/runtime/Composer;I)V", "pds_release", "displayActiveIndex"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaginationKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Pagination(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        androidx.compose.ui.Modifier modifier2;
        int i5;
        int i6;
        int i7;
        int i8;
        androidx.compose.ui.Modifier.Companion companion;
        int i9;
        final int i10;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i11;
        long j;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-611234744);
        int i12 = i4 & 1;
        if (i12 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        int i13 = i4 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 = i;
            i5 |= startRestartGroup.changed(i6) ? 32 : 16;
            i7 = i4 & 4;
            if (i7 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                i8 = i2;
                i5 |= startRestartGroup.changed(i8) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    i9 = i6;
                    i10 = i8;
                } else {
                    companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    i9 = i13 != 0 ? 3 : i6;
                    if (i7 != 0) {
                        i8 = 0;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-611234744, i5, -1, "com.paypal.pds.components.Pagination (Pagination.kt:60)");
                    }
                    long value = com.paypal.pds.core.Color.BackgroundUtilitySelected.INSTANCE.getValue(startRestartGroup, 6);
                    long value2 = com.paypal.pds.core.Color.BackgroundUtilityUnselected.INSTANCE.getValue(startRestartGroup, 6);
                    androidx.compose.animation.core.Easing easingStandardIn = com.paypal.pds.core.MotionEasingKt.easingStandardIn(startRestartGroup, 0);
                    androidx.compose.animation.core.Easing easingStandardOut = com.paypal.pds.core.MotionEasingKt.easingStandardOut(startRestartGroup, 0);
                    int coerceIn = kotlin.ranges.RangesKt.coerceIn(i8, 0, kotlin.ranges.RangesKt.coerceAtLeast(i9 - 1, 0));
                    int i14 = i5 & 112;
                    boolean z = i14 == 32;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(coerceIn);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue;
                    boolean z2 = i14 == 32;
                    java.util.ArrayList rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(i9);
                        int i15 = 0;
                        while (i15 < i9) {
                            arrayList.add(androidx.compose.animation.core.AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null));
                            i15++;
                            i8 = i8;
                            value2 = value2;
                        }
                        i11 = i8;
                        j = value2;
                        rememberedValue2 = arrayList;
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    } else {
                        i11 = i8;
                        j = value2;
                    }
                    final java.util.List list = (java.util.List) rememberedValue2;
                    boolean changed = startRestartGroup.changed(mutableIntState);
                    boolean changed2 = startRestartGroup.changed(coerceIn);
                    boolean changedInstance = startRestartGroup.changedInstance(list);
                    boolean changed3 = startRestartGroup.changed(150);
                    boolean changed4 = startRestartGroup.changed(easingStandardOut);
                    boolean changed5 = startRestartGroup.changed(easingStandardIn);
                    long j2 = value;
                    com.paypal.pds.components.PaginationKt$Pagination$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changed | changed2 | changedInstance | changed3 | changed4 | changed5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new com.paypal.pds.components.PaginationKt$Pagination$1$1(coerceIn, list, 150, easingStandardOut, easingStandardIn, mutableIntState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Integer.valueOf(coerceIn), java.lang.Integer.valueOf(i9), (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, i14);
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(companion), "paginationContainer");
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 6);
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(716713935);
                    final int i16 = 0;
                    while (i16 < i9) {
                        androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8());
                        boolean changedInstance2 = startRestartGroup.changedInstance(list);
                        boolean changed6 = startRestartGroup.changed(i16);
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if ((changedInstance2 | changed6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PaginationKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.pds.components.PaginationKt.m21972$r8$lambda$AUUhGU2lyp0uSpiKce1YSeooE(list, i16, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(m1740size3ABfNKs, (kotlin.jvm.functions.Function1) rememberedValue4), "paginationDot-".concat(java.lang.String.valueOf(i16)));
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PaginationKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.pds.components.PaginationKt.m21974$r8$lambda$cP_K1OdXk2IDz5BdkpU12oarzQ((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        androidx.compose.ui.Modifier clearAndSetSemantics = androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics(testTag2, (kotlin.jvm.functions.Function1) rememberedValue5);
                        boolean changed7 = startRestartGroup.changed(i16);
                        boolean changed8 = startRestartGroup.changed(mutableIntState);
                        final long j3 = j2;
                        boolean changed9 = startRestartGroup.changed(j3);
                        final long j4 = j;
                        boolean changed10 = startRestartGroup.changed(j4);
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if ((changed7 | changed8 | changed9 | changed10) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final int i17 = i16;
                            rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PaginationKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.pds.components.PaginationKt.$r8$lambda$yMMxml2UlIwRkM4IJw6gY1WeEx0(i17, j3, j4, mutableIntState, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        androidx.compose.foundation.CanvasKt.Canvas(clearAndSetSemantics, (kotlin.jvm.functions.Function1) rememberedValue6, startRestartGroup, 0);
                        i16++;
                        j2 = j3;
                        j = j4;
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    i10 = i11;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final int i18 = i9;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.PaginationKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.pds.components.PaginationKt.m21973$r8$lambda$SakYrfytzrr64CmTHuC0gltT8(androidx.compose.ui.Modifier.this, i18, i10, i3, i4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i8 = i2;
            if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i;
        i7 = i4 & 4;
        if (i7 == 0) {
        }
        i8 = i2;
        if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$AUU-hGU2lyp0uSpiK-ce1YSeooE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21972$r8$lambda$AUUhGU2lyp0uSpiKce1YSeooE(java.util.List list, int i, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        float floatValue = ((java.lang.Number) ((androidx.compose.animation.core.Animatable) list.get(i)).getValue()).floatValue();
        graphicsLayerScope.setScaleX(floatValue);
        graphicsLayerScope.setScaleY(floatValue);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$SakYrfytzrr64CmTHu-C0gl-tT8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21973$r8$lambda$SakYrfytzrr64CmTHuC0gltT8(androidx.compose.ui.Modifier modifier, int i, int i2, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        Pagination(modifier, i, i2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$cP_K1OdXk2I-Dz5BdkpU12oarzQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21974$r8$lambda$cP_K1OdXk2IDz5BdkpU12oarzQ(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tnNqdVR0u79LYvKCeyNsFH8q6rM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(710932787);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(710932787, updateChangedFlags, -1, "com.paypal.pds.components.PaginationPreview (Pagination.kt:136)");
            }
            Pagination(null, 5, 2, startRestartGroup, 432, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.PaginationKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.PaginationKt.$r8$lambda$tnNqdVR0u79LYvKCeyNsFH8q6rM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yMMxml2UlIwRkM4IJw6gY1WeEx0(int i, long j, long j2, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.drawscope.DrawScope.m6513drawCircleVaOC9Bg$default(drawScope, i != mutableIntState.getIntValue() ? j2 : j, androidx.compose.ui.geometry.Size.m5820getMinDimensionimpl(drawScope.mo6531getSizeNHjbRc()) / 2.0f, 0L, 0.0f, null, null, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        return kotlin.Unit.INSTANCE;
    }
}
