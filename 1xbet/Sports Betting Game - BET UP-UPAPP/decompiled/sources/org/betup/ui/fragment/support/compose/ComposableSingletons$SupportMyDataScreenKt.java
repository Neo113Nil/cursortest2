package org.betup.ui.fragment.support.compose;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: SupportMyDataScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$SupportMyDataScreenKt {
    public static final ComposableSingletons$SupportMyDataScreenKt INSTANCE = new ComposableSingletons$SupportMyDataScreenKt();

    /* renamed from: lambda$-934441347, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3822lambda$934441347 = ComposableLambdaKt.composableLambdaInstance(-934441347, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.support.compose.ComposableSingletons$SupportMyDataScreenKt$lambda$-934441347$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934441347, i, -1, "org.betup.ui.fragment.support.compose.ComposableSingletons$SupportMyDataScreenKt.lambda$-934441347.<anonymous> (SupportMyDataScreen.kt:90)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.account_deletion_request, composer, 6), null, null, false, false, false, false, composer, 0, 253);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2089732627, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3821lambda$2089732627 = ComposableLambdaKt.composableLambdaInstance(-2089732627, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.support.compose.ComposableSingletons$SupportMyDataScreenKt$lambda$-2089732627$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2089732627, i, -1, "org.betup.ui.fragment.support.compose.ComposableSingletons$SupportMyDataScreenKt.lambda$-2089732627.<anonymous> (SupportMyDataScreen.kt:184)");
            }
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.email_placeholder, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$799959460 = ComposableLambdaKt.composableLambdaInstance(799959460, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.support.compose.ComposableSingletons$SupportMyDataScreenKt$lambda$799959460$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(799959460, i, -1, "org.betup.ui.fragment.support.compose.ComposableSingletons$SupportMyDataScreenKt.lambda$799959460.<anonymous> (SupportMyDataScreen.kt:231)");
            }
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.problem_with_calculation, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-2089732627$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14154getLambda$2089732627$app_release() {
        return f3821lambda$2089732627;
    }

    /* renamed from: getLambda$-934441347$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14155getLambda$934441347$app_release() {
        return f3822lambda$934441347;
    }

    public final Function2<Composer, Integer, Unit> getLambda$799959460$app_release() {
        return lambda$799959460;
    }
}
