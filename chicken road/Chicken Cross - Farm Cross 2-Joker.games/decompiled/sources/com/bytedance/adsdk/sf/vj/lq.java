package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
class lq {
    static com.bytedance.adsdk.sf.gm.sf.tmg pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        String str = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.tmg tmgVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "c":
                    sfVar = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "o":
                    sfVar2 = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "tr":
                    tmgVar = gm.pcc(jsonReader, qfVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.sf.gm.sf.tmg(str, sfVar, sfVar2, tmgVar, z);
    }
}
