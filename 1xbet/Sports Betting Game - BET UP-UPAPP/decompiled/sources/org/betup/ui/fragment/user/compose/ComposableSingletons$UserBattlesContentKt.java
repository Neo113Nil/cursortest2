package org.betup.ui.fragment.user.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.components.LoadingViewKt;

/* compiled from: UserBattlesContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$UserBattlesContentKt {
    public static final ComposableSingletons$UserBattlesContentKt INSTANCE = new ComposableSingletons$UserBattlesContentKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$841678983 = ComposableLambdaKt.composableLambdaInstance(841678983, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.ComposableSingletons$UserBattlesContentKt$lambda$841678983$1
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
                ComposerKt.traceEventStart(841678983, i, -1, "org.betup.ui.fragment.user.compose.ComposableSingletons$UserBattlesContentKt.lambda$841678983.<anonymous> (UserBattlesContent.kt:287)");
            }
            LoadingViewKt.LoadingView(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), UserBattleListDimens.INSTANCE.m14241getLoadingMoreHeightD9Ej5fM()), null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1387495664 = ComposableLambdaKt.composableLambdaInstance(1387495664, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.ComposableSingletons$UserBattlesContentKt$lambda$1387495664$1
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
                ComposerKt.traceEventStart(1387495664, i, -1, "org.betup.ui.fragment.user.compose.ComposableSingletons$UserBattlesContentKt.lambda$1387495664.<anonymous> (UserBattlesContent.kt:392)");
            }
            LoadingViewKt.LoadingView(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), UserBattleListDimens.INSTANCE.m14241getLoadingMoreHeightD9Ej5fM()), null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$212158047 = ComposableLambdaKt.composableLambdaInstance(212158047, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.user.compose.ComposableSingletons$UserBattlesContentKt$lambda$212158047$1
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
                ComposerKt.traceEventStart(212158047, i, -1, "org.betup.ui.fragment.user.compose.ComposableSingletons$UserBattlesContentKt.lambda$212158047.<anonymous> (UserBattlesContent.kt:471)");
            }
            LoadingViewKt.LoadingView(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), UserBattleListDimens.INSTANCE.m14241getLoadingMoreHeightD9Ej5fM()), null, composer, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1387495664$app_release() {
        return lambda$1387495664;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$212158047$app_release() {
        return lambda$212158047;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$841678983$app_release() {
        return lambda$841678983;
    }
}
