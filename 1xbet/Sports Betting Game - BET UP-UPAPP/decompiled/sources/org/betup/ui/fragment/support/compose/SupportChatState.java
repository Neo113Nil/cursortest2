package org.betup.ui.fragment.support.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.user.compose.messages.MessageBubbleUi;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SupportModels.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jw\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018¨\u0006."}, d2 = {"Lorg/betup/ui/fragment/support/compose/SupportChatState;", "", "isLoading", "", "isLoadingMore", "hasMore", "isSending", "messages", "", "Lorg/betup/ui/fragment/user/compose/messages/MessageBubbleUi;", "agentName", "", "agentAvatarUrl", "statusText", "statusType", "Lorg/betup/ui/fragment/support/compose/SupportStatusType;", "errorMessage", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ZZZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/betup/ui/fragment/support/compose/SupportStatusType;Ljava/lang/String;)V", "()Z", "getHasMore", "getMessages", "()Ljava/util/List;", "getAgentName", "()Ljava/lang/String;", "getAgentAvatarUrl", "getStatusText", "getStatusType", "()Lorg/betup/ui/fragment/support/compose/SupportStatusType;", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SupportChatState {
    public static final int $stable = 0;
    private final String agentAvatarUrl;
    private final String agentName;
    private final String errorMessage;
    private final boolean hasMore;
    private final boolean isLoading;
    private final boolean isLoadingMore;
    private final boolean isSending;
    private final List<MessageBubbleUi> messages;
    private final String statusText;
    private final SupportStatusType statusType;

    public SupportChatState() {
        this(false, false, false, false, null, null, null, null, null, null, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component10, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoadingMore() {
        return this.isLoadingMore;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSending() {
        return this.isSending;
    }

    public final List<MessageBubbleUi> component5() {
        return this.messages;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAgentName() {
        return this.agentName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAgentAvatarUrl() {
        return this.agentAvatarUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: component9, reason: from getter */
    public final SupportStatusType getStatusType() {
        return this.statusType;
    }

    public final SupportChatState copy(boolean isLoading, boolean isLoadingMore, boolean hasMore, boolean isSending, List<MessageBubbleUi> messages, String agentName, String agentAvatarUrl, String statusText, SupportStatusType statusType, String errorMessage) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(agentName, "agentName");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(statusType, "statusType");
        return new SupportChatState(isLoading, isLoadingMore, hasMore, isSending, messages, agentName, agentAvatarUrl, statusText, statusType, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportChatState)) {
            return false;
        }
        SupportChatState supportChatState = (SupportChatState) other;
        return this.isLoading == supportChatState.isLoading && this.isLoadingMore == supportChatState.isLoadingMore && this.hasMore == supportChatState.hasMore && this.isSending == supportChatState.isSending && Intrinsics.areEqual(this.messages, supportChatState.messages) && Intrinsics.areEqual(this.agentName, supportChatState.agentName) && Intrinsics.areEqual(this.agentAvatarUrl, supportChatState.agentAvatarUrl) && Intrinsics.areEqual(this.statusText, supportChatState.statusText) && this.statusType == supportChatState.statusType && Intrinsics.areEqual(this.errorMessage, supportChatState.errorMessage);
    }

    public int hashCode() {
        int hashCode = ((((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isLoadingMore)) * 31) + Boolean.hashCode(this.hasMore)) * 31) + Boolean.hashCode(this.isSending)) * 31) + this.messages.hashCode()) * 31) + this.agentName.hashCode()) * 31;
        String str = this.agentAvatarUrl;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.statusText.hashCode()) * 31) + this.statusType.hashCode()) * 31;
        String str2 = this.errorMessage;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SupportChatState(isLoading=" + this.isLoading + ", isLoadingMore=" + this.isLoadingMore + ", hasMore=" + this.hasMore + ", isSending=" + this.isSending + ", messages=" + this.messages + ", agentName=" + this.agentName + ", agentAvatarUrl=" + this.agentAvatarUrl + ", statusText=" + this.statusText + ", statusType=" + this.statusType + ", errorMessage=" + this.errorMessage + ")";
    }

    public SupportChatState(boolean z, boolean z2, boolean z3, boolean z4, List<MessageBubbleUi> messages, String agentName, String str, String statusText, SupportStatusType statusType, String str2) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(agentName, "agentName");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(statusType, "statusType");
        this.isLoading = z;
        this.isLoadingMore = z2;
        this.hasMore = z3;
        this.isSending = z4;
        this.messages = messages;
        this.agentName = agentName;
        this.agentAvatarUrl = str;
        this.statusText = statusText;
        this.statusType = statusType;
        this.errorMessage = str2;
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

    public /* synthetic */ SupportChatState(boolean z, boolean z2, boolean z3, boolean z4, List list, String str, String str2, String str3, SupportStatusType supportStatusType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? null : str2, (i & 128) == 0 ? str3 : "", (i & 256) != 0 ? SupportStatusType.OFFLINE : supportStatusType, (i & 512) == 0 ? str4 : null);
    }

    public final List<MessageBubbleUi> getMessages() {
        return this.messages;
    }

    public final String getAgentName() {
        return this.agentName;
    }

    public final String getAgentAvatarUrl() {
        return this.agentAvatarUrl;
    }

    public final String getStatusText() {
        return this.statusText;
    }

    public final SupportStatusType getStatusType() {
        return this.statusType;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
