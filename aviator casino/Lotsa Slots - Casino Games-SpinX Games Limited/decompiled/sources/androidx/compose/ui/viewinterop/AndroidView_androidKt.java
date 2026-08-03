package androidx.compose.ui.viewinterop;

/* compiled from: AndroidView.android.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ay\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00030\u00012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010\u0010\u001aK\u0010\u0007\u001a\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\"\b\b\u0000\u0010\b*\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\b0\u0017\"\b\b\u0000\u0010\b*\u00020\u0002*\u00020\u0014H\u0002\u001a^\u0010\u0018\u001a\u00020\u0003\"\b\b\u0000\u0010\b*\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002ø\u0001\u0000¢\u0006\u0004\b&\u0010'\"\"\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"NoOpUpdate", "Lkotlin/Function1;", "Landroid/view/View;", "", "Lkotlin/ExtensionFunctionType;", "getNoOpUpdate", "()Lkotlin/jvm/functions/Function1;", "AndroidView", "T", "factory", "Landroid/content/Context;", "modifier", "Landroidx/compose/ui/Modifier;", "onReset", "onRelease", "update", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "createAndroidViewNodeFactory", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "requireViewFactoryHolder", "Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "updateViewHolderParams", "Landroidx/compose/runtime/Updater;", "compositeKeyHash", "", "density", "Landroidx/compose/ui/unit/Density;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "compositionLocalMap", "Landroidx/compose/runtime/CompositionLocalMap;", "updateViewHolderParams-6NefGtU", "(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;ILandroidx/compose/ui/unit/Density;Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/runtime/CompositionLocalMap;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidView_androidKt {
    private static final kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> NoOpUpdate = new kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(android.view.View view) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(android.view.View view) {
            invoke2(view);
            return kotlin.Unit.INSTANCE;
        }
    };

    public static final <T extends android.view.View> void AndroidView(final kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> function1, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1783766393);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AndroidView)107@5478L130:AndroidView.android.kt#z33iqn");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                function12 = NoOpUpdate;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1783766393, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:106)");
            }
            AndroidView(function1, modifier, null, NoOpUpdate, function12, startRestartGroup, (i3 & 14) | 3072 | (i3 & 112) | ((i3 << 6) & 57344), 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function13 = function12;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$1
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                    androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function1, modifier2, function13, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends android.view.View> void AndroidView(final kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> function1, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function14, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function15;
        int i5;
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function16;
        int i6;
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function17;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-180024211);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AndroidView)P(!2,3)211@11894L23,213@12018L7,214@12073L7,221@12529L7,222@12600L7:AndroidView.android.kt#z33iqn");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function15 = function12;
                i3 |= startRestartGroup.changedInstance(function15) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    function16 = function13;
                    i3 |= startRestartGroup.changedInstance(function16) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        function17 = function14;
                        i3 |= startRestartGroup.changedInstance(function17) ? 16384 : 8192;
                        if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                            companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                function15 = null;
                            }
                            if (i5 != 0) {
                                function16 = NoOpUpdate;
                            }
                            if (i6 != 0) {
                                function17 = NoOpUpdate;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-180024211, i3, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:210)");
                            }
                            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume = startRestartGroup.consume(localDensity);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume3 = startRestartGroup.consume(localLifecycleOwner);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            androidx.lifecycle.LifecycleOwner lifecycleOwner = (androidx.lifecycle.LifecycleOwner) consume3;
                            androidx.compose.runtime.ProvidableCompositionLocal<androidx.savedstate.SavedStateRegistryOwner> localSavedStateRegistryOwner = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            java.lang.Object consume4 = startRestartGroup.consume(localSavedStateRegistryOwner);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner = (androidx.savedstate.SavedStateRegistryOwner) consume4;
                            if (function15 != null) {
                                startRestartGroup.startReplaceableGroup(-88753355);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "226@12710L37,225@12644L843");
                                final kotlin.jvm.functions.Function0<androidx.compose.ui.node.LayoutNode> createAndroidViewNodeFactory = createAndroidViewNodeFactory(function1, startRestartGroup, i3 & 14);
                                startRestartGroup.startReplaceableGroup(1405779621);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof androidx.compose.ui.node.UiApplier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(new kotlin.jvm.functions.Function0<androidx.compose.ui.node.LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ReusableComposeNode$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final androidx.compose.ui.node.LayoutNode invoke() {
                                            return kotlin.jvm.functions.Function0.this.invoke();
                                        }
                                    });
                                } else {
                                    startRestartGroup.useNode();
                                }
                                androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                                m4729updateViewHolderParams6NefGtU(m1641constructorimpl, materializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, function15, new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, kotlin.jvm.functions.Function1<? super T, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, java.lang.Object obj) {
                                        invoke(layoutNode, (kotlin.jvm.functions.Function1) obj);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.ui.node.LayoutNode layoutNode, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function18) {
                                        androidx.compose.ui.viewinterop.ViewFactoryHolder requireViewFactoryHolder;
                                        requireViewFactoryHolder = androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                                        requireViewFactoryHolder.setResetBlock(function18);
                                    }
                                });
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, function17, new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, kotlin.jvm.functions.Function1<? super T, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, java.lang.Object obj) {
                                        invoke(layoutNode, (kotlin.jvm.functions.Function1) obj);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.ui.node.LayoutNode layoutNode, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function18) {
                                        androidx.compose.ui.viewinterop.ViewFactoryHolder requireViewFactoryHolder;
                                        requireViewFactoryHolder = androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                                        requireViewFactoryHolder.setUpdateBlock(function18);
                                    }
                                });
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, function16, new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, kotlin.jvm.functions.Function1<? super T, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, java.lang.Object obj) {
                                        invoke(layoutNode, (kotlin.jvm.functions.Function1) obj);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.ui.node.LayoutNode layoutNode, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function18) {
                                        androidx.compose.ui.viewinterop.ViewFactoryHolder requireViewFactoryHolder;
                                        requireViewFactoryHolder = androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                                        requireViewFactoryHolder.setReleaseBlock(function18);
                                    }
                                });
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                            } else {
                                startRestartGroup.startReplaceableGroup(-88752490);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "244@13567L37,243@13509L756");
                                final kotlin.jvm.functions.Function0<androidx.compose.ui.node.LayoutNode> createAndroidViewNodeFactory2 = createAndroidViewNodeFactory(function1, startRestartGroup, i3 & 14);
                                startRestartGroup.startReplaceableGroup(1886828752);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ComposeNode):Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof androidx.compose.ui.node.UiApplier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(new kotlin.jvm.functions.Function0<androidx.compose.ui.node.LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$$inlined$ComposeNode$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final androidx.compose.ui.node.LayoutNode invoke() {
                                            return kotlin.jvm.functions.Function0.this.invoke();
                                        }
                                    });
                                } else {
                                    startRestartGroup.useNode();
                                }
                                androidx.compose.runtime.Composer m1641constructorimpl2 = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                                m4729updateViewHolderParams6NefGtU(m1641constructorimpl2, materializeModifier, currentCompositeKeyHash, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalMap);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, function17, new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, kotlin.jvm.functions.Function1<? super T, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, java.lang.Object obj) {
                                        invoke(layoutNode, (kotlin.jvm.functions.Function1) obj);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.ui.node.LayoutNode layoutNode, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function18) {
                                        androidx.compose.ui.viewinterop.ViewFactoryHolder requireViewFactoryHolder;
                                        requireViewFactoryHolder = androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                                        requireViewFactoryHolder.setUpdateBlock(function18);
                                    }
                                });
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl2, function16, new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, kotlin.jvm.functions.Function1<? super T, ? extends kotlin.Unit>, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, java.lang.Object obj) {
                                        invoke(layoutNode, (kotlin.jvm.functions.Function1) obj);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.ui.node.LayoutNode layoutNode, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function18) {
                                        androidx.compose.ui.viewinterop.ViewFactoryHolder requireViewFactoryHolder;
                                        requireViewFactoryHolder = androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                                        requireViewFactoryHolder.setReleaseBlock(function18);
                                    }
                                });
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                        }
                        final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function18 = function15;
                        final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function19 = function17;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function110 = function16;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
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

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i8) {
                                    androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function1, modifier3, function18, function110, function19, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function17 = function14;
                    if ((46811 & i3) == 9362) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume5 = startRestartGroup.consume(localDensity2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume5;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume22 = startRestartGroup.consume(localLayoutDirection2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) consume22;
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume32 = startRestartGroup.consume(localLifecycleOwner2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.lifecycle.LifecycleOwner lifecycleOwner2 = (androidx.lifecycle.LifecycleOwner) consume32;
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.savedstate.SavedStateRegistryOwner> localSavedStateRegistryOwner2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume42 = startRestartGroup.consume(localSavedStateRegistryOwner2);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner2 = (androidx.savedstate.SavedStateRegistryOwner) consume42;
                    if (function15 != null) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function182 = function15;
                    final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function192 = function17;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function16 = function13;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function17 = function14;
                if ((46811 & i3) == 9362) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int currentCompositeKeyHash22 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume52 = startRestartGroup.consume(localDensity22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.Density density22 = (androidx.compose.ui.unit.Density) consume52;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume222 = startRestartGroup.consume(localLayoutDirection22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.compose.ui.unit.LayoutDirection layoutDirection22 = (androidx.compose.ui.unit.LayoutDirection) consume222;
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner22 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume322 = startRestartGroup.consume(localLifecycleOwner22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.lifecycle.LifecycleOwner lifecycleOwner22 = (androidx.lifecycle.LifecycleOwner) consume322;
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.savedstate.SavedStateRegistryOwner> localSavedStateRegistryOwner22 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume422 = startRestartGroup.consume(localSavedStateRegistryOwner22);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner22 = (androidx.savedstate.SavedStateRegistryOwner) consume422;
                if (function15 != null) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1822 = function15;
                final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1922 = function17;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function15 = function12;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function16 = function13;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function17 = function14;
            if ((46811 & i3) == 9362) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int currentCompositeKeyHash222 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.ui.Modifier materializeModifier222 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume522 = startRestartGroup.consume(localDensity222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density222 = (androidx.compose.ui.unit.Density) consume522;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2222 = startRestartGroup.consume(localLayoutDirection222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection222 = (androidx.compose.ui.unit.LayoutDirection) consume2222;
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner222 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3222 = startRestartGroup.consume(localLifecycleOwner222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.lifecycle.LifecycleOwner lifecycleOwner222 = (androidx.lifecycle.LifecycleOwner) consume3222;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.savedstate.SavedStateRegistryOwner> localSavedStateRegistryOwner222 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume4222 = startRestartGroup.consume(localSavedStateRegistryOwner222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner222 = (androidx.savedstate.SavedStateRegistryOwner) consume4222;
            if (function15 != null) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function18222 = function15;
            final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function19222 = function17;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function15 = function12;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function16 = function13;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function17 = function14;
        if ((46811 & i3) == 9362) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int currentCompositeKeyHash2222 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.ui.Modifier materializeModifier2222 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume5222 = startRestartGroup.consume(localDensity2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density2222 = (androidx.compose.ui.unit.Density) consume5222;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume22222 = startRestartGroup.consume(localLayoutDirection2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.LayoutDirection layoutDirection2222 = (androidx.compose.ui.unit.LayoutDirection) consume22222;
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.lifecycle.LifecycleOwner> localLifecycleOwner2222 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume32222 = startRestartGroup.consume(localLifecycleOwner2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.lifecycle.LifecycleOwner lifecycleOwner2222 = (androidx.lifecycle.LifecycleOwner) consume32222;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.savedstate.SavedStateRegistryOwner> localSavedStateRegistryOwner2222 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume42222 = startRestartGroup.consume(localSavedStateRegistryOwner2222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner2222 = (androidx.savedstate.SavedStateRegistryOwner) consume42222;
        if (function15 != null) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function182222 = function15;
        final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function192222 = function17;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final <T extends android.view.View> kotlin.jvm.functions.Function0<androidx.compose.ui.node.LayoutNode> createAndroidViewNodeFactory(final kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> function1, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(2030558801);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(createAndroidViewNodeFactory)266@14417L23,267@14472L7,268@14506L28,269@14586L7,270@14624L7:AndroidView.android.kt#z33iqn");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2030558801, i, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:265)");
        }
        final int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContext);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        final android.content.Context context = (android.content.Context) consume;
        final androidx.compose.runtime.CompositionContext rememberCompositionContext = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(composer, 0);
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.runtime.saveable.SaveableStateRegistry> localSaveableStateRegistry = androidx.compose.runtime.saveable.SaveableStateRegistryKt.getLocalSaveableStateRegistry();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume2 = composer.consume(localSaveableStateRegistry);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        final androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry = (androidx.compose.runtime.saveable.SaveableStateRegistry) consume2;
        androidx.compose.runtime.ProvidableCompositionLocal<android.view.View> localView = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume3 = composer.consume(localView);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        final android.view.View view = (android.view.View) consume3;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.LayoutNode> function0 = new kotlin.jvm.functions.Function0<androidx.compose.ui.node.LayoutNode>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.ui.node.LayoutNode invoke() {
                android.content.Context context2 = context;
                kotlin.jvm.functions.Function1<android.content.Context, T> function12 = function1;
                androidx.compose.runtime.CompositionContext compositionContext = rememberCompositionContext;
                androidx.compose.runtime.saveable.SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                int i2 = currentCompositeKeyHash;
                android.view.KeyEvent.Callback callback = view;
                kotlin.jvm.internal.Intrinsics.checkNotNull(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
                return new androidx.compose.ui.viewinterop.ViewFactoryHolder(context2, function12, compositionContext, saveableStateRegistry2, i2, (androidx.compose.ui.node.Owner) callback).getLayoutNode();
            }
        };
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function0;
    }

    /* renamed from: updateViewHolderParams-6NefGtU, reason: not valid java name */
    private static final <T extends android.view.View> void m4729updateViewHolderParams6NefGtU(androidx.compose.runtime.Composer composer, androidx.compose.ui.Modifier modifier, int i, androidx.compose.ui.unit.Density density, androidx.lifecycle.LifecycleOwner lifecycleOwner, androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.runtime.CompositionLocalMap compositionLocalMap) {
        androidx.compose.runtime.Updater.m1648setimpl(composer, compositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m1648setimpl(composer, modifier, new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.Modifier, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.Modifier modifier2) {
                invoke2(layoutNode, modifier2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.Modifier modifier2) {
                androidx.compose.ui.viewinterop.ViewFactoryHolder requireViewFactoryHolder;
                requireViewFactoryHolder = androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                requireViewFactoryHolder.setModifier(modifier2);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(composer, density, new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.unit.Density, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.unit.Density density2) {
                invoke2(layoutNode, density2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.unit.Density density2) {
                androidx.compose.ui.viewinterop.ViewFactoryHolder requireViewFactoryHolder;
                requireViewFactoryHolder = androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                requireViewFactoryHolder.setDensity(density2);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(composer, lifecycleOwner, new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.lifecycle.LifecycleOwner, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, androidx.lifecycle.LifecycleOwner lifecycleOwner2) {
                invoke2(layoutNode, lifecycleOwner2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.LayoutNode layoutNode, androidx.lifecycle.LifecycleOwner lifecycleOwner2) {
                androidx.compose.ui.viewinterop.ViewFactoryHolder requireViewFactoryHolder;
                requireViewFactoryHolder = androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                requireViewFactoryHolder.setLifecycleOwner(lifecycleOwner2);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(composer, savedStateRegistryOwner, new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.savedstate.SavedStateRegistryOwner, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$4
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner2) {
                invoke2(layoutNode, savedStateRegistryOwner2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.LayoutNode layoutNode, androidx.savedstate.SavedStateRegistryOwner savedStateRegistryOwner2) {
                androidx.compose.ui.viewinterop.ViewFactoryHolder requireViewFactoryHolder;
                requireViewFactoryHolder = androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                requireViewFactoryHolder.setSavedStateRegistryOwner(savedStateRegistryOwner2);
            }
        });
        androidx.compose.runtime.Updater.m1648setimpl(composer, layoutDirection, new kotlin.jvm.functions.Function2<androidx.compose.ui.node.LayoutNode, androidx.compose.ui.unit.LayoutDirection, kotlin.Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5

            /* compiled from: AndroidView.android.kt */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[androidx.compose.ui.unit.LayoutDirection.values().length];
                    try {
                        iArr[androidx.compose.ui.unit.LayoutDirection.Ltr.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    try {
                        iArr[androidx.compose.ui.unit.LayoutDirection.Rtl.ordinal()] = 2;
                    } catch (java.lang.NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.unit.LayoutDirection layoutDirection2) {
                invoke2(layoutNode, layoutDirection2);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.node.LayoutNode layoutNode, androidx.compose.ui.unit.LayoutDirection layoutDirection2) {
                androidx.compose.ui.viewinterop.ViewFactoryHolder requireViewFactoryHolder;
                requireViewFactoryHolder = androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
                int i2 = androidx.compose.ui.viewinterop.AndroidView_androidKt$updateViewHolderParams$5.WhenMappings.$EnumSwitchMapping$0[layoutDirection2.ordinal()];
                int i3 = 1;
                if (i2 == 1) {
                    i3 = 0;
                } else if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                requireViewFactoryHolder.setLayoutDirection(i3);
            }
        });
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composer.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer.rememberedValue(), java.lang.Integer.valueOf(i))) {
            composer.updateRememberedValue(java.lang.Integer.valueOf(i));
            composer.apply(java.lang.Integer.valueOf(i), setCompositeKeyHash);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends android.view.View> androidx.compose.ui.viewinterop.ViewFactoryHolder<T> requireViewFactoryHolder(androidx.compose.ui.node.LayoutNode layoutNode) {
        androidx.compose.ui.viewinterop.AndroidViewHolder interopViewFactoryHolder = layoutNode.getInteropViewFactoryHolder();
        if (interopViewFactoryHolder == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(interopViewFactoryHolder, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
        return (androidx.compose.ui.viewinterop.ViewFactoryHolder) interopViewFactoryHolder;
    }

    public static final kotlin.jvm.functions.Function1<android.view.View, kotlin.Unit> getNoOpUpdate() {
        return NoOpUpdate;
    }
}
