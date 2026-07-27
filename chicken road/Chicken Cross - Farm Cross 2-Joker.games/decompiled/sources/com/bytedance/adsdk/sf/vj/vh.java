package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
public class vh {
    private com.bytedance.adsdk.sf.gm.pcc.sf gm;
    private com.bytedance.adsdk.sf.gm.pcc.sf oo;
    private com.bytedance.adsdk.sf.gm.pcc.pcc pcc;
    private com.bytedance.adsdk.sf.gm.pcc.sf sf;
    private com.bytedance.adsdk.sf.gm.pcc.sf vj;

    ork pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    sf(jsonReader, qfVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        if (this.pcc == null || this.sf == null || this.gm == null || this.oo == null || this.vj == null) {
            return null;
        }
        return new ork(this.pcc, this.sf, this.gm, this.oo, this.vj);
    }

    private void sf(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("v")) {
                str.hashCode();
                switch (str) {
                    case "Distance":
                        this.oo = oo.pcc(jsonReader, qfVar);
                        break;
                    case "Opacity":
                        this.sf = oo.pcc(jsonReader, qfVar, false);
                        break;
                    case "Direction":
                        this.gm = oo.pcc(jsonReader, qfVar, false);
                        break;
                    case "Shadow Color":
                        this.pcc = oo.qf(jsonReader, qfVar);
                        break;
                    case "Softness":
                        this.vj = oo.pcc(jsonReader, qfVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (nextName.equals("nm")) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }
}
