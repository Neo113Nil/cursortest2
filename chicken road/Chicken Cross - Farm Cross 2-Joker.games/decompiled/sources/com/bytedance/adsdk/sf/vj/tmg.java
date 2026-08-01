package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
public class tmg implements lrr<Float> {
    public static final tmg pcc = new tmg();

    private tmg() {
    }

    @Override // com.bytedance.adsdk.sf.vj.lrr
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public Float sf(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(gpj.sf(jsonReader) * f);
    }
}
