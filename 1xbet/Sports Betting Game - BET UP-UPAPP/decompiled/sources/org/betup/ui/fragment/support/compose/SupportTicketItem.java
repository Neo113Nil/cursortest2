package org.betup.ui.fragment.support.compose;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SupportModels.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportTicketItem;", "", "chatId", "", "title", "date", "status", "Lorg/betup/ui/fragment/support/compose/TicketStatus;", "hasUnread", "", "lastMessageText", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/fragment/support/compose/TicketStatus;ZLjava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getTitle", "getDate", "getStatus", "()Lorg/betup/ui/fragment/support/compose/TicketStatus;", "getHasUnread", "()Z", "getLastMessageText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportTicketItem {
    public static final int $stable = 0;
    private final String chatId;
    private final String date;
    private final boolean hasUnread;
    private final String lastMessageText;
    private final TicketStatus status;
    private final String title;

    public static /* synthetic */ SupportTicketItem copy$default(SupportTicketItem supportTicketItem, String str, String str2, String str3, TicketStatus ticketStatus, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportTicketItem.chatId;
        }
        if ((i & 2) != 0) {
            str2 = supportTicketItem.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = supportTicketItem.date;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            ticketStatus = supportTicketItem.status;
        }
        TicketStatus ticketStatus2 = ticketStatus;
        if ((i & 16) != 0) {
            z = supportTicketItem.hasUnread;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str4 = supportTicketItem.lastMessageText;
        }
        return supportTicketItem.copy(str, str5, str6, ticketStatus2, z2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component4, reason: from getter */
    public final TicketStatus getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasUnread() {
        return this.hasUnread;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLastMessageText() {
        return this.lastMessageText;
    }

    public final SupportTicketItem copy(String chatId, String title, String date, TicketStatus status, boolean hasUnread, String lastMessageText) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(status, "status");
        return new SupportTicketItem(chatId, title, date, status, hasUnread, lastMessageText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportTicketItem)) {
            return false;
        }
        SupportTicketItem supportTicketItem = (SupportTicketItem) other;
        return Intrinsics.areEqual(this.chatId, supportTicketItem.chatId) && Intrinsics.areEqual(this.title, supportTicketItem.title) && Intrinsics.areEqual(this.date, supportTicketItem.date) && this.status == supportTicketItem.status && this.hasUnread == supportTicketItem.hasUnread && Intrinsics.areEqual(this.lastMessageText, supportTicketItem.lastMessageText);
    }

    public int hashCode() {
        int hashCode = ((((((((this.chatId.hashCode() * 31) + this.title.hashCode()) * 31) + this.date.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.hasUnread)) * 31;
        String str = this.lastMessageText;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SupportTicketItem(chatId=" + this.chatId + ", title=" + this.title + ", date=" + this.date + ", status=" + this.status + ", hasUnread=" + this.hasUnread + ", lastMessageText=" + this.lastMessageText + ")";
    }

    public SupportTicketItem(String chatId, String title, String date, TicketStatus status, boolean z, String str) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(status, "status");
        this.chatId = chatId;
        this.title = title;
        this.date = date;
        this.status = status;
        this.hasUnread = z;
        this.lastMessageText = str;
    }

    public /* synthetic */ SupportTicketItem(String str, String str2, String str3, TicketStatus ticketStatus, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, ticketStatus, z, (i & 32) != 0 ? null : str4);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDate() {
        return this.date;
    }

    public final TicketStatus getStatus() {
        return this.status;
    }

    public final boolean getHasUnread() {
        return this.hasUnread;
    }

    public final String getLastMessageText() {
        return this.lastMessageText;
    }
}
