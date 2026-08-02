package org.betup.ui.fragment.user.compose;

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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;

/* compiled from: UserProfileScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$UserProfileScreenKt {
    public static final ComposableSingletons$UserProfileScreenKt INSTANCE = new ComposableSingletons$UserProfileScreenKt();

    /* renamed from: lambda$-1146352988, reason: not valid java name */
    private static Function3<RowScope, Composer, Integer, Unit> f3827lambda$1146352988 = ComposableLambdaKt.composableLambdaInstance(-1146352988, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.ComposableSingletons$UserProfileScreenKt$lambda$-1146352988$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1146352988, i, -1, "org.betup.ui.fragment.user.compose.ComposableSingletons$UserProfileScreenKt.lambda$-1146352988.<anonymous> (UserProfileScreen.kt:114)");
            }
            TextKt.m3621Text4IGK_g(StringResources_androidKt.stringResource(R.string.retry, composer, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1146352988$app_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m14211getLambda$1146352988$app_release() {
        return f3827lambda$1146352988;
    }
}
