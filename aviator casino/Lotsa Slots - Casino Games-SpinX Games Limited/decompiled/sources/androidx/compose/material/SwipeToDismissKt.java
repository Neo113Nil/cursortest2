package androidx.compose.material;

/* compiled from: SwipeToDismiss.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000f2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000e¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001a\u001a\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u001a-\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00142\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00190\nH\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"SwipeToDismiss", "", "state", "Landroidx/compose/material/DismissState;", "modifier", "Landroidx/compose/ui/Modifier;", "directions", "", "Landroidx/compose/material/DismissDirection;", "dismissThresholds", "Lkotlin/Function1;", "Landroidx/compose/material/ThresholdConfig;", com.helpshift.proactive.InAppViewConstants.BACKGROUND, "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "dismissContent", "(Landroidx/compose/material/DismissState;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "getDismissDirection", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "Landroidx/compose/material/DismissValue;", "to", "rememberDismissState", "initialValue", "confirmStateChange", "", "(Landroidx/compose/material/DismissValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/DismissState;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissKt {
    @androidx.compose.material.ExperimentalMaterialApi
    public static final androidx.compose.material.DismissState rememberDismissState(final androidx.compose.material.DismissValue dismissValue, final kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissValue, java.lang.Boolean> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1753522702);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberDismissState)P(1)151@5327L127:SwipeToDismiss.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            dismissValue = androidx.compose.material.DismissValue.Default;
        }
        if ((i2 & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<androidx.compose.material.DismissValue, java.lang.Boolean>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(androidx.compose.material.DismissValue it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return true;
                }
            };
        }
        androidx.compose.material.DismissState dismissState = (androidx.compose.material.DismissState) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(new java.lang.Object[0], (androidx.compose.runtime.saveable.Saver) androidx.compose.material.DismissState.INSTANCE.Saver(function1), (java.lang.String) null, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.material.DismissState>() { // from class: androidx.compose.material.SwipeToDismissKt$rememberDismissState$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.material.DismissState invoke() {
                return new androidx.compose.material.DismissState(androidx.compose.material.DismissValue.this, function1);
            }
        }, composer, 72, 4);
        composer.endReplaceableGroup();
        return dismissState;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0067  */
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipeToDismiss(final androidx.compose.material.DismissState state, androidx.compose.ui.Modifier modifier, java.util.Set<? extends androidx.compose.material.DismissDirection> set, kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function1, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> background, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> dismissContent, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function12;
        int i6;
        java.util.Set<? extends androidx.compose.material.DismissDirection> set2;
        androidx.compose.ui.Modifier modifier3;
        java.util.Set<? extends androidx.compose.material.DismissDirection> set3;
        int i7;
        kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function13;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier4;
        final java.util.Set<? extends androidx.compose.material.DismissDirection> set4;
        final kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(background, "background");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dismissContent, "dismissContent");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(634380143);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SwipeToDismiss)P(5,4,1,3)178@6527L1407:SwipeToDismiss.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changed(function12) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(background) ? 16384 : 8192;
                }
                if ((i2 & 32) == 0) {
                    if ((458752 & i) == 0) {
                        i6 = startRestartGroup.changed(dismissContent) ? 131072 : 65536;
                    }
                    if (i4 == 4 || (374491 & i3) != 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i4 == 0) {
                                set2 = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new androidx.compose.material.DismissDirection[]{androidx.compose.material.DismissDirection.EndToStart, androidx.compose.material.DismissDirection.StartToEnd});
                                i3 &= -897;
                            } else {
                                set2 = set;
                            }
                            if (i5 == 0) {
                                i7 = i3;
                                modifier3 = companion;
                                set3 = set2;
                                function13 = new kotlin.jvm.functions.Function1<androidx.compose.material.DismissDirection, androidx.compose.material.FractionalThreshold>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final androidx.compose.material.FractionalThreshold invoke(androidx.compose.material.DismissDirection it) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                        return new androidx.compose.material.FractionalThreshold(0.5f);
                                    }
                                };
                                startRestartGroup.endDefaults();
                                final java.util.Set<? extends androidx.compose.material.DismissDirection> set5 = set3;
                                final kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function15 = function13;
                                final int i9 = i7;
                                composer2 = startRestartGroup;
                                androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 338007641, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                        invoke(boxWithConstraintsScope, composer3, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope BoxWithConstraints, androidx.compose.runtime.Composer composer3, int i10) {
                                        int i11;
                                        androidx.compose.ui.Modifier m1521swipeablepPrIpRY;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C180@6642L7,186@6883L106,193@7214L718:SwipeToDismiss.kt#jmzs0o");
                                        if ((i10 & 14) == 0) {
                                            i11 = i10 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                        } else {
                                            i11 = i10;
                                        }
                                        if ((i11 & 91) != 18 || !composer3.getSkipping()) {
                                            float m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(BoxWithConstraints.mo504getConstraintsmsEJaDk());
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume = composer3.consume(localLayoutDirection);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                            boolean z = consume == androidx.compose.ui.unit.LayoutDirection.Rtl;
                                            java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(0.0f), androidx.compose.material.DismissValue.Default));
                                            if (set5.contains(androidx.compose.material.DismissDirection.StartToEnd)) {
                                                kotlin.Pair pair = kotlin.TuplesKt.to(java.lang.Float.valueOf(m4424getMaxWidthimpl), androidx.compose.material.DismissValue.DismissedToEnd);
                                                mutableMapOf.put(pair.getFirst(), pair.getSecond());
                                            }
                                            if (set5.contains(androidx.compose.material.DismissDirection.EndToStart)) {
                                                kotlin.Pair pair2 = kotlin.TuplesKt.to(java.lang.Float.valueOf(-m4424getMaxWidthimpl), androidx.compose.material.DismissValue.DismissedToStart);
                                                mutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                                            }
                                            final kotlin.jvm.functions.Function1<androidx.compose.material.DismissDirection, androidx.compose.material.ThresholdConfig> function16 = function15;
                                            composer3.startReplaceableGroup(1157296644);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed = composer3.changed(function16);
                                            java.lang.Object rememberedValue = composer3.rememberedValue();
                                            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.material.DismissValue, androidx.compose.material.DismissValue, androidx.compose.material.ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final androidx.compose.material.ThresholdConfig invoke(androidx.compose.material.DismissValue from, androidx.compose.material.DismissValue to) {
                                                        androidx.compose.material.DismissDirection dismissDirection;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "from");
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(to, "to");
                                                        kotlin.jvm.functions.Function1<androidx.compose.material.DismissDirection, androidx.compose.material.ThresholdConfig> function17 = function16;
                                                        dismissDirection = androidx.compose.material.SwipeToDismissKt.getDismissDirection(from, to);
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(dismissDirection);
                                                        return function17.invoke(dismissDirection);
                                                    }
                                                };
                                                composer3.updateRememberedValue(rememberedValue);
                                            }
                                            composer3.endReplaceableGroup();
                                            m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, state, mutableMapOf, androidx.compose.foundation.gestures.Orientation.Horizontal, (r26 & 8) != 0 ? true : state.getCurrentValue() == androidx.compose.material.DismissValue.Default, (r26 & 16) != 0 ? false : z, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                                    return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                                }
                                            } : (kotlin.jvm.functions.Function2) rememberedValue, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new androidx.compose.material.ResistanceConfig(m4424getMaxWidthimpl, set5.contains(androidx.compose.material.DismissDirection.EndToStart) ? 10.0f : 20.0f, set5.contains(androidx.compose.material.DismissDirection.StartToEnd) ? 10.0f : 20.0f), (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = background;
                                            int i12 = i9;
                                            final androidx.compose.material.DismissState dismissState = state;
                                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = dismissContent;
                                            composer3.startReplaceableGroup(733328855);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                            composer3.startReplaceableGroup(-1323940314);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume2 = composer3.consume(localDensity);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume2;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume3 = composer3.consume(localLayoutDirection2);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume4 = composer3.consume(localViewConfiguration);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m1521swipeablepPrIpRY);
                                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composer3.disableReusing();
                                            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer3.enableReusing();
                                            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            composer3.startReplaceableGroup(-2137368960);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                            composer3.startReplaceableGroup(981834387);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C208@7678L98,214@7867L49,212@7785L141:SwipeToDismiss.kt#jmzs0o");
                                            androidx.compose.ui.Modifier matchParentSize = boxScopeInstance.matchParentSize(androidx.compose.ui.Modifier.INSTANCE);
                                            int i13 = (i12 >> 3) & 7168;
                                            composer3.startReplaceableGroup(693286680);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                                            composer3.startReplaceableGroup(-1323940314);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume5 = composer3.consume(localDensity2);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                            androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume5;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume6 = composer3.consume(localLayoutDirection3);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume6;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume7 = composer3.consume(localViewConfiguration2);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume7;
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(matchParentSize);
                                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor2);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composer3.disableReusing();
                                            androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer3.enableReusing();
                                            materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            composer3.startReplaceableGroup(-678309503);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                            function3.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i13 >> 6) & 112) | 6));
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                            composer3.startReplaceableGroup(1157296644);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed2 = composer3.changed(dismissState);
                                            java.lang.Object rememberedValue2 = composer3.rememberedValue();
                                            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density3) {
                                                        return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1519invokeBjo55l4(density3));
                                                    }

                                                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                                    public final long m1519invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                        return androidx.compose.ui.unit.IntOffsetKt.IntOffset(kotlin.math.MathKt.roundToInt(androidx.compose.material.DismissState.this.getOffset().getValue().floatValue()), 0);
                                                    }
                                                };
                                                composer3.updateRememberedValue(rememberedValue2);
                                            }
                                            composer3.endReplaceableGroup();
                                            androidx.compose.ui.Modifier offset = androidx.compose.foundation.layout.OffsetKt.offset(companion2, (kotlin.jvm.functions.Function1) rememberedValue2);
                                            int i14 = (i12 >> 6) & 7168;
                                            composer3.startReplaceableGroup(693286680);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                                            composer3.startReplaceableGroup(-1323940314);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume8 = composer3.consume(localDensity3);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                            androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) consume8;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume9 = composer3.consume(localLayoutDirection4);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                            androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) consume9;
                                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                            java.lang.Object consume10 = composer3.consume(localViewConfiguration3);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                            androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) consume10;
                                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf3 = androidx.compose.ui.layout.LayoutKt.materializerOf(offset);
                                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                            }
                                            composer3.startReusableNode();
                                            if (composer3.getInserting()) {
                                                composer3.createNode(constructor3);
                                            } else {
                                                composer3.useNode();
                                            }
                                            composer3.disableReusing();
                                            androidx.compose.runtime.Composer m1641constructorimpl3 = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, density3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, layoutDirection3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, viewConfiguration3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                            composer3.enableReusing();
                                            materializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                            composer3.startReplaceableGroup(2058660585);
                                            composer3.startReplaceableGroup(-678309503);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                            function32.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i14 >> 6) & 112) | 6));
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            composer3.endNode();
                                            composer3.endReplaceableGroup();
                                            composer3.endReplaceableGroup();
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), startRestartGroup, ((i7 >> 3) & 14) | 3072, 6);
                                modifier4 = modifier3;
                                set4 = set3;
                                function14 = function13;
                            } else {
                                modifier3 = companion;
                                set3 = set2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if (i4 != 0) {
                                i3 &= -897;
                            }
                            set3 = set;
                            modifier3 = modifier2;
                        }
                        function13 = function12;
                        i7 = i3;
                        startRestartGroup.endDefaults();
                        final java.util.Set<? extends androidx.compose.material.DismissDirection> set52 = set3;
                        final kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function152 = function13;
                        final int i92 = i7;
                        composer2 = startRestartGroup;
                        androidx.compose.foundation.layout.BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 338007641, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                invoke(boxWithConstraintsScope, composer3, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope BoxWithConstraints, androidx.compose.runtime.Composer composer3, int i10) {
                                int i11;
                                androidx.compose.ui.Modifier m1521swipeablepPrIpRY;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C180@6642L7,186@6883L106,193@7214L718:SwipeToDismiss.kt#jmzs0o");
                                if ((i10 & 14) == 0) {
                                    i11 = i10 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 91) != 18 || !composer3.getSkipping()) {
                                    float m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(BoxWithConstraints.mo504getConstraintsmsEJaDk());
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume = composer3.consume(localLayoutDirection);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    boolean z = consume == androidx.compose.ui.unit.LayoutDirection.Rtl;
                                    java.util.Map mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(0.0f), androidx.compose.material.DismissValue.Default));
                                    if (set52.contains(androidx.compose.material.DismissDirection.StartToEnd)) {
                                        kotlin.Pair pair = kotlin.TuplesKt.to(java.lang.Float.valueOf(m4424getMaxWidthimpl), androidx.compose.material.DismissValue.DismissedToEnd);
                                        mutableMapOf.put(pair.getFirst(), pair.getSecond());
                                    }
                                    if (set52.contains(androidx.compose.material.DismissDirection.EndToStart)) {
                                        kotlin.Pair pair2 = kotlin.TuplesKt.to(java.lang.Float.valueOf(-m4424getMaxWidthimpl), androidx.compose.material.DismissValue.DismissedToStart);
                                        mutableMapOf.put(pair2.getFirst(), pair2.getSecond());
                                    }
                                    final kotlin.jvm.functions.Function1<? super androidx.compose.material.DismissDirection, ? extends androidx.compose.material.ThresholdConfig> function16 = function152;
                                    composer3.startReplaceableGroup(1157296644);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed = composer3.changed(function16);
                                    java.lang.Object rememberedValue = composer3.rememberedValue();
                                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.material.DismissValue, androidx.compose.material.DismissValue, androidx.compose.material.ThresholdConfig>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final androidx.compose.material.ThresholdConfig invoke(androidx.compose.material.DismissValue from, androidx.compose.material.DismissValue to) {
                                                androidx.compose.material.DismissDirection dismissDirection;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "from");
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(to, "to");
                                                kotlin.jvm.functions.Function1<androidx.compose.material.DismissDirection, androidx.compose.material.ThresholdConfig> function17 = function16;
                                                dismissDirection = androidx.compose.material.SwipeToDismissKt.getDismissDirection(from, to);
                                                kotlin.jvm.internal.Intrinsics.checkNotNull(dismissDirection);
                                                return function17.invoke(dismissDirection);
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue);
                                    }
                                    composer3.endReplaceableGroup();
                                    m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE, state, mutableMapOf, androidx.compose.foundation.gestures.Orientation.Horizontal, (r26 & 8) != 0 ? true : state.getCurrentValue() == androidx.compose.material.DismissValue.Default, (r26 & 16) != 0 ? false : z, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                                            return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                                        }
                                    } : (kotlin.jvm.functions.Function2) rememberedValue, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, mutableMapOf.keySet(), 0.0f, 0.0f, 6, null) : new androidx.compose.material.ResistanceConfig(m4424getMaxWidthimpl, set52.contains(androidx.compose.material.DismissDirection.EndToStart) ? 10.0f : 20.0f, set52.contains(androidx.compose.material.DismissDirection.StartToEnd) ? 10.0f : 20.0f), (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = background;
                                    int i12 = i92;
                                    final androidx.compose.material.DismissState dismissState = state;
                                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = dismissContent;
                                    composer3.startReplaceableGroup(733328855);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume2 = composer3.consume(localDensity);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume2;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume3 = composer3.consume(localLayoutDirection2);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume4 = composer3.consume(localViewConfiguration);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m1521swipeablepPrIpRY);
                                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-2137368960);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C72@3384L9:Box.kt#2w3rfo");
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceableGroup(981834387);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C208@7678L98,214@7867L49,212@7785L141:SwipeToDismiss.kt#jmzs0o");
                                    androidx.compose.ui.Modifier matchParentSize = boxScopeInstance.matchParentSize(androidx.compose.ui.Modifier.INSTANCE);
                                    int i13 = (i12 >> 3) & 7168;
                                    composer3.startReplaceableGroup(693286680);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume5 = composer3.consume(localDensity2);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume5;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume6 = composer3.consume(localLayoutDirection3);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume6;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume7 = composer3.consume(localViewConfiguration2);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume7;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(matchParentSize);
                                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-678309503);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                    function3.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i13 >> 6) & 112) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                                    composer3.startReplaceableGroup(1157296644);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed2 = composer3.changed(dismissState);
                                    java.lang.Object rememberedValue2 = composer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density3) {
                                                return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1519invokeBjo55l4(density3));
                                            }

                                            /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                                            public final long m1519invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                                                return androidx.compose.ui.unit.IntOffsetKt.IntOffset(kotlin.math.MathKt.roundToInt(androidx.compose.material.DismissState.this.getOffset().getValue().floatValue()), 0);
                                            }
                                        };
                                        composer3.updateRememberedValue(rememberedValue2);
                                    }
                                    composer3.endReplaceableGroup();
                                    androidx.compose.ui.Modifier offset = androidx.compose.foundation.layout.OffsetKt.offset(companion2, (kotlin.jvm.functions.Function1) rememberedValue2);
                                    int i14 = (i12 >> 6) & 7168;
                                    composer3.startReplaceableGroup(693286680);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Row)P(2,1,3)78@3880L58,79@3943L130:Row.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer3, 0);
                                    composer3.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume8 = composer3.consume(localDensity3);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) consume8;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection4 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume9 = composer3.consume(localLayoutDirection4);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) consume9;
                                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                    java.lang.Object consume10 = composer3.consume(localViewConfiguration3);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) consume10;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf3 = androidx.compose.ui.layout.LayoutKt.materializerOf(offset);
                                    if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    composer3.disableReusing();
                                    androidx.compose.runtime.Composer m1641constructorimpl3 = androidx.compose.runtime.Updater.m1641constructorimpl(composer3);
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, density3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, layoutDirection3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl3, viewConfiguration3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                    composer3.enableReusing();
                                    materializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer3)), composer3, 0);
                                    composer3.startReplaceableGroup(2058660585);
                                    composer3.startReplaceableGroup(-678309503);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C80@3988L9:Row.kt#2w3rfo");
                                    function32.invoke(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, composer3, java.lang.Integer.valueOf(((i14 >> 6) & 112) | 6));
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    composer3.endNode();
                                    composer3.endReplaceableGroup();
                                    composer3.endReplaceableGroup();
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), startRestartGroup, ((i7 >> 3) & 14) | 3072, 6);
                        modifier4 = modifier3;
                        set4 = set3;
                        function14 = function13;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        set4 = set;
                        modifier4 = modifier2;
                        function14 = function12;
                        composer2 = startRestartGroup;
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$3
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

                        public final void invoke(androidx.compose.runtime.Composer composer3, int i10) {
                            androidx.compose.material.SwipeToDismissKt.SwipeToDismiss(androidx.compose.material.DismissState.this, modifier4, set4, function14, background, dismissContent, composer3, i | 1, i2);
                        }
                    });
                    return;
                }
                i6 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i6;
                if (i4 == 4) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
            }
            function12 = function1;
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i3 |= i6;
            if (i4 == 4) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function12 = function1;
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i6;
        if (i4 == 4) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material.DismissDirection getDismissDirection(androidx.compose.material.DismissValue dismissValue, androidx.compose.material.DismissValue dismissValue2) {
        if (dismissValue == dismissValue2 && dismissValue == androidx.compose.material.DismissValue.Default) {
            return null;
        }
        if (dismissValue == dismissValue2 && dismissValue == androidx.compose.material.DismissValue.DismissedToEnd) {
            return androidx.compose.material.DismissDirection.StartToEnd;
        }
        if (dismissValue == dismissValue2 && dismissValue == androidx.compose.material.DismissValue.DismissedToStart) {
            return androidx.compose.material.DismissDirection.EndToStart;
        }
        if (dismissValue == androidx.compose.material.DismissValue.Default && dismissValue2 == androidx.compose.material.DismissValue.DismissedToEnd) {
            return androidx.compose.material.DismissDirection.StartToEnd;
        }
        if (dismissValue == androidx.compose.material.DismissValue.Default && dismissValue2 == androidx.compose.material.DismissValue.DismissedToStart) {
            return androidx.compose.material.DismissDirection.EndToStart;
        }
        if (dismissValue == androidx.compose.material.DismissValue.DismissedToEnd && dismissValue2 == androidx.compose.material.DismissValue.Default) {
            return androidx.compose.material.DismissDirection.StartToEnd;
        }
        if (dismissValue == androidx.compose.material.DismissValue.DismissedToStart && dismissValue2 == androidx.compose.material.DismissValue.Default) {
            return androidx.compose.material.DismissDirection.EndToStart;
        }
        return null;
    }
}
