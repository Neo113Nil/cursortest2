package com.datadog.android.rum.internal.monitor;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "", "<init>", "()V", "Action", "Error", "FrozenFrame", "LongTask", "Resource", "View", "Lcom/datadog/android/rum/internal/monitor/StorageEvent$Action;", "Lcom/datadog/android/rum/internal/monitor/StorageEvent$Error;", "Lcom/datadog/android/rum/internal/monitor/StorageEvent$FrozenFrame;", "Lcom/datadog/android/rum/internal/monitor/StorageEvent$LongTask;", "Lcom/datadog/android/rum/internal/monitor/StorageEvent$Resource;", "Lcom/datadog/android/rum/internal/monitor/StorageEvent$View;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class StorageEvent {

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/StorageEvent$View;", "Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class View extends com.datadog.android.rum.internal.monitor.StorageEvent {
        public static final com.datadog.android.rum.internal.monitor.StorageEvent.View INSTANCE = new com.datadog.android.rum.internal.monitor.StorageEvent.View();

        private View() {
            super(null);
        }
    }

    private StorageEvent() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/StorageEvent$Action;", "Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "", "frustrationCount", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "type", "", "eventEndTimestampInNanos", "<init>", "(ILcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;J)V", "component1", "()I", "component2", "()Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "component3", "()J", "copy", "(ILcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;J)Lcom/datadog/android/rum/internal/monitor/StorageEvent$Action;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "J", "getEventEndTimestampInNanos", com.visa.cbp.getEncExpo.warmup, "getFrustrationCount", "Lcom/datadog/android/rum/model/ActionEvent$ActionEventActionType;", "getType"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Action extends com.datadog.android.rum.internal.monitor.StorageEvent {
        private final long eventEndTimestampInNanos;
        private final int frustrationCount;
        private final com.datadog.android.rum.model.ActionEvent.ActionEventActionType type;

        public final int getFrustrationCount() {
            return this.frustrationCount;
        }

        public final com.datadog.android.rum.model.ActionEvent.ActionEventActionType getType() {
            return this.type;
        }

        public final long getEventEndTimestampInNanos() {
            return this.eventEndTimestampInNanos;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(int i, com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionEventActionType, "");
            this.frustrationCount = i;
            this.type = actionEventActionType;
            this.eventEndTimestampInNanos = j;
        }

        public final java.lang.String toString() {
            int i = this.frustrationCount;
            com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType = this.type;
            long j = this.eventEndTimestampInNanos;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Action(frustrationCount=");
            sb.append(i);
            sb.append(", type=");
            sb.append(actionEventActionType);
            sb.append(", eventEndTimestampInNanos=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((java.lang.Integer.hashCode(this.frustrationCount) * 31) + this.type.hashCode()) * 31) + java.lang.Long.hashCode(this.eventEndTimestampInNanos);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.monitor.StorageEvent.Action)) {
                return false;
            }
            com.datadog.android.rum.internal.monitor.StorageEvent.Action action = (com.datadog.android.rum.internal.monitor.StorageEvent.Action) other;
            return this.frustrationCount == action.frustrationCount && this.type == action.type && this.eventEndTimestampInNanos == action.eventEndTimestampInNanos;
        }

        public final com.datadog.android.rum.internal.monitor.StorageEvent.Action copy(int frustrationCount, com.datadog.android.rum.model.ActionEvent.ActionEventActionType type, long eventEndTimestampInNanos) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            return new com.datadog.android.rum.internal.monitor.StorageEvent.Action(frustrationCount, type, eventEndTimestampInNanos);
        }

        /* renamed from: component3, reason: from getter */
        public final long getEventEndTimestampInNanos() {
            return this.eventEndTimestampInNanos;
        }

        /* renamed from: component2, reason: from getter */
        public final com.datadog.android.rum.model.ActionEvent.ActionEventActionType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final int getFrustrationCount() {
            return this.frustrationCount;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.monitor.StorageEvent.Action copy$default(com.datadog.android.rum.internal.monitor.StorageEvent.Action action, int i, com.datadog.android.rum.model.ActionEvent.ActionEventActionType actionEventActionType, long j, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = action.frustrationCount;
            }
            if ((i2 & 2) != 0) {
                actionEventActionType = action.type;
            }
            if ((i2 & 4) != 0) {
                j = action.eventEndTimestampInNanos;
            }
            return action.copy(i, actionEventActionType, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/StorageEvent$Resource;", "Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "", "resourceId", "", "resourceStopTimestampInNanos", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/datadog/android/rum/internal/monitor/StorageEvent$Resource;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getResourceId", "J", "getResourceStopTimestampInNanos"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Resource extends com.datadog.android.rum.internal.monitor.StorageEvent {
        private final java.lang.String resourceId;
        private final long resourceStopTimestampInNanos;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Resource(java.lang.String str, long j) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.resourceId = str;
            this.resourceStopTimestampInNanos = j;
        }

        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        public final long getResourceStopTimestampInNanos() {
            return this.resourceStopTimestampInNanos;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.resourceId;
            long j = this.resourceStopTimestampInNanos;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Resource(resourceId=");
            sb.append(str);
            sb.append(", resourceStopTimestampInNanos=");
            sb.append(j);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.resourceId.hashCode() * 31) + java.lang.Long.hashCode(this.resourceStopTimestampInNanos);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.monitor.StorageEvent.Resource)) {
                return false;
            }
            com.datadog.android.rum.internal.monitor.StorageEvent.Resource resource = (com.datadog.android.rum.internal.monitor.StorageEvent.Resource) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.resourceId, resource.resourceId) && this.resourceStopTimestampInNanos == resource.resourceStopTimestampInNanos;
        }

        public final com.datadog.android.rum.internal.monitor.StorageEvent.Resource copy(java.lang.String resourceId, long resourceStopTimestampInNanos) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceId, "");
            return new com.datadog.android.rum.internal.monitor.StorageEvent.Resource(resourceId, resourceStopTimestampInNanos);
        }

        /* renamed from: component2, reason: from getter */
        public final long getResourceStopTimestampInNanos() {
            return this.resourceStopTimestampInNanos;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.monitor.StorageEvent.Resource copy$default(com.datadog.android.rum.internal.monitor.StorageEvent.Resource resource, java.lang.String str, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = resource.resourceId;
            }
            if ((i & 2) != 0) {
                j = resource.resourceStopTimestampInNanos;
            }
            return resource.copy(str, j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/StorageEvent$Error;", "Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "", "resourceId", "", "resourceStopTimestampInNanos", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/datadog/android/rum/internal/monitor/StorageEvent$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getResourceId", "Ljava/lang/Long;", "getResourceStopTimestampInNanos"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Error extends com.datadog.android.rum.internal.monitor.StorageEvent {
        private final java.lang.String resourceId;
        private final java.lang.Long resourceStopTimestampInNanos;

        public Error(java.lang.String str, java.lang.Long l) {
            super(null);
            this.resourceId = str;
            this.resourceStopTimestampInNanos = l;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l);
        }

        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        public final java.lang.Long getResourceStopTimestampInNanos() {
            return this.resourceStopTimestampInNanos;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.resourceId;
            java.lang.Long l = this.resourceStopTimestampInNanos;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(resourceId=");
            sb.append(str);
            sb.append(", resourceStopTimestampInNanos=");
            sb.append(l);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.resourceId;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.Long l = this.resourceStopTimestampInNanos;
            return (hashCode * 31) + (l != null ? l.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.datadog.android.rum.internal.monitor.StorageEvent.Error)) {
                return false;
            }
            com.datadog.android.rum.internal.monitor.StorageEvent.Error error = (com.datadog.android.rum.internal.monitor.StorageEvent.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.resourceId, error.resourceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resourceStopTimestampInNanos, error.resourceStopTimestampInNanos);
        }

        public final com.datadog.android.rum.internal.monitor.StorageEvent.Error copy(java.lang.String resourceId, java.lang.Long resourceStopTimestampInNanos) {
            return new com.datadog.android.rum.internal.monitor.StorageEvent.Error(resourceId, resourceStopTimestampInNanos);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Long getResourceStopTimestampInNanos() {
            return this.resourceStopTimestampInNanos;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getResourceId() {
            return this.resourceId;
        }

        public static /* synthetic */ com.datadog.android.rum.internal.monitor.StorageEvent.Error copy$default(com.datadog.android.rum.internal.monitor.StorageEvent.Error error, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.resourceId;
            }
            if ((i & 2) != 0) {
                l = error.resourceStopTimestampInNanos;
            }
            return error.copy(str, l);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/StorageEvent$LongTask;", "Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LongTask extends com.datadog.android.rum.internal.monitor.StorageEvent {
        public static final com.datadog.android.rum.internal.monitor.StorageEvent.LongTask INSTANCE = new com.datadog.android.rum.internal.monitor.StorageEvent.LongTask();

        private LongTask() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/StorageEvent$FrozenFrame;", "Lcom/datadog/android/rum/internal/monitor/StorageEvent;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FrozenFrame extends com.datadog.android.rum.internal.monitor.StorageEvent {
        public static final com.datadog.android.rum.internal.monitor.StorageEvent.FrozenFrame INSTANCE = new com.datadog.android.rum.internal.monitor.StorageEvent.FrozenFrame();

        private FrozenFrame() {
            super(null);
        }
    }

    public /* synthetic */ StorageEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
