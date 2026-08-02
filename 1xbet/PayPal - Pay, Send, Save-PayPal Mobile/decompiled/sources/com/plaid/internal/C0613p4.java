package com.plaid.internal;

/* renamed from: com.plaid.internal.p4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0613p4 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6530a;
    public final long b;
    public final long c;

    /* renamed from: com.plaid.internal.p4$a */
    public static final class a {
        public static com.plaid.internal.C0613p4 a(com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions common$PollingOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(common$PollingOptions, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(common$PollingOptions, com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions.getDefaultInstance())) {
                com.plaid.internal.C0452a6.a.b(com.plaid.internal.C0452a6.f5996a, "No polling options received");
                return new com.plaid.internal.C0613p4(false, common$PollingOptions.getIntervalMs() > 0 ? common$PollingOptions.getIntervalMs() : 500L, common$PollingOptions.getMaxDurationMs() > 0 ? common$PollingOptions.getMaxDurationMs() : 5000L);
            }
            if (common$PollingOptions.getIntervalMs() <= 0 || common$PollingOptions.getMaxDurationMs() <= 0) {
                com.plaid.internal.C0452a6.a aVar = com.plaid.internal.C0452a6.f5996a;
                int maxDurationMs = common$PollingOptions.getMaxDurationMs();
                int intervalMs = common$PollingOptions.getIntervalMs();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid polling options received - duration: ");
                sb.append(maxDurationMs);
                sb.append(" interval: ");
                sb.append(intervalMs);
                com.plaid.internal.C0452a6.a.b(aVar, sb.toString());
            }
            return new com.plaid.internal.C0613p4(true, common$PollingOptions.getIntervalMs() > 0 ? common$PollingOptions.getIntervalMs() : 500L, common$PollingOptions.getMaxDurationMs() > 0 ? common$PollingOptions.getMaxDurationMs() : 5000L);
        }
    }

    public C0613p4(boolean z, long j, long j2) {
        this.f6530a = z;
        this.b = j;
        this.c = j2;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.c;
    }

    public final boolean c() {
        return this.f6530a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.C0613p4)) {
            return false;
        }
        com.plaid.internal.C0613p4 c0613p4 = (com.plaid.internal.C0613p4) obj;
        return this.f6530a == c0613p4.f6530a && this.b == c0613p4.b && this.c == c0613p4.c;
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f6530a);
        return java.lang.Long.hashCode(this.c) + ((java.lang.Long.hashCode(this.b) + (hashCode * 31)) * 31);
    }

    public final java.lang.String toString() {
        boolean z = this.f6530a;
        long j = this.b;
        long j2 = this.c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OAuthPollingOptions(shouldPoll=");
        sb.append(z);
        sb.append(", interval=");
        sb.append(j);
        sb.append(", maxDuration=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
