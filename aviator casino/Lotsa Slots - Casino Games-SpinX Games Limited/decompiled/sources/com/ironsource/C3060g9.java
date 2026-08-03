package com.ironsource;

/* renamed from: com.ironsource.g9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3060g9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C3060g9.a f6274a = new com.ironsource.C3060g9.a(null);

    /* renamed from: com.ironsource.g9$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final org.json.JSONObject a(android.content.Context context) {
            try {
                return new org.json.JSONObject(com.ironsource.mediationsdk.utils.IronSourceUtils.e(context));
            } catch (org.json.JSONException unused) {
                return new org.json.JSONObject();
            }
        }

        @kotlin.jvm.JvmStatic
        public final boolean b(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.ironsource.C3358x3 d = d(context);
            return d.d().length() > 0 && d.e().length() > 0;
        }

        @kotlin.jvm.JvmStatic
        public final com.ironsource.Ve c(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            com.ironsource.C3358x3 d = d(context);
            if (d.d().length() <= 0 || d.e().length() <= 0) {
                d = null;
            }
            if (d == null) {
                return null;
            }
            com.ironsource.Ve ve = new com.ironsource.Ve(context, d.d(), d.f(), d.e());
            ve.a(com.ironsource.Ve.a.CACHE);
            return ve;
        }

        @kotlin.jvm.JvmStatic
        public final com.ironsource.C3358x3 d(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            org.json.JSONObject a2 = a(context);
            java.lang.String cachedAppKey = a2.optString("appKey");
            java.lang.String cachedUserId = a2.optString("userId");
            java.lang.String cachedSettings = a2.optString(com.ironsource.Ve.n);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new com.ironsource.C3358x3(cachedAppKey, cachedUserId, cachedSettings);
        }

        private a() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean a(android.content.Context context) {
        return f6274a.b(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.Ve b(android.content.Context context) {
        return f6274a.c(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.ironsource.C3358x3 c(android.content.Context context) {
        return f6274a.d(context);
    }
}
