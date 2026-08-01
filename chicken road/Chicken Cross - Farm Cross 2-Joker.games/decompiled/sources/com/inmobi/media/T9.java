package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorsKt;

/* loaded from: classes6.dex */
public abstract class T9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f6868a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.T9$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return T9.a();
        }
    });
    public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.T9$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return T9.c();
        }
    });

    public static final I9 a() {
        Context context = AbstractC3914mk.f7252a;
        Intrinsics.checkNotNullParameter("com.im_11.4.0.db", "name");
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNullParameter("ad_quality_db", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)", "tableSchema");
        arrayList.add(new C3576am("ad_quality_db", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, image_location TEXT NOT NULL, sdk_model_result TEXT, beacon_url TEXT NOT NULL, extras TEXT)"));
        Intrinsics.checkNotNullParameter("click", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )", "tableSchema");
        arrayList.add(new C3576am("click", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, pending_attempts INTEGER NOT NULL, url TEXT NOT NULL, ping_in_webview TEXT NOT NULL, follow_redirect TEXT NOT NULL, ts TEXT NOT NULL, track_extras TEXT, created_ts TEXT NOT NULL )"));
        Intrinsics.checkNotNullParameter("config_db", "tableName");
        Intrinsics.checkNotNullParameter("(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))", "tableSchema");
        arrayList.add(new C3576am("config_db", "(config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(config_type))"));
        Intrinsics.checkNotNullParameter("c_data", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new C3576am("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )"));
        Intrinsics.checkNotNullParameter(AppMeasurement.CRASH_ORIGIN, "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new C3576am(AppMeasurement.CRASH_ORIGIN, "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)"));
        Intrinsics.checkNotNullParameter("logs_v2", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )", "tableSchema");
        arrayList.add(new C3576am("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )"));
        Intrinsics.checkNotNullParameter("pings", "tableName");
        Intrinsics.checkNotNullParameter("(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT,status TEXT)", "tableSchema");
        arrayList.add(new C3576am("pings", "(id TEXT PRIMARY KEY,url TEXT NOT NULL,headers TEXT,allow_redirects TEXT NOT NULL,priority TEXT NOT NULL,ack_required TEXT NOT NULL,time_created INTEGER NOT NULL,owner TEXT NOT NULL,retry_count INTEGER DEFAULT 0,retryAfter INTEGER DEFAULT 0,telemetry_metadata TEXT,status TEXT)"));
        Intrinsics.checkNotNullParameter("telemetry", "tableName");
        Intrinsics.checkNotNullParameter("(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)", "tableSchema");
        arrayList.add(new C3576am("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)"));
        Object value = b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ExecutorService transactionExecutor = (ExecutorService) value;
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        L5 l5 = new L5(context, arrayList, AbstractC4267zb.a(), transactionExecutor);
        I9 i9 = new I9(l5);
        C3817ja c3817ja = new C3817ja(l5);
        S9 s9 = new S9(c3817ja, l5);
        i9.f6622a = s9;
        try {
            s9.c = c3817ja.getWritableDatabase();
        } catch (Exception unused) {
        }
        try {
            s9.d = s9.f6846a.getReadableDatabase();
        } catch (Exception unused2) {
        }
        ExecutorService executorService = s9.b.d;
        if (executorService != null) {
            s9.e = ExecutorsKt.from((Executor) executorService);
        }
        return i9;
    }

    public static final S9 b() {
        S9 s9 = ((I9) f6868a.getValue()).f6622a;
        if (s9 != null) {
            return s9;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_inmobiDatabaseHelper");
        return null;
    }

    public static final ExecutorService c() {
        Intrinsics.checkNotNullParameter("db.transactionExecutor", "name");
        return Executors.newSingleThreadExecutor(new ThreadFactoryC3932na("db.transactionExecutor", false));
    }
}
