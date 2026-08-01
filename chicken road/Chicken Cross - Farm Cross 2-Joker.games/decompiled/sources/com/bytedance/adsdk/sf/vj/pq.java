package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes4.dex */
public class pq implements lrr<com.bytedance.adsdk.sf.qf.gm> {
    public static final pq pcc = new pq();

    private pq() {
    }

    @Override // com.bytedance.adsdk.sf.vj.lrr
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.sf.qf.gm sf(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.sf.qf.gm((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
