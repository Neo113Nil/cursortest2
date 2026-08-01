package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes4.dex */
class hc {
    static com.bytedance.adsdk.sf.gm.oo pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        char c = 0;
        double d2 = 0.0d;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "fFamily":
                    str2 = jsonReader.nextString();
                    break;
                case "w":
                    d = jsonReader.nextDouble();
                    break;
                case "ch":
                    c = jsonReader.nextString().charAt(0);
                    break;
                case "data":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if ("shapes".equals(jsonReader.nextName())) {
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                arrayList.add((com.bytedance.adsdk.sf.gm.sf.dax) kj.pcc(jsonReader, qfVar));
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "size":
                    d2 = jsonReader.nextDouble();
                    break;
                case "style":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.sf.gm.oo(arrayList, c, d2, d, str, str2);
    }
}
