package org.betup.ui.fragment.flashbet;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;

/* compiled from: FlashBetLeaveConfirmDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$FlashBetLeaveConfirmDialogFragmentKt {
    public static final ComposableSingletons$FlashBetLeaveConfirmDialogFragmentKt INSTANCE = new ComposableSingletons$FlashBetLeaveConfirmDialogFragmentKt();

    /* renamed from: lambda$-1755371665, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3802lambda$1755371665 = ComposableLambdaKt.composableLambdaInstance(-1755371665, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.ComposableSingletons$FlashBetLeaveConfirmDialogFragmentKt$lambda$-1755371665$1
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
                ComposerKt.traceEventStart(-1755371665, i, -1, "org.betup.ui.fragment.flashbet.ComposableSingletons$FlashBetLeaveConfirmDialogFragmentKt.lambda$-1755371665.<anonymous> (FlashBetLeaveConfirmDialogFragment.kt:164)");
            }
            float f = 24;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_leave_confirm_message, composer, 6), PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f)), ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3120, 0, 130544);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1755371665$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13670getLambda$1755371665$app_release() {
        return f3802lambda$1755371665;
    }
}
