package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.a0;
import com.chartboost.sdk.impl.qf;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class z {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final List f5096a;
    public final a0 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("renderables");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                qf.a aVar = qf.r;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                arrayList.add(aVar.a(jSONObject));
            }
            a0.a aVar2 = a0.o;
            JSONObject jSONObject2 = jsonObject.getJSONObject("config");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            String string = jsonObject.getString("auction_id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new z(arrayList, aVar2.a(jSONObject2, string));
        }

        public a() {
        }
    }

    public z(List renderables, a0 admConfig) {
        Intrinsics.checkNotNullParameter(renderables, "renderables");
        Intrinsics.checkNotNullParameter(admConfig, "admConfig");
        this.f5096a = renderables;
        this.b = admConfig;
    }

    public final a0 a() {
        return this.b;
    }

    public final List b() {
        return this.f5096a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.areEqual(this.f5096a, zVar.f5096a) && Intrinsics.areEqual(this.b, zVar.b);
    }

    public int hashCode() {
        return (this.f5096a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "AdMarkup(renderables=" + this.f5096a + ", admConfig=" + this.b + ")";
    }
}
