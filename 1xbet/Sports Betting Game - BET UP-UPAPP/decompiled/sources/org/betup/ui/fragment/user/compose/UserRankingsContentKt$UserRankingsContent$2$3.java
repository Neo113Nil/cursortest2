package org.betup.ui.fragment.user.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.logging.type.LogSeverity;
import io.bidmachine.media3.extractor.WavUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import org.betup.R;
import org.betup.model.remote.entity.user.NewUserRankingItemModel;
import org.betup.ui.common.compose.CommonButtonKt;
import org.betup.ui.fragment.user.controller.UserRankingsController;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: UserRankingsContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class UserRankingsContentKt$UserRankingsContent$2$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ UserRankingsController $controller;
    final /* synthetic */ State<String> $error$delegate;
    final /* synthetic */ State<List<RankingTimeType>> $rankingTabs$delegate;
    final /* synthetic */ State<Integer> $selectedTab$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    UserRankingsContentKt$UserRankingsContent$2$3(State<? extends List<? extends RankingTimeType>> state, State<Integer> state2, State<String> state3, UserRankingsController userRankingsController) {
        this.$rankingTabs$delegate = state;
        this.$selectedTab$delegate = state2;
        this.$error$delegate = state3;
        this.$controller = userRankingsController;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(final RankingTimeType rankingTimeType, final NewUserRankingItemModel newUserRankingItemModel, final NewUserRankingItemModel newUserRankingItemModel2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1143902296, true, new UserRankingsContentKt$UserRankingsContent$2$3$1$1$1(rankingTimeType)), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-540227375, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserRankingsContentKt$UserRankingsContent$2$3$1$1$2
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
                    ComposerKt.traceEventStart(-540227375, i, -1, "org.betup.ui.fragment.user.compose.UserRankingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserRankingsContent.kt:167)");
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer, 6);
                NewUserRankingItemModel newUserRankingItemModel3 = NewUserRankingItemModel.this;
                if (newUserRankingItemModel3 != null) {
                    composer.startReplaceGroup(1849434622);
                    UserRankingsContentKt$UserRankingsContent$2$3$1$1$2$1$1 rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = UserRankingsContentKt$UserRankingsContent$2$3$1$1$2$1$1.INSTANCE;
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    UserRankingsContentKt.RankingListItem(newUserRankingItemModel3, (Function1) ((KFunction) rememberedValue), composer, 48);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-195664016, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserRankingsContentKt$UserRankingsContent$2$3$1$1$3
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
                    ComposerKt.traceEventStart(-195664016, i, -1, "org.betup.ui.fragment.user.compose.UserRankingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserRankingsContent.kt:179)");
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer, 6);
                NewUserRankingItemModel newUserRankingItemModel3 = NewUserRankingItemModel.this;
                if (newUserRankingItemModel3 != null) {
                    composer.startReplaceGroup(1849434622);
                    UserRankingsContentKt$UserRankingsContent$2$3$1$1$3$1$1 rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = UserRankingsContentKt$UserRankingsContent$2$3$1$1$3$1$1.INSTANCE;
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    UserRankingsContentKt.RankingListItem(newUserRankingItemModel3, (Function1) ((KFunction) rememberedValue), composer, 48);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.items$default(LazyColumn, rankingTimeType.getRemainingItems().size(), null, null, ComposableLambdaKt.composableLambdaInstance(1523214079, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.UserRankingsContentKt$UserRankingsContent$2$3$1$1$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 48) == 0) {
                    i2 |= composer.changed(i) ? 32 : 16;
                }
                if ((i2 & Opcodes.I2B) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1523214079, i2, -1, "org.betup.ui.fragment.user.compose.UserRankingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserRankingsContent.kt:191)");
                }
                SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer, 6);
                NewUserRankingItemModel newUserRankingItemModel3 = RankingTimeType.this.getRemainingItems().get(i);
                composer.startReplaceGroup(1849434622);
                UserRankingsContentKt$UserRankingsContent$2$3$1$1$4$1$1 rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = UserRankingsContentKt$UserRankingsContent$2$3$1$1$4$1$1.INSTANCE;
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                UserRankingsContentKt.RankingListItem(newUserRankingItemModel3, (Function1) ((KFunction) rememberedValue), composer, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$UserRankingsContentKt.INSTANCE.getLambda$148899343$app_release(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(UserRankingsController userRankingsController) {
        if (userRankingsController != null) {
            userRankingsController.clearError();
        }
        if (userRankingsController != null) {
            userRankingsController.refreshRankingStatistics();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) {
        List UserRankingsContent$lambda$2;
        String UserRankingsContent$lambda$8;
        String UserRankingsContent$lambda$82;
        List UserRankingsContent$lambda$22;
        int UserRankingsContent$lambda$4;
        List UserRankingsContent$lambda$23;
        int UserRankingsContent$lambda$42;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(700943768, i, -1, "org.betup.ui.fragment.user.compose.UserRankingsContent.<anonymous>.<anonymous> (UserRankingsContent.kt:111)");
        }
        UserRankingsContent$lambda$2 = UserRankingsContentKt.UserRankingsContent$lambda$2(this.$rankingTabs$delegate);
        if (!UserRankingsContent$lambda$2.isEmpty()) {
            UserRankingsContent$lambda$22 = UserRankingsContentKt.UserRankingsContent$lambda$2(this.$rankingTabs$delegate);
            int size = UserRankingsContent$lambda$22.size();
            UserRankingsContent$lambda$4 = UserRankingsContentKt.UserRankingsContent$lambda$4(this.$selectedTab$delegate);
            if (UserRankingsContent$lambda$4 >= 0 && UserRankingsContent$lambda$4 < size) {
                composer.startReplaceGroup(-314986483);
                UserRankingsContent$lambda$23 = UserRankingsContentKt.UserRankingsContent$lambda$2(this.$rankingTabs$delegate);
                UserRankingsContent$lambda$42 = UserRankingsContentKt.UserRankingsContent$lambda$4(this.$selectedTab$delegate);
                final RankingTimeType rankingTimeType = (RankingTimeType) UserRankingsContent$lambda$23.get(UserRankingsContent$lambda$42);
                final NewUserRankingItemModel fourthItem = rankingTimeType.getFourthItem();
                final NewUserRankingItemModel fiveItem = rankingTimeType.getFiveItem();
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer.startReplaceGroup(-1746271574);
                boolean changedInstance = composer.changedInstance(rankingTimeType) | composer.changed(fourthItem) | composer.changed(fiveItem);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.user.compose.UserRankingsContentKt$UserRankingsContent$2$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$1$lambda$0;
                            invoke$lambda$1$lambda$0 = UserRankingsContentKt$UserRankingsContent$2$3.invoke$lambda$1$lambda$0(RankingTimeType.this, fourthItem, fiveItem, (LazyListScope) obj);
                            return invoke$lambda$1$lambda$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                LazyDslKt.LazyColumn(fillMaxSize$default, null, null, false, null, null, null, false, null, (Function1) rememberedValue, composer, 6, 510);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
        }
        UserRankingsContent$lambda$8 = UserRankingsContentKt.UserRankingsContent$lambda$8(this.$error$delegate);
        if (UserRankingsContent$lambda$8 != null) {
            composer.startReplaceGroup(-310802568);
            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            final UserRankingsController userRankingsController = this.$controller;
            State<String> state = this.$error$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default2);
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
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center2, centerHorizontally, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer);
            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            UserRankingsContent$lambda$82 = UserRankingsContentKt.UserRankingsContent$lambda$8(state);
            composer.startReplaceGroup(-1831515481);
            if (UserRankingsContent$lambda$82 == null) {
                UserRankingsContent$lambda$82 = StringResources_androidKt.stringResource(R.string.unknown_error, composer, 6);
            }
            composer.endReplaceGroup();
            TextKt.m2642Text4IGK_g(UserRankingsContent$lambda$82, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(14), new FontWeight(LogSeverity.WARNING_VALUE), (FontStyle) null, (FontSynthesis) null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), composer, 6);
            String stringResource = StringResources_androidKt.stringResource(R.string.retry, composer, 6);
            composer.startReplaceGroup(5004770);
            boolean changedInstance2 = composer.changedInstance(userRankingsController);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.user.compose.UserRankingsContentKt$UserRankingsContent$2$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2;
                        invoke$lambda$5$lambda$4$lambda$3$lambda$2 = UserRankingsContentKt$UserRankingsContent$2$3.invoke$lambda$5$lambda$4$lambda$3$lambda$2(UserRankingsController.this);
                        return invoke$lambda$5$lambda$4$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            CommonButtonKt.m12915CommonButtonUPEs2M4(null, false, stringResource, false, false, false, (Function0) rememberedValue2, false, false, false, false, false, null, null, false, false, null, null, null, null, null, composer, 0, 0, 0, 2097083);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-309524438);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
        }
    }
}
