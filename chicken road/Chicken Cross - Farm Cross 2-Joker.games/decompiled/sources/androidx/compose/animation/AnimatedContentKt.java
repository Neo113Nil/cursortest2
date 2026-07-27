package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f21\u0010\r\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0012¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0013\u001aU\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172>\b\u0002\u0010\u0018\u001a8\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001c0\u000eH\u0007ø\u0001\u0000\u001a¬\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u001d2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u000721\u0010\r\u001a-\u0012\u0004\u0012\u00020\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\u0012¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010 \u001a\u0015\u0010!\u001a\u00020\t*\u00020\"2\u0006\u0010#\u001a\u00020$H\u0087\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"AnimatedContent", "", ExifInterface.LATITUDE_SOUTH, "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "contentKey", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "with", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "animation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0053  */
    @ExperimentalAnimationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final S s, Modifier modifier, Function1<? super AnimatedContentScope<S>, ContentTransform> function1, Alignment alignment, final Function4<? super AnimatedVisibilityScope, ? super S, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super AnimatedContentScope<S>, ContentTransform> function12;
        int i5;
        Alignment alignment2;
        final Modifier modifier3;
        final Function1<? super AnimatedContentScope<S>, ContentTransform> function13;
        final Alignment alignment3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2124549995);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedContent)P(3,2,4,1)129@6620L70,130@6706L116:AnimatedContent.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changed(function12) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        i3 |= startRestartGroup.changed(content) ? 16384 : 8192;
                    }
                    if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        Function1<? super AnimatedContentScope<S>, ContentTransform> function14 = i4 == 0 ? new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$1
                            @Override // kotlin.jvm.functions.Function1
                            public final ContentTransform invoke(AnimatedContentScope<S> animatedContentScope) {
                                Intrinsics.checkNotNullParameter(animatedContentScope, "$this$null");
                                return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m61scaleInL8ZKhE$default(AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                            }
                        } : function12;
                        Alignment topStart = i5 == 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                        AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, "AnimatedContent", startRestartGroup, (i3 & 8) | 48 | (i3 & 14), 0), modifier4, function14, topStart, null, content, startRestartGroup, (i3 & 8176) | ((i3 << 3) & 458752), 8);
                        modifier3 = modifier4;
                        function13 = function14;
                        alignment3 = topStart;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        function13 = function12;
                        alignment3 = alignment2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$2
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

                        public final void invoke(Composer composer2, int i7) {
                            AnimatedContentKt.AnimatedContent(s, modifier3, function13, alignment3, content, composer2, i | 1, i2);
                        }
                    });
                    return;
                }
                alignment2 = alignment;
                if ((i2 & 16) == 0) {
                }
                if ((46811 & i3) == 9362) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, "AnimatedContent", startRestartGroup, (i3 & 8) | 48 | (i3 & 14), 0), modifier4, function14, topStart, null, content, startRestartGroup, (i3 & 8176) | ((i3 << 3) & 458752), 8);
                modifier3 = modifier4;
                function13 = function14;
                alignment3 = topStart;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function12 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            if ((i2 & 16) == 0) {
            }
            if ((46811 & i3) == 9362) {
            }
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, "AnimatedContent", startRestartGroup, (i3 & 8) | 48 | (i3 & 14), 0), modifier4, function14, topStart, null, content, startRestartGroup, (i3 & 8176) | ((i3 << 3) & 458752), 8);
            modifier3 = modifier4;
            function13 = function14;
            alignment3 = topStart;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        if ((i2 & 16) == 0) {
        }
        if ((46811 & i3) == 9362) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        AnimatedContent(androidx.compose.animation.core.TransitionKt.updateTransition(s, "AnimatedContent", startRestartGroup, (i3 & 8) | 48 | (i3 & 14), 0), modifier4, function14, topStart, null, content, startRestartGroup, (i3 & 8176) | ((i3 << 3) & 458752), 8);
        modifier3 = modifier4;
        function13 = function14;
        alignment3 = topStart;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = new Function2<IntSize, IntSize, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt$SizeTransform$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                    return m14invokeTemP2vQ(intSize.getPackedValue(), intSize2.getPackedValue());
                }

                /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final SpringSpec<IntSize> m14invokeTemP2vQ(long j, long j2) {
                    return AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m3992boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);
                }
            };
        }
        return SizeTransform(z, function2);
    }

    @ExperimentalAnimationApi
    public static final SizeTransform SizeTransform(boolean z, Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> sizeAnimationSpec) {
        Intrinsics.checkNotNullParameter(sizeAnimationSpec, "sizeAnimationSpec");
        return new SizeTransformImpl(z, sizeAnimationSpec);
    }

    @ExperimentalAnimationApi
    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exit) {
        Intrinsics.checkNotNullParameter(enterTransition, "<this>");
        Intrinsics.checkNotNullParameter(exit, "exit");
        return new ContentTransform(enterTransition, exit, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f6  */
    @ExperimentalAnimationApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final Transition<S> transition, Modifier modifier, Function1<? super AnimatedContentScope<S>, ContentTransform> function1, Alignment alignment, Function1<? super S, ? extends Object> function12, final Function4<? super AnimatedVisibilityScope, ? super S, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Function1<? super AnimatedContentScope<S>, ContentTransform> function13;
        int i5;
        Alignment alignment2;
        int i6;
        Function1<? super S, ? extends Object> function14;
        int i7;
        final int i8;
        Function1<? super AnimatedContentScope<S>, ContentTransform> function15;
        LayoutDirection layoutDirection;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        final SnapshotStateList snapshotStateList;
        boolean changed3;
        LinkedHashMap rememberedValue3;
        Map map;
        AnimatedContentScope animatedContentScope;
        boolean changed4;
        ContentTransform rememberedValue4;
        Object rememberedValue5;
        final Function1<? super S, ? extends Object> function16;
        final Function1<? super AnimatedContentScope<S>, ContentTransform> function17;
        final Alignment alignment3;
        Iterator it;
        int i9;
        int i10;
        Iterator it2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-114689412);
        ComposerKt.sourceInformation(startRestartGroup, "C(AnimatedContent)P(3,4,1,2)585@27783L7,586@27811L92,591@27992L51,592@28065L62,663@31511L58,664@31603L45,674@31918L52,665@31653L323:AnimatedContent.kt#xbi5r1");
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
                i3 |= startRestartGroup.changed(function13) ? 256 : 128;
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
                        i3 |= startRestartGroup.changed(function14) ? 16384 : 8192;
                        if ((i2 & 16) == 0) {
                            if ((458752 & i) == 0) {
                                i7 = startRestartGroup.changed(content) ? 131072 : 65536;
                            }
                            i8 = i3;
                            if ((374491 & i8) == 74898 || !startRestartGroup.getSkipping()) {
                                Modifier modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                function15 = i4 == 0 ? new Function1<AnimatedContentScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final ContentTransform invoke(AnimatedContentScope<S> animatedContentScope2) {
                                        Intrinsics.checkNotNullParameter(animatedContentScope2, "$this$null");
                                        return AnimatedContentKt.with(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m61scaleInL8ZKhE$default(AnimationSpecKt.tween$default(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                } : function13;
                                if (i5 != 0) {
                                    alignment2 = Alignment.INSTANCE.getTopStart();
                                }
                                if (i6 != 0) {
                                    function14 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final S invoke(S s) {
                                            return s;
                                        }
                                    };
                                }
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                String str = "C:CompositionLocal.kt#9igjgp";
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                layoutDirection = (LayoutDirection) consume;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(transition);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                AnimatedContentScope animatedContentScope2 = (AnimatedContentScope) rememberedValue;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                changed2 = startRestartGroup.changed(transition);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                snapshotStateList = (SnapshotStateList) rememberedValue2;
                                startRestartGroup.startReplaceableGroup(1157296644);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                                changed3 = startRestartGroup.changed(transition);
                                rememberedValue3 = startRestartGroup.rememberedValue();
                                if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new LinkedHashMap();
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                startRestartGroup.endReplaceableGroup();
                                map = (Map) rememberedValue3;
                                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                                    if (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition.getCurrentState())) {
                                        snapshotStateList.clear();
                                        snapshotStateList.add(transition.getCurrentState());
                                    }
                                    if (map.size() != 1 || map.containsKey(transition.getCurrentState())) {
                                        map.clear();
                                    }
                                    animatedContentScope2.setContentAlignment$animation_release(alignment2);
                                    animatedContentScope2.setLayoutDirection$animation_release(layoutDirection);
                                }
                                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState()) && !snapshotStateList.contains(transition.getTargetState())) {
                                    it = snapshotStateList.iterator();
                                    i9 = 0;
                                    while (true) {
                                        if (it.hasNext()) {
                                            i10 = -1;
                                            i9 = -1;
                                            break;
                                        }
                                        it2 = it;
                                        if (Intrinsics.areEqual(function14.invoke((Object) it.next()), function14.invoke(transition.getTargetState()))) {
                                            i10 = -1;
                                            break;
                                        } else {
                                            i9++;
                                            it = it2;
                                        }
                                    }
                                    if (i9 != i10) {
                                        snapshotStateList.add(transition.getTargetState());
                                    } else {
                                        snapshotStateList.set(i9, transition.getTargetState());
                                    }
                                }
                                if (!map.containsKey(transition.getTargetState())) {
                                    map.clear();
                                    SnapshotStateList snapshotStateList2 = snapshotStateList;
                                    int size = snapshotStateList2.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        final T t = snapshotStateList2.get(i12);
                                        Map map2 = map;
                                        final AnimatedContentScope animatedContentScope3 = animatedContentScope2;
                                        final Function1<? super AnimatedContentScope<S>, ContentTransform> function18 = function15;
                                        map2.put(t, ComposableLambdaKt.composableLambda(startRestartGroup, 963631013, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1
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

                                            public final void invoke(Composer composer2, int i13) {
                                                ComposerKt.sourceInformation(composer2, "C625@29605L38,629@29819L142,632@29994L111,637@30288L1164:AnimatedContent.kt#xbi5r1");
                                                if ((i13 & 11) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                Function1<AnimatedContentScope<S>, ContentTransform> function19 = function18;
                                                Object obj = animatedContentScope3;
                                                composer2.startReplaceableGroup(-492369756);
                                                ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                                                ContentTransform rememberedValue6 = composer2.rememberedValue();
                                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue6 = function19.invoke(obj);
                                                    composer2.updateRememberedValue(rememberedValue6);
                                                }
                                                composer2.endReplaceableGroup();
                                                final ContentTransform contentTransform = (ContentTransform) rememberedValue6;
                                                Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(transition.getSegment().getTargetState(), t));
                                                Function1<AnimatedContentScope<S>, ContentTransform> function110 = function18;
                                                Object obj2 = animatedContentScope3;
                                                composer2.startReplaceableGroup(1157296644);
                                                ComposerKt.sourceInformation(composer2, "C(remember)P(1):Composables.kt#9igjgp");
                                                boolean changed5 = composer2.changed(valueOf);
                                                Object rememberedValue7 = composer2.rememberedValue();
                                                if (changed5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue7 = function110.invoke(obj2).getInitialContentExit();
                                                    composer2.updateRememberedValue(rememberedValue7);
                                                }
                                                composer2.endReplaceableGroup();
                                                ExitTransition exitTransition = (ExitTransition) rememberedValue7;
                                                S s = t;
                                                Transition<S> transition2 = transition;
                                                composer2.startReplaceableGroup(-492369756);
                                                ComposerKt.sourceInformation(composer2, "C(remember):Composables.kt#9igjgp");
                                                Object rememberedValue8 = composer2.rememberedValue();
                                                if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue8 = new AnimatedContentScope.ChildData(Intrinsics.areEqual(s, transition2.getTargetState()));
                                                    composer2.updateRememberedValue(rememberedValue8);
                                                }
                                                composer2.endReplaceableGroup();
                                                AnimatedContentScope.ChildData childData = (AnimatedContentScope.ChildData) rememberedValue8;
                                                EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                                                Modifier layout = LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1.1
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                                        return m13invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                                    }

                                                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                                    public final MeasureResult m13invoke3p2s80s(MeasureScope layout2, Measurable measurable, long j) {
                                                        Intrinsics.checkNotNullParameter(layout2, "$this$layout");
                                                        Intrinsics.checkNotNullParameter(measurable, "measurable");
                                                        final Placeable mo3121measureBRTryo0 = measurable.mo3121measureBRTryo0(j);
                                                        int width = mo3121measureBRTryo0.getWidth();
                                                        int height = mo3121measureBRTryo0.getHeight();
                                                        final ContentTransform contentTransform2 = ContentTransform.this;
                                                        return MeasureScope.layout$default(layout2, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.5.1.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(Placeable.PlacementScope layout3) {
                                                                Intrinsics.checkNotNullParameter(layout3, "$this$layout");
                                                                layout3.place(Placeable.this, 0, 0, contentTransform2.getTargetContentZIndex());
                                                            }
                                                        }, 4, null);
                                                    }
                                                });
                                                childData.setTarget(Intrinsics.areEqual(t, transition.getTargetState()));
                                                Modifier then = layout.then(childData);
                                                Transition<S> transition3 = transition;
                                                final S s2 = t;
                                                Function1 function111 = new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj3) {
                                                        return invoke((AnonymousClass3<S>) obj3);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Boolean invoke(S s3) {
                                                        return Boolean.valueOf(Intrinsics.areEqual(s3, s2));
                                                    }
                                                };
                                                final AnimatedContentScope<S> animatedContentScope4 = animatedContentScope3;
                                                final S s3 = t;
                                                final Function4<AnimatedVisibilityScope, S, Composer, Integer, Unit> function4 = content;
                                                final int i14 = i8;
                                                final SnapshotStateList<S> snapshotStateList3 = snapshotStateList;
                                                AnimatedVisibilityKt.AnimatedVisibility(transition3, function111, then, targetContentEnter, exitTransition, ComposableLambdaKt.composableLambda(composer2, -1816907410, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1.4
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                                        invoke(animatedVisibilityScope, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i15) {
                                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                        ComposerKt.sourceInformation(composer3, "C649@31000L253,657@31410L24:AnimatedContent.kt#xbi5r1");
                                                        if ((i15 & 14) == 0) {
                                                            i15 |= composer3.changed(AnimatedVisibility) ? 4 : 2;
                                                        }
                                                        if ((i15 & 91) != 18 || !composer3.getSkipping()) {
                                                            final SnapshotStateList<S> snapshotStateList4 = snapshotStateList3;
                                                            final S s4 = s3;
                                                            final AnimatedContentScope<S> animatedContentScope5 = animatedContentScope4;
                                                            int i16 = i15 & 14;
                                                            EffectsKt.DisposableEffect(AnimatedVisibility, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.5.1.4.1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                                                    final SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                                                    final S s5 = s4;
                                                                    final AnimatedContentScope<S> animatedContentScope6 = animatedContentScope5;
                                                                    return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$5$1$4$1$invoke$$inlined$onDispose$1
                                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                                        public void dispose() {
                                                                            SnapshotStateList.this.remove(s5);
                                                                            animatedContentScope6.getTargetSizeMap$animation_release().remove(s5);
                                                                        }
                                                                    };
                                                                }
                                                            }, composer3, i16);
                                                            animatedContentScope4.getTargetSizeMap$animation_release().put(s3, ((AnimatedVisibilityScopeImpl) AnimatedVisibility).getTargetSize$animation_release());
                                                            function4.invoke(AnimatedVisibility, s3, composer3, Integer.valueOf(i16 | ((i14 >> 9) & 896)));
                                                            return;
                                                        }
                                                        composer3.skipToGroupEnd();
                                                    }
                                                }), composer2, 196608 | (i8 & 14), 0);
                                            }
                                        }));
                                        i12++;
                                        animatedContentScope2 = animatedContentScope3;
                                        map = map2;
                                        size = size;
                                        snapshotStateList2 = snapshotStateList2;
                                        str = str;
                                        alignment2 = alignment2;
                                    }
                                }
                                Map map3 = map;
                                animatedContentScope = animatedContentScope2;
                                String str2 = str;
                                Alignment alignment4 = alignment2;
                                Transition.Segment<S> segment = transition.getSegment();
                                startRestartGroup.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                                changed4 = startRestartGroup.changed(segment) | startRestartGroup.changed(animatedContentScope);
                                rememberedValue4 = startRestartGroup.rememberedValue();
                                if (!changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = function15.invoke(animatedContentScope);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceableGroup();
                                Modifier then = modifier3.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new AnimatedContentMeasurePolicy(animatedContentScope);
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                startRestartGroup.endReplaceableGroup();
                                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) rememberedValue5;
                                startRestartGroup.startReplaceableGroup(-1323940314);
                                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str2);
                                Object consume2 = startRestartGroup.consume(localDensity);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Density density = (Density) consume2;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str2);
                                Object consume3 = startRestartGroup.consume(localLayoutDirection2);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                LayoutDirection layoutDirection2 = (LayoutDirection) consume3;
                                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration = CompositionLocalsKt.getLocalViewConfiguration();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str2);
                                Object consume4 = startRestartGroup.consume(localViewConfiguration);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ViewConfiguration viewConfiguration = (ViewConfiguration) consume4;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                startRestartGroup.disableReusing();
                                Composer m1283constructorimpl = Updater.m1283constructorimpl(startRestartGroup);
                                Updater.m1290setimpl(m1283constructorimpl, animatedContentMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m1290setimpl(m1283constructorimpl, density, ComposeUiNode.INSTANCE.getSetDensity());
                                Updater.m1290setimpl(m1283constructorimpl, layoutDirection2, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                                Updater.m1290setimpl(m1283constructorimpl, viewConfiguration, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                                startRestartGroup.enableReusing();
                                materializerOf.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                                startRestartGroup.startReplaceableGroup(2058660585);
                                startRestartGroup.startReplaceableGroup(-451584589);
                                ComposerKt.sourceInformation(startRestartGroup, "C:AnimatedContent.kt#xbi5r1");
                                for (Object obj : snapshotStateList) {
                                    startRestartGroup.startMovableGroup(-1739565921, function14.invoke(obj));
                                    ComposerKt.sourceInformation(startRestartGroup, "670@31842L8");
                                    Function2 function2 = (Function2) map3.get(obj);
                                    if (function2 != null) {
                                        function2.invoke(startRestartGroup, 0);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    startRestartGroup.endMovableGroup();
                                }
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endReplaceableGroup();
                                startRestartGroup.endNode();
                                startRestartGroup.endReplaceableGroup();
                                function16 = function14;
                                modifier2 = modifier3;
                                function17 = function15;
                                alignment3 = alignment4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function17 = function13;
                                alignment3 = alignment2;
                                function16 = function14;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$8
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

                                public final void invoke(Composer composer2, int i13) {
                                    AnimatedContentKt.AnimatedContent(transition, modifier2, function17, alignment3, function16, content, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        i7 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i3 |= i7;
                        i8 = i3;
                        if ((374491 & i8) == 74898) {
                        }
                        if (i11 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3 = CompositionLocalsKt.getLocalLayoutDirection();
                        String str3 = "C:CompositionLocal.kt#9igjgp";
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume5 = startRestartGroup.consume(localLayoutDirection3);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        layoutDirection = (LayoutDirection) consume5;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(transition);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceableGroup();
                        AnimatedContentScope animatedContentScope22 = (AnimatedContentScope) rememberedValue;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                        changed2 = startRestartGroup.changed(transition);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed2) {
                        }
                        rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        snapshotStateList = (SnapshotStateList) rememberedValue2;
                        startRestartGroup.startReplaceableGroup(1157296644);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                        changed3 = startRestartGroup.changed(transition);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changed3) {
                        }
                        rememberedValue3 = new LinkedHashMap();
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                        startRestartGroup.endReplaceableGroup();
                        map = (Map) rememberedValue3;
                        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                        }
                        if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                            it = snapshotStateList.iterator();
                            i9 = 0;
                            while (true) {
                                if (it.hasNext()) {
                                }
                                i9++;
                                it = it2;
                            }
                            if (i9 != i10) {
                            }
                        }
                        if (!map.containsKey(transition.getTargetState())) {
                        }
                        Map map32 = map;
                        animatedContentScope = animatedContentScope22;
                        String str22 = str3;
                        Alignment alignment42 = alignment2;
                        Transition.Segment<S> segment2 = transition.getSegment();
                        startRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                        changed4 = startRestartGroup.changed(segment2) | startRestartGroup.changed(animatedContentScope);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed4) {
                        }
                        rememberedValue4 = function15.invoke(animatedContentScope);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                        startRestartGroup.endReplaceableGroup();
                        Modifier then2 = modifier3.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy2 = (AnimatedContentMeasurePolicy) rememberedValue5;
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str22);
                        Object consume22 = startRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Density density2 = (Density) consume22;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str22);
                        Object consume32 = startRestartGroup.consume(localLayoutDirection22);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        LayoutDirection layoutDirection22 = (LayoutDirection) consume32;
                        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2 = CompositionLocalsKt.getLocalViewConfiguration();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str22);
                        Object consume42 = startRestartGroup.consume(localViewConfiguration2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) consume42;
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(then2);
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        startRestartGroup.disableReusing();
                        Composer m1283constructorimpl2 = Updater.m1283constructorimpl(startRestartGroup);
                        Updater.m1290setimpl(m1283constructorimpl2, animatedContentMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m1290setimpl(m1283constructorimpl2, density2, ComposeUiNode.INSTANCE.getSetDensity());
                        Updater.m1290setimpl(m1283constructorimpl2, layoutDirection22, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                        Updater.m1290setimpl(m1283constructorimpl2, viewConfiguration2, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                        startRestartGroup.enableReusing();
                        materializerOf2.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        startRestartGroup.startReplaceableGroup(-451584589);
                        ComposerKt.sourceInformation(startRestartGroup, "C:AnimatedContent.kt#xbi5r1");
                        while (r0.hasNext()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        function16 = function14;
                        modifier2 = modifier3;
                        function17 = function15;
                        alignment3 = alignment42;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    function14 = function12;
                    if ((i2 & 16) == 0) {
                    }
                    i3 |= i7;
                    i8 = i3;
                    if ((374491 & i8) == 74898) {
                    }
                    if (i11 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection32 = CompositionLocalsKt.getLocalLayoutDirection();
                    String str32 = "C:CompositionLocal.kt#9igjgp";
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume52 = startRestartGroup.consume(localLayoutDirection32);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    layoutDirection = (LayoutDirection) consume52;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(transition);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceableGroup();
                    AnimatedContentScope animatedContentScope222 = (AnimatedContentScope) rememberedValue;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    changed2 = startRestartGroup.changed(transition);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) rememberedValue2;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                    changed3 = startRestartGroup.changed(transition);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    rememberedValue3 = new LinkedHashMap();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    startRestartGroup.endReplaceableGroup();
                    map = (Map) rememberedValue3;
                    if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                    }
                    if (!map.containsKey(transition.getTargetState())) {
                    }
                    Map map322 = map;
                    animatedContentScope = animatedContentScope222;
                    String str222 = str32;
                    Alignment alignment422 = alignment2;
                    Transition.Segment<S> segment22 = transition.getSegment();
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                    changed4 = startRestartGroup.changed(segment22) | startRestartGroup.changed(animatedContentScope);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed4) {
                    }
                    rememberedValue4 = function15.invoke(animatedContentScope);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    startRestartGroup.endReplaceableGroup();
                    Modifier then22 = modifier3.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    AnimatedContentMeasurePolicy animatedContentMeasurePolicy22 = (AnimatedContentMeasurePolicy) rememberedValue5;
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                    ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str222);
                    Object consume222 = startRestartGroup.consume(localDensity22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density22 = (Density) consume222;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str222);
                    Object consume322 = startRestartGroup.consume(localLayoutDirection222);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    LayoutDirection layoutDirection222 = (LayoutDirection) consume322;
                    ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration22 = CompositionLocalsKt.getLocalViewConfiguration();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str222);
                    Object consume422 = startRestartGroup.consume(localViewConfiguration22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ViewConfiguration viewConfiguration22 = (ViewConfiguration) consume422;
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22 = LayoutKt.materializerOf(then22);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    startRestartGroup.disableReusing();
                    Composer m1283constructorimpl22 = Updater.m1283constructorimpl(startRestartGroup);
                    Updater.m1290setimpl(m1283constructorimpl22, animatedContentMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m1290setimpl(m1283constructorimpl22, density22, ComposeUiNode.INSTANCE.getSetDensity());
                    Updater.m1290setimpl(m1283constructorimpl22, layoutDirection222, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                    Updater.m1290setimpl(m1283constructorimpl22, viewConfiguration22, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                    startRestartGroup.enableReusing();
                    materializerOf22.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    startRestartGroup.startReplaceableGroup(-451584589);
                    ComposerKt.sourceInformation(startRestartGroup, "C:AnimatedContent.kt#xbi5r1");
                    while (r0.hasNext()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    function16 = function14;
                    modifier2 = modifier3;
                    function17 = function15;
                    alignment3 = alignment422;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                function14 = function12;
                if ((i2 & 16) == 0) {
                }
                i3 |= i7;
                i8 = i3;
                if ((374491 & i8) == 74898) {
                }
                if (i11 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection322 = CompositionLocalsKt.getLocalLayoutDirection();
                String str322 = "C:CompositionLocal.kt#9igjgp";
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume522 = startRestartGroup.consume(localLayoutDirection322);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                layoutDirection = (LayoutDirection) consume522;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(transition);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceableGroup();
                AnimatedContentScope animatedContentScope2222 = (AnimatedContentScope) rememberedValue;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                changed2 = startRestartGroup.changed(transition);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) rememberedValue2;
                startRestartGroup.startReplaceableGroup(1157296644);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
                changed3 = startRestartGroup.changed(transition);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                rememberedValue3 = new LinkedHashMap();
                startRestartGroup.updateRememberedValue(rememberedValue3);
                startRestartGroup.endReplaceableGroup();
                map = (Map) rememberedValue3;
                if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
                }
                if (!map.containsKey(transition.getTargetState())) {
                }
                Map map3222 = map;
                animatedContentScope = animatedContentScope2222;
                String str2222 = str322;
                Alignment alignment4222 = alignment2;
                Transition.Segment<S> segment222 = transition.getSegment();
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                changed4 = startRestartGroup.changed(segment222) | startRestartGroup.changed(animatedContentScope);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed4) {
                }
                rememberedValue4 = function15.invoke(animatedContentScope);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceableGroup();
                Modifier then222 = modifier3.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy222 = (AnimatedContentMeasurePolicy) rememberedValue5;
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
                ProvidableCompositionLocal<Density> localDensity222 = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str2222);
                Object consume2222 = startRestartGroup.consume(localDensity222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Density density222 = (Density) consume2222;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str2222);
                Object consume3222 = startRestartGroup.consume(localLayoutDirection2222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                LayoutDirection layoutDirection2222 = (LayoutDirection) consume3222;
                ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration222 = CompositionLocalsKt.getLocalViewConfiguration();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str2222);
                Object consume4222 = startRestartGroup.consume(localViewConfiguration222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ViewConfiguration viewConfiguration222 = (ViewConfiguration) consume4222;
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf222 = LayoutKt.materializerOf(then222);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                startRestartGroup.disableReusing();
                Composer m1283constructorimpl222 = Updater.m1283constructorimpl(startRestartGroup);
                Updater.m1290setimpl(m1283constructorimpl222, animatedContentMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m1290setimpl(m1283constructorimpl222, density222, ComposeUiNode.INSTANCE.getSetDensity());
                Updater.m1290setimpl(m1283constructorimpl222, layoutDirection2222, ComposeUiNode.INSTANCE.getSetLayoutDirection());
                Updater.m1290setimpl(m1283constructorimpl222, viewConfiguration222, ComposeUiNode.INSTANCE.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                startRestartGroup.startReplaceableGroup(-451584589);
                ComposerKt.sourceInformation(startRestartGroup, "C:AnimatedContent.kt#xbi5r1");
                while (r0.hasNext()) {
                }
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                function16 = function14;
                modifier2 = modifier3;
                function17 = function15;
                alignment3 = alignment4222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
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
            if ((i2 & 16) == 0) {
            }
            i3 |= i7;
            i8 = i3;
            if ((374491 & i8) == 74898) {
            }
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection3222 = CompositionLocalsKt.getLocalLayoutDirection();
            String str3222 = "C:CompositionLocal.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume5222 = startRestartGroup.consume(localLayoutDirection3222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            layoutDirection = (LayoutDirection) consume5222;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(transition);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceableGroup();
            AnimatedContentScope animatedContentScope22222 = (AnimatedContentScope) rememberedValue;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed2 = startRestartGroup.changed(transition);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) rememberedValue2;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
            changed3 = startRestartGroup.changed(transition);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue3 = new LinkedHashMap();
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            map = (Map) rememberedValue3;
            if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
            }
            if (!map.containsKey(transition.getTargetState())) {
            }
            Map map32222 = map;
            animatedContentScope = animatedContentScope22222;
            String str22222 = str3222;
            Alignment alignment42222 = alignment2;
            Transition.Segment<S> segment2222 = transition.getSegment();
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            changed4 = startRestartGroup.changed(segment2222) | startRestartGroup.changed(animatedContentScope);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue4 = function15.invoke(animatedContentScope);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceableGroup();
            Modifier then2222 = modifier3.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            AnimatedContentMeasurePolicy animatedContentMeasurePolicy2222 = (AnimatedContentMeasurePolicy) rememberedValue5;
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ProvidableCompositionLocal<Density> localDensity2222 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str22222);
            Object consume22222 = startRestartGroup.consume(localDensity2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2222 = (Density) consume22222;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str22222);
            Object consume32222 = startRestartGroup.consume(localLayoutDirection22222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection22222 = (LayoutDirection) consume32222;
            ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration2222 = CompositionLocalsKt.getLocalViewConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str22222);
            Object consume42222 = startRestartGroup.consume(localViewConfiguration2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration2222 = (ViewConfiguration) consume42222;
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2222 = LayoutKt.materializerOf(then2222);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            startRestartGroup.disableReusing();
            Composer m1283constructorimpl2222 = Updater.m1283constructorimpl(startRestartGroup);
            Updater.m1290setimpl(m1283constructorimpl2222, animatedContentMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m1290setimpl(m1283constructorimpl2222, density2222, ComposeUiNode.INSTANCE.getSetDensity());
            Updater.m1290setimpl(m1283constructorimpl2222, layoutDirection22222, ComposeUiNode.INSTANCE.getSetLayoutDirection());
            Updater.m1290setimpl(m1283constructorimpl2222, viewConfiguration2222, ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-451584589);
            ComposerKt.sourceInformation(startRestartGroup, "C:AnimatedContent.kt#xbi5r1");
            while (r0.hasNext()) {
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            function16 = function14;
            modifier2 = modifier3;
            function17 = function15;
            alignment3 = alignment42222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
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
        if ((i2 & 16) == 0) {
        }
        i3 |= i7;
        i8 = i3;
        if ((374491 & i8) == 74898) {
        }
        if (i11 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection32222 = CompositionLocalsKt.getLocalLayoutDirection();
        String str32222 = "C:CompositionLocal.kt#9igjgp";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume52222 = startRestartGroup.consume(localLayoutDirection32222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        layoutDirection = (LayoutDirection) consume52222;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(transition);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new AnimatedContentScope(transition, alignment2, layoutDirection);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        AnimatedContentScope animatedContentScope222222 = (AnimatedContentScope) rememberedValue;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        changed2 = startRestartGroup.changed(transition);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = SnapshotStateKt.mutableStateListOf(transition.getCurrentState());
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        snapshotStateList = (SnapshotStateList) rememberedValue2;
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1):Composables.kt#9igjgp");
        changed3 = startRestartGroup.changed(transition);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new LinkedHashMap();
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        map = (Map) rememberedValue3;
        if (Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (!Intrinsics.areEqual(transition.getCurrentState(), transition.getTargetState())) {
        }
        if (!map.containsKey(transition.getTargetState())) {
        }
        Map map322222 = map;
        animatedContentScope = animatedContentScope222222;
        String str222222 = str32222;
        Alignment alignment422222 = alignment2;
        Transition.Segment<S> segment22222 = transition.getSegment();
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
        changed4 = startRestartGroup.changed(segment22222) | startRestartGroup.changed(animatedContentScope);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue4 = function15.invoke(animatedContentScope);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceableGroup();
        Modifier then22222 = modifier3.then(animatedContentScope.createSizeAnimationModifier$animation_release((ContentTransform) rememberedValue4, startRestartGroup, 72));
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        AnimatedContentMeasurePolicy animatedContentMeasurePolicy22222 = (AnimatedContentMeasurePolicy) rememberedValue5;
        startRestartGroup.startReplaceableGroup(-1323940314);
        ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        ProvidableCompositionLocal<Density> localDensity22222 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str222222);
        Object consume222222 = startRestartGroup.consume(localDensity22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22222 = (Density) consume222222;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str222222);
        Object consume322222 = startRestartGroup.consume(localLayoutDirection222222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LayoutDirection layoutDirection222222 = (LayoutDirection) consume322222;
        ProvidableCompositionLocal<ViewConfiguration> localViewConfiguration22222 = CompositionLocalsKt.getLocalViewConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, str222222);
        Object consume422222 = startRestartGroup.consume(localViewConfiguration22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ViewConfiguration viewConfiguration22222 = (ViewConfiguration) consume422222;
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf22222 = LayoutKt.materializerOf(then22222);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        startRestartGroup.disableReusing();
        Composer m1283constructorimpl22222 = Updater.m1283constructorimpl(startRestartGroup);
        Updater.m1290setimpl(m1283constructorimpl22222, animatedContentMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m1290setimpl(m1283constructorimpl22222, density22222, ComposeUiNode.INSTANCE.getSetDensity());
        Updater.m1290setimpl(m1283constructorimpl22222, layoutDirection222222, ComposeUiNode.INSTANCE.getSetLayoutDirection());
        Updater.m1290setimpl(m1283constructorimpl22222, viewConfiguration22222, ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf22222.invoke(SkippableUpdater.m1273boximpl(SkippableUpdater.m1274constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-451584589);
        ComposerKt.sourceInformation(startRestartGroup, "C:AnimatedContent.kt#xbi5r1");
        while (r0.hasNext()) {
        }
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        function16 = function14;
        modifier2 = modifier3;
        function17 = function15;
        alignment3 = alignment422222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
