package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a´\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0017\u001aP\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2>\b\u0002\u0010\u001c\u001a8\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0 0\u0014\u001a\u0015\u0010!\u001a\u00020\t*\u00020\"2\u0006\u0010#\u001a\u00020$H\u0086\u0004\u001a\u0015\u0010%\u001a\u00020\t*\u00020\"2\u0006\u0010#\u001a\u00020$H\u0087\u0004\u001a¬\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020(2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010)\"\u0010\u0010&\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0004\n\u0002\u0010'¨\u0006*"}, d2 = {"AnimatedContent", "", "S", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "label", "", "contentKey", "Lkotlin/ParameterName;", "name", "", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "togetherWith", "Landroidx/compose/animation/EnterTransition;", com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.EXIT, "Landroidx/compose/animation/ExitTransition;", "with", "UnspecifiedSize", "J", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "animation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    private static final long getHighSpeedVideoFpsRangesFor = androidx.compose.ui.unit.IntSize.m8767constructorimpl(-9223372034707292160L);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final S s, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function1, androidx.compose.ui.Alignment alignment, java.lang.String str, kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function12, final kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        androidx.compose.ui.Alignment alignment2;
        int i6;
        java.lang.String str2;
        int i7;
        kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function13;
        androidx.compose.ui.Modifier modifier2;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function14;
        final java.lang.String str3;
        final kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function15;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function16;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1501828832);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(s) : startRestartGroup.changedInstance(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            function13 = function12;
                            i3 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
                            if ((1572864 & i) == 0) {
                                i3 |= startRestartGroup.changedInstance(function4) ? 1048576 : 524288;
                            }
                            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                function14 = function1;
                                str3 = str2;
                                function15 = function13;
                            } else {
                                androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if (i4 != 0) {
                                    androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                                            public final androidx.compose.animation.ContentTransform invoke(androidx.compose.animation.AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                                return androidx.compose.animation.AnimatedContentKt.togetherWith(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4, null), 0.0f, 2, null).plus(androidx.compose.animation.EnterExitTransitionKt.m1127scaleInL8ZKhE$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                                } else {
                                    function14 = function1;
                                }
                                androidx.compose.ui.Alignment topStart = i5 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTopStart() : alignment2;
                                java.lang.String str4 = i6 != 0 ? "AnimatedContent" : str2;
                                if (i7 != 0) {
                                    androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new kotlin.jvm.functions.Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final S invoke(S s2) {
                                                return s2;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    function16 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                } else {
                                    function16 = function13;
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(1501828832, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                }
                                int i9 = i3 >> 3;
                                AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), companion, function14, topStart, function16, function4, startRestartGroup, (i3 & 8176) | (57344 & i9) | (i9 & 458752), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier2 = companion;
                                alignment2 = topStart;
                                str3 = str4;
                                function15 = function16;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.compose.ui.Modifier modifier3 = modifier2;
                                final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function17 = function14;
                                final androidx.compose.ui.Alignment alignment3 = alignment2;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                        androidx.compose.animation.AnimatedContentKt.AnimatedContent(s, modifier3, function17, alignment3, str3, function15, function4, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                        function13 = function12;
                        if ((1572864 & i) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    str2 = str;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function13 = function12;
                    if ((1572864 & i) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function13 = function12;
                if ((1572864 & i) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function13 = function12;
            if ((1572864 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function13 = function12;
        if ((1572864 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ androidx.compose.animation.SizeTransform SizeTransform$default(boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> invoke(androidx.compose.ui.unit.IntSize intSize, androidx.compose.ui.unit.IntSize intSize2) {
                    return getHighSpeedVideoFpsRangesFor(intSize.m8776unboximpl(), intSize2.m8776unboximpl());
                }

                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> getHighSpeedVideoFpsRangesFor(long j, long j2) {
                    return androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m8764boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
                }
            };
        }
        return SizeTransform(z, function2);
    }

    public static final androidx.compose.animation.SizeTransform SizeTransform(boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.IntSize, ? super androidx.compose.ui.unit.IntSize, ? extends androidx.compose.animation.core.FiniteAnimationSpec<androidx.compose.ui.unit.IntSize>> function2) {
        return new androidx.compose.animation.SizeTransformImpl(z, function2);
    }

    public static final androidx.compose.animation.ContentTransform togetherWith(androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition) {
        return new androidx.compose.animation.ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    @kotlin.Deprecated(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @kotlin.ReplaceWith(expression = "togetherWith(exit)", imports = {}))
    public static final androidx.compose.animation.ContentTransform with(androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition) {
        return new androidx.compose.animation.ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final androidx.compose.animation.core.Transition<S> transition, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function1, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function12, final kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function13;
        int i4;
        androidx.compose.ui.Alignment alignment2;
        int i5;
        kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function14;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function15;
        final androidx.compose.ui.Alignment alignment3;
        final kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function16;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.collection.MutableScatterMap mutableScatterMap;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function17;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function18;
        androidx.compose.animation.ContentTransform invoke;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(511725103);
        int i6 = (i & 6) == 0 ? (startRestartGroup.changed(transition) ? 4 : 2) | i : i;
        int i7 = i2 & 1;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i3 = i2 & 2;
            if (i3 == 0) {
                i6 |= 384;
            } else if ((i & 384) == 0) {
                function13 = function1;
                i6 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
                i4 = i2 & 4;
                if (i4 != 0) {
                    i6 |= 3072;
                } else if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i6 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i5 = i2 & 8;
                    if (i5 == 0) {
                        i6 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function14 = function12;
                        i6 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
                        if ((196608 & i) == 0) {
                            i6 |= startRestartGroup.changedInstance(function4) ? 131072 : 65536;
                        }
                        if (!startRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            function15 = function13;
                            alignment3 = alignment2;
                            function16 = function14;
                        } else {
                            androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i3 != 0) {
                                androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1 rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4$1
                                        @Override // kotlin.jvm.functions.Function1
                                        /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                                        public final androidx.compose.animation.ContentTransform invoke(androidx.compose.animation.AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                            return androidx.compose.animation.AnimatedContentKt.togetherWith(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4, null), 0.0f, 2, null).plus(androidx.compose.animation.EnterExitTransitionKt.m1127scaleInL8ZKhE$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                            }
                            if (i4 != 0) {
                                alignment2 = androidx.compose.ui.Alignment.INSTANCE.getTopStart();
                            }
                            if (i5 != 0) {
                                androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1 rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final S invoke(S s) {
                                            return s;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function14 = (kotlin.jvm.functions.Function1) rememberedValue2;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(511725103, i6, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:773)");
                            }
                            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
                            int i8 = i6 & 14;
                            boolean z = i8 == 4;
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new androidx.compose.animation.AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            final androidx.compose.animation.AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl = rememberedValue3;
                            boolean z2 = i8 == 4;
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (z2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue4;
                            boolean z3 = i8 == 4;
                            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (z3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = androidx.collection.ScatterMapKt.mutableScatterMapOf();
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            androidx.collection.MutableScatterMap mutableScatterMap2 = (androidx.collection.MutableScatterMap) rememberedValue5;
                            if (!snapshotStateList.contains(transition.getCurrentState())) {
                                snapshotStateList.clear();
                                snapshotStateList.add(transition.getCurrentState());
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                                if (snapshotStateList.size() != 1 || !kotlin.jvm.internal.Intrinsics.areEqual(snapshotStateList.get(0), transition.getCurrentState())) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(transition.getCurrentState());
                                }
                                if (mutableScatterMap2.get_size() != 1 || mutableScatterMap2.containsKey(transition.getCurrentState())) {
                                    mutableScatterMap2.clear();
                                }
                                animatedContentTransitionScopeImpl.setContentAlignment(alignment2);
                                animatedContentTransitionScopeImpl.setLayoutDirection$animation(layoutDirection);
                            }
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && !snapshotStateList.contains(transition.getTargetState())) {
                                java.util.Iterator<T> it = snapshotStateList.iterator();
                                int i9 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i9 = -1;
                                        break;
                                    } else if (kotlin.jvm.internal.Intrinsics.areEqual(function14.invoke((java.lang.Object) it.next()), function14.invoke(transition.getTargetState()))) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                                if (i9 == -1) {
                                    snapshotStateList.add(transition.getTargetState());
                                } else {
                                    snapshotStateList.set(i9, transition.getTargetState());
                                }
                            }
                            if (mutableScatterMap2.containsKey(transition.getTargetState()) && mutableScatterMap2.containsKey(transition.getCurrentState())) {
                                startRestartGroup.startReplaceGroup(1925931827);
                                startRestartGroup.endReplaceGroup();
                                mutableScatterMap = mutableScatterMap2;
                                function17 = function13;
                            } else {
                                startRestartGroup.startReplaceGroup(1966410449);
                                mutableScatterMap2.clear();
                                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2 = snapshotStateList;
                                int size = snapshotStateList2.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    final T t = snapshotStateList2.get(i10);
                                    int i11 = size;
                                    final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function19 = function13;
                                    androidx.collection.MutableScatterMap mutableScatterMap3 = mutableScatterMap2;
                                    mutableScatterMap3.set(t, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-23915175, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                            getHighSpeedVideoFpsRanges(composer2, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        public final void getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer2, int i12) {
                                            java.lang.Object initialContentExit;
                                            if (!composer2.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(-23915175, i12, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:818)");
                                            }
                                            kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function110 = function19;
                                            java.lang.Object obj = animatedContentTransitionScopeImpl;
                                            androidx.compose.animation.ContentTransform rememberedValue6 = composer2.rememberedValue();
                                            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue6 = function110.invoke(obj);
                                                composer2.updateRememberedValue(rememberedValue6);
                                            }
                                            final androidx.compose.animation.ContentTransform contentTransform = (androidx.compose.animation.ContentTransform) rememberedValue6;
                                            boolean changed = composer2.changed(kotlin.jvm.internal.Intrinsics.areEqual(transition.getSegment().getTargetState(), t));
                                            androidx.compose.animation.core.Transition<S> transition2 = transition;
                                            S s = t;
                                            kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function111 = function19;
                                            java.lang.Object obj2 = animatedContentTransitionScopeImpl;
                                            java.lang.Object rememberedValue7 = composer2.rememberedValue();
                                            if (changed || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(transition2.getSegment().getTargetState(), s)) {
                                                    initialContentExit = androidx.compose.animation.ExitTransition.INSTANCE.getNone();
                                                } else {
                                                    initialContentExit = function111.invoke(obj2).getInitialContentExit();
                                                }
                                                rememberedValue7 = initialContentExit;
                                                composer2.updateRememberedValue(rememberedValue7);
                                            }
                                            final androidx.compose.animation.ExitTransition exitTransition = (androidx.compose.animation.ExitTransition) rememberedValue7;
                                            S s2 = t;
                                            androidx.compose.animation.core.Transition<S> transition3 = transition;
                                            java.lang.Object rememberedValue8 = composer2.rememberedValue();
                                            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue8 = new androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData(kotlin.jvm.internal.Intrinsics.areEqual(s2, transition3.getTargetState()));
                                                composer2.updateRememberedValue(rememberedValue8);
                                            }
                                            androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData childData = (androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData) rememberedValue8;
                                            androidx.compose.animation.EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                                            boolean changedInstance = composer2.changedInstance(contentTransform);
                                            java.lang.Object rememberedValue9 = composer2.rememberedValue();
                                            if (changedInstance || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue9 = (kotlin.jvm.functions.Function3) new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public final /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
                                                        return Camera2StreamConfigurationMap(measureScope, measurable, constraints.getGetHighSpeedVideoFpsRangesFor());
                                                    }

                                                    public final androidx.compose.ui.layout.MeasureResult Camera2StreamConfigurationMap(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                                                        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
                                                        int width = mo7353measureBRTryo0.getWidth();
                                                        int height = mo7353measureBRTryo0.getHeight();
                                                        final androidx.compose.animation.ContentTransform contentTransform2 = androidx.compose.animation.ContentTransform.this;
                                                        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, width, height, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                getHighResolutionOutputSizeshNQ4ISI(placementScope);
                                                                return kotlin.Unit.INSTANCE;
                                                            }

                                                            public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                placementScope.place(androidx.compose.ui.layout.Placeable.this, 0, 0, contentTransform2.getTargetContentZIndex());
                                                            }

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }
                                                        }, 4, null);
                                                    }

                                                    {
                                                        super(3);
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue9);
                                            }
                                            androidx.compose.ui.Modifier layout = androidx.compose.ui.layout.LayoutModifierKt.layout(companion, (kotlin.jvm.functions.Function3) rememberedValue9);
                                            childData.setTarget(kotlin.jvm.internal.Intrinsics.areEqual(t, transition.getTargetState()));
                                            androidx.compose.ui.Modifier then = layout.then(childData);
                                            androidx.compose.animation.core.Transition<S> transition4 = transition;
                                            boolean changedInstance2 = composer2.changedInstance(t);
                                            final S s3 = t;
                                            java.lang.Object rememberedValue10 = composer2.rememberedValue();
                                            if (changedInstance2 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue10 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<S, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                    @Override // kotlin.jvm.functions.Function1
                                                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                                                    public final java.lang.Boolean invoke(S s4) {
                                                        return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(s4, s3));
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue10);
                                            }
                                            kotlin.jvm.functions.Function1 function112 = (kotlin.jvm.functions.Function1) rememberedValue10;
                                            boolean changed2 = composer2.changed(exitTransition);
                                            java.lang.Object rememberedValue11 = composer2.rememberedValue();
                                            if (changed2 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue11 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.animation.EnterExitState, androidx.compose.animation.EnterExitState, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                                                    public final java.lang.Boolean invoke(androidx.compose.animation.EnterExitState enterExitState, androidx.compose.animation.EnterExitState enterExitState2) {
                                                        return java.lang.Boolean.valueOf(enterExitState == androidx.compose.animation.EnterExitState.PostExit && enterExitState2 == androidx.compose.animation.EnterExitState.PostExit && !androidx.compose.animation.ExitTransition.this.getGetHighResolutionOutputSizeshNQ4ISI().getHold());
                                                    }

                                                    {
                                                        super(2);
                                                    }
                                                };
                                                composer2.updateRememberedValue(rememberedValue11);
                                            }
                                            final androidx.compose.runtime.snapshots.SnapshotStateList<S> snapshotStateList3 = snapshotStateList;
                                            final S s4 = t;
                                            final androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                            final kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, S, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function42 = function4;
                                            androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl(transition4, function112, then, targetContentEnter, exitTransition, (kotlin.jvm.functions.Function2) rememberedValue11, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-143346359, true, new kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                                @Override // kotlin.jvm.functions.Function3
                                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                                    Camera2StreamConfigurationMap(animatedVisibilityScope, composer3, num.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void Camera2StreamConfigurationMap(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer3, int i13) {
                                                    if ((i13 & 6) == 0) {
                                                        i13 |= (i13 & 8) == 0 ? composer3.changed(animatedVisibilityScope) : composer3.changedInstance(animatedVisibilityScope) ? 4 : 2;
                                                    }
                                                    if (!composer3.shouldExecute((i13 & 19) != 18, i13 & 1)) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-143346359, i13, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:854)");
                                                    }
                                                    boolean changed3 = composer3.changed(snapshotStateList3);
                                                    boolean changedInstance3 = composer3.changedInstance(s4);
                                                    boolean changedInstance4 = composer3.changedInstance(animatedContentTransitionScopeImpl2);
                                                    final androidx.compose.runtime.snapshots.SnapshotStateList<S> snapshotStateList4 = snapshotStateList3;
                                                    final S s5 = s4;
                                                    final androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                                                    java.lang.Object rememberedValue12 = composer3.rememberedValue();
                                                    if ((changed3 | changedInstance3 | changedInstance4) || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue12 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1
                                                            @Override // kotlin.jvm.functions.Function1
                                                            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                                                            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                                                                final androidx.compose.runtime.snapshots.SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                                                final S s6 = s5;
                                                                final androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                                                                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1
                                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                                    public final void dispose() {
                                                                        androidx.compose.runtime.snapshots.SnapshotStateList.this.remove(s6);
                                                                        animatedContentTransitionScopeImpl4.getTargetSizeMap$animation().remove(s6);
                                                                    }
                                                                };
                                                            }

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(rememberedValue12);
                                                    }
                                                    androidx.compose.runtime.EffectsKt.DisposableEffect(animatedVisibilityScope, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue12, composer3, i13 & 14);
                                                    androidx.collection.MutableScatterMap targetSizeMap$animation = animatedContentTransitionScopeImpl2.getTargetSizeMap$animation();
                                                    S s6 = s4;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNull(animatedVisibilityScope, "");
                                                    targetSizeMap$animation.set(s6, ((androidx.compose.animation.AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation());
                                                    java.lang.Object rememberedValue13 = composer3.rememberedValue();
                                                    if (rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                        rememberedValue13 = new androidx.compose.animation.AnimatedContentScopeImpl(animatedVisibilityScope);
                                                        composer3.updateRememberedValue(rememberedValue13);
                                                    }
                                                    function42.invoke((androidx.compose.animation.AnimatedContentScopeImpl) rememberedValue13, s4, composer3, 0);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(3);
                                                }
                                            }, composer2, 54), composer2, 12582912, 64);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }
                                    }, startRestartGroup, 54));
                                    i10++;
                                    mutableScatterMap2 = mutableScatterMap3;
                                    size = i11;
                                    snapshotStateList2 = snapshotStateList2;
                                    function13 = function13;
                                }
                                mutableScatterMap = mutableScatterMap2;
                                function17 = function13;
                                startRestartGroup.endReplaceGroup();
                            }
                            androidx.compose.animation.core.Transition.Segment<S> segment = transition.getSegment();
                            boolean changed = startRestartGroup.changed(animatedContentTransitionScopeImpl);
                            boolean changed2 = startRestartGroup.changed(segment);
                            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if ((changed2 || changed) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                function18 = function17;
                                invoke = function18.invoke(animatedContentTransitionScopeImpl);
                                startRestartGroup.updateRememberedValue(invoke);
                            } else {
                                invoke = rememberedValue6;
                                function18 = function17;
                            }
                            androidx.compose.ui.Modifier then = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation(invoke, startRestartGroup, 0));
                            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new androidx.compose.animation.AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl);
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            androidx.compose.animation.AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (androidx.compose.animation.AnimatedContentMeasurePolicy) rememberedValue7;
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, animatedContentMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            startRestartGroup.startReplaceGroup(-860173498);
                            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList3 = snapshotStateList;
                            int size2 = snapshotStateList3.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                amex.AMEXKernel aMEXKernel = (java.lang.Object) snapshotStateList3.get(i12);
                                startRestartGroup.startMovableGroup(-2026002954, function14.invoke(aMEXKernel));
                                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) mutableScatterMap.get(aMEXKernel);
                                if (function2 == null) {
                                    startRestartGroup.startReplaceGroup(1618454323);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(-2026001778);
                                    function2.invoke(startRestartGroup, 0);
                                    startRestartGroup.endReplaceGroup();
                                }
                                startRestartGroup.endMovableGroup();
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function15 = function18;
                            alignment3 = alignment2;
                            function16 = function14;
                            modifier3 = modifier4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                                @Override // kotlin.jvm.functions.Function2
                                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    androidx.compose.animation.AnimatedContentKt.AnimatedContent(transition, modifier3, function15, alignment3, function16, function4, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
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
                    function14 = function12;
                    if ((196608 & i) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                alignment2 = alignment;
                i5 = i2 & 8;
                if (i5 == 0) {
                }
                function14 = function12;
                if ((196608 & i) == 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function13 = function1;
            i4 = i2 & 4;
            if (i4 != 0) {
            }
            alignment2 = alignment;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function14 = function12;
            if ((196608 & i) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 2;
        if (i3 == 0) {
        }
        function13 = function1;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        alignment2 = alignment;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function14 = function12;
        if ((196608 & i) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i6) != 74898, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
