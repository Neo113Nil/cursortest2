package com.chartboost.sdk.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class oa {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4927a;
    public final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final oa a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String optString = jsonObject.optString("clickthrough_url", "https://docs.chartboost.com/opt-out");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            String string = jsonObject.getString(CampaignEx.JSON_KEY_IMAGE_URL);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new oa(optString, string);
        }

        public a() {
        }
    }

    public oa(String clickthroughUrl, String imageUrl) {
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f4927a = clickthroughUrl;
        this.b = imageUrl;
    }

    public final String a() {
        return this.f4927a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj;
        return Intrinsics.areEqual(this.f4927a, oaVar.f4927a) && Intrinsics.areEqual(this.b, oaVar.b);
    }

    public int hashCode() {
        return (this.f4927a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "InfoIconModel(clickthroughUrl=" + this.f4927a + ", imageUrl=" + this.b + ")";
    }
}
