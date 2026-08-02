package org.betup.ui.dialogs;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.betup.R;
import org.betup.ui.fragment.bets.sheet.compose.items.QuickBetHeaderKt;

/* compiled from: ChangeUserPhotoDialogFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$ChangeUserPhotoDialogFragmentKt {
    public static final ComposableSingletons$ChangeUserPhotoDialogFragmentKt INSTANCE = new ComposableSingletons$ChangeUserPhotoDialogFragmentKt();

    /* renamed from: lambda$-1182250043, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3773lambda$1182250043 = ComposableLambdaKt.composableLambdaInstance(-1182250043, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$ChangeUserPhotoDialogFragmentKt$lambda$-1182250043$1
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
                ComposerKt.traceEventStart(-1182250043, i, -1, "org.betup.ui.dialogs.ComposableSingletons$ChangeUserPhotoDialogFragmentKt.lambda$-1182250043.<anonymous> (ChangeUserPhotoDialogFragment.kt:141)");
            }
            QuickBetHeaderKt.QuickBetHeader(null, StringResources_androidKt.stringResource(R.string.lay_photo_name, composer, 6), null, null, false, false, false, false, composer, 24576, 237);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1903169465, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f3774lambda$1903169465 = ComposableLambdaKt.composableLambdaInstance(-1903169465, false, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.dialogs.ComposableSingletons$ChangeUserPhotoDialogFragmentKt$lambda$-1903169465$1
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
                ComposerKt.traceEventStart(-1903169465, i, -1, "org.betup.ui.dialogs.ComposableSingletons$ChangeUserPhotoDialogFragmentKt.lambda$-1903169465.<anonymous> (ChangeUserPhotoDialogFragment.kt:148)");
            }
            BoxKt.Box(PaddingKt.m1517paddingVpY3zN4(SizeKt.m1551heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(44), 0.0f, 2, null), Dp.m7774constructorimpl(16), Dp.m7774constructorimpl(8)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1182250043$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13018getLambda$1182250043$app_release() {
        return f3773lambda$1182250043;
    }

    /* renamed from: getLambda$-1903169465$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m13019getLambda$1903169465$app_release() {
        return f3774lambda$1903169465;
    }
}
