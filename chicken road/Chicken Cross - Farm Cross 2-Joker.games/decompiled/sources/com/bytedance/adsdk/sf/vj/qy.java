package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import com.bytedance.adsdk.sf.gm.sf.vy;
import java.io.IOException;

/* loaded from: classes4.dex */
class qy {
    static com.bytedance.adsdk.sf.gm.sf.vy pcc(JsonReader jsonReader) throws IOException {
        String str = null;
        vy.pcc pccVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "mm":
                    pccVar = vy.pcc.pcc(jsonReader.nextInt());
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.sf.gm.sf.vy(str, pccVar, z);
    }
}
