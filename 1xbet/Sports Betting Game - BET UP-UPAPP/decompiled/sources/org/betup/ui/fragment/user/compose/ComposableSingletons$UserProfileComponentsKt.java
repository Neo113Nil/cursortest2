package org.betup.ui.fragment.user.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserProfileComponents.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$UserProfileComponentsKt {
    public static final ComposableSingletons$UserProfileComponentsKt INSTANCE = new ComposableSingletons$UserProfileComponentsKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$161923864 = ComposableLambdaKt.composableLambdaInstance(161923864, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.ComposableSingletons$UserProfileComponentsKt$lambda$161923864$1
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
                ComposerKt.traceEventStart(161923864, i, -1, "org.betup.ui.fragment.user.compose.ComposableSingletons$UserProfileComponentsKt.lambda$161923864.<anonymous> (UserProfileComponents.kt:373)");
            }
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$161923864$app_release() {
        return lambda$161923864;
    }
}
