package org.betup.ui.fragment.support.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SupportModels.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003J\t\u0010,\u001a\u00020\u0012HÆ\u0003J_\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00063"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportUiState;", "", "selectedTabIndex", "", "tabs", "", "", "faqState", "Lorg/betup/ui/fragment/support/compose/SupportFaqState;", "chatState", "Lorg/betup/ui/fragment/support/compose/SupportChatState;", "feedbackState", "Lorg/betup/ui/fragment/support/compose/SupportFeedbackState;", "ticketListState", "Lorg/betup/ui/fragment/support/compose/SupportTicketListState;", "ticketDetailState", "Lorg/betup/ui/fragment/support/compose/SupportTicketDetailState;", "myDataState", "Lorg/betup/ui/fragment/support/compose/MyDataState;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/util/List;Lorg/betup/ui/fragment/support/compose/SupportFaqState;Lorg/betup/ui/fragment/support/compose/SupportChatState;Lorg/betup/ui/fragment/support/compose/SupportFeedbackState;Lorg/betup/ui/fragment/support/compose/SupportTicketListState;Lorg/betup/ui/fragment/support/compose/SupportTicketDetailState;Lorg/betup/ui/fragment/support/compose/MyDataState;)V", "getSelectedTabIndex", "()I", "getTabs", "()Ljava/util/List;", "getFaqState", "()Lorg/betup/ui/fragment/support/compose/SupportFaqState;", "getChatState", "()Lorg/betup/ui/fragment/support/compose/SupportChatState;", "getFeedbackState", "()Lorg/betup/ui/fragment/support/compose/SupportFeedbackState;", "getTicketListState", "()Lorg/betup/ui/fragment/support/compose/SupportTicketListState;", "getTicketDetailState", "()Lorg/betup/ui/fragment/support/compose/SupportTicketDetailState;", "getMyDataState", "()Lorg/betup/ui/fragment/support/compose/MyDataState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportUiState {
    public static final int $stable = 0;
    private final SupportChatState chatState;
    private final SupportFaqState faqState;
    private final SupportFeedbackState feedbackState;
    private final MyDataState myDataState;
    private final int selectedTabIndex;
    private final List<String> tabs;
    private final SupportTicketDetailState ticketDetailState;
    private final SupportTicketListState ticketListState;

    public SupportUiState() {
        this(0, null, null, null, null, null, null, null, 255, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final List<String> component2() {
        return this.tabs;
    }

    /* renamed from: component3, reason: from getter */
    public final SupportFaqState getFaqState() {
        return this.faqState;
    }

    /* renamed from: component4, reason: from getter */
    public final SupportChatState getChatState() {
        return this.chatState;
    }

    /* renamed from: component5, reason: from getter */
    public final SupportFeedbackState getFeedbackState() {
        return this.feedbackState;
    }

    /* renamed from: component6, reason: from getter */
    public final SupportTicketListState getTicketListState() {
        return this.ticketListState;
    }

    /* renamed from: component7, reason: from getter */
    public final SupportTicketDetailState getTicketDetailState() {
        return this.ticketDetailState;
    }

    /* renamed from: component8, reason: from getter */
    public final MyDataState getMyDataState() {
        return this.myDataState;
    }

    public final SupportUiState copy(int selectedTabIndex, List<String> tabs, SupportFaqState faqState, SupportChatState chatState, SupportFeedbackState feedbackState, SupportTicketListState ticketListState, SupportTicketDetailState ticketDetailState, MyDataState myDataState) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(faqState, "faqState");
        Intrinsics.checkNotNullParameter(chatState, "chatState");
        Intrinsics.checkNotNullParameter(feedbackState, "feedbackState");
        Intrinsics.checkNotNullParameter(ticketListState, "ticketListState");
        Intrinsics.checkNotNullParameter(ticketDetailState, "ticketDetailState");
        Intrinsics.checkNotNullParameter(myDataState, "myDataState");
        return new SupportUiState(selectedTabIndex, tabs, faqState, chatState, feedbackState, ticketListState, ticketDetailState, myDataState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportUiState)) {
            return false;
        }
        SupportUiState supportUiState = (SupportUiState) other;
        return this.selectedTabIndex == supportUiState.selectedTabIndex && Intrinsics.areEqual(this.tabs, supportUiState.tabs) && Intrinsics.areEqual(this.faqState, supportUiState.faqState) && Intrinsics.areEqual(this.chatState, supportUiState.chatState) && Intrinsics.areEqual(this.feedbackState, supportUiState.feedbackState) && Intrinsics.areEqual(this.ticketListState, supportUiState.ticketListState) && Intrinsics.areEqual(this.ticketDetailState, supportUiState.ticketDetailState) && Intrinsics.areEqual(this.myDataState, supportUiState.myDataState);
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.selectedTabIndex) * 31) + this.tabs.hashCode()) * 31) + this.faqState.hashCode()) * 31) + this.chatState.hashCode()) * 31) + this.feedbackState.hashCode()) * 31) + this.ticketListState.hashCode()) * 31) + this.ticketDetailState.hashCode()) * 31) + this.myDataState.hashCode();
    }

    public String toString() {
        return "SupportUiState(selectedTabIndex=" + this.selectedTabIndex + ", tabs=" + this.tabs + ", faqState=" + this.faqState + ", chatState=" + this.chatState + ", feedbackState=" + this.feedbackState + ", ticketListState=" + this.ticketListState + ", ticketDetailState=" + this.ticketDetailState + ", myDataState=" + this.myDataState + ")";
    }

    public SupportUiState(int i, List<String> tabs, SupportFaqState faqState, SupportChatState chatState, SupportFeedbackState feedbackState, SupportTicketListState ticketListState, SupportTicketDetailState ticketDetailState, MyDataState myDataState) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(faqState, "faqState");
        Intrinsics.checkNotNullParameter(chatState, "chatState");
        Intrinsics.checkNotNullParameter(feedbackState, "feedbackState");
        Intrinsics.checkNotNullParameter(ticketListState, "ticketListState");
        Intrinsics.checkNotNullParameter(ticketDetailState, "ticketDetailState");
        Intrinsics.checkNotNullParameter(myDataState, "myDataState");
        this.selectedTabIndex = i;
        this.tabs = tabs;
        this.faqState = faqState;
        this.chatState = chatState;
        this.feedbackState = feedbackState;
        this.ticketListState = ticketListState;
        this.ticketDetailState = ticketDetailState;
        this.myDataState = myDataState;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public /* synthetic */ SupportUiState(int i, List list, SupportFaqState supportFaqState, SupportChatState supportChatState, SupportFeedbackState supportFeedbackState, SupportTicketListState supportTicketListState, SupportTicketDetailState supportTicketDetailState, MyDataState myDataState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? new SupportFaqState(false, null, null, 7, null) : supportFaqState, (i2 & 8) != 0 ? new SupportChatState(false, false, false, false, null, null, null, null, null, null, 1023, null) : supportChatState, (i2 & 16) != 0 ? new SupportFeedbackState(null, 0, null, null, false, false, null, 127, null) : supportFeedbackState, (i2 & 32) != 0 ? new SupportTicketListState(false, null, null, 7, null) : supportTicketListState, (i2 & 64) != 0 ? new SupportTicketDetailState(null, 0L, null, false, false, false, false, false, null, null, 1023, null) : supportTicketDetailState, (i2 & 128) != 0 ? new MyDataState(false, false, null, null, false, false, null, false, 255, null) : myDataState);
    }

    public final List<String> getTabs() {
        return this.tabs;
    }

    public final SupportFaqState getFaqState() {
        return this.faqState;
    }

    public final SupportChatState getChatState() {
        return this.chatState;
    }

    public final SupportFeedbackState getFeedbackState() {
        return this.feedbackState;
    }

    public final SupportTicketListState getTicketListState() {
        return this.ticketListState;
    }

    public final SupportTicketDetailState getTicketDetailState() {
        return this.ticketDetailState;
    }

    public final MyDataState getMyDataState() {
        return this.myDataState;
    }
}
