package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import com.applovin.impl.sdk.utils.JsonUtils;
import io.ktor.sse.ServerSentEventKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ej, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3685ej {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7089a;
    public final long b;
    public final int c;
    public boolean d;
    public final Cc e;
    public final C3827jk f;
    public final List g;
    public final ConcurrentHashMap h;
    public final AtomicBoolean i;
    public String j;
    public final AtomicInteger k;

    public C3685ej(Context context, double d, Ac logLevel, long j, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.f7089a = context;
        this.b = j;
        this.c = i;
        this.d = false;
        this.e = new Cc(logLevel);
        this.f = new C3827jk(d);
        this.g = Collections.synchronizedList(new ArrayList());
        this.h = new ConcurrentHashMap();
        this.i = new AtomicBoolean(false);
        this.j = "";
        this.k = new AtomicInteger(0);
    }

    public final void a(Ac logLevel, String tag, String message) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.i.get()) {
            return;
        }
        SimpleDateFormat simpleDateFormat = Dc.f6511a;
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scope", logLevel.name());
        jSONObject.put("timestamp", Dc.f6511a.format(new Date()));
        jSONObject.put("tag", tag);
        jSONObject.put("data", message);
        CoroutineScope coroutineScope = Sc.f6848a;
        Rc.a(new C3630cj(this, logLevel, jSONObject, null));
    }

    public final void b() {
        String str = "finish " + this.i;
        if ((this.d || this.f.a()) && !this.i.getAndSet(true)) {
            CoroutineScope coroutineScope = Sc.f6848a;
            Rc.a(new C3601bj(this, null));
        }
    }

    public final String c() {
        JSONObject jSONObject = new JSONObject();
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (Ki.f6675a) {
            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("d-build-v", Build.ID), TuplesKt.to("os-v", Build.VERSION.RELEASE), TuplesKt.to("d-build-model", Build.MODEL));
            String b = Ki.b();
            if (b != null) {
                if (StringsKt.isBlank(b)) {
                    b = null;
                }
                if (b != null) {
                    mutableMapOf.put("d-wv-v", b);
                }
            }
            for (Map.Entry entry : mutableMapOf.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!jSONObject.has(str)) {
                    jSONObject.put(str, str2);
                }
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        synchronized (this.h) {
            for (Map.Entry entry2 : this.h.entrySet()) {
                jSONObject2.put((String) entry2.getKey(), entry2.getValue());
            }
            Unit unit = Unit.INSTANCE;
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put("log", d());
        String jSONObject3 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    public final JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        List logData = this.g;
        Intrinsics.checkNotNullExpressionValue(logData, "logData");
        synchronized (logData) {
            List logData2 = this.g;
            Intrinsics.checkNotNullExpressionValue(logData2, "logData");
            Iterator it = logData2.iterator();
            while (it.hasNext()) {
                jSONArray.put((JSONObject) it.next());
            }
            Unit unit = Unit.INSTANCE;
        }
        return jSONArray;
    }

    public final boolean e() {
        String str = "isNotEligibleForSave " + this.j;
        if (this.g.isEmpty() || this.h.isEmpty()) {
            return true;
        }
        String c = c();
        Intrinsics.checkNotNullParameter(c, "<this>");
        return Intrinsics.areEqual(c, JsonUtils.EMPTY_JSON);
    }

    public final void b(boolean z) {
        String str = "setExternalLever " + z + ServerSentEventKt.SPACE + this.i;
        if (this.i.get()) {
            return;
        }
        this.d = z;
    }

    public final void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        String str = "updateVitals " + key + ServerSentEventKt.SPACE + value + ServerSentEventKt.SPACE + this.i;
        if (this.i.get()) {
            return;
        }
        this.h.put(key, value);
    }

    public final void a() {
        String str = "checkpoint " + this.i;
        if ((this.d || this.f.a()) && !this.i.get()) {
            CoroutineScope coroutineScope = Sc.f6848a;
            Rc.a(new C3573aj(this, null));
        }
    }

    public final void a(final boolean z) {
        String str = "save " + this.i;
        CoroutineScope coroutineScope = Sc.f6848a;
        if (Result.m8082exceptionOrNullimpl(Rc.a(new Function0() { // from class: com.inmobi.media.ej$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3685ej.a(C3685ej.this, z);
            }
        })) != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Result.m8079constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8079constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    public static final Unit a(C3685ej c3685ej, boolean z) {
        if (c3685ej.e()) {
            return Unit.INSTANCE;
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (c3685ej.j.length() == 0) {
            CoroutineScope coroutineScope = Sc.f6848a;
            c3685ej.j = Rc.a(c3685ej.f7089a, timeInMillis);
        }
        if (c3685ej.a(c3685ej.j)) {
            BuildersKt__BuildersKt.runBlocking$default(null, new C3658dj(c3685ej, timeInMillis, z, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    public final boolean a(String str) {
        String str2 = "insertDataToFileSystem " + str;
        return Tc.a("RemoteLogger", c(), str);
    }
}
