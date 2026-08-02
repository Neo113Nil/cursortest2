package org.betup.ui.fragment.user.compose.messages;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.fragment.user.compose.messages.list.ChatListScreenKt;
import org.betup.ui.fragment.user.compose.messages.thread.ConversationScreenKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: MessagesTabScreen.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\tH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"REFRESH_INTERVAL_MILLIS", "", "MessagesTabContent", "", "state", "Lorg/betup/ui/fragment/user/compose/messages/UserMessagesState;", "callbacks", "Lorg/betup/ui/fragment/user/compose/messages/UserMessagesCallbacks;", "onInputFocusChanged", "Lkotlin/Function1;", "", "(Lorg/betup/ui/fragment/user/compose/messages/UserMessagesState;Lorg/betup/ui/fragment/user/compose/messages/UserMessagesCallbacks;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "MessagesTabPreviewList", "(Landroidx/compose/runtime/Composer;I)V", "MessagesTabPreviewConversation", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MessagesTabScreenKt {
    private static final long REFRESH_INTERVAL_MILLIS = 20000;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessagesTabContent$lambda$8(UserMessagesState userMessagesState, UserMessagesCallbacks userMessagesCallbacks, Function1 function1, int i, int i2, Composer composer, int i3) {
        MessagesTabContent(userMessagesState, userMessagesCallbacks, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessagesTabPreviewConversation$lambda$10(int i, Composer composer, int i2) {
        MessagesTabPreviewConversation(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessagesTabPreviewList$lambda$9(int i, Composer composer, int i2) {
        MessagesTabPreviewList(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessagesTabContent$lambda$1$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MessagesTabContent(final UserMessagesState state, final UserMessagesCallbacks callbacks, Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super Boolean, Unit> function12;
        Function1<? super Boolean, Unit> function13;
        boolean z;
        MessagesTabScreenKt$MessagesTabContent$2$1 rememberedValue;
        boolean z2;
        MessagesTabScreenKt$MessagesTabContent$3$1 rememberedValue2;
        boolean z3;
        MessagesTabScreenKt$MessagesTabContent$4$1 rememberedValue3;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean z4;
        boolean z5;
        Object rememberedValue4;
        final Function1<? super Boolean, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer startRestartGroup = composer.startRestartGroup(1562481844);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                if (i4 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.user.compose.messages.MessagesTabScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit MessagesTabContent$lambda$1$lambda$0;
                                MessagesTabContent$lambda$1$lambda$0 = MessagesTabScreenKt.MessagesTabContent$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                                return MessagesTabContent$lambda$1$lambda$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceGroup();
                    function13 = (Function1) rememberedValue5;
                } else {
                    function13 = function12;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1562481844, i3, -1, "org.betup.ui.fragment.user.compose.messages.MessagesTabContent (MessagesTabScreen.kt:21)");
                }
                Unit unit = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(5004770);
                int i5 = i3 & 112;
                z = i5 != 32;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new MessagesTabScreenKt$MessagesTabContent$2$1(callbacks, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
                Unit unit2 = Unit.INSTANCE;
                startRestartGroup.startReplaceGroup(5004770);
                z2 = i5 != 32;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new MessagesTabScreenKt$MessagesTabContent$3$1(callbacks, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
                ChatListItemUi selectedChat = state.getSelectedChat();
                Long chatId = selectedChat == null ? selectedChat.getChatId() : null;
                Boolean valueOf = Boolean.valueOf(state.isSingleConversation());
                startRestartGroup.startReplaceGroup(-1633490746);
                z3 = ((i3 & 14) != 4) | (i5 != 32);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new MessagesTabScreenKt$MessagesTabContent$4$1(state, callbacks, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(chatId, valueOf, (Function2) rememberedValue3, startRestartGroup, 0);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                boolean isSingleConversation = state.isSingleConversation();
                z4 = (isSingleConversation && state.getSelectedChat() == null) ? false : true;
                boolean z6 = (z4 || isSingleConversation) ? false : true;
                startRestartGroup.startReplaceGroup(5004770);
                z5 = i5 != 32;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z5 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.user.compose.messages.MessagesTabScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit MessagesTabContent$lambda$7$lambda$6$lambda$5;
                            MessagesTabContent$lambda$7$lambda$6$lambda$5 = MessagesTabScreenKt.MessagesTabContent$lambda$7$lambda$6$lambda$5(UserMessagesCallbacks.this);
                            return MessagesTabContent$lambda$7$lambda$6$lambda$5;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                startRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(z6, (Function0) rememberedValue4, startRestartGroup, 0, 0);
                if (!z4) {
                    startRestartGroup.startReplaceGroup(-489454262);
                    int i6 = i3 << 3;
                    ConversationScreenKt.ConversationScreen(Modifier.INSTANCE, state, callbacks, function13, startRestartGroup, (i6 & 112) | 6 | (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i6 & 7168), 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-489231186);
                    ChatListScreenKt.ChatListScreen(state, callbacks, startRestartGroup, i3 & 126);
                    startRestartGroup.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function14 = function13;
            } else {
                startRestartGroup.skipToGroupEnd();
                function14 = function12;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.messages.MessagesTabScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit MessagesTabContent$lambda$8;
                        MessagesTabContent$lambda$8 = MessagesTabScreenKt.MessagesTabContent$lambda$8(UserMessagesState.this, callbacks, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return MessagesTabContent$lambda$8;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Unit unit3 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(5004770);
        int i52 = i3 & 112;
        if (i52 != 32) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new MessagesTabScreenKt$MessagesTabContent$2$1(callbacks, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, 6);
        Unit unit22 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(5004770);
        if (i52 != 32) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue2 = new MessagesTabScreenKt$MessagesTabContent$3$1(callbacks, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
        ChatListItemUi selectedChat2 = state.getSelectedChat();
        if (selectedChat2 == null) {
        }
        Boolean valueOf2 = Boolean.valueOf(state.isSingleConversation());
        startRestartGroup.startReplaceGroup(-1633490746);
        z3 = ((i3 & 14) != 4) | (i52 != 32);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue3 = new MessagesTabScreenKt$MessagesTabContent$4$1(state, callbacks, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(chatId, valueOf2, (Function2) rememberedValue3, startRestartGroup, 0);
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        boolean isSingleConversation2 = state.isSingleConversation();
        if (isSingleConversation2) {
        }
        if (z4) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        if (i52 != 32) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.user.compose.messages.MessagesTabScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit MessagesTabContent$lambda$7$lambda$6$lambda$5;
                MessagesTabContent$lambda$7$lambda$6$lambda$5 = MessagesTabScreenKt.MessagesTabContent$lambda$7$lambda$6$lambda$5(UserMessagesCallbacks.this);
                return MessagesTabContent$lambda$7$lambda$6$lambda$5;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        BackHandlerKt.BackHandler(z6, (Function0) rememberedValue4, startRestartGroup, 0, 0);
        if (!z4) {
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function14 = function13;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessagesTabContent$lambda$7$lambda$6$lambda$5(UserMessagesCallbacks userMessagesCallbacks) {
        userMessagesCallbacks.getOnBackFromChat().invoke();
        return Unit.INSTANCE;
    }

    private static final void MessagesTabPreviewList(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1914914369);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1914914369, i, -1, "org.betup.ui.fragment.user.compose.messages.MessagesTabPreviewList (MessagesTabScreen.kt:68)");
            }
            MessagesTabContent(new UserMessagesState(MessagesPreviewData.INSTANCE.getChats(), false, false, false, null, null, false, false, false, false, null, null, 0, false, 16366, null), new UserMessagesCallbacks(null, null, null, null, null, null, null, null, 255, null), null, startRestartGroup, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.messages.MessagesTabScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MessagesTabPreviewList$lambda$9;
                    MessagesTabPreviewList$lambda$9 = MessagesTabScreenKt.MessagesTabPreviewList$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MessagesTabPreviewList$lambda$9;
                }
            });
        }
    }

    private static final void MessagesTabPreviewConversation(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1454385500);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1454385500, i, -1, "org.betup.ui.fragment.user.compose.messages.MessagesTabPreviewConversation (MessagesTabScreen.kt:80)");
            }
            MessagesTabContent(new UserMessagesState(null, false, false, false, null, MessagesPreviewData.INSTANCE.getMessages(), false, false, false, false, "George_123", null, 0, true, 991, null), new UserMessagesCallbacks(null, null, null, null, null, null, null, null, 255, null), null, startRestartGroup, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.user.compose.messages.MessagesTabScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MessagesTabPreviewConversation$lambda$10;
                    MessagesTabPreviewConversation$lambda$10 = MessagesTabScreenKt.MessagesTabPreviewConversation$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MessagesTabPreviewConversation$lambda$10;
                }
            });
        }
    }
}
