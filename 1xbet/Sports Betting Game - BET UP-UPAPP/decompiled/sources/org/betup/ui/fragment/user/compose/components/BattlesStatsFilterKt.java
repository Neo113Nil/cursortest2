package org.betup.ui.fragment.user.compose.components;

import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.challenges.BattleCountModel;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.betup.ui.views.ComposeUtils;
import org.betup.utils.UiExtensionsKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: BattlesStatsFilter.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001aY\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0012\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"BattlesStatsFilter", "", "selectedFilter", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", "onFilterSelected", "Lkotlin/Function1;", "battleCounts", "", "Lorg/betup/model/remote/entity/challenges/BattleCountModel;", "totalItems", "", "(Lorg/betup/model/remote/entity/challenges/ChallengeState;Lkotlin/jvm/functions/Function1;Ljava/util/List;ILandroidx/compose/runtime/Composer;II)V", "BattlesStatsFilterItem", "modifier", "Landroidx/compose/ui/Modifier;", "state", "onSelect", "Lkotlin/Function0;", "isFirst", "", "isOpen", "(Landroidx/compose/ui/Modifier;Lorg/betup/model/remote/entity/challenges/ChallengeState;Lkotlin/jvm/functions/Function0;ZZLjava/util/List;ILandroidx/compose/runtime/Composer;II)V", "app_release", "itemList", "shape", "Landroidx/compose/foundation/shape/RoundedCornerShape;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattlesStatsFilterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlesStatsFilter$lambda$18(ChallengeState challengeState, Function1 function1, List list, int i, int i2, int i3, Composer composer, int i4) {
        BattlesStatsFilter(challengeState, function1, list, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlesStatsFilterItem$lambda$27(Modifier modifier, ChallengeState challengeState, Function0 function0, boolean z, boolean z2, List list, int i, int i2, int i3, Composer composer, int i4) {
        BattlesStatsFilterItem(modifier, challengeState, function0, z, z2, list, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattlesStatsFilter(final ChallengeState challengeState, final Function1<? super ChallengeState, Unit> onFilterSelected, List<BattleCountModel> list, int i, Composer composer, final int i2, final int i3) {
        int i4;
        List<BattleCountModel> list2;
        int i5;
        int i6;
        List<BattleCountModel> emptyList;
        int i7;
        Object rememberedValue;
        final MutableState mutableState;
        boolean z;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        Object rememberedValue5;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean changed;
        Object rememberedValue6;
        Composer composer2;
        final List<BattleCountModel> list3;
        final int i8;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onFilterSelected, "onFilterSelected");
        Composer startRestartGroup = composer.startRestartGroup(-2010214005);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(challengeState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(onFilterSelected) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            list2 = list;
            i4 |= startRestartGroup.changedInstance(list2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 2048 : 1024;
                if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    emptyList = i9 != 0 ? CollectionsKt.emptyList() : list2;
                    i7 = i5 != 0 ? 0 : i6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2010214005, i4, -1, "org.betup.ui.fragment.user.compose.components.BattlesStatsFilter (BattlesStatsFilter.kt:46)");
                    }
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1633490746);
                    int i10 = i4 & 14;
                    z = i10 == 4;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                List BattlesStatsFilter$lambda$4$lambda$3;
                                BattlesStatsFilter$lambda$4$lambda$3 = BattlesStatsFilterKt.BattlesStatsFilter$lambda$4$lambda$3(MutableState.this, challengeState);
                                return BattlesStatsFilter$lambda$4$lambda$3;
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final State state = (State) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Density density = (Density) consume;
                    ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localView);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final View view = (View) consume2;
                    startRestartGroup.startReplaceGroup(5004770);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                RoundedCornerShape BattlesStatsFilter$lambda$7$lambda$6;
                                BattlesStatsFilter$lambda$7$lambda$6 = BattlesStatsFilterKt.BattlesStatsFilter$lambda$7$lambda$6(MutableState.this);
                                return BattlesStatsFilter$lambda$7$lambda$6;
                            }
                        });
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    State state2 = (State) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m7772boximpl(Dp.m7774constructorimpl(218)), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    final MutableState mutableState2 = (MutableState) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    Modifier m1568width3ABfNKs = SizeKt.m1568width3ABfNKs(BorderKt.m1038borderziNgDLE(BackgroundKt.background$default(Modifier.INSTANCE, ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), BattlesStatsFilter$lambda$8(state2), 0.0f, 4, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), BattlesStatsFilter$lambda$8(state2)), ((Dp) mutableState2.getValue()).m7788unboximpl());
                    startRestartGroup.startReplaceGroup(5004770);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit BattlesStatsFilter$lambda$11$lambda$10;
                                BattlesStatsFilter$lambda$11$lambda$10 = BattlesStatsFilterKt.BattlesStatsFilter$lambda$11$lambda$10(MutableState.this);
                                return BattlesStatsFilter$lambda$11$lambda$10;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(m1568width3ABfNKs, false, null, null, (Function0) rememberedValue5, 7, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
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
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1224400529);
                    changed = startRestartGroup.changed(state) | (i10 == 4) | startRestartGroup.changed(density) | startRestartGroup.changedInstance(view) | ((i4 & 112) == 32) | startRestartGroup.changedInstance(emptyList) | ((i4 & 7168) == 2048);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        final List<BattleCountModel> list4 = emptyList;
                        final int i11 = i7;
                        Object obj = new Function1() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit BattlesStatsFilter$lambda$17$lambda$16$lambda$15;
                                BattlesStatsFilter$lambda$17$lambda$16$lambda$15 = BattlesStatsFilterKt.BattlesStatsFilter$lambda$17$lambda$16$lambda$15(State.this, challengeState, mutableState, density, view, onFilterSelected, list4, i11, mutableState2, (LazyListScope) obj2);
                                return BattlesStatsFilter$lambda$17$lambda$16$lambda$15;
                            }
                        };
                        startRestartGroup.updateRememberedValue(obj);
                        rememberedValue6 = obj;
                    }
                    startRestartGroup.endReplaceGroup();
                    List<BattleCountModel> list5 = emptyList;
                    composer2 = startRestartGroup;
                    LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) rememberedValue6, composer2, 0, 511);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    list3 = list5;
                    i8 = i7;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    list3 = list2;
                    i8 = i6;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            Unit BattlesStatsFilter$lambda$18;
                            BattlesStatsFilter$lambda$18 = BattlesStatsFilterKt.BattlesStatsFilter$lambda$18(ChallengeState.this, onFilterSelected, list3, i8, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                            return BattlesStatsFilter$lambda$18;
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if ((i4 & 1171) == 1170) {
            }
            if (i9 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1633490746);
            int i102 = i4 & 14;
            if (i102 == 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    List BattlesStatsFilter$lambda$4$lambda$3;
                    BattlesStatsFilter$lambda$4$lambda$3 = BattlesStatsFilterKt.BattlesStatsFilter$lambda$4$lambda$3(MutableState.this, challengeState);
                    return BattlesStatsFilter$lambda$4$lambda$3;
                }
            });
            startRestartGroup.updateRememberedValue(rememberedValue2);
            final State state3 = (State) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Density density2 = (Density) consume3;
            ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localView2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final View view2 = (View) consume22;
            startRestartGroup.startReplaceGroup(5004770);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            }
            State state22 = (State) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState22 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            Modifier m1568width3ABfNKs2 = SizeKt.m1568width3ABfNKs(BorderKt.m1038borderziNgDLE(BackgroundKt.background$default(Modifier.INSTANCE, ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), BattlesStatsFilter$lambda$8(state22), 0.0f, 4, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), BattlesStatsFilter$lambda$8(state22)), ((Dp) mutableState22.getValue()).m7788unboximpl());
            startRestartGroup.startReplaceGroup(5004770);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(m1568width3ABfNKs2, false, null, null, (Function0) rememberedValue5, 7, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1224400529);
            changed = startRestartGroup.changed(state3) | (i102 == 4) | startRestartGroup.changed(density2) | startRestartGroup.changedInstance(view2) | ((i4 & 112) == 32) | startRestartGroup.changedInstance(emptyList) | ((i4 & 7168) == 2048);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            final List list42 = emptyList;
            final int i112 = i7;
            Object obj2 = new Function1() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj22) {
                    Unit BattlesStatsFilter$lambda$17$lambda$16$lambda$15;
                    BattlesStatsFilter$lambda$17$lambda$16$lambda$15 = BattlesStatsFilterKt.BattlesStatsFilter$lambda$17$lambda$16$lambda$15(State.this, challengeState, mutableState, density2, view2, onFilterSelected, list42, i112, mutableState22, (LazyListScope) obj22);
                    return BattlesStatsFilter$lambda$17$lambda$16$lambda$15;
                }
            };
            startRestartGroup.updateRememberedValue(obj2);
            rememberedValue6 = obj2;
            startRestartGroup.endReplaceGroup();
            List<BattleCountModel> list52 = emptyList;
            composer2 = startRestartGroup;
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) rememberedValue6, composer2, 0, 511);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            list3 = list52;
            i8 = i7;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        list2 = list;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i;
        if ((i4 & 1171) == 1170) {
        }
        if (i9 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        int i1022 = i4 & 14;
        if (i1022 == 4) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List BattlesStatsFilter$lambda$4$lambda$3;
                BattlesStatsFilter$lambda$4$lambda$3 = BattlesStatsFilterKt.BattlesStatsFilter$lambda$4$lambda$3(MutableState.this, challengeState);
                return BattlesStatsFilter$lambda$4$lambda$3;
            }
        });
        startRestartGroup.updateRememberedValue(rememberedValue2);
        final State state32 = (State) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume32 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density22 = (Density) consume32;
        ProvidableCompositionLocal<View> localView22 = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localView22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final View view22 = (View) consume222;
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        State state222 = (State) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState222 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        Modifier m1568width3ABfNKs22 = SizeKt.m1568width3ABfNKs(BorderKt.m1038borderziNgDLE(BackgroundKt.background$default(Modifier.INSTANCE, ComposeUtils.AppBrushPalette.ButtonBackgroundGrayDouble.INSTANCE.getBrush(), BattlesStatsFilter$lambda$8(state222), 0.0f, 4, null), Dp.m7774constructorimpl(1), ComposeUtils.AppBrushPalette.BorderGrayTransparent.INSTANCE.getBrush(), BattlesStatsFilter$lambda$8(state222)), ((Dp) mutableState222.getValue()).m7788unboximpl());
        startRestartGroup.startReplaceGroup(5004770);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(m1568width3ABfNKs22, false, null, null, (Function0) rememberedValue5, 7, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1224400529);
        changed = startRestartGroup.changed(state32) | (i1022 == 4) | startRestartGroup.changed(density22) | startRestartGroup.changedInstance(view22) | ((i4 & 112) == 32) | startRestartGroup.changedInstance(emptyList) | ((i4 & 7168) == 2048);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        final List list422 = emptyList;
        final int i1122 = i7;
        Object obj22 = new Function1() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj222) {
                Unit BattlesStatsFilter$lambda$17$lambda$16$lambda$15;
                BattlesStatsFilter$lambda$17$lambda$16$lambda$15 = BattlesStatsFilterKt.BattlesStatsFilter$lambda$17$lambda$16$lambda$15(State.this, challengeState, mutableState, density22, view22, onFilterSelected, list422, i1122, mutableState222, (LazyListScope) obj222);
                return BattlesStatsFilter$lambda$17$lambda$16$lambda$15;
            }
        };
        startRestartGroup.updateRememberedValue(obj22);
        rememberedValue6 = obj22;
        startRestartGroup.endReplaceGroup();
        List<BattleCountModel> list522 = emptyList;
        composer2 = startRestartGroup;
        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) rememberedValue6, composer2, 0, 511);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        list3 = list522;
        i8 = i7;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List BattlesStatsFilter$lambda$4$lambda$3(MutableState mutableState, ChallengeState challengeState) {
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            List listOf = CollectionsKt.listOf((Object[]) new ChallengeState[]{null, ChallengeState.WON.INSTANCE, ChallengeState.ACCEPTED.INSTANCE, ChallengeState.RETURN.INSTANCE, ChallengeState.LOST.INSTANCE, ChallengeState.DRAW.INSTANCE, ChallengeState.PENDING.INSTANCE});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listOf) {
                if (!Intrinsics.areEqual((ChallengeState) obj, challengeState)) {
                    arrayList.add(obj);
                }
            }
            List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            mutableList.add(0, challengeState);
            return mutableList;
        }
        return CollectionsKt.listOf(challengeState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RoundedCornerShape BattlesStatsFilter$lambda$7$lambda$6(MutableState mutableState) {
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            return RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(16));
        }
        return RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(50));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlesStatsFilter$lambda$11$lambda$10(MutableState mutableState) {
        mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlesStatsFilter$lambda$17$lambda$16$lambda$15(State state, final ChallengeState challengeState, final MutableState mutableState, final Density density, final View view, final Function1 function1, final List list, final int i, final MutableState mutableState2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<ChallengeState> BattlesStatsFilter$lambda$5 = BattlesStatsFilter$lambda$5(state);
        LazyColumn.items(BattlesStatsFilter$lambda$5.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$BattlesStatsFilter$lambda$17$lambda$16$lambda$15$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                BattlesStatsFilter$lambda$5.get(i2);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$BattlesStatsFilter$lambda$17$lambda$16$lambda$15$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                int i4;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i3 & 6) == 0) {
                    i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if (!composer.shouldExecute((i4 & Opcodes.I2S) != 146, i4 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i4, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final ChallengeState challengeState2 = (ChallengeState) BattlesStatsFilter$lambda$5.get(i2);
                composer.startReplaceGroup(1576834179);
                boolean areEqual = Intrinsics.areEqual(challengeState, challengeState2);
                boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1746271574);
                boolean changed = composer.changed(density) | composer.changedInstance(view);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState3 = mutableState2;
                    final Density density2 = density;
                    final View view2 = view;
                    rememberedValue = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$BattlesStatsFilter$2$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                            invoke2(layoutCoordinates);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LayoutCoordinates it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            int mo6536getSizeYbymL2g = (int) (it.mo6536getSizeYbymL2g() >> 32);
                            if (mo6536getSizeYbymL2g > mutableState3.getValue().m7788unboximpl()) {
                                final float mo1164toDpu2uoSUM = density2.mo1164toDpu2uoSUM(mo6536getSizeYbymL2g);
                                View view3 = view2;
                                final MutableState<Dp> mutableState4 = mutableState3;
                                view3.post(new Runnable() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$BattlesStatsFilter$2$1$1$1$1$1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        mutableState4.setValue(Dp.m7772boximpl(mo1164toDpu2uoSUM));
                                    }
                                });
                            }
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion, (Function1) rememberedValue);
                composer.startReplaceGroup(-1746271574);
                boolean changed2 = composer.changed(function1) | composer.changed(challengeState2);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState4 = mutableState;
                    final Function1 function12 = function1;
                    rememberedValue2 = (Function0) new Function0<Unit>() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$BattlesStatsFilter$2$1$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (mutableState4.getValue().booleanValue()) {
                                function12.invoke(challengeState2);
                            }
                            mutableState4.setValue(Boolean.valueOf(!r0.getValue().booleanValue()));
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                BattlesStatsFilterKt.BattlesStatsFilterItem(onGloballyPositioned, challengeState2, (Function0) rememberedValue2, areEqual, booleanValue, list, i, composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0529  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BattlesStatsFilterItem(final Modifier modifier, final ChallengeState challengeState, final Function0<Unit> onSelect, boolean z, final boolean z2, List<BattleCountModel> list, int i, Composer composer, final int i2, final int i3) {
        int i4;
        boolean z3;
        int i5;
        List<BattleCountModel> list2;
        int i6;
        int i7;
        boolean z4;
        Object obj;
        int count;
        boolean z5;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        int currentCompositeKeyHash5;
        Composer m4610constructorimpl5;
        final List<BattleCountModel> list3;
        final int i8;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        Composer startRestartGroup = composer.startRestartGroup(-2128661336);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(challengeState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i4 |= startRestartGroup.changedInstance(onSelect) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            z3 = z;
            i4 |= startRestartGroup.changed(z3) ? 2048 : 1024;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                list2 = list;
                i4 |= startRestartGroup.changedInstance(list2) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    i7 = i;
                    i4 |= startRestartGroup.changed(i7) ? 1048576 : 524288;
                    if ((i4 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                        z4 = i9 == 0 ? true : z3;
                        List<BattleCountModel> emptyList = i5 == 0 ? CollectionsKt.emptyList() : list2;
                        int i10 = i6 == 0 ? 0 : i7;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2128661336, i4, -1, "org.betup.ui.fragment.user.compose.components.BattlesStatsFilterItem (BattlesStatsFilter.kt:142)");
                        }
                        int icon = challengeState != null ? R.drawable.battles_icon_new_selected : UiExtensionsKt.getIcon(challengeState);
                        int title = challengeState != null ? R.string.all : UiExtensionsKt.getTitle(challengeState);
                        if (challengeState != null) {
                            count = i10;
                        } else {
                            Iterator<T> it = emptyList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                BattleCountModel battleCountModel = (BattleCountModel) obj;
                                if (challengeState != null && battleCountModel.getState() == challengeState.getValue()) {
                                    break;
                                }
                            }
                            BattleCountModel battleCountModel2 = (BattleCountModel) obj;
                            count = battleCountModel2 != null ? battleCountModel2.getCount() : 0;
                        }
                        float f = 20;
                        float f2 = 12;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1519paddingqDBjuR0(modifier, Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f2)), 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(5004770);
                        z5 = (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z5 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit BattlesStatsFilterItem$lambda$21$lambda$20;
                                    BattlesStatsFilterItem$lambda$21$lambda$20 = BattlesStatsFilterKt.BattlesStatsFilterItem$lambda$21$lambda$20(Function0.this);
                                    return BattlesStatsFilterItem$lambda$21$lambda$20;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        Modifier m1059clickableXHw0xAI$default = ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue, 7, null);
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        float f3 = 24;
                        Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl((float) 0.9d)), Dp.m7774constructorimpl(f3));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1563size3ABfNKs);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor3);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        ImageKt.Image(PainterResources_androidKt.painterResource(icon, startRestartGroup, 0), StringResources_androidKt.stringResource(R.string.cd_filter_icon, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        float f4 = 4;
                        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(title, startRestartGroup, 0), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f4), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor4);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                        TextKt.m2642Text4IGK_g(String.valueOf(count), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f4), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4)), startRestartGroup, 6);
                        Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(1)), Dp.m7774constructorimpl(f3));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1563size3ABfNKs2);
                        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor5);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                        }
                        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        startRestartGroup.startReplaceGroup(762264711);
                        if (z4) {
                            ImageKt.Image(PainterResources_androidKt.painterResource(z2 ? R.drawable.arrow_up_gold : R.drawable.arrow_down_gold, startRestartGroup, 0), StringResources_androidKt.stringResource(R.string.cd_filter_icon, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z3 = z4;
                        list3 = emptyList;
                        i8 = i10;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        list3 = list2;
                        i8 = i7;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final boolean z6 = z3;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit BattlesStatsFilterItem$lambda$27;
                                BattlesStatsFilterItem$lambda$27 = BattlesStatsFilterKt.BattlesStatsFilterItem$lambda$27(Modifier.this, challengeState, onSelect, z6, z2, list3, i8, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                                return BattlesStatsFilterItem$lambda$27;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i;
                if ((i4 & 599187) == 599186) {
                }
                if (i9 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (challengeState != null) {
                }
                int title2 = challengeState != null ? R.string.all : UiExtensionsKt.getTitle(challengeState);
                if (challengeState != null) {
                }
                float f5 = 20;
                float f22 = 12;
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m1519paddingqDBjuR0(modifier, Dp.m7774constructorimpl(f5), Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(f5), Dp.m7774constructorimpl(f22)), 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(5004770);
                if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z5) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit BattlesStatsFilterItem$lambda$21$lambda$20;
                        BattlesStatsFilterItem$lambda$21$lambda$20 = BattlesStatsFilterKt.BattlesStatsFilterItem$lambda$21$lambda$20(Function0.this);
                        return BattlesStatsFilterItem$lambda$21$lambda$20;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                Modifier m1059clickableXHw0xAI$default2 = ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default2, false, null, null, (Function0) rememberedValue, 7, null);
                Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically4, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default2);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash6);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting()) {
                }
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
                float f32 = 24;
                Modifier m1563size3ABfNKs3 = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl((float) 0.9d)), Dp.m7774constructorimpl(f32));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m1563size3ABfNKs3);
                Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl3.getInserting()) {
                }
                m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
                Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(icon, startRestartGroup, 0), StringResources_androidKt.stringResource(R.string.cd_filter_icon, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                float f42 = 4;
                TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(title2, startRestartGroup, 0), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f42), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Alignment.Vertical centerVertically32 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                Modifier.Companion companion22 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically32, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
                Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl4.getInserting()) {
                }
                m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
                Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
                TextKt.m2642Text4IGK_g(String.valueOf(count), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f42), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
                SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f42)), startRestartGroup, 6);
                Modifier m1563size3ABfNKs22 = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(1)), Dp.m7774constructorimpl(f32));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, m1563size3ABfNKs22);
                Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl5.getInserting()) {
                }
                m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash52);
                Updater.m4617setimpl(m4610constructorimpl5, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(762264711);
                if (z4) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z4;
                list3 = emptyList;
                i8 = i10;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            list2 = list;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i;
            if ((i4 & 599187) == 599186) {
            }
            if (i9 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (challengeState != null) {
            }
            int title22 = challengeState != null ? R.string.all : UiExtensionsKt.getTitle(challengeState);
            if (challengeState != null) {
            }
            float f52 = 20;
            float f222 = 12;
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(PaddingKt.m1519paddingqDBjuR0(modifier, Dp.m7774constructorimpl(f52), Dp.m7774constructorimpl(f222), Dp.m7774constructorimpl(f52), Dp.m7774constructorimpl(f222)), 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(5004770);
            if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z5) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit BattlesStatsFilterItem$lambda$21$lambda$20;
                    BattlesStatsFilterItem$lambda$21$lambda$20 = BattlesStatsFilterKt.BattlesStatsFilterItem$lambda$21$lambda$20(Function0.this);
                    return BattlesStatsFilterItem$lambda$21$lambda$20;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier m1059clickableXHw0xAI$default22 = ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default22, false, null, null, (Function0) rememberedValue, 7, null);
            Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically42 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy42 = RowKt.rowMeasurePolicy(spaceBetween22, centerVertically42, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default22);
            Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash62);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance42 = RowScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion32 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion32);
            Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
            float f322 = 24;
            Modifier m1563size3ABfNKs32 = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl((float) 0.9d)), Dp.m7774constructorimpl(f322));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, m1563size3ABfNKs32);
            Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(icon, startRestartGroup, 0), StringResources_androidKt.stringResource(R.string.cd_filter_icon, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float f422 = 4;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(title22, startRestartGroup, 0), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f422), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Alignment.Vertical centerVertically322 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier.Companion companion222 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy322 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically322, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
            Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance322 = RowScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(String.valueOf(count), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f422), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f422)), startRestartGroup, 6);
            Modifier m1563size3ABfNKs222 = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(1)), Dp.m7774constructorimpl(f322));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, m1563size3ABfNKs222);
            Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl5.getInserting()) {
            }
            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash522);
            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(762264711);
            if (z4) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z4;
            list3 = emptyList;
            i8 = i10;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z3 = z;
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        list2 = list;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i;
        if ((i4 & 599187) == 599186) {
        }
        if (i9 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (challengeState != null) {
        }
        int title222 = challengeState != null ? R.string.all : UiExtensionsKt.getTitle(challengeState);
        if (challengeState != null) {
        }
        float f522 = 20;
        float f2222 = 12;
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(PaddingKt.m1519paddingqDBjuR0(modifier, Dp.m7774constructorimpl(f522), Dp.m7774constructorimpl(f2222), Dp.m7774constructorimpl(f522), Dp.m7774constructorimpl(f2222)), 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) != 256) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.user.compose.components.BattlesStatsFilterKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit BattlesStatsFilterItem$lambda$21$lambda$20;
                BattlesStatsFilterItem$lambda$21$lambda$20 = BattlesStatsFilterKt.BattlesStatsFilterItem$lambda$21$lambda$20(Function0.this);
                return BattlesStatsFilterItem$lambda$21$lambda$20;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1059clickableXHw0xAI$default222 = ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default222, false, null, null, (Function0) rememberedValue, 7, null);
        Arrangement.HorizontalOrVertical spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically422 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy422 = RowKt.rowMeasurePolicy(spaceBetween222, centerVertically422, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap622 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier622 = ComposedModifierKt.materializeModifier(startRestartGroup, m1059clickableXHw0xAI$default222);
        Function0<ComposeUiNode> constructor622 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash622);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance422 = RowScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically2222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion322 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy2222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion322);
        Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2222 = RowScopeInstance.INSTANCE;
        float f3222 = 24;
        Modifier m1563size3ABfNKs322 = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl((float) 0.9d)), Dp.m7774constructorimpl(f3222));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1563size3ABfNKs322);
        Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3222);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        ImageKt.Image(PainterResources_androidKt.painterResource(icon, startRestartGroup, 0), StringResources_androidKt.stringResource(R.string.cd_filter_icon, startRestartGroup, 6), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 124);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float f4222 = 4;
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(title222, startRestartGroup, 0), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f4222), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Alignment.Vertical centerVertically3222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        Modifier.Companion companion2222 = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy3222 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222);
        Function0<ComposeUiNode> constructor4222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, rowMeasurePolicy3222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4222);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3222 = RowScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(String.valueOf(count), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m7774constructorimpl(f4222), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, 48, 0, 65532);
        SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f4222)), startRestartGroup, 6);
        Modifier m1563size3ABfNKs2222 = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(1)), Dp.m7774constructorimpl(f3222));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier5222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1563size3ABfNKs2222);
        Function0<ComposeUiNode> constructor5222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl5, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl5.getInserting()) {
        }
        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5222);
        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(762264711);
        if (z4) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z4;
        list3 = emptyList;
        i8 = i10;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BattlesStatsFilterItem$lambda$21$lambda$20(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final List<ChallengeState> BattlesStatsFilter$lambda$5(State<? extends List<? extends ChallengeState>> state) {
        return (List) state.getValue();
    }

    private static final RoundedCornerShape BattlesStatsFilter$lambda$8(State<RoundedCornerShape> state) {
        return state.getValue();
    }
}
