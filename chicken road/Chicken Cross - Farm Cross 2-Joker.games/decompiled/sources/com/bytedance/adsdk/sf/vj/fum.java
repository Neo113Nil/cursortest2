package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
class fum {
    static <T> List<com.bytedance.adsdk.sf.qf.pcc<T>> pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, float f, lrr<T> lrrVar, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            qfVar.pcc("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                    jsonReader.beginArray();
                    if (jsonReader.peek() == JsonToken.NUMBER) {
                        arrayList.add(lo.pcc(jsonReader, qfVar, f, lrrVar, false, z));
                    } else {
                        while (jsonReader.hasNext()) {
                            arrayList.add(lo.pcc(jsonReader, qfVar, f, lrrVar, true, z));
                        }
                    }
                    jsonReader.endArray();
                } else {
                    arrayList.add(lo.pcc(jsonReader, qfVar, f, lrrVar, false, z));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        pcc(arrayList);
        return arrayList;
    }

    public static <T> void pcc(List<? extends com.bytedance.adsdk.sf.qf.pcc<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar = list.get(i2);
            i2++;
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar2 = list.get(i2);
            pccVar.qf = Float.valueOf(pccVar2.wh);
            if (pccVar.sf == null && pccVar2.pcc != null) {
                pccVar.sf = pccVar2.pcc;
                if (pccVar instanceof com.bytedance.adsdk.sf.pcc.sf.vy) {
                    ((com.bytedance.adsdk.sf.pcc.sf.vy) pccVar).pcc();
                }
            }
        }
        com.bytedance.adsdk.sf.qf.pcc<T> pccVar3 = list.get(i);
        if ((pccVar3.pcc == null || pccVar3.sf == null) && list.size() > 1) {
            list.remove(pccVar3);
        }
    }
}
