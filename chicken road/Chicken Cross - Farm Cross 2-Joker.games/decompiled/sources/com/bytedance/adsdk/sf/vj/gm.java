package com.bytedance.adsdk.sf.vj;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;

/* loaded from: classes4.dex */
public class gm {
    public static com.bytedance.adsdk.sf.gm.pcc.tmg pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar = null;
        com.bytedance.adsdk.sf.gm.pcc.vj vjVar = null;
        com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> hcVar = null;
        com.bytedance.adsdk.sf.gm.pcc.qf qfVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar3 = null;
        com.bytedance.adsdk.sf.gm.pcc.oo ooVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar4 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar5 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.hashCode();
                        if (nextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            vjVar = pcc.pcc(jsonReader, qfVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    continue;
                case "o":
                    ooVar = oo.sf(jsonReader, qfVar);
                    continue;
                case "p":
                    hcVar = pcc.sf(jsonReader, qfVar);
                    continue;
                case "r":
                    break;
                case "s":
                    qfVar2 = oo.oo(jsonReader, qfVar);
                    continue;
                case "eo":
                    sfVar5 = oo.pcc(jsonReader, qfVar, false);
                    continue;
                case "rz":
                    qfVar.pcc("Lottie doesn't support 3D layers.");
                    break;
                case "sa":
                    sfVar3 = oo.pcc(jsonReader, qfVar, false);
                    continue;
                case "sk":
                    sfVar2 = oo.pcc(jsonReader, qfVar, false);
                    continue;
                case "so":
                    sfVar4 = oo.pcc(jsonReader, qfVar, false);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            com.bytedance.adsdk.sf.gm.pcc.sf pcc = oo.pcc(jsonReader, qfVar, false);
            if (pcc.gm().isEmpty()) {
                pcc.gm().add(new com.bytedance.adsdk.sf.qf.pcc(qfVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(qfVar.qf())));
            } else if (((com.bytedance.adsdk.sf.qf.pcc) pcc.gm().get(0)).pcc == 0) {
                pcc.gm().set(0, new com.bytedance.adsdk.sf.qf.pcc(qfVar, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(qfVar.qf())));
            }
            sfVar = pcc;
        }
        if (z) {
            jsonReader.endObject();
        }
        com.bytedance.adsdk.sf.gm.pcc.vj vjVar2 = pcc(vjVar) ? null : vjVar;
        if (pcc(hcVar)) {
            hcVar = null;
        }
        return new com.bytedance.adsdk.sf.gm.pcc.tmg(vjVar2, hcVar, pcc(qfVar2) ? null : qfVar2, pcc(sfVar) ? null : sfVar, ooVar, sfVar4, sfVar5, sf(sfVar2) ? null : sfVar2, gm(sfVar3) ? null : sfVar3);
    }

    private static boolean pcc(com.bytedance.adsdk.sf.gm.pcc.vj vjVar) {
        if (vjVar != null) {
            return vjVar.sf() && vjVar.gm().get(0).pcc.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean pcc(com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> hcVar) {
        if (hcVar != null) {
            return !(hcVar instanceof com.bytedance.adsdk.sf.gm.pcc.vy) && hcVar.sf() && hcVar.gm().get(0).pcc.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean pcc(com.bytedance.adsdk.sf.gm.pcc.sf sfVar) {
        if (sfVar != null) {
            return sfVar.sf() && ((Float) ((com.bytedance.adsdk.sf.qf.pcc) sfVar.gm().get(0)).pcc).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean pcc(com.bytedance.adsdk.sf.gm.pcc.qf qfVar) {
        if (qfVar != null) {
            return qfVar.sf() && ((com.bytedance.adsdk.sf.qf.gm) ((com.bytedance.adsdk.sf.qf.pcc) qfVar.gm().get(0)).pcc).sf(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean sf(com.bytedance.adsdk.sf.gm.pcc.sf sfVar) {
        if (sfVar != null) {
            return sfVar.sf() && ((Float) ((com.bytedance.adsdk.sf.qf.pcc) sfVar.gm().get(0)).pcc).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean gm(com.bytedance.adsdk.sf.gm.pcc.sf sfVar) {
        if (sfVar != null) {
            return sfVar.sf() && ((Float) ((com.bytedance.adsdk.sf.qf.pcc) sfVar.gm().get(0)).pcc).floatValue() == 0.0f;
        }
        return true;
    }
}
