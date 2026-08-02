package org.betup.ui.fragment.search.compose;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.TextKt;
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
import io.bidmachine.media3.extractor.WavUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.LoadingViewKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: NewSearchContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$NewSearchContentKt {
    public static final ComposableSingletons$NewSearchContentKt INSTANCE = new ComposableSingletons$NewSearchContentKt();

    /* renamed from: lambda$-547963184, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f3814lambda$547963184 = ComposableLambdaKt.composableLambdaInstance(-547963184, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt$lambda$-547963184$1
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
                ComposerKt.traceEventStart(-547963184, i, -1, "org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt.lambda$-547963184.<anonymous> (NewSearchContent.kt:265)");
            }
            SearchItemComponentsKt.SearchSectionTitle(StringResources_androidKt.stringResource(R.string.recent_searches, composer, 6), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1703478393 = ComposableLambdaKt.composableLambdaInstance(1703478393, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt$lambda$1703478393$1
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
                ComposerKt.traceEventStart(1703478393, i, -1, "org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt.lambda$1703478393.<anonymous> (NewSearchContent.kt:278)");
            }
            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m1516padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.loading_trending, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), TextUnitKt.getSp(14), null, null, null, ComposeUtils.INSTANCE.sfProFontFamily(composer, 6), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777180, (DefaultConstructorMarker) null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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

    /* renamed from: lambda$-850364075, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f3818lambda$850364075 = ComposableLambdaKt.composableLambdaInstance(-850364075, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt$lambda$-850364075$1
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
                ComposerKt.traceEventStart(-850364075, i, -1, "org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt.lambda$-850364075.<anonymous> (NewSearchContent.kt:297)");
            }
            SearchItemComponentsKt.SearchSectionTitle(StringResources_androidKt.stringResource(R.string.trending, composer, 6), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$8464965 = ComposableLambdaKt.composableLambdaInstance(8464965, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt$lambda$8464965$1
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
                ComposerKt.traceEventStart(8464965, i, -1, "org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt.lambda$8464965.<anonymous> (NewSearchContent.kt:384)");
            }
            SearchItemComponentsKt.SearchSectionTitle(StringResources_androidKt.stringResource(R.string.title_leagues, composer, 6), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-607182546, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f3815lambda$607182546 = ComposableLambdaKt.composableLambdaInstance(-607182546, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt$lambda$-607182546$1
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
                ComposerKt.traceEventStart(-607182546, i, -1, "org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt.lambda$-607182546.<anonymous> (NewSearchContent.kt:396)");
            }
            SearchItemComponentsKt.SearchSectionTitle(StringResources_androidKt.stringResource(R.string.title_teams, composer, 6), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-683021107, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f3816lambda$683021107 = ComposableLambdaKt.composableLambdaInstance(-683021107, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt$lambda$-683021107$1
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
                ComposerKt.traceEventStart(-683021107, i, -1, "org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt.lambda$-683021107.<anonymous> (NewSearchContent.kt:408)");
            }
            SearchItemComponentsKt.SearchSectionTitle(StringResources_androidKt.stringResource(R.string.matches, composer, 6), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-758859668, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f3817lambda$758859668 = ComposableLambdaKt.composableLambdaInstance(-758859668, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt$lambda$-758859668$1
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
                ComposerKt.traceEventStart(-758859668, i, -1, "org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt.lambda$-758859668.<anonymous> (NewSearchContent.kt:420)");
            }
            SearchItemComponentsKt.SearchSectionTitle(StringResources_androidKt.stringResource(R.string.title_users, composer, 6), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$348453565 = ComposableLambdaKt.composableLambdaInstance(348453565, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt$lambda$348453565$1
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
                ComposerKt.traceEventStart(348453565, i, -1, "org.betup.ui.fragment.search.compose.ComposableSingletons$NewSearchContentKt.lambda$348453565.<anonymous> (NewSearchContent.kt:466)");
            }
            LoadingViewKt.LoadingView(null, null, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-547963184$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14082getLambda$547963184$app_release() {
        return f3814lambda$547963184;
    }

    /* renamed from: getLambda$-607182546$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14083getLambda$607182546$app_release() {
        return f3815lambda$607182546;
    }

    /* renamed from: getLambda$-683021107$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14084getLambda$683021107$app_release() {
        return f3816lambda$683021107;
    }

    /* renamed from: getLambda$-758859668$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14085getLambda$758859668$app_release() {
        return f3817lambda$758859668;
    }

    /* renamed from: getLambda$-850364075$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14086getLambda$850364075$app_release() {
        return f3818lambda$850364075;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1703478393$app_release() {
        return lambda$1703478393;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$348453565$app_release() {
        return lambda$348453565;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$8464965$app_release() {
        return lambda$8464965;
    }
}
