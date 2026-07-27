package com.ironsource;

import android.content.Context;
import com.ironsource.Te;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.h9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4443h9 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8225a = new a(null);

    /* renamed from: com.ironsource.h9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final JSONObject a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.e(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        @JvmStatic
        public final boolean b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C4669u3 d = d(context);
            return d.d().length() > 0 && d.e().length() > 0;
        }

        @JvmStatic
        public final Te c(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C4669u3 d = d(context);
            if (d.d().length() <= 0 || d.e().length() <= 0) {
                d = null;
            }
            if (d == null) {
                return null;
            }
            Te te = new Te(context, d.d(), d.f(), d.e());
            te.a(Te.a.CACHE);
            return te;
        }

        @JvmStatic
        public final C4669u3 d(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject a2 = a(context);
            String cachedAppKey = a2.optString("appKey");
            String cachedUserId = a2.optString("userId");
            String cachedSettings = a2.optString(Te.n);
            Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new C4669u3(cachedAppKey, cachedUserId, cachedSettings);
        }

        private a() {
        }
    }

    @JvmStatic
    public static final boolean a(Context context) {
        return f8225a.b(context);
    }

    @JvmStatic
    public static final Te b(Context context) {
        return f8225a.c(context);
    }

    @JvmStatic
    public static final C4669u3 c(Context context) {
        return f8225a.d(context);
    }
}
