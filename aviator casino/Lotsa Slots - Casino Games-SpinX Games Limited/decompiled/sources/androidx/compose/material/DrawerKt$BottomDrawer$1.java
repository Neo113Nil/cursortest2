package androidx.compose.material;

/* compiled from: Drawer.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class DrawerKt$BottomDrawer$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> $content;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ androidx.compose.ui.graphics.Shape $drawerShape;
    final /* synthetic */ androidx.compose.material.BottomDrawerState $drawerState;
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope $scope;
    final /* synthetic */ long $scrimColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DrawerKt$BottomDrawer$1(boolean z, androidx.compose.material.BottomDrawerState bottomDrawerState, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, int i, long j, androidx.compose.ui.graphics.Shape shape, long j2, long j3, float f, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        super(3);
        this.$gesturesEnabled = z;
        this.$drawerState = bottomDrawerState;
        this.$content = function2;
        this.$$dirty = i;
        this.$scrimColor = j;
        this.$drawerShape = shape;
        this.$drawerBackgroundColor = j2;
        this.$drawerContentColor = j3;
        this.$drawerElevation = f;
        this.$scope = coroutineScope;
        this.$drawerContent = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope boxWithConstraintsScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.foundation.layout.BoxWithConstraintsScope BoxWithConstraints, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        java.util.Map mapOf;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Modifier m1521swipeablepPrIpRY;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C512@19019L51,*531@19859L7,553@20546L1672:Drawer.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            float m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(BoxWithConstraints.mo504getConstraintsmsEJaDk());
            java.lang.Object valueOf = java.lang.Float.valueOf(m4423getMaxHeightimpl);
            composer.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(valueOf);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Float.valueOf(m4423getMaxHeightimpl), null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            boolean z = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(BoxWithConstraints.mo504getConstraintsmsEJaDk()) > androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(BoxWithConstraints.mo504getConstraintsmsEJaDk());
            float f = 0.5f * m4423getMaxHeightimpl;
            float max = java.lang.Math.max(0.0f, m4423getMaxHeightimpl - m1370invoke$lambda1(mutableState));
            if (m1370invoke$lambda1(mutableState) < f || z) {
                mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(m4423getMaxHeightimpl), androidx.compose.material.BottomDrawerValue.Closed), kotlin.TuplesKt.to(java.lang.Float.valueOf(max), androidx.compose.material.BottomDrawerValue.Expanded));
            } else {
                mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(java.lang.Float.valueOf(m4423getMaxHeightimpl), androidx.compose.material.BottomDrawerValue.Closed), kotlin.TuplesKt.to(java.lang.Float.valueOf(f), androidx.compose.material.BottomDrawerValue.Open), kotlin.TuplesKt.to(java.lang.Float.valueOf(max), androidx.compose.material.BottomDrawerValue.Expanded));
            }
            java.util.Map map = mapOf;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = composer.consume(localDensity);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
            androidx.compose.ui.Modifier m621sizeInqDBjuR0$default = androidx.compose.foundation.layout.SizeKt.m621sizeInqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, density.mo312toDpu2uoSUM(androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(BoxWithConstraints.mo504getConstraintsmsEJaDk())), density.mo312toDpu2uoSUM(androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(BoxWithConstraints.mo504getConstraintsmsEJaDk())), 3, null);
            if (this.$gesturesEnabled) {
                companion = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(androidx.compose.ui.Modifier.INSTANCE, this.$drawerState.getNestedScrollConnection(), null, 2, null);
            } else {
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            m1521swipeablepPrIpRY = androidx.compose.material.SwipeableKt.m1521swipeablepPrIpRY(androidx.compose.ui.Modifier.INSTANCE.then(companion), this.$drawerState, map, androidx.compose.foundation.gestures.Orientation.Vertical, (r26 & 8) != 0 ? true : this.$gesturesEnabled, (r26 & 16) != 0 ? false : false, (r26 & 32) != 0 ? null : null, (r26 & 64) != 0 ? new kotlin.jvm.functions.Function2<T, T, androidx.compose.material.FixedThreshold>() { // from class: androidx.compose.material.SwipeableKt$swipeable$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function2
                public final androidx.compose.material.FixedThreshold invoke(T t, T t2) {
                    return new androidx.compose.material.FixedThreshold(androidx.compose.ui.unit.Dp.m4478constructorimpl(56), null);
                }
            } : null, (r26 & 128) != 0 ? androidx.compose.material.SwipeableDefaults.resistanceConfig$default(androidx.compose.material.SwipeableDefaults.INSTANCE, map.keySet(), 0.0f, 0.0f, 6, null) : null, (r26 & 256) != 0 ? androidx.compose.material.SwipeableDefaults.INSTANCE.m1520getVelocityThresholdD9Ej5fM() : 0.0f);
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.$content;
            final int i3 = this.$$dirty;
            long j = this.$scrimColor;
            final androidx.compose.material.BottomDrawerState bottomDrawerState = this.$drawerState;
            androidx.compose.ui.graphics.Shape shape = this.$drawerShape;
            long j2 = this.$drawerBackgroundColor;
            long j3 = this.$drawerContentColor;
            float f2 = this.$drawerElevation;
            final boolean z2 = this.$gesturesEnabled;
            final kotlinx.coroutines.CoroutineScope coroutineScope = this.$scope;
            final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = this.$drawerContent;
            composer.startReplaceableGroup(733328855);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(Box)P(2,1,3)70@3267L67,71@3339L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = composer.consume(localDensity2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume2;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3 = composer.consume(localLayoutDirection);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume3;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume4 = composer.consume(localViewConfiguration);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume4;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(m1521swipeablepPrIpRY);
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(-2137368960);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C72@3384L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            composer.startReplaceableGroup(-1660053078);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C554@20575L9,555@20597L427,566@21058L33,569@21175L63,570@21281L105,567@21104L1104:Drawer.kt#jmzs0o");
            function2.invoke(composer, java.lang.Integer.valueOf((i3 >> 27) & 14));
            androidx.compose.material.DrawerKt.m1362BottomDrawerScrim3JVO9M(j, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (z2 && bottomDrawerState.getConfirmStateChange$material_release().invoke(androidx.compose.material.BottomDrawerValue.Closed).booleanValue()) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material.DrawerKt$BottomDrawer$1$1$1.AnonymousClass1(bottomDrawerState, null), 3, null);
                    }
                }

                /* compiled from: Drawer.kt */
                @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1", f = "Drawer.kt", i = {}, l = {562}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ androidx.compose.material.BottomDrawerState $drawerState;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(androidx.compose.material.BottomDrawerState bottomDrawerState, kotlin.coroutines.Continuation<? super androidx.compose.material.DrawerKt$BottomDrawer$1$1$1.AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.$drawerState = bottomDrawerState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.compose.material.DrawerKt$BottomDrawer$1$1$1.AnonymousClass1(this.$drawerState, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.compose.material.DrawerKt$BottomDrawer$1$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.label = 1;
                            if (this.$drawerState.close(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
            }, bottomDrawerState.getTargetValue() != androidx.compose.material.BottomDrawerValue.Closed, composer, (i3 >> 24) & 14);
            final java.lang.String m1509getString4foXLRw = androidx.compose.material.Strings_androidKt.m1509getString4foXLRw(androidx.compose.material.Strings.INSTANCE.m1506getNavigationMenuUdPEhr4(), composer, 6);
            composer.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(bottomDrawerState);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.IntOffset>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ androidx.compose.ui.unit.IntOffset invoke(androidx.compose.ui.unit.Density density3) {
                        return androidx.compose.ui.unit.IntOffset.m4601boximpl(m1372invokeBjo55l4(density3));
                    }

                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m1372invokeBjo55l4(androidx.compose.ui.unit.Density offset) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offset, "$this$offset");
                        return androidx.compose.ui.unit.IntOffsetKt.IntOffset(0, kotlin.math.MathKt.roundToInt(androidx.compose.material.BottomDrawerState.this.getOffset().getValue().floatValue()));
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            androidx.compose.ui.Modifier offset = androidx.compose.foundation.layout.OffsetKt.offset(m621sizeInqDBjuR0$default, (kotlin.jvm.functions.Function1) rememberedValue2);
            composer.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed3 = composer.changed(mutableState);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, kotlin.Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
                        invoke2(layoutCoordinates);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.layout.LayoutCoordinates position) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "position");
                        androidx.compose.material.DrawerKt$BottomDrawer$1.m1371invoke$lambda2(mutableState, androidx.compose.ui.unit.IntSize.m4651getHeightimpl(position.mo3409getSizeYbymL2g()));
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            int i4 = i3 >> 12;
            androidx.compose.material.SurfaceKt.m1511SurfaceFjzlyU(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(offset, (kotlin.jvm.functions.Function1) rememberedValue3), false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.setPaneTitle(semantics, m1509getString4foXLRw);
                    if (bottomDrawerState.isOpen()) {
                        final androidx.compose.material.BottomDrawerState bottomDrawerState2 = bottomDrawerState;
                        final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                        androidx.compose.ui.semantics.SemanticsPropertiesKt.dismiss$default(semantics, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Boolean invoke() {
                                if (androidx.compose.material.BottomDrawerState.this.getConfirmStateChange$material_release().invoke(androidx.compose.material.BottomDrawerValue.Closed).booleanValue()) {
                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new androidx.compose.material.DrawerKt$BottomDrawer$1$1$4.AnonymousClass1.C00421(androidx.compose.material.BottomDrawerState.this, null), 3, null);
                                }
                                return true;
                            }

                            /* compiled from: Drawer.kt */
                            @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1", f = "Drawer.kt", i = {}, l = {580}, m = "invokeSuspend", n = {}, s = {})
                            /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$1$1$4$1$1, reason: invalid class name and collision with other inner class name */
                            static final class C00421 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                final /* synthetic */ androidx.compose.material.BottomDrawerState $drawerState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C00421(androidx.compose.material.BottomDrawerState bottomDrawerState, kotlin.coroutines.Continuation<? super androidx.compose.material.DrawerKt$BottomDrawer$1$1$4.AnonymousClass1.C00421> continuation) {
                                    super(2, continuation);
                                    this.$drawerState = bottomDrawerState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                    return new androidx.compose.material.DrawerKt$BottomDrawer$1$1$4.AnonymousClass1.C00421(this.$drawerState, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                    return ((androidx.compose.material.DrawerKt$BottomDrawer$1$1$4.AnonymousClass1.C00421) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        kotlin.ResultKt.throwOnFailure(obj);
                                        this.label = 1;
                                        if (this.$drawerState.close(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        kotlin.ResultKt.throwOnFailure(obj);
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                        }, 1, null);
                    }
                }
            }, 1, null), shape, j2, j3, null, f2, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, 457750254, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawer$1$1$5
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i5) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C589@22163L31:Drawer.kt#jmzs0o");
                    if ((i5 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = function3;
                    int i6 = (i3 << 9) & 7168;
                    composer2.startReplaceableGroup(-483455358);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Column)P(2,3,1)77@3880L61,78@3946L133:Column.kt#2w3rfo");
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity3 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume5 = composer2.consume(localDensity3);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) consume5;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume6 = composer2.consume(localLayoutDirection2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume6;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume7 = composer2.consume(localViewConfiguration2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) consume7;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(companion2);
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, density3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(-1163856341);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C79@3994L9:Column.kt#2w3rfo");
                    function32.invoke(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, composer2, java.lang.Integer.valueOf(((i6 >> 6) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
            }), composer, ((i3 >> 9) & 112) | 1572864 | (i4 & 896) | (i4 & 7168) | (458752 & i3), 16);
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            return;
        }
        composer.skipToGroupEnd();
    }

    /* renamed from: invoke$lambda-1, reason: not valid java name */
    private static final float m1370invoke$lambda1(androidx.compose.runtime.MutableState<java.lang.Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-2, reason: not valid java name */
    public static final void m1371invoke$lambda2(androidx.compose.runtime.MutableState<java.lang.Float> mutableState, float f) {
        mutableState.setValue(java.lang.Float.valueOf(f));
    }
}
