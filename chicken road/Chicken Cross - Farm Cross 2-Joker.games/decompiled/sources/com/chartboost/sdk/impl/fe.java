package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.a3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Model.openrtb26.BidRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class fe extends g3 {
    public static final a v = new a(null);
    public static final Json w = JsonKt.Json$default(null, new Function1() { // from class: com.chartboost.sdk.impl.fe$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return fe.a((JsonBuilder) obj);
        }
    }, 1, null);
    public final boolean u;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fe(od networkParameters, b0 adParameters, ae aeVar, h7 eventTracker, sg session, boolean z) {
        super(method, endpoint, path, r4, priority, (String) null, networkParameters.f, eventTracker, session);
        JSONObject h;
        Intrinsics.checkNotNullParameter(networkParameters, "networkParameters");
        Intrinsics.checkNotNullParameter(adParameters, "adParameters");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(session, "session");
        a3.c method = networkParameters.f4930a;
        Intrinsics.checkNotNullExpressionValue(method, "method");
        String endpoint = networkParameters.b;
        Intrinsics.checkNotNullExpressionValue(endpoint, "endpoint");
        String path = networkParameters.c;
        Intrinsics.checkNotNullExpressionValue(path, "path");
        cg cgVar = networkParameters.d;
        ue priority = networkParameters.e;
        Intrinsics.checkNotNullExpressionValue(priority, "priority");
        this.u = z;
        if (z) {
            cg requestBodyFields = networkParameters.d;
            Intrinsics.checkNotNullExpressionValue(requestBodyFields, "requestBodyFields");
            BidRequest a2 = new he(requestBodyFields, adParameters, aeVar).a();
            Json json = w;
            json.getSerializersModule();
            h = new JSONObject(json.encodeToString(BidRequest.INSTANCE.serializer(), a2));
        } else {
            h = new ge(networkParameters.d, adParameters, aeVar).h();
            Intrinsics.checkNotNull(h);
        }
        a(h);
    }

    public static final Unit a(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setEncodeDefaults(true);
        Json.setIgnoreUnknownKeys(true);
        Json.setPrettyPrint(false);
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.impl.g3
    public void f() {
    }

    @Override // com.chartboost.sdk.impl.g3, com.chartboost.sdk.impl.a3
    public c3 a(d3 d3Var) {
        byte[] bArr;
        try {
            if (d3Var == null || (bArr = d3Var.a()) == null) {
                bArr = new byte[0];
            }
            return c3.c.a(new JSONObject(new String(bArr, Charsets.UTF_8)));
        } catch (JSONException e) {
            mb.b("parseServerResponse", e);
            return c3.c.a(new CBError(CBError.Internal.HTTP_NOT_FOUND, "No Bid"));
        }
    }
}
