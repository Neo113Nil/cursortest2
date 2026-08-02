package com.datadog.android.core.feature.event;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/datadog/android/core/feature/event/ThreadDump;", "", "", "name", "state", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "", "crashed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/datadog/android/core/feature/event/ThreadDump;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "getCrashed", "Ljava/lang/String;", "getName", "getStack", "getState"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ThreadDump {
    private final boolean crashed;
    private final java.lang.String name;
    private final java.lang.String stack;
    private final java.lang.String state;

    public ThreadDump(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.name = str;
        this.state = str2;
        this.stack = str3;
        this.crashed = z;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    public final java.lang.String getStack() {
        return this.stack;
    }

    public final boolean getCrashed() {
        return this.crashed;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.state;
        java.lang.String str3 = this.stack;
        boolean z = this.crashed;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreadDump(name=");
        sb.append(str);
        sb.append(", state=");
        sb.append(str2);
        sb.append(", stack=");
        sb.append(str3);
        sb.append(", crashed=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.name.hashCode() * 31) + this.state.hashCode()) * 31) + this.stack.hashCode()) * 31) + java.lang.Boolean.hashCode(this.crashed);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.core.feature.event.ThreadDump)) {
            return false;
        }
        com.datadog.android.core.feature.event.ThreadDump threadDump = (com.datadog.android.core.feature.event.ThreadDump) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, threadDump.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, threadDump.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.stack, threadDump.stack) && this.crashed == threadDump.crashed;
    }

    public final com.datadog.android.core.feature.event.ThreadDump copy(java.lang.String name2, java.lang.String state, java.lang.String stack, boolean crashed) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stack, "");
        return new com.datadog.android.core.feature.event.ThreadDump(name2, state, stack, crashed);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCrashed() {
        return this.crashed;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getStack() {
        return this.stack;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.datadog.android.core.feature.event.ThreadDump copy$default(com.datadog.android.core.feature.event.ThreadDump threadDump, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = threadDump.name;
        }
        if ((i & 2) != 0) {
            str2 = threadDump.state;
        }
        if ((i & 4) != 0) {
            str3 = threadDump.stack;
        }
        if ((i & 8) != 0) {
            z = threadDump.crashed;
        }
        return threadDump.copy(str, str2, str3, z);
    }
}
