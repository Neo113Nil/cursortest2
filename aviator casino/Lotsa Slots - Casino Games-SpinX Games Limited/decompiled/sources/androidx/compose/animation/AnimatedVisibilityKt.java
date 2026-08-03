package androidx.compose.animation;

/* compiled from: AnimatedVisibility.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0091\u0001\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001aa\u0010\u001b\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010 \u001aJ\u0010\u001b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00012\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\u00070\"¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010#\u001a[\u0010\u001b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010$\u001ak\u0010%\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0002\u0010&\u001am\u0010\u001b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010'\u001ae\u0010\u001b\u001a\u00020\u0007*\u00020(2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010)\u001a_\u0010\u001b\u001a\u00020\u0007*\u00020(2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010*\u001ae\u0010\u001b\u001a\u00020\u0007*\u00020+2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001d2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010,\u001a_\u0010\u001b\u001a\u00020\u0007*\u00020+2\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00070\u000b¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010-\u001a9\u0010.\u001a\u00020\u0003\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010/\u001a\u0002H\bH\u0003¢\u0006\u0002\u00100\"\u001e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u00061²\u0006\"\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0013\"\u0004\b\u0000\u0010\bX\u008a\u0084\u0002²\u0006\u0010\u00103\u001a\u00020\u0001\"\u0004\b\u0000\u0010\bX\u008a\u0084\u0002"}, d2 = {"exitFinished", "", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getExitFinished", "(Landroidx/compose/animation/core/Transition;)Z", "AnimatedEnterExitImpl", "", "T", "transition", com.helpshift.HelpshiftEvent.DATA_SDK_VISIBLE, "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "shouldDisposeBlock", "Lkotlin/Function2;", "onLookaheadMeasured", "Landroidx/compose/animation/OnLookaheadMeasured;", "content", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function2;Landroidx/compose/animation/OnLookaheadMeasured;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AnimatedVisibility", "visibleState", "Landroidx/compose/animation/core/MutableTransitionState;", "label", "", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "initiallyVisible", "Lkotlin/Function0;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "AnimatedVisibilityImpl", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "targetEnterExit", "targetState", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation_release", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0051  */
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
        final java.lang.String str3;
        final androidx.compose.animation.EnterTransition enterTransition3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2088733774);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)133@6955L32,134@6992L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
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
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        if ((i2 & 32) != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                            if ((i3 & 374491) == 74898 || !startRestartGroup.getSkipping()) {
                                companion = i7 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                androidx.compose.animation.EnterTransition plus = i4 == 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                                androidx.compose.animation.ExitTransition plus2 = i5 == 0 ? androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                                java.lang.String str4 = i6 == 0 ? "AnimatedVisibility" : str2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(2088733774, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:132)");
                                }
                                int i8 = i3 << 3;
                                int i9 = (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (i3 & 458752);
                                java.lang.String str5 = str4;
                                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                    public final java.lang.Boolean invoke(boolean z2) {
                                        return java.lang.Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, companion, plus, plus2, function3, startRestartGroup, i9);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                exitTransition2 = plus2;
                                str3 = str5;
                                enterTransition3 = plus;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                companion = modifier2;
                                enterTransition3 = enterTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.compose.ui.Modifier modifier3 = companion;
                                final androidx.compose.animation.ExitTransition exitTransition3 = exitTransition2;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
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
                                        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(z, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 374491) == 74898) {
                        }
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = i3 << 3;
                        int i92 = (i82 & 57344) | (i82 & 896) | 48 | (i82 & 7168) | (i3 & 458752);
                        java.lang.String str52 = str4;
                        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            public final java.lang.Boolean invoke(boolean z2) {
                                return java.lang.Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, companion, plus, plus2, function3, startRestartGroup, i92);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        exitTransition2 = plus2;
                        str3 = str52;
                        enterTransition3 = plus;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((i3 & 374491) == 74898) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i822 = i3 << 3;
                    int i922 = (i822 & 57344) | (i822 & 896) | 48 | (i822 & 7168) | (i3 & 458752);
                    java.lang.String str522 = str4;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        public final java.lang.Boolean invoke(boolean z2) {
                            return java.lang.Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, companion, plus, plus2, function3, startRestartGroup, i922);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    exitTransition2 = plus2;
                    str3 = str522;
                    enterTransition3 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((i3 & 374491) == 74898) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i8222 = i3 << 3;
                int i9222 = (i8222 & 57344) | (i8222 & 896) | 48 | (i8222 & 7168) | (i3 & 458752);
                java.lang.String str5222 = str4;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    public final java.lang.Boolean invoke(boolean z2) {
                        return java.lang.Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, companion, plus, plus2, function3, startRestartGroup, i9222);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                exitTransition2 = plus2;
                str3 = str5222;
                enterTransition3 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
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
            if ((i2 & 32) != 0) {
            }
            if ((i3 & 374491) == 74898) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i82222 = i3 << 3;
            int i92222 = (i82222 & 57344) | (i82222 & 896) | 48 | (i82222 & 7168) | (i3 & 458752);
            java.lang.String str52222 = str4;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                public final java.lang.Boolean invoke(boolean z2) {
                    return java.lang.Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, plus, plus2, function3, startRestartGroup, i92222);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            exitTransition2 = plus2;
            str3 = str52222;
            enterTransition3 = plus;
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
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((i3 & 374491) == 74898) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i822222 = i3 << 3;
        int i922222 = (i822222 & 57344) | (i822222 & 896) | 48 | (i822222 & 7168) | (i3 & 458752);
        java.lang.String str522222 = str4;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
            public final java.lang.Boolean invoke(boolean z2) {
                return java.lang.Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, companion, plus, plus2, function3, startRestartGroup, i922222);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        exitTransition2 = plus2;
        str3 = str522222;
        enterTransition3 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0053  */
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
        final androidx.compose.animation.ExitTransition plus;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.animation.EnterTransition enterTransition3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1741346906);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)208@11260L32,209@11297L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                androidx.compose.ui.Modifier.Companion companion = i7 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                androidx.compose.animation.EnterTransition plus2 = i4 == 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null)) : enterTransition2;
                                plus = i5 == 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null)) : exitTransition2;
                                java.lang.String str4 = i6 == 0 ? "AnimatedVisibility" : str2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1741346906, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:207)");
                                }
                                int i8 = i3 >> 3;
                                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i8 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                                    public final java.lang.Boolean invoke(boolean z2) {
                                        return java.lang.Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i8 & 458752));
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier3 = companion;
                                enterTransition3 = plus2;
                                str3 = str4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                enterTransition3 = enterTransition2;
                                plus = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
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
                                        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope.this, z, modifier3, enterTransition3, plus, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = i3 >> 3;
                        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i82 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                            public final java.lang.Boolean invoke(boolean z2) {
                                return java.lang.Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i82 & 458752));
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = companion;
                        enterTransition3 = plus2;
                        str3 = str4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i822 = i3 >> 3;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i822 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        public final java.lang.Boolean invoke(boolean z2) {
                            return java.lang.Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i822 & 458752));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = companion;
                    enterTransition3 = plus2;
                    str3 = str4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((i3 & 2995921) == 599184) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i8222 = i3 >> 3;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i8222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    public final java.lang.Boolean invoke(boolean z2) {
                        return java.lang.Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i8222 & 458752));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = companion;
                enterTransition3 = plus2;
                str3 = str4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
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
            if ((i2 & 32) != 0) {
            }
            if ((i3 & 2995921) == 599184) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i82222 = i3 >> 3;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i82222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                public final java.lang.Boolean invoke(boolean z2) {
                    return java.lang.Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i82222 & 458752));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
            enterTransition3 = plus2;
            str3 = str4;
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
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((i3 & 2995921) == 599184) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i822222 = i3 >> 3;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i822222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
            public final java.lang.Boolean invoke(boolean z2) {
                return java.lang.Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i822222 & 458752));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        enterTransition3 = plus2;
        str3 = str4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0053  */
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
        final androidx.compose.animation.ExitTransition plus;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.animation.EnterTransition enterTransition3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1766503102);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)281@15543L32,282@15580L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                androidx.compose.ui.Modifier.Companion companion = i7 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                androidx.compose.animation.EnterTransition plus2 = i4 == 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)) : enterTransition2;
                                plus = i5 == 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)) : exitTransition2;
                                java.lang.String str4 = i6 == 0 ? "AnimatedVisibility" : str2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(1766503102, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:280)");
                                }
                                int i8 = i3 >> 3;
                                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i8 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                                    public final java.lang.Boolean invoke(boolean z2) {
                                        return java.lang.Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i8 & 458752));
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier3 = companion;
                                enterTransition3 = plus2;
                                str3 = str4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                enterTransition3 = enterTransition2;
                                plus = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
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
                                        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope.this, z, modifier3, enterTransition3, plus, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = i3 >> 3;
                        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i82 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            public final java.lang.Boolean invoke(boolean z2) {
                                return java.lang.Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i82 & 458752));
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = companion;
                        enterTransition3 = plus2;
                        str3 = str4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i822 = i3 >> 3;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i822 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        public final java.lang.Boolean invoke(boolean z2) {
                            return java.lang.Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i822 & 458752));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = companion;
                    enterTransition3 = plus2;
                    str3 = str4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((i3 & 2995921) == 599184) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i8222 = i3 >> 3;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i8222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    public final java.lang.Boolean invoke(boolean z2) {
                        return java.lang.Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i8222 & 458752));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = companion;
                enterTransition3 = plus2;
                str3 = str4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
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
            if ((i2 & 32) != 0) {
            }
            if ((i3 & 2995921) == 599184) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i82222 = i3 >> 3;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i82222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                public final java.lang.Boolean invoke(boolean z2) {
                    return java.lang.Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i82222 & 458752));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
            enterTransition3 = plus2;
            str3 = str4;
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
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((i3 & 2995921) == 599184) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i822222 = i3 >> 3;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition(java.lang.Boolean.valueOf(z), str4, startRestartGroup, (i822222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
            public final java.lang.Boolean invoke(boolean z2) {
                return java.lang.Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i822222 & 458752));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        enterTransition3 = plus2;
        str3 = str4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004c  */
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
        final java.lang.String str3;
        final androidx.compose.animation.EnterTransition enterTransition3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-222898426);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)387@20969L37,388@21011L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(mutableTransitionState) ? 4 : 2) | i;
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
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                        if ((i2 & 32) != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                            if ((i3 & 374491) == 74898 || !startRestartGroup.getSkipping()) {
                                companion = i7 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                androidx.compose.animation.EnterTransition plus = i4 == 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                                androidx.compose.animation.ExitTransition plus2 = i5 == 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null)) : exitTransition2;
                                java.lang.String str4 = i6 == 0 ? "AnimatedVisibility" : str2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-222898426, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:386)");
                                }
                                int i8 = i3 << 3;
                                int i9 = (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (i3 & 458752);
                                java.lang.String str5 = str4;
                                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                    public final java.lang.Boolean invoke(boolean z) {
                                        return java.lang.Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, companion, plus, plus2, function3, startRestartGroup, i9);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                exitTransition2 = plus2;
                                str3 = str5;
                                enterTransition3 = plus;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                companion = modifier2;
                                enterTransition3 = enterTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.compose.ui.Modifier modifier3 = companion;
                                final androidx.compose.animation.ExitTransition exitTransition3 = exitTransition2;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
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
                                        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(mutableTransitionState, modifier3, enterTransition3, exitTransition3, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 374491) == 74898) {
                        }
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = i3 << 3;
                        int i92 = (i82 & 57344) | (i82 & 896) | 48 | (i82 & 7168) | (i3 & 458752);
                        java.lang.String str52 = str4;
                        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            public final java.lang.Boolean invoke(boolean z) {
                                return java.lang.Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, companion, plus, plus2, function3, startRestartGroup, i92);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        exitTransition2 = plus2;
                        str3 = str52;
                        enterTransition3 = plus;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((i3 & 374491) == 74898) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i822 = i3 << 3;
                    int i922 = (i822 & 57344) | (i822 & 896) | 48 | (i822 & 7168) | (i3 & 458752);
                    java.lang.String str522 = str4;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        public final java.lang.Boolean invoke(boolean z) {
                            return java.lang.Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, companion, plus, plus2, function3, startRestartGroup, i922);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    exitTransition2 = plus2;
                    str3 = str522;
                    enterTransition3 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((i3 & 374491) == 74898) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i8222 = i3 << 3;
                int i9222 = (i8222 & 57344) | (i8222 & 896) | 48 | (i8222 & 7168) | (i3 & 458752);
                java.lang.String str5222 = str4;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    public final java.lang.Boolean invoke(boolean z) {
                        return java.lang.Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, companion, plus, plus2, function3, startRestartGroup, i9222);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                exitTransition2 = plus2;
                str3 = str5222;
                enterTransition3 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
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
            if ((i2 & 32) != 0) {
            }
            if ((i3 & 374491) == 74898) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i82222 = i3 << 3;
            int i92222 = (i82222 & 57344) | (i82222 & 896) | 48 | (i82222 & 7168) | (i3 & 458752);
            java.lang.String str52222 = str4;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                public final java.lang.Boolean invoke(boolean z) {
                    return java.lang.Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, plus, plus2, function3, startRestartGroup, i92222);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            exitTransition2 = plus2;
            str3 = str52222;
            enterTransition3 = plus;
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
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((i3 & 374491) == 74898) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i822222 = i3 << 3;
        int i922222 = (i822222 & 57344) | (i822222 & 896) | 48 | (i822222 & 7168) | (i3 & 458752);
        java.lang.String str522222 = str4;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
            public final java.lang.Boolean invoke(boolean z) {
                return java.lang.Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, companion, plus, plus2, function3, startRestartGroup, i922222);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        exitTransition2 = plus2;
        str3 = str522222;
        enterTransition3 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004e  */
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
        final androidx.compose.animation.ExitTransition plus;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.animation.EnterTransition enterTransition3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(836509870);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)462@25330L37,463@25372L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(mutableTransitionState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                androidx.compose.ui.Modifier.Companion companion = i7 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                androidx.compose.animation.EnterTransition plus2 = i4 == 0 ? androidx.compose.animation.EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)) : enterTransition2;
                                plus = i5 == 0 ? androidx.compose.animation.EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                                java.lang.String str4 = i6 == 0 ? "AnimatedVisibility" : str2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(836509870, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:461)");
                                }
                                int i8 = i3 >> 3;
                                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i8 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                                    public final java.lang.Boolean invoke(boolean z) {
                                        return java.lang.Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i8 & 458752));
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier3 = companion;
                                enterTransition3 = plus2;
                                str3 = str4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                enterTransition3 = enterTransition2;
                                plus = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
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
                                        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.RowScope.this, mutableTransitionState, modifier3, enterTransition3, plus, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = i3 >> 3;
                        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i82 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                            public final java.lang.Boolean invoke(boolean z) {
                                return java.lang.Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i82 & 458752));
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = companion;
                        enterTransition3 = plus2;
                        str3 = str4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i822 = i3 >> 3;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i822 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        public final java.lang.Boolean invoke(boolean z) {
                            return java.lang.Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i822 & 458752));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = companion;
                    enterTransition3 = plus2;
                    str3 = str4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((i3 & 2995921) == 599184) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i8222 = i3 >> 3;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i8222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    public final java.lang.Boolean invoke(boolean z) {
                        return java.lang.Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i8222 & 458752));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = companion;
                enterTransition3 = plus2;
                str3 = str4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
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
            if ((i2 & 32) != 0) {
            }
            if ((i3 & 2995921) == 599184) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i82222 = i3 >> 3;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i82222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                public final java.lang.Boolean invoke(boolean z) {
                    return java.lang.Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i82222 & 458752));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
            enterTransition3 = plus2;
            str3 = str4;
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
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((i3 & 2995921) == 599184) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i822222 = i3 >> 3;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i822222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
            public final java.lang.Boolean invoke(boolean z) {
                return java.lang.Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i822222 & 458752));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        enterTransition3 = plus2;
        str3 = str4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x004e  */
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
        final androidx.compose.animation.ExitTransition plus;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.animation.EnterTransition enterTransition3;
        final java.lang.String str3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-850656618);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)538@29783L37,539@29825L84:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(mutableTransitionState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                enterTransition2 = enterTransition;
                i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                androidx.compose.ui.Modifier.Companion companion = i7 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                androidx.compose.animation.EnterTransition plus2 = i4 == 0 ? androidx.compose.animation.EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)) : enterTransition2;
                                plus = i5 == 0 ? androidx.compose.animation.EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                                java.lang.String str4 = i6 == 0 ? "AnimatedVisibility" : str2;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-850656618, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:537)");
                                }
                                int i8 = i3 >> 3;
                                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i8 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                                    public final java.lang.Boolean invoke(boolean z) {
                                        return java.lang.Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i8 & 458752));
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier3 = companion;
                                enterTransition3 = plus2;
                                str3 = str4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                enterTransition3 = enterTransition2;
                                plus = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
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
                                        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(androidx.compose.foundation.layout.ColumnScope.this, mutableTransitionState, modifier3, enterTransition3, plus, str3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        int i82 = i3 >> 3;
                        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i82 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            public final java.lang.Boolean invoke(boolean z) {
                                return java.lang.Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i82 & 458752));
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = companion;
                        enterTransition3 = plus2;
                        str3 = str4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i822 = i3 >> 3;
                    AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i822 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        public final java.lang.Boolean invoke(boolean z) {
                            return java.lang.Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i822 & 458752));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = companion;
                    enterTransition3 = plus2;
                    str3 = str4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if ((i3 & 2995921) == 599184) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i8222 = i3 >> 3;
                AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i8222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    public final java.lang.Boolean invoke(boolean z) {
                        return java.lang.Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i8222 & 458752));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = companion;
                enterTransition3 = plus2;
                str3 = str4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
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
            if ((i2 & 32) != 0) {
            }
            if ((i3 & 2995921) == 599184) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i82222 = i3 >> 3;
            AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i82222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                public final java.lang.Boolean invoke(boolean z) {
                    return java.lang.Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i82222 & 458752));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
            enterTransition3 = plus2;
            str3 = str4;
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
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if ((i3 & 2995921) == 599184) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i822222 = i3 >> 3;
        AnimatedVisibilityImpl(androidx.compose.animation.core.TransitionKt.updateTransition((androidx.compose.animation.core.MutableTransitionState) mutableTransitionState, str4, startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | (i822222 & 14) | ((i3 >> 12) & 112), 0), new kotlin.jvm.functions.Function1<java.lang.Boolean, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
            public final java.lang.Boolean invoke(boolean z) {
                return java.lang.Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, companion, plus2, plus, function3, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i822222 & 458752));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        enterTransition3 = plus2;
        str3 = str4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void AnimatedVisibility(final androidx.compose.animation.core.Transition<T> transition, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, androidx.compose.ui.Modifier modifier, androidx.compose.animation.EnterTransition enterTransition, androidx.compose.animation.ExitTransition exitTransition, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        androidx.compose.animation.EnterTransition enterTransition2;
        int i6;
        androidx.compose.animation.ExitTransition exitTransition2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.animation.ExitTransition exitTransition3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1031950689);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(4,3,1,2)612@34154L79:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    enterTransition2 = enterTransition;
                    i3 |= startRestartGroup.changed(enterTransition2) ? 2048 : 1024;
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        exitTransition2 = exitTransition;
                        i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                        if ((i2 & 16) != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                            androidx.compose.ui.Modifier.Companion companion = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            androidx.compose.animation.EnterTransition plus = i5 != 0 ? androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(androidx.compose.animation.EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                            androidx.compose.animation.ExitTransition plus2 = i6 != 0 ? androidx.compose.animation.EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1031950689, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:612)");
                            }
                            AnimatedVisibilityImpl(transition, function1, companion, plus, plus2, function3, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = companion;
                            exitTransition3 = plus2;
                            enterTransition2 = plus;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            exitTransition3 = exitTransition2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.animation.EnterTransition enterTransition3 = enterTransition2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
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

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i7) {
                                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(transition, function1, modifier3, enterTransition3, exitTransition3, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    exitTransition2 = exitTransition;
                    if ((i2 & 16) != 0) {
                    }
                    if ((374491 & i3) == 74898) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    AnimatedVisibilityImpl(transition, function1, companion, plus, plus2, function3, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = companion;
                    exitTransition3 = plus2;
                    enterTransition2 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                enterTransition2 = enterTransition;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                AnimatedVisibilityImpl(transition, function1, companion, plus, plus2, function3, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier3 = companion;
                exitTransition3 = plus2;
                enterTransition2 = plus;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            enterTransition2 = enterTransition;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            AnimatedVisibilityImpl(transition, function1, companion, plus, plus2, function3, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
            exitTransition3 = plus2;
            enterTransition2 = plus;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        enterTransition2 = enterTransition;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        exitTransition2 = exitTransition;
        if ((i2 & 16) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        AnimatedVisibilityImpl(transition, function1, companion, plus, plus2, function3, startRestartGroup, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (i3 & 57344) | (i3 & 458752));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier3 = companion;
        exitTransition3 = plus2;
        enterTransition2 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0055  */
    @kotlin.Deprecated(message = "AnimatedVisibility no longer accepts initiallyVisible as a parameter, please use AnimatedVisibility(MutableTransitionState, Modifier, ...) API instead", replaceWith = @kotlin.ReplaceWith(expression = "AnimatedVisibility(transitionState = remember { MutableTransitionState(initiallyVisible) }\n.apply { targetState = visible },\nmodifier = modifier,\nenter = enter,\nexit = exit) {\ncontent() \n}", imports = {"androidx.compose.animation.core.MutableTransitionState"}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final boolean z, androidx.compose.ui.Modifier modifier, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, final boolean z2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.ui.Modifier.Companion companion;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1121582420);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)*715@38991L53,714@38952L214:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                i3 |= startRestartGroup.changed(enterTransition) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(exitTransition) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
            }
            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1121582420, i3, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:714)");
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.animation.core.MutableTransitionState(java.lang.Boolean.valueOf(z2));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.animation.core.MutableTransitionState mutableTransitionState = (androidx.compose.animation.core.MutableTransitionState) rememberedValue;
                mutableTransitionState.setTargetState(java.lang.Boolean.valueOf(z));
                AnimatedVisibility((androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean>) mutableTransitionState, companion, enterTransition, exitTransition, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1996320812, true, new kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer2, int i5) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C721@39155L9:AnimatedVisibility.kt#xbi5r1");
                        if ((i5 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1996320812, i5, -1, "androidx.compose.animation.AnimatedVisibility.<anonymous> (AnimatedVisibility.kt:721)");
                        }
                        function2.invoke(composer2, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                }), startRestartGroup, (i3 & 7168) | androidx.compose.animation.core.MutableTransitionState.$stable | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896), 16);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$17
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
                        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(z, modifier3, enterTransition, exitTransition, z2, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        if (i4 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.animation.core.MutableTransitionState mutableTransitionState2 = (androidx.compose.animation.core.MutableTransitionState) rememberedValue;
        mutableTransitionState2.setTargetState(java.lang.Boolean.valueOf(z));
        AnimatedVisibility((androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean>) mutableTransitionState2, companion, enterTransition, exitTransition, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1996320812, true, new kotlin.jvm.functions.Function3<androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer2, int i5) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C721@39155L9:AnimatedVisibility.kt#xbi5r1");
                if ((i5 & 81) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1996320812, i5, -1, "androidx.compose.animation.AnimatedVisibility.<anonymous> (AnimatedVisibility.kt:721)");
                }
                function2.invoke(composer2, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }), startRestartGroup, (i3 & 7168) | androidx.compose.animation.core.MutableTransitionState.$stable | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896), 16);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final <T> void AnimatedVisibilityImpl(final androidx.compose.animation.core.Transition<T> transition, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, final androidx.compose.ui.Modifier modifier, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(429978603);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibilityImpl)P(4,5,3,1,2)740@39776L703:AnimatedVisibility.kt#xbi5r1");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= startRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((374491 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(429978603, i2, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:739)");
            }
            startRestartGroup.startReplaceableGroup(-311853878);
            boolean changedInstance = startRestartGroup.changedInstance(function1) | startRestartGroup.changed(transition);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function3) new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
                        return m68invoke3p2s80s(measureScope, measurable, constraints.getValue());
                    }

                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final androidx.compose.ui.layout.MeasureResult m68invoke3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                        long IntSize;
                        final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(j);
                        if (measureScope.isLookingAhead() && !function1.invoke(transition.getTargetState()).booleanValue()) {
                            IntSize = androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
                        } else {
                            IntSize = androidx.compose.ui.unit.IntSizeKt.IntSize(mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight());
                        }
                        return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(IntSize), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(IntSize), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.1
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
                                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AnimatedEnterExitImpl(transition, function1, androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, (kotlin.jvm.functions.Function3) rememberedValue), enterTransition, exitTransition, new kotlin.jvm.functions.Function2<androidx.compose.animation.EnterExitState, androidx.compose.animation.EnterExitState, java.lang.Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Boolean invoke(androidx.compose.animation.EnterExitState enterExitState, androidx.compose.animation.EnterExitState enterExitState2) {
                    return java.lang.Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == androidx.compose.animation.EnterExitState.PostExit);
                }
            }, null, function3, startRestartGroup, 196608 | (i2 & 14) | (i2 & 112) | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128), 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                    androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibilityImpl(transition, function1, modifier, enterTransition, exitTransition, function3, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0169, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void AnimatedEnterExitImpl(final androidx.compose.animation.core.Transition<T> transition, final kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, final androidx.compose.ui.Modifier modifier, final androidx.compose.animation.EnterTransition enterTransition, final androidx.compose.animation.ExitTransition exitTransition, final kotlin.jvm.functions.Function2<? super androidx.compose.animation.EnterExitState, ? super androidx.compose.animation.EnterExitState, java.lang.Boolean> function2, androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured, final kotlin.jvm.functions.Function3<? super androidx.compose.animation.AnimatedVisibilityScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured2;
        int i6;
        boolean changed;
        java.lang.String str;
        final androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured3;
        androidx.compose.animation.core.Transition createChildTransitionInternal;
        boolean changed2;
        androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1 rememberedValue;
        boolean changed3;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier.Companion companion;
        java.lang.Object rememberedValue3;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer m1641constructorimpl;
        final androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-891967166);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedEnterExitImpl)P(6,7,3,1,2,5,4)788@41251L116,792@41410L40,794@41490L574,815@42162L69,819@42377L39,833@43122L50,816@42244L942:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            i3 |= startRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i4 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((458752 & i) == 0) {
                i4 = startRestartGroup.changedInstance(function2) ? 131072 : 65536;
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((3670016 & i) == 0) {
                onLookaheadMeasured2 = onLookaheadMeasured;
                i3 |= startRestartGroup.changed(onLookaheadMeasured2) ? 1048576 : 524288;
                if ((i2 & 128) == 0) {
                    i7 = (29360128 & i) == 0 ? startRestartGroup.changedInstance(function3) ? 8388608 : 4194304 : 12582912;
                    i6 = i3;
                    if ((23967451 & i6) == 4793490 || !startRestartGroup.getSkipping()) {
                        if (i5 != 0) {
                            onLookaheadMeasured2 = null;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-891967166, i6, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:784)");
                        }
                        if (!function1.invoke(transition.getTargetState()).booleanValue() || function1.invoke(transition.getCurrentState()).booleanValue() || transition.isSeeking()) {
                            int i8 = i6 & 14;
                            startRestartGroup.startReplaceableGroup(1215497572);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(createChildTransition)1010@39937L36,1011@39997L74,1012@40094L39,1013@40145L63:Transition.kt#pdpnli");
                            int i9 = (i8 | 48) & 14;
                            startRestartGroup.startReplaceableGroup(1157296644);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            changed = startRestartGroup.changed(transition);
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (changed) {
                                str = "CC(remember)P(1):Composables.kt#9igjgp";
                            } else {
                                str = "CC(remember)P(1):Composables.kt#9igjgp";
                            }
                            rememberedValue4 = transition.getCurrentState();
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                            startRestartGroup.endReplaceableGroup();
                            if (transition.isSeeking()) {
                                rememberedValue4 = transition.getCurrentState();
                            }
                            startRestartGroup.startReplaceableGroup(-466616829);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C789@41329L28:AnimatedVisibility.kt#xbi5r1");
                            androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured5 = onLookaheadMeasured2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:789)");
                            }
                            int i10 = i8 | (i6 & 112);
                            androidx.compose.animation.EnterExitState targetEnterExit = targetEnterExit(transition, function1, rememberedValue4, startRestartGroup, i10);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceableGroup();
                            T targetState = transition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-466616829);
                            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C789@41329L28:AnimatedVisibility.kt#xbi5r1");
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:789)");
                            }
                            androidx.compose.animation.EnterExitState targetEnterExit2 = targetEnterExit(transition, function1, targetState, startRestartGroup, i10);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceableGroup();
                            java.lang.String str2 = str;
                            onLookaheadMeasured3 = onLookaheadMeasured5;
                            createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, targetEnterExit, targetEnterExit2, "EnterExitTransition", startRestartGroup, i9 | 3072);
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i6 >> 15) & 14);
                            java.lang.Boolean invoke = function2.invoke(createChildTransitionInternal.getCurrentState(), createChildTransitionInternal.getTargetState());
                            startRestartGroup.startReplaceableGroup(-311852107);
                            changed2 = startRestartGroup.changed(createChildTransitionInternal) | startRestartGroup.changed(rememberUpdatedState);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(createChildTransitionInternal, rememberUpdatedState, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.runtime.State produceState = androidx.compose.runtime.SnapshotStateKt.produceState(invoke, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, 64);
                            if (getExitFinished(createChildTransitionInternal) || !AnimatedEnterExitImpl$lambda$6(produceState)) {
                                startRestartGroup.startReplaceableGroup(1157296644);
                                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, str2);
                                changed3 = startRestartGroup.changed(transition);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new androidx.compose.animation.AnimatedVisibilityScopeImpl(createChildTransitionInternal);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                androidx.compose.animation.AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (androidx.compose.animation.AnimatedVisibilityScopeImpl) rememberedValue2;
                                int i11 = i6 >> 6;
                                composer2 = startRestartGroup;
                                androidx.compose.ui.Modifier createModifier = androidx.compose.animation.EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition, exitTransition, "Built-in", composer2, (i11 & 112) | 3072 | (i11 & 896));
                                if (onLookaheadMeasured3 == null) {
                                    companion = androidx.compose.ui.layout.LayoutModifierKt.layout(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function3<androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.MeasureResult invoke(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
                                            return m67invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                        }

                                        /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                        public final androidx.compose.ui.layout.MeasureResult m67invoke3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
                                            final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurable.mo3402measureBRTryo0(j);
                                            androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured6 = androidx.compose.animation.OnLookaheadMeasured.this;
                                            if (measureScope.isLookingAhead()) {
                                                onLookaheadMeasured6.m98invokeozmzZPI(androidx.compose.ui.unit.IntSizeKt.IntSize(mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight()));
                                            }
                                            return androidx.compose.ui.layout.MeasureScope.CC.layout$default(measureScope, mo3402measureBRTryo0.getWidth(), mo3402measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1$1
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
                                                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope, androidx.compose.ui.layout.Placeable.this, 0, 0, 0.0f, 4, null);
                                                }
                                            }, 4, null);
                                        }
                                    });
                                } else {
                                    companion = androidx.compose.ui.Modifier.INSTANCE;
                                }
                                androidx.compose.ui.Modifier then = modifier.then(createModifier.then(companion));
                                composer2.startReplaceableGroup(-492369756);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                                rememberedValue3 = composer2.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new androidx.compose.animation.AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                                    composer2.updateRememberedValue(rememberedValue3);
                                }
                                composer2.endReplaceableGroup();
                                androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue3;
                                composer2.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then);
                                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (!composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -174036415, "C817@42286L9:AnimatedVisibility.kt#xbi5r1");
                                function3.invoke(animatedVisibilityScopeImpl, composer2, java.lang.Integer.valueOf(((i6 >> 18) & 112) | 8));
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                onLookaheadMeasured4 = onLookaheadMeasured3;
                            }
                        } else {
                            onLookaheadMeasured3 = onLookaheadMeasured2;
                        }
                        composer2 = startRestartGroup;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        onLookaheadMeasured4 = onLookaheadMeasured3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        onLookaheadMeasured4 = onLookaheadMeasured2;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
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

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i12) {
                                androidx.compose.animation.AnimatedVisibilityKt.AnimatedEnterExitImpl(transition, function1, modifier, enterTransition, exitTransition, function2, onLookaheadMeasured4, function3, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i7;
                i6 = i3;
                if ((23967451 & i6) == 4793490) {
                }
                if (i5 != 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                if (function1.invoke(transition.getTargetState()).booleanValue()) {
                }
                int i82 = i6 & 14;
                startRestartGroup.startReplaceableGroup(1215497572);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(createChildTransition)1010@39937L36,1011@39997L74,1012@40094L39,1013@40145L63:Transition.kt#pdpnli");
                int i92 = (i82 | 48) & 14;
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(transition);
                java.lang.Object rememberedValue42 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                rememberedValue42 = transition.getCurrentState();
                startRestartGroup.updateRememberedValue(rememberedValue42);
                startRestartGroup.endReplaceableGroup();
                if (transition.isSeeking()) {
                }
                startRestartGroup.startReplaceableGroup(-466616829);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C789@41329L28:AnimatedVisibility.kt#xbi5r1");
                androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured52 = onLookaheadMeasured2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i102 = i82 | (i6 & 112);
                androidx.compose.animation.EnterExitState targetEnterExit3 = targetEnterExit(transition, function1, rememberedValue42, startRestartGroup, i102);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceableGroup();
                T targetState2 = transition.getTargetState();
                startRestartGroup.startReplaceableGroup(-466616829);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C789@41329L28:AnimatedVisibility.kt#xbi5r1");
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.animation.EnterExitState targetEnterExit22 = targetEnterExit(transition, function1, targetState2, startRestartGroup, i102);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.endReplaceableGroup();
                java.lang.String str22 = str;
                onLookaheadMeasured3 = onLookaheadMeasured52;
                createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, targetEnterExit3, targetEnterExit22, "EnterExitTransition", startRestartGroup, i92 | 3072);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i6 >> 15) & 14);
                java.lang.Boolean invoke2 = function2.invoke(createChildTransitionInternal.getCurrentState(), createChildTransitionInternal.getTargetState());
                startRestartGroup.startReplaceableGroup(-311852107);
                changed2 = startRestartGroup.changed(createChildTransitionInternal) | startRestartGroup.changed(rememberUpdatedState2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(createChildTransitionInternal, rememberUpdatedState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.State produceState2 = androidx.compose.runtime.SnapshotStateKt.produceState(invoke2, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, 64);
                if (getExitFinished(createChildTransitionInternal)) {
                }
                startRestartGroup.startReplaceableGroup(1157296644);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, str22);
                changed3 = startRestartGroup.changed(transition);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue2 = new androidx.compose.animation.AnimatedVisibilityScopeImpl(createChildTransitionInternal);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                androidx.compose.animation.AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl2 = (androidx.compose.animation.AnimatedVisibilityScopeImpl) rememberedValue2;
                int i112 = i6 >> 6;
                composer2 = startRestartGroup;
                androidx.compose.ui.Modifier createModifier2 = androidx.compose.animation.EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition, exitTransition, "Built-in", composer2, (i112 & 112) | 3072 | (i112 & 896));
                if (onLookaheadMeasured3 == null) {
                }
                androidx.compose.ui.Modifier then2 = modifier.then(createModifier2.then(companion));
                composer2.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
                rememberedValue3 = composer2.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                composer2.endReplaceableGroup();
                androidx.compose.ui.layout.MeasurePolicy measurePolicy2 = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue3;
                composer2.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then2);
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                composer2.startReusableNode();
                if (!composer2.getInserting()) {
                }
                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m1641constructorimpl.getInserting()) {
                }
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -174036415, "C817@42286L9:AnimatedVisibility.kt#xbi5r1");
                function3.invoke(animatedVisibilityScopeImpl2, composer2, java.lang.Integer.valueOf(((i6 >> 18) & 112) | 8));
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                onLookaheadMeasured4 = onLookaheadMeasured3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            onLookaheadMeasured2 = onLookaheadMeasured;
            if ((i2 & 128) == 0) {
            }
            i3 |= i7;
            i6 = i3;
            if ((23967451 & i6) == 4793490) {
            }
            if (i5 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            if (function1.invoke(transition.getTargetState()).booleanValue()) {
            }
            int i822 = i6 & 14;
            startRestartGroup.startReplaceableGroup(1215497572);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(createChildTransition)1010@39937L36,1011@39997L74,1012@40094L39,1013@40145L63:Transition.kt#pdpnli");
            int i922 = (i822 | 48) & 14;
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(transition);
            java.lang.Object rememberedValue422 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            rememberedValue422 = transition.getCurrentState();
            startRestartGroup.updateRememberedValue(rememberedValue422);
            startRestartGroup.endReplaceableGroup();
            if (transition.isSeeking()) {
            }
            startRestartGroup.startReplaceableGroup(-466616829);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C789@41329L28:AnimatedVisibility.kt#xbi5r1");
            androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured522 = onLookaheadMeasured2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i1022 = i822 | (i6 & 112);
            androidx.compose.animation.EnterExitState targetEnterExit32 = targetEnterExit(transition, function1, rememberedValue422, startRestartGroup, i1022);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            T targetState22 = transition.getTargetState();
            startRestartGroup.startReplaceableGroup(-466616829);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C789@41329L28:AnimatedVisibility.kt#xbi5r1");
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.animation.EnterExitState targetEnterExit222 = targetEnterExit(transition, function1, targetState22, startRestartGroup, i1022);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            java.lang.String str222 = str;
            onLookaheadMeasured3 = onLookaheadMeasured522;
            createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, targetEnterExit32, targetEnterExit222, "EnterExitTransition", startRestartGroup, i922 | 3072);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.State rememberUpdatedState22 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i6 >> 15) & 14);
            java.lang.Boolean invoke22 = function2.invoke(createChildTransitionInternal.getCurrentState(), createChildTransitionInternal.getTargetState());
            startRestartGroup.startReplaceableGroup(-311852107);
            changed2 = startRestartGroup.changed(createChildTransitionInternal) | startRestartGroup.changed(rememberUpdatedState22);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(createChildTransitionInternal, rememberUpdatedState22, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.State produceState22 = androidx.compose.runtime.SnapshotStateKt.produceState(invoke22, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, 64);
            if (getExitFinished(createChildTransitionInternal)) {
            }
            startRestartGroup.startReplaceableGroup(1157296644);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, str222);
            changed3 = startRestartGroup.changed(transition);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue2 = new androidx.compose.animation.AnimatedVisibilityScopeImpl(createChildTransitionInternal);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.animation.AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl22 = (androidx.compose.animation.AnimatedVisibilityScopeImpl) rememberedValue2;
            int i1122 = i6 >> 6;
            composer2 = startRestartGroup;
            androidx.compose.ui.Modifier createModifier22 = androidx.compose.animation.EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition, exitTransition, "Built-in", composer2, (i1122 & 112) | 3072 | (i1122 & 896));
            if (onLookaheadMeasured3 == null) {
            }
            androidx.compose.ui.Modifier then22 = modifier.then(createModifier22.then(companion));
            composer2.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
            rememberedValue3 = composer2.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            composer2.endReplaceableGroup();
            androidx.compose.ui.layout.MeasurePolicy measurePolicy22 = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue3;
            composer2.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then22);
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            composer2.startReusableNode();
            if (!composer2.getInserting()) {
            }
            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m1641constructorimpl.getInserting()) {
            }
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -174036415, "C817@42286L9:AnimatedVisibility.kt#xbi5r1");
            function3.invoke(animatedVisibilityScopeImpl22, composer2, java.lang.Integer.valueOf(((i6 >> 18) & 112) | 8));
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            onLookaheadMeasured4 = onLookaheadMeasured3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i3 |= i4;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        onLookaheadMeasured2 = onLookaheadMeasured;
        if ((i2 & 128) == 0) {
        }
        i3 |= i7;
        i6 = i3;
        if ((23967451 & i6) == 4793490) {
        }
        if (i5 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        if (function1.invoke(transition.getTargetState()).booleanValue()) {
        }
        int i8222 = i6 & 14;
        startRestartGroup.startReplaceableGroup(1215497572);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(createChildTransition)1010@39937L36,1011@39997L74,1012@40094L39,1013@40145L63:Transition.kt#pdpnli");
        int i9222 = (i8222 | 48) & 14;
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(transition);
        java.lang.Object rememberedValue4222 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        rememberedValue4222 = transition.getCurrentState();
        startRestartGroup.updateRememberedValue(rememberedValue4222);
        startRestartGroup.endReplaceableGroup();
        if (transition.isSeeking()) {
        }
        startRestartGroup.startReplaceableGroup(-466616829);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C789@41329L28:AnimatedVisibility.kt#xbi5r1");
        androidx.compose.animation.OnLookaheadMeasured onLookaheadMeasured5222 = onLookaheadMeasured2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i10222 = i8222 | (i6 & 112);
        androidx.compose.animation.EnterExitState targetEnterExit322 = targetEnterExit(transition, function1, rememberedValue4222, startRestartGroup, i10222);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceableGroup();
        T targetState222 = transition.getTargetState();
        startRestartGroup.startReplaceableGroup(-466616829);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C789@41329L28:AnimatedVisibility.kt#xbi5r1");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.animation.EnterExitState targetEnterExit2222 = targetEnterExit(transition, function1, targetState222, startRestartGroup, i10222);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceableGroup();
        java.lang.String str2222 = str;
        onLookaheadMeasured3 = onLookaheadMeasured5222;
        createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, targetEnterExit322, targetEnterExit2222, "EnterExitTransition", startRestartGroup, i9222 | 3072);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.State rememberUpdatedState222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i6 >> 15) & 14);
        java.lang.Boolean invoke222 = function2.invoke(createChildTransitionInternal.getCurrentState(), createChildTransitionInternal.getTargetState());
        startRestartGroup.startReplaceableGroup(-311852107);
        changed2 = startRestartGroup.changed(createChildTransitionInternal) | startRestartGroup.changed(rememberUpdatedState222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(createChildTransitionInternal, rememberUpdatedState222, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.State produceState222 = androidx.compose.runtime.SnapshotStateKt.produceState(invoke222, (kotlin.jvm.functions.Function2) rememberedValue, startRestartGroup, 64);
        if (getExitFinished(createChildTransitionInternal)) {
        }
        startRestartGroup.startReplaceableGroup(1157296644);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, str2222);
        changed3 = startRestartGroup.changed(transition);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue2 = new androidx.compose.animation.AnimatedVisibilityScopeImpl(createChildTransitionInternal);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        androidx.compose.animation.AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl222 = (androidx.compose.animation.AnimatedVisibilityScopeImpl) rememberedValue2;
        int i11222 = i6 >> 6;
        composer2 = startRestartGroup;
        androidx.compose.ui.Modifier createModifier222 = androidx.compose.animation.EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition, exitTransition, "Built-in", composer2, (i11222 & 112) | 3072 | (i11222 & 896));
        if (onLookaheadMeasured3 == null) {
        }
        androidx.compose.ui.Modifier then222 = modifier.then(createModifier222.then(companion));
        composer2.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(remember):Composables.kt#9igjgp");
        rememberedValue3 = composer2.rememberedValue();
        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        composer2.endReplaceableGroup();
        androidx.compose.ui.layout.MeasurePolicy measurePolicy222 = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue3;
        composer2.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(then222);
        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        composer2.startReusableNode();
        if (!composer2.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(composer2);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap222, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        modifierMaterializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(composer2)), composer2, 0);
        composer2.startReplaceableGroup(2058660585);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -174036415, "C817@42286L9:AnimatedVisibility.kt#xbi5r1");
        function3.invoke(animatedVisibilityScopeImpl222, composer2, java.lang.Integer.valueOf(((i6 >> 18) & 112) | 8));
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        onLookaheadMeasured4 = onLookaheadMeasured3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getExitFinished(androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> transition) {
        return transition.getCurrentState() == androidx.compose.animation.EnterExitState.PostExit && transition.getTargetState() == androidx.compose.animation.EnterExitState.PostExit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> androidx.compose.animation.EnterExitState targetEnterExit(androidx.compose.animation.core.Transition<T> transition, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> function1, T t, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.animation.EnterExitState enterExitState;
        composer.startReplaceableGroup(361571134);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(targetEnterExit)P(1):AnimatedVisibility.kt#xbi5r1");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(361571134, i, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:889)");
        }
        composer.startMovableGroup(-721835388, transition);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "902@45413L34");
        if (transition.isSeeking()) {
            if (function1.invoke(t).booleanValue()) {
                enterExitState = androidx.compose.animation.EnterExitState.Visible;
            } else if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                enterExitState = androidx.compose.animation.EnterExitState.PostExit;
            } else {
                enterExitState = androidx.compose.animation.EnterExitState.PreEnter;
            }
        } else {
            composer.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(true);
            }
            if (function1.invoke(t).booleanValue()) {
                enterExitState = androidx.compose.animation.EnterExitState.Visible;
            } else if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = androidx.compose.animation.EnterExitState.PostExit;
            } else {
                enterExitState = androidx.compose.animation.EnterExitState.PreEnter;
            }
        }
        composer.endMovableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterExitState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.jvm.functions.Function2<androidx.compose.animation.EnterExitState, androidx.compose.animation.EnterExitState, java.lang.Boolean> AnimatedEnterExitImpl$lambda$4(androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function2<? super androidx.compose.animation.EnterExitState, ? super androidx.compose.animation.EnterExitState, java.lang.Boolean>> state) {
        return (kotlin.jvm.functions.Function2) state.getValue();
    }

    private static final boolean AnimatedEnterExitImpl$lambda$6(androidx.compose.runtime.State<java.lang.Boolean> state) {
        return state.getValue().booleanValue();
    }
}
