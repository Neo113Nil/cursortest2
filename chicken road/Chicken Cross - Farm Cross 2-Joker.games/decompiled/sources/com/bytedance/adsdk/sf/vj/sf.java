package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
public class sf {
    public static com.bytedance.adsdk.sf.gm.pcc.vh pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.sf.gm.pcc.vh vhVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("a")) {
                vhVar = sf(jsonReader, qfVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return vhVar == null ? new com.bytedance.adsdk.sf.gm.pcc.vh(null, null, null, null) : vhVar;
    }

    private static com.bytedance.adsdk.sf.gm.pcc.vh sf(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.sf.gm.pcc.pcc pccVar = null;
        com.bytedance.adsdk.sf.gm.pcc.pcc pccVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "t":
                    sfVar2 = oo.pcc(jsonReader, qfVar);
                    break;
                case "fc":
                    pccVar = oo.qf(jsonReader, qfVar);
                    break;
                case "sc":
                    pccVar2 = oo.qf(jsonReader, qfVar);
                    break;
                case "sw":
                    sfVar = oo.pcc(jsonReader, qfVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.sf.gm.pcc.vh(pccVar, pccVar2, sfVar, sfVar2);
    }
}
