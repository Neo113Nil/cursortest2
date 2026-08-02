package org.betup.ui.fragment.user.compose.messages.thread;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.user.compose.messages.MessagesPreviewData;
import org.betup.ui.fragment.user.compose.messages.UserMessagesCallbacks;
import org.betup.ui.fragment.user.compose.messages.UserMessagesState;
import org.betup.ui.views.ComposeUtils;

/* compiled from: ConversationScreen.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u008e\u0002"}, d2 = {"ConversationScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lorg/betup/ui/fragment/user/compose/messages/UserMessagesState;", "callbacks", "Lorg/betup/ui/fragment/user/compose/messages/UserMessagesCallbacks;", "onInputFocusChanged", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/Modifier;Lorg/betup/ui/fragment/user/compose/messages/UserMessagesState;Lorg/betup/ui/fragment/user/compose/messages/UserMessagesCallbacks;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ConversationPreview", "(Landroidx/compose/runtime/Composer;I)V", "app_release", "lastKnownTopMessageId", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConversationScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationPreview$lambda$3(int i, Composer composer, int i2) {
        ConversationPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$2(Modifier modifier, UserMessagesState userMessagesState, UserMessagesCallbacks userMessagesCallbacks, Function1 function1, int i, int i2, Composer composer, int i3) {
        ConversationScreen(modifier, userMessagesState, userMessagesCallbacks, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$1$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConversationScreen(Modifier modifier, final UserMessagesState state, final UserMessagesCallbacks callbacks, Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function1<? super Boolean, Unit> function12;
        Modifier.Companion companion;
        Function1<? super Boolean, Unit> function13;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer startRestartGroup = composer.startRestartGroup(-1637166050);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(callbacks) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (i5 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.user.compose.messages.thread.ConversationScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit ConversationScreen$lambda$1$lambda$0;
                                ConversationScreen$lambda$1$lambda$0 = ConversationScreenKt.ConversationScreen$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                                return ConversationScreen$lambda$1$lambda$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    function13 = (Function1) rememberedValue;
                } else {
                    function13 = function12;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1637166050, i3, -1, "org.betup.ui.fragment.user.compose.messages.thread.ConversationScreen (ConversationScreen.kt:57)");
                }
                BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m1025backgroundbw27NRU$default(companion, Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.ScreenBackground.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), null, false, ComposableLambdaKt.rememberComposableLambda(235200008, true, new ConversationScreenKt$ConversationScreen$2(state, callbacks, function13), startRestartGroup, 54), startRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function12 = function13;
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier3 = companion;
                final Function1<? super Boolean, Unit> function14 = function12;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.messages.thread.ConversationScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ConversationScreen$lambda$2;
                        ConversationScreen$lambda$2 = ConversationScreenKt.ConversationScreen$lambda$2(Modifier.this, state, callbacks, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ConversationScreen$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & 1171) == 1170) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m1025backgroundbw27NRU$default(companion, Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.ScreenBackground.INSTANCE.getColor(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), null, false, ComposableLambdaKt.rememberComposableLambda(235200008, true, new ConversationScreenKt$ConversationScreen$2(state, callbacks, function13), startRestartGroup, 54), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        function12 = function13;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void ConversationPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(475189429);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(475189429, i, -1, "org.betup.ui.fragment.user.compose.messages.thread.ConversationPreview (ConversationScreen.kt:195)");
            }
            ConversationScreen(null, new UserMessagesState(null, false, false, false, null, MessagesPreviewData.INSTANCE.getMessages(), false, false, false, false, "George_123", null, 0, false, 9183, null), new UserMessagesCallbacks(null, null, null, null, null, null, null, null, 255, null), null, startRestartGroup, RendererCapabilities.DECODER_SUPPORT_MASK, 9);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.messages.thread.ConversationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConversationPreview$lambda$3;
                    ConversationPreview$lambda$3 = ConversationScreenKt.ConversationPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ConversationPreview$lambda$3;
                }
            });
        }
    }
}
