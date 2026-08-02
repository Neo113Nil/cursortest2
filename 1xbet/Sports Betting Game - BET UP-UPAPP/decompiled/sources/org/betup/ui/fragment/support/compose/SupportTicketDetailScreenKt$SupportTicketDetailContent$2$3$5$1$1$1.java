package org.betup.ui.fragment.support.compose;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.MessagingComponentsKt;

/* compiled from: SupportTicketDetailScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5$1$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ Function1<String, Unit> $onLoadMore;
    final /* synthetic */ SupportTicketDetailState $state;

    /* JADX WARN: Multi-variable type inference failed */
    SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5$1$1$1(SupportTicketDetailState supportTicketDetailState, Function1<? super String, Unit> function1, String str) {
        this.$state = supportTicketDetailState;
        this.$onLoadMore = function1;
        this.$chatId = str;
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
            ComposerKt.traceEventStart(878252458, i, -1, "org.betup.ui.fragment.support.compose.SupportTicketDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SupportTicketDetailScreen.kt:200)");
        }
        if (this.$state.getHasMore() || this.$state.isLoadingMore()) {
            boolean isLoadingMore = this.$state.isLoadingMore();
            composer.startReplaceGroup(-1633490746);
            boolean changed = composer.changed(this.$onLoadMore) | composer.changed(this.$chatId);
            final Function1<String, Unit> function1 = this.$onLoadMore;
            final String str = this.$chatId;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5$1$1$1.invoke$lambda$1$lambda$0(Function1.this, str);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            MessagingComponentsKt.LoadMoreMessagesButton(isLoadingMore, (Function0) rememberedValue, composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }
}
