package com.datadog.android.rum.metric.interactiontonextview;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/datadog/android/rum/metric/interactiontonextview/PreviousViewLastInteractionContext;", "", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "", "eventCreatedAtNanos", "currentViewCreationTimestamp", "<init>", "(Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;JLjava/lang/Long;)V", "component1", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "component2", "()J", "component3", "()Ljava/lang/Long;", "copy", "(Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;JLjava/lang/Long;)Lcom/datadog/android/rum/metric/interactiontonextview/PreviousViewLastInteractionContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "getActionType", "Ljava/lang/Long;", "getCurrentViewCreationTimestamp", "J", "getEventCreatedAtNanos"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PreviousViewLastInteractionContext {
    private final com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionType;
    private final java.lang.Long currentViewCreationTimestamp;
    private final long eventCreatedAtNanos;

    public PreviousViewLastInteractionContext(com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType, long j, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionEventActionType, "");
        this.actionType = actionEventActionType;
        this.eventCreatedAtNanos = j;
        this.currentViewCreationTimestamp = l;
    }

    public final com.datadog.android.rum.model.ActionEvent.ActionEventActionType getActionType() {
        return this.actionType;
    }

    public final long getEventCreatedAtNanos() {
        return this.eventCreatedAtNanos;
    }

    public final java.lang.Long getCurrentViewCreationTimestamp() {
        return this.currentViewCreationTimestamp;
    }

    public final java.lang.String toString() {
        com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType = this.actionType;
        long j = this.eventCreatedAtNanos;
        java.lang.Long l = this.currentViewCreationTimestamp;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PreviousViewLastInteractionContext(actionType=");
        sb.append(actionEventActionType);
        sb.append(", eventCreatedAtNanos=");
        sb.append(j);
        sb.append(", currentViewCreationTimestamp=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.actionType.hashCode();
        int hashCode2 = java.lang.Long.hashCode(this.eventCreatedAtNanos);
        java.lang.Long l = this.currentViewCreationTimestamp;
        return (((hashCode * 31) + hashCode2) * 31) + (l == null ? 0 : l.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext)) {
            return false;
        }
        com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext previousViewLastInteractionContext = (com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext) other;
        return this.actionType == previousViewLastInteractionContext.actionType && this.eventCreatedAtNanos == previousViewLastInteractionContext.eventCreatedAtNanos && kotlin.jvm.internal.Intrinsics.areEqual(this.currentViewCreationTimestamp, previousViewLastInteractionContext.currentViewCreationTimestamp);
    }

    public final com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext copy(com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionType, long eventCreatedAtNanos, java.lang.Long currentViewCreationTimestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        return new com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext(actionType, eventCreatedAtNanos, currentViewCreationTimestamp);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getCurrentViewCreationTimestamp() {
        return this.currentViewCreationTimestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEventCreatedAtNanos() {
        return this.eventCreatedAtNanos;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.rum.model.ActionEvent.ActionEventActionType getActionType() {
        return this.actionType;
    }

    public static /* synthetic */ com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext copy$default(com.datadog.android.rum.metric.interactiontonextview.PreviousViewLastInteractionContext previousViewLastInteractionContext, com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType, long j, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            actionEventActionType = previousViewLastInteractionContext.actionType;
        }
        if ((i & 2) != 0) {
            j = previousViewLastInteractionContext.eventCreatedAtNanos;
        }
        if ((i & 4) != 0) {
            l = previousViewLastInteractionContext.currentViewCreationTimestamp;
        }
        return previousViewLastInteractionContext.copy(actionEventActionType, j, l);
    }
}
