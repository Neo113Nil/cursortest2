package org.betup.ui.fragment.shop.compose;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.shop.ShopDisplaySection;

/* compiled from: ShopSectionedScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ShopSectionedScreenKt {
    public static final ComposableSingletons$ShopSectionedScreenKt INSTANCE = new ComposableSingletons$ShopSectionedScreenKt();

    /* renamed from: lambda$-1597520466, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f3820lambda$1597520466 = ComposableLambdaKt.composableLambdaInstance(-1597520466, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.ComposableSingletons$ShopSectionedScreenKt$lambda$-1597520466$1
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
                ComposerKt.traceEventStart(-1597520466, i, -1, "org.betup.ui.fragment.shop.compose.ComposableSingletons$ShopSectionedScreenKt.lambda$-1597520466.<anonymous> (ShopSectionedScreen.kt:54)");
            }
            ShopSectionHeaderKt.ShopSectionHeader(StringResources_androidKt.stringResource(R.string.shop_section_free_rewards, composer, 6), null, ShopDisplaySection.FREE_REWARDS, null, composer, RendererCapabilities.DECODER_SUPPORT_MASK, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1597520466$app_release, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m14114getLambda$1597520466$app_release() {
        return f3820lambda$1597520466;
    }
}
