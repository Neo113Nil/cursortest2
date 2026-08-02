package Nm0;

import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.f;
import com.google.gson.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import k5.C7575v0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e {
    private static JsonElement a(JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonObject)) {
            if (!(jsonElement instanceof JsonArray)) {
                return jsonElement;
            }
            JsonArray jsonArray = new JsonArray();
            Iterator<JsonElement> it = ((JsonArray) jsonElement).iterator();
            while (it.hasNext()) {
                jsonArray.add(a(it.next()));
            }
            return jsonArray;
        }
        JsonObject jsonObject = (JsonObject) jsonElement;
        ArrayList arrayList = new ArrayList(jsonObject.keySet());
        arrayList.sort(new d());
        JsonObject jsonObject2 = new JsonObject();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            jsonObject2.add(str, a(jsonObject.get(str)));
        }
        return jsonObject2;
    }

    public static String b(@NonNull JsonObject jsonObject, String str) throws JSONException {
        String jSONObject = new JSONObject(d(jsonObject)).toString();
        f fVar = new f();
        fVar.f(r.LONG_OR_DOUBLE);
        fVar.b();
        String replace = d((JsonElement) fVar.a().d(jSONObject, JsonObject.class)).replace(" ", "");
        try {
            byte[] bytes = str.getBytes();
            byte[] bytes2 = replace.getBytes();
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
            byte[] doFinal = mac.doFinal(bytes2);
            if (doFinal != null) {
                return C7575v0.b(doFinal.length, doFinal).toLowerCase(Locale.ROOT);
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static JsonObject c(String str) {
        f fVar = new f();
        fVar.f(r.LONG_OR_DOUBLE);
        fVar.b();
        return e(a((JsonElement) fVar.a().d(str, JsonObject.class))).getAsJsonObject();
    }

    public static String d(Object obj) {
        f fVar = new f();
        fVar.f(r.LONG_OR_DOUBLE);
        fVar.b();
        return fVar.a().k(obj);
    }

    private static JsonElement e(JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonArray)) {
            if (!(jsonElement instanceof JsonObject)) {
                return jsonElement;
            }
            JsonObject jsonObject = (JsonObject) jsonElement;
            JsonObject jsonObject2 = new JsonObject();
            Iterator it = new ArrayList(jsonObject.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                jsonObject2.add(str, e(jsonObject.get(str)));
            }
            return jsonObject2;
        }
        HashMap hashMap = new HashMap();
        Iterator<JsonElement> it2 = ((JsonArray) jsonElement).iterator();
        while (it2.hasNext()) {
            JsonElement e11 = e(it2.next());
            hashMap.put(new Gson().j(e11), e11);
        }
        LinkedList linkedList = new LinkedList(hashMap.keySet());
        linkedList.sort(new c());
        JsonArray jsonArray = new JsonArray();
        Iterator it3 = linkedList.iterator();
        while (it3.hasNext()) {
            jsonArray.add((JsonElement) hashMap.get((String) it3.next()));
        }
        return jsonArray;
    }
}
