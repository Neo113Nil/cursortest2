package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a_\u0010\u0000\u001a\u00020\u0001*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0013\u001a_\u0010\u0000\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001aa\u0010\u0000\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0018\u001ae\u0010\u0000\u001a\u00020\u0001*\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0019\u001ae\u0010\u0000\u001a\u00020\u0001*\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001a\u001am\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0\u001c2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001d\u001ak\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001c2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010 \u001a\u0091\u0001\u0010!\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001c2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010H\u0001¢\u0006\u0002\u0010'\u001a9\u0010+\u001a\u00020$\"\u0004\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0\u001c2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010,\u001a\u0002H\u001bH\u0003¢\u0006\u0002\u0010-\"\u001e\u0010(\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020$0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006.²\u0006\u001c\u0010/\u001a\u0014\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00030#X\u008a\u0084\u0002²\u0006\n\u00100\u001a\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"AnimatedVisibility", "", "visible", "", "modifier", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT, "Landroidx/compose/animation/ExitTransition;", "label", "", "content", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "visibleState", "Landroidx/compose/animation/core/MutableTransitionState;", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "T", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AnimatedVisibilityImpl", "transition", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "AnimatedEnterExitImpl", "shouldDisposeBlock", "Lkotlin/Function2;", "Landroidx/compose/animation/EnterExitState;", "onLookaheadMeasured", "Landroidx/compose/animation/OnLookaheadMeasured;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/OnLookaheadMeasured;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exitFinished", "getExitFinished", "(Landroidx/compose/animation/core/Transition;)Z", "targetEnterExit", "targetState", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.animation.EnterTransition enterTransition2;
        int i5;
        androidx.compose.animation.ExitTransition exitTransition2;
        int i6;
        java.lang.String str2;
        androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.animation.EnterTransition enterTransition3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1448730565);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            enterTransition3 = enterTransition2;
                            str3 = str2;
                        } else {
                            companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            androidx.compose.animation.EnterTransition plus = i4 != 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                            androidx.compose.animation.ExitTransition plus2 = i5 != 0 ? androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            java.lang.String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1448730565, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)");
                            }
                            androidx.compose.animation.core.Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1 rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1$1
                                    public final java.lang.Boolean getHighSpeedVideoFpsRangesFor(boolean z2) {
                                        return java.lang.Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return getHighSpeedVideoFpsRangesFor(bool.booleanValue());
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                            int i8 = i3 << 3;
                            int i9 = (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i3 & 458752);
                            java.lang.String str5 = str4;
                            AnimatedVisibilityImpl(updateTransition, function1, companion, plus, plus2, function3, startRestartGroup, i9);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            exitTransition2 = plus2;
                            str3 = str5;
                            enterTransition3 = plus;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final androidx.compose.animation.ExitTransition exitTransition3 = exitTransition2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                                private void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer2) {
                                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(z, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    Camera2StreamConfigurationMap(composer2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((196608 & i) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((196608 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((196608 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((196608 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final androidx.compose.foundation.layout.RowScope rowScope, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.animation.EnterTransition enterTransition2;
        int i5;
        androidx.compose.animation.ExitTransition exitTransition2;
        int i6;
        java.lang.String str2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.animation.EnterTransition enterTransition3;
        final androidx.compose.animation.ExitTransition exitTransition3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(234057107);
        if ((i & 48) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            androidx.compose.animation.EnterTransition plus = i4 != 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null)) : enterTransition2;
                            exitTransition3 = i5 != 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null)) : exitTransition2;
                            java.lang.String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(234057107, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)");
                            }
                            int i8 = i3 >> 3;
                            androidx.compose.animation.core.Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i8 & 14) | ((i3 >> 12) & 112), 0);
                            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1 rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                                    public final java.lang.Boolean getHighSpeedVideoSizes(boolean z2) {
                                        return java.lang.Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return getHighSpeedVideoSizes(bool.booleanValue());
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            AnimatedVisibilityImpl(updateTransition, (kotlin.jvm.functions.Function1) rememberedValue, companion, plus, exitTransition3, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i8 & 458752));
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = companion;
                            enterTransition3 = plus;
                            str3 = str4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                                private void getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer2) {
                                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope.this, z, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    getHighSpeedVideoSizes(composer2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((1572864 & i) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final androidx.compose.foundation.layout.ColumnScope columnScope, final boolean z, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.animation.EnterTransition enterTransition2;
        int i5;
        androidx.compose.animation.ExitTransition exitTransition2;
        int i6;
        java.lang.String str2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.animation.EnterTransition enterTransition3;
        final androidx.compose.animation.ExitTransition exitTransition3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1799879339);
        if ((i & 48) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            androidx.compose.animation.EnterTransition plus = i4 != 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)) : enterTransition2;
                            exitTransition3 = i5 != 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)) : exitTransition2;
                            java.lang.String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1799879339, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)");
                            }
                            int i8 = i3 >> 3;
                            androidx.compose.animation.core.Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i8 & 14) | ((i3 >> 12) & 112), 0);
                            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1 rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                                    public final java.lang.Boolean getHighSpeedVideoFpsRangesFor(boolean z2) {
                                        return java.lang.Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return getHighSpeedVideoFpsRangesFor(bool.booleanValue());
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            AnimatedVisibilityImpl(updateTransition, (kotlin.jvm.functions.Function1) rememberedValue, companion, plus, exitTransition3, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i8 & 458752));
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = companion;
                            enterTransition3 = plus;
                            str3 = str4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                                private void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer2) {
                                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope.this, z, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    Camera2StreamConfigurationMap(composer2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((1572864 & i) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> mutableTransitionState, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.animation.EnterTransition enterTransition2;
        int i5;
        androidx.compose.animation.ExitTransition exitTransition2;
        int i6;
        java.lang.String str2;
        androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.animation.EnterTransition enterTransition3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(657024243);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier2;
                            enterTransition3 = enterTransition2;
                            str3 = str2;
                        } else {
                            companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            androidx.compose.animation.EnterTransition plus = i4 != 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                            androidx.compose.animation.ExitTransition plus2 = i5 != 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null)) : exitTransition2;
                            java.lang.String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(657024243, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)");
                            }
                            androidx.compose.animation.core.Transition rememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0);
                            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1 rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7$1
                                    public final java.lang.Boolean getHighSpeedVideoSizes(boolean z) {
                                        return java.lang.Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return getHighSpeedVideoSizes(bool.booleanValue());
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                            int i8 = i3 << 3;
                            int i9 = (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i3 & 458752);
                            java.lang.String str5 = str4;
                            AnimatedVisibilityImpl(rememberTransition, function1, companion, plus, plus2, function3, startRestartGroup, i9);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            exitTransition2 = plus2;
                            str3 = str5;
                            enterTransition3 = plus;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final androidx.compose.animation.ExitTransition exitTransition3 = exitTransition2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                                private void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer2) {
                                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    getHighSpeedVideoFpsRanges(composer2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((196608 & i) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((196608 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((196608 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((196608 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final androidx.compose.foundation.layout.RowScope rowScope, final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> mutableTransitionState, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.animation.EnterTransition enterTransition2;
        int i5;
        androidx.compose.animation.ExitTransition exitTransition2;
        int i6;
        java.lang.String str2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.animation.EnterTransition enterTransition3;
        final androidx.compose.animation.ExitTransition exitTransition3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1763490971);
        if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            androidx.compose.animation.EnterTransition plus = i4 != 0 ? androidx.compose.animation.EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)) : enterTransition2;
                            exitTransition3 = i5 != 0 ? androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            java.lang.String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1763490971, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                            }
                            int i8 = i3 >> 3;
                            androidx.compose.animation.core.Transition rememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i8 & 14) | ((i3 >> 12) & 112), 0);
                            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1 rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9$1
                                    public final java.lang.Boolean getHighSpeedVideoFpsRangesFor(boolean z) {
                                        return java.lang.Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return getHighSpeedVideoFpsRangesFor(bool.booleanValue());
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            AnimatedVisibilityImpl(rememberTransition, (kotlin.jvm.functions.Function1) rememberedValue, companion, plus, exitTransition3, function3, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8));
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = companion;
                            enterTransition3 = plus;
                            str3 = str4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                                private void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer2) {
                                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope.this, mutableTransitionState, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    Camera2StreamConfigurationMap(composer2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((1572864 & i) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final androidx.compose.foundation.layout.ColumnScope columnScope, final androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean> mutableTransitionState, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, java.lang.String str, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.animation.EnterTransition enterTransition2;
        int i5;
        androidx.compose.animation.ExitTransition exitTransition2;
        int i6;
        java.lang.String str2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.animation.EnterTransition enterTransition3;
        final androidx.compose.animation.ExitTransition exitTransition3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1238803325);
        if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? startRestartGroup.changed(mutableTransitionState) : startRestartGroup.changedInstance(mutableTransitionState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((1572864 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                        }
                        if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransition3 = enterTransition2;
                            exitTransition3 = exitTransition2;
                            str3 = str2;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            androidx.compose.animation.EnterTransition plus = i4 != 0 ? androidx.compose.animation.EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)) : enterTransition2;
                            exitTransition3 = i5 != 0 ? androidx.compose.animation.EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            java.lang.String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1238803325, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)");
                            }
                            int i8 = i3 >> 3;
                            androidx.compose.animation.core.Transition rememberTransition = androidx.compose.animation.core.TransitionKt.rememberTransition(mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i8 & 14) | ((i3 >> 12) & 112), 0);
                            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1 rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11$1
                                    public final java.lang.Boolean getHighResolutionOutputSizeshNQ4ISI(boolean z) {
                                        return java.lang.Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return getHighResolutionOutputSizeshNQ4ISI(bool.booleanValue());
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            AnimatedVisibilityImpl(rememberTransition, (kotlin.jvm.functions.Function1) rememberedValue, companion, plus, exitTransition3, function3, startRestartGroup, (i3 & 896) | 48 | (i3 & 7168) | (i3 & 57344) | (458752 & i8));
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = companion;
                            enterTransition3 = plus;
                            str3 = str4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                                private void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.Composer composer2) {
                                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope.this, mutableTransitionState, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    getHighSpeedVideoFpsRangesFor(composer2);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((1572864 & i) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((1572864 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((1572864 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((1572864 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((599185 & i3) != 599184, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void AnimatedVisibility(final androidx.compose.animation.core.Transition<T> transition, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.animation.EnterTransition enterTransition2;
        int i5;
        androidx.compose.animation.ExitTransition exitTransition2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.animation.ExitTransition exitTransition3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1699747442);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                    }
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        exitTransition3 = exitTransition2;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        androidx.compose.animation.EnterTransition plus = i4 != 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                        androidx.compose.animation.ExitTransition plus2 = i5 != 0 ? androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1699747442, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)");
                        }
                        AnimatedVisibilityImpl(transition, function1, companion, plus, plus2, function3, startRestartGroup, 524286 & i3);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = companion;
                        exitTransition3 = plus2;
                        enterTransition2 = plus;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.animation.EnterTransition enterTransition3 = enterTransition2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                            private void getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.Composer composer2) {
                                androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier3, enterTransition3, exitTransition3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                getHighSpeedVideoFpsRangesFor(composer2);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }
                        });
                        return;
                    }
                    return;
                }
                exitTransition2 = exitTransition;
                if ((196608 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            if ((196608 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransition2 = enterTransition;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransition2 = exitTransition;
        if ((196608 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final <T> void AnimatedVisibilityImpl(final androidx.compose.animation.core.Transition<T> transition, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, final androidx.compose.ui.Modifier modifier, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1706321816);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1706321816, i2, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:677)");
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function3) new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public final /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
                        return getHighResolutionOutputSizeshNQ4ISI(measureScope, measurable, constraints.getGetHighSpeedVideoFpsRangesFor());
                    }

                    public final androidx.compose.ui.layout.MeasureResult getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                        long m8767constructorimpl;
                        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
                        if (measureScope.isLookingAhead() && !function1.invoke(transition.getTargetState()).booleanValue()) {
                            m8767constructorimpl = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
                        } else {
                            m8767constructorimpl = androidx.compose.ui.unit.IntSize.m8767constructorimpl((mo7353measureBRTryo0.getWidth() << 32) | (mo7353measureBRTryo0.getHeight() & 4294967295L));
                        }
                        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, (int) (m8767constructorimpl >> 32), (int) (m8767constructorimpl & 4294967295L), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
                            public final void Camera2StreamConfigurationMap(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                Camera2StreamConfigurationMap(placementScope);
                                return kotlin.Unit.INSTANCE;
                            }

                            {
                                super(1);
                            }
                        }, 4, null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier layout = androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, (kotlin.jvm.functions.Function3) rememberedValue);
            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<androidx.compose.animation.EnterExitState, androidx.compose.animation.EnterExitState, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1
                    @Override // kotlin.jvm.functions.Function2
                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                    public final java.lang.Boolean invoke(androidx.compose.animation.EnterExitState enterExitState, androidx.compose.animation.EnterExitState enterExitState2) {
                        return java.lang.Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == androidx.compose.animation.EnterExitState.PostExit);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AnimatedEnterExitImpl(transition, function1, layout, enterTransition, exitTransition, (kotlin.jvm.functions.Function2) rememberedValue2, null, function3, startRestartGroup, i3 | 196608 | i4 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
                private void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer2) {
                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibilityImpl(transition, function1, modifier, enterTransition, exitTransition, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    Camera2StreamConfigurationMap(composer2);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void AnimatedEnterExitImpl(final androidx.compose.animation.core.Transition<T> transition, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, final androidx.compose.ui.Modifier modifier, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, final kotlin.jvm.functions.Function2<? super androidx.compose.animation.EnterExitState, ? super androidx.compose.animation.EnterExitState, java.lang.Boolean> function2, androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured3;
        int i5;
        final androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured4;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1912839215);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        int i7 = 1572864;
        if (i6 == 0) {
            if ((1572864 & i) == 0) {
                i7 = (i & 2097152) == 0 ? startRestartGroup.changed(onLookaheadMeasured) : startRestartGroup.changedInstance(onLookaheadMeasured) ? 1048576 : 524288;
            }
            if ((12582912 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
            }
            i4 = i3;
            boolean z = true;
            if (startRestartGroup.shouldExecute((4793491 & i4) == 4793490, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                onLookaheadMeasured2 = onLookaheadMeasured;
            } else {
                androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured5 = i6 != 0 ? null : onLookaheadMeasured;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1912839215, i4, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:715)");
                }
                if (!function1.invoke(transition.getTargetState()).booleanValue() && !function1.invoke(transition.getCurrentState()).booleanValue() && !transition.isSeeking() && !transition.getHasInitialValueAnimations()) {
                    startRestartGroup.startReplaceGroup(-272333293);
                    onLookaheadMeasured4 = onLookaheadMeasured5;
                    composer2 = startRestartGroup;
                } else {
                    startRestartGroup.startReplaceGroup(-232413539);
                    int i8 = i4 & 14;
                    int i9 = i8 | 48;
                    int i10 = i9 & 14;
                    boolean z2 = ((i10 ^ 6) > 4 && startRestartGroup.changed(transition)) || (i9 & 6) == 4;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = transition.getCurrentState();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    if (transition.isSeeking()) {
                        rememberedValue = transition.getCurrentState();
                    }
                    startRestartGroup.startReplaceGroup(1844425648);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        onLookaheadMeasured3 = onLookaheadMeasured5;
                        androidx.compose.runtime.ComposerKt.traceEventStart(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:724)");
                    } else {
                        onLookaheadMeasured3 = onLookaheadMeasured5;
                    }
                    int i11 = i4 & 126;
                    androidx.compose.animation.EnterExitState highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(transition, function1, rememberedValue, startRestartGroup, i11);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    T targetState = transition.getTargetState();
                    startRestartGroup.startReplaceGroup(1844425648);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        i5 = i4;
                        androidx.compose.runtime.ComposerKt.traceEventStart(1844425648, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:724)");
                    } else {
                        i5 = i4;
                    }
                    androidx.compose.animation.EnterExitState highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(transition, function1, targetState, startRestartGroup, i11);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceGroup();
                    androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured6 = onLookaheadMeasured3;
                    int i12 = i5;
                    androidx.compose.animation.core.Transition createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, "EnterExitTransition", startRestartGroup, i10 | 3072);
                    androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i12 >> 15) & 14);
                    java.lang.Boolean invoke = function2.invoke(createChildTransitionInternal.getCurrentState(), createChildTransitionInternal.getTargetState());
                    boolean changed = startRestartGroup.changed(createChildTransitionInternal);
                    boolean changed2 = startRestartGroup.changed(rememberUpdatedState);
                    androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((changed | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(createChildTransitionInternal, rememberUpdatedState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.State produceState = androidx.compose.runtime.SnapshotStateKt.produceState(invoke, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 0);
                    if (getHighSpeedVideoFpsRanges(createChildTransitionInternal) && Camera2StreamConfigurationMap(produceState)) {
                        startRestartGroup.startReplaceGroup(-272333293);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                        onLookaheadMeasured4 = onLookaheadMeasured6;
                    } else {
                        startRestartGroup.startReplaceGroup(-231383533);
                        boolean z3 = i8 == 4;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new androidx.compose.animation.AnimatedVisibilityScopeImpl(createChildTransitionInternal);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.animation.AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (androidx.compose.animation.AnimatedVisibilityScopeImpl) rememberedValue3;
                        int i13 = i12 >> 6;
                        composer2 = startRestartGroup;
                        androidx.compose.ui.Modifier createModifier = androidx.compose.animation.EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition, exitTransition, null, "Built-in", composer2, (i13 & 112) | 24576 | (i13 & 896), 4);
                        onLookaheadMeasured4 = onLookaheadMeasured6;
                        if (onLookaheadMeasured4 != null) {
                            composer2.startReplaceGroup(-230964196);
                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            if ((i12 & 3670016) != 1048576 && ((i12 & 2097152) == 0 || !composer2.changedInstance(onLookaheadMeasured4))) {
                                z = false;
                            }
                            java.lang.Object rememberedValue4 = composer2.rememberedValue();
                            if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = (kotlin.jvm.functions.Function3) new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
                                        return getHighSpeedVideoFpsRanges(measureScope, measurable, constraints.getGetHighSpeedVideoFpsRangesFor());
                                    }

                                    public final androidx.compose.ui.layout.MeasureResult getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                                        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
                                        androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured7 = androidx.compose.animation.OnLookaheadMeasured.this;
                                        if (measureScope.isLookingAhead()) {
                                            onLookaheadMeasured7.m1134invokeozmzZPI(androidx.compose.ui.unit.IntSize.m8767constructorimpl((mo7353measureBRTryo0.getWidth() << 32) | (mo7353measureBRTryo0.getHeight() & 4294967295L)));
                                        }
                                        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1$1
                                            public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                getHighSpeedVideoFpsRangesFor(placementScope);
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            {
                                                super(1);
                                            }
                                        }, 4, null);
                                    }

                                    {
                                        super(3);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue4);
                            }
                            companion = androidx.compose.ui.layout.LayoutModifierKt.layout(companion2, (kotlin.jvm.functions.Function3) rememberedValue4);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-7432681);
                            composer2.endReplaceGroup();
                            companion = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        androidx.compose.ui.Modifier then = modifier.then(createModifier.then(companion));
                        java.lang.Object rememberedValue5 = composer2.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new androidx.compose.animation.AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        androidx.compose.animation.AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (androidx.compose.animation.AnimatedEnterExitMeasurePolicy) rememberedValue5;
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, then);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, animatedEnterExitMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        function3.invoke(animatedVisibilityScopeImpl, composer2, java.lang.Integer.valueOf((i12 >> 18) & 112));
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                }
                composer2.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                onLookaheadMeasured2 = onLookaheadMeasured4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured7 = onLookaheadMeasured2;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
                    private void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer3) {
                        androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl(transition, function1, modifier, enterTransition, exitTransition, function2, onLookaheadMeasured7, function3, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                        Camera2StreamConfigurationMap(composer3);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= i7;
        if ((12582912 & i) == 0) {
        }
        i4 = i3;
        boolean z4 = true;
        if (startRestartGroup.shouldExecute((4793491 & i4) == 4793490, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition) {
        return transition.getCurrentState() == androidx.compose.animation.EnterExitState.PostExit && transition.getTargetState() == androidx.compose.animation.EnterExitState.PostExit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> androidx.compose.animation.EnterExitState getHighSpeedVideoFpsRanges(androidx.compose.animation.core.Transition<T> transition, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, T t, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.animation.EnterExitState enterExitState;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:833)");
        }
        composer.startMovableGroup(-422486745, transition);
        if (transition.isSeeking()) {
            composer.startReplaceGroup(-212166497);
            composer.endReplaceGroup();
            if (function1.invoke(t).booleanValue()) {
                enterExitState = androidx.compose.animation.EnterExitState.Visible;
            } else if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                enterExitState = androidx.compose.animation.EnterExitState.PostExit;
            } else {
                enterExitState = androidx.compose.animation.EnterExitState.PreEnter;
            }
        } else {
            composer.startReplaceGroup(-211892364);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(java.lang.Boolean.TRUE);
            }
            if (function1.invoke(t).booleanValue()) {
                enterExitState = androidx.compose.animation.EnterExitState.Visible;
            } else if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = androidx.compose.animation.EnterExitState.PostExit;
            } else {
                enterExitState = androidx.compose.animation.EnterExitState.PreEnter;
            }
            composer.endReplaceGroup();
        }
        composer.endMovableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return enterExitState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.jvm.functions.Function2<androidx.compose.animation.EnterExitState, androidx.compose.animation.EnterExitState, java.lang.Boolean> getHighSpeedVideoSizes(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super androidx.compose.animation.EnterExitState, ? super androidx.compose.animation.EnterExitState, java.lang.Boolean>> state) {
        return (kotlin.jvm.functions.Function2) state.getValue();
    }

    private static final boolean Camera2StreamConfigurationMap(androidx.compose.runtime.State<java.lang.Boolean> state) {
        return state.getValue().booleanValue();
    }
}
