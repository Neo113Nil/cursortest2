package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
class tsx {
    static com.bytedance.adsdk.sf.gm.sf.nac pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        String str = null;
        com.bytedance.adsdk.sf.gm.pcc.kj kjVar = null;
        int i = 0;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "ks":
                    kjVar = oo.vj(jsonReader, qfVar);
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                case "ind":
                    i = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.sf.gm.sf.nac(str, i, kjVar, z);
    }
}
