package com.moloco.sdk.acm.db;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/moloco/sdk/acm/db/MetricsDb;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/moloco/sdk/acm/db/d;", "b", "()Lcom/moloco/sdk/acm/db/d;", "a", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes5.dex */
public abstract class MetricsDb extends androidx.room.RoomDatabase {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final com.moloco.sdk.acm.db.MetricsDb.Companion INSTANCE = new com.moloco.sdk.acm.db.MetricsDb.Companion(null);
    public static volatile com.moloco.sdk.acm.db.MetricsDb b = null;
    public static final java.lang.String c = "MetricsDb";

    /* renamed from: com.moloco.sdk.acm.db.MetricsDb$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.moloco.sdk.acm.db.MetricsDb a(android.content.Context context) {
            try {
                android.content.Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return (com.moloco.sdk.acm.db.MetricsDb) androidx.room.Room.databaseBuilder(applicationContext, com.moloco.sdk.acm.db.MetricsDb.class, "metrics-db").build();
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalStateException("Database creation failed", e);
            }
        }

        public final com.moloco.sdk.acm.db.MetricsDb b(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.moloco.sdk.acm.db.MetricsDb metricsDb = com.moloco.sdk.acm.db.MetricsDb.b;
            if (metricsDb == null) {
                synchronized (this) {
                    metricsDb = com.moloco.sdk.acm.db.MetricsDb.b;
                    if (metricsDb == null) {
                        com.moloco.sdk.acm.db.MetricsDb a2 = com.moloco.sdk.acm.db.MetricsDb.INSTANCE.a(context);
                        com.moloco.sdk.acm.db.MetricsDb.b = a2;
                        metricsDb = a2;
                    }
                }
            }
            return metricsDb;
        }

        public Companion() {
        }
    }

    public abstract com.moloco.sdk.acm.db.d b();
}
