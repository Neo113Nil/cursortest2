package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/Conversation;", "", "", "Lcom/paypal/oslo/feature/searchandintelligence/ui/ChatMessage;", "messages", "", "id", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/searchandintelligence/ui/Conversation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getMessages", "Ljava/lang/String;", "getId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Conversation {
    public static final int $stable = 8;
    private final java.lang.String id;
    private final java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage> messages;

    /* JADX WARN: Multi-variable type inference failed */
    public Conversation(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage> list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.messages = list;
        this.id = str;
    }

    public final java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage> getMessages() {
        return this.messages;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Conversation(java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str);
        if ((i & 2) != 0) {
            str = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage> list = this.messages;
        java.lang.String str = this.id;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Conversation(messages=");
        sb.append(list);
        sb.append(", id=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.messages.hashCode() * 31) + this.id.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.ui.Conversation)) {
            return false;
        }
        com.paypal.oslo.feature.searchandintelligence.ui.Conversation conversation = (com.paypal.oslo.feature.searchandintelligence.ui.Conversation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.messages, conversation.messages) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, conversation.id);
    }

    public final com.paypal.oslo.feature.searchandintelligence.ui.Conversation copy(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage> messages, java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messages, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.searchandintelligence.ui.Conversation(messages, id);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public final java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.ChatMessage> component1() {
        return this.messages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.ui.Conversation copy$default(com.paypal.oslo.feature.searchandintelligence.ui.Conversation conversation, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = conversation.messages;
        }
        if ((i & 2) != 0) {
            str = conversation.id;
        }
        return conversation.copy(list, str);
    }
}
