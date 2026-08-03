package com.ironsource;

/* loaded from: classes5.dex */
public final class Qe implements com.ironsource.Re {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.C2988c9 f5941a;

    /* JADX WARN: Multi-variable type inference failed */
    public Qe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final com.ironsource.Ae b(android.content.Context context, com.ironsource.Ge ge, com.ironsource.C3333ve c3333ve) {
        com.ironsource.Ae a2 = a(context, ge, c3333ve);
        if (!(a2 instanceof com.ironsource.Ae.a)) {
            return a2;
        }
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager logger = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger();
        com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        com.ironsource.Ve a3 = ge.a(context, c3333ve.d());
        if (a3 == null || !a3.q()) {
            return a2;
        }
        com.ironsource.Ae.b bVar = new com.ironsource.Ae.b(new com.ironsource.C3351we(a3), null);
        com.ironsource.mediationsdk.logger.IronSourceError buildUsingCachedConfigurationError = com.ironsource.mediationsdk.utils.ErrorBuilder.buildUsingCachedConfigurationError(c3333ve.d(), c3333ve.f());
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(ironSourceTag, buildUsingCachedConfigurationError + ": " + bVar.d(), 1);
        ge.b();
        return bVar;
    }

    @Override // com.ironsource.Re
    public void a(android.content.Context context, com.ironsource.C3333ve request, com.ironsource.Ge tools, com.ironsource.InterfaceC3297te listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        java.lang.String f = request.f();
        if (f == null) {
            f = "";
        }
        tools.a("userId", f);
        tools.a("appKey", request.d());
        tools.g().i(request.f());
        tools.f();
        com.ironsource.Ae b = b(context, tools, request);
        if (b instanceof com.ironsource.Ae.b) {
            com.ironsource.Ae.b bVar = (com.ironsource.Ae.b) b;
            listener.a(new com.ironsource.C3190ne(bVar.d(), null, bVar.c()));
        } else if (b instanceof com.ironsource.Ae.a) {
            com.ironsource.Ae.a aVar = (com.ironsource.Ae.a) b;
            listener.a(aVar.c(), aVar.d());
        }
    }

    public Qe(com.ironsource.C2988c9 performanceMeasurer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performanceMeasurer, "performanceMeasurer");
        this.f5941a = performanceMeasurer;
    }

    public /* synthetic */ Qe(com.ironsource.C2988c9 c2988c9, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.ironsource.C2988c9(null, null, 3, null) : c2988c9);
    }

    private final com.ironsource.Ae a(android.content.Context context, com.ironsource.Ge ge, com.ironsource.C3333ve c3333ve) {
        com.ironsource.C3226pe c3226pe;
        try {
            java.lang.String c = ge.c(context);
            if (android.text.TextUtils.isEmpty(c)) {
                c = ge.a(context);
                com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            java.lang.String str = c;
            com.ironsource.C2953aa c2 = ge.c();
            java.lang.String a2 = com.ironsource.Xe.a(context, c3333ve.d(), c3333ve.f(), str, null, true, c2 != null ? c2.f() : null, false);
            java.lang.String jSONObject = com.ironsource.C3024e9.a().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "createRequestData().toString()");
            com.ironsource.InterfaceC3058g7 serverResponse = com.ironsource.C3022e7.a(a2, jSONObject);
            if (serverResponse instanceof com.ironsource.InterfaceC3058g7.a) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("HTTP init request failed: " + ((com.ironsource.InterfaceC3058g7.a) serverResponse).a());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverResponse, "serverResponse");
                return new com.ironsource.Ae.a(a((com.ironsource.InterfaceC3058g7.a) serverResponse), null, 2, null);
            }
            if (serverResponse instanceof com.ironsource.InterfaceC3058g7.b) {
                java.lang.String d = ((com.ironsource.InterfaceC3058g7.b) serverResponse).d();
                if (ge.d()) {
                    com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
                    ironLog.verbose("encrypt");
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(d);
                    java.lang.String encryptedResponse = jSONObject2.optString(com.ironsource.Ve.n);
                    if (android.text.TextUtils.isEmpty(encryptedResponse)) {
                        ironLog.warning("encryptedResponse is empty - return null");
                        return new com.ironsource.Ae.a(new com.ironsource.C3226pe(2100, com.ironsource.C3279se.h), null, 2, null);
                    }
                    boolean optBoolean = jSONObject2.optBoolean("compression", false);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encryptedResponse, "encryptedResponse");
                    d = a(encryptedResponse, optBoolean);
                    if (android.text.TextUtils.isEmpty(d)) {
                        ironLog.warning("encoded response invalid - return null");
                        ge.e();
                        return new com.ironsource.Ae.a(new com.ironsource.C3226pe(com.ironsource.C3226pe.f, com.ironsource.C3279se.g), null, 2, null);
                    }
                }
                this.f5941a.a(d);
                com.ironsource.Ve ve = new com.ironsource.Ve(context, c3333ve.d(), c3333ve.f(), d);
                ve.a(com.ironsource.Ve.a.SERVER);
                if (!ve.q()) {
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("response invalid - return null");
                    java.lang.String e = ve.e();
                    if (e == null) {
                        e = com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                    }
                    return new com.ironsource.Ae.a(new com.ironsource.C3226pe(com.ironsource.C3226pe.e, e), this.f5941a);
                }
                return new com.ironsource.Ae.b(new com.ironsource.C3351we(ve), this.f5941a);
            }
            throw new kotlin.NoWhenBranchMatchedException();
        } catch (java.lang.Exception e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("exception = " + e2);
            if (e2 instanceof org.json.JSONException) {
                c3226pe = new com.ironsource.C3226pe(com.ironsource.C3226pe.e, "serverResponseIsNotValid");
            } else {
                c3226pe = new com.ironsource.C3226pe(510, "internal error");
            }
            return new com.ironsource.Ae.a(c3226pe, null, 2, null);
        }
    }

    private final java.lang.String a(java.lang.String str, boolean z) {
        if (z) {
            java.lang.String d = com.ironsource.I9.d(com.ironsource.C3127k5.b().c(), str);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(d, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
            return d;
        }
        java.lang.String b = com.ironsource.I9.b(com.ironsource.C3127k5.b().c(), str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(b, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return b;
    }

    private final com.ironsource.C3226pe a(com.ironsource.InterfaceC3058g7.a aVar) {
        return new com.ironsource.C3226pe(aVar.b() ? com.ironsource.C3226pe.d : com.ironsource.C3226pe.h, aVar.a());
    }
}
