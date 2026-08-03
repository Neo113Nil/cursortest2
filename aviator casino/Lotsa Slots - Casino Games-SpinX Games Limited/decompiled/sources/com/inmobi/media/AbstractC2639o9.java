package com.inmobi.media;

/* renamed from: com.inmobi.media.o9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2639o9 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f5371a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.o9$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2639o9.a();
        }
    });
    public static final kotlin.Lazy b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.o9$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.AbstractC2639o9.c();
        }
    });

    public static final com.inmobi.media.C2350d9 a() {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("com.im_11.2.0.db", "name");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ad_quality_db", "tableName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)", "tableSchema");
        arrayList.add(new com.inmobi.media.C2387ek("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)"));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.ironsource.Y3.d, "tableName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )", "tableSchema");
        arrayList.add(new com.inmobi.media.C2387ek(com.ironsource.Y3.d, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )"));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("config_db", "tableName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))", "tableSchema");
        arrayList.add(new com.inmobi.media.C2387ek("config_db", "(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))"));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("c_data", "tableName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new com.inmobi.media.C2387ek("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )"));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, "tableName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new com.inmobi.media.C2387ek(com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)"));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("logs_v2", "tableName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new com.inmobi.media.C2387ek("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )"));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("pings", "tableName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)", "tableSchema");
        arrayList.add(new com.inmobi.media.C2387ek("pings", "(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT)"));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("telemetry", "tableName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new com.inmobi.media.C2387ek("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)"));
        java.lang.Object value = b.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        java.util.concurrent.ExecutorService transactionExecutor = (java.util.concurrent.ExecutorService) value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        com.inmobi.media.C2635o5 c2635o5 = new com.inmobi.media.C2635o5(context, arrayList, com.inmobi.media.Ha.a(), transactionExecutor);
        com.inmobi.media.C2350d9 c2350d9 = new com.inmobi.media.C2350d9(c2635o5);
        com.inmobi.media.E9 e9 = new com.inmobi.media.E9(c2635o5);
        com.inmobi.media.C2613n9 c2613n9 = new com.inmobi.media.C2613n9(e9, c2635o5);
        c2350d9.f5157a = c2613n9;
        try {
            c2613n9.c = e9.getWritableDatabase();
        } catch (java.lang.Exception unused) {
        }
        try {
            c2613n9.d = c2613n9.f5354a.getReadableDatabase();
        } catch (java.lang.Exception unused2) {
        }
        java.util.concurrent.ExecutorService executorService = c2613n9.b.d;
        if (executorService != null) {
            c2613n9.e = kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.Executor) executorService);
        }
        return c2350d9;
    }

    public static final com.inmobi.media.C2613n9 b() {
        com.inmobi.media.C2613n9 c2613n9 = ((com.inmobi.media.C2350d9) f5371a.getValue()).f5157a;
        if (c2613n9 != null) {
            return c2613n9;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("_inmobiDatabaseHelper");
        return null;
    }

    public static final java.util.concurrent.ExecutorService c() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("db.transactionExecutor", "name");
        return java.util.concurrent.Executors.newSingleThreadExecutor(new com.inmobi.media.I9("db.transactionExecutor", false));
    }
}
