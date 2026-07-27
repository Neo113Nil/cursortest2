package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
class vj {
    static com.bytedance.adsdk.sf.gm.sf.pcc pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        com.bytedance.adsdk.sf.gm.sf.pcc pccVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.sf.gm.sf.pcc sf = sf(jsonReader, qfVar);
                    if (sf != null) {
                        pccVar = sf;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return pccVar;
    }

    private static com.bytedance.adsdk.sf.gm.sf.pcc sf(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.sf.gm.sf.pcc pccVar = null;
        while (true) {
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                if (nextName.equals("v")) {
                    if (z) {
                        pccVar = new com.bytedance.adsdk.sf.gm.sf.pcc(oo.pcc(jsonReader, qfVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (nextName.equals("ty")) {
                    if (jsonReader.nextInt() == 0) {
                        z = true;
                    }
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return pccVar;
        }
    }
}
