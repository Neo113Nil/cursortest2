package com.datadog.android.telemetry.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/datadog/android/telemetry/internal/TelemetryEventId;", "", "Lcom/datadog/android/telemetry/internal/TelemetryType;", "type", "", "message", "kind", "<init>", "(Lcom/datadog/android/telemetry/internal/TelemetryType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/datadog/android/telemetry/internal/TelemetryType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/datadog/android/telemetry/internal/TelemetryType;Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/telemetry/internal/TelemetryEventId;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getKind", "getMessage", "Lcom/datadog/android/telemetry/internal/TelemetryType;", "getType"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TelemetryEventId {
    private final java.lang.String kind;
    private final java.lang.String message;
    private final com.datadog.android.telemetry.internal.TelemetryType type;

    public TelemetryEventId(com.datadog.android.telemetry.internal.TelemetryType telemetryType, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = telemetryType;
        this.message = str;
        this.kind = str2;
    }

    public final com.datadog.android.telemetry.internal.TelemetryType getType() {
        return this.type;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String getKind() {
        return this.kind;
    }

    public final java.lang.String toString() {
        com.datadog.android.telemetry.internal.TelemetryType telemetryType = this.type;
        java.lang.String str = this.message;
        java.lang.String str2 = this.kind;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TelemetryEventId(type=");
        sb.append(telemetryType);
        sb.append(", message=");
        sb.append(str);
        sb.append(", kind=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode();
        int hashCode2 = this.message.hashCode();
        java.lang.String str = this.kind;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.telemetry.internal.TelemetryEventId)) {
            return false;
        }
        com.datadog.android.telemetry.internal.TelemetryEventId telemetryEventId = (com.datadog.android.telemetry.internal.TelemetryEventId) other;
        return this.type == telemetryEventId.type && kotlin.jvm.internal.Intrinsics.areEqual(this.message, telemetryEventId.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.kind, telemetryEventId.kind);
    }

    public final com.datadog.android.telemetry.internal.TelemetryEventId copy(com.datadog.android.telemetry.internal.TelemetryType type, java.lang.String message, java.lang.String kind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.datadog.android.telemetry.internal.TelemetryEventId(type, message, kind);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getKind() {
        return this.kind;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final com.datadog.android.telemetry.internal.TelemetryType getType() {
        return this.type;
    }

    public static /* synthetic */ com.datadog.android.telemetry.internal.TelemetryEventId copy$default(com.datadog.android.telemetry.internal.TelemetryEventId telemetryEventId, com.datadog.android.telemetry.internal.TelemetryType telemetryType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            telemetryType = telemetryEventId.type;
        }
        if ((i & 2) != 0) {
            str = telemetryEventId.message;
        }
        if ((i & 4) != 0) {
            str2 = telemetryEventId.kind;
        }
        return telemetryEventId.copy(telemetryType, str, str2);
    }
}
