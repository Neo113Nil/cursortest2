package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes4.dex */
class jsj {
    static com.bytedance.adsdk.sf.pcc.sf.vy pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        return new com.bytedance.adsdk.sf.pcc.sf.vy(qfVar, lo.pcc(jsonReader, qfVar, com.bytedance.adsdk.sf.wh.wh.pcc(), tsz.pcc, jsonReader.peek() == JsonToken.BEGIN_OBJECT, false));
    }
}
