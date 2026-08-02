package org.betup.ui.fragment.support.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.MessagingComponentsKt;
import org.betup.ui.fragment.user.compose.messages.MessageBubbleUi;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: SupportTicketDetailScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ Function1<String, Unit> $onLoadMore;
    final /* synthetic */ SupportTicketDetailState $state;

    /* JADX WARN: Multi-variable type inference failed */
    SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5(SupportTicketDetailState supportTicketDetailState, Function1<? super String, Unit> function1, String str) {
        this.$state = supportTicketDetailState;
        this.$onLoadMore = function1;
        this.$chatId = str;
    }

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
            ComposerKt.traceEventStart(306482911, i, -1, "org.betup.ui.fragment.support.compose.SupportTicketDetailContent.<anonymous>.<anonymous>.<anonymous> (SupportTicketDetailScreen.kt:194)");
        }
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m1397spacedBy0680j_4 = Arrangement.INSTANCE.m1397spacedBy0680j_4(Dp.m7774constructorimpl(12));
        composer.startReplaceGroup(-1746271574);
        boolean changed = composer.changed(this.$state) | composer.changed(this.$onLoadMore) | composer.changed(this.$chatId);
        final SupportTicketDetailState supportTicketDetailState = this.$state;
        final Function1<String, Unit> function1 = this.$onLoadMore;
        final String str = this.$chatId;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$3$lambda$2;
                    invoke$lambda$3$lambda$2 = SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5.invoke$lambda$3$lambda$2(SupportTicketDetailState.this, function1, str, (LazyListScope) obj);
                    return invoke$lambda$3$lambda$2;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        LazyDslKt.LazyColumn(fillMaxSize$default, null, null, true, m1397spacedBy0680j_4, null, null, false, null, (Function1) rememberedValue, composer, 27654, 486);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(final SupportTicketDetailState supportTicketDetailState, Function1 function1, String str, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(878252458, true, new SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5$1$1$1(supportTicketDetailState, function1, str)), 3, null);
        final List<MessageBubbleUi> messages = supportTicketDetailState.getMessages();
        final Function2 function2 = new Function2() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object invoke$lambda$3$lambda$2$lambda$0;
                invoke$lambda$3$lambda$2$lambda$0 = SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5.invoke$lambda$3$lambda$2$lambda$0(((Integer) obj).intValue(), (MessageBubbleUi) obj2);
                return invoke$lambda$3$lambda$2$lambda$0;
            }
        };
        LazyColumn.items(messages.size(), new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function2.this.invoke(Integer.valueOf(i), messages.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                messages.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.support.compose.SupportTicketDetailScreenKt$SupportTicketDetailContent$2$3$5$invoke$lambda$3$lambda$2$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C214@10657L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                boolean z = true;
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                MessageBubbleUi messageBubbleUi = (MessageBubbleUi) messages.get(i);
                composer.startReplaceGroup(-704307991);
                MessageBubbleUi messageBubbleUi2 = (MessageBubbleUi) CollectionsKt.getOrNull(supportTicketDetailState.getMessages(), i - 1);
                Integer valueOf = messageBubbleUi2 != null ? Integer.valueOf(messageBubbleUi2.getAuthorId()) : null;
                int authorId = messageBubbleUi.getAuthorId();
                if (valueOf != null && valueOf.intValue() == authorId) {
                    z = false;
                }
                MessagingComponentsKt.MessageBubble(messageBubbleUi, z, composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invoke$lambda$3$lambda$2$lambda$0(int i, MessageBubbleUi bubble) {
        Intrinsics.checkNotNullParameter(bubble, "bubble");
        return bubble.getId();
    }
}
