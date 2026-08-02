package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatStatus;", "", "canSendMessage", "(Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatStatus;)Z", "isMessageListVisible"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChatUiStateKt {
    public static final boolean canSendMessage(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus chatStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatStatus, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(chatStatus, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Welcome.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(chatStatus, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.MessageReceived.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(chatStatus, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.ErrorReceived.INSTANCE)) {
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(chatStatus, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending.INSTANCE) || (chatStatus instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error)) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final boolean isMessageListVisible(com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus chatStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chatStatus, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(chatStatus, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Sending.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(chatStatus, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.MessageReceived.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(chatStatus, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.ErrorReceived.INSTANCE) || (chatStatus instanceof com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Error)) {
            return true;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(chatStatus, com.paypal.oslo.feature.searchandintelligence.ui.ChatStatus.Welcome.INSTANCE)) {
            return false;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
