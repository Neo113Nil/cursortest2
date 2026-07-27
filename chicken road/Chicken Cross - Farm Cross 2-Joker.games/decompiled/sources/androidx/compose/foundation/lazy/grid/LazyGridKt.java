package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyGrid.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009e\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052#\u0010\u0006\u001a\u001f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007¢\u0006\u0002\b\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001a¢\u0006\u0002\b\fH\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010 \u001a\u0018\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002\u001a\u009c\u0001\u0010&\u001a\u0019\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(0\u0007¢\u0006\u0002\b\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#2#\u0010\u0006\u001a\u001f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007¢\u0006\u0002\b\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010)\u001a\u00020*H\u0003ø\u0001\u0000¢\u0006\u0002\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"LazyGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "slotSizesSums", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "", "", "Lkotlin/ExtensionFunctionType;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "ScrollPositionUpdater", "itemProvider", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/Composer;I)V", "refreshOverscrollInfo", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "result", "Landroidx/compose/foundation/lazy/grid/LazyGridMeasureResult;", "rememberLazyGridMeasurePolicy", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/layout/MeasureResult;", "placementAnimator", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x033b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyGrid(Modifier modifier, final LazyGridState state, final Function2<? super Density, ? super Constraints, ? extends List<Integer>> slotSizesSums, PaddingValues paddingValues, boolean z, final boolean z2, FlingBehavior flingBehavior, final boolean z3, final Arrangement.Vertical verticalArrangement, final Arrangement.Horizontal horizontalArrangement, final Function1<? super LazyGridScope, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        int i7;
        int i8;
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        boolean z4;
        PaddingValues paddingValues3;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Composer composer2;
        final PaddingValues paddingValues4;
        final Modifier modifier3;
        final boolean z5;
        final FlingBehavior flingBehavior3;
        ScopeUpdateScope endRestartGroup;
        int i9;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(slotSizesSums, "slotSizesSums");
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(152645664);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyGrid)P(5,8,7,1,6,4,2,9,10,3)66@3081L15,76@3522L18,78@3565L36,80@3619L24,81@3672L92,86@3838L275,101@4154L42,108@4434L293,104@4289L1624:LazyGrid.kt#7791vq");
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= startRestartGroup.changed(slotSizesSums) ? 256 : 128;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            paddingValues2 = paddingValues;
            i4 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 57344) == 0) {
                i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((i & 458752) == 0) {
                    i6 = startRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i & 3670016) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                    if ((i3 & 256) != 0) {
                        i9 = (i & 234881024) == 0 ? startRestartGroup.changed(verticalArrangement) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                        if ((i3 & 512) == 0) {
                            if ((1879048192 & i) == 0) {
                                i7 = startRestartGroup.changed(horizontalArrangement) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i8 = i2 | 6;
                            } else if ((i2 & 14) == 0) {
                                i8 = i2 | (startRestartGroup.changed(content) ? 4 : 2);
                            } else {
                                i8 = i2;
                            }
                            if ((i4 & 1533916891) == 306783378 || (i8 & 11) != 2 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i10 == 0 ? Modifier.INSTANCE : modifier;
                                    PaddingValues m413PaddingValues0680j_4 = i11 == 0 ? PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(0)) : paddingValues2;
                                    boolean z6 = i5 == 0 ? z : false;
                                    if ((i3 & 64) == 0) {
                                        i4 &= -3670017;
                                        z4 = z6;
                                        paddingValues3 = m413PaddingValues0680j_4;
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        modifier2 = companion;
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                        modifier2 = companion;
                                        z4 = z6;
                                        paddingValues3 = m413PaddingValues0680j_4;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    z4 = z;
                                    flingBehavior2 = flingBehavior;
                                    paddingValues3 = paddingValues2;
                                    modifier2 = modifier;
                                }
                                startRestartGroup.endDefaults();
                                OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                                int i12 = i4 >> 3;
                                LazyGridItemProvider rememberItemProvider = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i12 & 14) | ((i8 << 3) & 112));
                                startRestartGroup.startReplaceableGroup(773894976);
                                ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                                    startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                startRestartGroup.endReplaceableGroup();
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                                startRestartGroup.endReplaceableGroup();
                                Boolean valueOf = Boolean.valueOf(z2);
                                startRestartGroup.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                                changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(state);
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope, z2);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                startRestartGroup.endReplaceableGroup();
                                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator = (LazyGridItemPlacementAnimator) rememberedValue2;
                                state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator);
                                int i13 = i4 & 112;
                                int i14 = i4 << 3;
                                int i15 = i14 & 458752;
                                Modifier modifier4 = modifier2;
                                composer2 = startRestartGroup;
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(rememberItemProvider, state, overscrollEffect, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator, composer2, i13 | 1073741824 | (i14 & 7168) | (i14 & 57344) | i15 | (i14 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
                                state.setVertical$foundation_release(z2);
                                ScrollPositionUpdater(rememberItemProvider, state, composer2, i13);
                                Orientation orientation = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                                Modifier overscroll = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier4.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider, state, coroutineScope, z2, z4, z3, composer2, (i14 & 896) | 4096 | (i12 & 57344) | i15 | (i12 & 3670016)), orientation), overscrollEffect);
                                composer2.startReplaceableGroup(-1163690407);
                                ComposerKt.sourceInformation(composer2, "*125@5311L7");
                                boolean z7 = !z4;
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                                Object consume = composer2.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                boolean z8 = (consume == LayoutDirection.Rtl || z2) ? z7 : z4;
                                composer2.endReplaceableGroup();
                                LazyLayoutKt.LazyLayout(rememberItemProvider, ScrollableKt.scrollable(overscroll, state, orientation, overscrollEffect, z3, z8, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy, composer2, 0, 0);
                                paddingValues4 = paddingValues3;
                                modifier3 = modifier4;
                                z5 = z4;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z5 = z;
                                paddingValues4 = paddingValues2;
                                composer2 = startRestartGroup;
                                flingBehavior3 = flingBehavior;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$2
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

                                public final void invoke(Composer composer3, int i16) {
                                    LazyGridKt.LazyGrid(Modifier.this, state, slotSizesSums, paddingValues4, z5, z2, flingBehavior3, z3, verticalArrangement, horizontalArrangement, content, composer3, i | 1, i2, i3);
                                }
                            });
                            return;
                        }
                        i7 = C.ENCODING_PCM_32BIT;
                        i4 |= i7;
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        startRestartGroup.endDefaults();
                        OverscrollEffect overscrollEffect2 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                        int i122 = i4 >> 3;
                        LazyGridItemProvider rememberItemProvider2 = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i122 & 14) | ((i8 << 3) & 112));
                        startRestartGroup.startReplaceableGroup(773894976);
                        ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                        startRestartGroup.startReplaceableGroup(-492369756);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                        startRestartGroup.endReplaceableGroup();
                        Boolean valueOf2 = Boolean.valueOf(z2);
                        startRestartGroup.startReplaceableGroup(511388516);
                        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                        changed = startRestartGroup.changed(valueOf2) | startRestartGroup.changed(state);
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope2, z2);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                        startRestartGroup.endReplaceableGroup();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2 = (LazyGridItemPlacementAnimator) rememberedValue2;
                        state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator2);
                        int i132 = i4 & 112;
                        int i142 = i4 << 3;
                        int i152 = i142 & 458752;
                        Modifier modifier42 = modifier2;
                        composer2 = startRestartGroup;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy2 = rememberLazyGridMeasurePolicy(rememberItemProvider2, state, overscrollEffect2, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator2, composer2, i132 | 1073741824 | (i142 & 7168) | (i142 & 57344) | i152 | (i142 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
                        state.setVertical$foundation_release(z2);
                        ScrollPositionUpdater(rememberItemProvider2, state, composer2, i132);
                        Orientation orientation2 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                        Modifier overscroll2 = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier42.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider2, state, coroutineScope2, z2, z4, z3, composer2, (i142 & 896) | 4096 | (i122 & 57344) | i152 | (i122 & 3670016)), orientation2), overscrollEffect2);
                        composer2.startReplaceableGroup(-1163690407);
                        ComposerKt.sourceInformation(composer2, "*125@5311L7");
                        boolean z72 = !z4;
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                        Object consume2 = composer2.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (consume2 == LayoutDirection.Rtl) {
                        }
                        composer2.endReplaceableGroup();
                        LazyLayoutKt.LazyLayout(rememberItemProvider2, ScrollableKt.scrollable(overscroll2, state, orientation2, overscrollEffect2, z3, z8, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy2, composer2, 0, 0);
                        paddingValues4 = paddingValues3;
                        modifier3 = modifier42;
                        z5 = z4;
                        flingBehavior3 = flingBehavior2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i4 |= i9;
                    if ((i3 & 512) == 0) {
                    }
                    i4 |= i7;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i3 & 64) == 0) {
                    }
                    startRestartGroup.endDefaults();
                    OverscrollEffect overscrollEffect22 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                    int i1222 = i4 >> 3;
                    LazyGridItemProvider rememberItemProvider22 = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i1222 & 14) | ((i8 << 3) & 112));
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    Boolean valueOf22 = Boolean.valueOf(z2);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(valueOf22) | startRestartGroup.changed(state);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope22, z2);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator22 = (LazyGridItemPlacementAnimator) rememberedValue2;
                    state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator22);
                    int i1322 = i4 & 112;
                    int i1422 = i4 << 3;
                    int i1522 = i1422 & 458752;
                    Modifier modifier422 = modifier2;
                    composer2 = startRestartGroup;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy22 = rememberLazyGridMeasurePolicy(rememberItemProvider22, state, overscrollEffect22, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator22, composer2, i1322 | 1073741824 | (i1422 & 7168) | (i1422 & 57344) | i1522 | (i1422 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
                    state.setVertical$foundation_release(z2);
                    ScrollPositionUpdater(rememberItemProvider22, state, composer2, i1322);
                    Orientation orientation22 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                    Modifier overscroll22 = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier422.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider22, state, coroutineScope22, z2, z4, z3, composer2, (i1422 & 896) | 4096 | (i1222 & 57344) | i1522 | (i1222 & 3670016)), orientation22), overscrollEffect22);
                    composer2.startReplaceableGroup(-1163690407);
                    ComposerKt.sourceInformation(composer2, "*125@5311L7");
                    boolean z722 = !z4;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume22 = composer2.consume(localLayoutDirection22);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (consume22 == LayoutDirection.Rtl) {
                    }
                    composer2.endReplaceableGroup();
                    LazyLayoutKt.LazyLayout(rememberItemProvider22, ScrollableKt.scrollable(overscroll22, state, orientation22, overscrollEffect22, z3, z8, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy22, composer2, 0, 0);
                    paddingValues4 = paddingValues3;
                    modifier3 = modifier422;
                    z5 = z4;
                    flingBehavior3 = flingBehavior2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i3 & 256) != 0) {
                }
                i4 |= i9;
                if ((i3 & 512) == 0) {
                }
                i4 |= i7;
                if ((i3 & 1024) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 == 0) {
                }
                if (i11 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                startRestartGroup.endDefaults();
                OverscrollEffect overscrollEffect222 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                int i12222 = i4 >> 3;
                LazyGridItemProvider rememberItemProvider222 = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i12222 & 14) | ((i8 << 3) & 112));
                startRestartGroup.startReplaceableGroup(773894976);
                ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                Boolean valueOf222 = Boolean.valueOf(z2);
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(valueOf222) | startRestartGroup.changed(state);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope222, z2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceableGroup();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator222 = (LazyGridItemPlacementAnimator) rememberedValue2;
                state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator222);
                int i13222 = i4 & 112;
                int i14222 = i4 << 3;
                int i15222 = i14222 & 458752;
                Modifier modifier4222 = modifier2;
                composer2 = startRestartGroup;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy222 = rememberLazyGridMeasurePolicy(rememberItemProvider222, state, overscrollEffect222, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator222, composer2, i13222 | 1073741824 | (i14222 & 7168) | (i14222 & 57344) | i15222 | (i14222 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
                state.setVertical$foundation_release(z2);
                ScrollPositionUpdater(rememberItemProvider222, state, composer2, i13222);
                Orientation orientation222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                Modifier overscroll222 = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier4222.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider222, state, coroutineScope222, z2, z4, z3, composer2, (i14222 & 896) | 4096 | (i12222 & 57344) | i15222 | (i12222 & 3670016)), orientation222), overscrollEffect222);
                composer2.startReplaceableGroup(-1163690407);
                ComposerKt.sourceInformation(composer2, "*125@5311L7");
                boolean z7222 = !z4;
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                Object consume222 = composer2.consume(localLayoutDirection222);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (consume222 == LayoutDirection.Rtl) {
                }
                composer2.endReplaceableGroup();
                LazyLayoutKt.LazyLayout(rememberItemProvider222, ScrollableKt.scrollable(overscroll222, state, orientation222, overscrollEffect222, z3, z8, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy222, composer2, 0, 0);
                paddingValues4 = paddingValues3;
                modifier3 = modifier4222;
                z5 = z4;
                flingBehavior3 = flingBehavior2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i4 |= i6;
            if ((i & 3670016) == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            i4 |= i9;
            if ((i3 & 512) == 0) {
            }
            i4 |= i7;
            if ((i3 & 1024) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 == 0) {
            }
            if (i11 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            startRestartGroup.endDefaults();
            OverscrollEffect overscrollEffect2222 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
            int i122222 = i4 >> 3;
            LazyGridItemProvider rememberItemProvider2222 = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i122222 & 14) | ((i8 << 3) & 112));
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope2222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Boolean valueOf2222 = Boolean.valueOf(z2);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(valueOf2222) | startRestartGroup.changed(state);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope2222, z2);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2222 = (LazyGridItemPlacementAnimator) rememberedValue2;
            state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator2222);
            int i132222 = i4 & 112;
            int i142222 = i4 << 3;
            int i152222 = i142222 & 458752;
            Modifier modifier42222 = modifier2;
            composer2 = startRestartGroup;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy2222 = rememberLazyGridMeasurePolicy(rememberItemProvider2222, state, overscrollEffect2222, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator2222, composer2, i132222 | 1073741824 | (i142222 & 7168) | (i142222 & 57344) | i152222 | (i142222 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
            state.setVertical$foundation_release(z2);
            ScrollPositionUpdater(rememberItemProvider2222, state, composer2, i132222);
            Orientation orientation2222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
            Modifier overscroll2222 = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier42222.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider2222, state, coroutineScope2222, z2, z4, z3, composer2, (i142222 & 896) | 4096 | (i122222 & 57344) | i152222 | (i122222 & 3670016)), orientation2222), overscrollEffect2222);
            composer2.startReplaceableGroup(-1163690407);
            ComposerKt.sourceInformation(composer2, "*125@5311L7");
            boolean z72222 = !z4;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2222 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2222 = composer2.consume(localLayoutDirection2222);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (consume2222 == LayoutDirection.Rtl) {
            }
            composer2.endReplaceableGroup();
            LazyLayoutKt.LazyLayout(rememberItemProvider2222, ScrollableKt.scrollable(overscroll2222, state, orientation2222, overscrollEffect2222, z3, z8, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy2222, composer2, 0, 0);
            paddingValues4 = paddingValues3;
            modifier3 = modifier42222;
            z5 = z4;
            flingBehavior3 = flingBehavior2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        i4 |= i6;
        if ((i & 3670016) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        i4 |= i9;
        if ((i3 & 512) == 0) {
        }
        i4 |= i7;
        if ((i3 & 1024) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 == 0) {
        }
        if (i11 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        startRestartGroup.endDefaults();
        OverscrollEffect overscrollEffect22222 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
        int i1222222 = i4 >> 3;
        LazyGridItemProvider rememberItemProvider22222 = LazyGridItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i1222222 & 14) | ((i8 << 3) & 112));
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope22222 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        Boolean valueOf22222 = Boolean.valueOf(z2);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(valueOf22222) | startRestartGroup.changed(state);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = new LazyGridItemPlacementAnimator(coroutineScope22222, z2);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceableGroup();
        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator22222 = (LazyGridItemPlacementAnimator) rememberedValue2;
        state.setPlacementAnimator$foundation_release(lazyGridItemPlacementAnimator22222);
        int i1322222 = i4 & 112;
        int i1422222 = i4 << 3;
        int i1522222 = i1422222 & 458752;
        Modifier modifier422222 = modifier2;
        composer2 = startRestartGroup;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy22222 = rememberLazyGridMeasurePolicy(rememberItemProvider22222, state, overscrollEffect22222, slotSizesSums, paddingValues3, z4, z2, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator22222, composer2, i1322222 | 1073741824 | (i1422222 & 7168) | (i1422222 & 57344) | i1522222 | (i1422222 & 3670016) | ((i4 >> 6) & 29360128) | (i4 & 234881024), 0);
        state.setVertical$foundation_release(z2);
        ScrollPositionUpdater(rememberItemProvider22222, state, composer2, i1322222);
        Orientation orientation22222 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
        Modifier overscroll22222 = OverscrollKt.overscroll(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyGridSemantics(modifier422222.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider22222, state, coroutineScope22222, z2, z4, z3, composer2, (i1422222 & 896) | 4096 | (i1222222 & 57344) | i1522222 | (i1222222 & 3670016)), orientation22222), overscrollEffect22222);
        composer2.startReplaceableGroup(-1163690407);
        ComposerKt.sourceInformation(composer2, "*125@5311L7");
        boolean z722222 = !z4;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22222 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22222 = composer2.consume(localLayoutDirection22222);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (consume22222 == LayoutDirection.Rtl) {
        }
        composer2.endReplaceableGroup();
        LazyLayoutKt.LazyLayout(rememberItemProvider22222, ScrollableKt.scrollable(overscroll22222, state, orientation22222, overscrollEffect22222, z3, z8, flingBehavior2, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyGridMeasurePolicy22222, composer2, 0, 0);
        paddingValues4 = paddingValues3;
        modifier3 = modifier422222;
        z5 = z4;
        flingBehavior3 = flingBehavior2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ScrollPositionUpdater(final LazyGridItemProvider lazyGridItemProvider, final LazyGridState lazyGridState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(950944068);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollPositionUpdater):LazyGrid.kt#7791vq");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(lazyGridItemProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (lazyGridItemProvider.getItemCount() > 0) {
                lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$ScrollPositionUpdater$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                LazyGridKt.ScrollPositionUpdater(LazyGridItemProvider.this, lazyGridState, composer2, i | 1);
            }
        });
    }

    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final LazyGridItemProvider lazyGridItemProvider, final LazyGridState lazyGridState, final OverscrollEffect overscrollEffect, final Function2<? super Density, ? super Constraints, ? extends List<Integer>> function2, final PaddingValues paddingValues, final boolean z, final boolean z2, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1958911962);
        ComposerKt.sourceInformation(composer, "C(rememberLazyGridMeasurePolicy)P(3,8,4,7!1,6,2!1,9)178@7377L8234:LazyGrid.kt#7791vq");
        Arrangement.Horizontal horizontal2 = (i2 & 128) != 0 ? null : horizontal;
        Arrangement.Vertical vertical2 = (i2 & 256) == 0 ? vertical : null;
        Object[] objArr = {lazyGridState, overscrollEffect, function2, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal2, vertical2, lazyGridItemPlacementAnimator};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z3 = false;
        for (int i3 = 0; i3 < 9; i3++) {
            z3 |= composer.changed(objArr[i3]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            final Arrangement.Vertical vertical3 = vertical2;
            final Arrangement.Horizontal horizontal3 = horizontal2;
            rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m591invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m591invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i4;
                    int i5;
                    int i6;
                    float spacing;
                    float spacing2;
                    int m3796getMaxWidthimpl;
                    long IntOffset;
                    int firstVisibleItemScrollOffset;
                    int i7;
                    Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m188checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z2) {
                        i4 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.mo401calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i4 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        i5 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.mo402calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i5 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i8 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.getTop());
                    int i9 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.getBottom());
                    final int i10 = i8 + i9;
                    final int i11 = i4 + i5;
                    boolean z4 = z2;
                    int i12 = z4 ? i10 : i11;
                    if (z4 && !z) {
                        i6 = i8;
                    } else if (z4 && z) {
                        i6 = i9;
                    } else {
                        i6 = (z4 || z) ? i5 : i4;
                    }
                    final int i13 = i12 - i6;
                    long m3812offsetNN6EwU = ConstraintsKt.m3812offsetNN6EwU(j, -i11, -i10);
                    lazyGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProvider);
                    final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProvider.getSpanLayoutProvider();
                    final List<Integer> invoke = function2.invoke(lazyLayoutMeasureScope, Constraints.m3784boximpl(j));
                    spanLayoutProvider.setSlotsPerLine(invoke.size());
                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    lazyGridState.setDensity$foundation_release(lazyLayoutMeasureScope2);
                    lazyGridState.setSlotsPerLine$foundation_release(invoke.size());
                    if (z2) {
                        Arrangement.Vertical vertical4 = vertical3;
                        if (vertical4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = vertical4.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal4 = horizontal3;
                        if (horizontal4 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = horizontal4.getSpacing();
                    }
                    int i14 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(spacing);
                    if (z2) {
                        Arrangement.Horizontal horizontal5 = horizontal3;
                        spacing2 = horizontal5 != null ? horizontal5.getSpacing() : Dp.m3840constructorimpl(0);
                    } else {
                        Arrangement.Vertical vertical5 = vertical3;
                        spacing2 = vertical5 != null ? vertical5.getSpacing() : Dp.m3840constructorimpl(0);
                    }
                    final int i15 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(spacing2);
                    int itemCount = lazyGridItemProvider.getItemCount();
                    if (z2) {
                        m3796getMaxWidthimpl = Constraints.m3795getMaxHeightimpl(j) - i10;
                    } else {
                        m3796getMaxWidthimpl = Constraints.m3796getMaxWidthimpl(j) - i11;
                    }
                    int i16 = m3796getMaxWidthimpl;
                    if (!z || i16 > 0) {
                        IntOffset = IntOffsetKt.IntOffset(i4, i8);
                    } else {
                        boolean z5 = z2;
                        if (!z5) {
                            i4 += i16;
                        }
                        if (z5) {
                            i8 += i16;
                        }
                        IntOffset = IntOffsetKt.IntOffset(i4, i8);
                    }
                    final long j2 = IntOffset;
                    LazyGridItemProvider lazyGridItemProvider2 = lazyGridItemProvider;
                    final boolean z6 = z2;
                    final boolean z7 = z;
                    final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2 = lazyGridItemPlacementAnimator;
                    final int i17 = i6;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(lazyGridItemProvider2, lazyLayoutMeasureScope, i14, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        @Override // androidx.compose.foundation.lazy.grid.MeasuredItemFactory
                        /* renamed from: createItem-PU_OBEw, reason: not valid java name */
                        public final LazyMeasuredItem mo593createItemPU_OBEw(int i18, Object key, int i19, int i20, Placeable[] placeables) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(placeables, "placeables");
                            return new LazyMeasuredItem(i18, key, z6, i19, i20, z7, LazyLayoutMeasureScope.this.getLayoutDirection(), i17, i13, placeables, lazyGridItemPlacementAnimator2, j2, null);
                        }
                    });
                    boolean z8 = z2;
                    final boolean z9 = z2;
                    final LazyMeasuredLineProvider lazyMeasuredLineProvider = new LazyMeasuredLineProvider(z8, invoke, i15, itemCount, i14, lazyMeasuredItemProvider, spanLayoutProvider, new MeasuredLineFactory() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        @Override // androidx.compose.foundation.lazy.grid.MeasuredLineFactory
                        /* renamed from: createLine-H9FfpSk, reason: not valid java name */
                        public final LazyMeasuredLine mo594createLineH9FfpSk(int i18, LazyMeasuredItem[] items, List<GridItemSpan> spans, int i19) {
                            Intrinsics.checkNotNullParameter(items, "items");
                            Intrinsics.checkNotNullParameter(spans, "spans");
                            return new LazyMeasuredLine(i18, items, spans, z9, invoke.size(), lazyLayoutMeasureScope.getLayoutDirection(), i19, i15, null);
                        }
                    });
                    lazyGridState.setPrefetchInfoRetriever$foundation_release(new Function1<LineIndex, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(LineIndex lineIndex) {
                            return m592invokebKFJvoY(lineIndex.m627unboximpl());
                        }

                        /* renamed from: invoke-bKFJvoY, reason: not valid java name */
                        public final ArrayList<Pair<Integer, Constraints>> m592invokebKFJvoY(int i18) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = LazyGridSpanLayoutProvider.this.getLineConfiguration(i18);
                            int m565constructorimpl = ItemIndex.m565constructorimpl(lineConfiguration.getFirstItemIndex());
                            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List<GridItemSpan> spans = lineConfiguration.getSpans();
                            LazyMeasuredLineProvider lazyMeasuredLineProvider2 = lazyMeasuredLineProvider;
                            int size = spans.size();
                            int i19 = 0;
                            for (int i20 = 0; i20 < size; i20++) {
                                int m559getCurrentLineSpanimpl = GridItemSpan.m559getCurrentLineSpanimpl(spans.get(i20).getPackedValue());
                                arrayList.add(TuplesKt.to(Integer.valueOf(m565constructorimpl), lazyMeasuredLineProvider2.getChildConstraints$foundation_release().invoke(Integer.valueOf(i19), Integer.valueOf(m559getCurrentLineSpanimpl))));
                                m565constructorimpl = ItemIndex.m565constructorimpl(m565constructorimpl + 1);
                                i19 += m559getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    });
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyGridState lazyGridState2 = lazyGridState;
                    Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                        try {
                            if (lazyGridState2.getFirstVisibleItemIndex() >= itemCount && itemCount > 0) {
                                firstVisibleItemScrollOffset = 0;
                                i7 = spanLayoutProvider.m607getLineIndexOfItem_Ze7BM(itemCount - 1);
                                Unit unit = Unit.INSTANCE;
                                createNonObservableSnapshot.dispose();
                                LazyGridMeasureResult m595measureLazyGridzIfe3eg = LazyGridMeasureKt.m595measureLazyGridzIfe3eg(itemCount, lazyMeasuredLineProvider, lazyMeasuredItemProvider, i16, invoke.size(), i6, i13, i7, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), m3812offsetNN6EwU, z2, vertical3, horizontal3, z, lazyLayoutMeasureScope2, lazyGridItemPlacementAnimator, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                    }

                                    public final MeasureResult invoke(int i18, int i19, Function1<? super Placeable.PlacementScope, Unit> placement) {
                                        Intrinsics.checkNotNullParameter(placement, "placement");
                                        return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m3810constrainWidthK40F9xA(j, i18 + i11), ConstraintsKt.m3809constrainHeightK40F9xA(j, i19 + i10), MapsKt.emptyMap(), placement);
                                    }
                                });
                                LazyGridState lazyGridState3 = lazyGridState;
                                OverscrollEffect overscrollEffect2 = overscrollEffect;
                                lazyGridState3.applyMeasureResult$foundation_release(m595measureLazyGridzIfe3eg);
                                LazyGridKt.refreshOverscrollInfo(overscrollEffect2, m595measureLazyGridzIfe3eg);
                                return m595measureLazyGridzIfe3eg;
                            }
                            int m607getLineIndexOfItem_Ze7BM = spanLayoutProvider.m607getLineIndexOfItem_Ze7BM(lazyGridState2.getFirstVisibleItemIndex());
                            firstVisibleItemScrollOffset = lazyGridState2.getFirstVisibleItemScrollOffset();
                            i7 = m607getLineIndexOfItem_Ze7BM;
                            Unit unit2 = Unit.INSTANCE;
                            createNonObservableSnapshot.dispose();
                            LazyGridMeasureResult m595measureLazyGridzIfe3eg2 = LazyGridMeasureKt.m595measureLazyGridzIfe3eg(itemCount, lazyMeasuredLineProvider, lazyMeasuredItemProvider, i16, invoke.size(), i6, i13, i7, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), m3812offsetNN6EwU, z2, vertical3, horizontal3, z, lazyLayoutMeasureScope2, lazyGridItemPlacementAnimator, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                public final MeasureResult invoke(int i18, int i19, Function1<? super Placeable.PlacementScope, Unit> placement) {
                                    Intrinsics.checkNotNullParameter(placement, "placement");
                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m3810constrainWidthK40F9xA(j, i18 + i11), ConstraintsKt.m3809constrainHeightK40F9xA(j, i19 + i10), MapsKt.emptyMap(), placement);
                                }
                            });
                            LazyGridState lazyGridState32 = lazyGridState;
                            OverscrollEffect overscrollEffect22 = overscrollEffect;
                            lazyGridState32.applyMeasureResult$foundation_release(m595measureLazyGridzIfe3eg2);
                            LazyGridKt.refreshOverscrollInfo(overscrollEffect22, m595measureLazyGridzIfe3eg2);
                            return m595measureLazyGridzIfe3eg2;
                        } finally {
                            createNonObservableSnapshot.restoreCurrent(makeCurrent);
                        }
                    } catch (Throwable th) {
                        createNonObservableSnapshot.dispose();
                        throw th;
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22 = (Function2) rememberedValue;
        composer.endReplaceableGroup();
        return function22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshOverscrollInfo(OverscrollEffect overscrollEffect, LazyGridMeasureResult lazyGridMeasureResult) {
        Object obj;
        LazyMeasuredItem[] items;
        boolean canScrollForward = lazyGridMeasureResult.getCanScrollForward();
        LazyMeasuredLine firstVisibleLine = lazyGridMeasureResult.getFirstVisibleLine();
        if (firstVisibleLine == null || (items = firstVisibleLine.getItems()) == null || (obj = (LazyMeasuredItem) ArraysKt.firstOrNull(items)) == null) {
            obj = 0;
        }
        overscrollEffect.setEnabled(canScrollForward || (!Intrinsics.areEqual(obj, (Object) 0) || lazyGridMeasureResult.getFirstVisibleLineScrollOffset() != 0));
    }
}
