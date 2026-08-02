package Bb;

import Ab.C2377a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class i {
    public static final boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return new JSONObject(str).has("error");
        } catch (JSONException unused) {
            return false;
        }
    }

    @NotNull
    public static final C2377a b(@NotNull String jsonData) {
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        JSONObject jSONObject = new JSONObject(jsonData).getJSONObject("error");
        int i11 = jSONObject.getInt("code");
        String string = jSONObject.getString("message");
        Intrinsics.checkNotNullExpressionValue(string, "jsonError.getString(\"message\")");
        String optString = jSONObject.optString("status");
        Intrinsics.checkNotNullExpressionValue(optString, "jsonError.optString(\"status\")");
        return new C2377a(i11, string, optString);
    }
}
