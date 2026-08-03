package com.inmobi.media;

/* renamed from: com.inmobi.media.ja, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2507ja implements com.inmobi.media.InterfaceC2430ga {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2351da f5276a;

    public C2507ja(com.inmobi.media.C2351da incompleteLogData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(incompleteLogData, "incompleteLogData");
        this.f5276a = incompleteLogData;
    }

    public final void a(java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        try {
            org.json.JSONArray jSONArray = this.f5276a.b;
            com.inmobi.media.Ib logLevel = com.inmobi.media.Ib.c;
            java.text.SimpleDateFormat simpleDateFormat = com.inmobi.media.Lb.f4816a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("scope", "ERROR");
            jSONObject.put(com.ironsource.C4.a.d, com.inmobi.media.Lb.f4816a.format(new java.util.Date()));
            jSONObject.put(com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "IncompleteLogFinalizer");
            jSONObject.put("data", message);
            jSONArray.put(jSONObject);
        } catch (java.lang.Exception unused) {
        }
    }

    public final void b(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("exitReason", com.ironsource.X3.i.W);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        try {
            this.f5276a.f5158a.put("exitReason", value);
        } catch (java.lang.Exception unused) {
        }
    }

    public final java.lang.Object b() {
        final java.lang.String str = "IncompleteLogFinalizer";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("IncompleteLogFinalizer", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            org.json.JSONObject jSONObject = this.f5276a.f5158a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "<this>");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(jSONObject.toString(), "{}")) {
                org.json.JSONArray jSONArray = this.f5276a.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONArray, "<this>");
                if (jSONArray.length() != 0) {
                    kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
                    com.inmobi.media.Zb.a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.ja$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.inmobi.media.C2507ja.a(com.inmobi.media.C2507ja.this, str);
                        }
                    });
                }
            }
            return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.C2507ja c2507ja, java.lang.String str) {
        com.inmobi.media.C2351da c2351da = c2507ja.f5276a;
        org.json.JSONObject jSONObject = c2351da.f5158a;
        org.json.JSONArray jSONArray = c2351da.b;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("vitals", jSONObject);
        jSONObject2.put("log", jSONArray);
        java.lang.String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject3, "toString(...)");
        com.inmobi.media.AbstractC2299bc.a(str, jSONObject3, c2507ja.f5276a.c.f5568a);
        java.lang.String str2 = c2507ja.f5276a.c.f5568a;
        long timeInMillis = java.util.Calendar.getInstance().getTimeInMillis();
        com.inmobi.media.C2904yb c2904yb = c2507ja.f5276a.c;
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2482ia(new com.inmobi.media.C2904yb(str2, timeInMillis, 0, c2904yb.d, true, c2904yb.f), null), 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object a() {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
            return kotlin.Result.m10798constructorimpl(kotlin.Result.m10797boximpl(com.inmobi.media.Zb.a(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.ja$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.inmobi.media.C2507ja.a(com.inmobi.media.C2507ja.this);
                }
            })));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    public static final kotlin.Unit a(com.inmobi.media.C2507ja c2507ja) {
        com.inmobi.media.AbstractC2299bc.a(c2507ja.f5276a.c.f5568a);
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2456ha(c2507ja, null), 1, null);
        return kotlin.Unit.INSTANCE;
    }
}
