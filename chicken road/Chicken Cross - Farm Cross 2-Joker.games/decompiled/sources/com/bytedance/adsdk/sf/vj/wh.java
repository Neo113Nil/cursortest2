package com.bytedance.adsdk.sf.vj;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
class wh {
    static com.bytedance.adsdk.sf.gm.sf.sf pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, int i) throws IOException {
        boolean z = i == 3;
        boolean z2 = false;
        String str = null;
        com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> hcVar = null;
        com.bytedance.adsdk.sf.gm.pcc.wh whVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "p":
                    hcVar = pcc.sf(jsonReader, qfVar);
                    break;
                case "s":
                    whVar = oo.gm(jsonReader, qfVar);
                    break;
                case "hd":
                    z2 = jsonReader.nextBoolean();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.sf.gm.sf.sf(str, hcVar, whVar, z, z2);
    }
}
