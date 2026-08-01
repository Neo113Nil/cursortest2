package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.k2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4489k2 {
    public static final b h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f8279a;
    private final com.ironsource.mediationsdk.demandOnly.a b;
    private final C4561o2 c;
    private final JSONObject d;
    private final JSONObject e;
    private final C4382e2 f;
    private final C4579p2 g;

    /* renamed from: com.ironsource.k2$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final JSONObject f8280a;
        private final String b;
        private final String c;
        private final com.ironsource.mediationsdk.demandOnly.a d;
        private final C4561o2 e;
        private final JSONObject f;
        private final JSONObject g;
        private final C4382e2 h;
        private final C4579p2 i;

        public a(JSONObject auctionData, String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            this.f8280a = auctionData;
            this.b = instanceId;
            JSONObject a2 = a(auctionData);
            this.c = auctionData.optString("auctionId");
            com.ironsource.mediationsdk.demandOnly.a a3 = a(auctionData, a2);
            this.d = a3;
            this.e = c(a2);
            this.f = d(a2);
            this.g = b(a2);
            this.h = a(a3, instanceId);
            this.i = b(a3, instanceId);
        }

        private final JSONObject d(JSONObject jSONObject) {
            return jSONObject.optJSONObject("genericParams");
        }

        public final C4489k2 a() {
            return new C4489k2(this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public final JSONObject b() {
            return this.f8280a;
        }

        public final String c() {
            return this.b;
        }

        private final JSONObject b(JSONObject jSONObject) {
            return jSONObject.optJSONObject("configurations");
        }

        private final C4561o2 c(JSONObject jSONObject) {
            return new C4561o2(jSONObject);
        }

        private final C4579p2 b(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4561o2 a2 = aVar.a(str);
            if (a2 == null) {
                return null;
            }
            String k = a2.k();
            Intrinsics.checkNotNullExpressionValue(k, "it.serverData");
            return new C4579p2(k);
        }

        private final JSONObject a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("settings");
            return optJSONObject == null ? new JSONObject() : optJSONObject;
        }

        private final com.ironsource.mediationsdk.demandOnly.a a(JSONObject jSONObject, JSONObject jSONObject2) {
            ArrayList arrayList = new ArrayList();
            JSONObject optJSONObject = jSONObject2.optJSONObject(com.ironsource.mediationsdk.d.d);
            JSONArray optJSONArray = jSONObject.optJSONArray(com.ironsource.mediationsdk.d.h);
            if (optJSONArray != null) {
                IntRange until = RangesKt.until(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator<Integer> it = until.iterator();
                while (it.hasNext()) {
                    int nextInt = ((IntIterator) it).nextInt();
                    C4561o2 c4561o2 = new C4561o2(optJSONArray.getJSONObject(nextInt), nextInt, optJSONObject);
                    if (!c4561o2.n()) {
                        c4561o2 = null;
                    }
                    if (c4561o2 != null) {
                        arrayList2.add(c4561o2);
                    }
                }
                arrayList.addAll(arrayList2);
            }
            return new a.C1332a(arrayList);
        }

        private final C4382e2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
            C4561o2 a2 = aVar.a(str);
            if (a2 == null) {
                return null;
            }
            C4382e2 c4382e2 = new C4382e2();
            c4382e2.a(a2.b());
            c4382e2.c(a2.h());
            c4382e2.b(a2.g());
            return c4382e2;
        }
    }

    /* renamed from: com.ironsource.k2$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(JSONObject auctionData, String instanceId) {
            Intrinsics.checkNotNullParameter(auctionData, "auctionData");
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            return a(new a(auctionData, instanceId).a(), instanceId);
        }

        private b() {
        }

        private final Object a(C4489k2 c4489k2, String str) {
            String b = c4489k2.b();
            if (b != null && b.length() != 0) {
                if (c4489k2.i()) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m8079constructorimpl(ResultKt.createFailure(new Y7(C4635s5.f8523a.f())));
                }
                C4561o2 a2 = c4489k2.a(str);
                if (a2 == null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m8079constructorimpl(ResultKt.createFailure(new Y7(C4635s5.f8523a.j())));
                }
                String k = a2.k();
                if (k != null && k.length() != 0) {
                    Result.Companion companion3 = Result.INSTANCE;
                    return Result.m8079constructorimpl(c4489k2);
                }
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m8079constructorimpl(ResultKt.createFailure(new Y7(C4635s5.f8523a.e())));
            }
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new Y7(C4635s5.f8523a.i())));
        }
    }

    public C4489k2(String str, com.ironsource.mediationsdk.demandOnly.a waterfall, C4561o2 genericNotifications, JSONObject jSONObject, JSONObject jSONObject2, C4382e2 c4382e2, C4579p2 c4579p2) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        Intrinsics.checkNotNullParameter(genericNotifications, "genericNotifications");
        this.f8279a = str;
        this.b = waterfall;
        this.c = genericNotifications;
        this.d = jSONObject;
        this.e = jSONObject2;
        this.f = c4382e2;
        this.g = c4579p2;
    }

    public final String a() {
        C4579p2 c4579p2 = this.g;
        if (c4579p2 != null) {
            return c4579p2.d();
        }
        return null;
    }

    public final String b() {
        return this.f8279a;
    }

    public final C4382e2 c() {
        return this.f;
    }

    public final JSONObject d() {
        return this.e;
    }

    public final C4561o2 e() {
        return this.c;
    }

    public final JSONObject f() {
        return this.d;
    }

    public final C4579p2 g() {
        return this.g;
    }

    public final com.ironsource.mediationsdk.demandOnly.a h() {
        return this.b;
    }

    public final boolean i() {
        return this.b.isEmpty();
    }

    public final C4561o2 a(String providerName) {
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        return a(this.b, providerName);
    }

    private final C4561o2 a(com.ironsource.mediationsdk.demandOnly.a aVar, String str) {
        return aVar.a(str);
    }
}
