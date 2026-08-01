package androidx.compose.animation;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AnimatedVisibility.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001ak\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001aR\u0010\u0000\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0083\b¢\u0006\u0002\u0010\u0014\u001aa\u0010\u0015\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001a\u001aJ\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001d\u001a[\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001e\u001am\u0010\u0015\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001f\u001ae\u0010\u0015\u001a\u00020\u0001*\u00020 2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010!\u001a_\u0010\u0015\u001a\u00020\u0001*\u00020 2\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\"\u001ae\u0010\u0015\u001a\u00020\u0001*\u00020#2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010$\u001a_\u0010\u0015\u001a\u00020\u0001*\u00020#2\u0006\u0010\u0005\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010%\u001a9\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010'\u001a\u0002H\u0002H\u0003¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"AnimatedEnterExitImpl", "", "T", "transition", "Landroidx/compose/animation/core/Transition;", "visible", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "content", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/animation/EnterExitState;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "AnimatedVisibility", "visibleState", "Landroidx/compose/animation/core/MutableTransitionState;", "label", "", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "initiallyVisible", "Lkotlin/Function0;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "targetEnterExit", "targetState", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        int i7;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2088733774);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)127@6702L32,128@6739L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
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
                        if ((i2 & 32) == 0) {
                            if ((i & 458752) == 0) {
                                i7 = startRestartGroup.changed(content) ? 131072 : 65536;
                            }
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 << 3;
                                int i10 = (i9 & 57344) | (i9 & 896) | 48 | (i9 & 7168) | (i3 & 458752);
                                modifier2 = modifier3;
                                enterTransition3 = plus;
                                exitTransition3 = plus2;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                    public final Boolean invoke(boolean z2) {
                                        return Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i10);
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                enterTransition3 = enterTransition2;
                                exitTransition3 = exitTransition2;
                            }
                            final String str3 = str2;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i11) {
                                    AnimatedVisibilityKt.AnimatedVisibility(z, modifier2, enterTransition3, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i7 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                        int i92 = i3 << 3;
                        int i102 = (i92 & 57344) | (i92 & 896) | 48 | (i92 & 7168) | (i3 & 458752);
                        modifier2 = modifier3;
                        enterTransition3 = plus;
                        exitTransition3 = plus2;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            public final Boolean invoke(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i102);
                        final String str32 = str2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
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
                    int i922 = i3 << 3;
                    int i1022 = (i922 & 57344) | (i922 & 896) | 48 | (i922 & 7168) | (i3 & 458752);
                    modifier2 = modifier3;
                    enterTransition3 = plus;
                    exitTransition3 = plus2;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i1022);
                    final String str322 = str2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
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
                int i9222 = i3 << 3;
                int i10222 = (i9222 & 57344) | (i9222 & 896) | 48 | (i9222 & 7168) | (i3 & 458752);
                modifier2 = modifier3;
                enterTransition3 = plus;
                exitTransition3 = plus2;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i10222);
                final String str3222 = str2;
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
            int i92222 = i3 << 3;
            int i102222 = (i92222 & 57344) | (i92222 & 896) | 48 | (i92222 & 7168) | (i3 & 458752);
            modifier2 = modifier3;
            enterTransition3 = plus;
            exitTransition3 = plus2;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i102222);
            final String str32222 = str2;
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
        int i922222 = i3 << 3;
        int i1022222 = (i922222 & 57344) | (i922222 & 896) | 48 | (i922222 & 7168) | (i3 & 458752);
        modifier2 = modifier3;
        enterTransition3 = plus;
        exitTransition3 = plus2;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
            public final Boolean invoke(boolean z2) {
                return Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier2, enterTransition3, exitTransition3, content, startRestartGroup, i1022222);
        final String str322222 = str2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final RowScope rowScope, final boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        final Modifier modifier3;
        final String str3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1741346906);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)202@10996L32,203@11033L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) == 0) {
                            i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 >> 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i9 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                                    public final Boolean invoke(boolean z2) {
                                        return Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                                modifier3 = modifier4;
                                str3 = str2;
                                enterTransition2 = plus;
                                exitTransition3 = plus2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                exitTransition3 = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i10) {
                                    AnimatedVisibilityKt.AnimatedVisibility(RowScope.this, z, modifier3, enterTransition2, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i7;
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        int i92 = i3 >> 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i92 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                            public final Boolean invoke(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                        modifier3 = modifier4;
                        str3 = str2;
                        enterTransition2 = plus;
                        exitTransition3 = plus2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    int i922 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i922 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                    modifier3 = modifier4;
                    str3 = str2;
                    enterTransition2 = plus;
                    exitTransition3 = plus2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                int i9222 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i9222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
                modifier3 = modifier4;
                str3 = str2;
                enterTransition2 = plus;
                exitTransition3 = plus2;
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
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            int i92222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i92222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
            modifier3 = modifier4;
            str3 = str2;
            enterTransition2 = plus;
            exitTransition3 = plus2;
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
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        int i922222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i922222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
            public final Boolean invoke(boolean z2) {
                return Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922222 & 458752));
        modifier3 = modifier4;
        str3 = str2;
        enterTransition2 = plus;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final ColumnScope columnScope, final boolean z, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        final Modifier modifier3;
        final String str3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1766503102);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)275@15268L32,276@15305L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) == 0) {
                            i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 >> 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i9 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                                    public final Boolean invoke(boolean z2) {
                                        return Boolean.valueOf(z2);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                                modifier3 = modifier4;
                                str3 = str2;
                                enterTransition2 = plus;
                                exitTransition3 = plus2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                exitTransition3 = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i10) {
                                    AnimatedVisibilityKt.AnimatedVisibility(ColumnScope.this, z, modifier3, enterTransition2, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i7;
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        int i92 = i3 >> 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i92 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            public final Boolean invoke(boolean z2) {
                                return Boolean.valueOf(z2);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                        modifier3 = modifier4;
                        str3 = str2;
                        enterTransition2 = plus;
                        exitTransition3 = plus2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    int i922 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i922 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        public final Boolean invoke(boolean z2) {
                            return Boolean.valueOf(z2);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                    modifier3 = modifier4;
                    str3 = str2;
                    enterTransition2 = plus;
                    exitTransition3 = plus2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                int i9222 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i9222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    public final Boolean invoke(boolean z2) {
                        return Boolean.valueOf(z2);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
                modifier3 = modifier4;
                str3 = str2;
                enterTransition2 = plus;
                exitTransition3 = plus2;
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
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            int i92222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i92222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                public final Boolean invoke(boolean z2) {
                    return Boolean.valueOf(z2);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
            modifier3 = modifier4;
            str3 = str2;
            enterTransition2 = plus;
            exitTransition3 = plus2;
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
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        int i922222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition(Boolean.valueOf(z), str2, startRestartGroup, (i922222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
            public final Boolean invoke(boolean z2) {
                return Boolean.valueOf(z2);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922222 & 458752));
        modifier3 = modifier4;
        str3 = str2;
        enterTransition2 = plus;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final MutableTransitionState<Boolean> visibleState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        int i7;
        final String str3;
        final Modifier modifier3;
        final ExitTransition exitTransition3;
        final EnterTransition enterTransition3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-222898426);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)381@20683L37,382@20725L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(visibleState) ? 4 : 2) | i;
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
                        if ((i2 & 32) == 0) {
                            if ((i & 458752) == 0) {
                                i7 = startRestartGroup.changed(content) ? 131072 : 65536;
                            }
                            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 << 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                    public final Boolean invoke(boolean z) {
                                        return Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, modifier4, plus, plus2, content, startRestartGroup, (i9 & 57344) | (i9 & 896) | 48 | (i9 & 7168) | (i3 & 458752));
                                str3 = str2;
                                modifier3 = modifier4;
                                exitTransition3 = plus2;
                                enterTransition3 = plus;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                enterTransition3 = enterTransition2;
                                exitTransition3 = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i10) {
                                    AnimatedVisibilityKt.AnimatedVisibility(visibleState, modifier3, enterTransition3, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i7 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                        int i92 = i3 << 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            public final Boolean invoke(boolean z) {
                                return Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier4, plus, plus2, content, startRestartGroup, (i92 & 57344) | (i92 & 896) | 48 | (i92 & 7168) | (i3 & 458752));
                        str3 = str2;
                        modifier3 = modifier4;
                        exitTransition3 = plus2;
                        enterTransition3 = plus;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
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
                    int i922 = i3 << 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier4, plus, plus2, content, startRestartGroup, (i922 & 57344) | (i922 & 896) | 48 | (i922 & 7168) | (i3 & 458752));
                    str3 = str2;
                    modifier3 = modifier4;
                    exitTransition3 = plus2;
                    enterTransition3 = plus;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
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
                int i9222 = i3 << 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier4, plus, plus2, content, startRestartGroup, (i9222 & 57344) | (i9222 & 896) | 48 | (i9222 & 7168) | (i3 & 458752));
                str3 = str2;
                modifier3 = modifier4;
                exitTransition3 = plus2;
                enterTransition3 = plus;
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
            int i92222 = i3 << 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier4, plus, plus2, content, startRestartGroup, (i92222 & 57344) | (i92222 & 896) | 48 | (i92222 & 7168) | (i3 & 458752));
            str3 = str2;
            modifier3 = modifier4;
            exitTransition3 = plus2;
            enterTransition3 = plus;
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
        int i922222 = i3 << 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i3 & 14) | ((i3 >> 9) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
            public final Boolean invoke(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier4, plus, plus2, content, startRestartGroup, (i922222 & 57344) | (i922222 & 896) | 48 | (i922222 & 7168) | (i3 & 458752));
        str3 = str2;
        modifier3 = modifier4;
        exitTransition3 = plus2;
        enterTransition3 = plus;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final RowScope rowScope, final MutableTransitionState<Boolean> visibleState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        final Modifier modifier3;
        final String str3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(rowScope, "<this>");
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(836509870);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)456@25033L37,457@25075L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(visibleState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) == 0) {
                            i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.expandHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.shrinkHorizontally$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 >> 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i9 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                                    public final Boolean invoke(boolean z) {
                                        return Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                                modifier3 = modifier4;
                                str3 = str2;
                                enterTransition3 = plus;
                                exitTransition3 = plus2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                enterTransition3 = enterTransition2;
                                exitTransition3 = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i10) {
                                    AnimatedVisibilityKt.AnimatedVisibility(RowScope.this, visibleState, modifier3, enterTransition3, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i7;
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        int i92 = i3 >> 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i92 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                            public final Boolean invoke(boolean z) {
                                return Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                        modifier3 = modifier4;
                        str3 = str2;
                        enterTransition3 = plus;
                        exitTransition3 = plus2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    int i922 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i922 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                    modifier3 = modifier4;
                    str3 = str2;
                    enterTransition3 = plus;
                    exitTransition3 = plus2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                int i9222 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i9222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
                modifier3 = modifier4;
                str3 = str2;
                enterTransition3 = plus;
                exitTransition3 = plus2;
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
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            int i92222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i92222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
            modifier3 = modifier4;
            str3 = str2;
            enterTransition3 = plus;
            exitTransition3 = plus2;
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
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        int i922222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i922222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
            public final Boolean invoke(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922222 & 458752));
        modifier3 = modifier4;
        str3 = str2;
        enterTransition3 = plus;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final ColumnScope columnScope, final MutableTransitionState<Boolean> visibleState, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        String str2;
        final Modifier modifier3;
        final String str3;
        final EnterTransition enterTransition3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Intrinsics.checkNotNullParameter(visibleState, "visibleState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-850656618);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)532@29475L37,533@29517L73:AnimatedVisibility.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (startRestartGroup.changed(visibleState) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                        if ((i2 & 32) == 0) {
                            i7 = (i & 3670016) == 0 ? startRestartGroup.changed(content) ? 1048576 : 524288 : 1572864;
                            if ((i3 & 2995921) == 599184 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                EnterTransition plus = i4 == 0 ? EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null)) : enterTransition2;
                                ExitTransition plus2 = i5 == 0 ? EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i9 = i3 >> 3;
                                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i9 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                                    public final Boolean invoke(boolean z) {
                                        return Boolean.valueOf(z);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9 & 458752));
                                modifier3 = modifier4;
                                str3 = str2;
                                enterTransition3 = plus;
                                exitTransition3 = plus2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                enterTransition3 = enterTransition2;
                                exitTransition3 = exitTransition2;
                                str3 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i10) {
                                    AnimatedVisibilityKt.AnimatedVisibility(ColumnScope.this, visibleState, modifier3, enterTransition3, exitTransition3, str3, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i3 |= i7;
                        if ((i3 & 2995921) == 599184) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        int i92 = i3 >> 3;
                        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i92 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            public final Boolean invoke(boolean z) {
                                return Boolean.valueOf(z);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return invoke(bool.booleanValue());
                            }
                        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92 & 458752));
                        modifier3 = modifier4;
                        str3 = str2;
                        enterTransition3 = plus;
                        exitTransition3 = plus2;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) == 0) {
                    }
                    i3 |= i7;
                    if ((i3 & 2995921) == 599184) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    int i922 = i3 >> 3;
                    AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i922 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        public final Boolean invoke(boolean z) {
                            return Boolean.valueOf(z);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return invoke(bool.booleanValue());
                        }
                    }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922 & 458752));
                    modifier3 = modifier4;
                    str3 = str2;
                    enterTransition3 = plus;
                    exitTransition3 = plus2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransition2 = exitTransition;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) == 0) {
                }
                i3 |= i7;
                if ((i3 & 2995921) == 599184) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                int i9222 = i3 >> 3;
                AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i9222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    public final Boolean invoke(boolean z) {
                        return Boolean.valueOf(z);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return invoke(bool.booleanValue());
                    }
                }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i9222 & 458752));
                modifier3 = modifier4;
                str3 = str2;
                enterTransition3 = plus;
                exitTransition3 = plus2;
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
            if ((i2 & 32) == 0) {
            }
            i3 |= i7;
            if ((i3 & 2995921) == 599184) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            int i92222 = i3 >> 3;
            AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i92222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                public final Boolean invoke(boolean z) {
                    return Boolean.valueOf(z);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }
            }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i92222 & 458752));
            modifier3 = modifier4;
            str3 = str2;
            enterTransition3 = plus;
            exitTransition3 = plus2;
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
        if ((i2 & 32) == 0) {
        }
        i3 |= i7;
        if ((i3 & 2995921) == 599184) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        int i922222 = i3 >> 3;
        AnimatedEnterExitImpl(androidx.compose.animation.core.TransitionKt.updateTransition((MutableTransitionState) visibleState, str2, startRestartGroup, MutableTransitionState.$stable | (i922222 & 14) | ((i3 >> 12) & 112), 0), new Function1<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
            public final Boolean invoke(boolean z) {
                return Boolean.valueOf(z);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                return invoke(bool.booleanValue());
            }
        }, modifier4, plus, plus2, content, startRestartGroup, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i922222 & 458752));
        modifier3 = modifier4;
        str3 = str2;
        enterTransition3 = plus;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0079  */
    @ExperimentalAnimationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void AnimatedVisibility(final Transition<T> transition, final Function1<? super T, Boolean> visible, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final EnterTransition enterTransition2;
        int i5;
        ExitTransition exitTransition2;
        int i6;
        final Modifier modifier3;
        final ExitTransition exitTransition3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(visible, "visible");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1031950689);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(4,3,1,2)606@33835L68:AnimatedVisibility.kt#xbi5r1");
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
            i3 |= startRestartGroup.changed(visible) ? 32 : 16;
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
                } else if ((57344 & i) == 0) {
                    exitTransition2 = exitTransition;
                    i3 |= startRestartGroup.changed(exitTransition2) ? 16384 : 8192;
                    if ((i2 & 16) != 0) {
                        if ((458752 & i) == 0) {
                            i6 = startRestartGroup.changed(content) ? 131072 : 65536;
                        }
                        if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                            Modifier modifier4 = i7 != 0 ? Modifier.INSTANCE : modifier2;
                            EnterTransition plus = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null)) : enterTransition2;
                            ExitTransition plus2 = i5 != 0 ? EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)) : exitTransition2;
                            AnimatedEnterExitImpl(transition, visible, modifier4, plus, plus2, content, startRestartGroup, i3 & 524286);
                            modifier3 = modifier4;
                            enterTransition2 = plus;
                            exitTransition3 = plus2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            exitTransition3 = exitTransition2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i8) {
                                AnimatedVisibilityKt.AnimatedVisibility(transition, visible, modifier3, enterTransition2, exitTransition3, content, composer2, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i3 |= i6;
                    if ((374491 & i3) == 74898) {
                    }
                    if (i7 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    AnimatedEnterExitImpl(transition, visible, modifier4, plus, plus2, content, startRestartGroup, i3 & 524286);
                    modifier3 = modifier4;
                    enterTransition2 = plus;
                    exitTransition3 = plus2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                exitTransition2 = exitTransition;
                if ((i2 & 16) != 0) {
                }
                i3 |= i6;
                if ((374491 & i3) == 74898) {
                }
                if (i7 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                AnimatedEnterExitImpl(transition, visible, modifier4, plus, plus2, content, startRestartGroup, i3 & 524286);
                modifier3 = modifier4;
                enterTransition2 = plus;
                exitTransition3 = plus2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            enterTransition2 = enterTransition;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransition2 = exitTransition;
            if ((i2 & 16) != 0) {
            }
            i3 |= i6;
            if ((374491 & i3) == 74898) {
            }
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            AnimatedEnterExitImpl(transition, visible, modifier4, plus, plus2, content, startRestartGroup, i3 & 524286);
            modifier3 = modifier4;
            enterTransition2 = plus;
            exitTransition3 = plus2;
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
        if ((i2 & 16) != 0) {
        }
        i3 |= i6;
        if ((374491 & i3) == 74898) {
        }
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        AnimatedEnterExitImpl(transition, visible, modifier4, plus, plus2, content, startRestartGroup, i3 & 524286);
        modifier3 = modifier4;
        enterTransition2 = plus;
        exitTransition3 = plus2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0063  */
    @Deprecated(message = "AnimatedVisibility no longer accepts initiallyVisible as a parameter, please use AnimatedVisibility(MutableTransitionState, Modifier, ...) API instead", replaceWith = @ReplaceWith(expression = "AnimatedVisibility(transitionState = remember { MutableTransitionState(initiallyVisible) }\n.apply { targetState = visible },\nmodifier = modifier,\nenter = enter,\nexit = exit) {\ncontent() \n}", imports = {"androidx.compose.animation.core.MutableTransitionState"}))
    @ExperimentalAnimationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final boolean z, Modifier modifier, final EnterTransition enter, final ExitTransition exit, final boolean z2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final int i3;
        final Modifier modifier2;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(enter, "enter");
        Intrinsics.checkNotNullParameter(exit, "exit");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1121582420);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedVisibility)P(5,4,1,2,3)*709@38661L53,708@38622L214:AnimatedVisibility.kt#xbi5r1");
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
                i3 |= startRestartGroup.changed(enter) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(exit) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i) == 0) {
                i3 |= startRestartGroup.changed(content) ? 131072 : 65536;
            }
            if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new MutableTransitionState(Boolean.valueOf(z2));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z));
                AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState, modifier3, enter, exit, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1996320812, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        ComposerKt.sourceInformation(composer2, "C715@38825L9:AnimatedVisibility.kt#xbi5r1");
                        if ((i5 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            content.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                        }
                    }
                }), startRestartGroup, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 16);
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$17
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    AnimatedVisibilityKt.AnimatedVisibility(z, modifier2, enter, exit, z2, content, composer2, i | 1, i2);
                }
            });
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
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableTransitionState mutableTransitionState2 = (MutableTransitionState) rememberedValue;
        mutableTransitionState2.setTargetState(Boolean.valueOf(z));
        AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState2, modifier3, enter, exit, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1996320812, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                ComposerKt.sourceInformation(composer2, "C715@38825L9:AnimatedVisibility.kt#xbi5r1");
                if ((i5 & 81) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                } else {
                    content.invoke(composer2, Integer.valueOf((i3 >> 15) & 14));
                }
            }
        }), startRestartGroup, MutableTransitionState.$stable | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 16);
        modifier2 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void AnimatedEnterExitImpl(final Transition<T> transition, final Function1<? super T, Boolean> function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(808253933);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedEnterExitImpl)P(4,5,3,1,2)734@39355L85,739@39578L116,743@39736L270,743@39704L302,752@40016L165:AnimatedVisibility.kt#xbi5r1");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(function1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(enterTransition) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(exitTransition) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(function3) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((374491 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            int i4 = i3 & 14;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(transition);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function1.invoke(transition.getCurrentState()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (function1.invoke(transition.getTargetState()).booleanValue() || ((Boolean) mutableState.getValue()).booleanValue() || transition.isSeeking()) {
                startRestartGroup.startReplaceableGroup(1215497572);
                ComposerKt.sourceInformation(startRestartGroup, "C(createChildTransition)780@30756L36,781@30816L74,782@30913L39,783@30964L63:Transition.kt#pdpnli");
                int i5 = (i4 | 48) & 14;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                boolean changed2 = startRestartGroup.changed(transition);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = transition.getCurrentState();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                if (transition.isSeeking()) {
                    rememberedValue2 = transition.getCurrentState();
                }
                startRestartGroup.startReplaceableGroup(-1220581778);
                ComposerKt.sourceInformation(startRestartGroup, "C740@39656L28:AnimatedVisibility.kt#xbi5r1");
                int i6 = i3 & 126;
                EnterExitState targetEnterExit = targetEnterExit(transition, function1, rememberedValue2, startRestartGroup, i6);
                startRestartGroup.endReplaceableGroup();
                T targetState = transition.getTargetState();
                startRestartGroup.startReplaceableGroup(-1220581778);
                ComposerKt.sourceInformation(startRestartGroup, "C740@39656L28:AnimatedVisibility.kt#xbi5r1");
                EnterExitState targetEnterExit2 = targetEnterExit(transition, function1, targetState, startRestartGroup, i6);
                startRestartGroup.endReplaceableGroup();
                Transition createChildTransitionInternal = androidx.compose.animation.core.TransitionKt.createChildTransitionInternal(transition, targetEnterExit, targetEnterExit2, "EnterExitTransition", startRestartGroup, i5 | 3072);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed3 = startRestartGroup.changed(createChildTransitionInternal) | startRestartGroup.changed(mutableState);
                AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(createChildTransitionInternal, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(createChildTransitionInternal, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 0);
                int i7 = (i3 >> 3) & 65520;
                startRestartGroup.startReplaceableGroup(-1967270694);
                ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedEnterExitImpl)P(4,3,1,2)777@40870L64,780@41042L39,781@41112L50,778@40943L229:AnimatedVisibility.kt#xbi5r1");
                if (createChildTransitionInternal.getCurrentState() == EnterExitState.Visible || createChildTransitionInternal.getTargetState() == EnterExitState.Visible) {
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    boolean changed4 = startRestartGroup.changed(createChildTransitionInternal);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new AnimatedVisibilityScopeImpl(createChildTransitionInternal);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceableGroup();
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue4;
                    int i8 = i7 >> 3;
                    composer2 = startRestartGroup;
                    Modifier then = modifier.then(EnterExitTransitionKt.createModifier(createChildTransitionInternal, enterTransition, exitTransition, "Built-in", startRestartGroup, (i8 & 112) | 3072 | (i8 & 896)));
                    composer2.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue5;
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    Density density = (Density) consume;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume2 = composer2.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    LayoutDirection layoutDirection = (LayoutDirection) consume2;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume3 = composer2.consume(localViewConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer m1283constructorimpl = Updater.m1283constructorimpl(composer2);
                    Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    composer2.enableReusing();
                    materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    composer2.startReplaceableGroup(1797450476);
                    ComposerKt.sourceInformation(composer2, "C779@40981L9:AnimatedVisibility.kt#xbi5r1");
                    function3.invoke(animatedVisibilityScopeImpl, composer2, Integer.valueOf(((i7 >> 9) & 112) | 8));
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = startRestartGroup;
                }
                composer2.endReplaceableGroup();
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        AnimatedVisibilityKt.AnimatedEnterExitImpl(transition, function1, modifier, enterTransition, exitTransition, function3, composer3, i | 1);
                    }
                });
                return;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        composer2 = startRestartGroup;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void AnimatedEnterExitImpl(Transition<EnterExitState> transition, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i) {
        composer.startReplaceableGroup(-1967270694);
        ComposerKt.sourceInformation(composer, "C(AnimatedEnterExitImpl)P(4,3,1,2)777@40870L64,780@41042L39,781@41112L50,778@40943L229:AnimatedVisibility.kt#xbi5r1");
        if (transition.getCurrentState() == EnterExitState.Visible || transition.getTargetState() == EnterExitState.Visible) {
            int i2 = i & 14;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(transition);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new AnimatedVisibilityScopeImpl(transition);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue;
            int i3 = i >> 3;
            Modifier then = modifier.then(EnterExitTransitionKt.createModifier(transition, enterTransition, exitTransition, "Built-in", composer, i2 | 3072 | (i3 & 112) | (i3 & 896)));
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(localViewConfiguration);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m1283constructorimpl = Updater.m1283constructorimpl(composer);
            Updater.m1290setimpl(m1283constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl, layoutDirection, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            composer.startReplaceableGroup(1797450476);
            ComposerKt.sourceInformation(composer, "C779@40981L9:AnimatedVisibility.kt#xbi5r1");
            function3.invoke(animatedVisibilityScopeImpl, composer, Integer.valueOf(((i >> 9) & 112) | 8));
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> EnterExitState targetEnterExit(Transition<T> transition, Function1<? super T, Boolean> function1, T t, Composer composer, int i) {
        EnterExitState enterExitState;
        composer.startReplaceableGroup(361571134);
        ComposerKt.sourceInformation(composer, "C(targetEnterExit)P(1):AnimatedVisibility.kt#xbi5r1");
        composer.startMovableGroup(-721837481, transition);
        ComposerKt.sourceInformation(composer, "846@43320L34");
        if (transition.isSeeking()) {
            if (function1.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        } else {
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "C(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            if (function1.invoke(transition.getCurrentState()).booleanValue()) {
                mutableState.setValue(true);
            }
            if (function1.invoke(t).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else if (((Boolean) mutableState.getValue()).booleanValue()) {
                enterExitState = EnterExitState.PostExit;
            } else {
                enterExitState = EnterExitState.PreEnter;
            }
        }
        composer.endMovableGroup();
        composer.endReplaceableGroup();
        return enterExitState;
    }
}
