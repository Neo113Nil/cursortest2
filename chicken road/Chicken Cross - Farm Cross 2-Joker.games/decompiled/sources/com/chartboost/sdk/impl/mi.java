package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.g3;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4761z5;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class mi extends g3 {
    public final ji u;
    public final String v;

    public static final class a implements g3.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ji f4881a;

        public a(ji jiVar) {
            this.f4881a = jiVar;
        }

        @Override // com.chartboost.sdk.impl.g3.a
        public void a(g3 g3Var, JSONObject jSONObject) {
        }

        @Override // com.chartboost.sdk.impl.g3.a
        public void a(g3 g3Var, CBError cBError) {
            JSONArray h;
            mb.a("Request " + (g3Var != null ? g3Var.e() : null) + " failed!", (Throwable) null, 2, (Object) null);
            if (g3Var == null || (h = g3Var.h()) == null) {
                return;
            }
            this.f4881a.a(h);
        }
    }

    public /* synthetic */ mi(String str, ji jiVar, String str2, g3.a aVar, h7 h7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jiVar, str2, (i & 8) != 0 ? new a(jiVar) : aVar, h7Var);
    }

    @Override // com.chartboost.sdk.impl.g3, com.chartboost.sdk.impl.a3
    public b3 a() {
        Map c = c(this.v);
        JSONArray h = h();
        return new b3(c, h != null ? y2.a(h) : null, C4761z5.M);
    }

    public final Map c(String str) {
        return MapsKt.mapOf(TuplesKt.to(HttpHeaders.ACCEPT, C4761z5.M), TuplesKt.to("X-Chartboost-Client", l3.b()), TuplesKt.to("X-Chartboost-API", "9.13.0"), TuplesKt.to("x-monetization-session-id", str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mi(String url, ji trackingEventCache, String sessionId, g3.a callback, h7 eventTracker) {
        super(r1.a(url), r1.b(url), (cg) null, ue.e, callback, eventTracker, (sg) null, 64, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        NetworkHelper networkHelper = NetworkHelper.f5122a;
        this.u = trackingEventCache;
        this.v = sessionId;
        this.s = false;
    }
}
