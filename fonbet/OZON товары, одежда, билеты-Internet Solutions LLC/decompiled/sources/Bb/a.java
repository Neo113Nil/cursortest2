package Bb;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wb.C10468a;

/* loaded from: classes9.dex */
public final class a {
    @NotNull
    public static List a(@NotNull String jsonData) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonData, "jsonData");
        JSONArray jSONArray = new JSONObject(jsonData).getJSONArray("hosts");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "jsonObject.getJSONArray(\"hosts\")");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jsonObject = jSONArray.getJSONObject(i11);
            Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonItemObject");
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String packageName = jsonObject.getString("package_name");
            String pubKey = jsonObject.getString("pub_key");
            boolean optBoolean = jsonObject.optBoolean("is_arbiter");
            Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            Intrinsics.checkNotNullExpressionValue(pubKey, "pubKey");
            arrayList.add(new C10468a(packageName, pubKey, optBoolean));
        }
        return Ye.b.B(arrayList);
    }
}
