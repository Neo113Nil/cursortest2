package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyList.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001a\u001d\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001e\u001a\u0018\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002\u001a\u0097\u0001\u0010$\u001a\u0019\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0%¢\u0006\u0002\b\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010+\u001a\u00020,H\u0003ø\u0001\u0000¢\u0006\u0002\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "ScrollPositionUpdater", "itemProvider", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "refreshOverscrollInfo", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "result", "Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;", "placementAnimator", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "(Landroidx/compose/foundation/lazy/LazyListItemProvider;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListBeyondBoundsInfo;Landroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/runtime/Composer;III)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0368 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(final Modifier modifier, final LazyListState state, final PaddingValues contentPadding, final boolean z, final boolean z2, final FlingBehavior flingBehavior, final boolean z3, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, final Function1<? super LazyListScope, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object rememberedValue;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        Composer composer2;
        final Alignment.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        final Alignment.Vertical vertical4;
        final Arrangement.Horizontal horizontal4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(955299798);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyList)P(6,8,1,7,5,2,9,3,11,10,4)76@3553L18,77@3595L36,78@3659L39,79@3715L24,80@3768L92,85@3934L334,100@4274L42,107@4554L293,116@4911L68,117@4993L48,103@4409L1768:LazyList.kt#428nma");
        if ((i3 & 1) != 0) {
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
            i4 |= startRestartGroup.changed(contentPadding) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 57344) == 0) {
            i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((i & 458752) == 0) {
                i5 = startRestartGroup.changed(flingBehavior) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i & 3670016) == 0) {
                i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= startRestartGroup.changed(horizontal) ? 8388608 : 4194304;
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 234881024) == 0) {
                    i4 |= startRestartGroup.changed(vertical) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i4 |= C.ENCODING_PCM_32BIT;
                } else if ((i & 1879048192) == 0) {
                    i4 |= startRestartGroup.changed(vertical2) ? 536870912 : 268435456;
                }
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i10 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i10 = i2 | (startRestartGroup.changed(horizontal2) ? 4 : 2);
                } else {
                    i10 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i10 |= 48;
                } else if ((i2 & 112) == 0) {
                    i10 |= startRestartGroup.changed(content) ? 32 : 16;
                }
                if ((1533916891 & i4) == 306783378 || (i10 & 91) != 18 || !startRestartGroup.getSkipping()) {
                    Alignment.Horizontal horizontal5 = i6 != 0 ? null : horizontal;
                    Arrangement.Vertical vertical5 = i7 != 0 ? null : vertical;
                    Alignment.Vertical vertical6 = i8 != 0 ? null : vertical2;
                    Arrangement.Horizontal horizontal6 = i9 != 0 ? null : horizontal2;
                    OverscrollEffect overscrollEffect = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
                    int i11 = i4 >> 3;
                    LazyListItemProvider rememberItemProvider = LazyListItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i11 & 14) | (i10 & 112));
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new LazyListBeyondBoundsInfo();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo = (LazyListBeyondBoundsInfo) rememberedValue;
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                        startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue2 = compositionScopedCoroutineScopeCanceller;
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    Boolean valueOf = Boolean.valueOf(z2);
                    startRestartGroup.startReplaceableGroup(511388516);
                    ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
                    changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(state);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new LazyListItemPlacementAnimator(coroutineScope, z2);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceableGroup();
                    LazyListItemPlacementAnimator lazyListItemPlacementAnimator = (LazyListItemPlacementAnimator) rememberedValue3;
                    state.setPlacementAnimator$foundation_release(lazyListItemPlacementAnimator);
                    int i12 = i4 & 112;
                    int i13 = i4 << 6;
                    int i14 = i13 & 458752;
                    int i15 = i4;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(rememberItemProvider, state, lazyListBeyondBoundsInfo, overscrollEffect, contentPadding, z, z2, horizontal5, vertical6, horizontal6, vertical5, lazyListItemPlacementAnimator, startRestartGroup, i12 | (MutableVector.$stable << 6) | (i13 & 57344) | i14 | (i13 & 3670016) | (i4 & 29360128) | (i11 & 234881024) | ((i10 << 27) & 1879048192), ((i4 >> 24) & 14) | 64, 0);
                    composer2 = startRestartGroup;
                    ScrollPositionUpdater(rememberItemProvider, state, composer2, i12);
                    Orientation orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
                    Modifier overscroll = OverscrollKt.overscroll(LazyListPinningModifierKt.lazyListPinningModifier(LazyBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyListSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider, state, coroutineScope, z2, z, z3, composer2, ((i15 << 3) & 896) | 4096 | (i15 & 57344) | i14 | (i15 & 3670016)), orientation), state, lazyListBeyondBoundsInfo, z, composer2, (MutableVector.$stable << 6) | i12 | (i15 & 7168)), state, lazyListBeyondBoundsInfo, composer2, (MutableVector.$stable << 6) | i12), overscrollEffect);
                    composer2.startReplaceableGroup(-908836175);
                    ComposerKt.sourceInformation(composer2, "*126@5575L7");
                    boolean z4 = !z;
                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
                    Object consume = composer2.consume(localLayoutDirection);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    boolean z5 = (consume == LayoutDirection.Rtl || z2) ? z4 : z;
                    composer2.endReplaceableGroup();
                    LazyLayoutKt.LazyLayout(rememberItemProvider, ScrollableKt.scrollable(overscroll, state, orientation, overscrollEffect, z3, z5, flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyListMeasurePolicy, composer2, 0, 0);
                    horizontal3 = horizontal5;
                    vertical3 = vertical5;
                    vertical4 = vertical6;
                    horizontal4 = horizontal6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    vertical3 = vertical;
                    vertical4 = vertical2;
                    horizontal4 = horizontal2;
                    composer2 = startRestartGroup;
                    horizontal3 = horizontal;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$2
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
                        LazyListKt.LazyList(Modifier.this, state, contentPadding, z, z2, flingBehavior, z3, horizontal3, vertical3, vertical4, horizontal4, content, composer3, i | 1, i2, i3);
                    }
                });
                return;
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if ((1533916891 & i4) == 306783378) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            OverscrollEffect overscrollEffect2 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
            int i112 = i4 >> 3;
            LazyListItemProvider rememberItemProvider2 = LazyListItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i112 & 14) | (i10 & 112));
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo2 = (LazyListBeyondBoundsInfo) rememberedValue;
            startRestartGroup.startReplaceableGroup(773894976);
            ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Boolean valueOf2 = Boolean.valueOf(z2);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
            changed = startRestartGroup.changed(valueOf2) | startRestartGroup.changed(state);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new LazyListItemPlacementAnimator(coroutineScope2, z2);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceableGroup();
            LazyListItemPlacementAnimator lazyListItemPlacementAnimator2 = (LazyListItemPlacementAnimator) rememberedValue3;
            state.setPlacementAnimator$foundation_release(lazyListItemPlacementAnimator2);
            int i122 = i4 & 112;
            int i132 = i4 << 6;
            int i142 = i132 & 458752;
            int i152 = i4;
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(rememberItemProvider2, state, lazyListBeyondBoundsInfo2, overscrollEffect2, contentPadding, z, z2, horizontal5, vertical6, horizontal6, vertical5, lazyListItemPlacementAnimator2, startRestartGroup, i122 | (MutableVector.$stable << 6) | (i132 & 57344) | i142 | (i132 & 3670016) | (i4 & 29360128) | (i112 & 234881024) | ((i10 << 27) & 1879048192), ((i4 >> 24) & 14) | 64, 0);
            composer2 = startRestartGroup;
            ScrollPositionUpdater(rememberItemProvider2, state, composer2, i122);
            Orientation orientation2 = z2 ? Orientation.Vertical : Orientation.Horizontal;
            Modifier overscroll2 = OverscrollKt.overscroll(LazyListPinningModifierKt.lazyListPinningModifier(LazyBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyListSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider2, state, coroutineScope2, z2, z, z3, composer2, ((i152 << 3) & 896) | 4096 | (i152 & 57344) | i142 | (i152 & 3670016)), orientation2), state, lazyListBeyondBoundsInfo2, z, composer2, (MutableVector.$stable << 6) | i122 | (i152 & 7168)), state, lazyListBeyondBoundsInfo2, composer2, (MutableVector.$stable << 6) | i122), overscrollEffect2);
            composer2.startReplaceableGroup(-908836175);
            ComposerKt.sourceInformation(composer2, "*126@5575L7");
            boolean z42 = !z;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer2.consume(localLayoutDirection2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (consume2 == LayoutDirection.Rtl) {
            }
            composer2.endReplaceableGroup();
            LazyLayoutKt.LazyLayout(rememberItemProvider2, ScrollableKt.scrollable(overscroll2, state, orientation2, overscrollEffect2, z3, z5, flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyListMeasurePolicy2, composer2, 0, 0);
            horizontal3 = horizontal5;
            vertical3 = vertical5;
            vertical4 = vertical6;
            horizontal4 = horizontal6;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 |= i5;
        if ((i3 & 64) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if ((1533916891 & i4) == 306783378) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        OverscrollEffect overscrollEffect22 = ScrollableDefaults.INSTANCE.overscrollEffect(startRestartGroup, 6);
        int i1122 = i4 >> 3;
        LazyListItemProvider rememberItemProvider22 = LazyListItemProviderImplKt.rememberItemProvider(state, content, startRestartGroup, (i1122 & 14) | (i10 & 112));
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo22 = (LazyListBeyondBoundsInfo) rememberedValue;
        startRestartGroup.startReplaceableGroup(773894976);
        ComposerKt.sourceInformation(startRestartGroup, "C(rememberCoroutineScope)475@19849L144:Effects.kt#9igjgp");
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
        startRestartGroup.endReplaceableGroup();
        Boolean valueOf22 = Boolean.valueOf(z2);
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "C(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(valueOf22) | startRestartGroup.changed(state);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue3 = new LazyListItemPlacementAnimator(coroutineScope22, z2);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceableGroup();
        LazyListItemPlacementAnimator lazyListItemPlacementAnimator22 = (LazyListItemPlacementAnimator) rememberedValue3;
        state.setPlacementAnimator$foundation_release(lazyListItemPlacementAnimator22);
        int i1222 = i4 & 112;
        int i1322 = i4 << 6;
        int i1422 = i1322 & 458752;
        int i1522 = i4;
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy22 = rememberLazyListMeasurePolicy(rememberItemProvider22, state, lazyListBeyondBoundsInfo22, overscrollEffect22, contentPadding, z, z2, horizontal5, vertical6, horizontal6, vertical5, lazyListItemPlacementAnimator22, startRestartGroup, i1222 | (MutableVector.$stable << 6) | (i1322 & 57344) | i1422 | (i1322 & 3670016) | (i4 & 29360128) | (i1122 & 234881024) | ((i10 << 27) & 1879048192), ((i4 >> 24) & 14) | 64, 0);
        composer2 = startRestartGroup;
        ScrollPositionUpdater(rememberItemProvider22, state, composer2, i1222);
        Orientation orientation22 = z2 ? Orientation.Vertical : Orientation.Horizontal;
        Modifier overscroll22 = OverscrollKt.overscroll(LazyListPinningModifierKt.lazyListPinningModifier(LazyBeyondBoundsModifierKt.lazyListBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazySemanticsKt.lazyListSemantics(modifier.then(state.getRemeasurementModifier()).then(state.getAwaitLayoutModifier()), rememberItemProvider22, state, coroutineScope22, z2, z, z3, composer2, ((i1522 << 3) & 896) | 4096 | (i1522 & 57344) | i1422 | (i1522 & 3670016)), orientation22), state, lazyListBeyondBoundsInfo22, z, composer2, (MutableVector.$stable << 6) | i1222 | (i1522 & 7168)), state, lazyListBeyondBoundsInfo22, composer2, (MutableVector.$stable << 6) | i1222), overscrollEffect22);
        composer2.startReplaceableGroup(-908836175);
        ComposerKt.sourceInformation(composer2, "*126@5575L7");
        boolean z422 = !z;
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "C:CompositionLocal.kt#9igjgp");
        Object consume22 = composer2.consume(localLayoutDirection22);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (consume22 == LayoutDirection.Rtl) {
        }
        composer2.endReplaceableGroup();
        LazyLayoutKt.LazyLayout(rememberItemProvider22, ScrollableKt.scrollable(overscroll22, state, orientation22, overscrollEffect22, z3, z5, flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), rememberLazyListMeasurePolicy22, composer2, 0, 0);
        horizontal3 = horizontal5;
        vertical3 = vertical5;
        vertical4 = vertical6;
        horizontal4 = horizontal6;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalFoundationApi
    public static final void ScrollPositionUpdater(final LazyListItemProvider lazyListItemProvider, final LazyListState lazyListState, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(3173830);
        ComposerKt.sourceInformation(startRestartGroup, "C(ScrollPositionUpdater):LazyList.kt#428nma");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(lazyListItemProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (lazyListItemProvider.getItemCount() > 0) {
                lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider);
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt$ScrollPositionUpdater$1
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
                LazyListKt.ScrollPositionUpdater(LazyListItemProvider.this, lazyListState, composer2, i | 1);
            }
        });
    }

    @ExperimentalFoundationApi
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final LazyListItemProvider lazyListItemProvider, final LazyListState lazyListState, final LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo, final OverscrollEffect overscrollEffect, final PaddingValues paddingValues, final boolean z, final boolean z2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, final LazyListItemPlacementAnimator lazyListItemPlacementAnimator, Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(-1404987696);
        ComposerKt.sourceInformation(composer, "C(rememberLazyListMeasurePolicy)P(5,9!1,6!1,8,4!1,10!1,11)183@7919L6558:LazyList.kt#428nma");
        Alignment.Horizontal horizontal3 = (i3 & 128) != 0 ? null : horizontal;
        final Alignment.Vertical vertical3 = (i3 & 256) != 0 ? null : vertical;
        Arrangement.Horizontal horizontal4 = (i3 & 512) != 0 ? null : horizontal2;
        Arrangement.Vertical vertical4 = (i3 & 1024) == 0 ? vertical2 : null;
        Object[] objArr = {lazyListState, lazyListBeyondBoundsInfo, overscrollEffect, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal3, vertical3, horizontal4, vertical4, lazyListItemPlacementAnimator};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "C(remember)P(1):Composables.kt#9igjgp");
        boolean z3 = false;
        for (int i4 = 0; i4 < 11; i4++) {
            z3 |= composer.changed(objArr[i4]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
            final Arrangement.Vertical vertical5 = vertical4;
            final Arrangement.Horizontal horizontal5 = horizontal4;
            final Alignment.Horizontal horizontal6 = horizontal3;
            rememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m535invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyListMeasureResult m535invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int i5;
                    int i6;
                    int i7;
                    float spacing;
                    int m3796getMaxWidthimpl;
                    long IntOffset;
                    Intrinsics.checkNotNullParameter(lazyLayoutMeasureScope, "$this$null");
                    CheckScrollableContainerConstraintsKt.m188checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z2) {
                        i5 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.mo401calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i5 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        i6 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.mo402calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        i6 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int i8 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.getTop());
                    int i9 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(paddingValues.getBottom());
                    final int i10 = i8 + i9;
                    final int i11 = i5 + i6;
                    boolean z4 = z2;
                    int i12 = z4 ? i10 : i11;
                    if (z4 && !z) {
                        i7 = i8;
                    } else if (z4 && z) {
                        i7 = i9;
                    } else {
                        i7 = (z4 || z) ? i6 : i5;
                    }
                    final int i13 = i12 - i7;
                    long m3812offsetNN6EwU = ConstraintsKt.m3812offsetNN6EwU(j, -i11, -i10);
                    lazyListState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProvider);
                    LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                    lazyListState.setDensity$foundation_release(lazyLayoutMeasureScope2);
                    lazyListItemProvider.getItemScope().m526setMaxWidth0680j_4(lazyLayoutMeasureScope.mo312toDpu2uoSUM(Constraints.m3796getMaxWidthimpl(m3812offsetNN6EwU)));
                    lazyListItemProvider.getItemScope().m525setMaxHeight0680j_4(lazyLayoutMeasureScope.mo312toDpu2uoSUM(Constraints.m3795getMaxHeightimpl(m3812offsetNN6EwU)));
                    if (z2) {
                        Arrangement.Vertical vertical6 = vertical5;
                        if (vertical6 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = vertical6.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal7 = horizontal5;
                        if (horizontal7 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = horizontal7.getSpacing();
                    }
                    final int i14 = lazyLayoutMeasureScope.mo309roundToPx0680j_4(spacing);
                    final int itemCount = lazyListItemProvider.getItemCount();
                    if (z2) {
                        m3796getMaxWidthimpl = Constraints.m3795getMaxHeightimpl(j) - i10;
                    } else {
                        m3796getMaxWidthimpl = Constraints.m3796getMaxWidthimpl(j) - i11;
                    }
                    int i15 = m3796getMaxWidthimpl;
                    if (!z || i15 > 0) {
                        IntOffset = IntOffsetKt.IntOffset(i5, i8);
                    } else {
                        boolean z5 = z2;
                        if (!z5) {
                            i5 += i15;
                        }
                        if (z5) {
                            i8 += i15;
                        }
                        IntOffset = IntOffsetKt.IntOffset(i5, i8);
                    }
                    final long j2 = IntOffset;
                    boolean z6 = z2;
                    LazyListItemProvider lazyListItemProvider2 = lazyListItemProvider;
                    final boolean z7 = z2;
                    final Alignment.Horizontal horizontal8 = horizontal6;
                    final Alignment.Vertical vertical7 = vertical3;
                    final boolean z8 = z;
                    final LazyListItemPlacementAnimator lazyListItemPlacementAnimator2 = lazyListItemPlacementAnimator;
                    final int i16 = i7;
                    LazyMeasuredItemProvider lazyMeasuredItemProvider = new LazyMeasuredItemProvider(m3812offsetNN6EwU, z6, lazyListItemProvider2, lazyLayoutMeasureScope, new MeasuredItemFactory() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        @Override // androidx.compose.foundation.lazy.MeasuredItemFactory
                        /* renamed from: createItem-HK0c1C0, reason: not valid java name */
                        public final LazyMeasuredItem mo536createItemHK0c1C0(int i17, Object key, Placeable[] placeables) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Intrinsics.checkNotNullParameter(placeables, "placeables");
                            return new LazyMeasuredItem(i17, placeables, z7, horizontal8, vertical7, lazyLayoutMeasureScope.getLayoutDirection(), z8, i16, i13, lazyListItemPlacementAnimator2, i17 == itemCount + (-1) ? 0 : i14, j2, key, null);
                        }
                    }, null);
                    lazyListState.m549setPremeasureConstraintsBRTryo0$foundation_release(lazyMeasuredItemProvider.getChildConstraints());
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyListState lazyListState2 = lazyListState;
                    Snapshot createNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
                        try {
                            int m509constructorimpl = DataIndex.m509constructorimpl(lazyListState2.getFirstVisibleItemIndex());
                            int firstVisibleItemScrollOffset = lazyListState2.getFirstVisibleItemScrollOffset();
                            Unit unit = Unit.INSTANCE;
                            createNonObservableSnapshot.dispose();
                            LazyListMeasureResult m539measureLazyList7Xnphek = LazyListMeasureKt.m539measureLazyList7Xnphek(itemCount, lazyMeasuredItemProvider, i15, i7, i13, m509constructorimpl, firstVisibleItemScrollOffset, lazyListState.getScrollToBeConsumed(), m3812offsetNN6EwU, z2, lazyListItemProvider.getHeaderIndexes(), vertical5, horizontal5, z, lazyLayoutMeasureScope2, lazyListItemPlacementAnimator, lazyListBeyondBoundsInfo, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                public final MeasureResult invoke(int i17, int i18, Function1<? super Placeable.PlacementScope, Unit> placement) {
                                    Intrinsics.checkNotNullParameter(placement, "placement");
                                    return LazyLayoutMeasureScope.this.layout(ConstraintsKt.m3810constrainWidthK40F9xA(j, i17 + i11), ConstraintsKt.m3809constrainHeightK40F9xA(j, i18 + i10), MapsKt.emptyMap(), placement);
                                }
                            });
                            LazyListState lazyListState3 = lazyListState;
                            OverscrollEffect overscrollEffect2 = overscrollEffect;
                            lazyListState3.applyMeasureResult$foundation_release(m539measureLazyList7Xnphek);
                            LazyListKt.refreshOverscrollInfo(overscrollEffect2, m539measureLazyList7Xnphek);
                            return m539measureLazyList7Xnphek;
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
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) rememberedValue;
        composer.endReplaceableGroup();
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshOverscrollInfo(OverscrollEffect overscrollEffect, LazyListMeasureResult lazyListMeasureResult) {
        boolean canScrollForward = lazyListMeasureResult.getCanScrollForward();
        LazyMeasuredItem firstVisibleItem = lazyListMeasureResult.getFirstVisibleItem();
        overscrollEffect.setEnabled(canScrollForward || ((firstVisibleItem != null ? firstVisibleItem.getIndex() : 0) != 0 || lazyListMeasureResult.getFirstVisibleItemScrollOffset() != 0));
    }
}
