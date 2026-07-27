package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import com.bytedance.adsdk.sf.gm.sf.gpj;
import java.io.IOException;

/* loaded from: classes4.dex */
class rj {
    static com.bytedance.adsdk.sf.gm.sf.gpj pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        String str = null;
        gpj.pcc pccVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "e":
                    sfVar2 = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "m":
                    pccVar = gpj.pcc.pcc(jsonReader.nextInt());
                    break;
                case "o":
                    sfVar3 = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "s":
                    sfVar = oo.pcc(jsonReader, qfVar, false);
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
        return new com.bytedance.adsdk.sf.gm.sf.gpj(str, pccVar, sfVar, sfVar2, sfVar3, z);
    }
}
