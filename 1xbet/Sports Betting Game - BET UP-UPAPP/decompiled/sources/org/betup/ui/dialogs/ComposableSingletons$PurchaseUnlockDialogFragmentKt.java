package org.betup.ui.dialogs;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PurchaseUnlockDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$PurchaseUnlockDialogFragmentKt {
    public static final ComposableSingletons$PurchaseUnlockDialogFragmentKt INSTANCE = new ComposableSingletons$PurchaseUnlockDialogFragmentKt();

    /* renamed from: lambda$-197820314, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3777lambda$197820314 = ComposableLambdaKt.composableLambdaInstance(-197820314, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$PurchaseUnlockDialogFragmentKt$lambda$-197820314$1
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
                ComposerKt.traceEventStart(-197820314, i, -1, "org.betup.ui.dialogs.ComposableSingletons$PurchaseUnlockDialogFragmentKt.lambda$-197820314.<anonymous> (PurchaseUnlockDialogFragment.kt:212)");
            }
            SpacerKt.Spacer(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(28)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-197820314$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13022getLambda$197820314$app_release() {
        return f3777lambda$197820314;
    }
}
