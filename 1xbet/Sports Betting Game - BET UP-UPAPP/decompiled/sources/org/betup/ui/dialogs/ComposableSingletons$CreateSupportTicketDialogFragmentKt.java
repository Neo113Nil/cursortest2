package org.betup.ui.dialogs;

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

/* compiled from: CreateSupportTicketDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CreateSupportTicketDialogFragmentKt {
    public static final ComposableSingletons$CreateSupportTicketDialogFragmentKt INSTANCE = new ComposableSingletons$CreateSupportTicketDialogFragmentKt();
    private static Function2<Composer, Integer, Unit> lambda$310964802 = ComposableLambdaKt.composableLambdaInstance(310964802, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$CreateSupportTicketDialogFragmentKt$lambda$310964802$1
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
                ComposerKt.traceEventStart(310964802, i, -1, "org.betup.ui.dialogs.ComposableSingletons$CreateSupportTicketDialogFragmentKt.lambda$310964802.<anonymous> (CreateSupportTicketDialogFragment.kt:134)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.create_new_support_ticket, composer, 6), null, null, false, false, false, false, composer, 0, 253);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1204981550, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3775lambda$1204981550 = ComposableLambdaKt.composableLambdaInstance(-1204981550, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$CreateSupportTicketDialogFragmentKt$lambda$-1204981550$1
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
                ComposerKt.traceEventStart(-1204981550, i, -1, "org.betup.ui.dialogs.ComposableSingletons$CreateSupportTicketDialogFragmentKt.lambda$-1204981550.<anonymous> (CreateSupportTicketDialogFragment.kt:205)");
            }
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.enter_message, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3072, 0, 131058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1204981550$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13020getLambda$1204981550$app_release() {
        return f3775lambda$1204981550;
    }

    public final Function2<Composer, Integer, Unit> getLambda$310964802$app_release() {
        return lambda$310964802;
    }
}
