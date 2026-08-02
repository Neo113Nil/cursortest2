package Bl0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import di0.C6203c;
import java.util.ArrayList;
import java.util.Iterator;
import k10.EnumC7467b;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class c0 {
    public static a0 a(String uuid, String jsonString) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        JSONObject jSONObject = new JSONObject(jsonString);
        String string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(NAME_KEY)");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.getJSONObject(DATA_KEY)");
        Intrinsics.checkNotNullParameter(jSONObject2, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject2.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            arrayList.add(new Pair(next, jSONObject2.get(next).toString()));
        }
        return new a0(uuid, string, kotlin.collections.U.s(arrayList));
    }

    public static final void b(int i11) {
        if (i11 < 1) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static void c(String traceId, EnumC7467b metricType, long j11, int i11) {
        C6203c c6203c = C6203c.f61631a;
        if ((i11 & 4) != 0) {
            j11 = System.nanoTime();
        }
        Intrinsics.checkNotNullParameter(c6203c, "<this>");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        C6203c.c().beginTrace(traceId).e(metricType, j11, true);
    }
}
