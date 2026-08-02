package org.betup.ui.common.compose;

import androidx.compose.foundation.layout.RowScope;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;

/* compiled from: MessagingComponents.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$MessagingComponentsKt {
    public static final ComposableSingletons$MessagingComponentsKt INSTANCE = new ComposableSingletons$MessagingComponentsKt();

    /* renamed from: lambda$-1614369075, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f3771lambda$1614369075 = ComposableLambdaKt.composableLambdaInstance(-1614369075, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: org.betup.ui.common.compose.ComposableSingletons$MessagingComponentsKt$lambda$-1614369075$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1614369075, i, -1, "org.betup.ui.common.compose.ComposableSingletons$MessagingComponentsKt.lambda$-1614369075.<anonymous> (MessagingComponents.kt:318)");
            }
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.load_previous_messages, composer, 6), (Modifier) null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(13), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 199680, 0, 131026);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1614369075$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m12920getLambda$1614369075$app_release() {
        return f3771lambda$1614369075;
    }
}
