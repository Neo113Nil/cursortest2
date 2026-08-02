package com.datadog.android.internal.flags;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/datadog/android/internal/flags/RumFlagEvaluationMessage;", "", "", "flagKey", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/datadog/android/internal/flags/RumFlagEvaluationMessage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFlagKey", "Ljava/lang/Object;", "getValue"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RumFlagEvaluationMessage {
    private final java.lang.String flagKey;
    private final java.lang.Object value;

    public RumFlagEvaluationMessage(java.lang.String str, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.flagKey = str;
        this.value = obj;
    }

    public final java.lang.String getFlagKey() {
        return this.flagKey;
    }

    public final java.lang.Object getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.flagKey;
        java.lang.Object obj = this.value;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RumFlagEvaluationMessage(flagKey=");
        sb.append(str);
        sb.append(", value=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.flagKey.hashCode() * 31) + this.value.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.internal.flags.RumFlagEvaluationMessage)) {
            return false;
        }
        com.datadog.android.internal.flags.RumFlagEvaluationMessage rumFlagEvaluationMessage = (com.datadog.android.internal.flags.RumFlagEvaluationMessage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flagKey, rumFlagEvaluationMessage.flagKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, rumFlagEvaluationMessage.value);
    }

    public final com.datadog.android.internal.flags.RumFlagEvaluationMessage copy(java.lang.String flagKey, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        return new com.datadog.android.internal.flags.RumFlagEvaluationMessage(flagKey, value);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getValue() {
        return this.value;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFlagKey() {
        return this.flagKey;
    }

    public static /* synthetic */ com.datadog.android.internal.flags.RumFlagEvaluationMessage copy$default(com.datadog.android.internal.flags.RumFlagEvaluationMessage rumFlagEvaluationMessage, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = rumFlagEvaluationMessage.flagKey;
        }
        if ((i & 2) != 0) {
            obj = rumFlagEvaluationMessage.value;
        }
        return rumFlagEvaluationMessage.copy(str, obj);
    }
}
