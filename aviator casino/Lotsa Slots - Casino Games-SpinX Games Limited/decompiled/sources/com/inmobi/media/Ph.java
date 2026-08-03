package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ph {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4899a;
    public final long b;
    public final int c;
    public boolean d;
    public final com.inmobi.media.Kb e;
    public final com.inmobi.media.Ui f;
    public final java.util.List g;
    public final java.util.concurrent.ConcurrentHashMap h;
    public final java.util.concurrent.atomic.AtomicBoolean i;
    public java.lang.String j;
    public final java.util.concurrent.atomic.AtomicInteger k;

    public Ph(android.content.Context context, double d, com.inmobi.media.Ib logLevel, long j, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.f4899a = context;
        this.b = j;
        this.c = i;
        this.d = false;
        this.e = new com.inmobi.media.Kb(logLevel);
        this.f = new com.inmobi.media.Ui(d);
        this.g = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.h = new java.util.concurrent.ConcurrentHashMap();
        this.i = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.j = "";
        this.k = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public final void a(com.inmobi.media.Ib logLevel, java.lang.String tag, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        if (this.i.get()) {
            return;
        }
        java.text.SimpleDateFormat simpleDateFormat = com.inmobi.media.Lb.f4816a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("scope", logLevel.name());
        jSONObject.put(com.ironsource.C4.a.d, com.inmobi.media.Lb.f4816a.format(new java.util.Date()));
        jSONObject.put(com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, tag);
        jSONObject.put("data", message);
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
        com.inmobi.media.Zb.a(new com.inmobi.media.Nh(this, logLevel, jSONObject, null));
    }

    public final void b() {
        java.util.Objects.toString(this.i);
        if ((this.d || this.f.a()) && !this.i.getAndSet(true)) {
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
            com.inmobi.media.Zb.a(new com.inmobi.media.Mh(this, null));
        }
    }

    public final java.lang.String c() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        synchronized (this.h) {
            for (java.util.Map.Entry entry : this.h.entrySet()) {
                jSONObject2.put((java.lang.String) entry.getKey(), entry.getValue());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        jSONObject.put("vitals", jSONObject2);
        jSONObject.put("log", d());
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    public final org.json.JSONArray d() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List logData = this.g;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(logData, "logData");
        synchronized (logData) {
            java.util.List logData2 = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(logData2, "logData");
            java.util.Iterator it = logData2.iterator();
            while (it.hasNext()) {
                jSONArray.put((org.json.JSONObject) it.next());
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        return jSONArray;
    }

    public final boolean e() {
        if (this.g.isEmpty() || this.h.isEmpty()) {
            return true;
        }
        java.lang.String c = c();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "<this>");
        return kotlin.jvm.internal.Intrinsics.areEqual(c, "{}");
    }

    public final void b(boolean z) {
        java.util.Objects.toString(this.i);
        if (this.i.get()) {
            return;
        }
        this.d = z;
    }

    public final void a(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.util.Objects.toString(this.i);
        if (this.i.get()) {
            return;
        }
        this.h.put(key, value);
    }

    public final void a() {
        java.util.Objects.toString(this.i);
        if ((this.d || this.f.a()) && !this.i.get()) {
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
            com.inmobi.media.Zb.a(new com.inmobi.media.Lh(this, null));
        }
    }

    public final void a(final boolean z) {
        java.util.Objects.toString(this.i);
        kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
        if (kotlin.Result.m10801exceptionOrNullimpl(com.inmobi.media.Zb.a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Ph$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.inmobi.media.Ph.a(com.inmobi.media.Ph.this, z);
            }
        })) != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
            }
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.Ph ph, boolean z) {
        if (ph.e()) {
            return kotlin.Unit.INSTANCE;
        }
        long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis();
        if (ph.j.length() == 0) {
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
            ph.j = com.inmobi.media.Zb.a(ph.f4899a, timeInMillis);
        }
        if (ph.a(ph.j)) {
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.Oh(ph, timeInMillis, z, null), 1, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final boolean a(java.lang.String str) {
        return com.inmobi.media.AbstractC2299bc.a("RemoteLogger", c(), str);
    }
}
