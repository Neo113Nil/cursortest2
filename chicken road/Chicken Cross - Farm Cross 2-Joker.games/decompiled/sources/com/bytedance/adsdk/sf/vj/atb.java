package com.bytedance.adsdk.sf.vj;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.sf.gm.sf.ork;
import java.io.IOException;

/* loaded from: classes4.dex */
class atb {
    static com.bytedance.adsdk.sf.gm.sf.ork pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, int i) throws IOException {
        boolean z = false;
        boolean z2 = i == 3;
        String str = null;
        ork.pcc pccVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar = null;
        com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> hcVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar3 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar4 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar5 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar6 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z2 = false;
                        break;
                    } else {
                        z2 = true;
                        break;
                    }
                case "p":
                    hcVar = pcc.sf(jsonReader, qfVar);
                    break;
                case "r":
                    sfVar2 = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "ir":
                    sfVar3 = oo.pcc(jsonReader, qfVar);
                    break;
                case "is":
                    sfVar5 = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "or":
                    sfVar4 = oo.pcc(jsonReader, qfVar);
                    break;
                case "os":
                    sfVar6 = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "pt":
                    sfVar = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "sy":
                    pccVar = ork.pcc.pcc(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.sf.gm.sf.ork(str, pccVar, sfVar, hcVar, sfVar2, sfVar3, sfVar4, sfVar5, sfVar6, z, z2);
    }
}
