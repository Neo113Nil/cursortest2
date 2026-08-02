package com.datadog.android.rum.internal.metric.interactiontonextview;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/metric/interactiontonextview/InternalInteractionContext;", "", "", com.datadog.android.rum.internal.domain.event.RumEventMeta.VIEW_ID_KEY, "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "", "eventCreatedAtNanos", "<init>", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;J)V", "component1$dd_sdk_android_rum_release", "()Ljava/lang/String;", "component2$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "component3$dd_sdk_android_rum_release", "()J", "copy", "(Ljava/lang/String;Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;J)Lcom/datadog/android/rum/internal/metric/interactiontonextview/InternalInteractionContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "getActionType$dd_sdk_android_rum_release", "J", "getEventCreatedAtNanos$dd_sdk_android_rum_release", "Ljava/lang/String;", "getViewId$dd_sdk_android_rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalInteractionContext {
    private final com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionType;
    private final long eventCreatedAtNanos;
    private final java.lang.String viewId;

    public InternalInteractionContext(java.lang.String str, com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionEventActionType, "");
        this.viewId = str;
        this.actionType = actionEventActionType;
        this.eventCreatedAtNanos = j;
    }

    public final java.lang.String getViewId$dd_sdk_android_rum_release() {
        return this.viewId;
    }

    public final com.datadog.android.rum.model.ActionEvent.ActionEventActionType getActionType$dd_sdk_android_rum_release() {
        return this.actionType;
    }

    public final long getEventCreatedAtNanos$dd_sdk_android_rum_release() {
        return this.eventCreatedAtNanos;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.viewId;
        com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType = this.actionType;
        long j = this.eventCreatedAtNanos;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InternalInteractionContext(viewId=");
        sb.append(str);
        sb.append(", actionType=");
        sb.append(actionEventActionType);
        sb.append(", eventCreatedAtNanos=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.viewId.hashCode() * 31) + this.actionType.hashCode()) * 31) + java.lang.Long.hashCode(this.eventCreatedAtNanos);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext)) {
            return false;
        }
        com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext internalInteractionContext = (com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.viewId, internalInteractionContext.viewId) && this.actionType == internalInteractionContext.actionType && this.eventCreatedAtNanos == internalInteractionContext.eventCreatedAtNanos;
    }

    public final com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext copy(java.lang.String viewId, com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionType, long eventCreatedAtNanos) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        return new com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext(viewId, actionType, eventCreatedAtNanos);
    }

    /* renamed from: component3$dd_sdk_android_rum_release, reason: from getter */
    public final long getEventCreatedAtNanos() {
        return this.eventCreatedAtNanos;
    }

    /* renamed from: component2$dd_sdk_android_rum_release, reason: from getter */
    public final com.datadog.android.rum.model.ActionEvent.ActionEventActionType getActionType() {
        return this.actionType;
    }

    /* renamed from: component1$dd_sdk_android_rum_release, reason: from getter */
    public final java.lang.String getViewId() {
        return this.viewId;
    }

    public static /* synthetic */ com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext copy$default(com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext internalInteractionContext, java.lang.String str, com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = internalInteractionContext.viewId;
        }
        if ((i & 2) != 0) {
            actionEventActionType = internalInteractionContext.actionType;
        }
        if ((i & 4) != 0) {
            j = internalInteractionContext.eventCreatedAtNanos;
        }
        return internalInteractionContext.copy(str, actionEventActionType, j);
    }
}
