package org.betup.ui.fragment.support.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.user.compose.messages.MessageBubbleUi;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SupportModels.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jw\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0018R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006-"}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportTicketDetailState;", "", "chatId", "", "openRequestId", "", "ticketTitle", "isLoading", "", "isLoadingMore", "hasMore", "isSending", "isActive", "messages", "", "Lorg/betup/ui/fragment/user/compose/messages/MessageBubbleUi;", "errorMessage", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;JLjava/lang/String;ZZZZZLjava/util/List;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getOpenRequestId", "()J", "getTicketTitle", "()Z", "getHasMore", "getMessages", "()Ljava/util/List;", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportTicketDetailState {
    public static final int $stable = 0;
    private final String chatId;
    private final String errorMessage;
    private final boolean hasMore;
    private final boolean isActive;
    private final boolean isLoading;
    private final boolean isLoadingMore;
    private final boolean isSending;
    private final List<MessageBubbleUi> messages;
    private final long openRequestId;
    private final String ticketTitle;

    public SupportTicketDetailState() {
        this(null, 0L, null, false, false, false, false, false, null, null, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final long getOpenRequestId() {
        return this.openRequestId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTicketTitle() {
        return this.ticketTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsSending() {
        return this.isSending;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final List<MessageBubbleUi> component9() {
        return this.messages;
    }

    public final SupportTicketDetailState copy(String chatId, long openRequestId, String ticketTitle, boolean isLoading, boolean isLoadingMore, boolean hasMore, boolean isSending, boolean isActive, List<MessageBubbleUi> messages, String errorMessage) {
        Intrinsics.checkNotNullParameter(ticketTitle, "ticketTitle");
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new SupportTicketDetailState(chatId, openRequestId, ticketTitle, isLoading, isLoadingMore, hasMore, isSending, isActive, messages, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportTicketDetailState)) {
            return false;
        }
        SupportTicketDetailState supportTicketDetailState = (SupportTicketDetailState) other;
        return Intrinsics.areEqual(this.chatId, supportTicketDetailState.chatId) && this.openRequestId == supportTicketDetailState.openRequestId && Intrinsics.areEqual(this.ticketTitle, supportTicketDetailState.ticketTitle) && this.isLoading == supportTicketDetailState.isLoading && this.isLoadingMore == supportTicketDetailState.isLoadingMore && this.hasMore == supportTicketDetailState.hasMore && this.isSending == supportTicketDetailState.isSending && this.isActive == supportTicketDetailState.isActive && Intrinsics.areEqual(this.messages, supportTicketDetailState.messages) && Intrinsics.areEqual(this.errorMessage, supportTicketDetailState.errorMessage);
    }

    public int hashCode() {
        String str = this.chatId;
        int hashCode = (((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.openRequestId)) * 31) + this.ticketTitle.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isLoadingMore)) * 31) + Boolean.hashCode(this.hasMore)) * 31) + Boolean.hashCode(this.isSending)) * 31) + Boolean.hashCode(this.isActive)) * 31) + this.messages.hashCode()) * 31;
        String str2 = this.errorMessage;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SupportTicketDetailState(chatId=" + this.chatId + ", openRequestId=" + this.openRequestId + ", ticketTitle=" + this.ticketTitle + ", isLoading=" + this.isLoading + ", isLoadingMore=" + this.isLoadingMore + ", hasMore=" + this.hasMore + ", isSending=" + this.isSending + ", isActive=" + this.isActive + ", messages=" + this.messages + ", errorMessage=" + this.errorMessage + ")";
    }

    public SupportTicketDetailState(String str, long j, String ticketTitle, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List<MessageBubbleUi> messages, String str2) {
        Intrinsics.checkNotNullParameter(ticketTitle, "ticketTitle");
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.chatId = str;
        this.openRequestId = j;
        this.ticketTitle = ticketTitle;
        this.isLoading = z;
        this.isLoadingMore = z2;
        this.hasMore = z3;
        this.isSending = z4;
        this.isActive = z5;
        this.messages = messages;
        this.errorMessage = str2;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final long getOpenRequestId() {
        return this.openRequestId;
    }

    public /* synthetic */ SupportTicketDetailState(String str, long j, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? false : z3, (i & 64) == 0 ? z4 : false, (i & 128) != 0 ? true : z5, (i & 256) != 0 ? CollectionsKt.emptyList() : list, (i & 512) == 0 ? str3 : null);
    }

    public final String getTicketTitle() {
        return this.ticketTitle;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingMore() {
        return this.isLoadingMore;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean isSending() {
        return this.isSending;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final List<MessageBubbleUi> getMessages() {
        return this.messages;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
