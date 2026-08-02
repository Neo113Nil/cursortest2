package org.betup.ui.fragment.flashbet.compose;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.R;
import org.betup.games.flashbet.model.FlashBetGameSessionDto;
import org.betup.ui.common.compose.PagerStateNoSaveKt;
import org.betup.ui.common.compose.SwipeRefreshContainerKt;
import org.betup.ui.fragment.bets.BetsTabBarComposeKt;
import org.betup.ui.fragment.flashbet.FlashBetUiSoundEffect;
import org.betup.ui.fragment.flashbet.controller.FlashBetController;
import org.betup.ui.fragment.flashbet.controller.FlashBetSportsState;
import org.betup.ui.fragment.flashbet.controller.FlashBetStatsState;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: FlashBetContent.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u001aP\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032#\b\u0002\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\f\u001aA\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0016\u001aP\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132#\b\u0002\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"FlashBetContent", "", "controller", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetController;", "onStatsItemClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "sessionId", "onShowAbandonedSessionDialog", "Lorg/betup/games/flashbet/model/FlashBetGameSessionDto;", "(Lorg/betup/ui/fragment/flashbet/controller/FlashBetController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "FlashBetsListContent", "sportsState", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetSportsState;", "isRefreshing", "", "onRefresh", "Lkotlin/Function0;", "onSportClick", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetCategoryItem;", "(Lorg/betup/ui/fragment/flashbet/controller/FlashBetSportsState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "FlashBetStatsListContent", "statsState", "Lorg/betup/ui/fragment/flashbet/controller/FlashBetStatsState;", "(Lorg/betup/ui/fragment/flashbet/controller/FlashBetStatsState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release", "pendingAbandonedSession", "selectedTab", "", "isSportsRefreshing", "isStatsRefreshing"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetContent$lambda$24(FlashBetController flashBetController, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        FlashBetContent(flashBetController, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetStatsListContent$lambda$30(FlashBetStatsState flashBetStatsState, boolean z, Function0 function0, Function1 function1, int i, int i2, Composer composer, int i3) {
        FlashBetStatsListContent(flashBetStatsState, z, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetsListContent$lambda$27(FlashBetSportsState flashBetSportsState, boolean z, Function0 function0, Function1 function1, int i, int i2, Composer composer, int i3) {
        FlashBetsListContent(flashBetSportsState, z, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetContent$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetContent$lambda$3$lambda$2(FlashBetGameSessionDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetContent(final FlashBetController controller, Function1<? super String, Unit> function1, Function1<? super FlashBetGameSessionDto, Unit> function12, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function13;
        int i4;
        Function1<? super FlashBetGameSessionDto, Unit> function14;
        Function1<? super String, Unit> function15;
        Function1<? super FlashBetGameSessionDto, Unit> function16;
        boolean changedInstance;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        boolean changed2;
        Object rememberedValue3;
        Object rememberedValue4;
        boolean changedInstance2;
        Object rememberedValue5;
        boolean changedInstance3;
        Object rememberedValue6;
        boolean changed3;
        Object rememberedValue7;
        boolean changed4;
        Object rememberedValue8;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean changed5;
        Object rememberedValue9;
        Composer composer2;
        final Function1<? super String, Unit> function17;
        final Function1<? super FlashBetGameSessionDto, Unit> function18;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer startRestartGroup = composer.startRestartGroup(1190198510);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(controller) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function13 = function1;
            i3 |= startRestartGroup.changedInstance(function13) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                function14 = function12;
                i3 |= startRestartGroup.changedInstance(function14) ? 256 : 128;
                if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                    if (i5 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue10 = startRestartGroup.rememberedValue();
                        if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue10 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit FlashBetContent$lambda$1$lambda$0;
                                    FlashBetContent$lambda$1$lambda$0 = FlashBetContentKt.FlashBetContent$lambda$1$lambda$0((String) obj);
                                    return FlashBetContent$lambda$1$lambda$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue10);
                        }
                        startRestartGroup.endReplaceGroup();
                        function15 = (Function1) rememberedValue10;
                    } else {
                        function15 = function13;
                    }
                    if (i4 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue11 = startRestartGroup.rememberedValue();
                        if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue11 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit FlashBetContent$lambda$3$lambda$2;
                                    FlashBetContent$lambda$3$lambda$2 = FlashBetContentKt.FlashBetContent$lambda$3$lambda$2((FlashBetGameSessionDto) obj);
                                    return FlashBetContent$lambda$3$lambda$2;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue11);
                        }
                        startRestartGroup.endReplaceGroup();
                        function16 = (Function1) rememberedValue11;
                    } else {
                        function16 = function14;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1190198510, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetContent (FlashBetContent.kt:42)");
                    }
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context applicationContext = ((Context) consume).getApplicationContext();
                    startRestartGroup.startReplaceGroup(5004770);
                    changedInstance = startRestartGroup.changedInstance(applicationContext);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit FlashBetContent$lambda$5$lambda$4;
                                FlashBetContent$lambda$5$lambda$4 = FlashBetContentKt.FlashBetContent$lambda$5$lambda$4(applicationContext);
                                return FlashBetContent$lambda$5$lambda$4;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final Function0 function0 = (Function0) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    State collectAsState = SnapshotStateKt.collectAsState(controller.getPendingSessionForAbandonedDialog(), null, startRestartGroup, 0, 1);
                    FlashBetGameSessionDto FlashBetContent$lambda$6 = FlashBetContent$lambda$6(collectAsState);
                    startRestartGroup.startReplaceGroup(-1746271574);
                    changed = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changed(collectAsState) | startRestartGroup.changedInstance(controller);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (Function2) new FlashBetContentKt$FlashBetContent$3$1(collectAsState, function16, controller, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(FlashBetContent$lambda$6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
                    final List listOf = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(R.string.flash_bets_tab, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.flash_bet_my_stats, startRestartGroup, 6)});
                    startRestartGroup.startReplaceGroup(5004770);
                    changed2 = startRestartGroup.changed(listOf);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int size;
                                size = listOf.size();
                                return Integer.valueOf(size);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    PagerState rememberPagerStateWithoutSavedState = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(0, 0.0f, (Function0) rememberedValue3, startRestartGroup, 6, 2);
                    startRestartGroup.startReplaceGroup(1849434622);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    final MutableState mutableState = (MutableState) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    State collectAsState2 = SnapshotStateKt.collectAsState(controller.getSportsState(), null, startRestartGroup, 0, 1);
                    State collectAsState3 = SnapshotStateKt.collectAsState(controller.getStatsState(), null, startRestartGroup, 0, 1);
                    State collectAsState4 = SnapshotStateKt.collectAsState(controller.isSportsRefreshing(), null, startRestartGroup, 0, 1);
                    State collectAsState5 = SnapshotStateKt.collectAsState(controller.isStatsRefreshing(), null, startRestartGroup, 0, 1);
                    Unit unit = Unit.INSTANCE;
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance2 = startRestartGroup.changedInstance(applicationContext) | startRestartGroup.changedInstance(controller);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = (Function2) new FlashBetContentKt$FlashBetContent$4$1(applicationContext, controller, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 6);
                    Integer valueOf = Integer.valueOf(FlashBetContent$lambda$11(mutableState));
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changedInstance3 = startRestartGroup.changedInstance(controller);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = (Function2) new FlashBetContentKt$FlashBetContent$5$1(controller, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
                    Integer valueOf2 = Integer.valueOf(rememberPagerStateWithoutSavedState.getCurrentPage());
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed3 = startRestartGroup.changed(rememberPagerStateWithoutSavedState);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changed3 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = (Function2) new FlashBetContentKt$FlashBetContent$6$1(rememberPagerStateWithoutSavedState, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, 0);
                    Integer valueOf3 = Integer.valueOf(FlashBetContent$lambda$11(mutableState));
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed4 = startRestartGroup.changed(rememberPagerStateWithoutSavedState);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changed4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = (Function2) new FlashBetContentKt$FlashBetContent$7$1(rememberPagerStateWithoutSavedState, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, startRestartGroup, 0);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    float f = 16;
                    Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(f), 0.0f, 8, null);
                    int FlashBetContent$lambda$11 = FlashBetContent$lambda$11(mutableState);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed5 = startRestartGroup.changed(function0);
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (!changed5 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit FlashBetContent$lambda$23$lambda$22$lambda$21;
                                FlashBetContent$lambda$23$lambda$22$lambda$21 = FlashBetContentKt.FlashBetContent$lambda$23$lambda$22$lambda$21(Function0.this, mutableState, ((Integer) obj).intValue());
                                return FlashBetContent$lambda$23$lambda$22$lambda$21;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    startRestartGroup.endReplaceGroup();
                    Function1<? super FlashBetGameSessionDto, Unit> function19 = function16;
                    BetsTabBarComposeKt.BetsTabBarCompose(m1520paddingqDBjuR0$default, FlashBetContent$lambda$11, (Function1) rememberedValue9, listOf, false, startRestartGroup, 0, 16);
                    composer2 = startRestartGroup;
                    PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-443942569, true, new FlashBetContentKt$FlashBetContent$8$2(controller, function0, function15, collectAsState2, collectAsState4, collectAsState3, collectAsState5), startRestartGroup, 54), composer2, 48, 24576, 16380);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function17 = function15;
                    function18 = function19;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function17 = function13;
                    function18 = function14;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FlashBetContent$lambda$24;
                            FlashBetContent$lambda$24 = FlashBetContentKt.FlashBetContent$lambda$24(FlashBetController.this, function17, function18, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return FlashBetContent$lambda$24;
                        }
                    });
                    return;
                }
                return;
            }
            function14 = function12;
            if ((i3 & Opcodes.I2S) == 146) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context applicationContext2 = ((Context) consume2).getApplicationContext();
            startRestartGroup.startReplaceGroup(5004770);
            changedInstance = startRestartGroup.changedInstance(applicationContext2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit FlashBetContent$lambda$5$lambda$4;
                    FlashBetContent$lambda$5$lambda$4 = FlashBetContentKt.FlashBetContent$lambda$5$lambda$4(applicationContext2);
                    return FlashBetContent$lambda$5$lambda$4;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            final Function0 function02 = (Function0) rememberedValue;
            startRestartGroup.endReplaceGroup();
            State collectAsState6 = SnapshotStateKt.collectAsState(controller.getPendingSessionForAbandonedDialog(), null, startRestartGroup, 0, 1);
            FlashBetGameSessionDto FlashBetContent$lambda$62 = FlashBetContent$lambda$6(collectAsState6);
            startRestartGroup.startReplaceGroup(-1746271574);
            changed = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changed(collectAsState6) | startRestartGroup.changedInstance(controller);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue2 = (Function2) new FlashBetContentKt$FlashBetContent$3$1(collectAsState6, function16, controller, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(FlashBetContent$lambda$62, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
            final List listOf2 = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(R.string.flash_bets_tab, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.flash_bet_my_stats, startRestartGroup, 6)});
            startRestartGroup.startReplaceGroup(5004770);
            changed2 = startRestartGroup.changed(listOf2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int size;
                    size = listOf2.size();
                    return Integer.valueOf(size);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            PagerState rememberPagerStateWithoutSavedState2 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(0, 0.0f, (Function0) rememberedValue3, startRestartGroup, 6, 2);
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            }
            final MutableState mutableState2 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            State collectAsState22 = SnapshotStateKt.collectAsState(controller.getSportsState(), null, startRestartGroup, 0, 1);
            State collectAsState32 = SnapshotStateKt.collectAsState(controller.getStatsState(), null, startRestartGroup, 0, 1);
            State collectAsState42 = SnapshotStateKt.collectAsState(controller.isSportsRefreshing(), null, startRestartGroup, 0, 1);
            State collectAsState52 = SnapshotStateKt.collectAsState(controller.isStatsRefreshing(), null, startRestartGroup, 0, 1);
            Unit unit2 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance2 = startRestartGroup.changedInstance(applicationContext2) | startRestartGroup.changedInstance(controller);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue5 = (Function2) new FlashBetContentKt$FlashBetContent$4$1(applicationContext2, controller, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 6);
            Integer valueOf4 = Integer.valueOf(FlashBetContent$lambda$11(mutableState2));
            startRestartGroup.startReplaceGroup(-1633490746);
            changedInstance3 = startRestartGroup.changedInstance(controller);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue6 = (Function2) new FlashBetContentKt$FlashBetContent$5$1(controller, mutableState2, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
            Integer valueOf22 = Integer.valueOf(rememberPagerStateWithoutSavedState2.getCurrentPage());
            startRestartGroup.startReplaceGroup(-1633490746);
            changed3 = startRestartGroup.changed(rememberPagerStateWithoutSavedState2);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue7 = (Function2) new FlashBetContentKt$FlashBetContent$6$1(rememberPagerStateWithoutSavedState2, mutableState2, null);
            startRestartGroup.updateRememberedValue(rememberedValue7);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, 0);
            Integer valueOf32 = Integer.valueOf(FlashBetContent$lambda$11(mutableState2));
            startRestartGroup.startReplaceGroup(-1633490746);
            changed4 = startRestartGroup.changed(rememberPagerStateWithoutSavedState2);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            rememberedValue8 = (Function2) new FlashBetContentKt$FlashBetContent$7$1(rememberPagerStateWithoutSavedState2, mutableState2, null);
            startRestartGroup.updateRememberedValue(rememberedValue8);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, startRestartGroup, 0);
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            float f2 = 16;
            Modifier m1520paddingqDBjuR0$default2 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(f2), 0.0f, 8, null);
            int FlashBetContent$lambda$112 = FlashBetContent$lambda$11(mutableState2);
            startRestartGroup.startReplaceGroup(-1633490746);
            changed5 = startRestartGroup.changed(function02);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (!changed5) {
            }
            rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit FlashBetContent$lambda$23$lambda$22$lambda$21;
                    FlashBetContent$lambda$23$lambda$22$lambda$21 = FlashBetContentKt.FlashBetContent$lambda$23$lambda$22$lambda$21(Function0.this, mutableState2, ((Integer) obj).intValue());
                    return FlashBetContent$lambda$23$lambda$22$lambda$21;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue9);
            startRestartGroup.endReplaceGroup();
            Function1<? super FlashBetGameSessionDto, Unit> function192 = function16;
            BetsTabBarComposeKt.BetsTabBarCompose(m1520paddingqDBjuR0$default2, FlashBetContent$lambda$112, (Function1) rememberedValue9, listOf2, false, startRestartGroup, 0, 16);
            composer2 = startRestartGroup;
            PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState2, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-443942569, true, new FlashBetContentKt$FlashBetContent$8$2(controller, function02, function15, collectAsState22, collectAsState42, collectAsState32, collectAsState52), startRestartGroup, 54), composer2, 48, 24576, 16380);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            function17 = function15;
            function18 = function192;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function13 = function1;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function14 = function12;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localContext22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context applicationContext22 = ((Context) consume22).getApplicationContext();
        startRestartGroup.startReplaceGroup(5004770);
        changedInstance = startRestartGroup.changedInstance(applicationContext22);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit FlashBetContent$lambda$5$lambda$4;
                FlashBetContent$lambda$5$lambda$4 = FlashBetContentKt.FlashBetContent$lambda$5$lambda$4(applicationContext22);
                return FlashBetContent$lambda$5$lambda$4;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        final Function0 function022 = (Function0) rememberedValue;
        startRestartGroup.endReplaceGroup();
        State collectAsState62 = SnapshotStateKt.collectAsState(controller.getPendingSessionForAbandonedDialog(), null, startRestartGroup, 0, 1);
        FlashBetGameSessionDto FlashBetContent$lambda$622 = FlashBetContent$lambda$6(collectAsState62);
        startRestartGroup.startReplaceGroup(-1746271574);
        changed = ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) | startRestartGroup.changed(collectAsState62) | startRestartGroup.changedInstance(controller);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue2 = (Function2) new FlashBetContentKt$FlashBetContent$3$1(collectAsState62, function16, controller, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(FlashBetContent$lambda$622, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 0);
        final List listOf22 = CollectionsKt.listOf((Object[]) new String[]{StringResources_androidKt.stringResource(R.string.flash_bets_tab, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.flash_bet_my_stats, startRestartGroup, 6)});
        startRestartGroup.startReplaceGroup(5004770);
        changed2 = startRestartGroup.changed(listOf22);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int size;
                size = listOf22.size();
                return Integer.valueOf(size);
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        PagerState rememberPagerStateWithoutSavedState22 = PagerStateNoSaveKt.rememberPagerStateWithoutSavedState(0, 0.0f, (Function0) rememberedValue3, startRestartGroup, 6, 2);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        final MutableState mutableState22 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        State collectAsState222 = SnapshotStateKt.collectAsState(controller.getSportsState(), null, startRestartGroup, 0, 1);
        State collectAsState322 = SnapshotStateKt.collectAsState(controller.getStatsState(), null, startRestartGroup, 0, 1);
        State collectAsState422 = SnapshotStateKt.collectAsState(controller.isSportsRefreshing(), null, startRestartGroup, 0, 1);
        State collectAsState522 = SnapshotStateKt.collectAsState(controller.isStatsRefreshing(), null, startRestartGroup, 0, 1);
        Unit unit22 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance2 = startRestartGroup.changedInstance(applicationContext22) | startRestartGroup.changedInstance(controller);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue5 = (Function2) new FlashBetContentKt$FlashBetContent$4$1(applicationContext22, controller, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, 6);
        Integer valueOf42 = Integer.valueOf(FlashBetContent$lambda$11(mutableState22));
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance3 = startRestartGroup.changedInstance(controller);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changedInstance3) {
        }
        rememberedValue6 = (Function2) new FlashBetContentKt$FlashBetContent$5$1(controller, mutableState22, null);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf42, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 0);
        Integer valueOf222 = Integer.valueOf(rememberPagerStateWithoutSavedState22.getCurrentPage());
        startRestartGroup.startReplaceGroup(-1633490746);
        changed3 = startRestartGroup.changed(rememberPagerStateWithoutSavedState22);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        rememberedValue7 = (Function2) new FlashBetContentKt$FlashBetContent$6$1(rememberPagerStateWithoutSavedState22, mutableState22, null);
        startRestartGroup.updateRememberedValue(rememberedValue7);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf222, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7, startRestartGroup, 0);
        Integer valueOf322 = Integer.valueOf(FlashBetContent$lambda$11(mutableState22));
        startRestartGroup.startReplaceGroup(-1633490746);
        changed4 = startRestartGroup.changed(rememberPagerStateWithoutSavedState22);
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!changed4) {
        }
        rememberedValue8 = (Function2) new FlashBetContentKt$FlashBetContent$7$1(rememberPagerStateWithoutSavedState22, mutableState22, null);
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf322, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue8, startRestartGroup, 0);
        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        float f22 = 16;
        Modifier m1520paddingqDBjuR0$default22 = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f22), Dp.m7774constructorimpl(12), Dp.m7774constructorimpl(f22), 0.0f, 8, null);
        int FlashBetContent$lambda$1122 = FlashBetContent$lambda$11(mutableState22);
        startRestartGroup.startReplaceGroup(-1633490746);
        changed5 = startRestartGroup.changed(function022);
        rememberedValue9 = startRestartGroup.rememberedValue();
        if (!changed5) {
        }
        rememberedValue9 = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit FlashBetContent$lambda$23$lambda$22$lambda$21;
                FlashBetContent$lambda$23$lambda$22$lambda$21 = FlashBetContentKt.FlashBetContent$lambda$23$lambda$22$lambda$21(Function0.this, mutableState22, ((Integer) obj).intValue());
                return FlashBetContent$lambda$23$lambda$22$lambda$21;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue9);
        startRestartGroup.endReplaceGroup();
        Function1<? super FlashBetGameSessionDto, Unit> function1922 = function16;
        BetsTabBarComposeKt.BetsTabBarCompose(m1520paddingqDBjuR0$default22, FlashBetContent$lambda$1122, (Function1) rememberedValue9, listOf22, false, startRestartGroup, 0, 16);
        composer2 = startRestartGroup;
        PagerKt.m1761HorizontalPager8jOkeI(rememberPagerStateWithoutSavedState22, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-443942569, true, new FlashBetContentKt$FlashBetContent$8$2(controller, function022, function15, collectAsState222, collectAsState422, collectAsState322, collectAsState522), startRestartGroup, 54), composer2, 48, 24576, 16380);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        function17 = function15;
        function18 = function1922;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetContent$lambda$5$lambda$4(Context context) {
        FlashBetUiSoundEffect flashBetUiSoundEffect = FlashBetUiSoundEffect.INSTANCE;
        Intrinsics.checkNotNull(context);
        flashBetUiSoundEffect.playClick(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FlashBetContent$lambda$11(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FlashBetContent$lambda$12(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetContent$lambda$23$lambda$22$lambda$21(Function0 function0, MutableState mutableState, int i) {
        function0.invoke();
        FlashBetContent$lambda$12(mutableState, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetsListContent$lambda$26$lambda$25(FlashBetCategoryItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetsListContent(final FlashBetSportsState flashBetSportsState, final boolean z, final Function0<Unit> function0, Function1<? super FlashBetCategoryItem, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super FlashBetCategoryItem, Unit> function12;
        Function1<? super FlashBetCategoryItem, Unit> function13;
        final Function1<? super FlashBetCategoryItem, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-270540338);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(flashBetSportsState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                if (i4 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit FlashBetsListContent$lambda$26$lambda$25;
                                FlashBetsListContent$lambda$26$lambda$25 = FlashBetContentKt.FlashBetsListContent$lambda$26$lambda$25((FlashBetCategoryItem) obj);
                                return FlashBetsListContent$lambda$26$lambda$25;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    function13 = (Function1) rememberedValue;
                } else {
                    function13 = function12;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-270540338, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetsListContent (FlashBetContent.kt:143)");
                }
                boolean z2 = flashBetSportsState instanceof FlashBetSportsState.Loading;
                List<FlashBetCategoryItem> items = !(flashBetSportsState instanceof FlashBetSportsState.Success) ? ((FlashBetSportsState.Success) flashBetSportsState).getItems() : CollectionsKt.emptyList();
                boolean z3 = !z || (z2 && items.isEmpty());
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean z4 = !items.isEmpty();
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1225099462, true, new FlashBetContentKt$FlashBetsListContent$2(flashBetSportsState, items, z2, function13), startRestartGroup, 54);
                int i5 = (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 196614;
                function14 = function13;
                SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default, z3, function0, z4, null, rememberComposableLambda, startRestartGroup, i5, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                function14 = function12;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FlashBetsListContent$lambda$27;
                        FlashBetsListContent$lambda$27 = FlashBetContentKt.FlashBetsListContent$lambda$27(FlashBetSportsState.this, z, function0, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return FlashBetsListContent$lambda$27;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        boolean z22 = flashBetSportsState instanceof FlashBetSportsState.Loading;
        if (!(flashBetSportsState instanceof FlashBetSportsState.Success)) {
        }
        if (z) {
        }
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        boolean z42 = !items.isEmpty();
        ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1225099462, true, new FlashBetContentKt$FlashBetsListContent$2(flashBetSportsState, items, z22, function13), startRestartGroup, 54);
        int i52 = (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 196614;
        function14 = function13;
        SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default2, z3, function0, z42, null, rememberComposableLambda2, startRestartGroup, i52, 16);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetStatsListContent$lambda$29$lambda$28(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetStatsListContent(final FlashBetStatsState flashBetStatsState, final boolean z, final Function0<Unit> function0, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function12;
        Function1<? super String, Unit> function13;
        final Function1<? super String, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1598075166);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(flashBetStatsState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                if (i4 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit FlashBetStatsListContent$lambda$29$lambda$28;
                                FlashBetStatsListContent$lambda$29$lambda$28 = FlashBetContentKt.FlashBetStatsListContent$lambda$29$lambda$28((String) obj);
                                return FlashBetStatsListContent$lambda$29$lambda$28;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    function13 = (Function1) rememberedValue;
                } else {
                    function13 = function12;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1598075166, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetStatsListContent (FlashBetContent.kt:199)");
                }
                boolean z2 = flashBetStatsState instanceof FlashBetStatsState.Loading;
                List<FlashBetStatsItem> items = !(flashBetStatsState instanceof FlashBetStatsState.Success) ? ((FlashBetStatsState.Success) flashBetStatsState).getItems() : CollectionsKt.emptyList();
                boolean z3 = !z || (z2 && items.isEmpty());
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                boolean z4 = !items.isEmpty();
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2082339034, true, new FlashBetContentKt$FlashBetStatsListContent$2(flashBetStatsState, items, z2, function13), startRestartGroup, 54);
                int i5 = (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 196614;
                function14 = function13;
                SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default, z3, function0, z4, null, rememberComposableLambda, startRestartGroup, i5, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                function14 = function12;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FlashBetStatsListContent$lambda$30;
                        FlashBetStatsListContent$lambda$30 = FlashBetContentKt.FlashBetStatsListContent$lambda$30(FlashBetStatsState.this, z, function0, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return FlashBetStatsListContent$lambda$30;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        boolean z22 = flashBetStatsState instanceof FlashBetStatsState.Loading;
        if (!(flashBetStatsState instanceof FlashBetStatsState.Success)) {
        }
        if (z) {
        }
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        boolean z42 = !items.isEmpty();
        ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-2082339034, true, new FlashBetContentKt$FlashBetStatsListContent$2(flashBetStatsState, items, z22, function13), startRestartGroup, 54);
        int i52 = (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 196614;
        function14 = function13;
        SwipeRefreshContainerKt.SwipeRefreshContainerWithLoading(fillMaxSize$default2, z3, function0, z42, null, rememberComposableLambda2, startRestartGroup, i52, 16);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlashBetGameSessionDto FlashBetContent$lambda$6(State<FlashBetGameSessionDto> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlashBetSportsState FlashBetContent$lambda$13(State<? extends FlashBetSportsState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlashBetStatsState FlashBetContent$lambda$14(State<? extends FlashBetStatsState> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetContent$lambda$15(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FlashBetContent$lambda$16(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
