package org.betup.ui.tour.compose;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.mediarouter.media.MediaRouterJellybean;
import com.ironsource.X2;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.MatchState;
import org.betup.model.remote.entity.matches.details.MatchShortInfoModel;
import org.betup.model.remote.entity.matches.details.SportModelShort;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;
import org.betup.ui.fragment.matches.details.MatchDetailsController;
import org.betup.ui.fragment.matches.details.compose.MatchTopBaseData;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: TourBetSelectionDialog.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011X\u008a\u0084\u0002²\u0006\u0010\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017X\u008a\u0084\u0002²\u0006\u0010\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017X\u008a\u0084\u0002²\u0006\"\u0010\u0019\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u001a0\u001aX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u0084\u0002"}, d2 = {"TourBetSelectionDialogContent", "", "controller", "Lorg/betup/ui/fragment/matches/details/MatchDetailsController;", "onBetClick", "Lkotlin/Function2;", "", "", "onDismiss", "Lkotlin/Function0;", "tourState", "Lorg/betup/ui/tour/compose/TourState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/matches/details/MatchDetailsController;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lorg/betup/ui/tour/compose/TourState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "subMatches", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsTabs;", "selectedBetGroupTabIndex", "betGroups", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyGroupBetsModel;", "selectedBetIds", "", "validatingBetIds", "expandedStatesPerTab", "", "", "match", "Lorg/betup/model/remote/entity/matches/details/MatchShortInfoModel;", "matchBaseData", "Lorg/betup/ui/fragment/matches/details/compose/MatchTopBaseData;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourBetSelectionDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourBetSelectionDialogContent$lambda$28(MatchDetailsController matchDetailsController, Function2 function2, Function0 function0, TourState tourState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TourBetSelectionDialogContent(matchDetailsController, function2, function0, tourState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x09dd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x09f9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x058f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TourBetSelectionDialogContent(final MatchDetailsController controller, final Function2<? super Long, ? super Integer, Unit> onBetClick, final Function0<Unit> onDismiss, TourState tourState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        TourState tourState2;
        int i4;
        Modifier modifier2;
        int i5;
        TourState tourState3;
        float m7774constructorimpl;
        State collectAsState;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m4610constructorimpl3;
        int currentCompositeKeyHash4;
        Composer m4610constructorimpl4;
        boolean z;
        Object rememberedValue;
        int currentCompositeKeyHash5;
        Composer m4610constructorimpl5;
        int currentCompositeKeyHash6;
        Composer m4610constructorimpl6;
        int currentCompositeKeyHash7;
        Composer m4610constructorimpl7;
        int currentCompositeKeyHash8;
        Composer m4610constructorimpl8;
        boolean changedInstance;
        Object rememberedValue2;
        Map<Long, Boolean> map;
        LinkedHashMap linkedHashMap;
        boolean changedInstance2;
        Object rememberedValue3;
        boolean changedInstance3;
        Object rememberedValue4;
        boolean changedInstance4;
        Object rememberedValue5;
        MatchShortInfoModel TourBetSelectionDialogContent$lambda$7;
        MatchTopBaseData TourBetSelectionDialogContent$lambda$8;
        Integer num;
        int sportId;
        MatchShortInfoModel TourBetSelectionDialogContent$lambda$72;
        Integer num2;
        MatchState matchStat;
        int val;
        Composer composer2;
        final TourState tourState4;
        final Modifier modifier3;
        SportModelShort sport;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(491769758);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onBetClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            tourState2 = tourState;
            i3 |= startRestartGroup.changed(tourState2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
                i5 = i3;
                if ((i5 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    tourState3 = i6 != 0 ? null : tourState2;
                    Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(491769758, i5, -1, "org.betup.ui.tour.compose.TourBetSelectionDialogContent (TourBetSelectionDialog.kt:49)");
                    }
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Density density = (Density) consume;
                    ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume2 = startRestartGroup.consume(localConfiguration);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Dp.m7774constructorimpl(((Configuration) consume2).screenWidthDp);
                    ProvidableCompositionLocal<Configuration> localConfiguration2 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume3 = startRestartGroup.consume(localConfiguration2);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Dp.m7774constructorimpl(((Configuration) consume3).screenHeightDp);
                    if ((tourState3 != null ? tourState3.getBaseMatchItemBounds() : null) != null) {
                        m7774constructorimpl = density.mo1163toDpu2uoSUM(r3.bottom);
                    } else {
                        m7774constructorimpl = Dp.m7774constructorimpl(200);
                    }
                    float f = m7774constructorimpl;
                    State collectAsState2 = SnapshotStateKt.collectAsState(controller.getSubMatches(), null, startRestartGroup, 0, 1);
                    State collectAsState3 = SnapshotStateKt.collectAsState(controller.getSelectedBetGroupTabIndex(), null, startRestartGroup, 0, 1);
                    State collectAsState4 = SnapshotStateKt.collectAsState(controller.getBetGroups(), null, startRestartGroup, 0, 1);
                    State collectAsState5 = SnapshotStateKt.collectAsState(controller.getSelectedBetIds(), null, startRestartGroup, 0, 1);
                    State collectAsState6 = SnapshotStateKt.collectAsState(controller.getValidatingBetIds(), null, startRestartGroup, 0, 1);
                    State collectAsState7 = SnapshotStateKt.collectAsState(controller.getExpandedStatesPerTab(), null, startRestartGroup, 0, 1);
                    State collectAsState8 = SnapshotStateKt.collectAsState(controller.getCurrentMatch(), null, startRestartGroup, 0, 1);
                    collectAsState = SnapshotStateKt.collectAsState(controller.getBaseMatchInfo(), null, startRestartGroup, 0, 1);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    Modifier modifier5 = modifier4;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Alignment.INSTANCE.getBottomStart()), 0.0f, f, 0.0f, Dp.m7774constructorimpl(60), 5, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl3.getInserting() || !Intrinsics.areEqual(m4610constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4617setimpl(m4610constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor4);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl4.getInserting() || !Intrinsics.areEqual(m4610constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m4617setimpl(m4610constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6);
                    String stringResource = StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6);
                    ContentScale fit = ContentScale.INSTANCE.getFit();
                    Modifier align = boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd());
                    float f2 = 16;
                    Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(align, Dp.m7774constructorimpl(f2)), Dp.m7774constructorimpl(36));
                    startRestartGroup.startReplaceGroup(5004770);
                    z = (i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9;
                                TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9(Function0.this);
                                return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    ImageKt.Image(painterResource, stringResource, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs, false, null, null, (Function0) rememberedValue, 7, null), (Alignment) null, fit, 0.0f, (ColorFilter) null, startRestartGroup, 24576, 104);
                    float f3 = 8;
                    Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f3));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor5);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl5.getInserting() || !Intrinsics.areEqual(m4610constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m4617setimpl(m4610constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5205getWhite0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(24))), Dp.m7774constructorimpl(f2));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
                    Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor6);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl6.getInserting() || !Intrinsics.areEqual(m4610constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    Updater.m4617setimpl(m4610constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor7);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl7, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl7.getInserting() || !Intrinsics.areEqual(m4610constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                    }
                    Updater.m4617setimpl(m4610constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_select_bet_title, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5194getBlack0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200112, 0, 130512);
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_select_bet_subtitle, startRestartGroup, 6), PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f3), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5198getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, X2.b.f, 0, 130544);
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
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), null, 2, null), 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(12), 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
                    Function0<ComposeUiNode> constructor8 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor8);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl8 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl8, maybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl8.getInserting() || !Intrinsics.areEqual(m4610constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                        m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                        m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                    }
                    Updater.m4617setimpl(m4610constructorimpl8, materializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    List<BetGroupsTabs> TourBetSelectionDialogContent$lambda$1 = TourBetSelectionDialogContent$lambda$1(collectAsState2);
                    int TourBetSelectionDialogContent$lambda$2 = TourBetSelectionDialogContent$lambda$2(collectAsState3);
                    List<MatchVarietyGroupBetsModel> TourBetSelectionDialogContent$lambda$3 = TourBetSelectionDialogContent$lambda$3(collectAsState4);
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance = startRestartGroup.changedInstance(controller);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15;
                                TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15(MatchDetailsController.this, ((Integer) obj).intValue());
                                return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function1 = (Function1) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                    Set<Long> TourBetSelectionDialogContent$lambda$4 = TourBetSelectionDialogContent$lambda$4(collectAsState5);
                    Set<Long> TourBetSelectionDialogContent$lambda$5 = TourBetSelectionDialogContent$lambda$5(collectAsState6);
                    map = TourBetSelectionDialogContent$lambda$6(collectAsState7).get(Integer.valueOf(TourBetSelectionDialogContent$lambda$2(collectAsState3)));
                    if (map == null) {
                        List<MatchVarietyGroupBetsModel> TourBetSelectionDialogContent$lambda$32 = TourBetSelectionDialogContent$lambda$3(collectAsState4);
                        linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(TourBetSelectionDialogContent$lambda$32, 10)), 16));
                        Iterator<T> it = TourBetSelectionDialogContent$lambda$32.iterator();
                        while (it.hasNext()) {
                            Pair pair = TuplesKt.to(Long.valueOf(((MatchVarietyGroupBetsModel) it.next()).getGroup().getId()), false);
                            linkedHashMap.put(pair.getFirst(), pair.getSecond());
                        }
                    } else {
                        linkedHashMap = map;
                    }
                    Map<Integer, Map<Long, Boolean>> TourBetSelectionDialogContent$lambda$6 = TourBetSelectionDialogContent$lambda$6(collectAsState7);
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance2 = startRestartGroup.changedInstance(controller);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function2() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18;
                                TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18(MatchDetailsController.this, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                                return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    Function2 function2 = (Function2) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance3 = startRestartGroup.changedInstance(controller);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function3() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20;
                                TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20(MatchDetailsController.this, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), (List) obj3);
                                return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    Function3 function3 = (Function3) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    OddType oddType = controller.getOddType();
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance4 = startRestartGroup.changedInstance(controller);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function0() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                List currentBets;
                                currentBets = MatchDetailsController.this.getCurrentBets();
                                return currentBets;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function0 = (Function0) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    TourBetSelectionDialogContent$lambda$7 = TourBetSelectionDialogContent$lambda$7(collectAsState8);
                    if (TourBetSelectionDialogContent$lambda$7 != null || (sport = TourBetSelectionDialogContent$lambda$7.getSport()) == null) {
                        TourBetSelectionDialogContent$lambda$8 = TourBetSelectionDialogContent$lambda$8(collectAsState);
                        if (TourBetSelectionDialogContent$lambda$8 != null) {
                            sportId = TourBetSelectionDialogContent$lambda$8.getSportId();
                        } else {
                            num = null;
                            MatchShortInfoModel TourBetSelectionDialogContent$lambda$73 = TourBetSelectionDialogContent$lambda$7(collectAsState8);
                            String resultRaw = TourBetSelectionDialogContent$lambda$73 == null ? TourBetSelectionDialogContent$lambda$73.getResultRaw() : null;
                            TourBetSelectionDialogContent$lambda$72 = TourBetSelectionDialogContent$lambda$7(collectAsState8);
                            if (TourBetSelectionDialogContent$lambda$72 == null) {
                                val = TourBetSelectionDialogContent$lambda$72.getMatchState();
                            } else {
                                MatchTopBaseData TourBetSelectionDialogContent$lambda$82 = TourBetSelectionDialogContent$lambda$8(collectAsState);
                                if (TourBetSelectionDialogContent$lambda$82 == null || (matchStat = TourBetSelectionDialogContent$lambda$82.getMatchStat()) == null) {
                                    num2 = null;
                                    composer2 = startRestartGroup;
                                    MatchBetGroupsTabContentKt.MatchBetGroupsTabContent(null, TourBetSelectionDialogContent$lambda$1, TourBetSelectionDialogContent$lambda$2, TourBetSelectionDialogContent$lambda$3, function1, onBetClick, TourBetSelectionDialogContent$lambda$4, TourBetSelectionDialogContent$lambda$5, linkedHashMap, TourBetSelectionDialogContent$lambda$6, function2, function3, oddType, function0, false, false, false, null, null, null, num, resultRaw, num2, false, false, 0L, null, null, false, null, null, null, composer2, (i5 << 12) & 458752, 0, 0, 0, 2140127233, 1);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    tourState4 = tourState3;
                                    modifier3 = modifier5;
                                } else {
                                    val = matchStat.getVal();
                                }
                            }
                            num2 = Integer.valueOf(val);
                            composer2 = startRestartGroup;
                            MatchBetGroupsTabContentKt.MatchBetGroupsTabContent(null, TourBetSelectionDialogContent$lambda$1, TourBetSelectionDialogContent$lambda$2, TourBetSelectionDialogContent$lambda$3, function1, onBetClick, TourBetSelectionDialogContent$lambda$4, TourBetSelectionDialogContent$lambda$5, linkedHashMap, TourBetSelectionDialogContent$lambda$6, function2, function3, oddType, function0, false, false, false, null, null, null, num, resultRaw, num2, false, false, 0L, null, null, false, null, null, null, composer2, (i5 << 12) & 458752, 0, 0, 0, 2140127233, 1);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            tourState4 = tourState3;
                            modifier3 = modifier5;
                        }
                    } else {
                        sportId = sport.getId();
                    }
                    num = Integer.valueOf(sportId);
                    MatchShortInfoModel TourBetSelectionDialogContent$lambda$732 = TourBetSelectionDialogContent$lambda$7(collectAsState8);
                    if (TourBetSelectionDialogContent$lambda$732 == null) {
                    }
                    TourBetSelectionDialogContent$lambda$72 = TourBetSelectionDialogContent$lambda$7(collectAsState8);
                    if (TourBetSelectionDialogContent$lambda$72 == null) {
                    }
                    num2 = Integer.valueOf(val);
                    composer2 = startRestartGroup;
                    MatchBetGroupsTabContentKt.MatchBetGroupsTabContent(null, TourBetSelectionDialogContent$lambda$1, TourBetSelectionDialogContent$lambda$2, TourBetSelectionDialogContent$lambda$3, function1, onBetClick, TourBetSelectionDialogContent$lambda$4, TourBetSelectionDialogContent$lambda$5, linkedHashMap, TourBetSelectionDialogContent$lambda$6, function2, function3, oddType, function0, false, false, false, null, null, null, num, resultRaw, num2, false, false, 0L, null, null, false, null, null, null, composer2, (i5 << 12) & 458752, 0, 0, 0, 2140127233, 1);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    tourState4 = tourState3;
                    modifier3 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    tourState4 = tourState2;
                    modifier3 = modifier2;
                    composer2 = startRestartGroup;
                }
                ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit TourBetSelectionDialogContent$lambda$28;
                            TourBetSelectionDialogContent$lambda$28 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$28(MatchDetailsController.this, onBetClick, onDismiss, tourState4, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return TourBetSelectionDialogContent$lambda$28;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            i5 = i3;
            if ((i5 & 9363) == 9362) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume4 = startRestartGroup.consume(localDensity2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density2 = (Density) consume4;
            ProvidableCompositionLocal<Configuration> localConfiguration3 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localConfiguration3);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Dp.m7774constructorimpl(((Configuration) consume22).screenWidthDp);
            ProvidableCompositionLocal<Configuration> localConfiguration22 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume32 = startRestartGroup.consume(localConfiguration22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Dp.m7774constructorimpl(((Configuration) consume32).screenHeightDp);
            if (tourState3 != null) {
            }
            if ((tourState3 != null ? tourState3.getBaseMatchItemBounds() : null) != null) {
            }
            float f4 = m7774constructorimpl;
            State collectAsState22 = SnapshotStateKt.collectAsState(controller.getSubMatches(), null, startRestartGroup, 0, 1);
            State collectAsState32 = SnapshotStateKt.collectAsState(controller.getSelectedBetGroupTabIndex(), null, startRestartGroup, 0, 1);
            State collectAsState42 = SnapshotStateKt.collectAsState(controller.getBetGroups(), null, startRestartGroup, 0, 1);
            State collectAsState52 = SnapshotStateKt.collectAsState(controller.getSelectedBetIds(), null, startRestartGroup, 0, 1);
            State collectAsState62 = SnapshotStateKt.collectAsState(controller.getValidatingBetIds(), null, startRestartGroup, 0, 1);
            State collectAsState72 = SnapshotStateKt.collectAsState(controller.getExpandedStatesPerTab(), null, startRestartGroup, 0, 1);
            State collectAsState82 = SnapshotStateKt.collectAsState(controller.getCurrentMatch(), null, startRestartGroup, 0, 1);
            collectAsState = SnapshotStateKt.collectAsState(controller.getBaseMatchInfo(), null, startRestartGroup, 0, 1);
            Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            Modifier modifier52 = modifier4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap9 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier9 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
            Function0<ComposeUiNode> constructor9 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap9, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash9);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier9, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Alignment.INSTANCE.getBottomStart()), 0.0f, f4, 0.0f, Dp.m7774constructorimpl(60), 5, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl3.getInserting()) {
            }
            m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl3, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
            Function0<ComposeUiNode> constructor42 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap42, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash42 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl4.getInserting()) {
            }
            m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash42);
            Updater.m4617setimpl(m4610constructorimpl4, materializeModifier42, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
            Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6);
            ContentScale fit2 = ContentScale.INSTANCE.getFit();
            Modifier align2 = boxScopeInstance22.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd());
            float f22 = 16;
            Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(align2, Dp.m7774constructorimpl(f22)), Dp.m7774constructorimpl(36));
            startRestartGroup.startReplaceGroup(5004770);
            if ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9;
                    TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9(Function0.this);
                    return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            ImageKt.Image(painterResource2, stringResource2, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs2, false, null, null, (Function0) rememberedValue, 7, null), (Alignment) null, fit2, 0.0f, (ColorFilter) null, startRestartGroup, 24576, 104);
            float f32 = 8;
            Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(f32));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap52 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
            Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl5.getInserting()) {
            }
            m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash52);
            Updater.m4617setimpl(m4610constructorimpl5, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
            Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5205getWhite0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(24))), Dp.m7774constructorimpl(f22));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy42 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap62 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier62 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs2);
            Function0<ComposeUiNode> constructor62 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap62, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash62 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl6.getInserting()) {
            }
            m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash62);
            Updater.m4617setimpl(m4610constructorimpl6, materializeModifier62, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy32 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap72 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier72 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
            Function0<ComposeUiNode> constructor72 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl7, columnMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap72, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash72 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl7.getInserting()) {
            }
            m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash72);
            Updater.m4617setimpl(m4610constructorimpl7, materializeModifier72, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance32 = ColumnScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_select_bet_title, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5194getBlack0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200112, 0, 130512);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_select_bet_subtitle, startRestartGroup, 6), PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f32), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5198getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, X2.b.f, 0, 130544);
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
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), null, 2, null), 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(12), 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy52 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap82 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier82 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor82 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl8 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl8, maybeCachedBoxMeasurePolicy52, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap82, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash82 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl8.getInserting()) {
            }
            m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
            m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash82);
            Updater.m4617setimpl(m4610constructorimpl8, materializeModifier82, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance42 = BoxScopeInstance.INSTANCE;
            List<BetGroupsTabs> TourBetSelectionDialogContent$lambda$12 = TourBetSelectionDialogContent$lambda$1(collectAsState22);
            int TourBetSelectionDialogContent$lambda$22 = TourBetSelectionDialogContent$lambda$2(collectAsState32);
            List<MatchVarietyGroupBetsModel> TourBetSelectionDialogContent$lambda$33 = TourBetSelectionDialogContent$lambda$3(collectAsState42);
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance = startRestartGroup.changedInstance(controller);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new Function1() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15;
                    TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15(MatchDetailsController.this, ((Integer) obj).intValue());
                    return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            Function1 function12 = (Function1) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            Set<Long> TourBetSelectionDialogContent$lambda$42 = TourBetSelectionDialogContent$lambda$4(collectAsState52);
            Set<Long> TourBetSelectionDialogContent$lambda$52 = TourBetSelectionDialogContent$lambda$5(collectAsState62);
            map = TourBetSelectionDialogContent$lambda$6(collectAsState72).get(Integer.valueOf(TourBetSelectionDialogContent$lambda$2(collectAsState32)));
            if (map == null) {
            }
            Map<Integer, Map<Long, Boolean>> TourBetSelectionDialogContent$lambda$62 = TourBetSelectionDialogContent$lambda$6(collectAsState72);
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance2 = startRestartGroup.changedInstance(controller);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue3 = new Function2() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18;
                    TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18(MatchDetailsController.this, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            Function2 function22 = (Function2) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance3 = startRestartGroup.changedInstance(controller);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue4 = new Function3() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20;
                    TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20(MatchDetailsController.this, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), (List) obj3);
                    return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            Function3 function32 = (Function3) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            OddType oddType2 = controller.getOddType();
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance4 = startRestartGroup.changedInstance(controller);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue5 = new Function0() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    List currentBets;
                    currentBets = MatchDetailsController.this.getCurrentBets();
                    return currentBets;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            Function0 function02 = (Function0) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            TourBetSelectionDialogContent$lambda$7 = TourBetSelectionDialogContent$lambda$7(collectAsState82);
            if (TourBetSelectionDialogContent$lambda$7 != null) {
            }
            TourBetSelectionDialogContent$lambda$8 = TourBetSelectionDialogContent$lambda$8(collectAsState);
            if (TourBetSelectionDialogContent$lambda$8 != null) {
            }
        }
        tourState2 = tourState;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((i5 & 9363) == 9362) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume42 = startRestartGroup.consume(localDensity22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Density density22 = (Density) consume42;
        ProvidableCompositionLocal<Configuration> localConfiguration32 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localConfiguration32);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Dp.m7774constructorimpl(((Configuration) consume222).screenWidthDp);
        ProvidableCompositionLocal<Configuration> localConfiguration222 = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume322 = startRestartGroup.consume(localConfiguration222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Dp.m7774constructorimpl(((Configuration) consume322).screenHeightDp);
        if (tourState3 != null) {
        }
        if ((tourState3 != null ? tourState3.getBaseMatchItemBounds() : null) != null) {
        }
        float f42 = m7774constructorimpl;
        State collectAsState222 = SnapshotStateKt.collectAsState(controller.getSubMatches(), null, startRestartGroup, 0, 1);
        State collectAsState322 = SnapshotStateKt.collectAsState(controller.getSelectedBetGroupTabIndex(), null, startRestartGroup, 0, 1);
        State collectAsState422 = SnapshotStateKt.collectAsState(controller.getBetGroups(), null, startRestartGroup, 0, 1);
        State collectAsState522 = SnapshotStateKt.collectAsState(controller.getSelectedBetIds(), null, startRestartGroup, 0, 1);
        State collectAsState622 = SnapshotStateKt.collectAsState(controller.getValidatingBetIds(), null, startRestartGroup, 0, 1);
        State collectAsState722 = SnapshotStateKt.collectAsState(controller.getExpandedStatesPerTab(), null, startRestartGroup, 0, 1);
        State collectAsState822 = SnapshotStateKt.collectAsState(controller.getCurrentMatch(), null, startRestartGroup, 0, 1);
        collectAsState = SnapshotStateKt.collectAsState(controller.getBaseMatchInfo(), null, startRestartGroup, 0, 1);
        Modifier fillMaxSize$default32 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy62 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        Modifier modifier522 = modifier4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap92 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier92 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32);
        Function0<ComposeUiNode> constructor92 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy62, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap92, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash92 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash92);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier92, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5194getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), Alignment.INSTANCE.getBottomStart()), 0.0f, f42, 0.0f, Dp.m7774constructorimpl(60), 5, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1520paddingqDBjuR0$default22);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance52 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy42 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default222);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl3 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl3, columnMeasurePolicy42, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl3, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl3.getInserting()) {
        }
        m4610constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
        m4610constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl3, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance42 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap422 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier422 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
        Function0<ComposeUiNode> constructor422 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl4 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl4, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl4, currentCompositionLocalMap422, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash422 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl4.getInserting()) {
        }
        m4610constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
        m4610constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash422);
        Updater.m4617setimpl(m4610constructorimpl4, materializeModifier422, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
        Painter painterResource22 = PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6);
        String stringResource22 = StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6);
        ContentScale fit22 = ContentScale.INSTANCE.getFit();
        Modifier align22 = boxScopeInstance222.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd());
        float f222 = 16;
        Modifier m1563size3ABfNKs22 = SizeKt.m1563size3ABfNKs(PaddingKt.m1516padding3ABfNKs(align22, Dp.m7774constructorimpl(f222)), Dp.m7774constructorimpl(36));
        startRestartGroup.startReplaceGroup(5004770);
        if ((i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9;
                TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9(Function0.this);
                return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        ImageKt.Image(painterResource22, stringResource22, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs22, false, null, null, (Function0) rememberedValue, 7, null), (Alignment) null, fit22, 0.0f, (ColorFilter) null, startRestartGroup, 24576, 104);
        float f322 = 8;
        Modifier m1517paddingVpY3zN422 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f222), Dp.m7774constructorimpl(f322));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap522 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier522 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN422);
        Function0<ComposeUiNode> constructor522 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl5 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl5, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl5, currentCompositionLocalMap522, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash522 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl5.getInserting()) {
        }
        m4610constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
        m4610constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash522);
        Updater.m4617setimpl(m4610constructorimpl5, materializeModifier522, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        Modifier m1516padding3ABfNKs22 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5205getWhite0d7_KjU(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(24))), Dp.m7774constructorimpl(f222));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy422 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap622 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier622 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs22);
        Function0<ComposeUiNode> constructor622 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl6 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl6, maybeCachedBoxMeasurePolicy422, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl6, currentCompositionLocalMap622, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash622 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl6.getInserting()) {
        }
        m4610constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
        m4610constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash622);
        Updater.m4617setimpl(m4610constructorimpl6, materializeModifier622, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        Modifier.Companion companion22 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy322 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap722 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier722 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
        Function0<ComposeUiNode> constructor722 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl7 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl7, columnMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl7, currentCompositionLocalMap722, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash722 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl7.getInserting()) {
        }
        m4610constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
        m4610constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash722);
        Updater.m4617setimpl(m4610constructorimpl7, materializeModifier722, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance322 = ColumnScopeInstance.INSTANCE;
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_select_bet_title, startRestartGroup, 6), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5194getBlack0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200112, 0, 130512);
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.tour_select_bet_subtitle, startRestartGroup, 6), PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(f322), 0.0f, 0.0f, 13, null), Color.INSTANCE.m5198getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, X2.b.f, 0, 130544);
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
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(SizeKt.fillMaxSize$default(BackgroundKt.m1025backgroundbw27NRU$default(Modifier.INSTANCE, ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), null, 2, null), 0.0f, 1, null), 0.0f, Dp.m7774constructorimpl(12), 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy522 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap822 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier822 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22);
        Function0<ComposeUiNode> constructor822 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl8 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl8, maybeCachedBoxMeasurePolicy522, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl8, currentCompositionLocalMap822, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash822 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl8.getInserting()) {
        }
        m4610constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
        m4610constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash822);
        Updater.m4617setimpl(m4610constructorimpl8, materializeModifier822, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance422 = BoxScopeInstance.INSTANCE;
        List<BetGroupsTabs> TourBetSelectionDialogContent$lambda$122 = TourBetSelectionDialogContent$lambda$1(collectAsState222);
        int TourBetSelectionDialogContent$lambda$222 = TourBetSelectionDialogContent$lambda$2(collectAsState322);
        List<MatchVarietyGroupBetsModel> TourBetSelectionDialogContent$lambda$332 = TourBetSelectionDialogContent$lambda$3(collectAsState422);
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(controller);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new Function1() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15;
                TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15(MatchDetailsController.this, ((Integer) obj).intValue());
                return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        Function1 function122 = (Function1) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        Set<Long> TourBetSelectionDialogContent$lambda$422 = TourBetSelectionDialogContent$lambda$4(collectAsState522);
        Set<Long> TourBetSelectionDialogContent$lambda$522 = TourBetSelectionDialogContent$lambda$5(collectAsState622);
        map = TourBetSelectionDialogContent$lambda$6(collectAsState722).get(Integer.valueOf(TourBetSelectionDialogContent$lambda$2(collectAsState322)));
        if (map == null) {
        }
        Map<Integer, Map<Long, Boolean>> TourBetSelectionDialogContent$lambda$622 = TourBetSelectionDialogContent$lambda$6(collectAsState722);
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance2 = startRestartGroup.changedInstance(controller);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue3 = new Function2() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18;
                TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18(MatchDetailsController.this, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        Function2 function222 = (Function2) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance3 = startRestartGroup.changedInstance(controller);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue4 = new Function3() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20;
                TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20 = TourBetSelectionDialogKt.TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20(MatchDetailsController.this, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue(), (List) obj3);
                return TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        Function3 function322 = (Function3) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        OddType oddType22 = controller.getOddType();
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance4 = startRestartGroup.changedInstance(controller);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changedInstance4) {
        }
        rememberedValue5 = new Function0() { // from class: org.betup.ui.tour.compose.TourBetSelectionDialogKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List currentBets;
                currentBets = MatchDetailsController.this.getCurrentBets();
                return currentBets;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue5);
        Function0 function022 = (Function0) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        TourBetSelectionDialogContent$lambda$7 = TourBetSelectionDialogContent$lambda$7(collectAsState822);
        if (TourBetSelectionDialogContent$lambda$7 != null) {
        }
        TourBetSelectionDialogContent$lambda$8 = TourBetSelectionDialogContent$lambda$8(collectAsState);
        if (TourBetSelectionDialogContent$lambda$8 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$14$lambda$10$lambda$9(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$16$lambda$15(MatchDetailsController matchDetailsController, int i) {
        matchDetailsController.onBetGroupTabSelected(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$19$lambda$18(MatchDetailsController matchDetailsController, int i, long j) {
        matchDetailsController.onExpandToggle(i, j);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TourBetSelectionDialogContent$lambda$27$lambda$26$lambda$25$lambda$24$lambda$21$lambda$20(MatchDetailsController matchDetailsController, int i, boolean z, List groupIds) {
        Intrinsics.checkNotNullParameter(groupIds, "groupIds");
        matchDetailsController.setAllExpanded(i, z, groupIds);
        return Unit.INSTANCE;
    }

    private static final List<BetGroupsTabs> TourBetSelectionDialogContent$lambda$1(State<? extends List<BetGroupsTabs>> state) {
        return state.getValue();
    }

    private static final int TourBetSelectionDialogContent$lambda$2(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final List<MatchVarietyGroupBetsModel> TourBetSelectionDialogContent$lambda$3(State<? extends List<MatchVarietyGroupBetsModel>> state) {
        return state.getValue();
    }

    private static final Set<Long> TourBetSelectionDialogContent$lambda$4(State<? extends Set<Long>> state) {
        return state.getValue();
    }

    private static final Set<Long> TourBetSelectionDialogContent$lambda$5(State<? extends Set<Long>> state) {
        return state.getValue();
    }

    private static final Map<Integer, Map<Long, Boolean>> TourBetSelectionDialogContent$lambda$6(State<? extends Map<Integer, ? extends Map<Long, Boolean>>> state) {
        return (Map) state.getValue();
    }

    private static final MatchShortInfoModel TourBetSelectionDialogContent$lambda$7(State<MatchShortInfoModel> state) {
        return state.getValue();
    }

    private static final MatchTopBaseData TourBetSelectionDialogContent$lambda$8(State<MatchTopBaseData> state) {
        return state.getValue();
    }
}
