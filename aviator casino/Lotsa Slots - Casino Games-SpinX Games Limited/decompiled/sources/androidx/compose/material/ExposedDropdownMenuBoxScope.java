package androidx.compose.material;

/* compiled from: ExposedDropdownMenu.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JK\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0017¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u0005H&¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@androidx.compose.material.ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface ExposedDropdownMenuBoxScope {
    void ExposedDropdownMenu(boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, int i, int i2);

    androidx.compose.ui.Modifier exposedDropdownSize(androidx.compose.ui.Modifier modifier, boolean z);

    /* compiled from: ExposedDropdownMenu.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ androidx.compose.ui.Modifier exposedDropdownSize$default(androidx.compose.material.ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, androidx.compose.ui.Modifier modifier, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void ExposedDropdownMenu(final androidx.compose.material.ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            androidx.compose.ui.Modifier modifier2;
            androidx.compose.ui.Modifier modifier3;
            java.lang.Object rememberedValue;
            final androidx.compose.animation.core.MutableTransitionState mutableTransitionState;
            java.lang.Object rememberedValue2;
            boolean changed;
            java.lang.Object rememberedValue3;
            androidx.compose.runtime.Composer composer2;
            final androidx.compose.ui.Modifier modifier4;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1165636223);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(ExposedDropdownMenu)P(1,3,2)244@9344L42,248@9546L51,249@9637L7,253@9784L139,257@9937L444:ExposedDropdownMenu.kt#jmzs0o");
            if ((i2 & 1) != 0) {
                i3 = i | 6;
            } else if ((i & 14) == 0) {
                i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i2 & 2) != 0) {
                i3 |= 48;
            } else if ((i & 112) == 0) {
                i3 |= startRestartGroup.changed(onDismissRequest) ? 32 : 16;
            }
            int i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                if ((i2 & 8) == 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 2048 : 1024;
                }
                if ((i2 & 16) == 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= startRestartGroup.changed(exposedDropdownMenuBoxScope) ? 16384 : 8192;
                }
                if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                    modifier3 = i4 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new androidx.compose.animation.core.MutableTransitionState(false);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (androidx.compose.animation.core.MutableTransitionState) rememberedValue;
                    mutableTransitionState.setTargetState(java.lang.Boolean.valueOf(z));
                    if (!((java.lang.Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((java.lang.Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                        startRestartGroup.startReplaceableGroup(-492369756);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.graphics.TransformOrigin.m2499boximpl(androidx.compose.ui.graphics.TransformOrigin.INSTANCE.m2512getCenterSzJe1aQ()), null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceableGroup();
                        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume = startRestartGroup.consume(localDensity);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
                        long m4549getZeroRKDOV3M = androidx.compose.ui.unit.DpOffset.INSTANCE.m4549getZeroRKDOV3M();
                        startRestartGroup.startReplaceableGroup(1157296644);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(mutableState);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntRect intRect, androidx.compose.ui.unit.IntRect intRect2) {
                                    invoke2(intRect, intRect2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.ui.unit.IntRect parentBounds, androidx.compose.ui.unit.IntRect menuBounds) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                                    mutableState.setValue(androidx.compose.ui.graphics.TransformOrigin.m2499boximpl(androidx.compose.material.MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        startRestartGroup.endReplaceableGroup();
                        final androidx.compose.ui.Modifier modifier5 = modifier3;
                        final int i5 = i3;
                        composer2 = startRestartGroup;
                        androidx.compose.material.internal.ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new androidx.compose.material.DropdownMenuPositionProvider(m4549getZeroRKDOV3M, density, (kotlin.jvm.functions.Function2) rememberedValue3, null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -406650841, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
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

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i6) {
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C261@10110L257:ExposedDropdownMenu.kt#jmzs0o");
                                if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                                    androidx.compose.material.MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, androidx.compose.material.ExposedDropdownMenuBoxScope.DefaultImpls.exposedDropdownSize$default(exposedDropdownMenuBoxScope, modifier5, false, 1, null), content, composer3, androidx.compose.animation.core.MutableTransitionState.$stable | 48 | (i5 & 7168), 0);
                                } else {
                                    composer3.skipToGroupEnd();
                                }
                            }
                        }), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
                    } else {
                        composer2 = startRestartGroup;
                    }
                    modifier4 = modifier3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    return;
                }
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
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

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i6) {
                        androidx.compose.material.ExposedDropdownMenuBoxScope.this.ExposedDropdownMenu(z, onDismissRequest, modifier4, content, composer3, i | 1, i2);
                    }
                });
                return;
            }
            modifier2 = modifier;
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            if (i4 == 0) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            mutableTransitionState = (androidx.compose.animation.core.MutableTransitionState) rememberedValue;
            mutableTransitionState.setTargetState(java.lang.Boolean.valueOf(z));
            if (((java.lang.Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localDensity2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) consume2;
            long m4549getZeroRKDOV3M2 = androidx.compose.ui.unit.DpOffset.INSTANCE.m4549getZeroRKDOV3M();
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(mutableState2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$popupPositionProvider$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.unit.IntRect intRect, androidx.compose.ui.unit.IntRect intRect2) {
                    invoke2(intRect, intRect2);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.unit.IntRect parentBounds, androidx.compose.ui.unit.IntRect menuBounds) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
                    mutableState2.setValue(androidx.compose.ui.graphics.TransformOrigin.m2499boximpl(androidx.compose.material.MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.ui.Modifier modifier52 = modifier3;
            final int i52 = i3;
            composer2 = startRestartGroup;
            androidx.compose.material.internal.ExposedDropdownMenuPopupKt.ExposedDropdownMenuPopup(onDismissRequest, new androidx.compose.material.DropdownMenuPositionProvider(m4549getZeroRKDOV3M2, density2, (kotlin.jvm.functions.Function2) rememberedValue3, null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -406650841, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$1
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

                public final void invoke(androidx.compose.runtime.Composer composer3, int i6) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C261@10110L257:ExposedDropdownMenu.kt#jmzs0o");
                    if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                        androidx.compose.material.MenuKt.DropdownMenuContent(mutableTransitionState, mutableState2, androidx.compose.material.ExposedDropdownMenuBoxScope.DefaultImpls.exposedDropdownSize$default(exposedDropdownMenuBoxScope, modifier52, false, 1, null), content, composer3, androidx.compose.animation.core.MutableTransitionState.$stable | 48 | (i52 & 7168), 0);
                    } else {
                        composer3.skipToGroupEnd();
                    }
                }
            }), startRestartGroup, ((i3 >> 3) & 14) | 384, 0);
            modifier4 = modifier3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
    }
}
