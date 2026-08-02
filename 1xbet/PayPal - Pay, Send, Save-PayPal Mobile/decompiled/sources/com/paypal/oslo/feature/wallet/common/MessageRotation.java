package com.paypal.oslo.feature.wallet.common;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/MessageRotation;", "", "", "intervalMs", "", "", "messages", "<init>", "(JLjava/util/List;)V", "component1", "()J", "component2", "()Ljava/util/List;", "copy", "(JLjava/util/List;)Lcom/paypal/oslo/feature/wallet/common/MessageRotation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getIntervalMs", "Ljava/util/List;", "getMessages"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MessageRotation {
    public static final int $stable = 8;
    private final long intervalMs;
    private final java.util.List<java.lang.Integer> messages;

    public MessageRotation(long j, java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.intervalMs = j;
        this.messages = list;
    }

    public final long getIntervalMs() {
        return this.intervalMs;
    }

    public final java.util.List<java.lang.Integer> getMessages() {
        return this.messages;
    }

    public final java.lang.String toString() {
        long j = this.intervalMs;
        java.util.List<java.lang.Integer> list = this.messages;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MessageRotation(intervalMs=");
        sb.append(j);
        sb.append(", messages=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Long.hashCode(this.intervalMs) * 31) + this.messages.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.common.MessageRotation)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.common.MessageRotation messageRotation = (com.paypal.oslo.feature.wallet.common.MessageRotation) other;
        return this.intervalMs == messageRotation.intervalMs && kotlin.jvm.internal.Intrinsics.areEqual(this.messages, messageRotation.messages);
    }

    public final com.paypal.oslo.feature.wallet.common.MessageRotation copy(long intervalMs, java.util.List<java.lang.Integer> messages) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messages, "");
        return new com.paypal.oslo.feature.wallet.common.MessageRotation(intervalMs, messages);
    }

    public final java.util.List<java.lang.Integer> component2() {
        return this.messages;
    }

    /* renamed from: component1, reason: from getter */
    public final long getIntervalMs() {
        return this.intervalMs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.common.MessageRotation copy$default(com.paypal.oslo.feature.wallet.common.MessageRotation messageRotation, long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = messageRotation.intervalMs;
        }
        if ((i & 2) != 0) {
            list = messageRotation.messages;
        }
        return messageRotation.copy(j, list);
    }
}
