package org.betup.ui.fragment.home.compose;

import android.graphics.Rect;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.bus.NavigateMessage;
import org.betup.ui.fragment.home.compose.sections.HomeQuickPlaySectionKt;
import org.greenrobot.eventbus.EventBus;

/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HomeScreenKt$HomeScreen$9$2$1$4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Function1<Rect, Unit> $onFlashBetBoundsReported;
    final /* synthetic */ Function1<Rect, Unit> $onMinigamesBoundsReported;
    final /* synthetic */ Function1<Rect, Unit> $onTvBetBoundsReported;

    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeScreen$9$2$1$4(Function1<? super Rect, Unit> function1, Function1<? super Rect, Unit> function12, Function1<? super Rect, Unit> function13) {
        this.$onFlashBetBoundsReported = function1;
        this.$onMinigamesBoundsReported = function12;
        this.$onTvBetBoundsReported = function13;
    }

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
            ComposerKt.traceEventStart(465132434, i, -1, "org.betup.ui.fragment.home.compose.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:298)");
        }
        composer.startReplaceGroup(1849434622);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = HomeScreenKt$HomeScreen$9$2$1$4.invoke$lambda$1$lambda$0();
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Function0 function0 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = HomeScreenKt$HomeScreen$9$2$1$4.invoke$lambda$3$lambda$2();
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        Function0 function02 = (Function0) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.home.compose.HomeScreenKt$HomeScreen$9$2$1$4$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$5$lambda$4;
                    invoke$lambda$5$lambda$4 = HomeScreenKt$HomeScreen$9$2$1$4.invoke$lambda$5$lambda$4();
                    return invoke$lambda$5$lambda$4;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        HomeQuickPlaySectionKt.HomeQuickPlaySection(function0, function02, (Function0) rememberedValue3, this.$onFlashBetBoundsReported, this.$onMinigamesBoundsReported, this.$onTvBetBoundsReported, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 1573302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.FLASH_BET, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.MINI_GAMES_HOME_ACTIVITY, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4() {
        EventBus.getDefault().post(new NavigateMessage(NavigateMessage.Target.TVBET, null));
        return Unit.INSTANCE;
    }
}
