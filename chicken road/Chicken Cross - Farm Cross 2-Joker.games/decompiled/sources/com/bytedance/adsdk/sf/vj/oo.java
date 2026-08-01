package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public class oo {
    public static com.bytedance.adsdk.sf.gm.pcc.sf pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        return pcc(jsonReader, qfVar, true);
    }

    public static com.bytedance.adsdk.sf.gm.pcc.sf pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, boolean z) throws IOException {
        return new com.bytedance.adsdk.sf.gm.pcc.sf(pcc(jsonReader, z ? com.bytedance.adsdk.sf.wh.wh.pcc() : 1.0f, qfVar, tmg.pcc));
    }

    static com.bytedance.adsdk.sf.gm.pcc.oo sf(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        return new com.bytedance.adsdk.sf.gm.pcc.oo(pcc(jsonReader, qfVar, lu.pcc));
    }

    static com.bytedance.adsdk.sf.gm.pcc.wh gm(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        return new com.bytedance.adsdk.sf.gm.pcc.wh(fum.pcc(jsonReader, qfVar, com.bytedance.adsdk.sf.wh.wh.pcc(), mk.pcc, true));
    }

    static com.bytedance.adsdk.sf.gm.pcc.qf oo(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        return new com.bytedance.adsdk.sf.gm.pcc.qf(pcc(jsonReader, qfVar, pq.pcc));
    }

    static com.bytedance.adsdk.sf.gm.pcc.kj vj(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        return new com.bytedance.adsdk.sf.gm.pcc.kj(pcc(jsonReader, com.bytedance.adsdk.sf.wh.wh.pcc(), qfVar, mu.pcc));
    }

    static com.bytedance.adsdk.sf.gm.pcc.ork wh(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        return new com.bytedance.adsdk.sf.gm.pcc.ork(pcc(jsonReader, com.bytedance.adsdk.sf.wh.wh.pcc(), qfVar, vy.pcc));
    }

    static com.bytedance.adsdk.sf.gm.pcc.pcc qf(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        return new com.bytedance.adsdk.sf.gm.pcc.pcc(pcc(jsonReader, qfVar, qf.pcc));
    }

    static com.bytedance.adsdk.sf.gm.pcc.gm pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, int i) throws IOException {
        return new com.bytedance.adsdk.sf.gm.pcc.gm(pcc(jsonReader, qfVar, new jr(i)));
    }

    private static <T> List<com.bytedance.adsdk.sf.qf.pcc<T>> pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, lrr<T> lrrVar) throws IOException {
        return fum.pcc(jsonReader, qfVar, 1.0f, lrrVar, false);
    }

    private static <T> List<com.bytedance.adsdk.sf.qf.pcc<T>> pcc(JsonReader jsonReader, float f, com.bytedance.adsdk.sf.qf qfVar, lrr<T> lrrVar) throws IOException {
        return fum.pcc(jsonReader, qfVar, f, lrrVar, false);
    }
}
