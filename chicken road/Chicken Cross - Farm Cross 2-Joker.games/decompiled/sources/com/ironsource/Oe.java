package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.ironsource.InterfaceC4369d7;
import com.ironsource.InterfaceC4752ye;
import com.ironsource.Te;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Oe implements Pe {

    /* renamed from: a, reason: collision with root package name */
    private final C4371d9 f7841a;

    /* JADX WARN: Multi-variable type inference failed */
    public Oe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final InterfaceC4752ye b(Context context, Ee ee, C4662te c4662te) {
        InterfaceC4752ye a2 = a(context, ee, c4662te);
        if (!(a2 instanceof InterfaceC4752ye.a)) {
            return a2;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Null or invalid response. Trying to get cached response", 0);
        Te a3 = ee.a(context, c4662te.d());
        if (a3 == null || !a3.q()) {
            return a2;
        }
        InterfaceC4752ye.b bVar = new InterfaceC4752ye.b(new C4680ue(a3), null);
        IronSourceLoggerManager.getLogger().log(ironSourceTag, ErrorBuilder.buildUsingCachedConfigurationError(c4662te.d(), c4662te.f()) + ": " + bVar.d(), 1);
        ee.b();
        return bVar;
    }

    @Override // com.ironsource.Pe
    public void a(Context context, C4662te request, Ee tools, InterfaceC4626re listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String f = request.f();
        if (f == null) {
            f = "";
        }
        tools.a("userId", f);
        tools.a("appKey", request.d());
        tools.g().i(request.f());
        tools.f();
        InterfaceC4752ye b = b(context, tools, request);
        if (b instanceof InterfaceC4752ye.b) {
            InterfaceC4752ye.b bVar = (InterfaceC4752ye.b) b;
            listener.a(new C4519le(bVar.d(), null, bVar.c()));
        } else if (b instanceof InterfaceC4752ye.a) {
            InterfaceC4752ye.a aVar = (InterfaceC4752ye.a) b;
            listener.a(aVar.c(), aVar.d());
        }
    }

    public Oe(C4371d9 performanceMeasurer) {
        Intrinsics.checkNotNullParameter(performanceMeasurer, "performanceMeasurer");
        this.f7841a = performanceMeasurer;
    }

    public /* synthetic */ Oe(C4371d9 c4371d9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4371d9(null, null, 3, null) : c4371d9);
    }

    private final InterfaceC4752ye a(Context context, Ee ee, C4662te c4662te) {
        C4555ne c4555ne;
        try {
            String c = ee.c(context);
            if (TextUtils.isEmpty(c)) {
                c = ee.a(context);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "using custom identifier", 1);
            }
            String str = c;
            C4293aa c2 = ee.c();
            String a2 = Ve.a(context, c4662te.d(), c4662te.f(), str, null, true, c2 != null ? c2.f() : null, false);
            String jSONObject = C4407f9.a().toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "createRequestData().toString()");
            InterfaceC4369d7 serverResponse = C4333b7.a(a2, jSONObject);
            if (serverResponse instanceof InterfaceC4369d7.a) {
                IronLog.INTERNAL.warning("HTTP init request failed: " + ((InterfaceC4369d7.a) serverResponse).a());
                Intrinsics.checkNotNullExpressionValue(serverResponse, "serverResponse");
                return new InterfaceC4752ye.a(a((InterfaceC4369d7.a) serverResponse), null, 2, null);
            }
            if (serverResponse instanceof InterfaceC4369d7.b) {
                String d = ((InterfaceC4369d7.b) serverResponse).d();
                if (ee.d()) {
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("encrypt");
                    JSONObject jSONObject2 = new JSONObject(d);
                    String encryptedResponse = jSONObject2.optString(Te.n);
                    if (TextUtils.isEmpty(encryptedResponse)) {
                        ironLog.warning("encryptedResponse is empty - return null");
                        return new InterfaceC4752ye.a(new C4555ne(2100, C4609qe.h), null, 2, null);
                    }
                    boolean optBoolean = jSONObject2.optBoolean("compression", false);
                    Intrinsics.checkNotNullExpressionValue(encryptedResponse, "encryptedResponse");
                    d = a(encryptedResponse, optBoolean);
                    if (TextUtils.isEmpty(d)) {
                        ironLog.warning("encoded response invalid - return null");
                        ee.e();
                        return new InterfaceC4752ye.a(new C4555ne(C4555ne.f, C4609qe.g), null, 2, null);
                    }
                }
                this.f7841a.a(d);
                Te te = new Te(context, c4662te.d(), c4662te.f(), d);
                te.a(Te.a.SERVER);
                if (!te.q()) {
                    IronLog.INTERNAL.warning("response invalid - return null");
                    String e = te.e();
                    if (e == null) {
                        e = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                    }
                    return new InterfaceC4752ye.a(new C4555ne(C4555ne.e, e), this.f7841a);
                }
                return new InterfaceC4752ye.b(new C4680ue(te), this.f7841a);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e2) {
            C4491k4.d().a(e2);
            IronLog.INTERNAL.warning("exception = " + e2);
            if (e2 instanceof JSONException) {
                c4555ne = new C4555ne(C4555ne.e, "serverResponseIsNotValid");
            } else {
                c4555ne = new C4555ne(510, "internal error");
            }
            return new InterfaceC4752ye.a(c4555ne, null, 2, null);
        }
    }

    private final String a(String str, boolean z) {
        if (z) {
            String d = I9.d(C4457i5.b().c(), str);
            Intrinsics.checkNotNullExpressionValue(d, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
            return d;
        }
        String b = I9.b(C4457i5.b().c(), str);
        Intrinsics.checkNotNullExpressionValue(b, "{\n      IronSourceAES.de… encryptedResponse)\n    }");
        return b;
    }

    private final C4555ne a(InterfaceC4369d7.a aVar) {
        return new C4555ne(aVar.b() ? C4555ne.d : C4555ne.h, aVar.a());
    }
}
