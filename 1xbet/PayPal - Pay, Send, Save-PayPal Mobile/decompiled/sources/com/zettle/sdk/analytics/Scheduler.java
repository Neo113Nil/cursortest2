package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/analytics/Scheduler;", "", "", "schedule", "()V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Scheduler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.analytics.Scheduler.Companion INSTANCE = com.zettle.sdk.analytics.Scheduler.Companion.getHighResolutionOutputSizeshNQ4ISI;

    void schedule();

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/analytics/Scheduler$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "interval", "Ljava/util/concurrent/TimeUnit;", "unit", "", "preventRoaming", "isDebug", "Lcom/zettle/sdk/analytics/Scheduler;", "create", "(Landroid/content/Context;JLjava/util/concurrent/TimeUnit;ZZ)Lcom/zettle/sdk/analytics/Scheduler;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.analytics.Scheduler.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.analytics.Scheduler.Companion();

        private Companion() {
        }

        public static /* synthetic */ com.zettle.sdk.analytics.Scheduler create$default(com.zettle.sdk.analytics.Scheduler.Companion companion, android.content.Context context, long j, java.util.concurrent.TimeUnit timeUnit, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                z = true;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = false;
            }
            return companion.create(context, j, timeUnit, z3, z2);
        }

        public final com.zettle.sdk.analytics.Scheduler create(android.content.Context context, long interval, java.util.concurrent.TimeUnit unit, boolean preventRoaming, boolean isDebug) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
            if (interval == 0) {
                return com.zettle.sdk.analytics.InstantDispatcher.INSTANCE.create(context);
            }
            return new com.zettle.sdk.analytics.JobManagerScheduler(context, interval, unit, com.zettle.sdk.meta.Platform.INSTANCE.getInfo(), preventRoaming, isDebug);
        }
    }
}
