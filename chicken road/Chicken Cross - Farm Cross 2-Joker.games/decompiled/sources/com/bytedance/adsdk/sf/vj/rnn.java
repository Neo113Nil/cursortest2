package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
class rnn {
    static com.bytedance.adsdk.sf.gm.sf.dax pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "it":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.sf.gm.sf.gm pcc = kj.pcc(jsonReader, qfVar);
                        if (pcc != null) {
                            arrayList.add(pcc);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.sf.gm.sf.dax(str, arrayList, z);
    }
}
