package com.bytedance.adsdk.sf.vj;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
class ye {
    static com.bytedance.adsdk.sf.gm.sf.vh pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        String str = null;
        com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> hcVar = null;
        com.bytedance.adsdk.sf.gm.pcc.wh whVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "p":
                    hcVar = pcc.sf(jsonReader, qfVar);
                    break;
                case "r":
                    sfVar = oo.pcc(jsonReader, qfVar);
                    break;
                case "s":
                    whVar = oo.gm(jsonReader, qfVar);
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.sf.gm.sf.vh(str, hcVar, whVar, sfVar, z);
    }
}
