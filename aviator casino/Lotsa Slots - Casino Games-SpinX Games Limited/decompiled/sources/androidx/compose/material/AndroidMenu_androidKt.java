package androidx.compose.material;

/* compiled from: AndroidMenu.android.kt */
@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aa\u0010\u0013\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "properties", "Landroidx/compose/ui/window/PopupProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "onClick", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0074  */
    /* renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1220DropdownMenuILWXrKs(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> onDismissRequest, androidx.compose.ui.Modifier modifier, long j, androidx.compose.ui.window.PopupProperties popupProperties, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        long j2;
        androidx.compose.ui.window.PopupProperties popupProperties2;
        int i5;
        long j3;
        int i6;
        long j4;
        androidx.compose.ui.window.PopupProperties popupProperties3;
        androidx.compose.ui.Modifier modifier3;
        java.lang.Object rememberedValue;
        final androidx.compose.animation.core.MutableTransitionState mutableTransitionState;
        java.lang.Object rememberedValue2;
        boolean changed;
        java.lang.Object rememberedValue3;
        final long j5;
        final androidx.compose.ui.window.PopupProperties popupProperties4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-840283139);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenu)P(1,4,2,3:c#ui.unit.DpOffset,5)82@4130L42,86@4320L51,87@4407L7,91@4531L131,95@4672L400:AndroidMenu.android.kt#jmzs0o");
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
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        popupProperties2 = popupProperties;
                        if (startRestartGroup.changed(popupProperties2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        popupProperties2 = popupProperties;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    popupProperties2 = popupProperties;
                }
                if ((i2 & 32) == 0) {
                    if ((458752 & i) == 0) {
                        i5 = startRestartGroup.changed(content) ? 131072 : 65536;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            androidx.compose.ui.Modifier.Companion companion = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i4 == 0) {
                                float f = 0;
                                j3 = androidx.compose.ui.unit.DpKt.m4499DpOffsetYgX7TsA(androidx.compose.ui.unit.Dp.m4478constructorimpl(f), androidx.compose.ui.unit.Dp.m4478constructorimpl(f));
                            } else {
                                j3 = j2;
                            }
                            if ((i2 & 16) == 0) {
                                i6 = i3 & (-57345);
                                modifier3 = companion;
                                j4 = j3;
                                popupProperties3 = new androidx.compose.ui.window.PopupProperties(true, false, false, null, false, false, 62, null);
                            } else {
                                i6 = i3;
                                j4 = j3;
                                popupProperties3 = popupProperties2;
                                modifier3 = companion;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            j4 = j2;
                            popupProperties3 = popupProperties2;
                            i6 = i3;
                            modifier3 = modifier2;
                        }
                        startRestartGroup.endDefaults();
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
                            startRestartGroup.startReplaceableGroup(1157296644);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(mutableState);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
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
                            final androidx.compose.ui.Modifier modifier4 = modifier3;
                            final int i9 = i6;
                            androidx.compose.ui.window.AndroidPopup_androidKt.Popup(new androidx.compose.material.DropdownMenuPositionProvider(j4, density, (kotlin.jvm.functions.Function2) rememberedValue3, null), onDismissRequest, popupProperties3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 79632374, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i10) {
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C100@4847L215:AndroidMenu.android.kt#jmzs0o");
                                    if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                                        androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> mutableTransitionState2 = mutableTransitionState;
                                        androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> mutableState2 = mutableState;
                                        androidx.compose.ui.Modifier modifier5 = modifier4;
                                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = content;
                                        int i11 = androidx.compose.animation.core.MutableTransitionState.$stable | 48;
                                        int i12 = i9;
                                        androidx.compose.material.MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2, modifier5, function3, composer2, i11 | (i12 & 896) | ((i12 >> 6) & 7168), 0);
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }
                            }), startRestartGroup, (i6 & 112) | 3072 | ((i6 >> 6) & 896), 0);
                        }
                        modifier2 = modifier3;
                        j5 = j4;
                        popupProperties4 = popupProperties3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        j5 = j2;
                        popupProperties4 = popupProperties2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$2
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

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i10) {
                            androidx.compose.material.AndroidMenu_androidKt.m1220DropdownMenuILWXrKs(z, onDismissRequest, modifier2, j5, popupProperties4, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                i5 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i5;
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                startRestartGroup.endDefaults();
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                mutableTransitionState = (androidx.compose.animation.core.MutableTransitionState) rememberedValue;
                mutableTransitionState.setTargetState(java.lang.Boolean.valueOf(z));
                if (!((java.lang.Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
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
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(mutableState2);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
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
                final androidx.compose.ui.Modifier modifier42 = modifier3;
                final int i92 = i6;
                androidx.compose.ui.window.AndroidPopup_androidKt.Popup(new androidx.compose.material.DropdownMenuPositionProvider(j4, density2, (kotlin.jvm.functions.Function2) rememberedValue3, null), onDismissRequest, popupProperties3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 79632374, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i10) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C100@4847L215:AndroidMenu.android.kt#jmzs0o");
                        if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                            androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> mutableTransitionState2 = mutableTransitionState;
                            androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> mutableState22 = mutableState2;
                            androidx.compose.ui.Modifier modifier5 = modifier42;
                            kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = content;
                            int i11 = androidx.compose.animation.core.MutableTransitionState.$stable | 48;
                            int i12 = i92;
                            androidx.compose.material.MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState22, modifier5, function3, composer2, i11 | (i12 & 896) | ((i12 >> 6) & 7168), 0);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), startRestartGroup, (i6 & 112) | 3072 | ((i6 >> 6) & 896), 0);
                modifier2 = modifier3;
                j5 = j4;
                popupProperties4 = popupProperties3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            j2 = j;
            if ((57344 & i) == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            i3 |= i5;
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            startRestartGroup.endDefaults();
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            mutableTransitionState = (androidx.compose.animation.core.MutableTransitionState) rememberedValue;
            mutableTransitionState.setTargetState(java.lang.Boolean.valueOf(z));
            if (!((java.lang.Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> mutableState22 = (androidx.compose.runtime.MutableState) rememberedValue2;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume22 = startRestartGroup.consume(localDensity22);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density22 = (androidx.compose.ui.unit.Density) consume22;
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(mutableState22);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
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
                    mutableState22.setValue(androidx.compose.ui.graphics.TransformOrigin.m2499boximpl(androidx.compose.material.MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.ui.Modifier modifier422 = modifier3;
            final int i922 = i6;
            androidx.compose.ui.window.AndroidPopup_androidKt.Popup(new androidx.compose.material.DropdownMenuPositionProvider(j4, density22, (kotlin.jvm.functions.Function2) rememberedValue3, null), onDismissRequest, popupProperties3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 79632374, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i10) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C100@4847L215:AndroidMenu.android.kt#jmzs0o");
                    if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                        androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> mutableTransitionState2 = mutableTransitionState;
                        androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> mutableState222 = mutableState22;
                        androidx.compose.ui.Modifier modifier5 = modifier422;
                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = content;
                        int i11 = androidx.compose.animation.core.MutableTransitionState.$stable | 48;
                        int i12 = i922;
                        androidx.compose.material.MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState222, modifier5, function3, composer2, i11 | (i12 & 896) | ((i12 >> 6) & 7168), 0);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, (i6 & 112) | 3072 | ((i6 >> 6) & 896), 0);
            modifier2 = modifier3;
            j5 = j4;
            popupProperties4 = popupProperties3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        j2 = j;
        if ((57344 & i) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i3 |= i5;
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        startRestartGroup.endDefaults();
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        mutableTransitionState = (androidx.compose.animation.core.MutableTransitionState) rememberedValue;
        mutableTransitionState.setTargetState(java.lang.Boolean.valueOf(z));
        if (!((java.lang.Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> mutableState222 = (androidx.compose.runtime.MutableState) rememberedValue2;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume222 = startRestartGroup.consume(localDensity222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density222 = (androidx.compose.ui.unit.Density) consume222;
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(mutableState222);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect, kotlin.Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1
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
                mutableState222.setValue(androidx.compose.ui.graphics.TransformOrigin.m2499boximpl(androidx.compose.material.MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        final androidx.compose.ui.Modifier modifier4222 = modifier3;
        final int i9222 = i6;
        androidx.compose.ui.window.AndroidPopup_androidKt.Popup(new androidx.compose.material.DropdownMenuPositionProvider(j4, density222, (kotlin.jvm.functions.Function2) rememberedValue3, null), onDismissRequest, popupProperties3, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 79632374, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenu$1
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

            public final void invoke(androidx.compose.runtime.Composer composer2, int i10) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C100@4847L215:AndroidMenu.android.kt#jmzs0o");
                if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                    androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> mutableTransitionState2 = mutableTransitionState;
                    androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.TransformOrigin> mutableState2222 = mutableState222;
                    androidx.compose.ui.Modifier modifier5 = modifier4222;
                    kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = content;
                    int i11 = androidx.compose.animation.core.MutableTransitionState.$stable | 48;
                    int i12 = i9222;
                    androidx.compose.material.MenuKt.DropdownMenuContent(mutableTransitionState2, mutableState2222, modifier5, function3, composer2, i11 | (i12 & 896) | ((i12 >> 6) & 7168), 0);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i6 & 112) | 3072 | ((i6 >> 6) & 896), 0);
        modifier2 = modifier3;
        j5 = j4;
        popupProperties4 = popupProperties3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i6;
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource2;
        int i7;
        final androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource3;
        final boolean z3;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1988562892);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItem)P(5,4,2,1,3)133@6255L39,136@6349L227:AndroidMenu.android.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(onClick) ? 4 : 2) | i;
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
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                        if ((i2 & 32) == 0) {
                            if ((i & 458752) == 0) {
                                i7 = startRestartGroup.changed(content) ? 131072 : 65536;
                            }
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                androidx.compose.ui.Modifier modifier3 = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                boolean z4 = i4 == 0 ? true : z2;
                                androidx.compose.foundation.layout.PaddingValues dropdownMenuItemContentPadding = i5 == 0 ? androidx.compose.material.MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : paddingValues2;
                                if (i6 != 0) {
                                    startRestartGroup.startReplaceableGroup(-492369756);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue;
                                }
                                androidx.compose.material.MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752), 0);
                                mutableInteractionSource3 = mutableInteractionSource2;
                                modifier2 = modifier3;
                                z3 = z4;
                                paddingValues3 = dropdownMenuItemContentPadding;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z3 = z2;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.AndroidMenu_androidKt$DropdownMenuItem$2
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

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i9) {
                                    androidx.compose.material.AndroidMenu_androidKt.DropdownMenuItem(onClick, modifier2, z3, paddingValues3, mutableInteractionSource3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i7 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i3 |= i7;
                        if ((374491 & i3) == 74898) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        androidx.compose.material.MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752), 0);
                        mutableInteractionSource3 = mutableInteractionSource2;
                        modifier2 = modifier3;
                        z3 = z4;
                        paddingValues3 = dropdownMenuItemContentPadding;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    androidx.compose.material.MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752), 0);
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier2 = modifier3;
                    z3 = z4;
                    paddingValues3 = dropdownMenuItemContentPadding;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                paddingValues2 = paddingValues;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((374491 & i3) == 74898) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                androidx.compose.material.MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752), 0);
                mutableInteractionSource3 = mutableInteractionSource2;
                modifier2 = modifier3;
                z3 = z4;
                paddingValues3 = dropdownMenuItemContentPadding;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            paddingValues2 = paddingValues;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((374491 & i3) == 74898) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            androidx.compose.material.MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752), 0);
            mutableInteractionSource3 = mutableInteractionSource2;
            modifier2 = modifier3;
            z3 = z4;
            paddingValues3 = dropdownMenuItemContentPadding;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((374491 & i3) == 74898) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        androidx.compose.material.MenuKt.DropdownMenuItemContent(onClick, modifier3, z4, dropdownMenuItemContentPadding, mutableInteractionSource2, content, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752), 0);
        mutableInteractionSource3 = mutableInteractionSource2;
        modifier2 = modifier3;
        z3 = z4;
        paddingValues3 = dropdownMenuItemContentPadding;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
