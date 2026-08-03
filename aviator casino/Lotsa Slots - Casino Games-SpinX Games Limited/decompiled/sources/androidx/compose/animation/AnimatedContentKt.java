package androidx.compose.animation;

/* compiled from: AnimatedContent.kt */
@kotlin.Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a´\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0017\u001aP\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2>\b\u0002\u0010\u001c\u001a8\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0 0\u0014\u001a¬\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020!2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\"\u001a\u0015\u0010#\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0086\u0004\u001a\u0015\u0010'\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0087\u0004¨\u0006("}, d2 = {"AnimatedContent", "", androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH, "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "label", "", "contentKey", "Lkotlin/ParameterName;", "name", "", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "togetherWith", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "with", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final S s, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function1, androidx.compose.ui.Alignment alignment, java.lang.String str, kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function12, final kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function13;
        int i5;
        androidx.compose.ui.Alignment alignment2;
        int i6;
        java.lang.String str2;
        int i7;
        kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function14;
        final androidx.compose.ui.Alignment topStart;
        final java.lang.String str3;
        final androidx.compose.animation.AnimatedContentKt$AnimatedContent$2 animatedContentKt$AnimatedContent$2;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2132720749);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedContent)P(5,4,6,1,3,2)139@7459L58,140@7533L136:AnimatedContent.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function13 = function1;
                i3 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            function14 = function12;
                        } else {
                            function14 = function12;
                            if ((i & 458752) == 0) {
                                i3 |= startRestartGroup.changedInstance(function14) ? 131072 : 65536;
                            }
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changedInstance(function4) ? 1048576 : 524288;
                        }
                        if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                            androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                function13 = new kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final androidx.compose.animation.ContentTransform invoke(androidx.compose.animation.AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return androidx.compose.animation.AnimatedContentKt.togetherWith(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.0f, 2, null).plus(androidx.compose.animation.EnterExitTransitionKt.m74scaleInL8ZKhE$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                };
                            }
                            topStart = i5 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTopStart() : alignment2;
                            str3 = i6 != 0 ? "AnimatedContent" : str2;
                            animatedContentKt$AnimatedContent$2 = i7 != 0 ? new kotlin.jvm.functions.Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2
                                @Override // kotlin.jvm.functions.Function1
                                public final S invoke(S s2) {
                                    return s2;
                                }
                            } : function14;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(2132720749, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:138)");
                            }
                            androidx.compose.animation.core.Transition updateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0);
                            int i9 = (i3 & 112) | (i3 & 896) | (i3 & 7168);
                            int i10 = i3 >> 3;
                            AnimatedContent(updateTransition, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i9 | (57344 & i10) | (i10 & 458752), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier2 = companion;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            topStart = alignment2;
                            str3 = str2;
                            animatedContentKt$AnimatedContent$2 = function14;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function15 = function13;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
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
                                    androidx.compose.animation.AnimatedContentKt.AnimatedContent(s, modifier3, function15, topStart, str3, animatedContentKt$AnimatedContent$2, function4, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i3 & 2995931) == 599186) {
                    }
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.animation.core.Transition updateTransition2 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0);
                    int i92 = (i3 & 112) | (i3 & 896) | (i3 & 7168);
                    int i102 = i3 >> 3;
                    AnimatedContent(updateTransition2, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i92 | (57344 & i102) | (i102 & 458752), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = companion;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
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
                if ((i2 & 64) != 0) {
                }
                if ((i3 & 2995931) == 599186) {
                }
                if (i8 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.animation.core.Transition updateTransition22 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0);
                int i922 = (i3 & 112) | (i3 & 896) | (i3 & 7168);
                int i1022 = i3 >> 3;
                AnimatedContent(updateTransition22, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i922 | (57344 & i1022) | (i1022 & 458752), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier2 = companion;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function13 = function1;
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
            if ((i2 & 64) != 0) {
            }
            if ((i3 & 2995931) == 599186) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.animation.core.Transition updateTransition222 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0);
            int i9222 = (i3 & 112) | (i3 & 896) | (i3 & 7168);
            int i10222 = i3 >> 3;
            AnimatedContent(updateTransition222, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i9222 | (57344 & i10222) | (i10222 & 458752), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier2 = companion;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
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
        if ((i2 & 64) != 0) {
        }
        if ((i3 & 2995931) == 599186) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.animation.core.Transition updateTransition2222 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str3, startRestartGroup, (i3 & 8) | (i3 & 14) | ((i3 >> 9) & 112), 0);
        int i92222 = (i3 & 112) | (i3 & 896) | (i3 & 7168);
        int i102222 = i3 >> 3;
        AnimatedContent(updateTransition2222, companion, function13, topStart, animatedContentKt$AnimatedContent$2, function4, startRestartGroup, i92222 | (57344 & i102222) | (i102222 & 458752), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier2 = companion;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ androidx.compose.animation.SizeTransform SizeTransform$default(boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.IntSize, androidx.compose.ui.unit.IntSize, androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> invoke(androidx.compose.ui.unit.IntSize intSize, androidx.compose.ui.unit.IntSize intSize2) {
                    return m38invokeTemP2vQ(intSize.getPackedValue(), intSize2.getPackedValue());
                }

                /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final androidx.compose.animation.core.SpringSpec<androidx.compose.ui.unit.IntSize> m38invokeTemP2vQ(long j, long j2) {
                    return androidx.compose.animation.core.AnimationSpecKt.spring$default(0.0f, 400.0f, androidx.compose.ui.unit.IntSize.m4644boximpl(androidx.compose.animation.core.VisibilityThresholdsKt.getVisibilityThreshold(androidx.compose.ui.unit.IntSize.INSTANCE)), 1, null);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x026f A[LOOP:2: B:130:0x026d->B:131:0x026f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final androidx.compose.animation.core.Transition<S> transition, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function1, androidx.compose.ui.Alignment alignment, kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function12, final kotlin.jvm.functions.Function4<? super androidx.compose.animation.AnimatedContentScope, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function13;
        int i5;
        androidx.compose.ui.Alignment alignment2;
        int i6;
        kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function14;
        kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function15;
        androidx.compose.ui.unit.LayoutDirection layoutDirection;
        boolean changed;
        java.lang.Object rememberedValue;
        final androidx.compose.animation.AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        boolean changed2;
        java.lang.Object rememberedValue2;
        final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList;
        boolean changed3;
        java.util.LinkedHashMap rememberedValue3;
        java.util.Map map;
        int size;
        int i7;
        boolean changed4;
        androidx.compose.animation.ContentTransform rememberedValue4;
        java.lang.Object rememberedValue5;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m1641constructorimpl;
        int size2;
        int i8;
        final androidx.compose.ui.Alignment alignment3;
        final kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> function16;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function17;
        java.util.Iterator<T> it;
        int i9;
        int i10;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-114689412);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedContent)P(3,4,1,2)666@34009L7,667@34037L106,671@34231L51,672@34304L62,760@38852L58,761@38944L45,771@39263L52,762@38994L327:AnimatedContent.kt#xbi5r1");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function13 = function1;
                i3 |= startRestartGroup.changedInstance(function13) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        function14 = function12;
                        i3 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
                        if ((i2 & 16) != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((458752 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function4) ? 131072 : 65536;
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                androidx.compose.ui.Modifier modifier4 = i11 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                function15 = i4 == 0 ? new kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final androidx.compose.animation.ContentTransform invoke(androidx.compose.animation.AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return androidx.compose.animation.AnimatedContentKt.togetherWith(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.0f, 2, null).plus(androidx.compose.animation.EnterExitTransitionKt.m74scaleInL8ZKhE$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                } : function13;
                                if (i5 != 0) {
                                    alignment2 = androidx.compose.ui.Alignment.INSTANCE.getTopStart();
                                }
                                if (i6 != 0) {
                                    function14 = new kotlin.jvm.functions.Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final S invoke(S s) {
                                            return s;
                                        }
                                    };
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-114689412, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:665)");
                                }
                                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                java.lang.Object consume = startRestartGroup.consume(localLayoutDirection);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(transition);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new androidx.compose.animation.AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                animatedContentTransitionScopeImpl = rememberedValue;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed2 = startRestartGroup.changed(transition);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue2;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                changed3 = startRestartGroup.changed(transition);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new java.util.LinkedHashMap();
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceableGroup();
                                map = (java.util.Map) rememberedValue3;
                                if (!snapshotStateList.contains(transition.getCurrentState())) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(transition.getCurrentState());
                                }
                                if (kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                                    if (snapshotStateList.size() != 1 || !kotlin.jvm.internal.Intrinsics.areEqual(snapshotStateList.get(0), transition.getCurrentState())) {
                                        snapshotStateList.clear();
                                        snapshotStateList.add(transition.getCurrentState());
                                    }
                                    if (map.size() != 1 || map.containsKey(transition.getCurrentState())) {
                                        map.clear();
                                    }
                                    animatedContentTransitionScopeImpl.setContentAlignment(alignment2);
                                    animatedContentTransitionScopeImpl.setLayoutDirection$animation_release(layoutDirection);
                                }
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && !snapshotStateList.contains(transition.getTargetState())) {
                                    it = snapshotStateList.iterator();
                                    i9 = 0;
                                    while (true) {
                                        if (it.hasNext()) {
                                            i10 = -1;
                                            i9 = -1;
                                            break;
                                        } else {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(function14.invoke((java.lang.Object) it.next()), function14.invoke(transition.getTargetState()))) {
                                                i10 = -1;
                                                break;
                                            }
                                            i9++;
                                        }
                                    }
                                    if (i9 != i10) {
                                        snapshotStateList.add(transition.getTargetState());
                                    } else {
                                        snapshotStateList.set(i9, transition.getTargetState());
                                    }
                                }
                                if (map.containsKey(transition.getTargetState()) || !map.containsKey(transition.getCurrentState())) {
                                    map.clear();
                                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2 = snapshotStateList;
                                    size = snapshotStateList2.size();
                                    i7 = 0;
                                    while (i7 < size) {
                                        final T t = snapshotStateList2.get(i7);
                                        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                        final kotlin.jvm.functions.Function1<? super androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function18 = function15;
                                        java.util.Map map2 = map;
                                        map2.put(t, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 885640742, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
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

                                            public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C709@36279L38,713@36493L323,720@36849L125,725@37157L1637:AnimatedContent.kt#xbi5r1");
                                                if ((i12 & 11) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(885640742, i12, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:709)");
                                                }
                                                kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function19 = function18;
                                                java.lang.Object obj = animatedContentTransitionScopeImpl;
                                                composer2.startReplaceableGroup(-492369756);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                                                androidx.compose.animation.ContentTransform rememberedValue6 = composer2.rememberedValue();
                                                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue6 = function19.invoke(obj);
                                                    composer2.updateRememberedValue(rememberedValue6);
                                                }
                                                composer2.endReplaceableGroup();
                                                final androidx.compose.animation.ContentTransform contentTransform = (androidx.compose.animation.ContentTransform) rememberedValue6;
                                                java.lang.Object valueOf = java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(transition.getSegment().getTargetState(), t));
                                                androidx.compose.animation.core.Transition<S> transition2 = transition;
                                                S s = t;
                                                kotlin.jvm.functions.Function1<androidx.compose.animation.AnimatedContentTransitionScope<S>, androidx.compose.animation.ContentTransform> function110 = function18;
                                                java.lang.Object obj2 = animatedContentTransitionScopeImpl;
                                                composer2.startReplaceableGroup(1157296644);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(remember)P(1):Composables.kt#9igjgp");
                                                boolean changed5 = composer2.changed(valueOf);
                                                java.lang.Object rememberedValue7 = composer2.rememberedValue();
                                                if (changed5 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue7 = kotlin.jvm.internal.Intrinsics.areEqual(transition2.getSegment().getTargetState(), s) ? androidx.compose.animation.ExitTransition.INSTANCE.getNone() : function110.invoke(obj2).getInitialContentExit();
                                                    composer2.updateRememberedValue(rememberedValue7);
                                                }
                                                composer2.endReplaceableGroup();
                                                final androidx.compose.animation.ExitTransition exitTransition = (androidx.compose.animation.ExitTransition) rememberedValue7;
                                                S s2 = t;
                                                androidx.compose.animation.core.Transition<S> transition3 = transition;
                                                composer2.startReplaceableGroup(-492369756);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                                                java.lang.Object rememberedValue8 = composer2.rememberedValue();
                                                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue8 = new androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData(kotlin.jvm.internal.Intrinsics.areEqual(s2, transition3.getTargetState()));
                                                    composer2.updateRememberedValue(rememberedValue8);
                                                }
                                                composer2.endReplaceableGroup();
                                                androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData childData = (androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData) rememberedValue8;
                                                androidx.compose.animation.EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                                                androidx.compose.ui.Modifier layout = androidx.compose.ui.layout.LayoutModifierKt.layout(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.1
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
                                                        return m37invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                                    }

                                                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                                    public final androidx.compose.ui.layout.MeasureResult m37invoke3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                                                        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(j);
                                                        int width = mo3402measureBRTryo0.getWidth();
                                                        int height = mo3402measureBRTryo0.getHeight();
                                                        final androidx.compose.animation.ContentTransform contentTransform2 = androidx.compose.animation.ContentTransform.this;
                                                        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, width, height, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.6.1.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return kotlin.Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                                                placementScope.place(androidx.compose.ui.layout.Placeable.this, 0, 0, contentTransform2.getTargetContentZIndex());
                                                            }
                                                        }, 4, null);
                                                    }
                                                });
                                                childData.setTarget(kotlin.jvm.internal.Intrinsics.areEqual(t, transition.getTargetState()));
                                                androidx.compose.ui.Modifier then = layout.then(childData);
                                                androidx.compose.animation.core.Transition<S> transition4 = transition;
                                                final S s3 = t;
                                                kotlin.jvm.functions.Function1 function111 = new kotlin.jvm.functions.Function1<S, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Object obj3) {
                                                        return invoke((androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.AnonymousClass3<S>) obj3);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Boolean invoke(S s4) {
                                                        return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(s4, s3));
                                                    }
                                                };
                                                composer2.startReplaceableGroup(841088387);
                                                boolean changed6 = composer2.changed(exitTransition);
                                                java.lang.Object rememberedValue9 = composer2.rememberedValue();
                                                if (changed6 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue9 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<androidx.compose.animation.EnterExitState, androidx.compose.animation.EnterExitState, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Boolean invoke(androidx.compose.animation.EnterExitState enterExitState, androidx.compose.animation.EnterExitState enterExitState2) {
                                                            return java.lang.Boolean.valueOf(enterExitState == androidx.compose.animation.EnterExitState.PostExit && enterExitState2 == androidx.compose.animation.EnterExitState.PostExit && !androidx.compose.animation.ExitTransition.this.getData().getHold());
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(rememberedValue9);
                                                }
                                                composer2.endReplaceableGroup();
                                                final androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                                final S s4 = t;
                                                final androidx.compose.runtime.snapshots.SnapshotStateList<S> snapshotStateList4 = snapshotStateList;
                                                final kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, S, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function42 = function4;
                                                androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl(transition4, function111, then, targetContentEnter, exitTransition, (kotlin.jvm.functions.Function2) rememberedValue9, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -616195562, true, new kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                                        invoke(animatedVisibilityScope, composer3, num.intValue());
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    public final void invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer3, int i13) {
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C745@38244L253,*753@38659L43,754@38730L24:AnimatedContent.kt#xbi5r1");
                                                        if ((i13 & 14) == 0) {
                                                            i13 |= composer3.changed(animatedVisibilityScope) ? 4 : 2;
                                                        }
                                                        if ((i13 & 91) == 18 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventStart(-616195562, i13, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:745)");
                                                        }
                                                        final androidx.compose.runtime.snapshots.SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                                        final S s5 = s4;
                                                        final androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                                                        androidx.compose.runtime.EffectsKt.DisposableEffect(animatedVisibilityScope, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.6.1.5.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                                                                final androidx.compose.runtime.snapshots.SnapshotStateList<S> snapshotStateList6 = snapshotStateList5;
                                                                final S s6 = s5;
                                                                final androidx.compose.animation.AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                                                                return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$invoke$$inlined$onDispose$1
                                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                                    public void dispose() {
                                                                        androidx.compose.runtime.snapshots.SnapshotStateList.this.remove(s6);
                                                                        animatedContentTransitionScopeImpl4.getTargetSizeMap$animation_release().remove(s6);
                                                                    }
                                                                };
                                                            }
                                                        }, composer3, i13 & 14);
                                                        java.util.Map targetSizeMap$animation_release = animatedContentTransitionScopeImpl2.getTargetSizeMap$animation_release();
                                                        S s6 = s4;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNull(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                        targetSizeMap$animation_release.put(s6, ((androidx.compose.animation.AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation_release());
                                                        composer3.startReplaceableGroup(-492369756);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(remember):Composables.kt#9igjgp");
                                                        java.lang.Object rememberedValue10 = composer3.rememberedValue();
                                                        if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                            rememberedValue10 = new androidx.compose.animation.AnimatedContentScopeImpl(animatedVisibilityScope);
                                                            composer3.updateRememberedValue(rememberedValue10);
                                                        }
                                                        composer3.endReplaceableGroup();
                                                        function42.invoke((androidx.compose.animation.AnimatedContentScopeImpl) rememberedValue10, s4, composer3, 0);
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }), composer2, 12582912, 64);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        i7++;
                                        map = map2;
                                        size = size;
                                        snapshotStateList2 = snapshotStateList3;
                                    }
                                }
                                java.util.Map map3 = map;
                                androidx.compose.animation.core.Transition.Segment<S> segment = transition.getSegment();
                                startRestartGroup.startReplaceableGroup(511388516);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                changed4 = startRestartGroup.changed(segment) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.ui.Modifier then = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((androidx.compose.animation.ContentTransform) rememberedValue4, startRestartGroup, 72));
                                startRestartGroup.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new androidx.compose.animation.AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl);
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.animation.AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (androidx.compose.animation.AnimatedContentMeasurePolicy) rememberedValue5;
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then);
                                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, animatedContentMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
                                startRestartGroup.startReplaceableGroup(-441506448);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "");
                                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList4 = snapshotStateList;
                                size2 = snapshotStateList4.size();
                                for (i8 = 0; i8 < size2; i8++) {
                                    java.lang.Object obj = snapshotStateList4.get(i8);
                                    startRestartGroup.startMovableGroup(-1739558576, function14.invoke(obj));
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "767@39187L8");
                                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) map3.get(obj);
                                    if (function2 != null) {
                                        function2.invoke(startRestartGroup, 0);
                                    }
                                    startRestartGroup.endMovableGroup();
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                alignment3 = alignment2;
                                function16 = function14;
                                modifier3 = modifier4;
                                function17 = function15;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                function17 = function13;
                                alignment3 = alignment2;
                                function16 = function14;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
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

                                    public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                                        androidx.compose.animation.AnimatedContentKt.AnimatedContent(transition, modifier3, function17, alignment3, function16, function4, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((374491 & i3) == 74898) {
                        }
                        if (i11 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection2);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(transition);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new androidx.compose.animation.AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceableGroup();
                        animatedContentTransitionScopeImpl = rememberedValue;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed2 = startRestartGroup.changed(transition);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue2;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        changed3 = startRestartGroup.changed(transition);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue3 = new java.util.LinkedHashMap();
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceableGroup();
                        map = (java.util.Map) rememberedValue3;
                        if (!snapshotStateList.contains(transition.getCurrentState())) {
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                            it = snapshotStateList.iterator();
                            i9 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                }
                                i9++;
                            }
                            if (i9 != i10) {
                            }
                        }
                        if (map.containsKey(transition.getTargetState())) {
                        }
                        map.clear();
                        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList22 = snapshotStateList;
                        size = snapshotStateList22.size();
                        i7 = 0;
                        while (i7 < size) {
                        }
                        java.util.Map map32 = map;
                        androidx.compose.animation.core.Transition.Segment<S> segment2 = transition.getSegment();
                        startRestartGroup.startReplaceableGroup(511388516);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                        changed4 = startRestartGroup.changed(segment2) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.ui.Modifier then2 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((androidx.compose.animation.ContentTransform) rememberedValue4, startRestartGroup, 72));
                        startRestartGroup.startReplaceableGroup(-492369756);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.animation.AnimatedContentMeasurePolicy animatedContentMeasurePolicy2 = (androidx.compose.animation.AnimatedContentMeasurePolicy) rememberedValue5;
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then2);
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, animatedContentMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m1641constructorimpl.getInserting()) {
                        }
                        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
                        startRestartGroup.startReplaceableGroup(-441506448);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "");
                        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList42 = snapshotStateList;
                        size2 = snapshotStateList42.size();
                        while (i8 < size2) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        alignment3 = alignment2;
                        function16 = function14;
                        modifier3 = modifier4;
                        function17 = function15;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function14 = function12;
                    if ((i2 & 16) != 0) {
                    }
                    if ((374491 & i3) == 74898) {
                    }
                    if (i11 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    java.lang.Object consume22 = startRestartGroup.consume(localLayoutDirection22);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume22;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(transition);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new androidx.compose.animation.AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    animatedContentTransitionScopeImpl = rememberedValue;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(transition);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    changed3 = startRestartGroup.changed(transition);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue3 = new java.util.LinkedHashMap();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    map = (java.util.Map) rememberedValue3;
                    if (!snapshotStateList.contains(transition.getCurrentState())) {
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (map.containsKey(transition.getTargetState())) {
                    }
                    map.clear();
                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList222 = snapshotStateList;
                    size = snapshotStateList222.size();
                    i7 = 0;
                    while (i7 < size) {
                    }
                    java.util.Map map322 = map;
                    androidx.compose.animation.core.Transition.Segment<S> segment22 = transition.getSegment();
                    startRestartGroup.startReplaceableGroup(511388516);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                    changed4 = startRestartGroup.changed(segment22) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.Modifier then22 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((androidx.compose.animation.ContentTransform) rememberedValue4, startRestartGroup, 72));
                    startRestartGroup.startReplaceableGroup(-492369756);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.animation.AnimatedContentMeasurePolicy animatedContentMeasurePolicy22 = (androidx.compose.animation.AnimatedContentMeasurePolicy) rememberedValue5;
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then22);
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, animatedContentMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m1641constructorimpl.getInserting()) {
                    }
                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                    modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
                    startRestartGroup.startReplaceableGroup(-441506448);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "");
                    androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList422 = snapshotStateList;
                    size2 = snapshotStateList422.size();
                    while (i8 < size2) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    alignment3 = alignment2;
                    function16 = function14;
                    modifier3 = modifier4;
                    function17 = function15;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                function14 = function12;
                if ((i2 & 16) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                if (i11 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume222 = startRestartGroup.consume(localLayoutDirection222);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume222;
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(transition);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new androidx.compose.animation.AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                animatedContentTransitionScopeImpl = rememberedValue;
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(transition);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue2;
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(transition);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue3 = new java.util.LinkedHashMap();
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                map = (java.util.Map) rememberedValue3;
                if (!snapshotStateList.contains(transition.getCurrentState())) {
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (map.containsKey(transition.getTargetState())) {
                }
                map.clear();
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2222 = snapshotStateList;
                size = snapshotStateList2222.size();
                i7 = 0;
                while (i7 < size) {
                }
                java.util.Map map3222 = map;
                androidx.compose.animation.core.Transition.Segment<S> segment222 = transition.getSegment();
                startRestartGroup.startReplaceableGroup(511388516);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed4 = startRestartGroup.changed(segment222) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.Modifier then222 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((androidx.compose.animation.ContentTransform) rememberedValue4, startRestartGroup, 72));
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.animation.AnimatedContentMeasurePolicy animatedContentMeasurePolicy222 = (androidx.compose.animation.AnimatedContentMeasurePolicy) rememberedValue5;
                startRestartGroup.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then222);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, animatedContentMeasurePolicy222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m1641constructorimpl.getInserting()) {
                }
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                modifierMaterializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
                startRestartGroup.startReplaceableGroup(-441506448);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "");
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList4222 = snapshotStateList;
                size2 = snapshotStateList4222.size();
                while (i8 < size2) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                alignment3 = alignment2;
                function16 = function14;
                modifier3 = modifier4;
                function17 = function15;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            function14 = function12;
            if ((i2 & 16) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection2222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2222 = startRestartGroup.consume(localLayoutDirection2222);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2222;
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(transition);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new androidx.compose.animation.AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            animatedContentTransitionScopeImpl = rememberedValue;
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(transition);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue2;
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed3 = startRestartGroup.changed(transition);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue3 = new java.util.LinkedHashMap();
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            map = (java.util.Map) rememberedValue3;
            if (!snapshotStateList.contains(transition.getCurrentState())) {
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (map.containsKey(transition.getTargetState())) {
            }
            map.clear();
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList22222 = snapshotStateList;
            size = snapshotStateList22222.size();
            i7 = 0;
            while (i7 < size) {
            }
            java.util.Map map32222 = map;
            androidx.compose.animation.core.Transition.Segment<S> segment2222 = transition.getSegment();
            startRestartGroup.startReplaceableGroup(511388516);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            changed4 = startRestartGroup.changed(segment2222) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier then2222 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((androidx.compose.animation.ContentTransform) rememberedValue4, startRestartGroup, 72));
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.animation.AnimatedContentMeasurePolicy animatedContentMeasurePolicy2222 = (androidx.compose.animation.AnimatedContentMeasurePolicy) rememberedValue5;
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then2222);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, animatedContentMeasurePolicy2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m1641constructorimpl.getInserting()) {
            }
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
            modifierMaterializerOf2222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
            startRestartGroup.startReplaceableGroup(-441506448);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "");
            androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList42222 = snapshotStateList;
            size2 = snapshotStateList42222.size();
            while (i8 < size2) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            alignment3 = alignment2;
            function16 = function14;
            modifier3 = modifier4;
            function17 = function15;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        function14 = function12;
        if ((i2 & 16) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        if (i11 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection22222 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume22222 = startRestartGroup.consume(localLayoutDirection22222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume22222;
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(transition);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new androidx.compose.animation.AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        animatedContentTransitionScopeImpl = rememberedValue;
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(transition);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue2;
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(transition);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new java.util.LinkedHashMap();
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        map = (java.util.Map) rememberedValue3;
        if (!snapshotStateList.contains(transition.getCurrentState())) {
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (map.containsKey(transition.getTargetState())) {
        }
        map.clear();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList222222 = snapshotStateList;
        size = snapshotStateList222222.size();
        i7 = 0;
        while (i7 < size) {
        }
        java.util.Map map322222 = map;
        androidx.compose.animation.core.Transition.Segment<S> segment22222 = transition.getSegment();
        startRestartGroup.startReplaceableGroup(511388516);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed4 = startRestartGroup.changed(segment22222) | startRestartGroup.changed(animatedContentTransitionScopeImpl);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue4 = function15.invoke(animatedContentTransitionScopeImpl);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.Modifier then22222 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((androidx.compose.animation.ContentTransform) rememberedValue4, startRestartGroup, 72));
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.animation.AnimatedContentMeasurePolicy animatedContentMeasurePolicy22222 = (androidx.compose.animation.AnimatedContentMeasurePolicy) rememberedValue5;
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then22222);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, animatedContentMeasurePolicy22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
        modifierMaterializerOf22222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -740835328, "C:AnimatedContent.kt#xbi5r1");
        startRestartGroup.startReplaceableGroup(-441506448);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "");
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList422222 = snapshotStateList;
        size2 = snapshotStateList422222.size();
        while (i8 < size2) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        alignment3 = alignment2;
        function16 = function14;
        modifier3 = modifier4;
        function17 = function15;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
