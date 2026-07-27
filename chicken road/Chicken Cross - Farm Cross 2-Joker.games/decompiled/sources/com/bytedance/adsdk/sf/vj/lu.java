package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes4.dex */
public class lu implements lrr<Integer> {
    public static final lu pcc = new lu();

    private lu() {
    }

    @Override // com.bytedance.adsdk.sf.vj.lrr
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public Integer sf(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(gpj.sf(jsonReader) * f));
    }
}
