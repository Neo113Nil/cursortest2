package org.betup.ui.fragment.home.compose.matches;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.home.compose.HomeMatchOddUi;

/* compiled from: HomeMatchCardsPreview.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$HomeMatchCardsPreviewKt {
    public static final ComposableSingletons$HomeMatchCardsPreviewKt INSTANCE = new ComposableSingletons$HomeMatchCardsPreviewKt();

    /* renamed from: lambda$-1750551499, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3806lambda$1750551499 = ComposableLambdaKt.composableLambdaInstance(-1750551499, false, ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1750551499$1.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$689361196 = ComposableLambdaKt.composableLambdaInstance(689361196, false, ComposableSingletons$HomeMatchCardsPreviewKt$lambda$689361196$1.INSTANCE);

    /* renamed from: lambda$-1935431028, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3807lambda$1935431028 = ComposableLambdaKt.composableLambdaInstance(-1935431028, false, ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1935431028$1.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1075958808 = ComposableLambdaKt.composableLambdaInstance(1075958808, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1075958808$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            List list;
            List list2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1075958808, i, -1, "org.betup.ui.fragment.home.compose.matches.ComposableSingletons$HomeMatchCardsPreviewKt.lambda$1075958808.<anonymous> (HomeMatchCardsPreview.kt:213)");
            }
            Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1397spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            List listOf = CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(41.0f), Float.valueOf(29.0f), Float.valueOf(30.0f)});
            list = HomeMatchCardsPreviewKt.preview1x2Odds241335331;
            List list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((HomeMatchOddUi) it.next()).getCoefficient()));
            }
            ArrayList arrayList2 = arrayList;
            list2 = HomeMatchCardsPreviewKt.preview1x2Odds241335331;
            List list4 = list2;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((HomeMatchOddUi) it2.next()).getBetName());
            }
            HomeMatchCardSharedKt.HomeMatchSentimentBar(listOf, arrayList2, arrayList3, null, composer, 6, 8);
            HomeMatchCardSharedKt.HomeMatchSentimentBar(CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(62.0f), Float.valueOf(38.0f)}), CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(2.0d), Double.valueOf(3.5d)}), null, null, composer, 54, 12);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1401989383, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3804lambda$1401989383 = ComposableLambdaKt.composableLambdaInstance(-1401989383, false, ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1401989383$1.INSTANCE);

    /* renamed from: lambda$-1521422871, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3805lambda$1521422871 = ComposableLambdaKt.composableLambdaInstance(-1521422871, false, ComposableSingletons$HomeMatchCardsPreviewKt$lambda$1521422871$1.INSTANCE);

    /* renamed from: getLambda$-1401989383$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13772getLambda$1401989383$app_release() {
        return f3804lambda$1401989383;
    }

    /* renamed from: getLambda$-1521422871$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13773getLambda$1521422871$app_release() {
        return f3805lambda$1521422871;
    }

    /* renamed from: getLambda$-1750551499$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13774getLambda$1750551499$app_release() {
        return f3806lambda$1750551499;
    }

    /* renamed from: getLambda$-1935431028$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13775getLambda$1935431028$app_release() {
        return f3807lambda$1935431028;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1075958808$app_release() {
        return lambda$1075958808;
    }

    public final Function2<Composer, Integer, Unit> getLambda$689361196$app_release() {
        return lambda$689361196;
    }
}
