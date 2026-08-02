package org.betup.ui.fragment.achievements.compose;

import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.applovin.sdk.AppLovinEventTypes;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.achievements.NewAchievementSummaryModel;
import org.betup.services.user.UserService;
import org.betup.ui.fragment.achievements.compose.components.AchievementItemComponentKt;
import org.betup.ui.fragment.achievements.compose.model.AchievementUiModel;
import org.betup.ui.fragment.achievements.controller.AchievementsController;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: AchievementsContent.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000f²\u0006\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u0084\u0002"}, d2 = {"AchievementsContent", "", "controller", "Lorg/betup/ui/fragment/achievements/controller/AchievementsController;", "userService", "Lorg/betup/services/user/UserService;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/achievements/controller/AchievementsController;Lorg/betup/services/user/UserService;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "handleAchievementAction", AppLovinEventTypes.USER_COMPLETED_ACHIEVEMENT, "Lorg/betup/ui/fragment/achievements/compose/model/AchievementUiModel;", "AchievementsContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "AchievementsContentEmptyPreview", "app_release", "achievements", "", "summary", "Lorg/betup/model/remote/entity/achievements/NewAchievementSummaryModel;", "achievement15", "isAchievementsLoading", "", "achievementsError", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AchievementsContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AchievementsContent$lambda$11(AchievementsController achievementsController, UserService userService, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AchievementsContent(achievementsController, userService, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AchievementsContentEmptyPreview$lambda$21(int i, Composer composer, int i2) {
        AchievementsContentEmptyPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AchievementsContentPreview$lambda$17(int i, Composer composer, int i2) {
        AchievementsContentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AchievementsContent(final AchievementsController controller, final UserService userService, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean changed;
        Object rememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Composer startRestartGroup = composer.startRestartGroup(-332489949);
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
            i3 |= startRestartGroup.changedInstance(userService) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-332489949, i3, -1, "org.betup.ui.fragment.achievements.compose.AchievementsContent (AchievementsContent.kt:49)");
                }
                final State collectAsState = SnapshotStateKt.collectAsState(controller.getAchievements(), null, startRestartGroup, 0, 1);
                final State collectAsState2 = SnapshotStateKt.collectAsState(controller.getSummary(), null, startRestartGroup, 0, 1);
                final State collectAsState3 = SnapshotStateKt.collectAsState(controller.getAchievement15(), null, startRestartGroup, 0, 1);
                final State collectAsState4 = SnapshotStateKt.collectAsState(controller.isAchievementsLoading(), null, startRestartGroup, 0, 1);
                final State collectAsState5 = SnapshotStateKt.collectAsState(controller.getAchievementsError(), null, startRestartGroup, 0, 1);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                if (!startRestartGroup.getInserting()) {
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
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                float f = 8;
                PaddingValues m1510PaddingValuesYgX7TsA = PaddingKt.m1510PaddingValuesYgX7TsA(Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f));
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
                startRestartGroup.startReplaceGroup(-1224400529);
                changed = startRestartGroup.changed(collectAsState4) | startRestartGroup.changed(collectAsState5) | startRestartGroup.changedInstance(userService) | startRestartGroup.changedInstance(controller) | startRestartGroup.changed(collectAsState2) | startRestartGroup.changed(collectAsState3) | startRestartGroup.changed(collectAsState);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    Function1 function1 = new Function1() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit AchievementsContent$lambda$10$lambda$9$lambda$8;
                            AchievementsContent$lambda$10$lambda$9$lambda$8 = AchievementsContentKt.AchievementsContent$lambda$10$lambda$9$lambda$8(State.this, collectAsState5, userService, controller, collectAsState2, collectAsState3, collectAsState, (LazyListScope) obj);
                            return AchievementsContent$lambda$10$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(function1);
                    rememberedValue = function1;
                }
                startRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                LazyDslKt.LazyColumn(fillMaxSize$default2, null, m1510PaddingValuesYgX7TsA, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer2, 24582, 490);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AchievementsContent$lambda$11;
                        AchievementsContent$lambda$11 = AchievementsContentKt.AchievementsContent$lambda$11(AchievementsController.this, userService, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return AchievementsContent$lambda$11;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        final State collectAsState6 = SnapshotStateKt.collectAsState(controller.getAchievements(), null, startRestartGroup, 0, 1);
        final State collectAsState22 = SnapshotStateKt.collectAsState(controller.getSummary(), null, startRestartGroup, 0, 1);
        final State collectAsState32 = SnapshotStateKt.collectAsState(controller.getAchievement15(), null, startRestartGroup, 0, 1);
        final State collectAsState42 = SnapshotStateKt.collectAsState(controller.isAchievementsLoading(), null, startRestartGroup, 0, 1);
        final State collectAsState52 = SnapshotStateKt.collectAsState(controller.getAchievementsError(), null, startRestartGroup, 0, 1);
        Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
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
        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        float f2 = 8;
        PaddingValues m1510PaddingValuesYgX7TsA2 = PaddingKt.m1510PaddingValuesYgX7TsA(Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f2));
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_42 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f2));
        startRestartGroup.startReplaceGroup(-1224400529);
        changed = startRestartGroup.changed(collectAsState42) | startRestartGroup.changed(collectAsState52) | startRestartGroup.changedInstance(userService) | startRestartGroup.changedInstance(controller) | startRestartGroup.changed(collectAsState22) | startRestartGroup.changed(collectAsState32) | startRestartGroup.changed(collectAsState6);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        Function1 function12 = new Function1() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AchievementsContent$lambda$10$lambda$9$lambda$8;
                AchievementsContent$lambda$10$lambda$9$lambda$8 = AchievementsContentKt.AchievementsContent$lambda$10$lambda$9$lambda$8(State.this, collectAsState52, userService, controller, collectAsState22, collectAsState32, collectAsState6, (LazyListScope) obj);
                return AchievementsContent$lambda$10$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(function12);
        rememberedValue = function12;
        startRestartGroup.endReplaceGroup();
        Modifier modifier52 = modifier4;
        composer2 = startRestartGroup;
        LazyDslKt.LazyColumn(fillMaxSize$default22, null, m1510PaddingValuesYgX7TsA2, false, m1397spacedBy0680j_42, null, null, false, null, (Function1) rememberedValue, composer2, 24582, 490);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AchievementsContent$lambda$10$lambda$9$lambda$8(State state, State state2, final UserService userService, final AchievementsController achievementsController, State state3, State state4, State state5, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (AchievementsContent$lambda$3(state)) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AchievementsContentKt.INSTANCE.getLambda$1386970585$app_release(), 3, null);
        } else if (AchievementsContent$lambda$4(state2) != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-373223422, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContent$1$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-373223422, i, -1, "org.betup.ui.fragment.achievements.compose.AchievementsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AchievementsContent.kt:85)");
                    }
                    CardKt.Card(PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16)), null, CardDefaults.INSTANCE.m2757cardColorsro_MJ88(Color.INSTANCE.m5203getTransparent0d7_KjU(), 0L, 0L, 0L, composer, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1496033548, true, new AnonymousClass1(UserService.this, achievementsController), composer, 54), composer, 196614, 26);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AchievementsContent.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContent$1$1$1$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
                    final /* synthetic */ AchievementsController $controller;
                    final /* synthetic */ UserService $userService;

                    AnonymousClass1(UserService userService, AchievementsController achievementsController) {
                        this.$userService = userService;
                        this.$controller = achievementsController;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                        invoke(columnScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(UserService userService, AchievementsController achievementsController) {
                        Integer id = userService.getShortProfile().getUserModel().getId();
                        Intrinsics.checkNotNull(id);
                        achievementsController.refreshAchievements(id.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1496033548, i, -1, "org.betup.ui.fragment.achievements.compose.AchievementsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AchievementsContent.kt:93)");
                        }
                        Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        final UserService userService = this.$userService;
                        final AchievementsController achievementsController = this.$controller;
                        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1516padding3ABfNKs);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer);
                        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.error, composer, 6), (Modifier) null, Color.INSTANCE.m5202getRed0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge(), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0, 65530);
                        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer, 6);
                        composer.startReplaceGroup(-1633490746);
                        boolean changedInstance = composer.changedInstance(userService) | composer.changedInstance(achievementsController);
                        Object rememberedValue = composer.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0168: CONSTRUCTOR (r4v8 'rememberedValue' java.lang.Object) = 
                                  (r15v0 'userService' org.betup.services.user.UserService A[DONT_INLINE])
                                  (r13v0 'achievementsController' org.betup.ui.fragment.achievements.controller.AchievementsController A[DONT_INLINE])
                                 A[MD:(org.betup.services.user.UserService, org.betup.ui.fragment.achievements.controller.AchievementsController):void (m)] (LINE:105) call: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContent$1$1$1$1$1$$ExternalSyntheticLambda0.<init>(org.betup.services.user.UserService, org.betup.ui.fragment.achievements.controller.AchievementsController):void type: CONSTRUCTOR in method: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContent$1$1$1$1.1.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void, file: classes4.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContent$1$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                Method dump skipped, instructions count: 447
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContent$1$1$1$1.AnonymousClass1.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
                        }
                    }
                }), 3, null);
            } else {
                NewAchievementSummaryModel AchievementsContent$lambda$1 = AchievementsContent$lambda$1(state3);
                if (AchievementsContent$lambda$1 != null) {
                    LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(658210659, true, new AchievementsContentKt$AchievementsContent$1$1$1$2$1(AchievementsContent$lambda$1, state4)), 3, null);
                }
                final List<AchievementUiModel> AchievementsContent$lambda$0 = AchievementsContent$lambda$0(state5);
                final AchievementsContentKt$AchievementsContent$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 achievementsContentKt$AchievementsContent$lambda$10$lambda$9$lambda$8$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContent$lambda$10$lambda$9$lambda$8$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(AchievementUiModel achievementUiModel) {
                        return null;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return invoke((AchievementUiModel) obj);
                    }
                };
                LazyColumn.items(AchievementsContent$lambda$0.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContent$lambda$10$lambda$9$lambda$8$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int i) {
                        return Function1.this.invoke(AchievementsContent$lambda$0.get(i));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContent$lambda$10$lambda$9$lambda$8$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                        int i3;
                        ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                        if ((i2 & 6) == 0) {
                            i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= composer.changed(i) ? 32 : 16;
                        }
                        if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                        }
                        AchievementUiModel achievementUiModel = (AchievementUiModel) AchievementsContent$lambda$0.get(i);
                        composer.startReplaceGroup(-305316059);
                        composer.startReplaceGroup(1849434622);
                        AchievementsContentKt$AchievementsContent$1$1$1$3$1$1 rememberedValue = composer.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function1<AchievementUiModel, Unit>() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContent$1$1$1$3$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(AchievementUiModel achievementUiModel2) {
                                    invoke2(achievementUiModel2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(AchievementUiModel clickedAchievement) {
                                    Intrinsics.checkNotNullParameter(clickedAchievement, "clickedAchievement");
                                    AchievementsContentKt.handleAchievementAction(clickedAchievement);
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        composer.endReplaceGroup();
                        AchievementItemComponentKt.AchievementItemComponent(achievementUiModel, (Function1) rememberedValue, null, composer, 48, 4);
                        composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleAchievementAction(AchievementUiModel achievementUiModel) {
            Log.d("AchievementsContent", "Achievement action clicked: " + achievementUiModel.getName());
        }

        private static final void AchievementsContentPreview(Composer composer, final int i) {
            Composer startRestartGroup = composer.startRestartGroup(985107718);
            if (i != 0 || !startRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(985107718, i, -1, "org.betup.ui.fragment.achievements.compose.AchievementsContentPreview (AchievementsContent.kt:182)");
                }
                final List listOf = CollectionsKt.listOf((Object[]) new AchievementUiModel[]{new AchievementUiModel(7, "Place 5 bets", "Make 5 successful bets", "", 500, 3, false), new AchievementUiModel(4, "Place 3 single bets", "Place 3 bets in one betlist", "", 300, 3, false), new AchievementUiModel(1, "First bet", "Place your first bet", "", 100, 1, true)});
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                float f = 8;
                PaddingValues m1510PaddingValuesYgX7TsA = PaddingKt.m1510PaddingValuesYgX7TsA(Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f));
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
                startRestartGroup.startReplaceGroup(5004770);
                boolean changed = startRestartGroup.changed(listOf);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit AchievementsContentPreview$lambda$16$lambda$15$lambda$14;
                            AchievementsContentPreview$lambda$16$lambda$15$lambda$14 = AchievementsContentKt.AchievementsContentPreview$lambda$16$lambda$15$lambda$14(listOf, (LazyListScope) obj);
                            return AchievementsContentPreview$lambda$16$lambda$15$lambda$14;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                LazyDslKt.LazyColumn(fillMaxSize$default2, null, m1510PaddingValuesYgX7TsA, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 24582, 490);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AchievementsContentPreview$lambda$17;
                        AchievementsContentPreview$lambda$17 = AchievementsContentKt.AchievementsContentPreview$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                        return AchievementsContentPreview$lambda$17;
                    }
                });
            }
        }

        private static final void AchievementsContentEmptyPreview(Composer composer, final int i) {
            Composer startRestartGroup = composer.startRestartGroup(709225221);
            if (i != 0 || !startRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(709225221, i, -1, "org.betup.ui.fragment.achievements.compose.AchievementsContentEmptyPreview (AchievementsContent.kt:235)");
                }
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
                Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                float f = 8;
                PaddingValues m1510PaddingValuesYgX7TsA = PaddingKt.m1510PaddingValuesYgX7TsA(Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(f));
                Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(f));
                startRestartGroup.startReplaceGroup(1849434622);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit AchievementsContentEmptyPreview$lambda$20$lambda$19$lambda$18;
                            AchievementsContentEmptyPreview$lambda$20$lambda$19$lambda$18 = AchievementsContentKt.AchievementsContentEmptyPreview$lambda$20$lambda$19$lambda$18((LazyListScope) obj);
                            return AchievementsContentEmptyPreview$lambda$20$lambda$19$lambda$18;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                LazyDslKt.LazyColumn(fillMaxSize$default2, null, m1510PaddingValuesYgX7TsA, false, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 805330950, 490);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AchievementsContentEmptyPreview$lambda$21;
                        AchievementsContentEmptyPreview$lambda$21 = AchievementsContentKt.AchievementsContentEmptyPreview$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                        return AchievementsContentEmptyPreview$lambda$21;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit AchievementsContentEmptyPreview$lambda$20$lambda$19$lambda$18(LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$AchievementsContentKt.INSTANCE.getLambda$1570939530$app_release(), 3, null);
            return Unit.INSTANCE;
        }

        private static final List<AchievementUiModel> AchievementsContent$lambda$0(State<? extends List<AchievementUiModel>> state) {
            return state.getValue();
        }

        private static final NewAchievementSummaryModel AchievementsContent$lambda$1(State<? extends NewAchievementSummaryModel> state) {
            return state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AchievementUiModel AchievementsContent$lambda$2(State<AchievementUiModel> state) {
            return state.getValue();
        }

        private static final boolean AchievementsContent$lambda$3(State<Boolean> state) {
            return state.getValue().booleanValue();
        }

        private static final String AchievementsContent$lambda$4(State<String> state) {
            return state.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit AchievementsContentPreview$lambda$16$lambda$15$lambda$14(final List list, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final AchievementsContentKt$AchievementsContentPreview$lambda$16$lambda$15$lambda$14$$inlined$items$default$1 achievementsContentKt$AchievementsContentPreview$lambda$16$lambda$15$lambda$14$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContentPreview$lambda$16$lambda$15$lambda$14$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(AchievementUiModel achievementUiModel) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AchievementUiModel) obj);
                }
            };
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContentPreview$lambda$16$lambda$15$lambda$14$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return Function1.this.invoke(list.get(i));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContentPreview$lambda$16$lambda$15$lambda$14$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                    int i3;
                    ComposerKt.sourceInformation(composer, "C178@8826L22:LazyDsl.kt#428nma");
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    AchievementUiModel achievementUiModel = (AchievementUiModel) list.get(i);
                    composer.startReplaceGroup(173049032);
                    composer.startReplaceGroup(1849434622);
                    AchievementsContentKt$AchievementsContentPreview$1$1$1$1$1$1 rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1<AchievementUiModel, Unit>() { // from class: org.betup.ui.fragment.achievements.compose.AchievementsContentKt$AchievementsContentPreview$1$1$1$1$1$1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(AchievementUiModel it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AchievementUiModel achievementUiModel2) {
                                invoke2(achievementUiModel2);
                                return Unit.INSTANCE;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    AchievementItemComponentKt.AchievementItemComponent(achievementUiModel, (Function1) rememberedValue, null, composer, 48, 4);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }
