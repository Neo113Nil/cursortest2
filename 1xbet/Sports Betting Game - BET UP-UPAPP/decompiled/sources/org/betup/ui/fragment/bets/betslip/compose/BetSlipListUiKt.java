package org.betup.ui.fragment.bets.betslip.compose;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.extractor.ts.PsExtractor;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BetSlipListUi.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u007f\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0016\u001a?\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 ¨\u0006!²\u0006\n\u0010\"\u001a\u00020#X\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"BetSlipListUi", "", "modifier", "Landroidx/compose/ui/Modifier;", "onRemoveBet", "Lkotlin/Function1;", "", "onClickItem", "Lkotlin/Function2;", "", "Lorg/betup/model/remote/entity/matches/MatchState;", "items", "", "Lorg/betup/ui/fragment/bets/betslip/compose/BetSlipUiModel;", "oddType", "Lorg/betup/model/local/entity/OddType;", "shouldShowTrash", "", "isInHistory", "expandFullHeightForExport", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ljava/util/List;Lorg/betup/model/local/entity/OddType;ZZZLandroidx/compose/runtime/Composer;II)V", "PreviewBetSlipListUi", "(Landroidx/compose/runtime/Composer;I)V", "CustomScrollbar", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "trackColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "thumbBrush", "Landroidx/compose/ui/graphics/Brush;", "CustomScrollbar-t6yy7ic", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Brush;Landroidx/compose/runtime/Composer;II)V", "app_release", "layoutInfo", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "scrollOffsetPx"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetSlipListUiKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipListUi$lambda$9(Modifier modifier, Function1 function1, Function2 function2, List list, OddType oddType, boolean z, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        BetSlipListUi(modifier, function1, function2, list, oddType, z, z2, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomScrollbar_t6yy7ic$lambda$14(LazyListState lazyListState, Modifier modifier, long j, long j2, Brush brush, int i, int i2, Composer composer, int i3) {
        m13488CustomScrollbart6yy7ic(lazyListState, modifier, j, j2, brush, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomScrollbar_t6yy7ic$lambda$16(LazyListState lazyListState, Modifier modifier, long j, long j2, Brush brush, int i, int i2, Composer composer, int i3) {
        m13488CustomScrollbart6yy7ic(lazyListState, modifier, j, j2, brush, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomScrollbar_t6yy7ic$lambda$18(LazyListState lazyListState, Modifier modifier, long j, long j2, Brush brush, int i, int i2, Composer composer, int i3) {
        m13488CustomScrollbart6yy7ic(lazyListState, modifier, j, j2, brush, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomScrollbar_t6yy7ic$lambda$25(LazyListState lazyListState, Modifier modifier, long j, long j2, Brush brush, int i, int i2, Composer composer, int i3) {
        m13488CustomScrollbart6yy7ic(lazyListState, modifier, j, j2, brush, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewBetSlipListUi$lambda$10(int i, Composer composer, int i2) {
        PreviewBetSlipListUi(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipListUi$lambda$1$lambda$0(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipListUi$lambda$3$lambda$2(int i, MatchState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetSlipListUi(Modifier modifier, Function1<? super Long, Unit> function1, Function2<? super Integer, ? super MatchState, Unit> function2, final List<BetSlipUiModel> items, OddType oddType, boolean z, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super Long, Unit> function12;
        int i4;
        Function2<? super Integer, ? super MatchState, Unit> function22;
        int i5;
        int i6;
        boolean z4;
        int i7;
        int i8;
        Function1<? super Long, Unit> function13;
        Function2<? super Integer, ? super MatchState, Unit> function23;
        boolean z5;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        Modifier modifier2;
        BoxScopeInstance boxScopeInstance;
        Composer composer2;
        Composer composer3;
        final Function1<? super Long, Unit> function14;
        final Function2<? super Integer, ? super MatchState, Unit> function24;
        final OddType oddType2;
        final boolean z6;
        final boolean z7;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(items, "items");
        Composer startRestartGroup = composer.startRestartGroup(-80865592);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(items) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(z3) ? 8388608 : 4194304;
                }
                if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                    Modifier modifier3 = i9 != 0 ? Modifier.INSTANCE : modifier;
                    if (i10 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit BetSlipListUi$lambda$1$lambda$0;
                                    BetSlipListUi$lambda$1$lambda$0 = BetSlipListUiKt.BetSlipListUi$lambda$1$lambda$0(((Long) obj).longValue());
                                    return BetSlipListUi$lambda$1$lambda$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        function13 = (Function1) rememberedValue;
                    } else {
                        function13 = function12;
                    }
                    if (i4 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BetSlipListUi$lambda$3$lambda$2;
                                    BetSlipListUi$lambda$3$lambda$2 = BetSlipListUiKt.BetSlipListUi$lambda$3$lambda$2(((Integer) obj).intValue(), (MatchState) obj2);
                                    return BetSlipListUi$lambda$3$lambda$2;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        function23 = (Function2) rememberedValue2;
                    } else {
                        function23 = function22;
                    }
                    OddType oddType3 = i5 != 0 ? OddType.DECIMAL : oddType;
                    boolean z8 = i6 != 0 ? true : z4;
                    boolean z9 = i7 != 0 ? false : z2;
                    z5 = i8 != 0 ? false : z3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-80865592, i3, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipListUi (BetSlipListUi.kt:48)");
                    }
                    LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                    float m7774constructorimpl = Dp.m7774constructorimpl(z9 ? 14 : 19);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    if (z5) {
                        startRestartGroup.startReplaceGroup(-127860144);
                        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, m7774constructorimpl, 1, null), 0.0f, 0.0f, Dp.m7774constructorimpl(z5 ? 8 : 24), 0.0f, 11, null);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(913714939);
                        int i11 = 0;
                        for (Object obj : items) {
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            BetSlipListUi$SlipLeg(z9, oddType3, function13, function23, z8, z5, i11, (BetSlipUiModel) obj, startRestartGroup, 0);
                            i11 = i12;
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceGroup();
                        modifier2 = modifier3;
                        composer3 = startRestartGroup;
                    } else {
                        startRestartGroup.startReplaceGroup(-127460864);
                        Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, m7774constructorimpl, 1, null), 0.0f, 0.0f, Dp.m7774constructorimpl(24), 0.0f, 11, null);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        boolean changedInstance = ((i3 & 29360128) == 8388608) | startRestartGroup.changedInstance(items) | ((3670016 & i3) == 1048576) | ((57344 & i3) == 16384) | ((i3 & 112) == 32) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | ((458752 & i3) == 131072);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            modifier2 = modifier3;
                            final boolean z10 = z9;
                            final OddType oddType4 = oddType3;
                            final Function1<? super Long, Unit> function15 = function13;
                            final Function2<? super Integer, ? super MatchState, Unit> function25 = function23;
                            final boolean z11 = z8;
                            boxScopeInstance = boxScopeInstance2;
                            composer2 = startRestartGroup;
                            final boolean z12 = z5;
                            Function1 function16 = new Function1() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Unit BetSlipListUi$lambda$8$lambda$7$lambda$6;
                                    BetSlipListUi$lambda$8$lambda$7$lambda$6 = BetSlipListUiKt.BetSlipListUi$lambda$8$lambda$7$lambda$6(items, z10, oddType4, function15, function25, z11, z12, (LazyListScope) obj2);
                                    return BetSlipListUi$lambda$8$lambda$7$lambda$6;
                                }
                            };
                            composer2.updateRememberedValue(function16);
                            rememberedValue3 = function16;
                        } else {
                            modifier2 = modifier3;
                            boxScopeInstance = boxScopeInstance2;
                            composer2 = startRestartGroup;
                        }
                        Function1 function17 = (Function1) rememberedValue3;
                        composer2.endReplaceGroup();
                        composer3 = composer2;
                        LazyDslKt.LazyColumn(m1520paddingqDBjuR0$default2, rememberLazyListStateWithoutSavedState, null, false, null, null, null, false, null, function17, composer3, 0, 508);
                        m13488CustomScrollbart6yy7ic(rememberLazyListStateWithoutSavedState, PaddingKt.m1518paddingVpY3zN4$default(boxScopeInstance.align(SizeKt.m1568width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(8)), Alignment.INSTANCE.getCenterEnd()), 0.0f, Dp.m7774constructorimpl(29), 1, null), 0L, 0L, null, composer3, 0, 28);
                        composer3.endReplaceGroup();
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function14 = function13;
                    function24 = function23;
                    oddType2 = oddType3;
                    z6 = z8;
                    z7 = z9;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    oddType2 = oddType;
                    z5 = z3;
                    function14 = function12;
                    composer3 = startRestartGroup;
                    function24 = function22;
                    z6 = z4;
                    z7 = z2;
                }
                endRestartGroup = composer3.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final boolean z13 = z5;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit BetSlipListUi$lambda$9;
                            BetSlipListUi$lambda$9 = BetSlipListUiKt.BetSlipListUi$lambda$9(Modifier.this, function14, function24, items, oddType2, z6, z7, z13, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                            return BetSlipListUi$lambda$9;
                        }
                    });
                    return;
                }
                return;
            }
            function22 = function2;
            if ((i2 & 8) != 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            LazyListState rememberLazyListStateWithoutSavedState2 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
            float m7774constructorimpl2 = Dp.m7774constructorimpl(z9 ? 14 : 19);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            if (z5) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
            }
            function14 = function13;
            function24 = function23;
            oddType2 = oddType3;
            z6 = z8;
            z7 = z9;
            endRestartGroup = composer3.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function12 = function1;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((i2 & 8) != 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        LazyListState rememberLazyListStateWithoutSavedState22 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
        float m7774constructorimpl22 = Dp.m7774constructorimpl(z9 ? 14 : 19);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        if (z5) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        if (ComposerKt.isTraceInProgress()) {
        }
        function14 = function13;
        function24 = function23;
        oddType2 = oddType3;
        z6 = z8;
        z7 = z9;
        endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BetSlipListUi$SlipLeg(boolean z, OddType oddType, Function1<? super Long, Unit> function1, Function2<? super Integer, ? super MatchState, Unit> function2, boolean z2, boolean z3, int i, BetSlipUiModel betSlipUiModel, Composer composer, int i2) {
        composer.startReplaceGroup(884809501);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(884809501, i2, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipListUi.SlipLeg (BetSlipListUi.kt:55)");
        }
        BetSlipItemUiKt.BetSlipItemUi(Modifier.INSTANCE, betSlipUiModel, oddType, function1, function2, z2, betSlipUiModel.getMatchSportType(), betSlipUiModel.getMatchSportTypeImage(), betSlipUiModel.getScore(), z ? null : betSlipUiModel.isCoefficientUp(), z, z3, composer, (i2 & 112) | 6, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetSlipListUi$lambda$8$lambda$7$lambda$6(final List list, final boolean z, final OddType oddType, final Function1 function1, final Function2 function2, final boolean z2, final boolean z3, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.items$default(LazyColumn, list.size(), null, null, ComposableLambdaKt.composableLambdaInstance(-792205808, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$BetSlipListUi$3$2$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                int i3;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 48) == 0) {
                    i3 = i2 | (composer.changed(i) ? 32 : 16);
                } else {
                    i3 = i2;
                }
                if ((i3 & Opcodes.I2B) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-792205808, i3, -1, "org.betup.ui.fragment.bets.betslip.compose.BetSlipListUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BetSlipListUi.kt:94)");
                }
                BetSlipListUiKt.BetSlipListUi$SlipLeg(z, oddType, function1, function2, z2, z3, i, list.get(i), composer, (i3 >> 3) & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, null);
        return Unit.INSTANCE;
    }

    public static final void PreviewBetSlipListUi(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1894290417);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1894290417, i, -1, "org.betup.ui.fragment.bets.betslip.compose.PreviewBetSlipListUi (BetSlipListUi.kt:117)");
            }
            BetSlipListUi(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CollectionsKt.emptyList(), null, false, false, false, startRestartGroup, 3078, 246);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewBetSlipListUi$lambda$10;
                    PreviewBetSlipListUi$lambda$10 = BetSlipListUiKt.PreviewBetSlipListUi$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewBetSlipListUi$lambda$10;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d  */
    /* renamed from: CustomScrollbar-t6yy7ic, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13488CustomScrollbart6yy7ic(final LazyListState listState, Modifier modifier, long j, long j2, Brush brush, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        final Brush brush2;
        long j5;
        Object rememberedValue;
        List<LazyListItemInfo> visibleItemsInfo;
        final long j6;
        int i4;
        Intrinsics.checkNotNullParameter(listState, "listState");
        Composer startRestartGroup = composer.startRestartGroup(-221813805);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(listState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
                j3 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j3)) ? 256 : 128;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? 2048 : 1024;
            } else {
                j4 = j2;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    brush2 = brush;
                    if (startRestartGroup.changed(brush2)) {
                        i4 = 16384;
                        i3 |= i4;
                    }
                } else {
                    brush2 = brush;
                }
                i4 = 8192;
                i3 |= i4;
            } else {
                brush2 = brush;
            }
            if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        j3 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
                        i3 &= -897;
                    }
                    if ((i2 & 8) == 0) {
                        j5 = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                        i3 &= -7169;
                    } else {
                        j5 = j4;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        brush2 = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    j5 = j4;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-221813805, i3, -1, "org.betup.ui.fragment.bets.betslip.compose.CustomScrollbar (BetSlipListUi.kt:132)");
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            LazyListLayoutInfo layoutInfo;
                            layoutInfo = LazyListState.this.getLayoutInfo();
                            return layoutInfo;
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                State state = (State) rememberedValue;
                startRestartGroup.endReplaceGroup();
                visibleItemsInfo = CustomScrollbar_t6yy7ic$lambda$13(state).getVisibleItemsInfo();
                if (!visibleItemsInfo.isEmpty()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final Modifier modifier3 = modifier2;
                        final long j7 = j3;
                        final long j8 = j5;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit CustomScrollbar_t6yy7ic$lambda$14;
                                CustomScrollbar_t6yy7ic$lambda$14 = BetSlipListUiKt.CustomScrollbar_t6yy7ic$lambda$14(LazyListState.this, modifier3, j7, j8, brush2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return CustomScrollbar_t6yy7ic$lambda$14;
                            }
                        });
                        return;
                    }
                    return;
                }
                int coerceAtLeast = RangesKt.coerceAtLeast(CustomScrollbar_t6yy7ic$lambda$13(state).getTotalItemsCount(), 1);
                Integer valueOf = Integer.valueOf((int) (CustomScrollbar_t6yy7ic$lambda$13(state).mo1623getViewportSizeYbymL2g() & 4294967295L));
                if (valueOf.intValue() <= 0) {
                    valueOf = null;
                }
                if (valueOf == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        final Modifier modifier4 = modifier2;
                        final long j9 = j3;
                        final long j10 = j5;
                        endRestartGroup2.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit CustomScrollbar_t6yy7ic$lambda$16;
                                CustomScrollbar_t6yy7ic$lambda$16 = BetSlipListUiKt.CustomScrollbar_t6yy7ic$lambda$16(LazyListState.this, modifier4, j9, j10, brush2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return CustomScrollbar_t6yy7ic$lambda$16;
                            }
                        });
                        return;
                    }
                    return;
                }
                int intValue = valueOf.intValue();
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.firstOrNull((List) visibleItemsInfo);
                final int size = lazyListItemInfo != null ? lazyListItemInfo.getSize() : 1;
                Integer valueOf2 = Integer.valueOf(size * coerceAtLeast);
                Integer num = valueOf2.intValue() > 0 ? valueOf2 : null;
                if (num == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup3 = startRestartGroup.endRestartGroup();
                    if (endRestartGroup3 != null) {
                        final Modifier modifier5 = modifier2;
                        final long j11 = j3;
                        final long j12 = j5;
                        endRestartGroup3.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit CustomScrollbar_t6yy7ic$lambda$18;
                                CustomScrollbar_t6yy7ic$lambda$18 = BetSlipListUiKt.CustomScrollbar_t6yy7ic$lambda$18(LazyListState.this, modifier5, j11, j12, brush2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return CustomScrollbar_t6yy7ic$lambda$18;
                            }
                        });
                        return;
                    }
                    return;
                }
                int intValue2 = num.intValue();
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int CustomScrollbar_t6yy7ic$lambda$20$lambda$19;
                            CustomScrollbar_t6yy7ic$lambda$20$lambda$19 = BetSlipListUiKt.CustomScrollbar_t6yy7ic$lambda$20$lambda$19(LazyListState.this, size);
                            return Integer.valueOf(CustomScrollbar_t6yy7ic$lambda$20$lambda$19);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                float coerceIn = RangesKt.coerceIn(CustomScrollbar_t6yy7ic$lambda$21((State) rememberedValue2) / RangesKt.coerceAtLeast(intValue2 - intValue, 1), 0.0f, 1.0f);
                float f = intValue;
                final float coerceIn2 = RangesKt.coerceIn((f * coerceIn) + 8.0f, Math.min(22.0f, f), f);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)558@25470L68:Effects.kt#9igjgp");
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954203484, "CC(remember):Effects.kt#9igjgp");
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(-1224400529);
                boolean changed = startRestartGroup.changed(coerceAtLeast) | startRestartGroup.changedInstance(visibleItemsInfo) | startRestartGroup.changed(coerceIn) | startRestartGroup.changed(intValue) | startRestartGroup.changedInstance(coroutineScope) | ((i3 & 14) == 4);
                BetSlipListUiKt$CustomScrollbar$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new BetSlipListUiKt$CustomScrollbar$2$1(coerceAtLeast, visibleItemsInfo, coerceIn, intValue, coroutineScope, listState);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(modifier2, listState, (PointerInputEventHandler) rememberedValue4);
                startRestartGroup.startReplaceGroup(-1224400529);
                boolean changed2 = ((((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) ^ RendererCapabilities.DECODER_SUPPORT_MASK) > 256 && startRestartGroup.changed(j3)) || (i3 & RendererCapabilities.DECODER_SUPPORT_MASK) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(j5)) || (i3 & 3072) == 2048) | ((((57344 & i3) ^ 24576) > 16384 && startRestartGroup.changed(brush2)) || (i3 & 24576) == 16384) | startRestartGroup.changed(coerceIn2);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    final long j13 = j3;
                    final long j14 = j5;
                    final Brush brush3 = brush2;
                    rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit CustomScrollbar_t6yy7ic$lambda$24$lambda$23;
                            CustomScrollbar_t6yy7ic$lambda$24$lambda$23 = BetSlipListUiKt.CustomScrollbar_t6yy7ic$lambda$24$lambda$23(j13, j14, brush3, coerceIn2, (DrawScope) obj);
                            return CustomScrollbar_t6yy7ic$lambda$24$lambda$23;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                CanvasKt.Canvas(pointerInput, (Function1) rememberedValue5, startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j6 = j3;
            } else {
                startRestartGroup.skipToGroupEnd();
                j6 = j3;
                j5 = j4;
            }
            ScopeUpdateScope endRestartGroup4 = startRestartGroup.endRestartGroup();
            if (endRestartGroup4 != null) {
                final Modifier modifier6 = modifier2;
                final long j15 = j5;
                endRestartGroup4.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.betslip.compose.BetSlipListUiKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CustomScrollbar_t6yy7ic$lambda$25;
                        CustomScrollbar_t6yy7ic$lambda$25 = BetSlipListUiKt.CustomScrollbar_t6yy7ic$lambda$25(LazyListState.this, modifier6, j6, j15, brush2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return CustomScrollbar_t6yy7ic$lambda$25;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        State state2 = (State) rememberedValue;
        startRestartGroup.endReplaceGroup();
        visibleItemsInfo = CustomScrollbar_t6yy7ic$lambda$13(state2).getVisibleItemsInfo();
        if (!visibleItemsInfo.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CustomScrollbar_t6yy7ic$lambda$20$lambda$19(LazyListState lazyListState, int i) {
        return (lazyListState.getFirstVisibleItemIndex() * i) + lazyListState.getFirstVisibleItemScrollOffset();
    }

    private static final LazyListLayoutInfo CustomScrollbar_t6yy7ic$lambda$13(State<? extends LazyListLayoutInfo> state) {
        return state.getValue();
    }

    private static final int CustomScrollbar_t6yy7ic$lambda$21(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomScrollbar_t6yy7ic$lambda$24$lambda$23(long j, long j2, Brush brush, float f, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f2 = 4;
        float intBitsToFloat = (Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32)) - Canvas.mo1167toPx0680j_4(Dp.m7774constructorimpl(f2))) / 2.0f;
        long m4919constructorimpl = Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L));
        DrawScope.m5726drawRoundRectuAw5IA$default(Canvas, j, m4919constructorimpl, Size.m4987constructorimpl((Float.floatToRawIntBits(r16) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(r16) << 32) | (Float.floatToRawIntBits(r16) & 4294967295L)), null, 0.0f, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        long m4919constructorimpl2 = Offset.m4919constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() & 4294967295L));
        float f3 = 1;
        DrawScope.m5726drawRoundRectuAw5IA$default(Canvas, j2, m4919constructorimpl2, Size.m4987constructorimpl((Float.floatToRawIntBits(r16) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(r16) << 32) | (Float.floatToRawIntBits(r16) & 4294967295L)), new Stroke(Canvas.mo1167toPx0680j_4(Dp.m7774constructorimpl(f3)), 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 224, null);
        DrawScope.m5725drawRoundRectZuiqVtQ$default(Canvas, brush, Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(r0) & 4294967295L) | (Float.floatToRawIntBits(Canvas.mo1167toPx0680j_4(Dp.m7774constructorimpl(f2))) << 32)), 0.0f, null, null, 0, PsExtractor.VIDEO_STREAM_MASK, null);
        long m4919constructorimpl3 = Offset.m4919constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
        long m4987constructorimpl = Size.m4987constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (Canvas.mo5730getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
        float f4 = Canvas.mo1167toPx0680j_4(Dp.m7774constructorimpl(f2));
        DrawScope.m5726drawRoundRectuAw5IA$default(Canvas, j2, m4919constructorimpl3, m4987constructorimpl, CornerRadius.m4881constructorimpl((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L)), new Stroke(Canvas.mo1167toPx0680j_4(Dp.m7774constructorimpl(f3)), 0.0f, 0, 0, null, 30, null), 0.0f, null, 0, 224, null);
        return Unit.INSTANCE;
    }
}
