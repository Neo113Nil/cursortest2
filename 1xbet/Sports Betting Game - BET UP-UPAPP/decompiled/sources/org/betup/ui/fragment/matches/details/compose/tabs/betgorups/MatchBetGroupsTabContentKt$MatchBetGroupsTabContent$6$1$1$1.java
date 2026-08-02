package org.betup.ui.fragment.matches.details.compose.tabs.betgorups;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;

/* compiled from: MatchBetGroupsTabContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$1$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ boolean $allExpanded;
    final /* synthetic */ Function3<Integer, Boolean, List<Long>, Unit> $onExpandAllToggle;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ List<BetGroupsTabs> $racingSubMatches;
    final /* synthetic */ boolean $shouldShowRacingResults;
    final /* synthetic */ float $tabIconSize;
    final /* synthetic */ float $tabSpacer;

    /* JADX WARN: Multi-variable type inference failed */
    MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$1$1$1(boolean z, float f, PagerState pagerState, boolean z2, List<BetGroupsTabs> list, Function3<? super Integer, ? super Boolean, ? super List<Long>, Unit> function3, float f2) {
        this.$allExpanded = z;
        this.$tabIconSize = f;
        this.$pagerState = pagerState;
        this.$shouldShowRacingResults = z2;
        this.$racingSubMatches = list;
        this.$onExpandAllToggle = function3;
        this.$tabSpacer = f2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(PagerState pagerState, Function3 function3, boolean z, boolean z2, List list) {
        List MatchBetGroupsTabContent$getBetGroupsForTab;
        int currentPage = pagerState.getCurrentPage();
        MatchBetGroupsTabContent$getBetGroupsForTab = MatchBetGroupsTabContentKt.MatchBetGroupsTabContent$getBetGroupsForTab(z2, list, currentPage);
        Integer valueOf = Integer.valueOf(currentPage);
        Boolean valueOf2 = Boolean.valueOf(!z);
        List list2 = MatchBetGroupsTabContent$getBetGroupsForTab;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((MatchVarietyGroupBetsModel) it.next()).getGroup().getId()));
        }
        function3.invoke(valueOf, valueOf2, arrayList);
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1495487674, i, -1, "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MatchBetGroupsTabContent.kt:197)");
        }
        Painter painterResource = PainterResources_androidKt.painterResource(this.$allExpanded ? R.drawable.collapse_btn : R.drawable.expand_btn, composer, 0);
        if (this.$allExpanded) {
            composer.startReplaceGroup(1650396619);
            i2 = R.string.collapse_all;
        } else {
            composer.startReplaceGroup(1650397993);
            i2 = R.string.expand_all;
        }
        String stringResource = StringResources_androidKt.stringResource(i2, composer, 6);
        composer.endReplaceGroup();
        Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, this.$tabIconSize);
        composer.startReplaceGroup(-1224400529);
        boolean changed = composer.changed(this.$pagerState) | composer.changed(this.$shouldShowRacingResults) | composer.changedInstance(this.$racingSubMatches) | composer.changed(this.$onExpandAllToggle) | composer.changed(this.$allExpanded);
        final PagerState pagerState = this.$pagerState;
        final Function3<Integer, Boolean, List<Long>, Unit> function3 = this.$onExpandAllToggle;
        final boolean z = this.$allExpanded;
        final boolean z2 = this.$shouldShowRacingResults;
        final List<BetGroupsTabs> list = this.$racingSubMatches;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$2$lambda$1;
                    invoke$lambda$2$lambda$1 = MatchBetGroupsTabContentKt$MatchBetGroupsTabContent$6$1$1$1.invoke$lambda$2$lambda$1(PagerState.this, function3, z, z2, list);
                    return invoke$lambda$2$lambda$1;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ImageKt.Image(painterResource, stringResource, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs, false, null, null, (Function0) rememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 0, 120);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, this.$tabSpacer), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
