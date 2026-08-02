package Bl0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class W {
    public static String a(Al0.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, model.b());
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : model.a().entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        jSONObject.put("data", jSONObject2);
        jSONObject.put("time", model.c());
        String jSONObject3 = jSONObject.toString(0);
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "jsonObject.toString(0)");
        return jSONObject3;
    }
}
